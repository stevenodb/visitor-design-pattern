package be.cegeka.ventouris.visitor.enemies;

import be.cegeka.ventouris.visitor.infanterie.Infantry;

public interface EnemyVisitor {

    void attack(Infantry infantry);

}
