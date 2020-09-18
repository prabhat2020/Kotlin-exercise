package assignments

fun main() {
    print("Enter the year: ")
    val year: Int = Integer.valueOf(readLine())
    var leap:Boolean? = null
    if (year % 4 == 0) {
           if (year % 100 == 0) {
               year % 400 == 0
               leap = true
           } else {
               leap = false
           }
    } else {
        leap = false
    }
    println(if (leap) {
        println("$year is leap year")
    } else {
        println("$year is not leap year")
    })
}