import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class Produce (expirationDate: String,
               name: String,
               aisle: Int,
               nutritionFacts: nutritionFacts):
                Product(name,aisle,nutritionFacts){

    val year: Int = Calendar.getInstance().get(Calendar.YEAR)
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")

    var expirationDate = expirationDate
        get() = field
        set(value) {
            field = value
        }

    override fun getSummary() {
        println("Name: $name \n" +
                "Aisle: $aisle \n" +
                "Ingredients: ${nutritionFacts.nutritionSummary()}" +
                "Expiration Date: ${expirationDate.format(formatter)}")
    }

}