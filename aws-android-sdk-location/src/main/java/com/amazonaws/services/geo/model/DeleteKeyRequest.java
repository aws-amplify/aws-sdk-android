/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the specified API key. The API key must have been deactivated more
 * than 90 days previously.
 * </p>
 */
public class DeleteKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the API key to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String keyName;

    /**
     * <p>
     * ForceDelete bypasses an API key's expiry conditions and deletes the key.
     * Set the parameter <code>true</code> to delete the key or to
     * <code>false</code> to not preemptively delete the API key.
     * </p>
     * <p>
     * Valid values: <code>true</code>, or <code>false</code>.
     * </p>
     * <p>
     * Required: No
     * </p>
     * <note>
     * <p>
     * This action is irreversible. Only use ForceDelete if you are certain the
     * key is no longer in use.
     * </p>
     * </note>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The name of the API key to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         The name of the API key to delete.
     *         </p>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * The name of the API key to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param keyName <p>
     *            The name of the API key to delete.
     *            </p>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the API key to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param keyName <p>
     *            The name of the API key to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteKeyRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * ForceDelete bypasses an API key's expiry conditions and deletes the key.
     * Set the parameter <code>true</code> to delete the key or to
     * <code>false</code> to not preemptively delete the API key.
     * </p>
     * <p>
     * Valid values: <code>true</code>, or <code>false</code>.
     * </p>
     * <p>
     * Required: No
     * </p>
     * <note>
     * <p>
     * This action is irreversible. Only use ForceDelete if you are certain the
     * key is no longer in use.
     * </p>
     * </note>
     *
     * @return <p>
     *         ForceDelete bypasses an API key's expiry conditions and deletes
     *         the key. Set the parameter <code>true</code> to delete the key or
     *         to <code>false</code> to not preemptively delete the API key.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code>, or <code>false</code>.
     *         </p>
     *         <p>
     *         Required: No
     *         </p>
     *         <note>
     *         <p>
     *         This action is irreversible. Only use ForceDelete if you are
     *         certain the key is no longer in use.
     *         </p>
     *         </note>
     */
    public Boolean isForceDelete() {
        return forceDelete;
    }

    /**
     * <p>
     * ForceDelete bypasses an API key's expiry conditions and deletes the key.
     * Set the parameter <code>true</code> to delete the key or to
     * <code>false</code> to not preemptively delete the API key.
     * </p>
     * <p>
     * Valid values: <code>true</code>, or <code>false</code>.
     * </p>
     * <p>
     * Required: No
     * </p>
     * <note>
     * <p>
     * This action is irreversible. Only use ForceDelete if you are certain the
     * key is no longer in use.
     * </p>
     * </note>
     *
     * @return <p>
     *         ForceDelete bypasses an API key's expiry conditions and deletes
     *         the key. Set the parameter <code>true</code> to delete the key or
     *         to <code>false</code> to not preemptively delete the API key.
     *         </p>
     *         <p>
     *         Valid values: <code>true</code>, or <code>false</code>.
     *         </p>
     *         <p>
     *         Required: No
     *         </p>
     *         <note>
     *         <p>
     *         This action is irreversible. Only use ForceDelete if you are
     *         certain the key is no longer in use.
     *         </p>
     *         </note>
     */
    public Boolean getForceDelete() {
        return forceDelete;
    }

    /**
     * <p>
     * ForceDelete bypasses an API key's expiry conditions and deletes the key.
     * Set the parameter <code>true</code> to delete the key or to
     * <code>false</code> to not preemptively delete the API key.
     * </p>
     * <p>
     * Valid values: <code>true</code>, or <code>false</code>.
     * </p>
     * <p>
     * Required: No
     * </p>
     * <note>
     * <p>
     * This action is irreversible. Only use ForceDelete if you are certain the
     * key is no longer in use.
     * </p>
     * </note>
     *
     * @param forceDelete <p>
     *            ForceDelete bypasses an API key's expiry conditions and
     *            deletes the key. Set the parameter <code>true</code> to delete
     *            the key or to <code>false</code> to not preemptively delete
     *            the API key.
     *            </p>
     *            <p>
     *            Valid values: <code>true</code>, or <code>false</code>.
     *            </p>
     *            <p>
     *            Required: No
     *            </p>
     *            <note>
     *            <p>
     *            This action is irreversible. Only use ForceDelete if you are
     *            certain the key is no longer in use.
     *            </p>
     *            </note>
     */
    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * ForceDelete bypasses an API key's expiry conditions and deletes the key.
     * Set the parameter <code>true</code> to delete the key or to
     * <code>false</code> to not preemptively delete the API key.
     * </p>
     * <p>
     * Valid values: <code>true</code>, or <code>false</code>.
     * </p>
     * <p>
     * Required: No
     * </p>
     * <note>
     * <p>
     * This action is irreversible. Only use ForceDelete if you are certain the
     * key is no longer in use.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceDelete <p>
     *            ForceDelete bypasses an API key's expiry conditions and
     *            deletes the key. Set the parameter <code>true</code> to delete
     *            the key or to <code>false</code> to not preemptively delete
     *            the API key.
     *            </p>
     *            <p>
     *            Valid values: <code>true</code>, or <code>false</code>.
     *            </p>
     *            <p>
     *            Required: No
     *            </p>
     *            <note>
     *            <p>
     *            This action is irreversible. Only use ForceDelete if you are
     *            certain the key is no longer in use.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteKeyRequest withForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
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
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getForceDelete() != null)
            sb.append("ForceDelete: " + getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode
                + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteKeyRequest == false)
            return false;
        DeleteKeyRequest other = (DeleteKeyRequest) obj;

        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null
                && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }
}
