public class RemoveA {
    // remove all of the A and return the String "STACK"
    // there is many methd in string you have to remember for e.g: startWith => remove a whole string  
    public static void main(String[] args) {
        String stmt = "Divyanshuappapple";

        SkipA("", stmt);

        System.out.println(stmt + 'l');
        System.out.println(skipA2(stmt));

        System.out.println(skipA3(stmt + "    lol"));



    }

    static void SkipA(String ans, String stm){
        // what we are going to do check each element in each recursion call and skip if we are on 'a'
        
        // base condition...
        if (stm.isEmpty()) {
            System.out.println(ans);
            return;
        }

        // for each character...

        char ch = stm.charAt(0);

        if (ch == 'a') {
            // skip that 
            SkipA(ans, stm.substring(1));
        }else{
            SkipA(ans + ch, stm.substring(1));
        }

    }

    // in_place

    static String skipA2(String stmt){

        // base condition...
        if (stmt.isEmpty()) {
            return "";
        }

        // we have to return ans in each recursion call;
        //'d' + "ivyanshu", 'i'+ "vyanshu"................'u' + "" ->
        //"u", 'uh'............................... "divynshu"      <-
        // stack + func call(return)

        char ch = stmt.charAt(0);

        if (ch == 'a') {
            // skip and return the string;
            return skipA2(stmt.substring(1));
        }else{
            return ch + skipA2(stmt.substring(1));
        }
    }

    // skip app not apple

    static String skipA3(String stmt){

        // base condition...
        if (stmt.isEmpty()) {
            return "";
        }

        if (stmt.startsWith("app") && !stmt.startsWith("apple")) {
            // skip and return the string;
            return skipA3(stmt.substring(3));
        }else{
            return stmt.charAt(0) + skipA3(stmt.substring(1));
        }
    }
    
}

//Call 10: skipA2("") Base case → returns "".

// Now we start unwinding:

// Call 9: had ch = 'u'. It returns "u" + skipA2(""). Since skipA2("") = "", result = "u".

// Call 8: had ch = 'h'. It returns "h" + "u" = "hu".
