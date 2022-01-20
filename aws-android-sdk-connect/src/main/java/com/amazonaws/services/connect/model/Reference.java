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

/**
 * <p>
 * A link that an agent selects to complete a given task. You can have up to
 * 4,096 UTF-8 bytes across all references for a contact.
 * </p>
 */
public class Reference implements Serializable {
    /**
     * <p>
     * A valid value for the reference. For example, for a URL reference, a
     * formatted URL that is displayed to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String value;

    /**
     * <p>
     * The type of the reference. Only <code>URL</code> type can be added or
     * updated on a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URL, ATTACHMENT
     */
    private String type;

    /**
     * <p>
     * A valid value for the reference. For example, for a URL reference, a
     * formatted URL that is displayed to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return <p>
     *         A valid value for the reference. For example, for a URL
     *         reference, a formatted URL that is displayed to an agent in the
     *         Contact Control Panel (CCP).
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * A valid value for the reference. For example, for a URL reference, a
     * formatted URL that is displayed to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param value <p>
     *            A valid value for the reference. For example, for a URL
     *            reference, a formatted URL that is displayed to an agent in
     *            the Contact Control Panel (CCP).
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A valid value for the reference. For example, for a URL reference, a
     * formatted URL that is displayed to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param value <p>
     *            A valid value for the reference. For example, for a URL
     *            reference, a formatted URL that is displayed to an agent in
     *            the Contact Control Panel (CCP).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Reference withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The type of the reference. Only <code>URL</code> type can be added or
     * updated on a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URL, ATTACHMENT
     *
     * @return <p>
     *         The type of the reference. Only <code>URL</code> type can be
     *         added or updated on a contact.
     *         </p>
     * @see ReferenceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the reference. Only <code>URL</code> type can be added or
     * updated on a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URL, ATTACHMENT
     *
     * @param type <p>
     *            The type of the reference. Only <code>URL</code> type can be
     *            added or updated on a contact.
     *            </p>
     * @see ReferenceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the reference. Only <code>URL</code> type can be added or
     * updated on a contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URL, ATTACHMENT
     *
     * @param type <p>
     *            The type of the reference. Only <code>URL</code> type can be
     *            added or updated on a contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReferenceType
     */
    public Reference withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the reference. Only <code>URL</code> type can be added or
     * updated on a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URL, ATTACHMENT
     *
     * @param type <p>
     *            The type of the reference. Only <code>URL</code> type can be
     *            added or updated on a contact.
     *            </p>
     * @see ReferenceType
     */
    public void setType(ReferenceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the reference. Only <code>URL</code> type can be added or
     * updated on a contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>URL, ATTACHMENT
     *
     * @param type <p>
     *            The type of the reference. Only <code>URL</code> type can be
     *            added or updated on a contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReferenceType
     */
    public Reference withType(ReferenceType type) {
        this.type = type.toString();
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
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Reference == false)
            return false;
        Reference other = (Reference) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
