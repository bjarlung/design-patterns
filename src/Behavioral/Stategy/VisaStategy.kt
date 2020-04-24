package Behavioral.Stategy

class VisaStategy(): ValidationStrategy() {
    override fun isValid(creditCard: CreditCard): Boolean {
        var isValid: Boolean = true

        isValid = creditCard.number.startsWith("4")

        if(isValid) {
            isValid = creditCard.number.length == 16
        }

        if(isValid) {
            isValid = passesLuhn(creditCard.number)
        }

        return isValid
    }
}