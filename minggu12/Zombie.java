package minggu12;
public abstract class Zombie implements Destroyable {
    protected  int health, level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public Zombie() {
    }    
  
    public abstract void heal();
    
    @Override
    public abstract void destroyed();
    
    public String getZombieInfo(){
        return "Health : "+health+"\nLevel : "+level;
    }
}