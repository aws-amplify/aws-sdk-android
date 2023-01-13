/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about the task action.
 * </p>
 */
public class TaskActionDefinition implements Serializable {
    /**
     * <p>
     * The name. Supports variable injection. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String name;

    /**
     * <p>
     * The description. Supports variable injection. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String description;

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String contactFlowId;

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is
     * <code>URL</code>. Otherwise, null. (Supports variable injection in the
     * <code>Value</code> field.)
     * </p>
     */
    private java.util.Map<String, Reference> references;

    /**
     * <p>
     * The name. Supports variable injection. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The name. Supports variable injection. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *         >JSONPath reference</a> in the <i>Amazon Connect Administrators
     *         Guide</i>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name. Supports variable injection. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param name <p>
     *            The name. Supports variable injection. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *            >JSONPath reference</a> in the <i>Amazon Connect
     *            Administrators Guide</i>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name. Supports variable injection. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param name <p>
     *            The name. Supports variable injection. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *            >JSONPath reference</a> in the <i>Amazon Connect
     *            Administrators Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskActionDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description. Supports variable injection. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return <p>
     *         The description. Supports variable injection. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *         >JSONPath reference</a> in the <i>Amazon Connect Administrators
     *         Guide</i>.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description. Supports variable injection. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param description <p>
     *            The description. Supports variable injection. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *            >JSONPath reference</a> in the <i>Amazon Connect
     *            Administrators Guide</i>.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description. Supports variable injection. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param description <p>
     *            The description. Supports variable injection. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *            >JSONPath reference</a> in the <i>Amazon Connect
     *            Administrators Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskActionDefinition withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The identifier of the flow.
     *         </p>
     */
    public String getContactFlowId() {
        return contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the flow.
     *            </p>
     */
    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskActionDefinition withContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is
     * <code>URL</code>. Otherwise, null. (Supports variable injection in the
     * <code>Value</code> field.)
     * </p>
     *
     * @return <p>
     *         Information about the reference when the
     *         <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     *         (Supports variable injection in the <code>Value</code> field.)
     *         </p>
     */
    public java.util.Map<String, Reference> getReferences() {
        return references;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is
     * <code>URL</code>. Otherwise, null. (Supports variable injection in the
     * <code>Value</code> field.)
     * </p>
     *
     * @param references <p>
     *            Information about the reference when the
     *            <code>referenceType</code> is <code>URL</code>. Otherwise,
     *            null. (Supports variable injection in the <code>Value</code>
     *            field.)
     *            </p>
     */
    public void setReferences(java.util.Map<String, Reference> references) {
        this.references = references;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is
     * <code>URL</code>. Otherwise, null. (Supports variable injection in the
     * <code>Value</code> field.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param references <p>
     *            Information about the reference when the
     *            <code>referenceType</code> is <code>URL</code>. Otherwise,
     *            null. (Supports variable injection in the <code>Value</code>
     *            field.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskActionDefinition withReferences(java.util.Map<String, Reference> references) {
        this.references = references;
        return this;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is
     * <code>URL</code>. Otherwise, null. (Supports variable injection in the
     * <code>Value</code> field.)
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
    public TaskActionDefinition addReferencesEntry(String key, Reference value) {
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
    public TaskActionDefinition clearReferencesEntries() {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: " + getContactFlowId() + ",");
        if (getReferences() != null)
            sb.append("References: " + getReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskActionDefinition == false)
            return false;
        TaskActionDefinition other = (TaskActionDefinition) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null
                && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null
                && other.getReferences().equals(this.getReferences()) == false)
            return false;
        return true;
    }
}
