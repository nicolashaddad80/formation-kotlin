interface Expr
class Num(val value: Int) :Expr
class Sum(val left: Expr, val right: Expr) : Expr


fun eval(expr: Expr): Int =
    when(expr){
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw (IllegalArgumentException())
    }

fun main() {
    val a = Num(10)
    val b = Num(5)
    val c = Sum(a,Num(6))
    val result = eval(Sum(c,b))
    println(result)
}