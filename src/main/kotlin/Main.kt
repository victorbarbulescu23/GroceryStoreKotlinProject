import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
    var shoppingCart = arrayListOf<Product>()
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")

    println("Welcome to Super Duper Mart! Please follow the instructions in order to fill your shopping cart! ")
    println("This application is specially designed for you to enter the information, so you know exactly what it is you're buying!")
    do{
        var cartFull: Boolean = false

        println("To add produce to your cart, press 1. To add candy to your cart, press 2. To add Beverages to your cart, press 3: ")
        if (readLine()!!.toInt() == 1){

            print("Please enter the products name: ")
            val name: String = readLine()!!
            println()

            print("Please enter the aisle you found the product in: ")
            val aisle: Int = readLine()!!.toInt()
            println()

            print("Please enter the expiration date. Enter this date as MM/dd/YYYY:")
            val expirationDate: String = readLine()!!
            println()

            print("Does this product contain gluten? Enter yes if it does and no if it doesn't: ")
            var hasGluten: Boolean = false
            if (readLine()!!.toString().lowercase(Locale.getDefault()) == "yes"){
                hasGluten = true
            }

            val nutritionFacts = nutritionFacts(true,false,false, hasGluten)
            val item = Produce(expirationDate,name,aisle,nutritionFacts)
            shoppingCart.add(item)
        } else if (readLine()!!.toInt() == 2){
            print("Please enter the products name: ")
            val name: String = readLine()!!
            println()

            print("Please enter the aisle you found the product in: ")
            val aisle: Int = readLine()!!.toInt()
            println()

            println("Please read the label and enter the shelf life of your product (in years)")
            val shelfLife = readLine()!!.toInt()
            println()

            var hardCandy: Boolean = false
            var gummyCandy: Boolean = false
            var iceCream: Boolean = false
            print("If the candy is hardCandy, press 1. If the candy is gummy candy, press 2. If the item is ice cream, press 3: ")
            if (readLine()!!.toInt() == 1){
                hardCandy = true
            } else if (readLine()!!.toInt() == 2){
                gummyCandy = true
            } else {
                iceCream = true
            }
            println()

            print("Does this product contain gluten? Enter yes if it does and no if it doesn't: ")
            var hasGluten: Boolean = false
            if (readLine()!!.toString().lowercase(Locale.getDefault()) == "yes"){
                hasGluten = true
            }

            val nutritionFacts = nutritionFacts(false,true,false, hasGluten)
            val item = Candy(shelfLife,hardCandy,gummyCandy,iceCream,name,aisle,nutritionFacts)
            shoppingCart.add(item)
        } else if (readLine()!!.toInt() == 3){
            print("Please enter the products name: ")
            val name: String = readLine()!!
            println()

            print("Please enter the aisle you found the product in: ")
            val aisle: Int = readLine()!!.toInt()
            println()

            var soda: Boolean = false
            var alcoholic: Boolean = false
            print("If the beverage is soda, press 1. If the beverage is alcoholic, press 2. If the beverage is neither, press 3: ")
            if (readLine()!!.toInt() == 1){
                soda = true
            } else if (readLine()!!.toInt() == 2){
                alcoholic = true
            }
            println()

            print("Does this product contain gluten? Enter yes if it does and no if it doesn't: ")
            var hasGluten: Boolean = false
            if (readLine()!!.toString().lowercase(Locale.getDefault()) == "yes"){
                hasGluten = true
            }

            val nutritionFacts = nutritionFacts(false,false,true, hasGluten)
            val item = Beverages(soda,alcoholic,name,aisle,nutritionFacts)
            shoppingCart.add(item)
        } else {
            println("Sorry, you didn't enter 1, 2, or 3. Please try again.")
        }

        println("Done shopping? Type yes. Not Done? Type no: ")
        if (readLine()!!.toString().lowercase() == "yes"){
            cartFull = true
        }
    } while (!cartFull)

    for (i in 0 until shoppingCart.size){
        println("${shoppingCart[i].getSummary()} \n")
    }
}