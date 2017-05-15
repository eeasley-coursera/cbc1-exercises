package org.coursera.cbc.seventh

import org.coursera.cbc.seventh.Phantom.Tagged

object Phantom {

  case class Tagged[+T, +A](untagged: A)

}

object Example {
  val staticString = "hello"
  def ourReadLine() = {
    readLine()
  }
}
