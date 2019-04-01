package be.cegeka.ventouris.visitor.enemies;

public class PussInBoots {

    private int attack = 6;
    private int health = 30;
    private int attackCount = 2;
    private String offensiveWord = "true";
    private boolean isAlive = true;

    public int attack() {
        return attack;
    }

    public int attackCount() {
        return attackCount;
    }

    public void offendVisitor() {
        System.out.println(this.offensiveWord);
    }

    public void hit(int attackPoints) {
        offendVisitor();
        if (whatsMyHealth() > 0) {
            if (whatsMyHealth() - attackPoints > 0) {
                this.health -= attackPoints;
                System.out.println("Puss in boots' health dropped to " + whatsMyHealth());
            } else {
                this.isAlive = false;
                System.out.println("puss in boots died");
            }
        } else {
            this.isAlive = false;
            System.out.println("puss in boots died");
        }
    }

    public int whatsMyHealth() {
        return health;
    }
}
