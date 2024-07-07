import kotlin.random.Random

const val max_element = 1000005;
fun solve(n : Int){
    val totalSum = n.toLong() * (n.toLong() + 1)/2

    if(totalSum % 2 != 0L){
        println("NO")
        return
    }else{
        println("YES")
    }

    val halfSum = totalSum / 2;
    val arr1 = mutableListOf<Int>()
    val arr2 = mutableListOf<Int>()
    var tmpSum = 0L

    for(i in n downTo 1){
        if(tmpSum + i.toLong() <= halfSum){
            arr1.add(i)
            tmpSum += i.toLong()
        }
        else{
            arr2.add(i)
        }
    }
    println(arr1)
    println(arr2)
}

fun main() {
    val n = Random.nextInt(1, max_element)
    solve(n)
}