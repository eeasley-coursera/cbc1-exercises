package org.coursera.cbc.second.validation

object Exercise {
  case class Quiz(questions: Seq[String], answers: Seq[Boolean]) {
    def valid: Boolean = {
      questions.nonEmpty &&
      questions.length == answers.length
    }
  }
}
