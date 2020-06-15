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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves details for the specified phone number order, such as order
 * creation timestamp, phone numbers in E.164 format, product type, and order
 * status.
 * </p>
 */
public class GetPhoneNumberOrderRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID for the phone number order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     */
    private String phoneNumberOrderId;

    /**
     * <p>
     * The ID for the phone number order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @return <p>
     *         The ID for the phone number order.
     *         </p>
     */
    public String getPhoneNumberOrderId() {
        return phoneNumberOrderId;
    }

    /**
     * <p>
     * The ID for the phone number order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @param phoneNumberOrderId <p>
     *            The ID for the phone number order.
     *            </p>
     */
    public void setPhoneNumberOrderId(String phoneNumberOrderId) {
        this.phoneNumberOrderId = phoneNumberOrderId;
    }

    /**
     * <p>
     * The ID for the phone number order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @param phoneNumberOrderId <p>
     *            The ID for the phone number order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPhoneNumberOrderRequest withPhoneNumberOrderId(String phoneNumberOrderId) {
        this.phoneNumberOrderId = phoneNumberOrderId;
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
        if (getPhoneNumberOrderId() != null)
            sb.append("PhoneNumberOrderId: " + getPhoneNumberOrderId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumberOrderId() == null) ? 0 : getPhoneNumberOrderId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPhoneNumberOrderRequest == false)
            return false;
        GetPhoneNumberOrderRequest other = (GetPhoneNumberOrderRequest) obj;

        if (other.getPhoneNumberOrderId() == null ^ this.getPhoneNumberOrderId() == null)
            return false;
        if (other.getPhoneNumberOrderId() != null
                && other.getPhoneNumberOrderId().equals(this.getPhoneNumberOrderId()) == false)
            return false;
        return true;
    }
}
