fun main() {
    val input = readLine()?.filter { it != ' ' } ?: ""
    println(isBalanced(input))
}

fun isBalanced(s: String): String {
    val stack = ArrayDeque<Char>()
    val bracketPairs = mapOf(')' to '(', '}' to '{', ']' to '[')
    
    for (char in s) {
        when (char) {
            '(', '{', '[' -> stack.addLast(char)
            ')', '}', ']' -> {
                if (stack.isEmpty() || stack.removeLast() != bracketPairs[char]) {
                    return "NO"
                }
            }
        }
    }
    
    return if (stack.isEmpty()) "YES" else "NO"
}




