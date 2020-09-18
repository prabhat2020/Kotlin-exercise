package assignments



fun occurence(text:String) {

    val dict = HashMap<String,Int>()

    for(word in text.split(" ")) {

        var value = 1

        if(dict[word] != null)
            value += dict[word]?:0

        dict[word] = value
        println(dict)
    }

    for((k,v) in dict)
        println("$k) $v")
}



fun main() {
    println("Enter the string:  ")
    val text = readLine()
    println(text?.let { occurence(it) })
}