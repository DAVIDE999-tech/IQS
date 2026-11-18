package Observer;

import java.util.Timer;
import java.util.TimerTask;

public class ObserverPatternTimerDemo {
    public static void main(String[] args) {
        Subject subject = new Subject(0);

        new DecimalObserver(subject);
        new BinaryObserver(subject);
        new HexadecimalObserver(subject);
        new OctalObserver(subject);

        System.out.println("Stampo gli stati che cambiano una volta al secondo");
        Timer timer = new Timer();
        TimerTask timerTask = new TimerHelper(subject);
        timer.schedule(timerTask, 0, 100);
    }
}
