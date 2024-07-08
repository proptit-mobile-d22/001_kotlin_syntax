import kotlin.random.Random

const val max_element = 1000005;
fun solve(n : Int){
    val sum = n * (n + 1) / 2 * 1L
    if(sum % 2 == 1L) {
        println("NO")
        return
    }
    var sumEach = sum / 2
    println("YES")
    val check: MutableMap<Int, Boolean> = mutableMapOf()
    for(i in n downTo 1){
        if(sumEach >= i){
            sumEach -= i
            check[i] = true
        }
        else check[i] = false
    }
    if(sumEach > 0){
        check[sumEach.toInt()] = true
    }
    for (i in 1..n){
        if(check[i] == false) print("$i ")
    }
    println()
    for (i in 1..n){
        if(check[i] == true) print("$i ")
    }
}

fun main() {
    val n = Random.nextInt(1, max_element)
    solve(n)
}