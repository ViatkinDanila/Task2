import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class testExponentiation {
    @Test
    public void testIsNonNegative() throws Exception{
        Exponentiation exponentiation = new Exponentiation();
        boolean isNonNegativeFirst = exponentiation.isNonNegative(-1);
        boolean isNonNegativeSecond = exponentiation.isNonNegative(0);
        boolean isNonNegativeThird = exponentiation.isNonNegative(1);
        Assert.assertEquals(false,isNonNegativeFirst);
        Assert.assertEquals(true,isNonNegativeSecond);
        Assert.assertEquals(true,isNonNegativeThird);
    }
    @Test
    public void testgetNumberFromConsole(){
        Exponentiation inputConsole = new Exponentiation();

        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(5, inputConsole.getNumberFromConsole());

        input = "-123";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(-123, inputConsole.getNumberFromConsole());

        Assert.assertThrows(java.util.NoSuchElementException.class, ()->{
            String text = "Some text";
            InputStream inTwo = new ByteArrayInputStream(text.getBytes());
            System.setIn(inTwo);
            inputConsole.getNumberFromConsole();
        });
    }
    @Test
    public void testDoEvelate(){
        Exponentiation degree = new Exponentiation();
        int result = degree.doEvelate(8);
        Assert.assertEquals(64,result);
        result = degree.doEvelate(-3);
        Assert.assertEquals(81,result);
    }

}
