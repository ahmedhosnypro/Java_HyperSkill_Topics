package json.gson;

public class TimeData {

    private String time;
    private Long milliseconds_since_epoch;
    private String date;

    public TimeData() {
    }

    public TimeData(String time, Long milliseconds_since_epoch, String date) {
        this.time = time;
        this.milliseconds_since_epoch = milliseconds_since_epoch;
        this.date = date;
    }

    @Override
    public String toString() {
        return "TimeData{" + "time=" + time + ", milliseconds_since_epoch=" + milliseconds_since_epoch + ", date=" + date + '}';
    }
}