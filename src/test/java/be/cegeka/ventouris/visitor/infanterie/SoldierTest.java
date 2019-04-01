package be.cegeka.ventouris.visitor.infanterie;

import be.cegeka.ventouris.visitor.enemies.PussInBoots;
import be.cegeka.ventouris.visitor.enemies.PussInBootsVisitor;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class SoldierTest {

    private Soldier soldier;

    @Before
    public void setUp() throws Exception {
        soldier = new Soldier();
    }

    @Test
    public void defendAgainst() {
        soldier.defendAgainst(new PussInBootsVisitor(new PussInBoots()));
    }
}