public class FizzBuzz {
    public static String getValues() {
        String values = new String();
        for(int i = 1; i<=13; i++) {
            values = values.concat(getValue(i));
        }
        return values;
    }

    private static String getValue(int i) {
        Integer value = i;
        if(i%3==0 || value.toString().contains("3")) {
            return "Fizz\n";
        }
        if(i%5==0|| value.toString().contains("5")){
            return "Buzz\n";
        }
        return value.toString()+"\n";
    }

    }



