package i_InterfaceSegregationPrinciple.details.Interface

interface IProductReader {
    fun <T> readData() : T?
}