package l_LiskovSubstitutionPrinciple.details

class Rectangle : IShape {
    // region -- Override --

    override fun area(): Double {
        return _width * _height
    }

    // endregion

    // region -- Methods --

    fun setWidth(width: Double) {
        _width = width
    }

    fun setHeight(height: Double) {
        _height = height
    }

    // endregion

    // region -- Fields --

    private var _width: Double = 0.0
    private var _height: Double = 0.0

    // endregion
}