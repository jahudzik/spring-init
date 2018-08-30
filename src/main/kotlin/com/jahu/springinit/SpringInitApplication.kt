package com.jahu.springinit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringInitApplication

fun main(args: Array<String>) {
    runApplication<SpringInitApplication>(*args)
}
