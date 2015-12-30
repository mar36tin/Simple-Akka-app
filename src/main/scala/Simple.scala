import java.util.concurrent.TimeUnit

import akka.actor.{Props, ActorSystem}

object Simple extends App {

  import akka.util.Timeout

  //ActorSystem is a heavy object so its recommended to create only 1 per application
  val system = ActorSystem("system")

  //
  val simpleActor = system.actorOf(Props[SimpleActor], "simpleActor")

  implicit val timeout = Timeout(25, TimeUnit.SECONDS)

  simpleActor ! SimpleMessage("Star wars is out")

}
