package org.bakeryshop.bakeryshop
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Component

@Component
@ConditionalOnProperty(name = ["cake.syrup"],havingValue = "strawberry")
class StrawberrySyrup: Syrup  {
    override fun getSyrupType(): String {
        return "Strawberry Syrup"
    }
}