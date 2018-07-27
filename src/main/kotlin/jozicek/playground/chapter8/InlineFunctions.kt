package jozicek.playground.chapter8

import java.io.BufferedReader
import java.io.FileReader
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

// lock resource before the action and unlock afterwards.
inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun main(args: Array<String>) {
    val l: Lock = ReentrantLock()
    println("before sync")
    synchronized(l) {
        println("action")
    }
    println("after sync")

}

fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use {
        return it.readLine()
    }
}