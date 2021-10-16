/*
Print out your name onto the console.
e.g. your program should print "The Droid You've Been Looking For".
 */
fun level1() {
    print("Eric Hsu" + "\n")
}

/*
Print out how many letters your name has.
DON'T hardcode a number and just print "8" for example.
You should set your name as a variable, and then print out how many letters
that variable has.
 */
fun level2() {
    val name = "Eric Hsu"
    print(name.length.toString() + "\n")
}

/*
Prompt the user to enter their some text, and then print out only the UPPERCASE
letters.
e.g. Entering "tHis iS a rANdoM meSSagE" should print out "HSANMSSE"
 */
fun level3() {
    val text = readLine()
    //print(text?.filter{ it.isUpperCase()})
    print(text?.map{if(it.isUpperCase()) it else ""}?.joinToString("","",""))
}



level1()
level2()
level3()