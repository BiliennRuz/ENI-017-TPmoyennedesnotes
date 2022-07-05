fun main(args: Array<String>) {
    println("Hello World")

    var nbVal: Int
    var stringInput: String
    print("Entrer le nombre de valeurs : ")
    stringInput = readLine()!!
    nbVal = stringInput.toInt()

    var newVal: Float
    var sumVal: Float = 0.0F
    var moy: Float = 0.0F

    for (i in nbVal downTo 1 step 1) {
        print("Valeur : ")
        stringInput = readLine()!!
        newVal = stringInput.toFloat()
        sumVal += newVal
        println(sumVal)
    }

    moy = sumVal / nbVal
    print("La moyenne des notes est de $moy")




}