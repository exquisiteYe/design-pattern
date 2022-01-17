package xyDemo.studyMemento.exp2;

import java.util.Stack;

/**
 * 相当于备忘录的管理者
 */
public class SnapshotHolder {
    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
