import kotlin.random.Random

const val max_element = 1000005;
fun solve(n : Int){
    var sum : Long = n.toLong() * (n.toLong() + 1) / 2
    if(sum % 2 == 1L){
        println("NO")
    }
    else{
        println("YES")
        ouput(n, sum)
    }
}

fun ouput(n : Int, sum : Long){
    var result1 = mutableListOf<Int>()
    var result2 = mutableListOf<Int>()
    var tmp : Long = sum / 2
    var current : Long = 0
    for(i in n downTo 1){
        if(current + i.toLong() <= tmp){
            result1.add(i)
            current += i.toLong()
        }
        else result2.add(i)
    }

    println(result1)
    println(result2)
}
fun main() {
    val n = Random.nextInt(1, max_element)
    solve(n)
}