package s_SingleResponsibilityPrinciple.complyWithRule

/*
    Tách lớp Student và Course thành hai lớp riêng,
*/
class Student(var studentId: Int, var name: String, var age: Int) {
    // region -- Methods --

    fun getStudentInfo(){
        println("ID: $studentId, Name: $name, Age: $age")
    }

    // endregion
}