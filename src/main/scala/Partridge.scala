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
    ???
  }

  def london(args: Array[String]): String = {
    ???
  }

}
