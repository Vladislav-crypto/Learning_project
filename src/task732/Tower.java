package task732;

public class Tower extends Entity {
    public Tower(String name) {
        super(name + " the Tower");
    }

    @Override
    public boolean isDestroyed() {
        return false;
    }
}
