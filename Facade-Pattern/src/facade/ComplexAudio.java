package facade;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-20
 * Time: 오후 4:37
 */
class ComplexAudio {
    enum Status {
        RUNNING, STOP, FORWARD, REWIND
    }

    private Status status;

    public ComplexAudio() {
        this.status = Status.STOP;
    }

    public Status getStatus() {
        return status;
    }

    public void run() {
        System.out.println("ComplexAudio :: Run");
        status = Status.RUNNING;
    }

    public void stop() {
        System.out.println("ComplexAudio :: Stop");
        status = Status.STOP;
    }

    public void forward() {
        System.out.println("ComplexAudio :: Forward");
        status = Status.FORWARD;
    }

    public void rewind() {
        System.out.println("ComplexAudio :: Rewind");
        status = Status.REWIND;
    }
}
