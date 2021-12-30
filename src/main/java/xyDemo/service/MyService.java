package xyDemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyDemo.Interface.ServiceInterface;
import xyDemo.dao.MyDaoMapper;


@Service
@Slf4j
public class MyService implements ServiceInterface {
    @Autowired
    private MyDaoMapper myDao;

    @Override
    public int getNum() {
        return 1;
    }

    @Override
    public String getName(int id) {
        if (id <= 0) {
            log.warn("参数错误");
            return "参数错误";
        }
        try {
            log.info("service getName id: " + id);
            return myDao.getName(id);
        } catch (Exception e) {
            log.error("数据库异常");
            return "系统异常";
        }

    }
}

