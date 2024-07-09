package com.example.starcraft;

import com.example.starcraft.unit.AirUnit;
import com.example.starcraft.unit.GroundUnit;
import com.example.starcraft.unit.Unit;

/*
 *  책임: 공격 가능 타입을 정의
 *  메시지: canAttack();
 */

public class AttackType {
    private boolean canAttackGround;
    private boolean canAttackAir;
    private boolean canAttackBoth;

    public AttackType(boolean canAttackGround, boolean canAttackAir, boolean canAttackBoth){
        this.canAttackGround = canAttackGround;
        this.canAttackAir =canAttackAir;
        this.canAttackBoth = canAttackBoth;
    }

    public boolean canAttack(Unit target) {
        // TODO 현재 공중 유닛은 지상, 공중 모두 가능 변경 필요

        if (target instanceof GroundUnit){
            return canAttackGround;
        }
        else if (target instanceof AirUnit){
            return canAttackAir || canAttackBoth;
        }
        return false;
    }

}
