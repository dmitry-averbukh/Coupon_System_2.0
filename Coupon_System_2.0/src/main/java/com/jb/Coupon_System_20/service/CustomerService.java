package com.jb.Coupon_System_20.service;

import com.jb.Coupon_System_20.data.entity.Coupon;

import java.util.List;
import java.util.Optional;

/**
 * CustomerService interface describes methods that Customer service should implement
 */

public interface CustomerService {
    /**
     * that method returns all Coupons of selected Customer.
     * @param id -- id of a Customer.
     * @return List of Coupon,if exist.
     */
    Optional<List<Coupon>> getAllCustomerCoupons(long id);
}
