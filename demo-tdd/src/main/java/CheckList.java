import java.util.HashSet;
import java.util.Set;

public class CheckList {
    
    Set<String> tasks = new HashSet<>();
    public CheckList() {
        // Constructor code here
    }

    public int getIncompleteTask() {
        // Method implementation here
        return tasks.size();
    }

    public void addTask(String string) {
        // TODO Auto-generated method stub
        tasks.add(string);
        //throw new UnsupportedOperationException("Unimplemented method 'addTask'");
    }

    public void completeTask(String string) {
        // TODO Auto-generated method stub
        tasks.remove(string);
    }
}
