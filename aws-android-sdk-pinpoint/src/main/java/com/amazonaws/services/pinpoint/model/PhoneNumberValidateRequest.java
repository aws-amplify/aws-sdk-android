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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Returns information about the specified phone number.
 */
public class PhoneNumberValidateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Phone Number Information request.
     */
    private NumberValidateRequest numberValidateRequest;

    /**
     * Phone Number Information request.
     *
     * @return Phone Number Information request.
     */
    public NumberValidateRequest getNumberValidateRequest() {
        return numberValidateRequest;
    }

    /**
     * Phone Number Information request.
     *
     * @param numberValidateRequest Phone Number Information request.
     */
    public void setNumberValidateRequest(NumberValidateRequest numberValidateRequest) {
        this.numberValidateRequest = numberValidateRequest;
    }

    /**
     * Phone Number Information request.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberValidateRequest Phone Number Information request.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberValidateRequest withNumberValidateRequest(
            NumberValidateRequest numberValidateRequest) {
        this.numberValidateRequest = numberValidateRequest;
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
        if (getNumberValidateRequest() != null)
            sb.append("NumberValidateRequest: " + getNumberValidateRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNumberValidateRequest() == null) ? 0 : getNumberValidateRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberValidateRequest == false)
            return false;
        PhoneNumberValidateRequest other = (PhoneNumberValidateRequest) obj;

        if (other.getNumberValidateRequest() == null ^ this.getNumberValidateRequest() == null)
            return false;
        if (other.getNumberValidateRequest() != null
                && other.getNumberValidateRequest().equals(this.getNumberValidateRequest()) == false)
            return false;
        return true;
    }
}
