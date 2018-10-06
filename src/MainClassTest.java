import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber()
    {
        int a = getClassNumber();
        {
            Assert.assertTrue("The number is less than 45",a > 45);
        }

    }
}
