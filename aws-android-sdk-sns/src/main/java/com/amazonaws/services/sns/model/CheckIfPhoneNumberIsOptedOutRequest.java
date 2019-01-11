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
 * Accepts a phone number and indicates whether the phone holder has opted out
 * of receiving SMS messages from your account. You cannot send SMS messages to
 * a number that is opted out.
 * </p>
 * <p>
 * To resume sending messages, you can opt in the number by using the
 * <code>OptInPhoneNumber</code> action.
 * </p>
 */
public class CheckIfPhoneNumberIsOptedOutRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The phone number for which you want to check the opt out status.
     * </p>
     */
    private String phoneNumber;

    /**
     * <p>
     * The phone number for which you want to check the opt out status.
     * </p>
     *
     * @return <p>
     *         The phone number for which you want to check the opt out status.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The phone number for which you want to check the opt out status.
     * </p>
     *
     * @param phoneNumber <p>
     *            The phone number for which you want to check the opt out
     *            status.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number for which you want to check the opt out status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumber <p>
     *            The phone number for which you want to check the opt out
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CheckIfPhoneNumberIsOptedOutRequest withPhoneNumber(String phoneNumber) {
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

        if (obj instanceof CheckIfPhoneNumberIsOptedOutRequest == false)
            return false;
        CheckIfPhoneNumberIsOptedOutRequest other = (CheckIfPhoneNumberIsOptedOutRequest) obj;

        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        return true;
    }
}
