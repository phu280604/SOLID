package d_DependencyInversionPrinciple.details

class EmailNotifier : INotifier {
    override fun notify(message: String){
        println(message)
    }
}