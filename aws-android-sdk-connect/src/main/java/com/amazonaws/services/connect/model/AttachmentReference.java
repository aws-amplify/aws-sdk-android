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
 * Information about the attachment reference if the <code>referenceType</code>
 * is <code>ATTACHMENT</code>. Otherwise, null.
 * </p>
 */
public class AttachmentReference implements Serializable {
    /**
     * <p>
     * Identifier of the attachment reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String name;

    /**
     * <p>
     * Contains the location path of the attachment reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String value;

    /**
     * <p>
     * Status of an attachment reference type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED
     */
    private String status;

    /**
     * <p>
     * Identifier of the attachment reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         Identifier of the attachment reference.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Identifier of the attachment reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param name <p>
     *            Identifier of the attachment reference.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Identifier of the attachment reference.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param name <p>
     *            Identifier of the attachment reference.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentReference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Contains the location path of the attachment reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return <p>
     *         Contains the location path of the attachment reference.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * Contains the location path of the attachment reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param value <p>
     *            Contains the location path of the attachment reference.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Contains the location path of the attachment reference.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param value <p>
     *            Contains the location path of the attachment reference.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachmentReference withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * Status of an attachment reference type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED
     *
     * @return <p>
     *         Status of an attachment reference type.
     *         </p>
     * @see ReferenceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status of an attachment reference type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED
     *
     * @param status <p>
     *            Status of an attachment reference type.
     *            </p>
     * @see ReferenceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of an attachment reference type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED
     *
     * @param status <p>
     *            Status of an attachment reference type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReferenceStatus
     */
    public AttachmentReference withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Status of an attachment reference type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED
     *
     * @param status <p>
     *            Status of an attachment reference type.
     *            </p>
     * @see ReferenceStatus
     */
    public void setStatus(ReferenceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Status of an attachment reference type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED
     *
     * @param status <p>
     *            Status of an attachment reference type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReferenceStatus
     */
    public AttachmentReference withStatus(ReferenceStatus status) {
        this.status = status.toString();
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachmentReference == false)
            return false;
        AttachmentReference other = (AttachmentReference) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
