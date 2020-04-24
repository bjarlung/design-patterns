package Behavioral.Stategy

abstract class ValidationStrategy {
    abstract fun isValid(c: CreditCard): Boolean

    fun passesLuhn(ccNumber: String): Boolean {
        // TODO Luhn algorithm implementation
        return ccNumber.length > 4
    }
}