import akka.actor.{Props, ActorSystem}

object Simple extends App {


  /**
    * ActorSystem is a heavy object so its recommended to create only 1 per application
    */
  val system = ActorSystem("system")

  /**
    * ActorRef provides reference to the actor
    * Props is a configuration class used to set options for the Actor
    */
  val simpleActor = system.actorOf(Props[SimpleActor], "simpleActor")

  /**
    * tell ! ensures that the messages are non-blocking
    */
  simpleActor ! SimpleMessage("Star wars is out")

}
