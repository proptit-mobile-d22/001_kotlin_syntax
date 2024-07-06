package org.example

import kotlin.random.Random

const val max_element = 1000005;
fun solve(n : Int){
    val sum: Long = n.toLong() * (n.toLong() + 1) / 2
    if (sum % 2 == 1L) {
        println("NO");
    } else{
        println("YES");
    }
}

fun main() {
    val n = Random.nextInt(1, max_element)
    solve(n)
}