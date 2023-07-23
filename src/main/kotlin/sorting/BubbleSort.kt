package sorting

/**
 * Here’s how it works:
1. There’s no need to sort the collection when it has less than two elements. One element is sorted by itself; zero elements don’t require an order.
2. A single-pass will bubble the largest value to the end of the collection. Every pass needs to compare one less value
    than in the previous pass, so you shorten the array by one with each pass.
3. This loop performs a single pass starting from the first element and going up until the last element not already sorted.
    It compares every element with the adjacent value.
4. Next, the algorithm swaps the values if needed and marks this in swapped. This is important later because it’ll
    allow you to exit the sort as early as you can detect the list is sorted.
5. This prints out how the list looks after each pass. This step has nothing to do with the sorting algorithm, but it
    will help you visualize how it works. You can remove it (and the function parameter) after you understand the sorting algorithm.
 */


fun <T> ArrayList<T>.swapAt(first : Int, second : Int) {
    val aux = this[first]
    this[first] = this[second]
    this[second] = aux
}

fun <T : Comparable<T>> ArrayList<T>.bubbleSort(
   showPasses : Boolean = false
) {
    //1
    if (this.size < 2) return
    //2
    for (end in (1 until this.size).reversed()) {
        var swapped = false
        //3
        for (current in 0 until end) {
            if (this[current] > this[current+1]) {
                //4
                this.swapAt(current,current+1)
                swapped = true
            }
        }
        //5
        if (showPasses) println(this)
        //6
        if (!swapped) return
    }
}
fun main() {
    val arr = arrayListOf(9,4,10,3)
    println("Original : $arr")
    /**
     * Original : [9, 4, 10, 3]
        [4, 9, 3, 10]
        [4, 3, 9, 10]
        [3, 4, 9, 10]
        bubble sort [3, 4, 9, 10]
     */
    arr.bubbleSort(true)
    println("bubble sort $arr")
}