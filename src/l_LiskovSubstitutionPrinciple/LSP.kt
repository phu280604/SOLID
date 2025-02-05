package l_LiskovSubstitutionPrinciple

import l_LiskovSubstitutionPrinciple.details.*

fun main(){
    val s1 = Rectangle()
    s1.setWidth(5.0)
    s1.setHeight(10.0)

    val s2 = Square()
    s2.setSize(5.0)

    val result = CalculateShape()

    println("Rectangle area: ${result.CalArea(s1)}")
    println("Square area: ${result.CalArea(s2)}")
}