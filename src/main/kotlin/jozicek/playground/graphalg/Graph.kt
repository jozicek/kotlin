package jozicek.playground.graphalg

import java.util.*

/**
 * Adjacent list graph representation.
 */
class Graph( val numberOfVertices: Int)  {

     val adjListArray = Array(numberOfVertices) { LinkedList<Int>() }

    /**
     * add new edge to the graph.
     */
     fun addEdge(src: Int, dest: Int) {
        adjListArray[src].add(dest)
        adjListArray[dest].add(src)
    }

    /**
     * prints graph
     */
     fun print() {
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