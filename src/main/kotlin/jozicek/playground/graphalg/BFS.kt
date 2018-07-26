package jozicek.playground.graphalg

import java.util.*

fun bfs(node: Node, graph: Graph) {
    val queue = ArrayDeque<Node>()
    val visited = HashSet<Node>()

    queue.add(node)
    visited.add(node)

    while (!queue.isEmpty()) {
        val s = queue.poll()
        println(s)

        for (i in graph.adjListArray[s.number]) {
            if (!visited.contains(i)) {
                visited.add(i)
                queue.add(i)
            }
        }
    }
}
