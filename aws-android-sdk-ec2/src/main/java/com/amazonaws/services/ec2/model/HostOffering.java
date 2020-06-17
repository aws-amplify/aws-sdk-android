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

/**
 * <p>
 * Details about the Dedicated Host Reservation offering.
 * </p>
 */
public class HostOffering implements Serializable {
    /**
     * <p>
     * The currency of the offering.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     */
    private String currencyCode;

    /**
     * <p>
     * The duration of the offering (in seconds).
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * The hourly price of the offering.
     * </p>
     */
    private String hourlyPrice;

    /**
     * <p>
     * The instance family of the offering.
     * </p>
     */
    private String instanceFamily;

    /**
     * <p>
     * The ID of the offering.
     * </p>
     */
    private String offeringId;

    /**
     * <p>
     * The available payment option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     */
    private String paymentOption;

    /**
     * <p>
     * The upfront price of the offering. Does not apply to No Upfront
     * offerings.
     * </p>
     */
    private String upfrontPrice;

    /**
     * <p>
     * The currency of the offering.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return <p>
     *         The currency of the offering.
     *         </p>
     * @see CurrencyCodeValues
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency of the offering.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency of the offering.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency of the offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency of the offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public HostOffering withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The currency of the offering.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency of the offering.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }

    /**
     * <p>
     * The currency of the offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency of the offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public HostOffering withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The duration of the offering (in seconds).
     * </p>
     *
     * @return <p>
     *         The duration of the offering (in seconds).
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration of the offering (in seconds).
     * </p>
     *
     * @param duration <p>
     *            The duration of the offering (in seconds).
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the offering (in seconds).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration of the offering (in seconds).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostOffering withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The hourly price of the offering.
     * </p>
     *
     * @return <p>
     *         The hourly price of the offering.
     *         </p>
     */
    public String getHourlyPrice() {
        return hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the offering.
     * </p>
     *
     * @param hourlyPrice <p>
     *            The hourly price of the offering.
     *            </p>
     */
    public void setHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hourlyPrice <p>
     *            The hourly price of the offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostOffering withHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
        return this;
    }

    /**
     * <p>
     * The instance family of the offering.
     * </p>
     *
     * @return <p>
     *         The instance family of the offering.
     *         </p>
     */
    public String getInstanceFamily() {
        return instanceFamily;
    }

    /**
     * <p>
     * The instance family of the offering.
     * </p>
     *
     * @param instanceFamily <p>
     *            The instance family of the offering.
     *            </p>
     */
    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family of the offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFamily <p>
     *            The instance family of the offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostOffering withInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
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
    public HostOffering withOfferingId(String offeringId) {
        this.offeringId = offeringId;
        return this;
    }

    /**
     * <p>
     * The available payment option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @return <p>
     *         The available payment option.
     *         </p>
     * @see PaymentOption
     */
    public String getPaymentOption() {
        return paymentOption;
    }

    /**
     * <p>
     * The available payment option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The available payment option.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The available payment option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The available payment option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public HostOffering withPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
        return this;
    }

    /**
     * <p>
     * The available payment option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The available payment option.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
    }

    /**
     * <p>
     * The available payment option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The available payment option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public HostOffering withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The upfront price of the offering. Does not apply to No Upfront
     * offerings.
     * </p>
     *
     * @return <p>
     *         The upfront price of the offering. Does not apply to No Upfront
     *         offerings.
     *         </p>
     */
    public String getUpfrontPrice() {
        return upfrontPrice;
    }

    /**
     * <p>
     * The upfront price of the offering. Does not apply to No Upfront
     * offerings.
     * </p>
     *
     * @param upfrontPrice <p>
     *            The upfront price of the offering. Does not apply to No
     *            Upfront offerings.
     *            </p>
     */
    public void setUpfrontPrice(String upfrontPrice) {
        this.upfrontPrice = upfrontPrice;
    }

    /**
     * <p>
     * The upfront price of the offering. Does not apply to No Upfront
     * offerings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param upfrontPrice <p>
     *            The upfront price of the offering. Does not apply to No
     *            Upfront offerings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostOffering withUpfrontPrice(String upfrontPrice) {
        this.upfrontPrice = upfrontPrice;
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
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getHourlyPrice() != null)
            sb.append("HourlyPrice: " + getHourlyPrice() + ",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: " + getInstanceFamily() + ",");
        if (getOfferingId() != null)
            sb.append("OfferingId: " + getOfferingId() + ",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: " + getPaymentOption() + ",");
        if (getUpfrontPrice() != null)
            sb.append("UpfrontPrice: " + getUpfrontPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode
                + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode
                + ((getUpfrontPrice() == null) ? 0 : getUpfrontPrice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostOffering == false)
            return false;
        HostOffering other = (HostOffering) obj;

        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getHourlyPrice() == null ^ this.getHourlyPrice() == null)
            return false;
        if (other.getHourlyPrice() != null
                && other.getHourlyPrice().equals(this.getHourlyPrice()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null
                && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null
                && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null
                && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getUpfrontPrice() == null ^ this.getUpfrontPrice() == null)
            return false;
        if (other.getUpfrontPrice() != null
                && other.getUpfrontPrice().equals(this.getUpfrontPrice()) == false)
            return false;
        return true;
    }
}
