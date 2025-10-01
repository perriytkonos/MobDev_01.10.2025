fun main(){
    fun task_11(text:String): String{
        var reversedText = ""
        for(i in text.length-1 downTo 0) {
            reversedText += text[i]
        }
        return reversedText
    }
    fun task_12(numbers: List<Int>): Int{
        for((index, number) in numbers.withIndex()){
            if(number != index + 1) return index+1
        }
        return 0
    }

    fun task_13(text1:String, text2:String): Boolean{
        var arr1 = text1.lowercase().replace(" ", "").split("").sorted()
        var arr2 = text2.lowercase().replace(" ", "").split("").sorted()
        return arr1 == arr2;
    }

    fun task_14(n: Int): Int{
        val nums = "1234567890";
        var sum = 0;
        for(i in n.toString()){
            if(nums.contains(i)){
                sum += i.toString().toInt();
            }
        }
        return sum
    }

    fun task_15(n:Int): Int{
        var fib = listOf<Int>(0,1);
        if(n < 1) return 0;
        var count = fib.count();
        while(count <= n){
            val nextNum = fib[count-1] + fib[count-2];
            fib+= nextNum;
            count++;
        }
        return fib.last();
    }

    fun task_16(numbers: List<Int>): List<Int>{
        var dup = listOf<Int>();
        for(n in numbers){
            if(numbers.count {it == n} > 1 && dup.contains(n) == false){
                dup+= n;
            }
        }
        return dup;
    }

    fun task_17(seconds:Int): String{
        var balance = seconds;
        val hours:Int = balance / 3600;
        balance = balance % 3600;
        val minutes:Int = balance / 60;
        val seconds = balance % 60;
        return "$hours:${if(minutes < 10) "0" + minutes.toString() else minutes}:${if(seconds < 10) "0" + seconds else seconds}"
    }

    fun task_18(n:Int): Boolean{
        if(n < 1) return false;
        var divisors = listOf<Int>();
        for(i in 1..n-1){
            if(n % i == 0) divisors+= i;
        }
        if(divisors.sum() == n) return true
        else return false
    }

    fun task_19(email:String): Boolean{
        val cleanEmail = email.trim();
        if(cleanEmail.count {it == '@'} != 1) return false
        if(cleanEmail.first() == '@') return  false;
        if(cleanEmail.last() == '@') return false;
        return true;
    }

    println(task_11("Hello, World!"))
    println(task_12(listOf(1,2,4,5,6,7)))
    println(task_13("f f f a", "a f f     f"))
    println(task_14(931));
    println(task_15(10));
    println(task_16(listOf(1,1,1,1,3,6,6,6,3,4,34,3,2,1,3,3,4,5,6)));
    println(task_17(123502));
    println(task_18(28))
    println(task_19("227@edu.fa.ru"))
}