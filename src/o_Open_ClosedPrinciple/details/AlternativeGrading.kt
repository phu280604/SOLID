package o_Open_ClosedPrinciple.details

class AlternativeGrading: IGradingStrategy {
    override fun getGrade(score: Double) : String {
        if (score >= 90) return "Excellent"
        else if (score >= 75) return "Good"
        else return "Needs Improvement"
    }
}