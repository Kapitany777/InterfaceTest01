import eu.braincluster.IStringProcessor;
import eu.braincluster.StringModifier1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest
{
    @Test
    public void testUpperCase()
    {
        String text = "Pistaba";
        StringModifier1 sm1 = new StringModifier1();

        String result = sm1.operation(text);

        assertEquals("PISTABA", result);
    }

    @Test
    public void testLowerCase()
    {
        String text = "Pistaba";

        IStringProcessor sm2 = new IStringProcessor()
        {
            @Override
            public String operation(String text)
            {
                return text.toLowerCase();
            }
        };

        String result = sm2.operation(text);

        assertEquals("pistaba", result);
    }

    @Test
    public void testConcat()
    {
        String text = "Pistaba";
        IStringProcessor sm3 = txt -> "Hello, " + txt + "!";

        String result = sm3.operation(text);

        assertEquals("Hello, Pistaba!", result);
    }
}
