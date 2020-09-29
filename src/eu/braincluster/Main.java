package eu.braincluster;

public class Main
{
    public static void main(String[] args)
    {
        String text1 = "Pistaba";

        StringModifier1 sm1 = new StringModifier1();
        System.out.println(sm1.operation(text1));

        IStringProcessor sm2 = new IStringProcessor()
        {
            @Override
            public String operation(String text)
            {
                return text.toLowerCase();
            }
        };

        System.out.println(sm2.operation(text1));

        IStringProcessor sm3 = text -> "Hello, " + text + "!";

        System.out.println(sm3.operation(text1));
    }
}
