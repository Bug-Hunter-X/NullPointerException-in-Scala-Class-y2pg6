```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

val obj = new MyClass(10) 
val result = obj.myMethod(5) 
println(result) // prints 15

//The following code throws a NullPointerException
class AnotherClass(var myVar : String){
  def printMyVar() : Unit ={
     println(myVar) 
  }
} 

val anotherObj = new AnotherClass(null)
anotherObj.printMyVar() // throws NullPointerException 
```