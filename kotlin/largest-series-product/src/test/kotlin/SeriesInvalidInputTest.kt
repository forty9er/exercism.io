
import org.junit.Ignore
import org.junit.Test

class SeriesInvalidInputTest {

    @Ignore
    @Test(expected = IllegalArgumentException::class)
    fun nonDigitCharacters() {
        Series("1234a5")
    }

    @Ignore
    @Test(expected = IllegalArgumentException::class)
    fun negativeSpan() {
        Series("12345").getLargestProduct(-1)
    }

    @Ignore
    @Test(expected = IllegalArgumentException::class)
    fun spanLargerThanStringSize() {
        Series("123").getLargestProduct(4)
    }

    @Ignore
    @Test(expected = IllegalArgumentException::class)
    fun spanLargerThanStringSizeUsingEmptyString() {
        Series("").getLargestProduct(1)
    }
}