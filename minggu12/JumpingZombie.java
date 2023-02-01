package minggu12;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int) (0.3 * health);
                break;
            case 2:
                health += (int) (0.4 * health);
                break;
            case 3:
                health += (int) (0.5 * health);
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (0.1 * health);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data :\n" + super.getZombieInfo() + "\n";
    }
}
