package org.bakeryshop.bakeryshop
import org.springframework.stereotype.Component

@Component
class CakeBaker(private val frosting: Frosting , private val syrup: Syrup) {
    fun bakeCake(){
        println("cake bake with ${frosting.getFrostType()} and ${syrup.getSyrupType()}")
    }
}