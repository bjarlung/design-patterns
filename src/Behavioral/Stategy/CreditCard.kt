package Behavioral.Stategy

class CreditCard(
        val strategy: ValidationStrategy,
        val number: String,
        val date: String,
        val cvv: String
) {
    fun isValid(): Boolean {
        return strategy.isValid(this)
    }

}