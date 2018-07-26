package jozicek.playground.graphalg

class OrderedGraph(numberOfVertices: Int) : UnorderedGraph(numberOfVertices) {

    override fun addEdge(src: Node, dest: Node) {
        adjListArray[src.number].add(dest)
    }

}