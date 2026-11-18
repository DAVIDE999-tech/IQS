import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<WorkOrder> codaPrioritaria = new PriorityQueue<>();
        codaPrioritaria.add(new WorkOrder(300, "Lavare l'auto"));
        codaPrioritaria.add(new WorkOrder(1, "Comprare acqua"));
        codaPrioritaria.add(new WorkOrder(2, "Svuotare pattumiera"));
        codaPrioritaria.add(new WorkOrder(100, "Spostare tavolo"));
        codaPrioritaria.add(new WorkOrder(100, "Accendere caldaia"));

        System.out.println(codaPrioritaria);
        while (codaPrioritaria.size() > 0) {
            System.out.println("Rimosso elemento " + codaPrioritaria.remove());
        }
    }
}
