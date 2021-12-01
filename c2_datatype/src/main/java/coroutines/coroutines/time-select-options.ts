/**
 * 时间 间期 返回类型
 * @BeginTime 开始时间(秒)，闭区间
 * @EndTime 结束时间(秒)，开区间
 * @TimezoneOffset 相对于 UTC 的偏移时间(秒)
 */
export interface DuringTime {
    BeginTime: number;
    EndTime: number;
    TimezoneOffset?: number;
}

/**
 * 所有时间选择控件枚举值
 *
 * eg: 今天日期为 2021 09-27（周一）
 *
 *  All:        0
 *  Today:      09-27
 *  Yesterdat:  09-26
 *
 *  ThisWeek:   09-27 ~ 10-03
 *  LastWeek:   09-20 ~ 09-26
 *
 *  Last7days:  09-21 ~ 09-27
 *  ThisMonth:  09-01 ~ 10-01
 *
 *  LastMonth:  08-01 ~ 09-01
 *  Last30days: 08-29 ~ 09-27
 *
 *  Last3Month: 07-01 ~ 10-01
 *  ThisYear:   2021 01-01 ~ 2022 01-01
 */
export enum TimeEnum {
    All = 'All', // 全部
    Today = 'Today', // 今天
    // Week = 'Week', // 最近7天
    // Month = 'Month', // 最近30天
    //
    Yesterday = 'Yesterday', // 昨天
    ThisWeek = 'ThisWeek', // 本周（自然周）
    LastWeek = 'LastWeek', // 上一周 （自然周）
    Last7days = 'Last7days', // 最近7天
    //
    ThisMonth = 'ThisMonth', // 本月
    LastMonth = 'LastMonth', // 上月
    Last30days = 'Last3days', // 最近30天
    Last3Months = 'Last3Months', // 近三月
    ThisYear = 'ThisYear' // 本年
}
