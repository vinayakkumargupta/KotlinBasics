package ControlFlow


fun question1(){
    for(i in 1..5){
        for(j in 1..5){
            print("*")
        }
        println()
    }
}
fun question2(){
    for (i in 1..5){
        for (j in 1..i){
            print("*")
        }
        println()
    }

}
fun question3(){
    for (i in 1..5){
        for (j in 1..i){
            print(j)
        }
        println()
    }
}
fun question4(){
    for (i in 1..5){
        for(j in 1..i){
            print(i)
        }
        println()
    }
}
fun question5(){
    //n-row+1
    for(i in 1..5){
        for (j in 1..5-i+1){
            print("*")
        }
        println()
    }
}
fun question6(){
    for(i in 1..5){
        for (j in 1..5-i+1){
            print(j)
        }
        println()
    }
}
fun question7(){
    //Pyramid Triangle
    for (i in 1..5){
        //spaces
        for(j in 1..5-i ){
            print(" ")
        }
        //stars
        for (j in 1..2*i-1){
            print("*")
        }
        //spaces
        for(j in 1..5-i ){
            print(" ")
        }
        println()
    }
}

fun question8(){
    for(i in 1..5){
        //space
        for(j in 1..i-1){
            print(" ")
        }
        //stars
        for(j in 1..2*(5-i)+1){
            print("*")
        }
        //space
        for(j in 1..i-1){
            print(" ")
        }
        println()
    }
}
fun question9(){
    //for upperhalf
    for(i in 1..5){
        //spaces
        for(j in 1..5-i){
            print(" ")
        }
        //star
        for(j in 1..2*i-1){
            print("*")
        }

        //space
        for(j in 1..5-i){
            print(" ")
        }
        println()

    }
    // for lower half

    for(i in 2..5){
        //space
        for(j in 1..i-1){
            print(" ")
        }
        //stars
        for(j in 1..2*(5-i)+1){
            print("*")
        }
        //space
        for(j in 1..i-1){
            print(" ")
        }
        println()
    }

    }

fun main(){
    question1()
    question2()
    question3()
    question4()
    question5()
    question6()
    question7()
    question8()
    question9()

}