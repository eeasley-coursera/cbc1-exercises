package org.coursera.cbc.first.practical


class Logger(private[this] val fileName: String) {

  private var logLevel: String = "DEBUG"

  private[this] def openFile(): Unit = {
    ???
  }
  private[this] def closeFile(): Unit = {
    ???
  }

  def log(message: String): Unit = {
    ???
  }
  def setLogLevel(level: String): Unit = {
    logLevel = level
  }
  def clearLog(): Unit = {
    ???
  }

}

object LoggerMain1 {
  def traceExecution(logger: Logger, commands: Seq[String]): Unit = {
    ???
  }
}
