class nutritionFacts (isProduce: Boolean,
                   isCandy: Boolean,
                   isBeverage: Boolean,
                   hasGluten: Boolean) {

    /*
    private var sugar: Int = 0
        get() = field
        set(value) {
            field = value
        }
    private var salt: Int = 0
        get() = field
        set(value) {
            field = value
        }
    private var satFats: Int = 0
        get() = field
        set(value) {
            field = value
        }
    private var transFats: Int = 0
        get() = field
        set(value) {
            field = value
        }

    */
    private var hasGluten: Boolean = false
    private var isProduce = false
    private var isCandy = false
    private var isBeverage = false

    init {
        this.isProduce = isProduce
        this.isCandy = isCandy
        this.isBeverage = isBeverage
    }

    fun nutritionSummary(): String {
        if (isProduce){
            if (hasGluten){
                return "Sugar: 4g \n" +
                        "Sodium: 120mg \n" +
                        "Saturated Fats: 1.3g \n" +
                        "Trans Fats: 6.7g \n" +
                        "This Product Contains Gluten"
            }

            return "Sugar: 4g \n" +
                    "Sodium: 120mg \n" +
                    "Saturated Fats: 1.3g \n" +
                    "Trans Fats: 6.7g \n"
        } else if (isCandy){
            if (hasGluten){
                return "Sugar: 16g \n" +
                        "Sodium: 350mg \n" +
                        "Saturated Fats: 8g \n" +
                        "Trans Fats: 4g \n" +
                        "This Product Contains Gluten"
            }

            return "Sugar: 16g \n" +
                    "Sodium: 350mg \n" +
                    "Saturated Fats: 8g \n" +
                    "Trans Fats: 4g \n"
        } else if (isBeverage){
            if (hasGluten){
                return "Sugar: 10g \n" +
                        "Sodium: 80mg \n" +
                        "Saturated Fats: 3g \n" +
                        "Trans Fats: 6g \n" +
                        "This Product Contains Gluten"
            }

            return "Sugar: 10g \n" +
                    "Sodium: 80mg \n" +
                    "Saturated Fats: 3g \n" +
                    "Trans Fats: 6g \n"
        } else {
            return "unidentified product, no nutritional information can be found"
        }
    }


}