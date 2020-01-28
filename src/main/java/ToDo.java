public class ToDo extends Task {

    /**
     * Constructor for the todo class.
     *
     * @param description description of the todo task.
     */
    public ToDo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
