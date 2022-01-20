/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Adds or updates user-defined contact information associated with the
 * specified contact. At least one field to be updated must be present in the
 * request.
 * </p>
 * <important>
 * <p>
 * You can add or update user-defined contact information for both ongoing and
 * completed contacts.
 * </p>
 * </important>
 */
public class UpdateContactRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with your contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactId;

    /**
     * <p>
     * The name of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String description;

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     */
    private java.util.Map<String, Reference> references;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with your contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact. This is the identifier of the
     *         contact associated with the first interaction with your contact
     *         center.
     *         </p>
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with your contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact. This is the identifier of the
     *            contact associated with the first interaction with your
     *            contact center.
     *            </p>
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with your contact center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact. This is the identifier of the
     *            contact associated with the first interaction with your
     *            contact center.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactRequest withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return <p>
     *         The name of the contact.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param name <p>
     *            The name of the contact.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param name <p>
     *            The name of the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return <p>
     *         The description of the contact.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param description <p>
     *            The description of the contact.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param description <p>
     *            The description of the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     *
     * @return <p>
     *         A formatted URL that is shown to an agent in the Contact Control
     *         Panel (CCP).
     *         </p>
     */
    public java.util.Map<String, Reference> getReferences() {
        return references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     *
     * @param references <p>
     *            A formatted URL that is shown to an agent in the Contact
     *            Control Panel (CCP).
     *            </p>
     */
    public void setReferences(java.util.Map<String, Reference> references) {
        this.references = references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param references <p>
     *            A formatted URL that is shown to an agent in the Contact
     *            Control Panel (CCP).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactRequest withReferences(java.util.Map<String, Reference> references) {
        this.references = references;
        return this;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     * <p>
     * The method adds a new key-value pair into References parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into References.
     * @param value The corresponding value of the entry to be added into
     *            References.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactRequest addReferencesEntry(String key, Reference value) {
        if (null == this.references) {
            this.references = new java.util.HashMap<String, Reference>();
        }
        if (this.references.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.references.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into References.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateContactRequest clearReferencesEntries() {
        this.references = null;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getContactId() != null)
            sb.append("ContactId: " + getContactId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getReferences() != null)
            sb.append("References: " + getReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactRequest == false)
            return false;
        UpdateContactRequest other = (UpdateContactRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null
                && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null
                && other.getReferences().equals(this.getReferences()) == false)
            return false;
        return true;
    }
}
