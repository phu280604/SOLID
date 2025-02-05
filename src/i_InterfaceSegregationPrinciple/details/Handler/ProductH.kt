package i_InterfaceSegregationPrinciple.details.Handler

import i_InterfaceSegregationPrinciple.details.Data.Product
import i_InterfaceSegregationPrinciple.details.DataBase.ProductDB
import i_InterfaceSegregationPrinciple.details.Interface.IProductCreator
import i_InterfaceSegregationPrinciple.details.Interface.IProductReader


class ProductH : IProductCreator, IProductReader {

    // region -- Override --

    override fun <T> createData(newData: T) {
        if(newData !is Product) {
            throw Exception("newData is not a product")
        }

        ProductDB.productDB.add(newData)
    }

    override fun <T> readData(): T? {
        val result = Product().getDataFromDB()
        return if (result.isNotEmpty()) result as? T else null
    }

    // endregion
}