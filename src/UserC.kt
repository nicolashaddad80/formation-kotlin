class UserC private constructor (val nickName : String
){

    companion object{
        fun newSubscribingUser(email: String) = UserC(email.substringBefore("@"))
        fun newFacebookUser(accountId: Int) = UserC("fb:$accountId")
    }
}