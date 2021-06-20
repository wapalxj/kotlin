package xx.rw

import xx.SleepTools
import java.util.concurrent.locks.ReadWriteLock
import java.util.concurrent.locks.ReentrantReadWriteLock

class UseRwLock(val goodsInfo: GoodsInfo) : GoodsService {
    val lock: ReadWriteLock = ReentrantReadWriteLock()
    val readLock = lock.readLock()
    val writeLock = lock.writeLock()

    override fun getNum(): GoodsInfo {
        readLock.lock()
        try {
            SleepTools.ms(5)
            return goodsInfo
        } finally {
            readLock.unlock()
        }
    }
    override fun setNum(number: Int) {
        writeLock.lock()
        try {
            SleepTools.ms(5)
            return goodsInfo.changeNumber(number)
        } finally {
            writeLock.unlock()
        }
    }
}