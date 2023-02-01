package minggu12;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int) (0.1 * health);
                break;
            case 2:
                health += (int) (0.3 * health);
                break;
            case 3:
                health += (int) (0.4 * health);
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (0.2 * health);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data :\n" + super.getZombieInfo() + "\n";
    }
}
