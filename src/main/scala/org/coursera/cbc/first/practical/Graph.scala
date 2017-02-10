package org.coursera.cbc.first.practical

class Graph(graph: Map[String, Set[String]]) {
  def size: Int = {
    ???
  }
  def children(key: String): Set[String] = {
    ???
  }
}

object GraphMain {

  def main(keys: Set[String]) = {
    keys.foreach(doThingToKey(_))
  }

  def doThingToKey(key: String): Unit = {
    ???
  }

}
