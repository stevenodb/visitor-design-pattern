package be.cegeka.ventouris.visitor.infanterie;

import be.cegeka.ventouris.visitor.enemies.EnemyVisitor;

public class Soldier implements Infantry {

    private int attackPoints = 5;
    private String offensiveWord = "fill in anything that comes to mind";
    private int health = 40;
    public boolean isAlive;

    public Soldier() {
        isAlive = true;
    }

    @Override
    public int attack() {
        System.out.println("charge");
        return this.attackPoints;
    }

    @Override
    public void offendVisitor() {
        System.out.println(this.offensiveWord);
    }

    @Override
    public void hit(int attackPoints) {
        offendVisitor();
        if (whatsMyHealth() > 0) {
            if (whatsMyHealth() - attackPoints > 0) {
                this.health -= attackPoints;
                System.out.println("Soldiers' health dropped to " + whatsMyHealth());
            } else {
                this.isAlive = false;
                System.out.println("Soldier died");
            }
        } else {
            this.isAlive = false;
            System.out.println("Soldier died");
        }
    }

    @Override
    public int whatsMyHealth() {
        return this.health;
    }

    @Override
    public void defendAgainst(EnemyVisitor visitor) {
        visitor.attack(this);
    }
}
