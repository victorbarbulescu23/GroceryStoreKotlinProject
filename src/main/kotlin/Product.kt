abstract class Product (name: String,
                        aisle: Int,
                        nutritionFacts: nutritionFacts){

    var name: String = ""
        get() = field
        set(value) {
            field = value
        }
    var aisle: Int = 0
        get() = field
        set(value) {
            field = value
        }
    var nutritionFacts: nutritionFacts

    init {
        this.name = name
        this.aisle = aisle
        this.nutritionFacts = nutritionFacts
    }

    abstract fun getSummary()
}