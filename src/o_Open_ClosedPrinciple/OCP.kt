package o_Open_ClosedPrinciple

import o_Open_ClosedPrinciple.details.AlternativeGrading
import o_Open_ClosedPrinciple.details.IGradingStrategy
import o_Open_ClosedPrinciple.details.StandardGrading
import s_SingleResponsibilityPrinciple.details.Student

fun main(){
    var st1 = Student(
        name = "John",
        score = 65.0,
        gradingStrategy = AlternativeGrading()
    )

    var st2 = Student(
        name = "John",
        score = 82.5,
        gradingStrategy = StandardGrading()
    )

    println(st1.GetGrade())
    println(st2.GetGrade())
}