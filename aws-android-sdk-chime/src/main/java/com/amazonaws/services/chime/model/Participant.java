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
 * The phone number and proxy phone number for a participant in an Amazon Chime
 * Voice Connector proxy session.
 * </p>
 */
public class Participant implements Serializable {
    /**
     * <p>
     * The participant's phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     */
    private String phoneNumber;

    /**
     * <p>
     * The participant's proxy phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     */
    private String proxyPhoneNumber;

    /**
     * <p>
     * The participant's phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @return <p>
     *         The participant's phone number.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The participant's phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param phoneNumber <p>
     *            The participant's phone number.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The participant's phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param phoneNumber <p>
     *            The participant's phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Participant withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * <p>
     * The participant's proxy phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @return <p>
     *         The participant's proxy phone number.
     *         </p>
     */
    public String getProxyPhoneNumber() {
        return proxyPhoneNumber;
    }

    /**
     * <p>
     * The participant's proxy phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param proxyPhoneNumber <p>
     *            The participant's proxy phone number.
     *            </p>
     */
    public void setProxyPhoneNumber(String proxyPhoneNumber) {
        this.proxyPhoneNumber = proxyPhoneNumber;
    }

    /**
     * <p>
     * The participant's proxy phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param proxyPhoneNumber <p>
     *            The participant's proxy phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Participant withProxyPhoneNumber(String proxyPhoneNumber) {
        this.proxyPhoneNumber = proxyPhoneNumber;
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
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getProxyPhoneNumber() != null)
            sb.append("ProxyPhoneNumber: " + getProxyPhoneNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode
                + ((getProxyPhoneNumber() == null) ? 0 : getProxyPhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Participant == false)
            return false;
        Participant other = (Participant) obj;

        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getProxyPhoneNumber() == null ^ this.getProxyPhoneNumber() == null)
            return false;
        if (other.getProxyPhoneNumber() != null
                && other.getProxyPhoneNumber().equals(this.getProxyPhoneNumber()) == false)
            return false;
        return true;
    }
}
