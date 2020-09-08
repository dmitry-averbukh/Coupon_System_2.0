package com.jb.Coupon_System_20.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jb.Coupon_System_20.data.entity.Company;
import com.jb.Coupon_System_20.data.entity.Coupon;

import java.util.List;
import java.util.Optional;

/**
 * CompanyService interface describes methods that Company service should implement
 */

public interface CompanyService {

    /**
     * that method should update Coupon based on coupon transmitted as parameter
     * @param coupon -- coupon with information to update;
     * @return updated Coupon, if existing.
     */

    void updateCoupon(Coupon coupon) throws JsonProcessingException;

    /**
     * that method simply adds new coupon.
     * @param coupon -- coupon to add.
     * @return Coupon that have bean added.
     */

    Optional<Coupon> addCoupon(Coupon coupon);

    /**
     * that method deletes Coupon by provided id.
     * @param id -- id of coupon to delete.
     * @return Coupon that was deleted, if existing.
     */

    Optional<Coupon> removeCoupon(long id);

    /**
     * that method checks if Coupon exist by provided id
     * @param id -- id of Coupon to check.
     * @return boolean.
     */

    Boolean couponCheck(long id);

    /**
     * that method checks if Coupon belongs to Company.
     * @param couponId -- id of Coupon to check.
     * @param companyId -- id of Company to check.
     * @return boolean.
     */

    Boolean companyCouponCheck(long couponId, long companyId);

    /**
     * that method searching for Coupon.
     * @param id -- id of Coupon to find.
     * @return Coupon, if existing.
     */

    Optional<Coupon> getCouponById(long id);

    /**
     * that method returns all Coupons of selected Company by Company id
     * @param id -- Company id Coupons to get
     * @return -- list of Coupons, if existing.
     */

    Optional<List<Coupon>> getAllCompanyCoupons(long id);

    /**
     * that method searching for Company
     * @param email -- Company email.
     * @param password -- Company password.
     * @return Company, if existing.
     */

    Optional<Company> getCompanyByEmailAndPassword(String email, String password);

    /**
     * that method returns Company by id;
     * @param id -- id of Company to return;
     * @return Company, if existing.
     */

    Company getCompanyById(long id);


}
