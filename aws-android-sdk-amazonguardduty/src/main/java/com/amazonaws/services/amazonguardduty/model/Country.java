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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the country where the remote IP address is
 * located.
 * </p>
 */
public class Country implements Serializable {
    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     */
    private String countryCode;

    /**
     * <p>
     * The country name of the remote IP address.
     * </p>
     */
    private String countryName;

    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     *
     * @return <p>
     *         The country code of the remote IP address.
     *         </p>
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     *
     * @param countryCode <p>
     *            The country code of the remote IP address.
     *            </p>
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param countryCode <p>
     *            The country code of the remote IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Country withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * <p>
     * The country name of the remote IP address.
     * </p>
     *
     * @return <p>
     *         The country name of the remote IP address.
     *         </p>
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * <p>
     * The country name of the remote IP address.
     * </p>
     *
     * @param countryName <p>
     *            The country name of the remote IP address.
     *            </p>
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * <p>
     * The country name of the remote IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param countryName <p>
     *            The country name of the remote IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Country withCountryName(String countryName) {
        this.countryName = countryName;
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
        if (getCountryCode() != null)
            sb.append("CountryCode: " + getCountryCode() + ",");
        if (getCountryName() != null)
            sb.append("CountryName: " + getCountryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode
                + ((getCountryName() == null) ? 0 : getCountryName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Country == false)
            return false;
        Country other = (Country) obj;

        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null
                && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getCountryName() == null ^ this.getCountryName() == null)
            return false;
        if (other.getCountryName() != null
                && other.getCountryName().equals(this.getCountryName()) == false)
            return false;
        return true;
    }
}
