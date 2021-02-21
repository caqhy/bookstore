package com.caqhy.test;


import com.caqhy.dao.OrderDao;
import com.caqhy.dao.impl.OrderDaoImpl;
import com.caqhy.pojo.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDaoTest {
    @Test
    public void saveOrder() {

        OrderDao orderDao = new OrderDaoImpl();

        orderDao.saveOrder(new Order("1234567890",new Date(),new BigDecimal(100),0, 1));

    }
}