import task.Priority;
import task.Task;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Task task = new Task();

        task.setTitle("title");
        task.setCreateDate(LocalDateTime.now());

        Task taskOne = Task.builder()
                .withTitle("Title 1")
                .withDescription("Description 1")
                .withPriority(Priority.MEDIUM)
                .withDueDate(LocalDateTime.now().plusDays(5))
                .build();

        System.out.println(taskOne.toString());

    }
}
