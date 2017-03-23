package org.coursera.cbc.fifth

import scala.language.higherKinds
import scala.language.implicitConversions

object Exercise {
  sealed trait Commands[Command[_], Result] {
    import Commands._
    def flatMap[NewResult](andThen: Result => Commands[Command, NewResult]): Commands[Command, NewResult] = {
      this match {
        case Return(a) => andThen(a)
        case Impure(command, next) => Impure(command, (value: Any) => next(value).flatMap(andThen))
      }
    }
    def map[NewResult](func: Result => NewResult): Commands[Command, NewResult] = {
      flatMap(a => Return(func(a)))
    }
  }
  object Commands {
    trait Embeddable[Command[_], Result] { this: Command[Result] =>
      def embed: Commands[Command, Result] = Impure(this, (a: Result) => Return(a))
    }
    case class Return[Command[_], Result](
      result: Result)
      extends Commands[Command, Result]
    case class Impure[Command[_], Intermediate, Result](
      command: Command[Intermediate],
      next: Intermediate => Commands[Command, Result])
      extends Commands[Command, Result]
  }

  import Commands.Embeddable
  sealed trait ConsoleCommand[Result] extends Embeddable[ConsoleCommand, Result]
  object ConsoleCommand {
    type ConsoleLang[Result] = Commands[ConsoleCommand, Result]

    case class ReadLine()
    case class WriteLine()
  }

  object IO {
    import ConsoleCommand._
    def interpret[Result](program: ConsoleLang[Result]): Result = {
      def interpretCommand[Res](command: ConsoleCommand[Res]): Res = {
        ???
      }
      def recurse(program: ConsoleLang[Result]): Result = {
        import Commands._
        program match {
          case Return(result) => result
          case Impure(command, next) => recurse(next(interpretCommand(command)))
        }
      }
      recurse(program)
    }
  }

  object Example {
    import ConsoleCommand._
    val sample: ConsoleLang[Unit] = {
      implicit def conversion[Result](command: ConsoleCommand[Result]): ConsoleLang[Result] = {
        command.embed
      }
      for {
        line <- ReadLine()
        _ <- WriteLine(line)
        _ <- WriteLine(line)
      } yield { () }
    }
  }
}
