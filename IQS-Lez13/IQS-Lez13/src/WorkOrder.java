public class WorkOrder implements Comparable {
    private int priority;
    private String description;

    public WorkOrder(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "WorkOrder{" +
                "priority=" + priority +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        WorkOrder other = (WorkOrder) o;
        if (priority < other.priority) {
            return -1;
        } else if (priority > other.priority) {
            return 1;
        }
        return 0;
    }
}
