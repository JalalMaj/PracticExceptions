import java.lang.Exception

fun main(args: Array<String>) {
    var test = readLine() // Read only String?
    try{
        println(test?.toInt())
    }
    catch(e:Exception) {  // To do when exception happened
     println("An exception happened \n ${e.localizedMessage}")
        e.printStackTrace() // The actual error msg
    }finally { // Always to do if there is an exception ->execute this part
        // To stop the function ( required functionallity is performed)
        println("the execuation has completed")
    }
}