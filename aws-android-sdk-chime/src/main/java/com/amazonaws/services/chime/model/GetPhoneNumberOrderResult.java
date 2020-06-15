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

public class GetPhoneNumberOrderResult implements Serializable {
    /**
     * <p>
     * The phone number order details.
     * </p>
     */
    private PhoneNumberOrder phoneNumberOrder;

    /**
     * <p>
     * The phone number order details.
     * </p>
     *
     * @return <p>
     *         The phone number order details.
     *         </p>
     */
    public PhoneNumberOrder getPhoneNumberOrder() {
        return phoneNumberOrder;
    }

    /**
     * <p>
     * The phone number order details.
     * </p>
     *
     * @param phoneNumberOrder <p>
     *            The phone number order details.
     *            </p>
     */
    public void setPhoneNumberOrder(PhoneNumberOrder phoneNumberOrder) {
        this.phoneNumberOrder = phoneNumberOrder;
    }

    /**
     * <p>
     * The phone number order details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberOrder <p>
     *            The phone number order details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPhoneNumberOrderResult withPhoneNumberOrder(PhoneNumberOrder phoneNumberOrder) {
        this.phoneNumberOrder = phoneNumberOrder;
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
        if (getPhoneNumberOrder() != null)
            sb.append("PhoneNumberOrder: " + getPhoneNumberOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumberOrder() == null) ? 0 : getPhoneNumberOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPhoneNumberOrderResult == false)
            return false;
        GetPhoneNumberOrderResult other = (GetPhoneNumberOrderResult) obj;

        if (other.getPhoneNumberOrder() == null ^ this.getPhoneNumberOrder() == null)
            return false;
        if (other.getPhoneNumberOrder() != null
                && other.getPhoneNumberOrder().equals(this.getPhoneNumberOrder()) == false)
            return false;
        return true;
    }
}
