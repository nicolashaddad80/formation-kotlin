data class UserB (val name: String
){
    var address: String =""
    set(value){
        println("Address was changed for $name: $address -> $value")
        field = value
    }
}