package s_SingleResponsibilityPrinciple

import s_SingleResponsibilityPrinciple.details.Course
import s_SingleResponsibilityPrinciple.details.EnrollInput
import s_SingleResponsibilityPrinciple.details.EnrollOutput
import s_SingleResponsibilityPrinciple.details.Student

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