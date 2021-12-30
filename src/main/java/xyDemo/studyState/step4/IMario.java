package xyDemo.studyState.step4;


import xyDemo.studyState.State;

public interface IMario {
    State getName();
    void obtainMushRoom(MarioStateMachine stateMachine);
    void obtainCape(MarioStateMachine stateMachine);
    void obtainFireFlower(MarioStateMachine stateMachine);
    void meetMonster(MarioStateMachine stateMachine);
}

// 省略SuperMario、CapeMario、FireMario类...

