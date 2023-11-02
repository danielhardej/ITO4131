public class ClockDisplay 
{
    private ClockNumber hours;
    private ClockNumber minutes;
    private ClockNumber seconds;

    // default/non-parameterised constructor
    public ClockDisplay() 
    {
        hours = new ClockNumber(24);
        minutes = new ClockNumber(60);
        seconds = new ClockNumber(60);
    }

    public ClockDisplay(int seconds) 
    {   
        this.hours = new ClockNumber(24);
        this.minutes = new ClockNumber(60);
        this.seconds = new ClockNumber(60);
        setClock(seconds);
    }

    // parameterised constructor
    public ClockDisplay(int hours, int minutes, int seconds) {
        this.hours = new ClockNumber(24, hours);
        this.minutes = new ClockNumber(60, minutes);
        this.seconds = new ClockNumber(60, seconds);
    }

    // A display() method that displays the value of the fields on the screen.
    public void display() {
        System.out.println("Hours: " + this.hours);
        System.out.println("Minutes: " + this.minutes);
        System.out.println("Seconds: " + this.seconds);
    }

    // Accessor Methods for each field.
    public ClockNumber getHours()
    {
        return hours;
    }

    public ClockNumber getMinutes()
    {
        return minutes;
    }

    public ClockNumber getSeconds()
    {
        return seconds;
    }

    public int getHoursAsInt()
    {
        return this.hours.getValue();
    }

    public int getMinutesAsInt()
    {
        return this.minutes.getValue();
    }

    public int getSecondsAsInt()
    {
        return this.seconds.getValue();
    }

    public ClockDisplay getTime()
    {
        return this;
    }

    // Mutator Methods for each field.
    public void setClock(int seconds) {
        this.setHours(seconds / 3600);
        this.setMinutes((seconds % 3600) / 60);
        this.setSeconds((seconds % 3600) % 60);
    }

    public void setHours(int newHours) 
    {
        hours.setValue(newHours);
    }

    public void setMinutes(int newMinutes)
    {
        minutes.setValue(newMinutes);
    }

    public void setSeconds(int newSeconds)
    {
        seconds.setValue(newSeconds);
    }

    // A method called showTime(), which displays the time in the format hh:mm:ss.
    public void showTime()
    {
        System.out.println(this.getHours().getValue() + ":" + this.getMinutes().getValue() + ":" + this.getSeconds().getValue());
    }

    public ClockDisplay subtractClock(ClockDisplay clock)
    {
        ClockDisplay newClock = new ClockDisplay(
            this.hours.getValue() - clock.getHoursAsInt(),
            this.minutes.getValue() - clock.getMinutesAsInt(),
            this.seconds.getValue() - clock.getSecondsAsInt()
        );
        return newClock;
    }

    public void timeTick()
    {
        seconds.increment();
        if (seconds.getValue() == 0)
        {
            minutes.increment();
            if (minutes.getValue() == 0)
            {
                hours.increment();
            }
        }
    }

    public void tickDown() 
    {
        seconds.decrement();
        if (seconds.getValue() == 59)
        {
            minutes.decrement();
            if (minutes.getValue() == 59)
            {
                hours.decrement();
            }
        }
    }
    
}
