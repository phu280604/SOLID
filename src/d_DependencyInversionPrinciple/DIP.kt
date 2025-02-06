package d_DependencyInversionPrinciple

import d_DependencyInversionPrinciple.details.Course
import d_DependencyInversionPrinciple.details.EmailNotifier
import d_DependencyInversionPrinciple.details.Enrollment
import d_DependencyInversionPrinciple.details.Student

fun main() {
    val s1 = Student("John", mutableListOf())
    val course = listOf(
        Course("Math"),
        Course("English"),
        Course("Physics"),
        Course("Chemical")
    )

    val enrolledCourse = Enrollment(EmailNotifier())

    enrolledCourse.enrollCourse(s1, course[0])
    enrolledCourse.enrollCourse(s1, course[2])
    enrolledCourse.enrollCourse(s1, course[0])
    enrolledCourse.enrollCourse(s1, course[1])

    println()
    s1.showInfo()
}