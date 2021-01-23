import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class StringFunctionsTest : DescribeSpec({
    describe("convertTimeTo24Format") {
        val stringFunctions = StringFunctions()
        it("should add 12h to PM if PM < 12") {
            val result = stringFunctions.convertTimeTo24Format("01:00:01PM")
            result shouldBe "13:00:01"
        }
        it("should add keep it the same if PM == 12") {
            val result = stringFunctions.convertTimeTo24Format("12:00:01PM")
            result shouldBe "12:00:01"
        }
        it("should keep it the same if AM < 12") {
            val result = stringFunctions.convertTimeTo24Format("01:00:01AM")
            result shouldBe "01:00:01"
        }
        it("should add substrack 12h if AM == 12") {
            val result = stringFunctions.convertTimeTo24Format("12:00:01AM")
            result shouldBe "00:00:01"
        }
    }
})