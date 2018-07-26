package jozicek.playground.graphalg

import java.util.*

interface Graph {

    val adjListArray: Array<LinkedList<Node>>

    fun addEdge(src: Node, dest: Node)

    fun print()

}