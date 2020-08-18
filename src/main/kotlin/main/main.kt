package main

import kotlinx.html.div
import kotlinx.html.stream.createHTML

fun main() {
    println(createHTML().div { +"foobar" })
}










