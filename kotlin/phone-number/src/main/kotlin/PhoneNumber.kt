class PhoneNumber(unformattedNumber: String) {
    val number = processNumber(unformattedNumber)
    val areaCode: String? = null

    private fun processNumber(unformattedNumber: String): String {
        return unformattedNumber.validateNumber()
                .filter(Char::isDigit)
    }

    private fun String.validateNumber(): String {
        if (this.length == 11 && this.first() == '1') {
            return this.substring(1)
        } else if (this.length == 11) {
            return "0000000000"
        }
        return this
    }
}