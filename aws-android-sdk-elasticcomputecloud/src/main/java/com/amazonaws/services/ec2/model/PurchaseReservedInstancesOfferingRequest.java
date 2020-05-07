/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Purchases a Reserved Instance for use with your account. With Reserved
 * Instances, you pay a lower hourly rate compared to On-Demand instance
 * pricing.
 * </p>
 * <p>
 * Use <a>DescribeReservedInstancesOfferings</a> to get a list of Reserved
 * Instance offerings that match your specifications. After you've purchased a
 * Reserved Instance, you can check for your new Reserved Instance with
 * <a>DescribeReservedInstances</a>.
 * </p>
 * <p>
 * To queue a purchase for a future date and time, specify a purchase time. If
 * you do not specify a purchase time, the default is the current time.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"
 * >Reserved Instances</a> and <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"
 * >Reserved Instance Marketplace</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 */
public class PurchaseReservedInstancesOfferingRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The number of Reserved Instances to purchase.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The ID of the Reserved Instance offering to purchase.
     * </p>
     */
    private String reservedInstancesOfferingId;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Specified for Reserved Instance Marketplace offerings to limit the total
     * order and ensure that the Reserved Instances are not purchased at
     * unexpected prices.
     * </p>
     */
    private ReservedInstanceLimitPrice limitPrice;

    /**
     * <p>
     * The time at which to purchase the Reserved Instance, in UTC format (for
     * example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date purchaseTime;

    /**
     * <p>
     * The number of Reserved Instances to purchase.
     * </p>
     *
     * @return <p>
     *         The number of Reserved Instances to purchase.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of Reserved Instances to purchase.
     * </p>
     *
     * @param instanceCount <p>
     *            The number of Reserved Instances to purchase.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of Reserved Instances to purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of Reserved Instances to purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedInstancesOfferingRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering to purchase.
     * </p>
     *
     * @return <p>
     *         The ID of the Reserved Instance offering to purchase.
     *         </p>
     */
    public String getReservedInstancesOfferingId() {
        return reservedInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering to purchase.
     * </p>
     *
     * @param reservedInstancesOfferingId <p>
     *            The ID of the Reserved Instance offering to purchase.
     *            </p>
     */
    public void setReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering to purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesOfferingId <p>
     *            The ID of the Reserved Instance offering to purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedInstancesOfferingRequest withReservedInstancesOfferingId(
            String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedInstancesOfferingRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Specified for Reserved Instance Marketplace offerings to limit the total
     * order and ensure that the Reserved Instances are not purchased at
     * unexpected prices.
     * </p>
     *
     * @return <p>
     *         Specified for Reserved Instance Marketplace offerings to limit
     *         the total order and ensure that the Reserved Instances are not
     *         purchased at unexpected prices.
     *         </p>
     */
    public ReservedInstanceLimitPrice getLimitPrice() {
        return limitPrice;
    }

    /**
     * <p>
     * Specified for Reserved Instance Marketplace offerings to limit the total
     * order and ensure that the Reserved Instances are not purchased at
     * unexpected prices.
     * </p>
     *
     * @param limitPrice <p>
     *            Specified for Reserved Instance Marketplace offerings to limit
     *            the total order and ensure that the Reserved Instances are not
     *            purchased at unexpected prices.
     *            </p>
     */
    public void setLimitPrice(ReservedInstanceLimitPrice limitPrice) {
        this.limitPrice = limitPrice;
    }

    /**
     * <p>
     * Specified for Reserved Instance Marketplace offerings to limit the total
     * order and ensure that the Reserved Instances are not purchased at
     * unexpected prices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limitPrice <p>
     *            Specified for Reserved Instance Marketplace offerings to limit
     *            the total order and ensure that the Reserved Instances are not
     *            purchased at unexpected prices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedInstancesOfferingRequest withLimitPrice(
            ReservedInstanceLimitPrice limitPrice) {
        this.limitPrice = limitPrice;
        return this;
    }

    /**
     * <p>
     * The time at which to purchase the Reserved Instance, in UTC format (for
     * example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @return <p>
     *         The time at which to purchase the Reserved Instance, in UTC
     *         format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         </p>
     */
    public java.util.Date getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * <p>
     * The time at which to purchase the Reserved Instance, in UTC format (for
     * example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @param purchaseTime <p>
     *            The time at which to purchase the Reserved Instance, in UTC
     *            format (for example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:
     *            <i>MM</i>:<i>SS</i>Z).
     *            </p>
     */
    public void setPurchaseTime(java.util.Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    /**
     * <p>
     * The time at which to purchase the Reserved Instance, in UTC format (for
     * example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param purchaseTime <p>
     *            The time at which to purchase the Reserved Instance, in UTC
     *            format (for example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:
     *            <i>MM</i>:<i>SS</i>Z).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedInstancesOfferingRequest withPurchaseTime(java.util.Date purchaseTime) {
        this.purchaseTime = purchaseTime;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getReservedInstancesOfferingId() != null)
            sb.append("ReservedInstancesOfferingId: " + getReservedInstancesOfferingId() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getLimitPrice() != null)
            sb.append("LimitPrice: " + getLimitPrice() + ",");
        if (getPurchaseTime() != null)
            sb.append("PurchaseTime: " + getPurchaseTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedInstancesOfferingId() == null) ? 0
                        : getReservedInstancesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getLimitPrice() == null) ? 0 : getLimitPrice().hashCode());
        hashCode = prime * hashCode
                + ((getPurchaseTime() == null) ? 0 : getPurchaseTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedInstancesOfferingRequest == false)
            return false;
        PurchaseReservedInstancesOfferingRequest other = (PurchaseReservedInstancesOfferingRequest) obj;

        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getReservedInstancesOfferingId() == null
                ^ this.getReservedInstancesOfferingId() == null)
            return false;
        if (other.getReservedInstancesOfferingId() != null
                && other.getReservedInstancesOfferingId().equals(
                        this.getReservedInstancesOfferingId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getLimitPrice() == null ^ this.getLimitPrice() == null)
            return false;
        if (other.getLimitPrice() != null
                && other.getLimitPrice().equals(this.getLimitPrice()) == false)
            return false;
        if (other.getPurchaseTime() == null ^ this.getPurchaseTime() == null)
            return false;
        if (other.getPurchaseTime() != null
                && other.getPurchaseTime().equals(this.getPurchaseTime()) == false)
            return false;
        return true;
    }
}
