package assignments

fun ArmstrongNumber(number: Int): Boolean {

    var number1 = number
    val noOfDigits = number.toString().length
    var sum = 0
    var div = 0
    while (number1 > 0) {
        div = number1 % 10
        var temp = 1
        for (i in 0 until noOfDigits) {
            temp *= div
           // println(temp)
        }
        sum += temp
        number1 = number1 / 10
    }
    return if (number == sum) {
        true
    } else {
        false
    }
}

fun main() {
    print("Enter the number to check: ")
    val number = Integer.valueOf(readLine())
    println(ArmstrongNumber(number))
}