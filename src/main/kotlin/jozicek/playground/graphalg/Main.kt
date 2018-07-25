package jozicek.playground.graphalg

fun main(args: Array<String>) {
    val g = Graph(5)
    g.addEdge(0,1)
    g.addEdge(0,4)
    g.addEdge(1,2)
    g.addEdge(1,3)
    g.addEdge(1,4)
    g.addEdge(2,3)
    g.addEdge(3,4)
    g.print()
}