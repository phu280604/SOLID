package s_SingleResponsibilityPrinciple

import s_SingleResponsibilityPrinciple.complyWithRule.Course
import s_SingleResponsibilityPrinciple.complyWithRule.EnrollInput
import s_SingleResponsibilityPrinciple.complyWithRule.EnrollOutput
import s_SingleResponsibilityPrinciple.complyWithRule.Student

fun main() {
    var student = Student(1, "John", 22)
    var course = listOf(
        Course(1, "Math"),
        Course(2, "English"),
        Course(3, "Physics")
    )


    var enrolment = EnrollInput(mutableMapOf())
    enrolment.enrollCourse(student, course[0])
    enrolment.enrollCourse(student, course[1])

    var showEnrollment = EnrollOutput(enrolment)
    showEnrollment.showEnrollments()
}