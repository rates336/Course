package com.kodilla.stream.portfolio;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class BoardTestSuite {

    @Test
    void testAddTaskList() {
        //Given
        Board project = prepareTestData();
        //When

        //Then
        assertEquals(3, project.getTaskLists().size());
    }

    private Board prepareTestData() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");

        //tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        //taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);

        //board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }
    private Board prepareTestDataTwo() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");

        //tasks
        Task task21 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task22 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task23 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task24 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task25 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task26 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        //taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task21);
        taskListToDo.addTask(task23);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task25);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task24);
        taskListDone.addTask(task22);
        taskListDone.addTask(task26);

        //board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }

    @Test
    void testAddTaskListFindUsersTasks() {
        //Given
        Board project = prepareTestData();
        Board project2 = prepareTestDataTwo();

        //When
        User user = new User("developer1", "John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                        .filter(t -> t.getAssignedUser().equals(user))
                        .collect(toList());
        User user1 = new User("developer2", "Emilia Stephanson");
        User user2 = new User("developer3", "Konrad Bridge");
        project2.getTaskLists().stream()
                .flatMap(e -> e.getTasks().stream())
                        .filter(t -> t.getAssignedUser().equals(user1) || t.getAssignedUser().equals(user2))
                                .collect(toList())
                                        .forEach(System.out::println);
        //Then
        assertEquals(2, tasks.size());
        assertEquals(user, tasks.get(0).getAssignedUser());
        assertEquals(user, tasks.get(1).getAssignedUser());
    }
    @Test
    void testAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();             // [1]
        undoneTasks.add(new TaskList("To do"));                     // [2]
        undoneTasks.add(new TaskList("In progress"));
        System.out.println("The task which not done:\n");
        project.getTaskLists().stream()
                .flatMap(e -> e.getTasks().stream())
                .map(q -> "\tTitle: " + q.getTitle() + "\n\tDeadline: " + q.getDeadline() + '\n')
                .forEach(System.out::println);
        List<Task> tasks = project.getTaskLists().stream()          // [4]
                .filter(undoneTasks::contains)                           // [5]
                .flatMap(tl -> tl.getTasks().stream())                   // [6]
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))  // [7]
                .collect(toList());
        System.out.println("\nThe tasks undone in the time:\n");
        tasks.stream()
                .map(e -> "\tTitle: " + e.getTitle() + "\n\tDeadline: " + e.getDeadline() +'\n')
                        .forEach(System.out::println);
        //Then
        assertEquals(1, tasks.size());                              // [9]
        assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }
    @Test
    void testAddTaskListFindLongTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();               // [1]
        inProgressTasks.add(new TaskList("In progress"));                 // [2]
        long longTasks = project.getTaskLists().stream()                  // [3]
                .filter(inProgressTasks::contains)                             // [4]
                .flatMap(tl -> tl.getTasks().stream())                         // [5]
                .map(Task::getCreated)                                         // [6]
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)  // [7]
                .count();                                                      // [8]

        //Then
        assertEquals(2, longTasks);                                       // [9]
    }
    @Test
    void testAddTaskListAverageWorkingOnTask() {
        Board project = prepareTestData();
        List<TaskList> inProgressTasks = new LinkedList<>();
        inProgressTasks.add(new TaskList("In progress"));

        double aveWorkOnTask = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(e -> e.getTasks().stream())
                .map(Task::getCreated)
                .map(q -> LocalDate.now().minusYears(q.getYear()).minusDays(q.getDayOfYear()))
                        .mapToDouble(q -> q.getDayOfYear())
                                .average().getAsDouble();


        assertEquals(11.0, aveWorkOnTask);
        System.out.println(LocalDate.now().minusYears(LocalDate.now().getYear()).minusDays(LocalDate.now().getDayOfYear()));
    }

}