public class FizzBuzz {
    public static String getValues() {
        String values = new String();
        for(int i = 1; i<=3; i++){
            if(i%3==0){
                values = values.concat("Fizz\n");
            }else{
                if(i%5==0){
                    values = values.concat("Buzz\n");
                }else{
                    values = values.concat(i+"\n");
                }
            }
        }
        return values;
    }
}
