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

/**
 * <p>
 * A phone number for which an order has been placed.
 * </p>
 */
public class OrderedPhoneNumber implements Serializable {
    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     */
    private String e164PhoneNumber;

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Acquired, Failed
     */
    private String status;

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @return <p>
     *         The phone number, in E.164 format.
     *         </p>
     */
    public String getE164PhoneNumber() {
        return e164PhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param e164PhoneNumber <p>
     *            The phone number, in E.164 format.
     *            </p>
     */
    public void setE164PhoneNumber(String e164PhoneNumber) {
        this.e164PhoneNumber = e164PhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param e164PhoneNumber <p>
     *            The phone number, in E.164 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderedPhoneNumber withE164PhoneNumber(String e164PhoneNumber) {
        this.e164PhoneNumber = e164PhoneNumber;
        return this;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Acquired, Failed
     *
     * @return <p>
     *         The phone number status.
     *         </p>
     * @see OrderedPhoneNumberStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Acquired, Failed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @see OrderedPhoneNumberStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Acquired, Failed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrderedPhoneNumberStatus
     */
    public OrderedPhoneNumber withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Acquired, Failed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @see OrderedPhoneNumberStatus
     */
    public void setStatus(OrderedPhoneNumberStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Acquired, Failed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrderedPhoneNumberStatus
     */
    public OrderedPhoneNumber withStatus(OrderedPhoneNumberStatus status) {
        this.status = status.toString();
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
        if (getE164PhoneNumber() != null)
            sb.append("E164PhoneNumber: " + getE164PhoneNumber() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getE164PhoneNumber() == null) ? 0 : getE164PhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderedPhoneNumber == false)
            return false;
        OrderedPhoneNumber other = (OrderedPhoneNumber) obj;

        if (other.getE164PhoneNumber() == null ^ this.getE164PhoneNumber() == null)
            return false;
        if (other.getE164PhoneNumber() != null
                && other.getE164PhoneNumber().equals(this.getE164PhoneNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
