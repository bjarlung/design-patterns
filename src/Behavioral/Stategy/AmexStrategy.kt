package Behavioral.Stategy

class AmexStrategy(): ValidationStrategy() {
    override fun isValid(creditCard: CreditCard): Boolean {
        var isValid: Boolean = true

        isValid = creditCard.number.startsWith("37")
                || creditCard.number.startsWith("34")

        if(isValid) {
            isValid = creditCard.number.length == 15
        }

        if(isValid) {
            isValid = passesLuhn(creditCard.number)
        }

        return isValid
    }
}