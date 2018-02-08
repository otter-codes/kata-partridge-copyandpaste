import scala.io.StdIn

val terms = Array("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")


val input = Array("bob", "nancy", "geoff", "turkey", "PearTree", "Chat")

val x = input.filter(x => terms.contains(x)).length

def part(args: Array[String]): String = {
  if (x == 0) {
    "Lynn I've pierced my foot on a spike"
  } else {
    s"Mine's a pint${"!" * x}"
  }
}

println(part(input))