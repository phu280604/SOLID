package o_Open_ClosedPrinciple.details

class StandardGrading : IGradingStrategy {
    override fun getGrade(score: Double): String {
        if (score >= 85) return "A"
        else if (score >= 70) return "B"
        else if (score >= 50) return "C"
        else return "D"
    }
}