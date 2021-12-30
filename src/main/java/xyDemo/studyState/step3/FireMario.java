package xyDemo.studyState.step3;

import xyDemo.studyState.State;

public class FireMario implements IMario {
    private MarioStateMachine marioStateMachine;

    public FireMario(MarioStateMachine stateMachine) {
        this.marioStateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.FIRE;
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
        marioStateMachine.setScore(marioStateMachine.getScore() - 300);
        marioStateMachine.setCurrentState(new SmallMario(this.marioStateMachine));
    }
}
