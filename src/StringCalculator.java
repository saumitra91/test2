public class StringCalculator {
    public int Add(String numbers){
        if(numbers=="")
            return 0;
        if(numbers.contains(",")){
//            System.out.println("contains ,");
            String[] numbersAsString = numbers.split("[,\n]");
            int sum = 0;
            for (int i = 0; i < numbersAsString.length; i++) {
                sum += Integer.parseInt(numbersAsString[i]);
            }
            return sum;

        }
        int number1 = Integer.parseInt(numbers);
        return number1;

    }
}
