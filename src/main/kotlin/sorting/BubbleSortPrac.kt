package sorting

fun <T> ArrayList<T>.swapAt1(start: Int, end: Int) {
    val aux = this[start]
    this[start] = this[end]
    this[end] = aux
}

fun <T : Comparable<T>> ArrayList<T>.bubbleSort1(
    showPasses: Boolean = false
) {
    val n = this.size
    if (n < 2) return
    var swap = true
    while (swap) {
        swap = false
        for (i in 0 until n - 1) {
            if (this[i] > this[i+1]) {
                this.swapAt(i,i+1)
                swap = true
            }
        }
        if (showPasses) println(this)
    }
}

