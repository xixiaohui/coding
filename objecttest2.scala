

// object objecttest2 extends Any {
	
// 	private var lastNumber = 0

// 	def newUniqueNumber() = { lastNumber += 1;lastNumber }
// }


class Person{

	var name="XL"

	var id = Person.addNum()

	def this(name:String){
		this()
		this.name = name

		println("id = " +id)
		println("name = " +name)
	}
}

object Person  {
	private var num = 0

	private def addNum () = {

		num += 1
		//println("object,Person : " + num)
		num
	}

	def apply(name:String) = {
		println("i am apply")
		new Person(name)
	}

}

// var p = new Person("xixiaohui")

// var p2 = new Person("xinana")

abstract class Shape(var describtion:String){
	def undo():Unit

	def redo():Unit
}

object DoNothing extends Shape("Do nothing"){
	override def undo() = {
		println("donothins undo")
	}

	override def redo() = {
		println("donothins redo")
	}

	
}

// var actions = Map("open" -> DoNothing,"close"->DoNothing)

// for ((k,v) <- actions){
// 	v.undo()
// }

//var dd = Person("xixiaohui")



// object Hello{
	
// 	def main(args:Array[String]){
// 		// println("hello world")
// 	}
// }

object Hello extends App {
	
	if (args.length > 0){
		println("hello " + args(0))
	}else{
		println("hello world")
	}
}