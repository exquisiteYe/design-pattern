package xyDemo.testWeb;

import java.util.Map;
import java.util.Queue;


/**
 * Created by DELL on 2017/12/25.
 * Master-Worker 中的 Worker类
 * @author 犯罪嫌疑人卢某
 */
public class cWorker implements Runnable{
    /**
     * Worker中的任务队列
     */
    private Queue<Object> workQueue;
    /**
     * Worker中任务的结果集Map
     */
    private Map<String, Object> resultMap;
    /**
     * 实现Runnable接口重写的Run方法
     */
    @Override
    public void run() {
        /*
         * 设置轮询 获取子任务并且处理
         */
        while (true) {
            Object mission = workQueue.poll();
            if (mission == null) {
                break;
            }
            /*
             * 模拟子任务的处理 并且把处理结果加入结果集
             */
            Object result = executeMission(mission);
            resultMap.put(Integer.toString(mission.hashCode()) , result);
        }
    }
    /**
     * 具体执行任务的业务逻辑 这里是基本的Worker 具体的逻辑交给子类实现
     * @param mission 任务
     * @return 执行结果
     */
    public Object executeMission(Object mission) {
        return mission;
    }
    /**
     * 设置Worker的任务队列
     * @param workersQueue 任务队列
     */
    void setIntoWorkersQueue(Queue<Object> workersQueue) {
        this.workQueue = workersQueue;
    }
    /**
     * 设置Worker的结果集
     * @param resultMap 结果集
     */
    void setResultMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }
}

