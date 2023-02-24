package task732;

public abstract class Entity {
    public String name;
    public int hp = 15;
    public boolean destroyed = false;
    public Entity(String name){
        this.name = name;
    }
    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Entity " + name + " was destroyed");
            return true;
        }
        return false;
    }
    public abstract boolean isDestroyed();


}
