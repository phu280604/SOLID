package s_SingleResponsibilityPrinciple.details

import o_Open_ClosedPrinciple.details.IGradingStrategy

/*
    Tách lớp Student và Course thành hai lớp riêng,
*/
class Student {

    // region -- Constructor --
    constructor(studentId: Int, name: String, age: Int){
        this._studentId = studentId
        this._studentName = name
        this._age = age
    }
    constructor(name: String, score: Double, gradingStrategy: IGradingStrategy){
        this._studentName = name
        this._score = score
        if (_gradingStrategy == null)
            _gradingStrategy = gradingStrategy
    }
    // endregion

    // region -- Methods --

    fun getStudentInfo(){
        println("ID: $_studentId, Name: $_studentName, Age: $_age")
    }

    fun GetGrade(): String {
        return _gradingStrategy?.getGrade(_score) ?: "0.0"
    }

    // endregion

    // region -- Fields --

    private var _gradingStrategy: IGradingStrategy? = null

    private var _studentId: Int = 0
    private var _studentName: String = ""
    private var _age: Int = 0
    private var _score: Double = 0.0

    // endregion
}