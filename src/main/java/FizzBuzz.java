public class FizzBuzz {
    public static String getValues() {
        String values = new String();
        for(int i = 1; i<=3; i++) {
            values = values.concat(getValue(i));
        }
        return values;
    }

    private static String getValue(int i) {

        if(i%3==0) {
            return "Fizz\n";
        }
        if(i%5==0){
            return "Buzz\n";
        }
        Integer value = i;
        return value.toString()+"\n";
    }

    }



