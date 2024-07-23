fun main(){
    println("Enter you name")
    var name = readLine()
    println("Welcome $name Press 'Y' to roll the dice")
    val yes = readLine()
    if(yes == "Y" || yes == "y"){
        println("Rolling dice.....")
        Thread.sleep(1000)
        println((1..6).random())
    }else{
        println("invalid input")
    }
}