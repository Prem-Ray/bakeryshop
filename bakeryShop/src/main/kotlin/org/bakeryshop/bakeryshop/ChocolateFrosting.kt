package org.bakeryshop.bakeryshop
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Component

@Component
@ConditionalOnProperty(name = ["cake.frosting"],havingValue = "chocolate")
class ChocolateFrosting : Frosting  {
    override fun getFrostType(): String {
        return "Chocolate frosting"
    }
}