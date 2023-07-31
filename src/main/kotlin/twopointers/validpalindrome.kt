/**
 * 125. Valid Palindrome
Easy
7.6K
7.5K
company
Yandex
company
Facebook
company
Apple
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.


Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

fun validPalindrome(s : String) : Boolean {
    val cleanString = s.lowercase().replace(Regex("[^a-zA-Z]"),"")
    val reverseString = cleanString.reversed()
    return cleanString.equals(reverseString)
}
fun main() {

}