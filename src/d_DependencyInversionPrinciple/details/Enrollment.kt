package d_DependencyInversionPrinciple.details

class Enrollment(var notifier: INotifier) {

    fun enrollCourse(student: Student, course: Course) {
        if (student.courseList.contains(course)) {
            notifier.notify("This course has already enrolled")
            return
        }

        notifier.notify("Successful enrollment")
        student.courseList.add(course)
    }
}