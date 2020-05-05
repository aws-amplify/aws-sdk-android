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
 * Describes the price for a Reserved Instance.
 * </p>
 */
public class PriceScheduleSpecification implements Serializable {
    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time,
     * the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     */
    private String currencyCode;

    /**
     * <p>
     * The fixed price for the term.
     * </p>
     */
    private Double price;

    /**
     * <p>
     * The number of months remaining in the reservation. For example, 2 is the
     * second to the last month before the capacity reservation expires.
     * </p>
     */
    private Long term;

    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time,
     * the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return <p>
     *         The currency for transacting the Reserved Instance resale. At
     *         this time, the only supported currency is <code>USD</code>.
     *         </p>
     * @see CurrencyCodeValues
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time,
     * the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency for transacting the Reserved Instance resale. At
     *            this time, the only supported currency is <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time,
     * the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency for transacting the Reserved Instance resale. At
     *            this time, the only supported currency is <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public PriceScheduleSpecification withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time,
     * the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency for transacting the Reserved Instance resale. At
     *            this time, the only supported currency is <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }

    /**
     * <p>
     * The currency for transacting the Reserved Instance resale. At this time,
     * the only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency for transacting the Reserved Instance resale. At
     *            this time, the only supported currency is <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public PriceScheduleSpecification withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The fixed price for the term.
     * </p>
     *
     * @return <p>
     *         The fixed price for the term.
     *         </p>
     */
    public Double getPrice() {
        return price;
    }

    /**
     * <p>
     * The fixed price for the term.
     * </p>
     *
     * @param price <p>
     *            The fixed price for the term.
     *            </p>
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * <p>
     * The fixed price for the term.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param price <p>
     *            The fixed price for the term.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PriceScheduleSpecification withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * <p>
     * The number of months remaining in the reservation. For example, 2 is the
     * second to the last month before the capacity reservation expires.
     * </p>
     *
     * @return <p>
     *         The number of months remaining in the reservation. For example, 2
     *         is the second to the last month before the capacity reservation
     *         expires.
     *         </p>
     */
    public Long getTerm() {
        return term;
    }

    /**
     * <p>
     * The number of months remaining in the reservation. For example, 2 is the
     * second to the last month before the capacity reservation expires.
     * </p>
     *
     * @param term <p>
     *            The number of months remaining in the reservation. For
     *            example, 2 is the second to the last month before the capacity
     *            reservation expires.
     *            </p>
     */
    public void setTerm(Long term) {
        this.term = term;
    }

    /**
     * <p>
     * The number of months remaining in the reservation. For example, 2 is the
     * second to the last month before the capacity reservation expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param term <p>
     *            The number of months remaining in the reservation. For
     *            example, 2 is the second to the last month before the capacity
     *            reservation expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PriceScheduleSpecification withTerm(Long term) {
        this.term = term;
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
        if (getPrice() != null)
            sb.append("Price: " + getPrice() + ",");
        if (getTerm() != null)
            sb.append("Term: " + getTerm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getTerm() == null) ? 0 : getTerm().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PriceScheduleSpecification == false)
            return false;
        PriceScheduleSpecification other = (PriceScheduleSpecification) obj;

        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getTerm() == null ^ this.getTerm() == null)
            return false;
        if (other.getTerm() != null && other.getTerm().equals(this.getTerm()) == false)
            return false;
        return true;
    }
}
