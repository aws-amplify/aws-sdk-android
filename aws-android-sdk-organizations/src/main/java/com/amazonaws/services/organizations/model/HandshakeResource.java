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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

/**
 * <p>
 * Contains additional data that is needed to process a handshake.
 * </p>
 */
public class HandshakeResource implements Serializable {
    /**
     * <p>
     * The information that is passed to the other party in the handshake. The
     * format of the value string must match the requirements of the specified
     * type.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of information being passed, specifying how the value is to be
     * interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with
     * the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with
     * the master account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master
     * account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator
     * and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, ORGANIZATION_FEATURE_SET,
     * EMAIL, MASTER_EMAIL, MASTER_NAME, NOTES, PARENT_HANDSHAKE
     */
    private String type;

    /**
     * <p>
     * When needed, contains an additional array of
     * <code>HandshakeResource</code> objects.
     * </p>
     */
    private java.util.List<HandshakeResource> resources;

    /**
     * <p>
     * The information that is passed to the other party in the handshake. The
     * format of the value string must match the requirements of the specified
     * type.
     * </p>
     *
     * @return <p>
     *         The information that is passed to the other party in the
     *         handshake. The format of the value string must match the
     *         requirements of the specified type.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The information that is passed to the other party in the handshake. The
     * format of the value string must match the requirements of the specified
     * type.
     * </p>
     *
     * @param value <p>
     *            The information that is passed to the other party in the
     *            handshake. The format of the value string must match the
     *            requirements of the specified type.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The information that is passed to the other party in the handshake. The
     * format of the value string must match the requirements of the specified
     * type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The information that is passed to the other party in the
     *            handshake. The format of the value string must match the
     *            requirements of the specified type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HandshakeResource withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The type of information being passed, specifying how the value is to be
     * interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with
     * the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with
     * the master account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master
     * account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator
     * and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, ORGANIZATION_FEATURE_SET,
     * EMAIL, MASTER_EMAIL, MASTER_NAME, NOTES, PARENT_HANDSHAKE
     *
     * @return <p>
     *         The type of information being passed, specifying how the value is
     *         to be interpreted by the other party:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACCOUNT</code> - Specifies an AWS account ID number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ORGANIZATION</code> - Specifies an organization ID number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EMAIL</code> - Specifies the email address that is
     *         associated with the account that receives the handshake.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OWNER_EMAIL</code> - Specifies the email address associated
     *         with the master account. Included as information about an
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OWNER_NAME</code> - Specifies the name associated with the
     *         master account. Included as information about an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOTES</code> - Additional text provided by the handshake
     *         initiator and intended for the recipient to read.
     *         </p>
     *         </li>
     *         </ul>
     * @see HandshakeResourceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of information being passed, specifying how the value is to be
     * interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with
     * the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with
     * the master account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master
     * account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator
     * and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, ORGANIZATION_FEATURE_SET,
     * EMAIL, MASTER_EMAIL, MASTER_NAME, NOTES, PARENT_HANDSHAKE
     *
     * @param type <p>
     *            The type of information being passed, specifying how the value
     *            is to be interpreted by the other party:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACCOUNT</code> - Specifies an AWS account ID number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ORGANIZATION</code> - Specifies an organization ID
     *            number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EMAIL</code> - Specifies the email address that is
     *            associated with the account that receives the handshake.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OWNER_EMAIL</code> - Specifies the email address
     *            associated with the master account. Included as information
     *            about an organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OWNER_NAME</code> - Specifies the name associated with
     *            the master account. Included as information about an
     *            organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTES</code> - Additional text provided by the handshake
     *            initiator and intended for the recipient to read.
     *            </p>
     *            </li>
     *            </ul>
     * @see HandshakeResourceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of information being passed, specifying how the value is to be
     * interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with
     * the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with
     * the master account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master
     * account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator
     * and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, ORGANIZATION_FEATURE_SET,
     * EMAIL, MASTER_EMAIL, MASTER_NAME, NOTES, PARENT_HANDSHAKE
     *
     * @param type <p>
     *            The type of information being passed, specifying how the value
     *            is to be interpreted by the other party:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACCOUNT</code> - Specifies an AWS account ID number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ORGANIZATION</code> - Specifies an organization ID
     *            number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EMAIL</code> - Specifies the email address that is
     *            associated with the account that receives the handshake.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OWNER_EMAIL</code> - Specifies the email address
     *            associated with the master account. Included as information
     *            about an organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OWNER_NAME</code> - Specifies the name associated with
     *            the master account. Included as information about an
     *            organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTES</code> - Additional text provided by the handshake
     *            initiator and intended for the recipient to read.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HandshakeResourceType
     */
    public HandshakeResource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of information being passed, specifying how the value is to be
     * interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with
     * the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with
     * the master account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master
     * account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator
     * and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, ORGANIZATION_FEATURE_SET,
     * EMAIL, MASTER_EMAIL, MASTER_NAME, NOTES, PARENT_HANDSHAKE
     *
     * @param type <p>
     *            The type of information being passed, specifying how the value
     *            is to be interpreted by the other party:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACCOUNT</code> - Specifies an AWS account ID number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ORGANIZATION</code> - Specifies an organization ID
     *            number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EMAIL</code> - Specifies the email address that is
     *            associated with the account that receives the handshake.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OWNER_EMAIL</code> - Specifies the email address
     *            associated with the master account. Included as information
     *            about an organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OWNER_NAME</code> - Specifies the name associated with
     *            the master account. Included as information about an
     *            organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTES</code> - Additional text provided by the handshake
     *            initiator and intended for the recipient to read.
     *            </p>
     *            </li>
     *            </ul>
     * @see HandshakeResourceType
     */
    public void setType(HandshakeResourceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of information being passed, specifying how the value is to be
     * interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with
     * the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with
     * the master account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master
     * account. Included as information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator
     * and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, ORGANIZATION_FEATURE_SET,
     * EMAIL, MASTER_EMAIL, MASTER_NAME, NOTES, PARENT_HANDSHAKE
     *
     * @param type <p>
     *            The type of information being passed, specifying how the value
     *            is to be interpreted by the other party:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACCOUNT</code> - Specifies an AWS account ID number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ORGANIZATION</code> - Specifies an organization ID
     *            number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EMAIL</code> - Specifies the email address that is
     *            associated with the account that receives the handshake.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OWNER_EMAIL</code> - Specifies the email address
     *            associated with the master account. Included as information
     *            about an organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OWNER_NAME</code> - Specifies the name associated with
     *            the master account. Included as information about an
     *            organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTES</code> - Additional text provided by the handshake
     *            initiator and intended for the recipient to read.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HandshakeResourceType
     */
    public HandshakeResource withType(HandshakeResourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * When needed, contains an additional array of
     * <code>HandshakeResource</code> objects.
     * </p>
     *
     * @return <p>
     *         When needed, contains an additional array of
     *         <code>HandshakeResource</code> objects.
     *         </p>
     */
    public java.util.List<HandshakeResource> getResources() {
        return resources;
    }

    /**
     * <p>
     * When needed, contains an additional array of
     * <code>HandshakeResource</code> objects.
     * </p>
     *
     * @param resources <p>
     *            When needed, contains an additional array of
     *            <code>HandshakeResource</code> objects.
     *            </p>
     */
    public void setResources(java.util.Collection<HandshakeResource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<HandshakeResource>(resources);
    }

    /**
     * <p>
     * When needed, contains an additional array of
     * <code>HandshakeResource</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            When needed, contains an additional array of
     *            <code>HandshakeResource</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HandshakeResource withResources(HandshakeResource... resources) {
        if (getResources() == null) {
            this.resources = new java.util.ArrayList<HandshakeResource>(resources.length);
        }
        for (HandshakeResource value : resources) {
            this.resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * When needed, contains an additional array of
     * <code>HandshakeResource</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            When needed, contains an additional array of
     *            <code>HandshakeResource</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HandshakeResource withResources(java.util.Collection<HandshakeResource> resources) {
        setResources(resources);
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HandshakeResource == false)
            return false;
        HandshakeResource other = (HandshakeResource) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }
}
