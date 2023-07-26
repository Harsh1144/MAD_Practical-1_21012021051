




class student(var no:Int){

    var name:String=""
    constructor(n:Int,s:String):this(n){
        println("second constructor")
      name=s
    }
    init {
        println("init called")
    }

}
fun main(){
    var s1=student(1111,"harsh")
    println(s1.no)
    println(s1.name)
}