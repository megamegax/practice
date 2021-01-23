import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

internal class ListManagementTest : DescribeSpec({
    val listManagement = ListManagement()
    describe("reverseList") {
        it("should return elements in reversed order") {
            val expected = listOf("kakukk", "béka", "alma")
            val result = listManagement.reverseList(listOf("alma", "béka", "kakukk"))
            result shouldBe expected
        }
    }

    describe("reverse and filter a list") {
        it("should return only with even numbers while reversing the order of input") {
            val expected = listOf(6, 4, 2)
            val result = listManagement.reverseAndFilter(listOf(1, 2, 3, 4, 5, 6))
            result shouldBe expected
        }
    }

    describe("calculate series") {
        it("should calculate the first element") {
            val result = listManagement.calculateSeries(1, 2, 1)
            result.size shouldBe 1
            result[0] shouldBe 3
        }
        it("should calculate multiple elements") {
            val result = listManagement.calculateSeries(1, 2, 3)
            result.size shouldBe 3
            result shouldBe listOf(3, 5, 17)
        }
    }
    describe("calculate series and decide if it has even number") {
        it("should have an even number") {
            val result = listManagement.seriesHasEvenNumber(2, 2, 3)
            result shouldBe true
        }
        it("should not have an even number") {
            val result = listManagement.seriesHasEvenNumber(1, 2, 3)
            result shouldBe false
        }
    }
})