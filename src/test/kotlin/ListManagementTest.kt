import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test


class ListManagementTest {
    val listManagement = ListManagement()
    @Test
    fun reverseList() {
        val expected = listOf("kakukk", "béka", "alma")
        val result = listManagement.reverseList(listOf("alma", "béka", "kakukk"))
        result shouldBe expected
    }


    @Test
    fun reverseAndFilterList() {
        val expected = listOf(6, 4, 2)
        val result = listManagement.reverseAndFilter(listOf(1, 2, 3, 4, 5, 6))
        result shouldBe expected
    }

    @Test
    fun calculateSeries_shouldCalculateTheFirstElement() {
        val result = listManagement.calculateSeries(1, 2, 1)
        result.size shouldBe 1
        result[0] shouldBe 3
    }

    @Test
    fun calculateSeries_shouldCalculateMultipleElements() {
        val result = listManagement.calculateSeries(1, 2, 3)
        result.size shouldBe 3
        result shouldBe listOf(3, 5, 17)
    }

    @Test
    fun calculateSeriesShouldHaveAnEvenNumber() {
        val result = listManagement.seriesHasEvenNumber(2, 2, 3)
        result shouldBe true
    }

    @Test
    fun calculateSeriesShouldNotHaveAnEvenNumber() {
        val result = listManagement.seriesHasEvenNumber(1, 2, 3)
        result shouldBe false
    }

}