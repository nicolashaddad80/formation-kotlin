import kotlinx.coroutines.*

suspend fun downlaodTask1():String {
    delay(1000)
    return "Task1"

}

suspend fun downlaodTask2():String {
    delay(2000)
    return "Task2"

}

suspend fun downlaodTask3():String {
    delay(3000)
    return "Task3"

}

fun main() = runBlocking{
    println("Launch")
    val launch1 = launch{
        downlaodTask1()
    }
    val launch2 = launch{
        downlaodTask2()
    }
    val launch3 = launch{
        downlaodTask3()
    }

    val async1 = async(Dispatchers.IO){
        downlaodTask1()
    }
    val async2 = async(Dispatchers.IO){
        downlaodTask2()
    }
    val async3 = async(Dispatchers.IO){
        downlaodTask3()
    }



    println(launch1.join())
    println(launch2.join())
    println(launch3.join())

    println(async1.await())
    println(async2.await())
    println(async3.await())

    println("finish")

}