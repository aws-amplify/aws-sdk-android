/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

/**
 * <p>
 * A list of phone numbers and their metadata.
 * </p>
 */
public class PhoneNumberInformation implements Serializable {
    /**
     * <p>
     * The date and time when the phone number was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The phone number.
     * </p>
     */
    private String phoneNumber;

    /**
     * <p>
     * The status of the phone number.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The two-character code for the country or region, in ISO 3166-1 alpha-2
     * format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2<br/>
     * <b>Pattern: </b>^[A-Za-z]{2}$<br/>
     */
    private String iso2CountryCode;

    /**
     * <p>
     * The list of supported routes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Transactional, Promotional, Premium
     */
    private String routeType;

    /**
     * <p>
     * The capabilities of each phone number.
     * </p>
     */
    private java.util.List<String> numberCapabilities = new java.util.ArrayList<String>();

    /**
     * <p>
     * The date and time when the phone number was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the phone number was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time when the phone number was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time when the phone number was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the phone number was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time when the phone number was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberInformation withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The phone number.
     * </p>
     *
     * @return <p>
     *         The phone number.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The phone number.
     * </p>
     *
     * @param phoneNumber <p>
     *            The phone number.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumber <p>
     *            The phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberInformation withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     *
     * @return <p>
     *         The status of the phone number.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     *
     * @param status <p>
     *            The status of the phone number.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberInformation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The two-character code for the country or region, in ISO 3166-1 alpha-2
     * format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2<br/>
     * <b>Pattern: </b>^[A-Za-z]{2}$<br/>
     *
     * @return <p>
     *         The two-character code for the country or region, in ISO 3166-1
     *         alpha-2 format.
     *         </p>
     */
    public String getIso2CountryCode() {
        return iso2CountryCode;
    }

    /**
     * <p>
     * The two-character code for the country or region, in ISO 3166-1 alpha-2
     * format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2<br/>
     * <b>Pattern: </b>^[A-Za-z]{2}$<br/>
     *
     * @param iso2CountryCode <p>
     *            The two-character code for the country or region, in ISO
     *            3166-1 alpha-2 format.
     *            </p>
     */
    public void setIso2CountryCode(String iso2CountryCode) {
        this.iso2CountryCode = iso2CountryCode;
    }

    /**
     * <p>
     * The two-character code for the country or region, in ISO 3166-1 alpha-2
     * format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2<br/>
     * <b>Pattern: </b>^[A-Za-z]{2}$<br/>
     *
     * @param iso2CountryCode <p>
     *            The two-character code for the country or region, in ISO
     *            3166-1 alpha-2 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberInformation withIso2CountryCode(String iso2CountryCode) {
        this.iso2CountryCode = iso2CountryCode;
        return this;
    }

    /**
     * <p>
     * The list of supported routes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Transactional, Promotional, Premium
     *
     * @return <p>
     *         The list of supported routes.
     *         </p>
     * @see RouteType
     */
    public String getRouteType() {
        return routeType;
    }

    /**
     * <p>
     * The list of supported routes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Transactional, Promotional, Premium
     *
     * @param routeType <p>
     *            The list of supported routes.
     *            </p>
     * @see RouteType
     */
    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    /**
     * <p>
     * The list of supported routes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Transactional, Promotional, Premium
     *
     * @param routeType <p>
     *            The list of supported routes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RouteType
     */
    public PhoneNumberInformation withRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    /**
     * <p>
     * The list of supported routes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Transactional, Promotional, Premium
     *
     * @param routeType <p>
     *            The list of supported routes.
     *            </p>
     * @see RouteType
     */
    public void setRouteType(RouteType routeType) {
        this.routeType = routeType.toString();
    }

    /**
     * <p>
     * The list of supported routes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Transactional, Promotional, Premium
     *
     * @param routeType <p>
     *            The list of supported routes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RouteType
     */
    public PhoneNumberInformation withRouteType(RouteType routeType) {
        this.routeType = routeType.toString();
        return this;
    }

    /**
     * <p>
     * The capabilities of each phone number.
     * </p>
     *
     * @return <p>
     *         The capabilities of each phone number.
     *         </p>
     */
    public java.util.List<String> getNumberCapabilities() {
        return numberCapabilities;
    }

    /**
     * <p>
     * The capabilities of each phone number.
     * </p>
     *
     * @param numberCapabilities <p>
     *            The capabilities of each phone number.
     *            </p>
     */
    public void setNumberCapabilities(java.util.Collection<String> numberCapabilities) {
        if (numberCapabilities == null) {
            this.numberCapabilities = null;
            return;
        }

        this.numberCapabilities = new java.util.ArrayList<String>(numberCapabilities);
    }

    /**
     * <p>
     * The capabilities of each phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberCapabilities <p>
     *            The capabilities of each phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberInformation withNumberCapabilities(String... numberCapabilities) {
        if (getNumberCapabilities() == null) {
            this.numberCapabilities = new java.util.ArrayList<String>(numberCapabilities.length);
        }
        for (String value : numberCapabilities) {
            this.numberCapabilities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The capabilities of each phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberCapabilities <p>
     *            The capabilities of each phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberInformation withNumberCapabilities(
            java.util.Collection<String> numberCapabilities) {
        setNumberCapabilities(numberCapabilities);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getIso2CountryCode() != null)
            sb.append("Iso2CountryCode: " + getIso2CountryCode() + ",");
        if (getRouteType() != null)
            sb.append("RouteType: " + getRouteType() + ",");
        if (getNumberCapabilities() != null)
            sb.append("NumberCapabilities: " + getNumberCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getIso2CountryCode() == null) ? 0 : getIso2CountryCode().hashCode());
        hashCode = prime * hashCode + ((getRouteType() == null) ? 0 : getRouteType().hashCode());
        hashCode = prime * hashCode
                + ((getNumberCapabilities() == null) ? 0 : getNumberCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberInformation == false)
            return false;
        PhoneNumberInformation other = (PhoneNumberInformation) obj;

        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIso2CountryCode() == null ^ this.getIso2CountryCode() == null)
            return false;
        if (other.getIso2CountryCode() != null
                && other.getIso2CountryCode().equals(this.getIso2CountryCode()) == false)
            return false;
        if (other.getRouteType() == null ^ this.getRouteType() == null)
            return false;
        if (other.getRouteType() != null
                && other.getRouteType().equals(this.getRouteType()) == false)
            return false;
        if (other.getNumberCapabilities() == null ^ this.getNumberCapabilities() == null)
            return false;
        if (other.getNumberCapabilities() != null
                && other.getNumberCapabilities().equals(this.getNumberCapabilities()) == false)
            return false;
        return true;
    }
}
