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

/**
 * <p>
 * The response from the <code>CheckIfPhoneNumberIsOptedOut</code> action.
 * </p>
 */
public class CheckIfPhoneNumberIsOptedOutResult implements Serializable {
    /**
     * <p>
     * Indicates whether the phone number is opted out:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> – The phone number is opted out, meaning you cannot
     * publish SMS messages to it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> – The phone number is opted in, meaning you can
     * publish SMS messages to it.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean isOptedOut;

    /**
     * <p>
     * Indicates whether the phone number is opted out:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> – The phone number is opted out, meaning you cannot
     * publish SMS messages to it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> – The phone number is opted in, meaning you can
     * publish SMS messages to it.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Indicates whether the phone number is opted out:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> – The phone number is opted out, meaning you
     *         cannot publish SMS messages to it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> – The phone number is opted in, meaning you
     *         can publish SMS messages to it.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isIsOptedOut() {
        return isOptedOut;
    }

    /**
     * <p>
     * Indicates whether the phone number is opted out:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> – The phone number is opted out, meaning you cannot
     * publish SMS messages to it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> – The phone number is opted in, meaning you can
     * publish SMS messages to it.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Indicates whether the phone number is opted out:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> – The phone number is opted out, meaning you
     *         cannot publish SMS messages to it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> – The phone number is opted in, meaning you
     *         can publish SMS messages to it.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getIsOptedOut() {
        return isOptedOut;
    }

    /**
     * <p>
     * Indicates whether the phone number is opted out:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> – The phone number is opted out, meaning you cannot
     * publish SMS messages to it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> – The phone number is opted in, meaning you can
     * publish SMS messages to it.
     * </p>
     * </li>
     * </ul>
     *
     * @param isOptedOut <p>
     *            Indicates whether the phone number is opted out:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>true</code> – The phone number is opted out, meaning you
     *            cannot publish SMS messages to it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>false</code> – The phone number is opted in, meaning you
     *            can publish SMS messages to it.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setIsOptedOut(Boolean isOptedOut) {
        this.isOptedOut = isOptedOut;
    }

    /**
     * <p>
     * Indicates whether the phone number is opted out:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> – The phone number is opted out, meaning you cannot
     * publish SMS messages to it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> – The phone number is opted in, meaning you can
     * publish SMS messages to it.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isOptedOut <p>
     *            Indicates whether the phone number is opted out:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>true</code> – The phone number is opted out, meaning you
     *            cannot publish SMS messages to it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>false</code> – The phone number is opted in, meaning you
     *            can publish SMS messages to it.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CheckIfPhoneNumberIsOptedOutResult withIsOptedOut(Boolean isOptedOut) {
        this.isOptedOut = isOptedOut;
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
        if (getIsOptedOut() != null)
            sb.append("isOptedOut: " + getIsOptedOut());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsOptedOut() == null) ? 0 : getIsOptedOut().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckIfPhoneNumberIsOptedOutResult == false)
            return false;
        CheckIfPhoneNumberIsOptedOutResult other = (CheckIfPhoneNumberIsOptedOutResult) obj;

        if (other.getIsOptedOut() == null ^ this.getIsOptedOut() == null)
            return false;
        if (other.getIsOptedOut() != null
                && other.getIsOptedOut().equals(this.getIsOptedOut()) == false)
            return false;
        return true;
    }
}
