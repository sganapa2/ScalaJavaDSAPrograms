package myscala.programs

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Recap extends App {

  case class Friend(name: String)
  case class Tweet(message: String)

  def getFriends(): Future[List[Friend]] = Future {
    println("Getting friends list")
    Thread.sleep(1000)
    println("Fetched all friends")
    List(Friend("Santosh"))
  }

  def getTweets(): Future[List[Tweet]] = Future {
    println("Getting tweets")
    Thread.sleep(1000)
    println("Fetched all tweets")
    List(Tweet("TweetMessage1"))
  }

  println("Program started")

  val friends = getFriends()
  val tweets = getTweets()

  println("Program Finished")

  Thread.sleep(1000)
}
