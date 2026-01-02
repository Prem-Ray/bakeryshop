package org.bakeryshop.bakeryshop

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty

@Component
@ConditionalOnProperty(name = ["cake.syrup"],havingValue = "chocolate")
class ChocolateSyrup: Syrup  {
    override fun getSyrupType(): String {
         return "Chocolate Syrup"
    }
}