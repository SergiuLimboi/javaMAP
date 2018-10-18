package L2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        SortingTask sorty = new SortingTask(1d, 3d, 5d, 2d, 4d);
//        sorty.execute();
//        System.out.println(sorty.getNumbers());

        ArrayList<Task> balubex = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            balubex.add(
                    new MessageTask(""+i, ""+i, ""+i, ""+i)
            );
        }
//
//        System.out.println("Stack");
//        QueueContainer cunt = new QueueContainer(balubex);
//        System.out.println(cunt.remove());
//

//        System.out.println("Factory shit");
//        Container bal = TaskContainerFactory.createContainer("LIFO");
//        System.out.println(bal.getClass());

        StrategyTaskRunner bal = new StrategyTaskRunner("FIFO", balubex);
        bal.executeAll();
    }
}
