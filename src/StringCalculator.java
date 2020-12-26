//Testing commit
public class StringCalculator {
    public int Add(String numbers){
        if(numbers=="")
            return 0;
        else if(numbers.contains("//")){
//            System.out.println(numbers.substring(3));
            return SplitAndSum(numbers.substring(3), numbers.substring(2,3));
        }
        else if(numbers.contains(",")){
//            System.out.println("contains ,");
            return SplitAndSum(numbers, ",");

        }
        int number1 = Integer.parseInt(numbers);
        return number1;

    }

    public int SplitAndSum(String numbers, String delimiter){
        if (delimiter.length() > 0)
            delimiter = "["+ delimiter + "\n]";
        else
            delimiter = "[,\n]";
        String[] numbersAsString = numbers.split(delimiter);
        System.out.println(delimiter);
        int sum = 0;
        for (int i = 0; i < numbersAsString.length; i++) {
            sum += Integer.parseInt(numbersAsString[i]);
        }
        return sum;
    }
}
