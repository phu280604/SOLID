package i_InterfaceSegregationPrinciple.details.Data

import i_InterfaceSegregationPrinciple.details.DataBase.ProductDB

class Product() : ProductD() {
    // region -- Constructor --

    constructor(productId: Int, productName: String, quantity: Int): this(){
        this._productId = productId
        this._productName = productName
        this._quantity = quantity
    }

    // endregion

    // region -- Methods --

    fun getDataFromDB(): MutableList<Product> {
        return ProductDB.productDB.filterIsInstance<Product>().toMutableList()
    }

    // endregion

    // region -- Properties --

    var productId: Int
        get() = _productId // Getter mặc định
        set(value) {
            if (value > 0) _productId = value
            else println("Invalid Product ID")
        }

    var productName: String
        get() = _productName
        set(value) {
            if (value.isNotBlank()) _productName = value
            else println("The product name is not left empty")
        }

    var quantity: Int
        get() = _quantity
        set(value) {
            if (value >= 0) _quantity = value
            else println("the quantity can not negative")
        }

    // endregion
}