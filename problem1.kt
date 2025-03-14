fun main() {
    val input = readLine()?.toIntOrNull()
    if (input != null && input > 0) {
        val result = rumus(input)
        println(result.joinToString("-"))
    } else {
        println("Masukkan angka yang valid!")
    }
}

fun rumus(n: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (i in 0 until n) {
        list.add((i * (i + 1)) / 2 + 1) 
    }
    return list
}



