package s_SingleResponsibilityPrinciple.violateTheRule

import s_SingleResponsibilityPrinciple.complyWithRule.Course

/*
    Lớp sau vi phạm nguyên tắc S - Single Responsibility Principle.
    Vì lớp student vừa phải xử lý thông tin học sinh vừa phải xử lý đăng ký môn học.
*/

class Student(var studentId: Int, var name: String, var age: Int, var courseList: List<Course>) {
    // region -- Methods --

    fun getStudentInfo(){
        println("ID: $studentId, Name: $name, Age: $age")
    }

    fun enrollCourse(course: String){
        courseList.plus(course)
    }

    // endregion
}