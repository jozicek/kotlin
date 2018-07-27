package jozicek.playground.graphalg

fun dfs(node: Node, graph: Graph, visited: HashSet<Node> = hashSetOf()) {

    visited.add(node)
    println(node)

    for (n in graph.getNeighboursOfNodeWithNumber(node.number)) {
        if (!visited.contains(n)) {
            dfs(n, graph, visited)
        }
    }

}
