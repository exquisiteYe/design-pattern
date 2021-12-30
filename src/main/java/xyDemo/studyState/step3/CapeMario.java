package xyDemo.studyState.step3;

import xyDemo.studyState.State;

public class CapeMario implements IMario {
    private MarioStateMachine marioStateMachine;

    public CapeMario(MarioStateMachine stateMachine) {
        this.marioStateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.CAPE;
    }

    @Override
    public void obtainMushRoom() {
        return;
    }

    @Override
    public void obtainCape() {
        return;
    }

    @Override
    public void obtainFireFlower() {
        return;
    }

    @Override
    public void meetMonster() {
        this.marioStateMachine.setScore(marioStateMachine.getScore() - 200);
        this.marioStateMachine.setCurrentState(new SmallMario(this.marioStateMachine));
    }
}
