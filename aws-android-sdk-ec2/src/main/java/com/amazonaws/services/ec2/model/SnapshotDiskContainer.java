/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * The disk container object for the import snapshot request.
 * </p>
 */
public class SnapshotDiskContainer implements Serializable {

    /**
     * The description of the disk image being imported.
     */
    private String description;

    /**
     * The format of the disk image being imported. <p>Valid values:
     * <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     * <code>OVA</code>
     */
    private String format;

    /**
     * The URL to the Amazon S3-based disk image being imported. It can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..).
     */
    private String url;

    /**
     * The S3 bucket for the disk image.
     */
    private UserBucket userBucket;

    /**
     * The description of the disk image being imported.
     *
     * @return The description of the disk image being imported.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the disk image being imported.
     *
     * @param description The description of the disk image being imported.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the disk image being imported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the disk image being imported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDiskContainer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The format of the disk image being imported. <p>Valid values:
     * <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     * <code>OVA</code>
     *
     * @return The format of the disk image being imported. <p>Valid values:
     *         <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     *         <code>OVA</code>
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * The format of the disk image being imported. <p>Valid values:
     * <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     * <code>OVA</code>
     *
     * @param format The format of the disk image being imported. <p>Valid values:
     *         <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     *         <code>OVA</code>
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * The format of the disk image being imported. <p>Valid values:
     * <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     * <code>OVA</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param format The format of the disk image being imported. <p>Valid values:
     *         <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     *         <code>OVA</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDiskContainer withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * The URL to the Amazon S3-based disk image being imported. It can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..).
     *
     * @return The URL to the Amazon S3-based disk image being imported. It can
     *         either be a https URL (https://..) or an Amazon S3 URL (s3://..).
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * The URL to the Amazon S3-based disk image being imported. It can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..).
     *
     * @param url The URL to the Amazon S3-based disk image being imported. It can
     *         either be a https URL (https://..) or an Amazon S3 URL (s3://..).
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
     * The URL to the Amazon S3-based disk image being imported. It can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param url The URL to the Amazon S3-based disk image being imported. It can
     *         either be a https URL (https://..) or an Amazon S3 URL (s3://..).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDiskContainer withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * The S3 bucket for the disk image.
     *
     * @return The S3 bucket for the disk image.
     */
    public UserBucket getUserBucket() {
        return userBucket;
    }
    
    /**
     * The S3 bucket for the disk image.
     *
     * @param userBucket The S3 bucket for the disk image.
     */
    public void setUserBucket(UserBucket userBucket) {
        this.userBucket = userBucket;
    }
    
    /**
     * The S3 bucket for the disk image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userBucket The S3 bucket for the disk image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDiskContainer withUserBucket(UserBucket userBucket) {
        this.userBucket = userBucket;
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
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getUrl() != null) sb.append("Url: " + getUrl() + ",");
        if (getUserBucket() != null) sb.append("UserBucket: " + getUserBucket() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode()); 
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode()); 
        hashCode = prime * hashCode + ((getUserBucket() == null) ? 0 : getUserBucket().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SnapshotDiskContainer == false) return false;
        SnapshotDiskContainer other = (SnapshotDiskContainer)obj;
        
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getUrl() == null ^ this.getUrl() == null) return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false) return false; 
        if (other.getUserBucket() == null ^ this.getUserBucket() == null) return false;
        if (other.getUserBucket() != null && other.getUserBucket().equals(this.getUserBucket()) == false) return false; 
        return true;
    }
    
}
    