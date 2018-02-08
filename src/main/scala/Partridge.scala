object Partridge {

  // IMPORTANT: Do not change the signatures of the functions declared below.
  // See the README file for explanations of what each function should do.

  def part(args: Array[String]): String = {
    val terms = Array("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

    val x = args.filter(x => terms.contains(x)).length

      if (x == 0) {
        "Lynn, I've pierced my foot on a spike!!"
      } else {
        s"Mine's a Pint${"!" * x}"
      }
    }


  def apple(x: Any): String = {
    val n = x match {
      case i: Int => i
      case s: String => s.toInt
      case _ => throw new IllegalArgumentException("Nah bruv, gotta be an Int or String")
    }
    if (n * n > 1000) {
      "It's hotter than the sun!!"
    } else {
      "Help yourself to a honeycomb Yorkie for the glovebox"
    }
  }

  def london(args: Array[String]): String = {

    val stations = Array("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")

    val x = args.filter(x => stations.contains(x))

    if (x sameElements stations ) {
      "Smell my cheese you mother!"
    } else {
      "No, seriously, run. You will miss it."
    }
  }

}
