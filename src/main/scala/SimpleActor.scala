import akka.actor.Actor

case class SimpleMessage(message: String)

class SimpleActor extends Actor {

  def receive = {

    case SimpleMessage(x) => println(x)
    case _ => println("No message")

  }

}
