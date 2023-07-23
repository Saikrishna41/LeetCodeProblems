import java.util.*
import kotlin.collections.ArrayList

/**
 * Find All Anagrams in a String
 * Description : Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using
 * all the original letters exactly once.
 *
 * Example 1:
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 *
 *
 * Constraints:
 * 1 <= s.length, p.length <= 3 * 104
 * s and p consist of lowercase English letters.
 */


fun findAllAnagrams(s: String, p: String): List<Int> {
    val pArr = IntArray(26)
    val output : MutableList<Int> = ArrayList()
    for (i in 0 until p.length) {
        pArr[p.get(i) - 'a']++
    }
    val windowSize = s.length - p.length
    for (i in 0..windowSize) {
        val tempArr = IntArray(26)
        val tempString = s.substring(i,p.length+i)
        for (j in 0 until tempString.length) {
            tempArr[tempString.get(j) - 'a']++
        }
        if (Arrays.equals(pArr,tempArr)) output.add(i)
    }
    return output
}

fun main() {

}

