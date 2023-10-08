fun main(args: Array<String>) {
    println("Hello World!")
    /**
     * 2. Write a Kotlin object-oriented program that implements
     * a singleton pattern for a class Logger to
     * provide logging functionality throughout the application.
     */

    val a=Singleton.getInstance();
    val b=Singleton.getInstance();

    println(if(a==b) "a and b refers same object.." else "a and b don't refers same object ")


}

