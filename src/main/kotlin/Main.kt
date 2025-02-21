package main

import main.PalindromeService

fun main() {
    val solver = PalindromeService()
    val testInputs = listOf("abac", "tacag", "wegeeksskeegyuwe")
    testInputs.forEach { input ->
        println("Input: \"$input\" -> Output: \"${solver.findLongestPalindrome(input)}\"")
    }
}
