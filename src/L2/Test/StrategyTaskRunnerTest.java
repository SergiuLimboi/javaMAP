package L2.Test;

import L2.*;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class StrategyTaskRunnerTest extends TestCase {
    public static void main(String[] args) {
        Vector<Task> msgVector = new Vector<>();
        msgVector.add(new MessageTask("Cod comanda", "1234", "FMag", "Vasile"));
        msgVector.add(new MessageTask("Subiect", "5432", "Om", "Fas"));
        msgVector.add(new MessageTask("Doctorul", "Nu conteaza", "Pacient", "Lasati"));
        msgVector.add(new MessageTask("Ce sa scriu aici?", "zi te rog si mie", "A", "B"));
        msgVector.add(new MessageTask("Va rog frumos", "Nu mai faceti piftie", "Camera 60", "Camera 61"));

        StrategyTaskRunner runner = new StrategyTaskRunner(args[0], msgVector);
    }

    @Test
    public void testStrategyFIFO(){
        Vector<Task> msgVector = new Vector<>();
        msgVector.add(new MessageTask("Cod comanda", "1234", "FMag", "Vasile"));
        msgVector.add(new MessageTask("Subiect", "5432", "Om", "Fas"));
        msgVector.add(new MessageTask("Doctorul", "Nu conteaza", "Pacient", "Lasati"));
        msgVector.add(new MessageTask("Ce sa scriu aici?", "zi te rog si mie", "A", "B"));
        msgVector.add(new MessageTask("Va rog frumos", "Nu mai faceti piftie", "Camera 60", "Camera 61"));

        StrategyTaskRunner runner = new StrategyTaskRunner("FIFO", msgVector);
        runner.executeAll();
    }

    @Test
    public void testStrategyLIFO(){
        Vector<Task> msgVector = new Vector<>();
        msgVector.add(new MessageTask("Cod comanda", "1234", "FMag", "Vasile"));
        msgVector.add(new MessageTask("Subiect", "5432", "Om", "Fas"));
        msgVector.add(new MessageTask("Doctorul", "Nu conteaza", "Pacient", "Lasati"));
        msgVector.add(new MessageTask("Ce sa scriu aici?", "zi te rog si mie", "A", "B"));
        msgVector.add(new MessageTask("Va rog frumos", "Nu mai faceti piftie", "Camera 60", "Camera 61"));

        StrategyTaskRunner runner = new StrategyTaskRunner("LIFO", msgVector);
        runner.executeAll();
    }

    @Test
    public void testDecorators(){
        Vector<Task> msgVector = new Vector<>();
        msgVector.add(new MessageTask("Cod comanda", "1234", "FMag", "Vasile"));
        msgVector.add(new MessageTask("Subiect", "5432", "Om", "Fas"));
        msgVector.add(new MessageTask("Doctorul", "Nu conteaza", "Pacient", "Lasati"));
        msgVector.add(new MessageTask("Ce sa scriu aici?", "zi te rog si mie", "A", "B"));
        msgVector.add(new MessageTask("Va rog frumos", "Nu mai faceti piftie", "Camera 60", "Camera 61"));

        StrategyTaskRunner strategyRunner = new StrategyTaskRunner("FIFO", msgVector);
        DelayTaskRunner delayRunner = new DelayTaskRunner(strategyRunner);
        PrinterTaskRunner printerRunner = new PrinterTaskRunner(delayRunner);

        strategyRunner.executeAll();
        delayRunner.executeAll();
        printerRunner.executeAll();
    }
}