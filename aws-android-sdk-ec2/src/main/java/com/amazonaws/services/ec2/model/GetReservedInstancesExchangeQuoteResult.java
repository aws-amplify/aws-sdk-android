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
 * Contains the output of GetReservedInstancesExchangeQuote.
 * </p>
 */
public class GetReservedInstancesExchangeQuoteResult implements Serializable {
    /**
     * <p>
     * The currency of the transaction.
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * If <code>true</code>, the exchange is valid. If <code>false</code>, the
     * exchange cannot be completed.
     * </p>
     */
    private Boolean isValidExchange;

    /**
     * <p>
     * The new end date of the reservation term.
     * </p>
     */
    private java.util.Date outputReservedInstancesWillExpireAt;

    /**
     * <p>
     * The total true upfront charge for the exchange.
     * </p>
     */
    private String paymentDue;

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     */
    private ReservationValue reservedInstanceValueRollup;

    /**
     * <p>
     * The configuration of your Convertible Reserved Instances.
     * </p>
     */
    private java.util.List<ReservedInstanceReservationValue> reservedInstanceValueSet;

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     */
    private ReservationValue targetConfigurationValueRollup;

    /**
     * <p>
     * The values of the target Convertible Reserved Instances.
     * </p>
     */
    private java.util.List<TargetReservationValue> targetConfigurationValueSet;

    /**
     * <p>
     * Describes the reason why the exchange cannot be completed.
     * </p>
     */
    private String validationFailureReason;

    /**
     * <p>
     * The currency of the transaction.
     * </p>
     *
     * @return <p>
     *         The currency of the transaction.
     *         </p>
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency of the transaction.
     * </p>
     *
     * @param currencyCode <p>
     *            The currency of the transaction.
     *            </p>
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency of the transaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currencyCode <p>
     *            The currency of the transaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedInstancesExchangeQuoteResult withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the exchange is valid. If <code>false</code>, the
     * exchange cannot be completed.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the exchange is valid. If
     *         <code>false</code>, the exchange cannot be completed.
     *         </p>
     */
    public Boolean isIsValidExchange() {
        return isValidExchange;
    }

    /**
     * <p>
     * If <code>true</code>, the exchange is valid. If <code>false</code>, the
     * exchange cannot be completed.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the exchange is valid. If
     *         <code>false</code>, the exchange cannot be completed.
     *         </p>
     */
    public Boolean getIsValidExchange() {
        return isValidExchange;
    }

    /**
     * <p>
     * If <code>true</code>, the exchange is valid. If <code>false</code>, the
     * exchange cannot be completed.
     * </p>
     *
     * @param isValidExchange <p>
     *            If <code>true</code>, the exchange is valid. If
     *            <code>false</code>, the exchange cannot be completed.
     *            </p>
     */
    public void setIsValidExchange(Boolean isValidExchange) {
        this.isValidExchange = isValidExchange;
    }

    /**
     * <p>
     * If <code>true</code>, the exchange is valid. If <code>false</code>, the
     * exchange cannot be completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isValidExchange <p>
     *            If <code>true</code>, the exchange is valid. If
     *            <code>false</code>, the exchange cannot be completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedInstancesExchangeQuoteResult withIsValidExchange(Boolean isValidExchange) {
        this.isValidExchange = isValidExchange;
        return this;
    }

    /**
     * <p>
     * The new end date of the reservation term.
     * </p>
     *
     * @return <p>
     *         The new end date of the reservation term.
     *         </p>
     */
    public java.util.Date getOutputReservedInstancesWillExpireAt() {
        return outputReservedInstancesWillExpireAt;
    }

    /**
     * <p>
     * The new end date of the reservation term.
     * </p>
     *
     * @param outputReservedInstancesWillExpireAt <p>
     *            The new end date of the reservation term.
     *            </p>
     */
    public void setOutputReservedInstancesWillExpireAt(
            java.util.Date outputReservedInstancesWillExpireAt) {
        this.outputReservedInstancesWillExpireAt = outputReservedInstancesWillExpireAt;
    }

    /**
     * <p>
     * The new end date of the reservation term.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputReservedInstancesWillExpireAt <p>
     *            The new end date of the reservation term.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedInstancesExchangeQuoteResult withOutputReservedInstancesWillExpireAt(
            java.util.Date outputReservedInstancesWillExpireAt) {
        this.outputReservedInstancesWillExpireAt = outputReservedInstancesWillExpireAt;
        return this;
    }

    /**
     * <p>
     * The total true upfront charge for the exchange.
     * </p>
     *
     * @return <p>
     *         The total true upfront charge for the exchange.
     *         </p>
     */
    public String getPaymentDue() {
        return paymentDue;
    }

    /**
     * <p>
     * The total true upfront charge for the exchange.
     * </p>
     *
     * @param paymentDue <p>
     *            The total true upfront charge for the exchange.
     *            </p>
     */
    public void setPaymentDue(String paymentDue) {
        this.paymentDue = paymentDue;
    }

    /**
     * <p>
     * The total true upfront charge for the exchange.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param paymentDue <p>
     *            The total true upfront charge for the exchange.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedInstancesExchangeQuoteResult withPaymentDue(String paymentDue) {
        this.paymentDue = paymentDue;
        return this;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     *
     * @return <p>
     *         The cost associated with the Reserved Instance.
     *         </p>
     */
    public ReservationValue getReservedInstanceValueRollup() {
        return reservedInstanceValueRollup;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     *
     * @param reservedInstanceValueRollup <p>
     *            The cost associated with the Reserved Instance.
     *            </p>
     */
    public void setReservedInstanceValueRollup(ReservationValue reservedInstanceValueRollup) {
        this.reservedInstanceValueRollup = reservedInstanceValueRollup;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstanceValueRollup <p>
     *            The cost associated with the Reserved Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedInstancesExchangeQuoteResult withReservedInstanceValueRollup(
            ReservationValue reservedInstanceValueRollup) {
        this.reservedInstanceValueRollup = reservedInstanceValueRollup;
        return this;
    }

    /**
     * <p>
     * The configuration of your Convertible Reserved Instances.
     * </p>
     *
     * @return <p>
     *         The configuration of your Convertible Reserved Instances.
     *         </p>
     */
    public java.util.List<ReservedInstanceReservationValue> getReservedInstanceValueSet() {
        return reservedInstanceValueSet;
    }

    /**
     * <p>
     * The configuration of your Convertible Reserved Instances.
     * </p>
     *
     * @param reservedInstanceValueSet <p>
     *            The configuration of your Convertible Reserved Instances.
     *            </p>
     */
    public void setReservedInstanceValueSet(
            java.util.Collection<ReservedInstanceReservationValue> reservedInstanceValueSet) {
        if (reservedInstanceValueSet == null) {
            this.reservedInstanceValueSet = null;
            return;
        }

        this.reservedInstanceValueSet = new java.util.ArrayList<ReservedInstanceReservationValue>(
                reservedInstanceValueSet);
    }

    /**
     * <p>
     * The configuration of your Convertible Reserved Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstanceValueSet <p>
     *            The configuration of your Convertible Reserved Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedInstancesExchangeQuoteResult withReservedInstanceValueSet(
            ReservedInstanceReservationValue... reservedInstanceValueSet) {
        if (getReservedInstanceValueSet() == null) {
            this.reservedInstanceValueSet = new java.util.ArrayList<ReservedInstanceReservationValue>(
                    reservedInstanceValueSet.length);
        }
        for (ReservedInstanceReservationValue value : reservedInstanceValueSet) {
            this.reservedInstanceValueSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of your Convertible Reserved Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstanceValueSet <p>
     *            The configuration of your Convertible Reserved Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedInstancesExchangeQuoteResult withReservedInstanceValueSet(
            java.util.Collection<ReservedInstanceReservationValue> reservedInstanceValueSet) {
        setReservedInstanceValueSet(reservedInstanceValueSet);
        return this;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     *
     * @return <p>
     *         The cost associated with the Reserved Instance.
     *         </p>
     */
    public ReservationValue getTargetConfigurationValueRollup() {
        return targetConfigurationValueRollup;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     *
     * @param targetConfigurationValueRollup <p>
     *            The cost associated with the Reserved Instance.
     *            </p>
     */
    public void setTargetConfigurationValueRollup(ReservationValue targetConfigurationValueRollup) {
        this.targetConfigurationValueRollup = targetConfigurationValueRollup;
    }

    /**
     * <p>
     * The cost associated with the Reserved Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetConfigurationValueRollup <p>
     *            The cost associated with the Reserved Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedInstancesExchangeQuoteResult withTargetConfigurationValueRollup(
            ReservationValue targetConfigurationValueRollup) {
        this.targetConfigurationValueRollup = targetConfigurationValueRollup;
        return this;
    }

    /**
     * <p>
     * The values of the target Convertible Reserved Instances.
     * </p>
     *
     * @return <p>
     *         The values of the target Convertible Reserved Instances.
     *         </p>
     */
    public java.util.List<TargetReservationValue> getTargetConfigurationValueSet() {
        return targetConfigurationValueSet;
    }

    /**
     * <p>
     * The values of the target Convertible Reserved Instances.
     * </p>
     *
     * @param targetConfigurationValueSet <p>
     *            The values of the target Convertible Reserved Instances.
     *            </p>
     */
    public void setTargetConfigurationValueSet(
            java.util.Collection<TargetReservationValue> targetConfigurationValueSet) {
        if (targetConfigurationValueSet == null) {
            this.targetConfigurationValueSet = null;
            return;
        }

        this.targetConfigurationValueSet = new java.util.ArrayList<TargetReservationValue>(
                targetConfigurationValueSet);
    }

    /**
     * <p>
     * The values of the target Convertible Reserved Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetConfigurationValueSet <p>
     *            The values of the target Convertible Reserved Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedInstancesExchangeQuoteResult withTargetConfigurationValueSet(
            TargetReservationValue... targetConfigurationValueSet) {
        if (getTargetConfigurationValueSet() == null) {
            this.targetConfigurationValueSet = new java.util.ArrayList<TargetReservationValue>(
                    targetConfigurationValueSet.length);
        }
        for (TargetReservationValue value : targetConfigurationValueSet) {
            this.targetConfigurationValueSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The values of the target Convertible Reserved Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetConfigurationValueSet <p>
     *            The values of the target Convertible Reserved Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedInstancesExchangeQuoteResult withTargetConfigurationValueSet(
            java.util.Collection<TargetReservationValue> targetConfigurationValueSet) {
        setTargetConfigurationValueSet(targetConfigurationValueSet);
        return this;
    }

    /**
     * <p>
     * Describes the reason why the exchange cannot be completed.
     * </p>
     *
     * @return <p>
     *         Describes the reason why the exchange cannot be completed.
     *         </p>
     */
    public String getValidationFailureReason() {
        return validationFailureReason;
    }

    /**
     * <p>
     * Describes the reason why the exchange cannot be completed.
     * </p>
     *
     * @param validationFailureReason <p>
     *            Describes the reason why the exchange cannot be completed.
     *            </p>
     */
    public void setValidationFailureReason(String validationFailureReason) {
        this.validationFailureReason = validationFailureReason;
    }

    /**
     * <p>
     * Describes the reason why the exchange cannot be completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationFailureReason <p>
     *            Describes the reason why the exchange cannot be completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedInstancesExchangeQuoteResult withValidationFailureReason(
            String validationFailureReason) {
        this.validationFailureReason = validationFailureReason;
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
        if (getIsValidExchange() != null)
            sb.append("IsValidExchange: " + getIsValidExchange() + ",");
        if (getOutputReservedInstancesWillExpireAt() != null)
            sb.append("OutputReservedInstancesWillExpireAt: "
                    + getOutputReservedInstancesWillExpireAt() + ",");
        if (getPaymentDue() != null)
            sb.append("PaymentDue: " + getPaymentDue() + ",");
        if (getReservedInstanceValueRollup() != null)
            sb.append("ReservedInstanceValueRollup: " + getReservedInstanceValueRollup() + ",");
        if (getReservedInstanceValueSet() != null)
            sb.append("ReservedInstanceValueSet: " + getReservedInstanceValueSet() + ",");
        if (getTargetConfigurationValueRollup() != null)
            sb.append("TargetConfigurationValueRollup: " + getTargetConfigurationValueRollup()
                    + ",");
        if (getTargetConfigurationValueSet() != null)
            sb.append("TargetConfigurationValueSet: " + getTargetConfigurationValueSet() + ",");
        if (getValidationFailureReason() != null)
            sb.append("ValidationFailureReason: " + getValidationFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode
                + ((getIsValidExchange() == null) ? 0 : getIsValidExchange().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputReservedInstancesWillExpireAt() == null) ? 0
                        : getOutputReservedInstancesWillExpireAt().hashCode());
        hashCode = prime * hashCode + ((getPaymentDue() == null) ? 0 : getPaymentDue().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedInstanceValueRollup() == null) ? 0
                        : getReservedInstanceValueRollup().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedInstanceValueSet() == null) ? 0 : getReservedInstanceValueSet()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetConfigurationValueRollup() == null) ? 0
                        : getTargetConfigurationValueRollup().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetConfigurationValueSet() == null) ? 0
                        : getTargetConfigurationValueSet().hashCode());
        hashCode = prime
                * hashCode
                + ((getValidationFailureReason() == null) ? 0 : getValidationFailureReason()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservedInstancesExchangeQuoteResult == false)
            return false;
        GetReservedInstancesExchangeQuoteResult other = (GetReservedInstancesExchangeQuoteResult) obj;

        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getIsValidExchange() == null ^ this.getIsValidExchange() == null)
            return false;
        if (other.getIsValidExchange() != null
                && other.getIsValidExchange().equals(this.getIsValidExchange()) == false)
            return false;
        if (other.getOutputReservedInstancesWillExpireAt() == null
                ^ this.getOutputReservedInstancesWillExpireAt() == null)
            return false;
        if (other.getOutputReservedInstancesWillExpireAt() != null
                && other.getOutputReservedInstancesWillExpireAt().equals(
                        this.getOutputReservedInstancesWillExpireAt()) == false)
            return false;
        if (other.getPaymentDue() == null ^ this.getPaymentDue() == null)
            return false;
        if (other.getPaymentDue() != null
                && other.getPaymentDue().equals(this.getPaymentDue()) == false)
            return false;
        if (other.getReservedInstanceValueRollup() == null
                ^ this.getReservedInstanceValueRollup() == null)
            return false;
        if (other.getReservedInstanceValueRollup() != null
                && other.getReservedInstanceValueRollup().equals(
                        this.getReservedInstanceValueRollup()) == false)
            return false;
        if (other.getReservedInstanceValueSet() == null
                ^ this.getReservedInstanceValueSet() == null)
            return false;
        if (other.getReservedInstanceValueSet() != null
                && other.getReservedInstanceValueSet().equals(this.getReservedInstanceValueSet()) == false)
            return false;
        if (other.getTargetConfigurationValueRollup() == null
                ^ this.getTargetConfigurationValueRollup() == null)
            return false;
        if (other.getTargetConfigurationValueRollup() != null
                && other.getTargetConfigurationValueRollup().equals(
                        this.getTargetConfigurationValueRollup()) == false)
            return false;
        if (other.getTargetConfigurationValueSet() == null
                ^ this.getTargetConfigurationValueSet() == null)
            return false;
        if (other.getTargetConfigurationValueSet() != null
                && other.getTargetConfigurationValueSet().equals(
                        this.getTargetConfigurationValueSet()) == false)
            return false;
        if (other.getValidationFailureReason() == null ^ this.getValidationFailureReason() == null)
            return false;
        if (other.getValidationFailureReason() != null
                && other.getValidationFailureReason().equals(this.getValidationFailureReason()) == false)
            return false;
        return true;
    }
}
