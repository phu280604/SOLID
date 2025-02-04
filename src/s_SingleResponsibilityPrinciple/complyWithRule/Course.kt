package s_SingleResponsibilityPrinciple.complyWithRule

class Course(var courseId: Int, var name: String) {
    // region -- Methods --

    fun getCourseInfo(){
        println("ID: $courseId, Course: $name")
    }

    // endregion
}