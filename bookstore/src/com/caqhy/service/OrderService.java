package com.caqhy.service;

import com.caqhy.pojo.Cart;

public interface OrderService {
    String createOrder(Cart cart, Integer userId);
}
