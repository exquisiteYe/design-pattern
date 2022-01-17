package xyDemo.testWeb;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;


public class cMaster {
    /**
     * 创建一个ConcurrentLinkedQueue 用来盛放任务
     * ConcurrentLinkedQueue是一个线程安全的无界线程安全队列
     * 对元素的排序遵循先进先出的原则 获取元素时返回头部元素 添加元素则为尾部
     */
    private Queue<Object> workersQueue = new ConcurrentLinkedQueue<>();
    /**
     * 创建HashMap<K,V> 来存放Worker对象
     */
    private Map<String, Thread> workers = new HashMap<>();
    /**
     * 创建ConcurrentHashMap来存放Worker计算后的结果集
     */
    private Map<String, Object> resultMap = new ConcurrentHashMap<>();
    /**
     * Master类的有参构造
     * @param worker Worker对象
     * @param workersCount Worker的数量 用来创建对应数量的线程
     */
    public cMaster(cWorker worker , int workersCount ) {
        worker.setIntoWorkersQueue(this.workersQueue);
        worker.setResultMap(this.resultMap);
        /*
         * 创建对应数量的线程来模拟Worker
         * 至于显式new Thread() 阿里的代码规约什么的对我这个无业游民毫无约束 随它去
         */
        for (int i = 0 ; i < workersCount ; i ++) {
            workers.put(Integer.toString(i) , new Thread(worker , Integer.toString(i)));
        }
    }
    /**
     * 判断是否所有的子任务都已完成
     * @return 是否完成
     */
    public boolean isComplete() {
        for(Map.Entry<String, Thread> entry : workers.entrySet()) {
            if (entry.getValue().getState() != Thread.State.TERMINATED) {
                return false;
            }
        }
        return true;
    }
    /**
     * 向任务队列中提交子任务
     */
    public void missionSubmit(Object mission) {
        workersQueue.add(mission);
    }
    /**
     * 返回子任务的结果集
     * @return 子任务运行完毕的结果集
     */
    public Map<String, Object> getResultMap() {
        return resultMap;
    }
    /**
     * 启动所有的Workers线程 开始并行计算
     */
    public void startAllWorkes() {
        for (Map.Entry<String,Thread> threadEntry : workers.entrySet()) {
            threadEntry.getValue().start();
        }
    }
}

