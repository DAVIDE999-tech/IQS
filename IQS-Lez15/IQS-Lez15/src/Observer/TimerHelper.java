package Observer;

import java.util.TimerTask;

public class TimerHelper extends TimerTask {
    private static Subject subject;
    private static int state;

    public TimerHelper(Subject subject) {
        this.subject = subject;
        this.state = TimerHelper.subject.getState();
    }

    @Override
    public void run() {
        // Busines logc da eseguire ogni volta che viene schedulato il task
        subject.setState(state++);
    }
}
