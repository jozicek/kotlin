package jozicek.playground.graphalg

class OrderedGraph(numberOfVertices: Int) : UnorderedGraph(numberOfVertices) {

    override fun addEdge(src: Int, dest: Int) {
        adjListArray[src].add(dest)
    }

}