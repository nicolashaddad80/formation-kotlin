interface Information {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}

data class UserD(
    val id:Int ,
    override val email: String
):Information
fun main(){
    val user = UserD(42, "jerome@kotlin.com")
    println("$user::nickname ${user.nickname}")
}