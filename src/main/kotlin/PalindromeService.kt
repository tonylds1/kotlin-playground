package main

class PalindromeService {
    fun findLongestPalindrome(s: String): String {
        if (s.isEmpty()) return ""
        var start = 0
        var maxLength = 0
        
        fun expandAroundCenter(left: Int, right: Int) {
            var l = left
            var r = right
            while (l >= 0 && r < s.length && s[l] == s[r]) {
                l--
                r++
            }
            l++
            r--
            if (r - l + 1 > maxLength) {
                start = l
                maxLength = r - l + 1
            }
        }
        
        for (i in s.indices) {
            expandAroundCenter(i, i)
            expandAroundCenter(i, i + 1)
        }
        
        return s.substring(start, start + maxLength)
    }
}