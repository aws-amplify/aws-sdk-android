/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Use this request to opt in a phone number that is opted out, which enables
 * you to resume sending SMS messages to the number.
 * </p>
 * <p>
 * You can opt in a phone number only once every 30 days.
 * </p>
 */
public class OptInPhoneNumberRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The phone number to opt in.
     * </p>
     */
    private String phoneNumber;

    /**
     * <p>
     * The phone number to opt in.
     * </p>
     *
     * @return <p>
     *         The phone number to opt in.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The phone number to opt in.
     * </p>
     *
     * @param phoneNumber <p>
     *            The phone number to opt in.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number to opt in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumber <p>
     *            The phone number to opt in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptInPhoneNumberRequest withPhoneNumber(String phoneNumber) {
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
        if (getPhoneNumber() != null)
            sb.append("phoneNumber: " + getPhoneNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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

        if (obj instanceof OptInPhoneNumberRequest == false)
            return false;
        OptInPhoneNumberRequest other = (OptInPhoneNumberRequest) obj;

        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        return true;
    }
}
