package com.coviam.shopcarro.order.services;

import com.coviam.shopcarro.order.details.Details;
import com.coviam.shopcarro.order.dto.OrderDto;

import java.util.List;

public interface IOrderservices {

    public List<Details> productBuy(OrderDto orderDto);
    public OrderDto getHistory(String email);



}