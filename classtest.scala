
/*
class Counter{
	private var value = 0
	 
	def increment(){
		value += 1
	}
	
	def current() = value
	
	def sayHello(){
		println("hello Counter!")
	}
}

class HelloWorld{
	
}

val myCounter = new Counter()

myCounter.increment()
myCounter.sayHello()



class Student{

	private var myname ="leo"
	
	def name = "your name is " + myname
	
	def name_=(newValue:String){
		print("you cannot edit your name!!!")
	}
}

var stu = new Student()

println (stu.name)

//stu.name ="xixiaohui"

//println (stu.name)

stu.name ="xixiaohui"

*/

import scala.reflect.BeanProperty

class Person{
	//var age = 0
	//val age = 0
	//private var age = 0
	
	//def increment() { age += 1 }
	//def current = age
	
	private[this] var age = 0
	
	@BeanProperty var name:String=_
}

/*
def close():Unit = {

	var p = new Person()
	//p.age = 1

	for (i <- 0 to 10){
		p.increment
	}
	print(p.current)
}
*/

//close()





class Student{
	private var name:String = ""
	
	private var age:Int = 10
	
	def this(name:String){
		this()
		this.name = name
	}
	
	def this(name:String,age:Int){
		this(name)
		this.age = age
	}
	
	def currentage = age
	
}

//var stu = new Student("xixiaohui",20)

//print (stu.currentage)

import scala.collection.mutable.ArrayBuffer

class School(address:String="hefeiliuzhong"){
	println("your school is at "+address)
	
	class Class{
		class Student(name:String){}
		val students = new ArrayBuffer[Student]
		def getStudent(name:String = "leo")={
			new Student(name)
		}
	}
	
	def getMyClass():Class = {
		new Class()
	}
}

class Class{
	class Student(val name:String){}
	val students = new ArrayBuffer[Student]
	def getStudent(name:String = "leo") = {
		new Student(name)
	}
}
val cl = new Class()
val s1 = cl.getStudent("xixiaohui")
cl.students += s1

print (cl.students) 


//var sc = new School
//var cl = new School.Class
//var stu = cl.getStudent("xixiaohui")
//cl.students += stu





























