package l_LiskovSubstitutionPrinciple.details

class CalculateShape {
    // region -- Methods --

    fun CalArea(shape: IShape): Double {
        return shape.area()
    }

    // endregion
}