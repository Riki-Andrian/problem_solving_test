fun main() {
    val n = readLine()?.toIntOrNull() ?: return
    val scores = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return
    
    val m = readLine()?.toIntOrNull() ?: return
    val gitsScores = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return
    
    val result = denseRanking(scores, gitsScores)
    println(result.joinToString(" "))
}

fun denseRanking(scores: List<Int>, gitsScores: List<Int>): List<Int> {
    val distinctRanks = scores.distinct().sortedDescending() 
    val result = mutableListOf<Int>()
    
    for (score in gitsScores) {
        val rank = distinctRanks.indexOfFirst { it <= score } + 1
        result.add(if (rank == 0) distinctRanks.size + 1 else rank)
    }
    
    return result
}


