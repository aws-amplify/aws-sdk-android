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
 * Creates a listing for Amazon EC2 Standard Reserved Instances to be sold in
 * the Reserved Instance Marketplace. You can submit one Standard Reserved
 * Instance listing at a time. To get a list of your Standard Reserved
 * Instances, you can use the <a>DescribeReservedInstances</a> operation.
 * </p>
 * <note>
 * <p>
 * Only Standard Reserved Instances can be sold in the Reserved Instance
 * Marketplace. Convertible Reserved Instances cannot be sold.
 * </p>
 * </note>
 * <p>
 * The Reserved Instance Marketplace matches sellers who want to resell Standard
 * Reserved Instance capacity that they no longer need with buyers who want to
 * purchase additional capacity. Reserved Instances bought and sold through the
 * Reserved Instance Marketplace work like any other Reserved Instances.
 * </p>
 * <p>
 * To sell your Standard Reserved Instances, you must first register as a seller
 * in the Reserved Instance Marketplace. After completing the registration
 * process, you can create a Reserved Instance Marketplace listing of some or
 * all of your Standard Reserved Instances, and specify the upfront price to
 * receive for them. Your Standard Reserved Instance listings then become
 * available for purchase. To view the details of your Standard Reserved
 * Instance listing, you can use the <a>DescribeReservedInstancesListings</a>
 * operation.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"
 * >Reserved Instance Marketplace</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 */
public class CreateReservedInstancesListingRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * your listings. This helps avoid duplicate listings. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The number of instances that are a part of a Reserved Instance account to
     * be listed in the Reserved Instance Marketplace. This number should be
     * less than or equal to the instance count associated with the Reserved
     * Instance ID specified in this call.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * A list specifying the price of the Standard Reserved Instance for each
     * month remaining in the Reserved Instance term.
     * </p>
     */
    private java.util.List<PriceScheduleSpecification> priceSchedules;

    /**
     * <p>
     * The ID of the active Standard Reserved Instance.
     * </p>
     */
    private String reservedInstancesId;

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * your listings. This helps avoid duplicate listings. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier you provide to ensure
     *         idempotency of your listings. This helps avoid duplicate
     *         listings. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >Ensuring Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * your listings. This helps avoid duplicate listings. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier you provide to ensure
     *            idempotency of your listings. This helps avoid duplicate
     *            listings. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * your listings. This helps avoid duplicate listings. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier you provide to ensure
     *            idempotency of your listings. This helps avoid duplicate
     *            listings. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReservedInstancesListingRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The number of instances that are a part of a Reserved Instance account to
     * be listed in the Reserved Instance Marketplace. This number should be
     * less than or equal to the instance count associated with the Reserved
     * Instance ID specified in this call.
     * </p>
     *
     * @return <p>
     *         The number of instances that are a part of a Reserved Instance
     *         account to be listed in the Reserved Instance Marketplace. This
     *         number should be less than or equal to the instance count
     *         associated with the Reserved Instance ID specified in this call.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of instances that are a part of a Reserved Instance account to
     * be listed in the Reserved Instance Marketplace. This number should be
     * less than or equal to the instance count associated with the Reserved
     * Instance ID specified in this call.
     * </p>
     *
     * @param instanceCount <p>
     *            The number of instances that are a part of a Reserved Instance
     *            account to be listed in the Reserved Instance Marketplace.
     *            This number should be less than or equal to the instance count
     *            associated with the Reserved Instance ID specified in this
     *            call.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances that are a part of a Reserved Instance account to
     * be listed in the Reserved Instance Marketplace. This number should be
     * less than or equal to the instance count associated with the Reserved
     * Instance ID specified in this call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of instances that are a part of a Reserved Instance
     *            account to be listed in the Reserved Instance Marketplace.
     *            This number should be less than or equal to the instance count
     *            associated with the Reserved Instance ID specified in this
     *            call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReservedInstancesListingRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * A list specifying the price of the Standard Reserved Instance for each
     * month remaining in the Reserved Instance term.
     * </p>
     *
     * @return <p>
     *         A list specifying the price of the Standard Reserved Instance for
     *         each month remaining in the Reserved Instance term.
     *         </p>
     */
    public java.util.List<PriceScheduleSpecification> getPriceSchedules() {
        return priceSchedules;
    }

    /**
     * <p>
     * A list specifying the price of the Standard Reserved Instance for each
     * month remaining in the Reserved Instance term.
     * </p>
     *
     * @param priceSchedules <p>
     *            A list specifying the price of the Standard Reserved Instance
     *            for each month remaining in the Reserved Instance term.
     *            </p>
     */
    public void setPriceSchedules(java.util.Collection<PriceScheduleSpecification> priceSchedules) {
        if (priceSchedules == null) {
            this.priceSchedules = null;
            return;
        }

        this.priceSchedules = new java.util.ArrayList<PriceScheduleSpecification>(priceSchedules);
    }

    /**
     * <p>
     * A list specifying the price of the Standard Reserved Instance for each
     * month remaining in the Reserved Instance term.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param priceSchedules <p>
     *            A list specifying the price of the Standard Reserved Instance
     *            for each month remaining in the Reserved Instance term.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReservedInstancesListingRequest withPriceSchedules(
            PriceScheduleSpecification... priceSchedules) {
        if (getPriceSchedules() == null) {
            this.priceSchedules = new java.util.ArrayList<PriceScheduleSpecification>(
                    priceSchedules.length);
        }
        for (PriceScheduleSpecification value : priceSchedules) {
            this.priceSchedules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list specifying the price of the Standard Reserved Instance for each
     * month remaining in the Reserved Instance term.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param priceSchedules <p>
     *            A list specifying the price of the Standard Reserved Instance
     *            for each month remaining in the Reserved Instance term.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReservedInstancesListingRequest withPriceSchedules(
            java.util.Collection<PriceScheduleSpecification> priceSchedules) {
        setPriceSchedules(priceSchedules);
        return this;
    }

    /**
     * <p>
     * The ID of the active Standard Reserved Instance.
     * </p>
     *
     * @return <p>
     *         The ID of the active Standard Reserved Instance.
     *         </p>
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the active Standard Reserved Instance.
     * </p>
     *
     * @param reservedInstancesId <p>
     *            The ID of the active Standard Reserved Instance.
     *            </p>
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the active Standard Reserved Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesId <p>
     *            The ID of the active Standard Reserved Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReservedInstancesListingRequest withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getPriceSchedules() != null)
            sb.append("PriceSchedules: " + getPriceSchedules() + ",");
        if (getReservedInstancesId() != null)
            sb.append("ReservedInstancesId: " + getReservedInstancesId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getPriceSchedules() == null) ? 0 : getPriceSchedules().hashCode());
        hashCode = prime * hashCode
                + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReservedInstancesListingRequest == false)
            return false;
        CreateReservedInstancesListingRequest other = (CreateReservedInstancesListingRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getPriceSchedules() == null ^ this.getPriceSchedules() == null)
            return false;
        if (other.getPriceSchedules() != null
                && other.getPriceSchedules().equals(this.getPriceSchedules()) == false)
            return false;
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null)
            return false;
        if (other.getReservedInstancesId() != null
                && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false)
            return false;
        return true;
    }
}
