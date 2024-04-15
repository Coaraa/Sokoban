import java.util.Observable;

public class Case extends Observable {
    private int x;
    private int y;
    public Case() {
        this.x = 0;
        this.y = 0;
    }
    public Case(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void move(Direction d) {
        switch (d) {
            case UP:
                if (this.y > 0) this.y--;
                break;
            case DOWN:
                if (this.y < 9) this.y++;
                break;
            case LEFT:
                if (this.x > 0) this.x--;
                break;
            case RIGHT:
                if (this.x < 9) this.x++;
                break;
        }
        setChanged();
        notifyObservers();
        System.out.println("x: " + this.x + " y: " + this.y);
    }
}
