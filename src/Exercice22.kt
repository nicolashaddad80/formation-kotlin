import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
     launch {
        delay(6000)
        println("Tasks from some blockingMethod")
    }
    GlobalScope.launch {
        launch {
            delay(2000)
            println("Task from nested launch")
        }
        delay(1000)
        println("Task from coroutine scope")
    }
    println("Coroutine Scope is Over")

}