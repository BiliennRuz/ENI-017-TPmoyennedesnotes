fun main(args: Array<String>) {
    println("Hello World")

    var nbVal: Int = 0
    var stringInput: String = ""
    var newVal: Float = 0.0F
    var sumVal: Float = 0.0F
    var moy: Float = 0.0F

    do {
        print("Note (-1 pour terminer) ?")
        stringInput = readLine()!!
        newVal = stringInput.toFloat()
        sumVal += newVal
        println(sumVal)
        nbVal ++
    }while (newVal != -1.0F)

    moy = (sumVal +1) / (nbVal -1)
    print("La moyenne des notes est de $moy")




}