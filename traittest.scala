
trait Logger {
	def log(msg:String) {}// 这是一个抽象方法

	val maxLength = 15
}

// public interface traittest {
//   public abstract void log(java.lang.String);
// }

trait ConsoleLogger extends Logger{

	val maxLength:Int //抽象字段

	override def log(msg:String) {
		println("Hi,ConsoleLogger " + msg + " maxLength = " + maxLength)
	}
}

trait FileLogger extends Logger{

	override def log(msg:String) {
		println("Hi,FileLogger " + msg)
	}
}


class SavingsAccount extends Logger{

	def test(msg:String){
		log(msg)
	}
}

//混入一个日志记录器的实现

var s1 = new SavingsAccount with ConsoleLogger
var s = new SavingsAccount with FileLogger

// s1.test("xixiaohui")

println(100 toString)