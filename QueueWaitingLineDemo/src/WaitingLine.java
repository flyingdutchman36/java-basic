import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by "SumarK" On 19/8/2565 | 12:50
 * Copy&Paste Engineering. Good luck have fun.
 */
public class WaitingLine {
    private static int seq = 0;
    private int queueId;
    private LocalDateTime inTime;

    public WaitingLine() {
        this.queueId = ++seq;
        this.inTime = LocalDateTime.now();
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    public LocalDateTime getInTime() {
        return inTime;
    }

    public void setInTime(LocalDateTime inTime) {
        this.inTime = inTime;
    }

    @Override
    public String toString() {
        return "WaitingLine{" +
                "queueId=" + queueId +
                ", inTime=" + inTime +
                '}';
    }
}
