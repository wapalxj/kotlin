import dayjs from 'dayjs';

import isLeapYear from 'dayjs/plugin/isLeapYear';
import dayOfYear from 'dayjs/plugin/dayOfYear';
import utc from 'dayjs/plugin/utc';

import {
    TimeEnum,
    DuringTime
} from 'lib-broker-crm/src/types/time-select-options';

dayjs.extend(isLeapYear);
dayjs.extend(dayOfYear);
dayjs.extend(utc);

const FORMAT_STR = 'YYYY-MM-DD';

export const TIMEZONE = -new Date().getTimezoneOffset() / 60;

/**
 * 获取 指定间期类型的 起止时间戳 (均为自然周，周一为一周开始)
 * @params duringType
 * @params timeZone 传入交易时区 默认交易时区为+8
 */
export const getDuringTime = (
    duringType: TimeEnum,
    timeZone = TIMEZONE
): DuringTime => {
    switch (duringType) {
        case TimeEnum.All:
            return getAllTime(timeZone);
        case TimeEnum.Today:
            return getTargetLateDaysTime(1, timeZone);
        // case TimeEnum.Week:
        case TimeEnum.Last7days:
            return getTargetLateDaysTime(7, timeZone);
        // case TimeEnum.Month:
        case TimeEnum.Last30days:
            return getTargetLateDaysTime(30, timeZone);
        case TimeEnum.Yesterday:
            return getYesterdayTime(timeZone);
        case TimeEnum.ThisWeek:
            return getTargetLateWeekTime(0, timeZone);
        case TimeEnum.LastWeek:
            return getTargetLateWeekTime(1, timeZone);
        case TimeEnum.ThisMonth:
            return getTargetLateMonthTime(1, timeZone);
        case TimeEnum.LastMonth:
            return getLastMonthTime(timeZone);
        case TimeEnum.Last3Months:
            return getTargetLateMonthTime(3, timeZone);
        case TimeEnum.ThisYear:
            return getTargetLateYearTime(1, timeZone);
        default:
            throw new Error(
                `lib-broker-crm/src/types/time-select-options，TimeEnum未定义枚举类型: ${duringType}.`
            );
    }
};

/**
 * 反向求值
 * 根据 时间区间 获取 时间枚举值
 */
export const getTimeEnumByDuring = (
    beginTime: number,
    endTime: number,
    timeZone = TIMEZONE
): TimeEnum => {
    const conbinaFlag = '_';
    const objMap: { [key: string]: TimeEnum } = {};
    Object.keys(TimeEnum).forEach((type) => {
        const during = getDuringTime(TimeEnum[type], timeZone);
        const conbinaKey = during.BeginTime + conbinaFlag + during.EndTime;
        objMap[conbinaKey] = TimeEnum[type];
    });
    const targetKey = beginTime + conbinaFlag + endTime;
    if (objMap[targetKey]) {
        return objMap[targetKey];
    }
    return TimeEnum.All;
};

/* ******************************************************************************* */
/* ************************* Time Calculation  *********************************** */

/**
 * 通过 操作天数 获取当前 UTC 秒数
 * day： 默认返回 下一天 的 0点0分
 */
const getNextUTCSeconds = (day = 1, timeZone = TIMEZONE): number => {
    // const zone = new Date().getTimezoneOffset() / 60 + timeZone;
    // const timeOffset = getTimezoneOffsetSeconds(timeZone);
    // const localTime = dayjs()
    //     .format(FORMAT_STR)
    //     .valueOf();

    // let d = day;

    // if (dayjs().diff(dayjs(localTime), 'hours') < -zone) {
    //     d -= 1;
    // }

    // const dateStr = dayjs()
    //     .add(d, 'day')
    //     .format(FORMAT_STR);

    // const s = dayjs(dateStr).unix() + timeOffset;
    // return s;

    const severTimeZoneDate = dayjs()
        .add(day, 'day')
        .add(timeZone, 'hour')
        .utc()
        .format(FORMAT_STR);

    const localTimeZone = new Date().getTimezoneOffset() / 60;
    // console.log('localTimeZone', localTimeZone);

    const localDate = dayjs(severTimeZoneDate)
        .add(-localTimeZone - timeZone, 'hour')
        .unix();

    return localDate;
};

/**
 * 依据时区，获取偏移时间(秒)
 */
const getTimezoneOffsetSeconds = (timeZone = TIMEZONE): number => {
    return -(new Date().getTimezoneOffset() * 60 + timeZone * 60 * 60);
};

/**
 * 构造目标数据结构 DuringTime
 *
 * @param begin 开始时间
 * @param end 结束时间
 * @param offset 偏移时间
 * @returns DuringTime
 */
const duringResultBuilder = (
    begin: number,
    end: number,
    offset: number
): DuringTime => {
    return {
        BeginTime: begin,
        EndTime: end,
        TimezoneOffset: offset
    };
};

/**
 * All
 */
const getAllTime = (timeZone = TIMEZONE): DuringTime => {
    return duringResultBuilder(0, 0, getTimezoneOffsetSeconds(timeZone));
};

/**
 * Today === last 1 day
 */
// const getTodayTime = (timeZone = TIMEZONE): DuringTime => {
//     return duringResultBuilder(
//         getNextUTCSeconds(0, timeZone),
//         getNextUTCSeconds(1, timeZone),
//         getTimezoneOffsetSeconds(timeZone)
//     );
// };

/**
 * Yesterday
 */
const getYesterdayTime = (timeZone = TIMEZONE): DuringTime => {
    return duringResultBuilder(
        getNextUTCSeconds(-1, timeZone),
        getNextUTCSeconds(0, timeZone),
        getTimezoneOffsetSeconds(timeZone)
    );
};

/**
 * CurrentWeek === Last 0 Week
 *
 *  weekDay: 获取 UTC 周中的一天 ( 0 ~ 6 )
 */
// const getCurrentWeekTime = (timeZone = TIMEZONE): DuringTime => {
//     const weekDay = new Date().getUTCDay();

//     const week = 7;
//     let beginDay = 1;
//     let endDay = 0;

//     switch (weekDay) {
//         case 0:
//             beginDay = -week - weekDay + 1;
//             endDay = -weekDay + 1;
//             break;
//         default:
//             beginDay = -weekDay + 1;
//             endDay = week - weekDay + 1;
//     }

//     return duringResultBuilder(
//         getNextUTCSeconds(beginDay, timeZone),
//         getNextUTCSeconds(endDay, timeZone),
//         getTimezoneOffsetSeconds(timeZone)
//     );
// };

/**
 * 前 n 周
 *
 * eg:
 *      date: 2021-09-27
 *      input: 2
 *      output: 2021-09-13 ~ 2021-09-20
 */
const getTargetLateWeekTime = (
    beforeWeek = 1,
    timeZone = TIMEZONE
): DuringTime => {
    const weekDay = new Date().getUTCDay();

    const week = 7;
    let beginDay = 1;
    let endDay = 0;

    switch (weekDay) {
        case 0:
            beginDay = -(beforeWeek + 1) * week - weekDay + 1;
            endDay = -beforeWeek * week - weekDay + 1;
            break;
        default:
            beginDay = -beforeWeek * week - weekDay + 1;
            endDay = -(beforeWeek - 1) * week - weekDay + 1;
    }

    return duringResultBuilder(
        getNextUTCSeconds(beginDay, timeZone),
        getNextUTCSeconds(endDay, timeZone),
        getTimezoneOffsetSeconds(timeZone)
    );
};

/**
 * LastMonth
 *
 * eg:
 *      date: 2021-09-27
 *      output: [2021-08-01, 2021-09-01)
 */
const getLastMonthTime = (timeZone = TIMEZONE): DuringTime => {
    const todayOfMonth = dayjs().get('date');

    const daysOfLastMonth = dayjs()
        .subtract(1, 'month')
        .daysInMonth();

    return duringResultBuilder(
        getNextUTCSeconds(-daysOfLastMonth - todayOfMonth + 1, timeZone),
        getNextUTCSeconds(-todayOfMonth + 1, timeZone),
        getTimezoneOffsetSeconds(timeZone)
    );
};

/**
 * 最近 n 天
 *
 * eg:
 *      date: 2021-09-27
 *      input: 7
 *      output: [2021-09-21, 2021-09-28)
 */
const getTargetLateDaysTime = (beforeDays = 1, timeZone = TIMEZONE) => {
    if (beforeDays < 1) {
        throw new Error(`beforeDays must be lgt 1`);
    }

    return duringResultBuilder(
        getNextUTCSeconds(-beforeDays + 1, timeZone),
        getNextUTCSeconds(1, timeZone),
        getTimezoneOffsetSeconds(timeZone)
    );
};

/**
 * 最近 n 月
 *
 * eg:
 *      date: 2021-09-27
 *      input: 3
 *      output: [2021-07-01, 2021-10-01)
 */
const getTargetLateMonthTime = (beforeMonth = 1, timeZone = TIMEZONE) => {
    if (beforeMonth < 1) {
        throw new Error(`beforeMonth must be lgt 1`);
    }

    let beforeMonthDays = 0;

    for (let i = 1; i < beforeMonth; i++) {
        const days = dayjs()
            .subtract(i, 'month')
            .daysInMonth();

        beforeMonthDays += days;
    }

    const todayOfMonth = dayjs().get('date');

    const currentMonthDays = dayjs().daysInMonth();

    return duringResultBuilder(
        getNextUTCSeconds(-beforeMonthDays - todayOfMonth + 1, timeZone),
        getNextUTCSeconds(currentMonthDays - todayOfMonth + 1, timeZone),
        getTimezoneOffsetSeconds(timeZone)
    );
};

/**
 * 最近 n 年
 *
 * eg:
 *      date: 2021-09-27
 *      input: 1
 *      output: [2021-01-01, 2022-01-01)
 */
const getTargetLateYearTime = (beforeYears = 1, timeZone = TIMEZONE) => {
    if (beforeYears < 1) {
        throw new Error(`beforeYears must be lgt 1`);
    }

    let beforeYearsDays = 0;

    for (let i = 1; i < beforeYears; i++) {
        const isLeapYear = dayjs()
            .subtract(i, 'year')
            .isLeapYear();
        if (isLeapYear) {
            beforeYearsDays += 366;
        } else {
            beforeYearsDays += 365;
        }
    }

    const todayOfYear = dayjs().dayOfYear();

    const currentYearDays = dayjs().isLeapYear() ? 366 : 365;

    return duringResultBuilder(
        getNextUTCSeconds(-beforeYearsDays - todayOfYear + 1, timeZone),
        getNextUTCSeconds(currentYearDays - todayOfYear + 1, timeZone),
        getTimezoneOffsetSeconds(timeZone)
    );
};

/* *************************************************************************** */
/* ******************** Others *********************************************** */

/**
 * 格式化日期
 * @param date
 * @param format
 *
 * formatDate('2020/05/18') // 18 May 2020
 */
export function formatDate(
    date: dayjs.ConfigType,
    format = 'DD MMM YYYY'
): string {
    return dayjs(date).format(format);
}

/**
 * 依据时间戳 获取 时间字符串
 * @param value 时间戳，秒数
 * @param formatStr 格式化模板, 默认 DD MMM YYYY,HH:mm:ss
 */
export const getFormatDateStr = (
    value: number,
    formatStr = 'DD MMM YYYY,HH:mm:ss'
): string => {
    if (!value) {
        return '--';
    }
    const milliseconds = value * 1000;
    const dateStr =
        dayjs(milliseconds).format(formatStr) || dayjs().format(formatStr);
    return dateStr;
};
