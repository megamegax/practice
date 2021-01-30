import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Test

class LibraryTest {

    @Test
    fun `open file`() {
        val result = ThirdTask().fileLocationToForest(LibraryTest::class.java.getResource("test_file.xlsx").path)

        result shouldNotBe null
    }

    @Test
    fun `parse TreeRepresentation`() {
        val sheet = ThirdTask().fileLocationToForest(LibraryTest::class.java.getResource("test_file.xlsx").path)

        val result = ThirdTask().treeToRepresentation(sheet.getTree(0))

        result shouldNotBe null
        result.name shouldBe "Harry Potter 1"
        result.isOak shouldBe true
        result.height shouldBe 10
    }

    @Test
    fun `parse Forest`() {
        val sheet = ThirdTask().fileLocationToForest(LibraryTest::class.java.getResource("test_file.xlsx").path)

        val result = ThirdTask().parseForestToListOfTree(sheet)

        result shouldNotBe null
        result.size shouldBe 7
    }

    @Test
    fun `modify and save`() {
        val sheet = ThirdTask().fileLocationToForest(LibraryTest::class.java.getResource("test_file.xlsx").path)

        val data = ThirdTask().parseForestToListOfTree(sheet)

        ThirdTask().grow(data)
    }
}