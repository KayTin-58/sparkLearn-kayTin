package zhang.com

object Main {

  def main(args: Array[String]): Unit = {
    println("hello word")
    fun01
  }


  def fun01: Unit = {

    val a = 23
    val b = 2

    val update = (hadValue: Boolean) => {
      if (hadValue) a else b
    }

    fun02(update)
  }

  def fun02(update: (Boolean) => Int) = {
    println(update(true))
  }

}
