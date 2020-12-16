import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void Testwithnoarguments() {
        StringCalculator calc = new StringCalculator();
        Assert.assertEquals(calc.Add(""), 0);
    }
    @Test
    public void TestwithOneNumber(){
        StringCalculator calc = new StringCalculator();
        Assert.assertEquals(calc.Add("1"), 1);
    }
    @Test
    public void TestwithTwoNumbers(){
        StringCalculator calc = new StringCalculator();
        Assert.assertEquals(calc.Add("1,2"),3);
    }
    @Test
    public void TestwithmoreNumbers(){
        StringCalculator calc = new StringCalculator();
        Assert.assertEquals(calc.Add("1,2,3,4,5,6,7,8,9"),45);
    }
    @Test
    public void TestwithNewLine(){
        StringCalculator calc = new StringCalculator();
        Assert.assertEquals(calc.Add("1\n2,3"),6);
    }
}
