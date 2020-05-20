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
 * Settings that allow management of telephony permissions for an Amazon Chime
 * user, such as inbound and outbound calling and text messaging.
 * </p>
 */
public class TelephonySettings implements Serializable {
    /**
     * <p>
     * Allows or denies inbound calling.
     * </p>
     */
    private Boolean inboundCalling;

    /**
     * <p>
     * Allows or denies outbound calling.
     * </p>
     */
    private Boolean outboundCalling;

    /**
     * <p>
     * Allows or denies SMS messaging.
     * </p>
     */
    private Boolean sMS;

    /**
     * <p>
     * Allows or denies inbound calling.
     * </p>
     *
     * @return <p>
     *         Allows or denies inbound calling.
     *         </p>
     */
    public Boolean isInboundCalling() {
        return inboundCalling;
    }

    /**
     * <p>
     * Allows or denies inbound calling.
     * </p>
     *
     * @return <p>
     *         Allows or denies inbound calling.
     *         </p>
     */
    public Boolean getInboundCalling() {
        return inboundCalling;
    }

    /**
     * <p>
     * Allows or denies inbound calling.
     * </p>
     *
     * @param inboundCalling <p>
     *            Allows or denies inbound calling.
     *            </p>
     */
    public void setInboundCalling(Boolean inboundCalling) {
        this.inboundCalling = inboundCalling;
    }

    /**
     * <p>
     * Allows or denies inbound calling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inboundCalling <p>
     *            Allows or denies inbound calling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TelephonySettings withInboundCalling(Boolean inboundCalling) {
        this.inboundCalling = inboundCalling;
        return this;
    }

    /**
     * <p>
     * Allows or denies outbound calling.
     * </p>
     *
     * @return <p>
     *         Allows or denies outbound calling.
     *         </p>
     */
    public Boolean isOutboundCalling() {
        return outboundCalling;
    }

    /**
     * <p>
     * Allows or denies outbound calling.
     * </p>
     *
     * @return <p>
     *         Allows or denies outbound calling.
     *         </p>
     */
    public Boolean getOutboundCalling() {
        return outboundCalling;
    }

    /**
     * <p>
     * Allows or denies outbound calling.
     * </p>
     *
     * @param outboundCalling <p>
     *            Allows or denies outbound calling.
     *            </p>
     */
    public void setOutboundCalling(Boolean outboundCalling) {
        this.outboundCalling = outboundCalling;
    }

    /**
     * <p>
     * Allows or denies outbound calling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundCalling <p>
     *            Allows or denies outbound calling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TelephonySettings withOutboundCalling(Boolean outboundCalling) {
        this.outboundCalling = outboundCalling;
        return this;
    }

    /**
     * <p>
     * Allows or denies SMS messaging.
     * </p>
     *
     * @return <p>
     *         Allows or denies SMS messaging.
     *         </p>
     */
    public Boolean isSMS() {
        return sMS;
    }

    /**
     * <p>
     * Allows or denies SMS messaging.
     * </p>
     *
     * @return <p>
     *         Allows or denies SMS messaging.
     *         </p>
     */
    public Boolean getSMS() {
        return sMS;
    }

    /**
     * <p>
     * Allows or denies SMS messaging.
     * </p>
     *
     * @param sMS <p>
     *            Allows or denies SMS messaging.
     *            </p>
     */
    public void setSMS(Boolean sMS) {
        this.sMS = sMS;
    }

    /**
     * <p>
     * Allows or denies SMS messaging.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMS <p>
     *            Allows or denies SMS messaging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TelephonySettings withSMS(Boolean sMS) {
        this.sMS = sMS;
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
        if (getInboundCalling() != null)
            sb.append("InboundCalling: " + getInboundCalling() + ",");
        if (getOutboundCalling() != null)
            sb.append("OutboundCalling: " + getOutboundCalling() + ",");
        if (getSMS() != null)
            sb.append("SMS: " + getSMS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInboundCalling() == null) ? 0 : getInboundCalling().hashCode());
        hashCode = prime * hashCode
                + ((getOutboundCalling() == null) ? 0 : getOutboundCalling().hashCode());
        hashCode = prime * hashCode + ((getSMS() == null) ? 0 : getSMS().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TelephonySettings == false)
            return false;
        TelephonySettings other = (TelephonySettings) obj;

        if (other.getInboundCalling() == null ^ this.getInboundCalling() == null)
            return false;
        if (other.getInboundCalling() != null
                && other.getInboundCalling().equals(this.getInboundCalling()) == false)
            return false;
        if (other.getOutboundCalling() == null ^ this.getOutboundCalling() == null)
            return false;
        if (other.getOutboundCalling() != null
                && other.getOutboundCalling().equals(this.getOutboundCalling()) == false)
            return false;
        if (other.getSMS() == null ^ this.getSMS() == null)
            return false;
        if (other.getSMS() != null && other.getSMS().equals(this.getSMS()) == false)
            return false;
        return true;
    }
}
