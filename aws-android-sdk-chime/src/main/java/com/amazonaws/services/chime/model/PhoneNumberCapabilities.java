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
 * The phone number capabilities for Amazon Chime Business Calling phone
 * numbers, such as enabled inbound and outbound calling and text messaging.
 * </p>
 */
public class PhoneNumberCapabilities implements Serializable {
    /**
     * <p>
     * Allows or denies inbound calling for the specified phone number.
     * </p>
     */
    private Boolean inboundCall;

    /**
     * <p>
     * Allows or denies outbound calling for the specified phone number.
     * </p>
     */
    private Boolean outboundCall;

    /**
     * <p>
     * Allows or denies inbound SMS messaging for the specified phone number.
     * </p>
     */
    private Boolean inboundSMS;

    /**
     * <p>
     * Allows or denies outbound SMS messaging for the specified phone number.
     * </p>
     */
    private Boolean outboundSMS;

    /**
     * <p>
     * Allows or denies inbound MMS messaging for the specified phone number.
     * </p>
     */
    private Boolean inboundMMS;

    /**
     * <p>
     * Allows or denies outbound MMS messaging for the specified phone number.
     * </p>
     */
    private Boolean outboundMMS;

    /**
     * <p>
     * Allows or denies inbound calling for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies inbound calling for the specified phone number.
     *         </p>
     */
    public Boolean isInboundCall() {
        return inboundCall;
    }

    /**
     * <p>
     * Allows or denies inbound calling for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies inbound calling for the specified phone number.
     *         </p>
     */
    public Boolean getInboundCall() {
        return inboundCall;
    }

    /**
     * <p>
     * Allows or denies inbound calling for the specified phone number.
     * </p>
     *
     * @param inboundCall <p>
     *            Allows or denies inbound calling for the specified phone
     *            number.
     *            </p>
     */
    public void setInboundCall(Boolean inboundCall) {
        this.inboundCall = inboundCall;
    }

    /**
     * <p>
     * Allows or denies inbound calling for the specified phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inboundCall <p>
     *            Allows or denies inbound calling for the specified phone
     *            number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberCapabilities withInboundCall(Boolean inboundCall) {
        this.inboundCall = inboundCall;
        return this;
    }

    /**
     * <p>
     * Allows or denies outbound calling for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies outbound calling for the specified phone number.
     *         </p>
     */
    public Boolean isOutboundCall() {
        return outboundCall;
    }

    /**
     * <p>
     * Allows or denies outbound calling for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies outbound calling for the specified phone number.
     *         </p>
     */
    public Boolean getOutboundCall() {
        return outboundCall;
    }

    /**
     * <p>
     * Allows or denies outbound calling for the specified phone number.
     * </p>
     *
     * @param outboundCall <p>
     *            Allows or denies outbound calling for the specified phone
     *            number.
     *            </p>
     */
    public void setOutboundCall(Boolean outboundCall) {
        this.outboundCall = outboundCall;
    }

    /**
     * <p>
     * Allows or denies outbound calling for the specified phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundCall <p>
     *            Allows or denies outbound calling for the specified phone
     *            number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberCapabilities withOutboundCall(Boolean outboundCall) {
        this.outboundCall = outboundCall;
        return this;
    }

    /**
     * <p>
     * Allows or denies inbound SMS messaging for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies inbound SMS messaging for the specified phone
     *         number.
     *         </p>
     */
    public Boolean isInboundSMS() {
        return inboundSMS;
    }

    /**
     * <p>
     * Allows or denies inbound SMS messaging for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies inbound SMS messaging for the specified phone
     *         number.
     *         </p>
     */
    public Boolean getInboundSMS() {
        return inboundSMS;
    }

    /**
     * <p>
     * Allows or denies inbound SMS messaging for the specified phone number.
     * </p>
     *
     * @param inboundSMS <p>
     *            Allows or denies inbound SMS messaging for the specified phone
     *            number.
     *            </p>
     */
    public void setInboundSMS(Boolean inboundSMS) {
        this.inboundSMS = inboundSMS;
    }

    /**
     * <p>
     * Allows or denies inbound SMS messaging for the specified phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inboundSMS <p>
     *            Allows or denies inbound SMS messaging for the specified phone
     *            number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberCapabilities withInboundSMS(Boolean inboundSMS) {
        this.inboundSMS = inboundSMS;
        return this;
    }

    /**
     * <p>
     * Allows or denies outbound SMS messaging for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies outbound SMS messaging for the specified phone
     *         number.
     *         </p>
     */
    public Boolean isOutboundSMS() {
        return outboundSMS;
    }

    /**
     * <p>
     * Allows or denies outbound SMS messaging for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies outbound SMS messaging for the specified phone
     *         number.
     *         </p>
     */
    public Boolean getOutboundSMS() {
        return outboundSMS;
    }

    /**
     * <p>
     * Allows or denies outbound SMS messaging for the specified phone number.
     * </p>
     *
     * @param outboundSMS <p>
     *            Allows or denies outbound SMS messaging for the specified
     *            phone number.
     *            </p>
     */
    public void setOutboundSMS(Boolean outboundSMS) {
        this.outboundSMS = outboundSMS;
    }

    /**
     * <p>
     * Allows or denies outbound SMS messaging for the specified phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundSMS <p>
     *            Allows or denies outbound SMS messaging for the specified
     *            phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberCapabilities withOutboundSMS(Boolean outboundSMS) {
        this.outboundSMS = outboundSMS;
        return this;
    }

    /**
     * <p>
     * Allows or denies inbound MMS messaging for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies inbound MMS messaging for the specified phone
     *         number.
     *         </p>
     */
    public Boolean isInboundMMS() {
        return inboundMMS;
    }

    /**
     * <p>
     * Allows or denies inbound MMS messaging for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies inbound MMS messaging for the specified phone
     *         number.
     *         </p>
     */
    public Boolean getInboundMMS() {
        return inboundMMS;
    }

    /**
     * <p>
     * Allows or denies inbound MMS messaging for the specified phone number.
     * </p>
     *
     * @param inboundMMS <p>
     *            Allows or denies inbound MMS messaging for the specified phone
     *            number.
     *            </p>
     */
    public void setInboundMMS(Boolean inboundMMS) {
        this.inboundMMS = inboundMMS;
    }

    /**
     * <p>
     * Allows or denies inbound MMS messaging for the specified phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inboundMMS <p>
     *            Allows or denies inbound MMS messaging for the specified phone
     *            number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberCapabilities withInboundMMS(Boolean inboundMMS) {
        this.inboundMMS = inboundMMS;
        return this;
    }

    /**
     * <p>
     * Allows or denies outbound MMS messaging for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies outbound MMS messaging for the specified phone
     *         number.
     *         </p>
     */
    public Boolean isOutboundMMS() {
        return outboundMMS;
    }

    /**
     * <p>
     * Allows or denies outbound MMS messaging for the specified phone number.
     * </p>
     *
     * @return <p>
     *         Allows or denies outbound MMS messaging for the specified phone
     *         number.
     *         </p>
     */
    public Boolean getOutboundMMS() {
        return outboundMMS;
    }

    /**
     * <p>
     * Allows or denies outbound MMS messaging for the specified phone number.
     * </p>
     *
     * @param outboundMMS <p>
     *            Allows or denies outbound MMS messaging for the specified
     *            phone number.
     *            </p>
     */
    public void setOutboundMMS(Boolean outboundMMS) {
        this.outboundMMS = outboundMMS;
    }

    /**
     * <p>
     * Allows or denies outbound MMS messaging for the specified phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundMMS <p>
     *            Allows or denies outbound MMS messaging for the specified
     *            phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberCapabilities withOutboundMMS(Boolean outboundMMS) {
        this.outboundMMS = outboundMMS;
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
        if (getInboundCall() != null)
            sb.append("InboundCall: " + getInboundCall() + ",");
        if (getOutboundCall() != null)
            sb.append("OutboundCall: " + getOutboundCall() + ",");
        if (getInboundSMS() != null)
            sb.append("InboundSMS: " + getInboundSMS() + ",");
        if (getOutboundSMS() != null)
            sb.append("OutboundSMS: " + getOutboundSMS() + ",");
        if (getInboundMMS() != null)
            sb.append("InboundMMS: " + getInboundMMS() + ",");
        if (getOutboundMMS() != null)
            sb.append("OutboundMMS: " + getOutboundMMS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInboundCall() == null) ? 0 : getInboundCall().hashCode());
        hashCode = prime * hashCode
                + ((getOutboundCall() == null) ? 0 : getOutboundCall().hashCode());
        hashCode = prime * hashCode + ((getInboundSMS() == null) ? 0 : getInboundSMS().hashCode());
        hashCode = prime * hashCode
                + ((getOutboundSMS() == null) ? 0 : getOutboundSMS().hashCode());
        hashCode = prime * hashCode + ((getInboundMMS() == null) ? 0 : getInboundMMS().hashCode());
        hashCode = prime * hashCode
                + ((getOutboundMMS() == null) ? 0 : getOutboundMMS().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberCapabilities == false)
            return false;
        PhoneNumberCapabilities other = (PhoneNumberCapabilities) obj;

        if (other.getInboundCall() == null ^ this.getInboundCall() == null)
            return false;
        if (other.getInboundCall() != null
                && other.getInboundCall().equals(this.getInboundCall()) == false)
            return false;
        if (other.getOutboundCall() == null ^ this.getOutboundCall() == null)
            return false;
        if (other.getOutboundCall() != null
                && other.getOutboundCall().equals(this.getOutboundCall()) == false)
            return false;
        if (other.getInboundSMS() == null ^ this.getInboundSMS() == null)
            return false;
        if (other.getInboundSMS() != null
                && other.getInboundSMS().equals(this.getInboundSMS()) == false)
            return false;
        if (other.getOutboundSMS() == null ^ this.getOutboundSMS() == null)
            return false;
        if (other.getOutboundSMS() != null
                && other.getOutboundSMS().equals(this.getOutboundSMS()) == false)
            return false;
        if (other.getInboundMMS() == null ^ this.getInboundMMS() == null)
            return false;
        if (other.getInboundMMS() != null
                && other.getInboundMMS().equals(this.getInboundMMS()) == false)
            return false;
        if (other.getOutboundMMS() == null ^ this.getOutboundMMS() == null)
            return false;
        if (other.getOutboundMMS() != null
                && other.getOutboundMMS().equals(this.getOutboundMMS()) == false)
            return false;
        return true;
    }
}
