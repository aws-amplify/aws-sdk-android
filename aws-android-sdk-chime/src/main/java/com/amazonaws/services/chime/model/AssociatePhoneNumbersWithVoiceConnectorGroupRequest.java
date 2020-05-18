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
 * Associates phone numbers with the specified Amazon Chime Voice Connector
 * group.
 * </p>
 */
public class AssociatePhoneNumbersWithVoiceConnectorGroupRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String voiceConnectorGroupId;

    /**
     * <p>
     * List of phone numbers, in E.164 format.
     * </p>
     */
    private java.util.List<String> e164PhoneNumbers;

    /**
     * <p>
     * If true, associates the provided phone numbers with the provided Amazon
     * Chime Voice Connector Group and removes any previously existing
     * associations. If false, does not associate any phone numbers that have
     * previously existing associations.
     * </p>
     */
    private Boolean forceAssociate;

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Chime Voice Connector group ID.
     *         </p>
     */
    public String getVoiceConnectorGroupId() {
        return voiceConnectorGroupId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorGroupId <p>
     *            The Amazon Chime Voice Connector group ID.
     *            </p>
     */
    public void setVoiceConnectorGroupId(String voiceConnectorGroupId) {
        this.voiceConnectorGroupId = voiceConnectorGroupId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorGroupId <p>
     *            The Amazon Chime Voice Connector group ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatePhoneNumbersWithVoiceConnectorGroupRequest withVoiceConnectorGroupId(
            String voiceConnectorGroupId) {
        this.voiceConnectorGroupId = voiceConnectorGroupId;
        return this;
    }

    /**
     * <p>
     * List of phone numbers, in E.164 format.
     * </p>
     *
     * @return <p>
     *         List of phone numbers, in E.164 format.
     *         </p>
     */
    public java.util.List<String> getE164PhoneNumbers() {
        return e164PhoneNumbers;
    }

    /**
     * <p>
     * List of phone numbers, in E.164 format.
     * </p>
     *
     * @param e164PhoneNumbers <p>
     *            List of phone numbers, in E.164 format.
     *            </p>
     */
    public void setE164PhoneNumbers(java.util.Collection<String> e164PhoneNumbers) {
        if (e164PhoneNumbers == null) {
            this.e164PhoneNumbers = null;
            return;
        }

        this.e164PhoneNumbers = new java.util.ArrayList<String>(e164PhoneNumbers);
    }

    /**
     * <p>
     * List of phone numbers, in E.164 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param e164PhoneNumbers <p>
     *            List of phone numbers, in E.164 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatePhoneNumbersWithVoiceConnectorGroupRequest withE164PhoneNumbers(
            String... e164PhoneNumbers) {
        if (getE164PhoneNumbers() == null) {
            this.e164PhoneNumbers = new java.util.ArrayList<String>(e164PhoneNumbers.length);
        }
        for (String value : e164PhoneNumbers) {
            this.e164PhoneNumbers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of phone numbers, in E.164 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param e164PhoneNumbers <p>
     *            List of phone numbers, in E.164 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatePhoneNumbersWithVoiceConnectorGroupRequest withE164PhoneNumbers(
            java.util.Collection<String> e164PhoneNumbers) {
        setE164PhoneNumbers(e164PhoneNumbers);
        return this;
    }

    /**
     * <p>
     * If true, associates the provided phone numbers with the provided Amazon
     * Chime Voice Connector Group and removes any previously existing
     * associations. If false, does not associate any phone numbers that have
     * previously existing associations.
     * </p>
     *
     * @return <p>
     *         If true, associates the provided phone numbers with the provided
     *         Amazon Chime Voice Connector Group and removes any previously
     *         existing associations. If false, does not associate any phone
     *         numbers that have previously existing associations.
     *         </p>
     */
    public Boolean isForceAssociate() {
        return forceAssociate;
    }

    /**
     * <p>
     * If true, associates the provided phone numbers with the provided Amazon
     * Chime Voice Connector Group and removes any previously existing
     * associations. If false, does not associate any phone numbers that have
     * previously existing associations.
     * </p>
     *
     * @return <p>
     *         If true, associates the provided phone numbers with the provided
     *         Amazon Chime Voice Connector Group and removes any previously
     *         existing associations. If false, does not associate any phone
     *         numbers that have previously existing associations.
     *         </p>
     */
    public Boolean getForceAssociate() {
        return forceAssociate;
    }

    /**
     * <p>
     * If true, associates the provided phone numbers with the provided Amazon
     * Chime Voice Connector Group and removes any previously existing
     * associations. If false, does not associate any phone numbers that have
     * previously existing associations.
     * </p>
     *
     * @param forceAssociate <p>
     *            If true, associates the provided phone numbers with the
     *            provided Amazon Chime Voice Connector Group and removes any
     *            previously existing associations. If false, does not associate
     *            any phone numbers that have previously existing associations.
     *            </p>
     */
    public void setForceAssociate(Boolean forceAssociate) {
        this.forceAssociate = forceAssociate;
    }

    /**
     * <p>
     * If true, associates the provided phone numbers with the provided Amazon
     * Chime Voice Connector Group and removes any previously existing
     * associations. If false, does not associate any phone numbers that have
     * previously existing associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceAssociate <p>
     *            If true, associates the provided phone numbers with the
     *            provided Amazon Chime Voice Connector Group and removes any
     *            previously existing associations. If false, does not associate
     *            any phone numbers that have previously existing associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatePhoneNumbersWithVoiceConnectorGroupRequest withForceAssociate(
            Boolean forceAssociate) {
        this.forceAssociate = forceAssociate;
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
        if (getVoiceConnectorGroupId() != null)
            sb.append("VoiceConnectorGroupId: " + getVoiceConnectorGroupId() + ",");
        if (getE164PhoneNumbers() != null)
            sb.append("E164PhoneNumbers: " + getE164PhoneNumbers() + ",");
        if (getForceAssociate() != null)
            sb.append("ForceAssociate: " + getForceAssociate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVoiceConnectorGroupId() == null) ? 0 : getVoiceConnectorGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getE164PhoneNumbers() == null) ? 0 : getE164PhoneNumbers().hashCode());
        hashCode = prime * hashCode
                + ((getForceAssociate() == null) ? 0 : getForceAssociate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatePhoneNumbersWithVoiceConnectorGroupRequest == false)
            return false;
        AssociatePhoneNumbersWithVoiceConnectorGroupRequest other = (AssociatePhoneNumbersWithVoiceConnectorGroupRequest) obj;

        if (other.getVoiceConnectorGroupId() == null ^ this.getVoiceConnectorGroupId() == null)
            return false;
        if (other.getVoiceConnectorGroupId() != null
                && other.getVoiceConnectorGroupId().equals(this.getVoiceConnectorGroupId()) == false)
            return false;
        if (other.getE164PhoneNumbers() == null ^ this.getE164PhoneNumbers() == null)
            return false;
        if (other.getE164PhoneNumbers() != null
                && other.getE164PhoneNumbers().equals(this.getE164PhoneNumbers()) == false)
            return false;
        if (other.getForceAssociate() == null ^ this.getForceAssociate() == null)
            return false;
        if (other.getForceAssociate() != null
                && other.getForceAssociate().equals(this.getForceAssociate()) == false)
            return false;
        return true;
    }
}
