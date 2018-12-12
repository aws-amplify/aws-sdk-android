/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Phone Number Validate request.
 */
public class NumberValidateRequest implements Serializable {
    /**
     * (Optional) The two-character ISO country code for the country or region
     * where the phone number was originally registered.
     */
    private String isoCountryCode;

    /**
     * The phone number to get information about. The phone number that you
     * provide should include a country code. If the number doesn't include a
     * valid country code, the operation might result in an error.
     */
    private String phoneNumber;

    /**
     * (Optional) The two-character ISO country code for the country or region
     * where the phone number was originally registered.
     *
     * @return (Optional) The two-character ISO country code for the country or
     *         region where the phone number was originally registered.
     */
    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    /**
     * (Optional) The two-character ISO country code for the country or region
     * where the phone number was originally registered.
     *
     * @param isoCountryCode (Optional) The two-character ISO country code for
     *            the country or region where the phone number was originally
     *            registered.
     */
    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    /**
     * (Optional) The two-character ISO country code for the country or region
     * where the phone number was originally registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isoCountryCode (Optional) The two-character ISO country code for
     *            the country or region where the phone number was originally
     *            registered.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateRequest withIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
        return this;
    }

    /**
     * The phone number to get information about. The phone number that you
     * provide should include a country code. If the number doesn't include a
     * valid country code, the operation might result in an error.
     *
     * @return The phone number to get information about. The phone number that
     *         you provide should include a country code. If the number doesn't
     *         include a valid country code, the operation might result in an
     *         error.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * The phone number to get information about. The phone number that you
     * provide should include a country code. If the number doesn't include a
     * valid country code, the operation might result in an error.
     *
     * @param phoneNumber The phone number to get information about. The phone
     *            number that you provide should include a country code. If the
     *            number doesn't include a valid country code, the operation
     *            might result in an error.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * The phone number to get information about. The phone number that you
     * provide should include a country code. If the number doesn't include a
     * valid country code, the operation might result in an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumber The phone number to get information about. The phone
     *            number that you provide should include a country code. If the
     *            number doesn't include a valid country code, the operation
     *            might result in an error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberValidateRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: " + getIsoCountryCode() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumberValidateRequest == false)
            return false;
        NumberValidateRequest other = (NumberValidateRequest) obj;

        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null
                && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        return true;
    }
}
