class UserC private constructor (
    val nickName : String
){

    companion object{
        fun newSubscribingUser(email: String) = UserC(email.substringBefore("@"))
        fun newFacebookUser(accountId: Int) = UserC("fb:$accountId")
    }
}

fun main(){
    val subscribingUser = UserC.newSubscribingUser("bob@gmail.com")
    val facebookUser = UserC.newFacebookUser(4)
    println(subscribingUser.nickName)
    println(facebookUser.nickName)
}