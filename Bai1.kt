import kotlin.random.Random

const val max_element = 1000005

fun solve(n: Int) {
    val sum = n * (n + 1) / 2
    if (sum % 2 != 0) {
        println("NO")
        return
    }
    val list1= mutableListOf<Int>()
    val list2= mutableListOf<Int>()
    var reset=sum/2;
    for(i in 1.. n)
    {
        if(i<reset)
        {
            list1.add(i);
            reset-=i
        }
        else
            list2.add(i);
    }
    println("YES")
    println(list1.joinToString(" "))
    println(list2.joinToString(" "))
}

fun main() {
    val n = Random.nextInt(1, max_element)
    solve(n)
}
