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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the delete marker.
 * </p>
 */
public class DeleteMarkerEntry implements Serializable {
    /**
     * <p>
     * The account that created the delete marker.&gt;
     * </p>
     */
    private Owner owner;

    /**
     * <p>
     * The object key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * Version ID of an object.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * Specifies whether the object is (true) or is not (false) the latest
     * version of an object.
     * </p>
     */
    private Boolean isLatest;

    /**
     * <p>
     * Date and time the object was last modified.
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * The account that created the delete marker.&gt;
     * </p>
     *
     * @return <p>
     *         The account that created the delete marker.&gt;
     *         </p>
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * <p>
     * The account that created the delete marker.&gt;
     * </p>
     *
     * @param owner <p>
     *            The account that created the delete marker.&gt;
     *            </p>
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The account that created the delete marker.&gt;
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            The account that created the delete marker.&gt;
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMarkerEntry withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The object key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The object key.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The object key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The object key.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The object key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The object key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMarkerEntry withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * Version ID of an object.
     * </p>
     *
     * @return <p>
     *         Version ID of an object.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * Version ID of an object.
     * </p>
     *
     * @param versionId <p>
     *            Version ID of an object.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Version ID of an object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            Version ID of an object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMarkerEntry withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>
     * Specifies whether the object is (true) or is not (false) the latest
     * version of an object.
     * </p>
     *
     * @return <p>
     *         Specifies whether the object is (true) or is not (false) the
     *         latest version of an object.
     *         </p>
     */
    public Boolean isIsLatest() {
        return isLatest;
    }

    /**
     * <p>
     * Specifies whether the object is (true) or is not (false) the latest
     * version of an object.
     * </p>
     *
     * @return <p>
     *         Specifies whether the object is (true) or is not (false) the
     *         latest version of an object.
     *         </p>
     */
    public Boolean getIsLatest() {
        return isLatest;
    }

    /**
     * <p>
     * Specifies whether the object is (true) or is not (false) the latest
     * version of an object.
     * </p>
     *
     * @param isLatest <p>
     *            Specifies whether the object is (true) or is not (false) the
     *            latest version of an object.
     *            </p>
     */
    public void setIsLatest(Boolean isLatest) {
        this.isLatest = isLatest;
    }

    /**
     * <p>
     * Specifies whether the object is (true) or is not (false) the latest
     * version of an object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isLatest <p>
     *            Specifies whether the object is (true) or is not (false) the
     *            latest version of an object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMarkerEntry withIsLatest(Boolean isLatest) {
        this.isLatest = isLatest;
        return this;
    }

    /**
     * <p>
     * Date and time the object was last modified.
     * </p>
     *
     * @return <p>
     *         Date and time the object was last modified.
     *         </p>
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * Date and time the object was last modified.
     * </p>
     *
     * @param lastModified <p>
     *            Date and time the object was last modified.
     *            </p>
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * Date and time the object was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModified <p>
     *            Date and time the object was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMarkerEntry withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
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
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getIsLatest() != null)
            sb.append("IsLatest: " + getIsLatest() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getIsLatest() == null) ? 0 : getIsLatest().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMarkerEntry == false)
            return false;
        DeleteMarkerEntry other = (DeleteMarkerEntry) obj;

        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getIsLatest() == null ^ this.getIsLatest() == null)
            return false;
        if (other.getIsLatest() != null && other.getIsLatest().equals(this.getIsLatest()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        return true;
    }
}
