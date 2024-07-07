import kotlin.random.Random

const val max_element = 1000005;
fun solve(n : Int){
    if(n == 2 || n == 3){
        println("No solution")
        return
    }
    val list = mutableListOf<Int>()
    for(i in 1..n step 2){
        list.add(i)
    }
    for(i in 2..n step 2){
        list.add(i)
    }
    println(list)
}

fun main() {
    val n = Random.nextInt(1, max_element)
    solve(n)
}