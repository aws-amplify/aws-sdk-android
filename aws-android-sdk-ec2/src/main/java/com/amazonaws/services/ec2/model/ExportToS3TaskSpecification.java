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
 * Describes an instance export task.
 * </p>
 */
public class ExportToS3TaskSpecification implements Serializable {

    /**
     * The format for the exported image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     */
    private String diskImageFormat;

    /**
     * The container format used to combine disk images with metadata (such
     * as OVF). If absent, only the disk image is exported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ova
     */
    private String containerFormat;

    /**
     * The S3 bucket for the destination image. The destination bucket must
     * exist and grant WRITE and READ_ACP permissions to the AWS account
     * <code>vm-import-export@amazon.com</code>.
     */
    private String s3Bucket;

    /**
     * The image is written to a single object in the S3 bucket at the S3 key
     * s3prefix + exportTaskId + '.' + diskImageFormat.
     */
    private String s3Prefix;

    /**
     * The format for the exported image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @return The format for the exported image.
     *
     * @see DiskImageFormat
     */
    public String getDiskImageFormat() {
        return diskImageFormat;
    }
    
    /**
     * The format for the exported image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat The format for the exported image.
     *
     * @see DiskImageFormat
     */
    public void setDiskImageFormat(String diskImageFormat) {
        this.diskImageFormat = diskImageFormat;
    }
    
    /**
     * The format for the exported image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat The format for the exported image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DiskImageFormat
     */
    public ExportToS3TaskSpecification withDiskImageFormat(String diskImageFormat) {
        this.diskImageFormat = diskImageFormat;
        return this;
    }

    /**
     * The format for the exported image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat The format for the exported image.
     *
     * @see DiskImageFormat
     */
    public void setDiskImageFormat(DiskImageFormat diskImageFormat) {
        this.diskImageFormat = diskImageFormat.toString();
    }
    
    /**
     * The format for the exported image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat The format for the exported image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DiskImageFormat
     */
    public ExportToS3TaskSpecification withDiskImageFormat(DiskImageFormat diskImageFormat) {
        this.diskImageFormat = diskImageFormat.toString();
        return this;
    }

    /**
     * The container format used to combine disk images with metadata (such
     * as OVF). If absent, only the disk image is exported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ova
     *
     * @return The container format used to combine disk images with metadata (such
     *         as OVF). If absent, only the disk image is exported.
     *
     * @see ContainerFormat
     */
    public String getContainerFormat() {
        return containerFormat;
    }
    
    /**
     * The container format used to combine disk images with metadata (such
     * as OVF). If absent, only the disk image is exported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ova
     *
     * @param containerFormat The container format used to combine disk images with metadata (such
     *         as OVF). If absent, only the disk image is exported.
     *
     * @see ContainerFormat
     */
    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }
    
    /**
     * The container format used to combine disk images with metadata (such
     * as OVF). If absent, only the disk image is exported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ova
     *
     * @param containerFormat The container format used to combine disk images with metadata (such
     *         as OVF). If absent, only the disk image is exported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ContainerFormat
     */
    public ExportToS3TaskSpecification withContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    /**
     * The container format used to combine disk images with metadata (such
     * as OVF). If absent, only the disk image is exported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ova
     *
     * @param containerFormat The container format used to combine disk images with metadata (such
     *         as OVF). If absent, only the disk image is exported.
     *
     * @see ContainerFormat
     */
    public void setContainerFormat(ContainerFormat containerFormat) {
        this.containerFormat = containerFormat.toString();
    }
    
    /**
     * The container format used to combine disk images with metadata (such
     * as OVF). If absent, only the disk image is exported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ova
     *
     * @param containerFormat The container format used to combine disk images with metadata (such
     *         as OVF). If absent, only the disk image is exported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ContainerFormat
     */
    public ExportToS3TaskSpecification withContainerFormat(ContainerFormat containerFormat) {
        this.containerFormat = containerFormat.toString();
        return this;
    }

    /**
     * The S3 bucket for the destination image. The destination bucket must
     * exist and grant WRITE and READ_ACP permissions to the AWS account
     * <code>vm-import-export@amazon.com</code>.
     *
     * @return The S3 bucket for the destination image. The destination bucket must
     *         exist and grant WRITE and READ_ACP permissions to the AWS account
     *         <code>vm-import-export@amazon.com</code>.
     */
    public String getS3Bucket() {
        return s3Bucket;
    }
    
    /**
     * The S3 bucket for the destination image. The destination bucket must
     * exist and grant WRITE and READ_ACP permissions to the AWS account
     * <code>vm-import-export@amazon.com</code>.
     *
     * @param s3Bucket The S3 bucket for the destination image. The destination bucket must
     *         exist and grant WRITE and READ_ACP permissions to the AWS account
     *         <code>vm-import-export@amazon.com</code>.
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }
    
    /**
     * The S3 bucket for the destination image. The destination bucket must
     * exist and grant WRITE and READ_ACP permissions to the AWS account
     * <code>vm-import-export@amazon.com</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Bucket The S3 bucket for the destination image. The destination bucket must
     *         exist and grant WRITE and READ_ACP permissions to the AWS account
     *         <code>vm-import-export@amazon.com</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExportToS3TaskSpecification withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * The image is written to a single object in the S3 bucket at the S3 key
     * s3prefix + exportTaskId + '.' + diskImageFormat.
     *
     * @return The image is written to a single object in the S3 bucket at the S3 key
     *         s3prefix + exportTaskId + '.' + diskImageFormat.
     */
    public String getS3Prefix() {
        return s3Prefix;
    }
    
    /**
     * The image is written to a single object in the S3 bucket at the S3 key
     * s3prefix + exportTaskId + '.' + diskImageFormat.
     *
     * @param s3Prefix The image is written to a single object in the S3 bucket at the S3 key
     *         s3prefix + exportTaskId + '.' + diskImageFormat.
     */
    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }
    
    /**
     * The image is written to a single object in the S3 bucket at the S3 key
     * s3prefix + exportTaskId + '.' + diskImageFormat.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Prefix The image is written to a single object in the S3 bucket at the S3 key
     *         s3prefix + exportTaskId + '.' + diskImageFormat.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExportToS3TaskSpecification withS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
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
        if (getDiskImageFormat() != null) sb.append("DiskImageFormat: " + getDiskImageFormat() + ",");
        if (getContainerFormat() != null) sb.append("ContainerFormat: " + getContainerFormat() + ",");
        if (getS3Bucket() != null) sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3Prefix() != null) sb.append("S3Prefix: " + getS3Prefix() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDiskImageFormat() == null) ? 0 : getDiskImageFormat().hashCode()); 
        hashCode = prime * hashCode + ((getContainerFormat() == null) ? 0 : getContainerFormat().hashCode()); 
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode()); 
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ExportToS3TaskSpecification == false) return false;
        ExportToS3TaskSpecification other = (ExportToS3TaskSpecification)obj;
        
        if (other.getDiskImageFormat() == null ^ this.getDiskImageFormat() == null) return false;
        if (other.getDiskImageFormat() != null && other.getDiskImageFormat().equals(this.getDiskImageFormat()) == false) return false; 
        if (other.getContainerFormat() == null ^ this.getContainerFormat() == null) return false;
        if (other.getContainerFormat() != null && other.getContainerFormat().equals(this.getContainerFormat()) == false) return false; 
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null) return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false) return false; 
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null) return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false) return false; 
        return true;
    }
    
}
    