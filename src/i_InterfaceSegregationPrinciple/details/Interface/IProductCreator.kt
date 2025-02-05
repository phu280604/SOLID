package i_InterfaceSegregationPrinciple.details.Interface

interface IProductCreator {
    fun <T> createData(newData: T)
}