import akka.actor.Actor

//case classes are used for messages as they are immutable
case class SimpleMessage(message: String)

/**
  * Your actor has to extend the class Actor and
  * provide implementation for the method receive
  */
class SimpleActor extends Actor {

  def receive = {

    case SimpleMessage(x) => println(x)
    case _ => println("No message")

  }

}
