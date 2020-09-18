package assignments

fun reverse(str: String):String {

    val words = str.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    println(words)
    var reversedString = ""
    for (i in words.indices) {
        val word = words[i]
        var reverseWord = ""
        for (j in word.length - 1 downTo 0) {

            reverseWord = reverseWord + word[j]
        }
        reversedString = "$reversedString$reverseWord "
        println(reverseWord)
    }
    return reversedString
}

    fun main() {

        println(reverse("cool"))

    }
