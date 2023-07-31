package graphs

import java.util.*

data class Node(val value : Int, val neighbors : List<Node>)


fun dfs(node : Node, visited : MutableSet<Node>) {
    if (node in visited) return
    visited.add(node)
    println(node.value)
    for (neighbor in node.neighbors) {
        dfs(neighbor,visited)
    }
}


fun bfs(node : Node) {
    val queue: Queue<Node> = LinkedList()
    val visited = mutableSetOf<Node>()

    queue.add(node)
    visited.add(node)

    while (queue.isNotEmpty()) {
        val currentNode = queue.poll()
        println(currentNode.value) // Process the current node, you can replace this with your own logic

        for (neighbor in currentNode.neighbors) {
            if (neighbor !in visited) {
                queue.add(neighbor)
                visited.add(neighbor)
            }
        }
    }
}

fun main() {
    val node1 = Node(1, listOf())
    val node2 = Node(2, listOf())
    val node3 = Node(3, listOf(node2))
    val node4 = Node(4, listOf(node1, node3))
    val node5 = Node(5, listOf(node4, node3))

    val rootNode = node5
    val visited = mutableSetOf<Node>()
    dfs(rootNode, visited)
    println()
    println()
    bfs(rootNode)
}