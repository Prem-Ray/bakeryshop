package org.bakeryshop.bakeryshop

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class BakeryShopApplication(private val cakeBaker: CakeBaker ): CommandLineRunner {
   override fun run(vararg args: String) {
        cakeBaker.bakeCake() ;
    }
}

fun main(args: Array<String>) {
    runApplication<BakeryShopApplication>(*args)
}
