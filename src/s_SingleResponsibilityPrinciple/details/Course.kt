package s_SingleResponsibilityPrinciple.details

class Course(var courseId: Int, var name: String) {
    // region -- Methods --

    fun getCourseInfo(){
        println("ID: $courseId, Course: $name")
    }

    // endregion
}