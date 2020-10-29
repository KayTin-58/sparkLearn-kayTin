package zhang.com
object TraitTEST {


  def main(args: Array[String]): Unit = {
    val c = test
    println( c.hasNest)
  }


  def test: Write = {
    new Write {
      val a = scala.util.Random.nextInt(100)
      override def hasNest: Boolean = {
        if(10 > a) true else false
      }
      override def nextPartition(): Int = {
        a
      }
    }
  }
}
trait Write {
  def hasNest: Boolean

  def nextPartition(): Int
}
