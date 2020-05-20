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
 * Puts the specified proxy configuration to the specified Amazon Chime Voice
 * Connector.
 * </p>
 */
public class PutVoiceConnectorProxyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String voiceConnectorId;

    /**
     * <p>
     * The default number of minutes allowed for proxy sessions.
     * </p>
     */
    private Integer defaultSessionExpiryMinutes;

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     */
    private java.util.List<String> phoneNumberPoolCountries;

    /**
     * <p>
     * The phone number to route calls to after a proxy session expires.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     */
    private String fallBackPhoneNumber;

    /**
     * <p>
     * When true, stops proxy sessions from being created on the specified
     * Amazon Chime Voice Connector.
     * </p>
     */
    private Boolean disabled;

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Chime voice connector ID.
     *         </p>
     */
    public String getVoiceConnectorId() {
        return voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorId <p>
     *            The Amazon Chime voice connector ID.
     *            </p>
     */
    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorId <p>
     *            The Amazon Chime voice connector ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutVoiceConnectorProxyRequest withVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
        return this;
    }

    /**
     * <p>
     * The default number of minutes allowed for proxy sessions.
     * </p>
     *
     * @return <p>
     *         The default number of minutes allowed for proxy sessions.
     *         </p>
     */
    public Integer getDefaultSessionExpiryMinutes() {
        return defaultSessionExpiryMinutes;
    }

    /**
     * <p>
     * The default number of minutes allowed for proxy sessions.
     * </p>
     *
     * @param defaultSessionExpiryMinutes <p>
     *            The default number of minutes allowed for proxy sessions.
     *            </p>
     */
    public void setDefaultSessionExpiryMinutes(Integer defaultSessionExpiryMinutes) {
        this.defaultSessionExpiryMinutes = defaultSessionExpiryMinutes;
    }

    /**
     * <p>
     * The default number of minutes allowed for proxy sessions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultSessionExpiryMinutes <p>
     *            The default number of minutes allowed for proxy sessions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutVoiceConnectorProxyRequest withDefaultSessionExpiryMinutes(
            Integer defaultSessionExpiryMinutes) {
        this.defaultSessionExpiryMinutes = defaultSessionExpiryMinutes;
        return this;
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     *
     * @return <p>
     *         The countries for proxy phone numbers to be selected from.
     *         </p>
     */
    public java.util.List<String> getPhoneNumberPoolCountries() {
        return phoneNumberPoolCountries;
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     *
     * @param phoneNumberPoolCountries <p>
     *            The countries for proxy phone numbers to be selected from.
     *            </p>
     */
    public void setPhoneNumberPoolCountries(java.util.Collection<String> phoneNumberPoolCountries) {
        if (phoneNumberPoolCountries == null) {
            this.phoneNumberPoolCountries = null;
            return;
        }

        this.phoneNumberPoolCountries = new java.util.ArrayList<String>(phoneNumberPoolCountries);
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberPoolCountries <p>
     *            The countries for proxy phone numbers to be selected from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutVoiceConnectorProxyRequest withPhoneNumberPoolCountries(
            String... phoneNumberPoolCountries) {
        if (getPhoneNumberPoolCountries() == null) {
            this.phoneNumberPoolCountries = new java.util.ArrayList<String>(
                    phoneNumberPoolCountries.length);
        }
        for (String value : phoneNumberPoolCountries) {
            this.phoneNumberPoolCountries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The countries for proxy phone numbers to be selected from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberPoolCountries <p>
     *            The countries for proxy phone numbers to be selected from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutVoiceConnectorProxyRequest withPhoneNumberPoolCountries(
            java.util.Collection<String> phoneNumberPoolCountries) {
        setPhoneNumberPoolCountries(phoneNumberPoolCountries);
        return this;
    }

    /**
     * <p>
     * The phone number to route calls to after a proxy session expires.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @return <p>
     *         The phone number to route calls to after a proxy session expires.
     *         </p>
     */
    public String getFallBackPhoneNumber() {
        return fallBackPhoneNumber;
    }

    /**
     * <p>
     * The phone number to route calls to after a proxy session expires.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param fallBackPhoneNumber <p>
     *            The phone number to route calls to after a proxy session
     *            expires.
     *            </p>
     */
    public void setFallBackPhoneNumber(String fallBackPhoneNumber) {
        this.fallBackPhoneNumber = fallBackPhoneNumber;
    }

    /**
     * <p>
     * The phone number to route calls to after a proxy session expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param fallBackPhoneNumber <p>
     *            The phone number to route calls to after a proxy session
     *            expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutVoiceConnectorProxyRequest withFallBackPhoneNumber(String fallBackPhoneNumber) {
        this.fallBackPhoneNumber = fallBackPhoneNumber;
        return this;
    }

    /**
     * <p>
     * When true, stops proxy sessions from being created on the specified
     * Amazon Chime Voice Connector.
     * </p>
     *
     * @return <p>
     *         When true, stops proxy sessions from being created on the
     *         specified Amazon Chime Voice Connector.
     *         </p>
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * <p>
     * When true, stops proxy sessions from being created on the specified
     * Amazon Chime Voice Connector.
     * </p>
     *
     * @return <p>
     *         When true, stops proxy sessions from being created on the
     *         specified Amazon Chime Voice Connector.
     *         </p>
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * <p>
     * When true, stops proxy sessions from being created on the specified
     * Amazon Chime Voice Connector.
     * </p>
     *
     * @param disabled <p>
     *            When true, stops proxy sessions from being created on the
     *            specified Amazon Chime Voice Connector.
     *            </p>
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * When true, stops proxy sessions from being created on the specified
     * Amazon Chime Voice Connector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disabled <p>
     *            When true, stops proxy sessions from being created on the
     *            specified Amazon Chime Voice Connector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutVoiceConnectorProxyRequest withDisabled(Boolean disabled) {
        this.disabled = disabled;
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: " + getVoiceConnectorId() + ",");
        if (getDefaultSessionExpiryMinutes() != null)
            sb.append("DefaultSessionExpiryMinutes: " + getDefaultSessionExpiryMinutes() + ",");
        if (getPhoneNumberPoolCountries() != null)
            sb.append("PhoneNumberPoolCountries: " + getPhoneNumberPoolCountries() + ",");
        if (getFallBackPhoneNumber() != null)
            sb.append("FallBackPhoneNumber: " + getFallBackPhoneNumber() + ",");
        if (getDisabled() != null)
            sb.append("Disabled: " + getDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultSessionExpiryMinutes() == null) ? 0
                        : getDefaultSessionExpiryMinutes().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhoneNumberPoolCountries() == null) ? 0 : getPhoneNumberPoolCountries()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFallBackPhoneNumber() == null) ? 0 : getFallBackPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutVoiceConnectorProxyRequest == false)
            return false;
        PutVoiceConnectorProxyRequest other = (PutVoiceConnectorProxyRequest) obj;

        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null
                && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getDefaultSessionExpiryMinutes() == null
                ^ this.getDefaultSessionExpiryMinutes() == null)
            return false;
        if (other.getDefaultSessionExpiryMinutes() != null
                && other.getDefaultSessionExpiryMinutes().equals(
                        this.getDefaultSessionExpiryMinutes()) == false)
            return false;
        if (other.getPhoneNumberPoolCountries() == null
                ^ this.getPhoneNumberPoolCountries() == null)
            return false;
        if (other.getPhoneNumberPoolCountries() != null
                && other.getPhoneNumberPoolCountries().equals(this.getPhoneNumberPoolCountries()) == false)
            return false;
        if (other.getFallBackPhoneNumber() == null ^ this.getFallBackPhoneNumber() == null)
            return false;
        if (other.getFallBackPhoneNumber() != null
                && other.getFallBackPhoneNumber().equals(this.getFallBackPhoneNumber()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        return true;
    }
}
