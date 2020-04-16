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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an amount of money in United States dollars/
 * </p>
 */
public class USD implements Serializable {
    /**
     * <p>
     * The whole number of dollars in the amount.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2<br/>
     */
    private Integer dollars;

    /**
     * <p>
     * The fractional portion, in cents, of the amount.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 99<br/>
     */
    private Integer cents;

    /**
     * <p>
     * Fractions of a cent, in tenths.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9<br/>
     */
    private Integer tenthFractionsOfACent;

    /**
     * <p>
     * The whole number of dollars in the amount.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2<br/>
     *
     * @return <p>
     *         The whole number of dollars in the amount.
     *         </p>
     */
    public Integer getDollars() {
        return dollars;
    }

    /**
     * <p>
     * The whole number of dollars in the amount.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2<br/>
     *
     * @param dollars <p>
     *            The whole number of dollars in the amount.
     *            </p>
     */
    public void setDollars(Integer dollars) {
        this.dollars = dollars;
    }

    /**
     * <p>
     * The whole number of dollars in the amount.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2<br/>
     *
     * @param dollars <p>
     *            The whole number of dollars in the amount.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public USD withDollars(Integer dollars) {
        this.dollars = dollars;
        return this;
    }

    /**
     * <p>
     * The fractional portion, in cents, of the amount.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 99<br/>
     *
     * @return <p>
     *         The fractional portion, in cents, of the amount.
     *         </p>
     */
    public Integer getCents() {
        return cents;
    }

    /**
     * <p>
     * The fractional portion, in cents, of the amount.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 99<br/>
     *
     * @param cents <p>
     *            The fractional portion, in cents, of the amount.
     *            </p>
     */
    public void setCents(Integer cents) {
        this.cents = cents;
    }

    /**
     * <p>
     * The fractional portion, in cents, of the amount.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 99<br/>
     *
     * @param cents <p>
     *            The fractional portion, in cents, of the amount.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public USD withCents(Integer cents) {
        this.cents = cents;
        return this;
    }

    /**
     * <p>
     * Fractions of a cent, in tenths.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9<br/>
     *
     * @return <p>
     *         Fractions of a cent, in tenths.
     *         </p>
     */
    public Integer getTenthFractionsOfACent() {
        return tenthFractionsOfACent;
    }

    /**
     * <p>
     * Fractions of a cent, in tenths.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9<br/>
     *
     * @param tenthFractionsOfACent <p>
     *            Fractions of a cent, in tenths.
     *            </p>
     */
    public void setTenthFractionsOfACent(Integer tenthFractionsOfACent) {
        this.tenthFractionsOfACent = tenthFractionsOfACent;
    }

    /**
     * <p>
     * Fractions of a cent, in tenths.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9<br/>
     *
     * @param tenthFractionsOfACent <p>
     *            Fractions of a cent, in tenths.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public USD withTenthFractionsOfACent(Integer tenthFractionsOfACent) {
        this.tenthFractionsOfACent = tenthFractionsOfACent;
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
        if (getDollars() != null)
            sb.append("Dollars: " + getDollars() + ",");
        if (getCents() != null)
            sb.append("Cents: " + getCents() + ",");
        if (getTenthFractionsOfACent() != null)
            sb.append("TenthFractionsOfACent: " + getTenthFractionsOfACent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDollars() == null) ? 0 : getDollars().hashCode());
        hashCode = prime * hashCode + ((getCents() == null) ? 0 : getCents().hashCode());
        hashCode = prime
                * hashCode
                + ((getTenthFractionsOfACent() == null) ? 0 : getTenthFractionsOfACent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof USD == false)
            return false;
        USD other = (USD) obj;

        if (other.getDollars() == null ^ this.getDollars() == null)
            return false;
        if (other.getDollars() != null && other.getDollars().equals(this.getDollars()) == false)
            return false;
        if (other.getCents() == null ^ this.getCents() == null)
            return false;
        if (other.getCents() != null && other.getCents().equals(this.getCents()) == false)
            return false;
        if (other.getTenthFractionsOfACent() == null ^ this.getTenthFractionsOfACent() == null)
            return false;
        if (other.getTenthFractionsOfACent() != null
                && other.getTenthFractionsOfACent().equals(this.getTenthFractionsOfACent()) == false)
            return false;
        return true;
    }
}
