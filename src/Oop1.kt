fun main() {
var student=Human("gerardine",20,40.1.toFloat())
    student.eat(20)
    println(student.weight)

    student.speak("Hello")

    student.birthday()
    println(student.age)

    var address=User("Gerarrdine","Kabatesi","0780030142","gerardinekaba@gmai","07800")
    println(address.lastName)
    println(address.phoneNumber)

    
}
class Human(var name:String,var age:Int,var weight: Float) {

    fun eat(foodWeight: Int): Float {
        println("I am eating $foodWeight kgs of food")
        weight=foodWeight+weight
        return weight


    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age++
    }

}
data class User(var firstName:String,var lastName:String,var phoneNumber:String,var email:String,var password:String)








