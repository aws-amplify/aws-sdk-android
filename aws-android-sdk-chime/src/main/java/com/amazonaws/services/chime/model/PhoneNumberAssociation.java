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
 * The phone number associations, such as Amazon Chime account ID, Amazon Chime
 * user ID, Amazon Chime Voice Connector ID, or Amazon Chime Voice Connector
 * group ID.
 * </p>
 */
public class PhoneNumberAssociation implements Serializable {
    /**
     * <p>
     * Contains the ID for the entity specified in Name.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Defines the association with an Amazon Chime account ID, user ID, Amazon
     * Chime Voice Connector ID, or Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     */
    private String name;

    /**
     * <p>
     * The timestamp of the phone number association, in ISO 8601 format.
     * </p>
     */
    private java.util.Date associatedTimestamp;

    /**
     * <p>
     * Contains the ID for the entity specified in Name.
     * </p>
     *
     * @return <p>
     *         Contains the ID for the entity specified in Name.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * Contains the ID for the entity specified in Name.
     * </p>
     *
     * @param value <p>
     *            Contains the ID for the entity specified in Name.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Contains the ID for the entity specified in Name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            Contains the ID for the entity specified in Name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberAssociation withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * Defines the association with an Amazon Chime account ID, user ID, Amazon
     * Chime Voice Connector ID, or Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     *
     * @return <p>
     *         Defines the association with an Amazon Chime account ID, user ID,
     *         Amazon Chime Voice Connector ID, or Amazon Chime Voice Connector
     *         group ID.
     *         </p>
     * @see PhoneNumberAssociationName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Defines the association with an Amazon Chime account ID, user ID, Amazon
     * Chime Voice Connector ID, or Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     *
     * @param name <p>
     *            Defines the association with an Amazon Chime account ID, user
     *            ID, Amazon Chime Voice Connector ID, or Amazon Chime Voice
     *            Connector group ID.
     *            </p>
     * @see PhoneNumberAssociationName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Defines the association with an Amazon Chime account ID, user ID, Amazon
     * Chime Voice Connector ID, or Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     *
     * @param name <p>
     *            Defines the association with an Amazon Chime account ID, user
     *            ID, Amazon Chime Voice Connector ID, or Amazon Chime Voice
     *            Connector group ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberAssociationName
     */
    public PhoneNumberAssociation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Defines the association with an Amazon Chime account ID, user ID, Amazon
     * Chime Voice Connector ID, or Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     *
     * @param name <p>
     *            Defines the association with an Amazon Chime account ID, user
     *            ID, Amazon Chime Voice Connector ID, or Amazon Chime Voice
     *            Connector group ID.
     *            </p>
     * @see PhoneNumberAssociationName
     */
    public void setName(PhoneNumberAssociationName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * Defines the association with an Amazon Chime account ID, user ID, Amazon
     * Chime Voice Connector ID, or Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     *
     * @param name <p>
     *            Defines the association with an Amazon Chime account ID, user
     *            ID, Amazon Chime Voice Connector ID, or Amazon Chime Voice
     *            Connector group ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberAssociationName
     */
    public PhoneNumberAssociation withName(PhoneNumberAssociationName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of the phone number association, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The timestamp of the phone number association, in ISO 8601
     *         format.
     *         </p>
     */
    public java.util.Date getAssociatedTimestamp() {
        return associatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of the phone number association, in ISO 8601 format.
     * </p>
     *
     * @param associatedTimestamp <p>
     *            The timestamp of the phone number association, in ISO 8601
     *            format.
     *            </p>
     */
    public void setAssociatedTimestamp(java.util.Date associatedTimestamp) {
        this.associatedTimestamp = associatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of the phone number association, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedTimestamp <p>
     *            The timestamp of the phone number association, in ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberAssociation withAssociatedTimestamp(java.util.Date associatedTimestamp) {
        this.associatedTimestamp = associatedTimestamp;
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getAssociatedTimestamp() != null)
            sb.append("AssociatedTimestamp: " + getAssociatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getAssociatedTimestamp() == null) ? 0 : getAssociatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberAssociation == false)
            return false;
        PhoneNumberAssociation other = (PhoneNumberAssociation) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAssociatedTimestamp() == null ^ this.getAssociatedTimestamp() == null)
            return false;
        if (other.getAssociatedTimestamp() != null
                && other.getAssociatedTimestamp().equals(this.getAssociatedTimestamp()) == false)
            return false;
        return true;
    }
}
