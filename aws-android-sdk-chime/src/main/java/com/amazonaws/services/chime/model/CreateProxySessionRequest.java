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
 * Creates a proxy session on the specified Amazon Chime Voice Connector for the
 * specified participant phone numbers.
 * </p>
 */
public class CreateProxySessionRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The participant phone numbers.
     * </p>
     */
    private java.util.List<String> participantPhoneNumbers;

    /**
     * <p>
     * The name of the proxy session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{0,30}$<br/>
     */
    private String name;

    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer expiryMinutes;

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     */
    private java.util.List<String> capabilities;

    /**
     * <p>
     * The preference for proxy phone number reuse, or stickiness, between the
     * same participants across sessions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PreferSticky, AvoidSticky
     */
    private String numberSelectionBehavior;

    /**
     * <p>
     * The preference for matching the country or area code of the proxy phone
     * number with that of the first participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Country, AreaCode
     */
    private String geoMatchLevel;

    /**
     * <p>
     * The country and area code for the proxy phone number.
     * </p>
     */
    private GeoMatchParams geoMatchParams;

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
    public CreateProxySessionRequest withVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
        return this;
    }

    /**
     * <p>
     * The participant phone numbers.
     * </p>
     *
     * @return <p>
     *         The participant phone numbers.
     *         </p>
     */
    public java.util.List<String> getParticipantPhoneNumbers() {
        return participantPhoneNumbers;
    }

    /**
     * <p>
     * The participant phone numbers.
     * </p>
     *
     * @param participantPhoneNumbers <p>
     *            The participant phone numbers.
     *            </p>
     */
    public void setParticipantPhoneNumbers(java.util.Collection<String> participantPhoneNumbers) {
        if (participantPhoneNumbers == null) {
            this.participantPhoneNumbers = null;
            return;
        }

        this.participantPhoneNumbers = new java.util.ArrayList<String>(participantPhoneNumbers);
    }

    /**
     * <p>
     * The participant phone numbers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param participantPhoneNumbers <p>
     *            The participant phone numbers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProxySessionRequest withParticipantPhoneNumbers(String... participantPhoneNumbers) {
        if (getParticipantPhoneNumbers() == null) {
            this.participantPhoneNumbers = new java.util.ArrayList<String>(
                    participantPhoneNumbers.length);
        }
        for (String value : participantPhoneNumbers) {
            this.participantPhoneNumbers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The participant phone numbers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param participantPhoneNumbers <p>
     *            The participant phone numbers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProxySessionRequest withParticipantPhoneNumbers(
            java.util.Collection<String> participantPhoneNumbers) {
        setParticipantPhoneNumbers(participantPhoneNumbers);
        return this;
    }

    /**
     * <p>
     * The name of the proxy session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{0,30}$<br/>
     *
     * @return <p>
     *         The name of the proxy session.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the proxy session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{0,30}$<br/>
     *
     * @param name <p>
     *            The name of the proxy session.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the proxy session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{0,30}$<br/>
     *
     * @param name <p>
     *            The name of the proxy session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProxySessionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The number of minutes allowed for the proxy session.
     *         </p>
     */
    public Integer getExpiryMinutes() {
        return expiryMinutes;
    }

    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param expiryMinutes <p>
     *            The number of minutes allowed for the proxy session.
     *            </p>
     */
    public void setExpiryMinutes(Integer expiryMinutes) {
        this.expiryMinutes = expiryMinutes;
    }

    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param expiryMinutes <p>
     *            The number of minutes allowed for the proxy session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProxySessionRequest withExpiryMinutes(Integer expiryMinutes) {
        this.expiryMinutes = expiryMinutes;
        return this;
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     *
     * @return <p>
     *         The proxy session capabilities.
     *         </p>
     */
    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     *
     * @param capabilities <p>
     *            The proxy session capabilities.
     *            </p>
     */
    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The proxy session capabilities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProxySessionRequest withCapabilities(String... capabilities) {
        if (getCapabilities() == null) {
            this.capabilities = new java.util.ArrayList<String>(capabilities.length);
        }
        for (String value : capabilities) {
            this.capabilities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The proxy session capabilities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProxySessionRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The preference for proxy phone number reuse, or stickiness, between the
     * same participants across sessions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PreferSticky, AvoidSticky
     *
     * @return <p>
     *         The preference for proxy phone number reuse, or stickiness,
     *         between the same participants across sessions.
     *         </p>
     * @see NumberSelectionBehavior
     */
    public String getNumberSelectionBehavior() {
        return numberSelectionBehavior;
    }

    /**
     * <p>
     * The preference for proxy phone number reuse, or stickiness, between the
     * same participants across sessions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PreferSticky, AvoidSticky
     *
     * @param numberSelectionBehavior <p>
     *            The preference for proxy phone number reuse, or stickiness,
     *            between the same participants across sessions.
     *            </p>
     * @see NumberSelectionBehavior
     */
    public void setNumberSelectionBehavior(String numberSelectionBehavior) {
        this.numberSelectionBehavior = numberSelectionBehavior;
    }

    /**
     * <p>
     * The preference for proxy phone number reuse, or stickiness, between the
     * same participants across sessions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PreferSticky, AvoidSticky
     *
     * @param numberSelectionBehavior <p>
     *            The preference for proxy phone number reuse, or stickiness,
     *            between the same participants across sessions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NumberSelectionBehavior
     */
    public CreateProxySessionRequest withNumberSelectionBehavior(String numberSelectionBehavior) {
        this.numberSelectionBehavior = numberSelectionBehavior;
        return this;
    }

    /**
     * <p>
     * The preference for proxy phone number reuse, or stickiness, between the
     * same participants across sessions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PreferSticky, AvoidSticky
     *
     * @param numberSelectionBehavior <p>
     *            The preference for proxy phone number reuse, or stickiness,
     *            between the same participants across sessions.
     *            </p>
     * @see NumberSelectionBehavior
     */
    public void setNumberSelectionBehavior(NumberSelectionBehavior numberSelectionBehavior) {
        this.numberSelectionBehavior = numberSelectionBehavior.toString();
    }

    /**
     * <p>
     * The preference for proxy phone number reuse, or stickiness, between the
     * same participants across sessions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PreferSticky, AvoidSticky
     *
     * @param numberSelectionBehavior <p>
     *            The preference for proxy phone number reuse, or stickiness,
     *            between the same participants across sessions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NumberSelectionBehavior
     */
    public CreateProxySessionRequest withNumberSelectionBehavior(
            NumberSelectionBehavior numberSelectionBehavior) {
        this.numberSelectionBehavior = numberSelectionBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The preference for matching the country or area code of the proxy phone
     * number with that of the first participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Country, AreaCode
     *
     * @return <p>
     *         The preference for matching the country or area code of the proxy
     *         phone number with that of the first participant.
     *         </p>
     * @see GeoMatchLevel
     */
    public String getGeoMatchLevel() {
        return geoMatchLevel;
    }

    /**
     * <p>
     * The preference for matching the country or area code of the proxy phone
     * number with that of the first participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Country, AreaCode
     *
     * @param geoMatchLevel <p>
     *            The preference for matching the country or area code of the
     *            proxy phone number with that of the first participant.
     *            </p>
     * @see GeoMatchLevel
     */
    public void setGeoMatchLevel(String geoMatchLevel) {
        this.geoMatchLevel = geoMatchLevel;
    }

    /**
     * <p>
     * The preference for matching the country or area code of the proxy phone
     * number with that of the first participant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Country, AreaCode
     *
     * @param geoMatchLevel <p>
     *            The preference for matching the country or area code of the
     *            proxy phone number with that of the first participant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GeoMatchLevel
     */
    public CreateProxySessionRequest withGeoMatchLevel(String geoMatchLevel) {
        this.geoMatchLevel = geoMatchLevel;
        return this;
    }

    /**
     * <p>
     * The preference for matching the country or area code of the proxy phone
     * number with that of the first participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Country, AreaCode
     *
     * @param geoMatchLevel <p>
     *            The preference for matching the country or area code of the
     *            proxy phone number with that of the first participant.
     *            </p>
     * @see GeoMatchLevel
     */
    public void setGeoMatchLevel(GeoMatchLevel geoMatchLevel) {
        this.geoMatchLevel = geoMatchLevel.toString();
    }

    /**
     * <p>
     * The preference for matching the country or area code of the proxy phone
     * number with that of the first participant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Country, AreaCode
     *
     * @param geoMatchLevel <p>
     *            The preference for matching the country or area code of the
     *            proxy phone number with that of the first participant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GeoMatchLevel
     */
    public CreateProxySessionRequest withGeoMatchLevel(GeoMatchLevel geoMatchLevel) {
        this.geoMatchLevel = geoMatchLevel.toString();
        return this;
    }

    /**
     * <p>
     * The country and area code for the proxy phone number.
     * </p>
     *
     * @return <p>
     *         The country and area code for the proxy phone number.
     *         </p>
     */
    public GeoMatchParams getGeoMatchParams() {
        return geoMatchParams;
    }

    /**
     * <p>
     * The country and area code for the proxy phone number.
     * </p>
     *
     * @param geoMatchParams <p>
     *            The country and area code for the proxy phone number.
     *            </p>
     */
    public void setGeoMatchParams(GeoMatchParams geoMatchParams) {
        this.geoMatchParams = geoMatchParams;
    }

    /**
     * <p>
     * The country and area code for the proxy phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geoMatchParams <p>
     *            The country and area code for the proxy phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProxySessionRequest withGeoMatchParams(GeoMatchParams geoMatchParams) {
        this.geoMatchParams = geoMatchParams;
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
        if (getParticipantPhoneNumbers() != null)
            sb.append("ParticipantPhoneNumbers: " + getParticipantPhoneNumbers() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getExpiryMinutes() != null)
            sb.append("ExpiryMinutes: " + getExpiryMinutes() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getNumberSelectionBehavior() != null)
            sb.append("NumberSelectionBehavior: " + getNumberSelectionBehavior() + ",");
        if (getGeoMatchLevel() != null)
            sb.append("GeoMatchLevel: " + getGeoMatchLevel() + ",");
        if (getGeoMatchParams() != null)
            sb.append("GeoMatchParams: " + getGeoMatchParams());
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
                + ((getParticipantPhoneNumbers() == null) ? 0 : getParticipantPhoneNumbers()
                        .hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getExpiryMinutes() == null) ? 0 : getExpiryMinutes().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberSelectionBehavior() == null) ? 0 : getNumberSelectionBehavior()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGeoMatchLevel() == null) ? 0 : getGeoMatchLevel().hashCode());
        hashCode = prime * hashCode
                + ((getGeoMatchParams() == null) ? 0 : getGeoMatchParams().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProxySessionRequest == false)
            return false;
        CreateProxySessionRequest other = (CreateProxySessionRequest) obj;

        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null
                && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getParticipantPhoneNumbers() == null ^ this.getParticipantPhoneNumbers() == null)
            return false;
        if (other.getParticipantPhoneNumbers() != null
                && other.getParticipantPhoneNumbers().equals(this.getParticipantPhoneNumbers()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getExpiryMinutes() == null ^ this.getExpiryMinutes() == null)
            return false;
        if (other.getExpiryMinutes() != null
                && other.getExpiryMinutes().equals(this.getExpiryMinutes()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null
                && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getNumberSelectionBehavior() == null ^ this.getNumberSelectionBehavior() == null)
            return false;
        if (other.getNumberSelectionBehavior() != null
                && other.getNumberSelectionBehavior().equals(this.getNumberSelectionBehavior()) == false)
            return false;
        if (other.getGeoMatchLevel() == null ^ this.getGeoMatchLevel() == null)
            return false;
        if (other.getGeoMatchLevel() != null
                && other.getGeoMatchLevel().equals(this.getGeoMatchLevel()) == false)
            return false;
        if (other.getGeoMatchParams() == null ^ this.getGeoMatchParams() == null)
            return false;
        if (other.getGeoMatchParams() != null
                && other.getGeoMatchParams().equals(this.getGeoMatchParams()) == false)
            return false;
        return true;
    }
}
