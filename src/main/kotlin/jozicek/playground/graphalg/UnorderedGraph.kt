package jozicek.playground.graphalg

import java.util.*

/**
 * Adjacent list graph representation.
 */
open class UnorderedGraph(val numberOfVertices: Int) : Graph {

     val adjListArray = Array(numberOfVertices) { LinkedList<Int>() }

    /**
     * add new edge to the graph.
     */
     override fun addEdge(src: Int, dest: Int) {
        adjListArray[src].add(dest)
        adjListArray[dest].add(src)
    }

    /**
     * prints graph
     */
    override fun print() {
        for (item in adjListArray.indices) {
            println("Adjacency list for vertex $item")
            print("head")
            adjListArray[item].forEach {
                print(" -> $it")
            }
            println()
        }

    }

}