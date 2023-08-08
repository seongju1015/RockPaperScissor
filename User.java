import java.util.ArrayList;

public class User {
    private ArrayList<Integer> score = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<Integer> win = new ArrayList<>();
    private ArrayList<Integer> lose = new ArrayList<>();
    private ArrayList<Integer> draw = new ArrayList<>();
    
    public ArrayList<Integer> getScore() {
        return score;
    }
    public void setScore(ArrayList<Integer> score) {
        this.score = score;
    }
    public ArrayList<String> getName() {
        return name;
    }
    public void setName(ArrayList<String> name) {
        this.name = name;
    }
    public ArrayList<Integer> getWin() {
        return win;
    }
    public void setWin(int index) {
        int oldValue = win.get(index);
        int newValue = oldValue + 1;
        
        win.set(index, newValue);
    }
    public ArrayList<Integer> getLose() {
        return lose;
    }
    public void setLose(int index) {
        int oldValue = lose.get(index);
        int newValue = oldValue + 1;
        
        lose.set(index, newValue);
    }
    public ArrayList<Integer> getDraw() {
        return draw;
    }
    public void setDraw(int index) {
        int oldValue = draw.get(index);
        int newValue = oldValue + 1;
        
        draw.set(index, newValue);
    }
    
}
