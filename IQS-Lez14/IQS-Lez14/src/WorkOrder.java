public class WorkOrder implements Comparable {
    private Pair<Integer, String> workOrder;

    public WorkOrder(int priority, String description) {
        workOrder = new Pair<>(priority, description);
    }

    public int getPriority() {
        return workOrder.getFirst();
    }

    public String getDescription() {
        return workOrder.getSecond();
    }

    @Override
    public String toString() {
        return "WorkOrder{" +
                "priority=" + workOrder.getFirst() +
                ", description='" + workOrder.getSecond() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        WorkOrder other = (WorkOrder) o;
        if (workOrder.getFirst() < other.workOrder.getFirst()) {
            return -1;
        } else if (workOrder.getFirst() > other.workOrder.getFirst()) {
            return 1;
        }
        return 0;
    }
}
