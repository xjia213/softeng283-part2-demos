import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CheckListTest {
    @Test 
    public void zeroIncompleteTasks() {
        // Test code here
        CheckList checkList = new CheckList();
        int result = checkList.getIncompleteTask();
        assertEquals(0, result);
    }

    @Test 
    public void addNewTask() {
        // Test code here
        CheckList checkList = new CheckList();
        // Assuming there's a method to add a task, which is not implemented yet
        checkList.addTask("New Task");
        int result = checkList.getIncompleteTask();
        assertEquals(1, result);
    }

    @Test 
    public void havingTwoIncompleteTasks() {
        // Test code here
        CheckList checkList = new CheckList();
        // Assuming there's a method to add tasks, which is not implemented yet
        checkList.addTask("Task 1");
        checkList.addTask("Task 2");
        int result = checkList.getIncompleteTask();
        assertEquals(2, result);
    }

    @Test 
    public void completeTask() {
        // Test code here
        CheckList checkList = new CheckList();
        // Assuming there's a method to add tasks, which is not implemented yet
        checkList.addTask("Task 1");
        checkList.addTask("Task 2");
        // Assuming there's a method to complete a task, which is not implemented yet
        checkList.completeTask("Task 1");
        int result = checkList.getIncompleteTask();
        assertEquals(1, result);
    }

    @Test 
    public void completeTheSameTaskTwice() {
        // Test code here
        CheckList checkList = new CheckList();
        // Assuming there's a method to add tasks, which is not implemented yet
        checkList.addTask("Task 1");
        // Assuming there's a method to complete a task, which is not implemented yet
        checkList.completeTask("Task 1");
        checkList.completeTask("Task 1"); // Completing the same task again
        int result = checkList.getIncompleteTask();
        assertEquals(0, result);
    }
}
