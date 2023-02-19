package task9;

public class GiantSnake extends Monster{
    public GiantSnake(String name){
        super(name + " the GiantSnake",7);
    }

    @Override
    public void attack(Monster monster) {
        monster.damage(getForce());
        growl();
    }
    @Override
    public void growl() {
        System.out.println("Ssssss");
    }
}
