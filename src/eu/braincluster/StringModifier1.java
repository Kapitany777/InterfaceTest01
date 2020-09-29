package eu.braincluster;

public class StringModifier1 implements IStringProcessor
{
    @Override
    public String operation(String text)
    {
        return text.toUpperCase();
    }
}
