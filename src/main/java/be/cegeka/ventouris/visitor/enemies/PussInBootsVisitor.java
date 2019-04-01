package be.cegeka.ventouris.visitor.enemies;

import be.cegeka.ventouris.visitor.infanterie.Infantry;

import java.util.stream.IntStream;

public class PussInBootsVisitor implements EnemyVisitor {

    private PussInBoots pussInBoots;

    public PussInBootsVisitor(PussInBoots pussInBoots) {
        this.pussInBoots = pussInBoots;
    }

    @Override
    public void attack(Infantry infantry) {
        IntStream.range(0, pussInBoots.attackCount()).forEach(
            count -> infantry.hit(pussInBoots.attack()));

        pussInBoots.hit(infantry.attack());
    }
}
