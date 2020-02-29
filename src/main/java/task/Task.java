package task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private static long counter = 1;
    private final long ID;
    private String title;
    private String description;
    private LocalDateTime createDate;
    private LocalDateTime dueDate;
    private Location location;
    private long createUserID;
    private long assignedUserID;
    private Priority priority;
    private boolean isDone;
    private List<String> requiredSkills = new ArrayList<>();

    public Task() {
        this.ID = counter++;
    }

    public Task(String title, String description, LocalDateTime createDate, LocalDateTime dueDate, Location location, long createUserID, long assignedUserID, Priority priority, boolean isDone, List<String> requiredSkills) {
        this.ID = counter++;
        this.title = title;
        this.description = description;
        this.createDate = createDate;
        this.dueDate = dueDate;
        this.location = location;
        this.createUserID = createUserID;
        this.assignedUserID = assignedUserID;
        this.priority = priority;
        this.isDone = isDone;
        this.requiredSkills = requiredSkills;
    }

    @Override
    public String toString() {
        return "Task{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                ", dueDate=" + dueDate +
                ", location=" + location +
                ", createUserID=" + createUserID +
                ", assignedUserID=" + assignedUserID +
                ", priority=" + priority.getFriendlyValue() +
                ", isDone=" + isDone +
                ", requiredSkills=" + requiredSkills +
                '}';
    }

    public long getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public long getCreateUserID() {
        return createUserID;
    }

    public void setCreateUserID(long createUserID) {
        this.createUserID = createUserID;
    }

    public long getAssignedUserID() {
        return assignedUserID;
    }

    public void setAssignedUserID(long assignedUserID) {
        this.assignedUserID = assignedUserID;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public static TaskBuilder builder() {
        return new TaskBuilder();
    }

    public static class TaskBuilder {
        private String title;
        private String description;
        private LocalDateTime createDate;
        private LocalDateTime dueDate;
        private Location location;
        private long createUserID;
        private long assignedUserID;
        private Priority priority;
        private boolean isDone;
        private List<String> requiredSkills = new ArrayList<>();

        public TaskBuilder withTitle (String title){
            this.title = title;
            return this;
        }
        public TaskBuilder withDescription (String description){
            this.description = description;
            return this;
        }

        public TaskBuilder withCreateDate (LocalDateTime createDate){
            this.createDate = createDate;
            return this;
        }

        public TaskBuilder withDueDate (LocalDateTime dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public TaskBuilder withLocation (Location location) {
            this.location = location;
            return this;
        }

        public TaskBuilder withCreateUserID (long createUserID){
            this.createUserID = createUserID;
            return this;
        }

        public TaskBuilder withAssignedUserID (long assignedUserID){
            this.assignedUserID = assignedUserID;
            return this;
        }

        public TaskBuilder withPriority (Priority priority){
            this.priority = priority;
            return this;
        }

        public TaskBuilder withIsDone (boolean isDone){
            this.isDone = isDone;
            return this;
        }

        public TaskBuilder withRequiredSkills (List<String> requiredSkills){
            this.requiredSkills = requiredSkills;
            return this;
        }

        public Task build () {
            Task task = new Task();
            task.title = this.title;
            task.description = this.description;
            task.createDate = this.createDate;
            task.dueDate = this.dueDate;
            task.createUserID = this.createUserID;
            task.assignedUserID = this.assignedUserID;
            task.priority = this.priority;
            task.location = this.location;
            task.isDone = this.isDone;
            task.requiredSkills = this.requiredSkills;

            return task;
        }
    }
}
