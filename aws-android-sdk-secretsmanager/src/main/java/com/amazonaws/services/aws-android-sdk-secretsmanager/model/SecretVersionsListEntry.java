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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;


/**
 * <p>A structure that contains information about one version of a secret.</p>
 */
public class SecretVersionsListEntry implements Serializable {
    /**
     * <p>The unique version identifier of this version of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     */
    private String versionId;

    /**
     * <p>An array of staging labels that are currently associated with this version of the secret.</p>
     */
    private java.util.List<String> versionStages;

    /**
     * <p>The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.</p>
     */
    private java.util.Date lastAccessedDate;

    /**
     * <p>The date and time this version of the secret was created.</p>
     */
    private java.util.Date createdDate;

    /**
     * <p>The unique version identifier of this version of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @return <p>The unique version identifier of this version of the secret.</p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>The unique version identifier of this version of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param versionId <p>The unique version identifier of this version of the secret.</p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>The unique version identifier of this version of the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param versionId <p>The unique version identifier of this version of the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretVersionsListEntry withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>An array of staging labels that are currently associated with this version of the secret.</p>
     *
     * @return <p>An array of staging labels that are currently associated with this version of the secret.</p>
     */
    public java.util.List<String> getVersionStages() {
        return versionStages;
    }

    /**
     * <p>An array of staging labels that are currently associated with this version of the secret.</p>
     *
     * @param versionStages <p>An array of staging labels that are currently associated with this version of the secret.</p>
     */
    public void setVersionStages(java.util.Collection<String> versionStages) {
        if (versionStages == null) {
            this.versionStages = null;
            return;
        }

        this.versionStages = new java.util.ArrayList<String>(versionStages);
    }

    /**
     * <p>An array of staging labels that are currently associated with this version of the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionStages <p>An array of staging labels that are currently associated with this version of the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretVersionsListEntry withVersionStages(String... versionStages) {
        if (getVersionStages() == null) {
            this.versionStages = new java.util.ArrayList<String>(versionStages.length);
        }
        for (String value : versionStages) {
            this.versionStages.add(value);
        }
        return this;
    }

    /**
     * <p>An array of staging labels that are currently associated with this version of the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionStages <p>An array of staging labels that are currently associated with this version of the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretVersionsListEntry withVersionStages(java.util.Collection<String> versionStages) {
        setVersionStages(versionStages);
        return this;
    }

    /**
     * <p>The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.</p>
     *
     * @return <p>The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.</p>
     */
    public java.util.Date getLastAccessedDate() {
        return lastAccessedDate;
    }

    /**
     * <p>The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.</p>
     *
     * @param lastAccessedDate <p>The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.</p>
     */
    public void setLastAccessedDate(java.util.Date lastAccessedDate) {
        this.lastAccessedDate = lastAccessedDate;
    }

    /**
     * <p>The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastAccessedDate <p>The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretVersionsListEntry withLastAccessedDate(java.util.Date lastAccessedDate) {
        this.lastAccessedDate = lastAccessedDate;
        return this;
    }

    /**
     * <p>The date and time this version of the secret was created.</p>
     *
     * @return <p>The date and time this version of the secret was created.</p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>The date and time this version of the secret was created.</p>
     *
     * @param createdDate <p>The date and time this version of the secret was created.</p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>The date and time this version of the secret was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdDate <p>The date and time this version of the secret was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretVersionsListEntry withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVersionId() != null) sb.append("VersionId: " + getVersionId() + ",");
        if (getVersionStages() != null) sb.append("VersionStages: " + getVersionStages() + ",");
        if (getLastAccessedDate() != null) sb.append("LastAccessedDate: " + getLastAccessedDate() + ",");
        if (getCreatedDate() != null) sb.append("CreatedDate: " + getCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getVersionStages() == null) ? 0 : getVersionStages().hashCode());
        hashCode = prime * hashCode + ((getLastAccessedDate() == null) ? 0 : getLastAccessedDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SecretVersionsListEntry == false) return false;
        SecretVersionsListEntry other = (SecretVersionsListEntry)obj;

        if (other.getVersionId() == null ^ this.getVersionId() == null) return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false) return false;
        if (other.getVersionStages() == null ^ this.getVersionStages() == null) return false;
        if (other.getVersionStages() != null && other.getVersionStages().equals(this.getVersionStages()) == false) return false;
        if (other.getLastAccessedDate() == null ^ this.getLastAccessedDate() == null) return false;
        if (other.getLastAccessedDate() != null && other.getLastAccessedDate().equals(this.getLastAccessedDate()) == false) return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null) return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false) return false;
        return true;
    }
}
