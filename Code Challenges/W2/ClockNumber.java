public class ClockNumber {
    
    private int limit;
    private int value;

    public ClockNumber()
    {
        limit = 0;
        this.value = 0;
    }

    public ClockNumber(int rollOverLimit)
    {
        limit = rollOverLimit;
        value = 0;
    }

    public ClockNumber(int rollOverLimit, int value)
    {
        limit = rollOverLimit;
        this.value = value;
    }
    
    public void decrement()
    {
        value = (value - 1);
        value = (value == 0) ? (limit - 1) : value;
    }
    
    public int getValue()
    {
        return value;
    }

    public int getLimit()
    {
        return limit;
    }

    public void increment()
    {
        value = (value + 1) % limit;
    }

    public void setValue(int newValue)
    {
        value = newValue;
    }

    private void setLimit(int newLimit)
    {
        this.limit = newLimit;
    }
}
