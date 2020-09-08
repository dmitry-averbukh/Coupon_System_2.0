package com.jb.Coupon_System_20.service;

import com.jb.Coupon_System_20.data.entity.Coupon;

import java.util.List;
import java.util.Optional;

/**
 * AdminService interface describes methods that Admin service should implement
 */

public interface AdminService {
    /**
     * that method returns all coupons.
     *
     * @return list of Coupons, if existing.
     */
    Optional<List<Coupon>> getAllCoupons();

    /**
     * that method simply adds new coupon.
     *
     * @param coupon -- coupon to add.
     * @return Coupon that have bean added.
     */

    Optional<Coupon> addCoupon(Coupon coupon);

    /**
     * that method deletes Coupon by provided id.
     *
     * @param id -- id of coupon to delete.
     * @return Coupon that was deleted, if existing.
     */

    Optional<Coupon> deleteCoupon(long id);

    /**
     * that method returns Coupon by id;
     *
     * @param id -- id of Coupon to return;
     * @return Coupon, if existing.
     */

    Optional<Coupon> getCouponById(long id);

    /**
     * that method should update Coupon based on coupon transmitted as parameter
     *
     * @param coupon -- coupon with information to update;
     * @return updated Coupon, if existing.
     */

    Optional<Coupon> updateCoupon(Coupon coupon);

    /**
     * that method returns all Coupons of selected Company by Company id
     *
     * @param id -- Company id Coupons to get
     * @return -- list of Coupons, if existing.
     */

    Optional<List<Coupon>> getAllCompanyCoupons(long id);
}
