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

public class PhoneNumberValidateResult implements Serializable {
    /**
     * Phone Number Validate response.
     */
    private NumberValidateResponse numberValidateResponse;

    /**
     * Phone Number Validate response.
     *
     * @return Phone Number Validate response.
     */
    public NumberValidateResponse getNumberValidateResponse() {
        return numberValidateResponse;
    }

    /**
     * Phone Number Validate response.
     *
     * @param numberValidateResponse Phone Number Validate response.
     */
    public void setNumberValidateResponse(NumberValidateResponse numberValidateResponse) {
        this.numberValidateResponse = numberValidateResponse;
    }

    /**
     * Phone Number Validate response.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberValidateResponse Phone Number Validate response.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberValidateResult withNumberValidateResponse(
            NumberValidateResponse numberValidateResponse) {
        this.numberValidateResponse = numberValidateResponse;
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
        if (getNumberValidateResponse() != null)
            sb.append("NumberValidateResponse: " + getNumberValidateResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNumberValidateResponse() == null) ? 0 : getNumberValidateResponse()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberValidateResult == false)
            return false;
        PhoneNumberValidateResult other = (PhoneNumberValidateResult) obj;

        if (other.getNumberValidateResponse() == null ^ this.getNumberValidateResponse() == null)
            return false;
        if (other.getNumberValidateResponse() != null
                && other.getNumberValidateResponse().equals(this.getNumberValidateResponse()) == false)
            return false;
        return true;
    }
}
