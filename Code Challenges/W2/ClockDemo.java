public class ClockDemo {
    public static void main(String[] args)
    {
        // ClockDisplay objClock = new ClockDisplay();
        // objClock.showTime();

        // // test subtractClock()
        // ClockDisplay objClock1 = new ClockDisplay(13, 35, 22);
        // objClock1.showTime();
        // ClockDisplay objClock2 = new ClockDisplay(22, 52, 39);
        // objClock2.showTime();
        // ClockDisplay objClock3 = objClock2.subtractClock(objClock1);
        // objClock3.showTime();

        // objClock3.tickDown();
        // objClock3.tickDown();
        // objClock3.tickDown();
        // objClock3.tickDown();
        // objClock3.tickDown();
        // objClock3.showTime();

        ClockDisplay firstClock = new ClockDisplay(10000);
        for (int i = 0; i < 3; i++)
        {
            firstClock.timeTick();
            firstClock.showTime();
        }
        ClockDisplay secondClock = new ClockDisplay(23, 59, 51);
        
        for (int i = 0; i < 10; i++) 
        {
            secondClock.timeTick();
            secondClock.showTime();
        }

        System.out.println("First clock: ");
        firstClock.showTime();

        System.out.println("Second clock: ");
        secondClock.showTime();
        
    }
}
