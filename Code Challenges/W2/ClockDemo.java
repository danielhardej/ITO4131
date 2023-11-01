public class ClockDemo {
    public static void main(String[] args)
    {
        ClockDisplay objClock = new ClockDisplay();
        objClock.showTime();

        // test subtractClock()
        ClockDisplay objClock1 = new ClockDisplay(13, 35, 22);
        objClock1.showTime();
        ClockDisplay objClock2 = new ClockDisplay(22, 52, 39);
        objClock2.showTime();
        ClockDisplay objClock3 = objClock2.subtractClock(objClock1);
        objClock3.showTime();
    }
}
