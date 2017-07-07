


// object Hello extends App{
// 	if(args.length >0){
// 		println("hello " +args(0))
// 	}else
// 	{
// 		println("hello world")
// 	}	
// }

import scala.reflect.BeanProperty

class Student{
	private var name = "leo"

	@BeanProperty var age = 0

	def isMyfamily(other:Student) = name == other.name

	def this(name:String) = {
		this() // 调用主构造器
		this.name = name

	}

	def this(name:String,age:Int)={
		this(name)
		this.age = age
	}

	def getName() = name
}

class Person{
	private var privateAge = 0

	def age = privateAge

	def age_= (newValue:Int) {
		if(newValue>privateAge) privateAge = newValue;
	}
}



// var p = new Student("xixiaohui",32)
// p.age = 30
// p.age = 21
// println(p.getName)
// println(p.age)


import scala.collection.mutable.ArrayBuffer

class NetWork{

	class Member(val name:String){
		var contacts = new ArrayBuffer[NetWork#Member]
	}

	private val members = new ArrayBuffer[Member]

	def join(name:String)={
		var m = new Member(name)
		members += m

		m
	}
}

/*
public class NetWork {
  private final scala.collection.mutable.ArrayBuffer<NetWork$Member> members;
  private scala.collection.mutable.ArrayBuffer<NetWork$Member> members();
  public NetWork$Member join(java.lang.String);
  public NetWork();
}

public class NetWork$Member {
  private final java.lang.String name;
  private scala.collection.mutable.ArrayBuffer<NetWork$Member> contacts;
  public final NetWork $outer;
  public java.lang.String name();
  public scala.collection.mutable.ArrayBuffer<NetWork$Member> contacts();
  public void contacts_$eq(scala.collection.mutable.ArrayBuffer<NetWork$Member>);
  public NetWork NetWork$Member$$$outer();
  public NetWork$Member(NetWork, java.lang.String);
}

public class NetWork$Member {
  private final java.lang.String name;
  private scala.collection.mutable.ArrayBuffer<NetWork$Member> contacts;
  public final NetWork $outer;
  public java.lang.String name();
  public scala.collection.mutable.ArrayBuffer<NetWork$Member> contacts();
  public void contacts_$eq(scala.collection.mutable.ArrayBuffer<NetWork$Member>);
  public NetWork NetWork$Member$$$outer();
  public NetWork$Member(NetWork, java.lang.String);
}
*/
// var chatter = new NetWork
// var myFace = new NetWork

// var fred = chatter.join("fred")

// var wilma = chatter.join("wilma")

// val barney = myFace.join("Barney")

// fred.contacts += wilma
// fred.contacts += barney

// for (ele <- fred.contacts){
// 	println(ele.name)
// }

















