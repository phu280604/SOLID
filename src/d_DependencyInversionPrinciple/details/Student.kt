package d_DependencyInversionPrinciple.details

class Student(var studentName: String, var courseList: MutableList<Course>) {
    fun showInfo() {
        println("Student: $studentName")
        courseList.forEach {
            println("Course: ${it.courseName}")
        }
    }
}