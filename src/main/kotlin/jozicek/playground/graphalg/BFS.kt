package jozicek.playground.graphalg

import java.util.*

fun bfs(node: Node, graph: Graph) {
    val queue = ArrayDeque<Node>()
    var visited: Set<Node> = hashSetOf(node)

    queue.add(node)

    while (!queue.isEmpty()) {
        val s = queue.poll()
        println(s)

        for (n in graph.getNeighboursOfNodeWithNumber(node.number)) {
            if (!visited.contains(n)) {
                visited += n
                queue.add(n)
            }
        }
    }
}
