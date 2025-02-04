package s_SingleResponsibilityPrinciple.complyWithRule

class EnrollInput(var enrollment: MutableMap<Student, MutableList<Course>>) {
    // region -- Methods --

    fun enrollCourse(student: Student, course: Course) {
        enrollment.computeIfAbsent(student) { mutableListOf() }.add(course)
    }

    // endregion
}

class EnrollOutput(private val enrollmentInput: EnrollInput) {
    fun showEnrollments() {
        enrollmentInput.enrollment.forEach { (student, courses) ->
            student.getStudentInfo()
            println("")
            courses.forEach { it.getCourseInfo() }
        }
    }
}