/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a policy version.
 * </p>
 */
public class PolicyVersion implements Serializable {

    /**
     * The policy version ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String versionId;

    /**
     * Specifies whether the policy version is the default.
     */
    private Boolean isDefaultVersion;

    /**
     * The date and time the policy was created.
     */
    private java.util.Date createDate;

    /**
     * The policy version ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return The policy version ID.
     */
    public String getVersionId() {
        return versionId;
    }
    
    /**
     * The policy version ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param versionId The policy version ID.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }
    
    /**
     * The policy version ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param versionId The policy version ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyVersion withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * Specifies whether the policy version is the default.
     *
     * @return Specifies whether the policy version is the default.
     */
    public Boolean isDefaultVersion() {
        return isDefaultVersion;
    }
    
    /**
     * Specifies whether the policy version is the default.
     *
     * @param isDefaultVersion Specifies whether the policy version is the default.
     */
    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }
    
    /**
     * Specifies whether the policy version is the default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isDefaultVersion Specifies whether the policy version is the default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyVersion withIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
        return this;
    }

    /**
     * Specifies whether the policy version is the default.
     *
     * @return Specifies whether the policy version is the default.
     */
    public Boolean getIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * The date and time the policy was created.
     *
     * @return The date and time the policy was created.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The date and time the policy was created.
     *
     * @param createDate The date and time the policy was created.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The date and time the policy was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The date and time the policy was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyVersion withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
        if (isDefaultVersion() != null) sb.append("IsDefaultVersion: " + isDefaultVersion() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode()); 
        hashCode = prime * hashCode + ((isDefaultVersion() == null) ? 0 : isDefaultVersion().hashCode()); 
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PolicyVersion == false) return false;
        PolicyVersion other = (PolicyVersion)obj;
        
        if (other.getVersionId() == null ^ this.getVersionId() == null) return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false) return false; 
        if (other.isDefaultVersion() == null ^ this.isDefaultVersion() == null) return false;
        if (other.isDefaultVersion() != null && other.isDefaultVersion().equals(this.isDefaultVersion()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        return true;
    }
    
}
    