package jozicek.playground.graphalg

import java.util.*

/**
 * Adjacent list graph representation.
 */
open class UnorderedGraph(val numberOfVertices: Int) : Graph {


    override val adjListArray = Array(numberOfVertices) { LinkedList<Node>() }

    /**
     * add new edge to the graph.
     */
     override fun addEdge(src: Node, dest: Node) {
        adjListArray[src.number].add(dest)
        adjListArray[dest.number].add(src)
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

    override fun getNeighboursOfNodeWithNumber(number: Int): LinkedList<Node> {
        return adjListArray[number]
    }



}