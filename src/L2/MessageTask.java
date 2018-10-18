package L2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class MessageTask extends Task{
    private String message;
    private String from;
    private String to;
    private LocalDateTime date = LocalDateTime.now();
    private String stringDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

    public MessageTask(String description, String message, String from, String to) {
        super(
                String.valueOf(new Random().nextInt(89999) + 10000),
                description
        );
        this.message = message;
        this.from = from;
        this.to = to;
    }

    public MessageTask(String description, String message, String from, String to, LocalDateTime date) {
        super(
                String.valueOf(new Random().nextInt(89999) + 10000),
                description
        );
        this.message = message;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getStringDate() {
        return stringDate;
    }

    @Override
    public void execute(){
        String output = String.format(
                "%s %s:%s\nFrom: %s\n To: %s\n\n" + message,
                stringDate,
                date.getHour(),
                date.getMinute(),
                from,
                to
        );
        System.out.println(output);
    }

    @Override
    public String toString(){
        String output = String.format(
                "%s %s:%s\nFrom: %s\n To: %s\n\n" + message,
                stringDate,
                date.getHour(),
                date.getMinute(),
                from,
                to
        );

        return output;
    }
}
