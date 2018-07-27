package jozicek.playground.graphalg

fun main(args: Array<String>) {
    val g = UnorderedGraph(5)
    val node0 = Node(0, "node 0")
    val node1 = Node(1, "node 1")
    val node2 = Node(2, "node 2")
    val node3 = Node(3, "node 3")
    val node4 = Node(4, "node 4")
    g.addEdge(node0,node1)
    g.addEdge(node0,node4)
    g.addEdge(node1,node2)
    g.addEdge(node1,node3)
    g.addEdge(node1,node4)
    g.addEdge(node2,node3)
    g.addEdge(node3,node4)

    //bfs(node0, g)
    dfs(node0, g, HashSet())
}