package l_LiskovSubstitutionPrinciple.details

class Square : IShape {
    // region -- Override --

    override fun area(): Double {
        return _size * _size
    }

    // endregion

    // region -- Methods --

    fun setSize(s: Double) {
        _size = s
    }

    // endregion

    // region -- Fields --

    private var _size: Double = 0.0

    // endregion
}