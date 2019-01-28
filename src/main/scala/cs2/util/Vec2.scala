package cs2.util

class Vec2 (var x:Double, var y:Double) {
	/* UNCOMMENT THE CODE BELOW AND COMPLETE THE METHODS

	//Default constructor creates a Vec2 of zeroes
  def this()

  //Copy constructor create a "deep" copy of the input object
  def this(toCopy:Vec2)

  //Provided toString method simplifies printing, e.g. println(vec.toString) OR println(vec)
	override def toString():String = "("+x+","+y+")"

	//Methods for addition and subtraction of vectors
	def + (other:Vec2):Vec2
	def - (other:Vec2):Vec2

	def += (other:Vec2)
	def -= (other:Vec2)

	//Methods for multiplication and division of vectors by a scalar (non-vector)
	def * (scalar:Double):Vec2
	def / (scalar:Double):Vec2

	def *= (scalar:Double)
	def /= (scalar:Double)

	//Methods to determine the length of a vector (magnitude and length should return the same value)
	def magnitude():Double
	def length():Double

	//Method to return a new vector that is in the same direction, but length 1
	def normalize():Vec2
	def unary_~()

	//Methods to calculate the dot product, and determine the angle between 2 vectors
	def dot(other:Vec2):Double
	def **(other:Vec2):Double

	def angleBetween(other:Vec2):Double
	def <>(other:Vec2):Double
	*/
}
