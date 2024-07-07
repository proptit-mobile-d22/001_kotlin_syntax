import kotlin.random.Random

const val max_element = 1000005;
fun solve(n : Int) {
    println(n)
    val sum = n.toLong() * (n.toLong() + 1) / 2
    if (sum % 2 == 1L) {
        println("NO")
        return
    } else {
        println("YES")
        output(n, sum)
    }
}
fun output(n : Int, sum : Long){
    val halfSum = sum / 2;
    val arr1 = mutableListOf<Int>()
    val arr2 = mutableListOf<Int>()
    var remaining = halfSum

    for (i in n downTo 1){
        if (remaining >= i){
            arr1.add(i)
            remaining -= i
        }
        else{
            arr2.add(i)
        }
    }
    arr1.reverse()
    arr2.reverse()
    println(arr1)
    println(arr2)
}

fun main() {
    val n = Random.nextInt(1, max_element)
    solve(n)
}