import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Test

class LibraryTest {

    @Test
    fun `open file`() {
        val result = ThirdTask().fileLocationToForest(ThirdTaskSolution::class.java.getResource("test_file").path)

        result shouldNotBe null
    }

    @Test
    fun `parse TreeRepresentation`() {
        val sheet = ThirdTask().fileLocationToForest(ThirdTaskSolution::class.java.getResource("test_file").path)

        val result = ThirdTask().treeToRepresentation(sheet.getTree(0))

        result shouldNotBe null
        result.name shouldBe "Harry Potter 1"
        result.isOak shouldBe true
        result.height shouldBe 10
    }

    @Test
    fun `parse Forest`() {
        val sheet = ThirdTask().fileLocationToForest(ThirdTaskSolution::class.java.getResource("test_file").path)

        val result = ThirdTask().parseForestToListOfTree(sheet)

        result shouldNotBe null
        result.size shouldBe 7
    }

    @Test
    fun `modify and save`() {
        val sheet =
            ThirdTask().fileLocationToForest(ThirdTaskSolution::class.java.getResource("test_file").path)

        val data = ThirdTask().parseForestToListOfTree(sheet)

        val result = ThirdTask().grow(data)
        result.size shouldBe 7
        result[0].height shouldBe 20
        result[1].height shouldBe 10
        result[2].height shouldBe 20
        result[3].height shouldBe 20
    }
}