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
 * Purchase a reservation with configurations that match those of your Dedicated
 * Host. You must have active Dedicated Hosts in your account before you
 * purchase a reservation. This action results in the specified reservation
 * being purchased and charged to your account.
 * </p>
 */
public class PurchaseHostReservationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code>,
     * <code>LimitPrice</code>, and <code>totalHourlyPrice</code> amounts are
     * specified. At this time, the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     */
    private String currencyCode;

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation will be
     * associated.
     * </p>
     */
    private java.util.List<String> hostIdSet;

    /**
     * <p>
     * The specified limit is checked against the total upfront cost of the
     * reservation (calculated as the offering's upfront cost multiplied by the
     * host count). If the total upfront cost is greater than the specified
     * price limit, the request fails. This is used to ensure that the purchase
     * does not exceed the expected upfront cost of the purchase. At this time,
     * the only supported currency is <code>USD</code>. For example, to indicate
     * a limit price of USD 100, specify 100.00.
     * </p>
     */
    private String limitPrice;

    /**
     * <p>
     * The ID of the offering.
     * </p>
     */
    private String offeringId;

    /**
     * <p>
     * The tags to apply to the Dedicated Host Reservation during purchase.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseHostReservationRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code>,
     * <code>LimitPrice</code>, and <code>totalHourlyPrice</code> amounts are
     * specified. At this time, the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return <p>
     *         The currency in which the <code>totalUpfrontPrice</code>,
     *         <code>LimitPrice</code>, and <code>totalHourlyPrice</code>
     *         amounts are specified. At this time, the only supported currency
     *         is <code>USD</code>.
     *         </p>
     * @see CurrencyCodeValues
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code>,
     * <code>LimitPrice</code>, and <code>totalHourlyPrice</code> amounts are
     * specified. At this time, the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>totalUpfrontPrice</code>,
     *            <code>LimitPrice</code>, and <code>totalHourlyPrice</code>
     *            amounts are specified. At this time, the only supported
     *            currency is <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code>,
     * <code>LimitPrice</code>, and <code>totalHourlyPrice</code> amounts are
     * specified. At this time, the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>totalUpfrontPrice</code>,
     *            <code>LimitPrice</code>, and <code>totalHourlyPrice</code>
     *            amounts are specified. At this time, the only supported
     *            currency is <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public PurchaseHostReservationRequest withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code>,
     * <code>LimitPrice</code>, and <code>totalHourlyPrice</code> amounts are
     * specified. At this time, the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>totalUpfrontPrice</code>,
     *            <code>LimitPrice</code>, and <code>totalHourlyPrice</code>
     *            amounts are specified. At this time, the only supported
     *            currency is <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code>,
     * <code>LimitPrice</code>, and <code>totalHourlyPrice</code> amounts are
     * specified. At this time, the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>totalUpfrontPrice</code>,
     *            <code>LimitPrice</code>, and <code>totalHourlyPrice</code>
     *            amounts are specified. At this time, the only supported
     *            currency is <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public PurchaseHostReservationRequest withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation will be
     * associated.
     * </p>
     *
     * @return <p>
     *         The IDs of the Dedicated Hosts with which the reservation will be
     *         associated.
     *         </p>
     */
    public java.util.List<String> getHostIdSet() {
        return hostIdSet;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation will be
     * associated.
     * </p>
     *
     * @param hostIdSet <p>
     *            The IDs of the Dedicated Hosts with which the reservation will
     *            be associated.
     *            </p>
     */
    public void setHostIdSet(java.util.Collection<String> hostIdSet) {
        if (hostIdSet == null) {
            this.hostIdSet = null;
            return;
        }

        this.hostIdSet = new java.util.ArrayList<String>(hostIdSet);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation will be
     * associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIdSet <p>
     *            The IDs of the Dedicated Hosts with which the reservation will
     *            be associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseHostReservationRequest withHostIdSet(String... hostIdSet) {
        if (getHostIdSet() == null) {
            this.hostIdSet = new java.util.ArrayList<String>(hostIdSet.length);
        }
        for (String value : hostIdSet) {
            this.hostIdSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation will be
     * associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIdSet <p>
     *            The IDs of the Dedicated Hosts with which the reservation will
     *            be associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseHostReservationRequest withHostIdSet(java.util.Collection<String> hostIdSet) {
        setHostIdSet(hostIdSet);
        return this;
    }

    /**
     * <p>
     * The specified limit is checked against the total upfront cost of the
     * reservation (calculated as the offering's upfront cost multiplied by the
     * host count). If the total upfront cost is greater than the specified
     * price limit, the request fails. This is used to ensure that the purchase
     * does not exceed the expected upfront cost of the purchase. At this time,
     * the only supported currency is <code>USD</code>. For example, to indicate
     * a limit price of USD 100, specify 100.00.
     * </p>
     *
     * @return <p>
     *         The specified limit is checked against the total upfront cost of
     *         the reservation (calculated as the offering's upfront cost
     *         multiplied by the host count). If the total upfront cost is
     *         greater than the specified price limit, the request fails. This
     *         is used to ensure that the purchase does not exceed the expected
     *         upfront cost of the purchase. At this time, the only supported
     *         currency is <code>USD</code>. For example, to indicate a limit
     *         price of USD 100, specify 100.00.
     *         </p>
     */
    public String getLimitPrice() {
        return limitPrice;
    }

    /**
     * <p>
     * The specified limit is checked against the total upfront cost of the
     * reservation (calculated as the offering's upfront cost multiplied by the
     * host count). If the total upfront cost is greater than the specified
     * price limit, the request fails. This is used to ensure that the purchase
     * does not exceed the expected upfront cost of the purchase. At this time,
     * the only supported currency is <code>USD</code>. For example, to indicate
     * a limit price of USD 100, specify 100.00.
     * </p>
     *
     * @param limitPrice <p>
     *            The specified limit is checked against the total upfront cost
     *            of the reservation (calculated as the offering's upfront cost
     *            multiplied by the host count). If the total upfront cost is
     *            greater than the specified price limit, the request fails.
     *            This is used to ensure that the purchase does not exceed the
     *            expected upfront cost of the purchase. At this time, the only
     *            supported currency is <code>USD</code>. For example, to
     *            indicate a limit price of USD 100, specify 100.00.
     *            </p>
     */
    public void setLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
    }

    /**
     * <p>
     * The specified limit is checked against the total upfront cost of the
     * reservation (calculated as the offering's upfront cost multiplied by the
     * host count). If the total upfront cost is greater than the specified
     * price limit, the request fails. This is used to ensure that the purchase
     * does not exceed the expected upfront cost of the purchase. At this time,
     * the only supported currency is <code>USD</code>. For example, to indicate
     * a limit price of USD 100, specify 100.00.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limitPrice <p>
     *            The specified limit is checked against the total upfront cost
     *            of the reservation (calculated as the offering's upfront cost
     *            multiplied by the host count). If the total upfront cost is
     *            greater than the specified price limit, the request fails.
     *            This is used to ensure that the purchase does not exceed the
     *            expected upfront cost of the purchase. At this time, the only
     *            supported currency is <code>USD</code>. For example, to
     *            indicate a limit price of USD 100, specify 100.00.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseHostReservationRequest withLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
        return this;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     *
     * @return <p>
     *         The ID of the offering.
     *         </p>
     */
    public String getOfferingId() {
        return offeringId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     *
     * @param offeringId <p>
     *            The ID of the offering.
     *            </p>
     */
    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringId <p>
     *            The ID of the offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseHostReservationRequest withOfferingId(String offeringId) {
        this.offeringId = offeringId;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host Reservation during purchase.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the Dedicated Host Reservation during
     *         purchase.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host Reservation during purchase.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Dedicated Host Reservation during
     *            purchase.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host Reservation during purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Dedicated Host Reservation during
     *            purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseHostReservationRequest withTagSpecifications(
            TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host Reservation during purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Dedicated Host Reservation during
     *            purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseHostReservationRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getHostIdSet() != null)
            sb.append("HostIdSet: " + getHostIdSet() + ",");
        if (getLimitPrice() != null)
            sb.append("LimitPrice: " + getLimitPrice() + ",");
        if (getOfferingId() != null)
            sb.append("OfferingId: " + getOfferingId() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications());
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
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getHostIdSet() == null) ? 0 : getHostIdSet().hashCode());
        hashCode = prime * hashCode + ((getLimitPrice() == null) ? 0 : getLimitPrice().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseHostReservationRequest == false)
            return false;
        PurchaseHostReservationRequest other = (PurchaseHostReservationRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getHostIdSet() == null ^ this.getHostIdSet() == null)
            return false;
        if (other.getHostIdSet() != null
                && other.getHostIdSet().equals(this.getHostIdSet()) == false)
            return false;
        if (other.getLimitPrice() == null ^ this.getLimitPrice() == null)
            return false;
        if (other.getLimitPrice() != null
                && other.getLimitPrice().equals(this.getLimitPrice()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null
                && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }
}
