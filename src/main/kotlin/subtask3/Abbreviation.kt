package subtask3



class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {

        var upInput : java.lang.StringBuilder
        upInput = java.lang.StringBuilder(a.toUpperCase())
        var counter = 0
        while(counter < b.length && b.length <= upInput.length)
        {
            if(b[counter] != upInput[counter])
            {
                upInput.deleteCharAt(counter)
                counter--
            }
            counter++
        }
        return if(counter == b.length) "YES" else "NO"
    }
}
