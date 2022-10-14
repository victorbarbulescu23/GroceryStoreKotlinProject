class Beverages (isSoda: Boolean,
                isAlcoholic: Boolean,
                name: String,
                aisle: Int,
                nutritionFacts: nutritionFacts):
                Product(name,aisle,nutritionFacts){

    var isSoda = isSoda
        get() = field
        set(value) {
            field = value
        }

    var isAlcoholic = isAlcoholic
        get() = field
        set(value) {
            field = value
        }

    override fun getSummary() {
        if (isAlcoholic){
            println( "Name: $name \n" +
                    "Aisle: $aisle \n" +
                    "Beverage Type: Alcoholic \n" +
                    "Ingredients: ${nutritionFacts.nutritionSummary()} \n")
        } else if (isSoda){
            println( "Name: $name \n" +
                    "Aisle: $aisle \n" +
                    "Beverage Type: Soda \n" +
                    "Ingredients: ${nutritionFacts.nutritionSummary()} \n")
        } else {
            println( "Name: $name \n" +
                    "Aisle: $aisle \n" +
                    "Beverage Type: Water \n" +
                    "Ingredients: ${nutritionFacts.nutritionSummary()} \n")
        }
    }
}