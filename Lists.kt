package assignments

fun main() {

    val list1 = listOf<Int>(3,4)
    val list2 = listOf<Int>(1,2,3,4,5)

    if (list1.size == list2.size) {
        val equal = Equal(list1,list2)
        print("Lists are equal")
    }
    else
    {
        if (list1.size > list2.size) {
            var count = Comparelist(list1, list2)
            println("A is a superlist of B")
        } else {
            if (list1.size < list2.size) {
                var count = Comparelist(list1, list2)
                println("A is a sublist of B")
            }
        }
    }


}


fun<T> Equal(list1:List<T>,list2:List<T>): Boolean {

    return list1.zip(list2).all { (x, y) -> x == y }
}

fun Comparelist(list1:List<Int>,list2:List<Int>): Int {
 var count= 0
var list3 = mutableListOf<Int>()
for (i in list2.indices){
if (list2[i] == list1[0]) {
    if(i  + list1.size - 1 <= list2.size - 1)
        list3.add(i)
}
}
var ind =list2.indexOf(list1[0])
    for (i in list3) {
for (j in list1.indices) {
count =if (list2[i+j] == list1[j]) 1 else 0

}
if (count ==1)  break
    }
    return count
}