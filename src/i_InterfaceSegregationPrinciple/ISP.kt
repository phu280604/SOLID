package i_InterfaceSegregationPrinciple

import i_InterfaceSegregationPrinciple.details.Data.Product
import i_InterfaceSegregationPrinciple.details.Data.ProductD
import i_InterfaceSegregationPrinciple.details.DataBase.ProductDB
import i_InterfaceSegregationPrinciple.details.Handler.ProductH

fun main(){
    val listDemo = listOf<ProductD>(
        Product(1, "Iphone X", 20),
        Product(2, "SamSung", 5),
        Product(3, "Nokia", 10),
        Product(4, "Iphone XI", 12),
        Product(5, "Lenovo", 6),
    )

    ProductDB.productDB.addAll(listDemo)

    val result = ProductH().readData<MutableList<Product>>()
    result?.forEach {
        println("Id: ${it.productId}, Name: ${it.productName}, Quantity: ${it.quantity}")
    }
}