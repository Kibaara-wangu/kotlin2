fun main(){
    greeting("Jane")
    modulus(6.0,4.0)
    add(6,3,4,5)
    myInterest()

}
fun greeting(name: String){
    println("Hello" + ' ' + name)
}
fun modulus(num1: Double , num2: Double){
    var result=num1 % num2
    println(result)
}
fun add(num1: Int, num2: Int, num3: Int, num4: Int){
    var sum=num1+num2+num3+num4
    println(sum)
}
fun myInterest(){
    var fact="i like to play volleyball"
    println(fact)
}
