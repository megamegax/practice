import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class StringFunctionsTest {
    val stringFunctions = StringFunctions()

    @Test
    fun `should add 12h to PM if PM smaller than 12`() {
        val result = stringFunctions.convertTimeTo24Format("01:00:01 PM")
        result shouldBe "13:00:01"
    }

    @Test
    fun `should add keep it the same if PM == 12`() {
        val result = stringFunctions.convertTimeTo24Format("12:00:01 PM")
        result shouldBe "12:00:01"
    }

    @Test
    fun `should keep it the same if AM smaller than 12`() {
        val result = stringFunctions.convertTimeTo24Format("01:00:01 AM")
        result shouldBe "01:00:01"
    }

    @Test
    fun `should add substrack 12h if AM == 12`() {
        val result = stringFunctions.convertTimeTo24Format("12:00:01 AM")
        result shouldBe "00:00:01"
    }
}