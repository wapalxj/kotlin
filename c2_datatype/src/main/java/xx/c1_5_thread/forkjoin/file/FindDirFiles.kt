package xx.c1_5_thread.forkjoin.file

import java.io.File
import java.lang.Exception
import java.util.concurrent.ForkJoinPool
import java.util.concurrent.ForkJoinTask
import java.util.concurrent.RecursiveAction


/**
 * 遍历文件目录
 */


fun main() {
    try {
        val pool = ForkJoinPool()
        val task = FindDirFiles(File("F:/"))

        //异步提交：无返回结果
        pool.execute(task)

        //异步提交：有返回结果,返回的即是参数的task
//       val res= pool.submit(task)

//        println("Task is running......${task}  ${res}")

        //这里是主线程自己的工作
        Thread.sleep(1)
        var otherWork = 0;
        for (i in 0 until 100) {
            otherWork = otherWork + i
        }
        println("Main Thread done sth......otherWork=$otherWork")
        //阻塞方法
        task.join()
//        res.join()
//        Thread.sleep(30)
        println("Task end")
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

class FindDirFiles(val path: File) : RecursiveAction() {
    override fun compute() {
        val subTasks = arrayListOf<FindDirFiles>()
        val files = path.listFiles()
//            println("文件root:${files.size}")
        files?.forEach {
            if (it.isDirectory) {
                //对每个子目录都新建一个子任务
                subTasks.add(FindDirFiles(it))
            } else {
                //遇到文件，检查
                if (it.absolutePath.endsWith("mp4")) {
                    println("文件:${it.absolutePath}")
                }
            }
        }
        if (subTasks.isNotEmpty()) {
            for (subTask in invokeAll(subTasks)) {
                subTask.join()
            }
        }
    }
}