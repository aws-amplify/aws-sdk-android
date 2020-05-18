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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The country and area code for a proxy phone number in a proxy phone session.
 * </p>
 */
public class GeoMatchParams implements Serializable {
    /**
     * <p>
     * The country.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[A-Z]{2,2}$<br/>
     */
    private String country;

    /**
     * <p>
     * The area code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[0-9]{3,3}$<br/>
     */
    private String areaCode;

    /**
     * <p>
     * The country.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[A-Z]{2,2}$<br/>
     *
     * @return <p>
     *         The country.
     *         </p>
     */
    public String getCountry() {
        return country;
    }

    /**
     * <p>
     * The country.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[A-Z]{2,2}$<br/>
     *
     * @param country <p>
     *            The country.
     *            </p>
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[A-Z]{2,2}$<br/>
     *
     * @param country <p>
     *            The country.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoMatchParams withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * <p>
     * The area code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[0-9]{3,3}$<br/>
     *
     * @return <p>
     *         The area code.
     *         </p>
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * <p>
     * The area code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[0-9]{3,3}$<br/>
     *
     * @param areaCode <p>
     *            The area code.
     *            </p>
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * <p>
     * The area code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[0-9]{3,3}$<br/>
     *
     * @param areaCode <p>
     *            The area code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoMatchParams withAreaCode(String areaCode) {
        this.areaCode = areaCode;
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
        if (getCountry() != null)
            sb.append("Country: " + getCountry() + ",");
        if (getAreaCode() != null)
            sb.append("AreaCode: " + getAreaCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoMatchParams == false)
            return false;
        GeoMatchParams other = (GeoMatchParams) obj;

        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getAreaCode() == null ^ this.getAreaCode() == null)
            return false;
        if (other.getAreaCode() != null && other.getAreaCode().equals(this.getAreaCode()) == false)
            return false;
        return true;
    }
}
