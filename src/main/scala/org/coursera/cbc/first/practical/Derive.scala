package org.coursera.cbc.first.practical

import org.joda.time.DateTime

case class Grade(score: Double)
case class QuizAttempt(timestamp: DateTime, score: Grade, quizId: String)
case class QuizGrade(grade: Grade)

object DeriveMain {

  def derive1(quizAttempts: Seq[QuizAttempt]): Option[QuizGrade] = {
    ???
  }

}

