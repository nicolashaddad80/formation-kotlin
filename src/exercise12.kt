interface Network {
    fun connect(success: (message: String) -> Unit, fail: (errorMessage: String) -> Unit)
    fun disconnect(done : () -> Unit)
    fun sendHello(success: (message: String, code: Int) -> Unit, fail: (errorMessage: String, code :Int) ->
    Unit)
}

object ApiManager:Network {

    var baseUrl: String? = null
    set(value) {
        println("Disconnecting")
        disconnect {}
        field = value
    }
    private var isConnected: Boolean = false

    override fun connect(success: (message: String) -> Unit, fail: (errorMessage: String) -> Unit) {
        if (baseUrl != null){
            isConnected = true
            println("Connecting")
            success("Success")
        } else {
            fail("Not found")
        }

    }

    override fun disconnect(done: () -> Unit) {
        isConnected = false
        done()
    }

    override fun sendHello( success: (message: String, code: Int) -> Unit, fail: (errorMessage: String, code: Int) -> Unit) {
        if(isConnected) success("Success", 200) else fail("Not found", 404)
    }
}

fun main() {
    ApiManager.run{
        sendHello({message:String, code: Int -> println("$message:$code")}, {message:String, code: Int -> println("$message:$code")})
        baseUrl = "www.google.fr"
        sendHello({message:String, code: Int -> println("Sending1$message:$code")}, {message:String, code: Int -> println("$message:$code")})
        baseUrl = "www.google.com"
        connect({message:String-> println("Connection: $message")}, {message:String -> println("Connection: $message")})
        sendHello({message:String, code: Int -> println("Sending2:$message:$code")}, {message:String, code: Int -> println("$message:$code")})
        baseUrl = "www.google.ca"
        sendHello({message:String, code: Int -> println("Sending3:$message:$code")}, {message:String, code: Int -> println("$message:$code")})
        baseUrl = null
        sendHello({message:String, code: Int -> println("Sending4:$message:$code")}, {message:String, code: Int -> println("$message:$code")})
    }

}