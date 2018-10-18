package L2.Test;

import L2.MessageTask;
import junit.framework.TestCase;
import org.junit.Test;


import java.util.Vector;

public class TestMessageTask extends TestCase {

    @Test
    public void testMessageFormatting(){
        Vector<MessageTask> msgVector = new Vector<>();
        msgVector.add(new MessageTask("Cod comanda", "1234", "FMag", "Vasile"));
        msgVector.add(new MessageTask("Subiect", "5432", "Om", "Fas"));
        msgVector.add(new MessageTask("Doctorul", "Nu conteaza", "Faust", "Lasati"));
        msgVector.add(new MessageTask("Ce sa scriu aici?", "zi te rog si mie", "A", "B"));
        msgVector.add(new MessageTask("Va rog frumos", "Nu mai faceti piftie", "Camera 60", "Camera 61"));

        for (MessageTask msg : msgVector) {
            String printable = String.format(
                    "id=%s|description=%s|message=%s|from=%s|to=%s|date=%s %s",
                    msg.getTaskID(),
                    msg.getDescription(),
                    msg.getMessage(),
                    msg.getFrom(),
                    msg.getTo(),
                    msg.getStringDate(),
                    String.format("%s:%s", msg.getDate().getHour(), msg.getDate().getMinute())
            );
            System.out.println(printable);
        }
    }
}