package org.example

import kotlin.random.Random

const val max_element = 1000005;
fun solve(n : Int){
    val sum: Long = n.toLong() * (n.toLong() + 1) / 2
    if (sum % 2 == 1L) {
        println("NO");
    } else{
        println("YES");
        show(n);
    }
}
fun show(n: Int){
    for (i in 1..n step 2){
        print("$i ");
    }
    println();
    for (i in 2..n step 2){
        print("$i ");
    }
}

fun main() {
    val n = Random.nextInt(1, max_element)
    solve(n)
}