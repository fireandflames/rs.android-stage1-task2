package subtask6

class Fibonacci {
    fun fibonacci(n: Int): Int {
        if(n == 0 ) { return 0}
        if(n == 1) { return 1}
        return fibonacci(n-1) + fibonacci(n-2)
    }
    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {


        var counter = 0
        while (fibonacci(counter) * fibonacci(counter+1) < n)
        {counter++}
        if(fibonacci(counter)*fibonacci(counter+1) == n) { return intArrayOf(fibonacci(counter),fibonacci(counter+1),1)}
            else{return intArrayOf(fibonacci(counter),fibonacci(counter+1),0)}
        }
}
