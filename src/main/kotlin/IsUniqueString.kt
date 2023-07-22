/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */


fun isUnique(s : String) : Boolean {
    var checker = 0
    for (c in s) {
        println("checker $checker")
        val cVal = c - 'a'
        println("cval ---> $cVal")
        val bitAtIndex = cVal shl 1
        println("bitaindex $bitAtIndex")
        if ((checker and bitAtIndex) != 0) return false
        checker = checker or bitAtIndex
    }
    return true
}
fun  main() {
    println(isUnique("abc")) // returns true

    println(isUnique("abcc")) // returns false

}