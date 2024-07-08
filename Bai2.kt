import kotlin.random.Random

const val max_element = 1000005;
fun solve(n : Int){
    if(n==1)
    {
        println(1)
        return
    }
    if(n in 2..3)
    {
        println("No Solution")
        return
    }
    val list= mutableListOf<Int>()
    for(i in 2..n step 2)
        list.add(i)
    for(i in 1.. n-1 step 2)
        list.add(i)
    println(list)
}

fun main() {
    val n = Random.nextInt(1, max_element)
    solve(n)
}