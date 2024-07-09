import kotlin.random.Random

const val max_element = 1000005;
fun solve1(n : Int){
    println(n)
    if(n==1){
        println("1")
    }
    else if (n==2 || n==3){
        println("No Solution")
        return
    }
    show(n)
}
fun show (n : Int){
    val arr = mutableListOf<Int>()
    for(i in 2 .. n step 2){
        arr.add(i)
    }
    for(i in 1 .. n step 2){
        arr.add(i)
    }
    println(arr)
}

fun main() {
    val n = Random.nextInt(1, max_element)
    solve1(n)
}