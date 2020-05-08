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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration for the cluster used to run a processing job.
 * </p>
 */
public class ProcessingClusterConfig implements Serializable {
    /**
     * <p>
     * The number of ML compute instances to use in the processing job. For
     * distributed processing jobs, specify a value greater than 1. The default
     * value is 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The ML compute instance type for the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     */
    private String instanceType;

    /**
     * <p>
     * The size of the ML storage volume in gigabytes that you want to
     * provision. You must specify sufficient ML storage for your scenario.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     */
    private Integer volumeSizeInGB;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt data on the storage volume attached to the ML compute
     * instance(s) that run the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * The number of ML compute instances to use in the processing job. For
     * distributed processing jobs, specify a value greater than 1. The default
     * value is 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The number of ML compute instances to use in the processing job.
     *         For distributed processing jobs, specify a value greater than 1.
     *         The default value is 1.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of ML compute instances to use in the processing job. For
     * distributed processing jobs, specify a value greater than 1. The default
     * value is 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param instanceCount <p>
     *            The number of ML compute instances to use in the processing
     *            job. For distributed processing jobs, specify a value greater
     *            than 1. The default value is 1.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of ML compute instances to use in the processing job. For
     * distributed processing jobs, specify a value greater than 1. The default
     * value is 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param instanceCount <p>
     *            The number of ML compute instances to use in the processing
     *            job. For distributed processing jobs, specify a value greater
     *            than 1. The default value is 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingClusterConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * The ML compute instance type for the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     *
     * @return <p>
     *         The ML compute instance type for the processing job.
     *         </p>
     * @see ProcessingInstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The ML compute instance type for the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type for the processing job.
     *            </p>
     * @see ProcessingInstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The ML compute instance type for the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type for the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingInstanceType
     */
    public ProcessingClusterConfig withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The ML compute instance type for the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type for the processing job.
     *            </p>
     * @see ProcessingInstanceType
     */
    public void setInstanceType(ProcessingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The ML compute instance type for the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t3.medium, ml.t3.large, ml.t3.xlarge,
     * ml.t3.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.c4.xlarge, ml.c4.2xlarge,
     * ml.c4.4xlarge, ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge,
     * ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge,
     * ml.m5.12xlarge, ml.m5.24xlarge, ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge,
     * ml.r5.4xlarge, ml.r5.8xlarge, ml.r5.12xlarge, ml.r5.16xlarge,
     * ml.r5.24xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type for the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingInstanceType
     */
    public ProcessingClusterConfig withInstanceType(ProcessingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The size of the ML storage volume in gigabytes that you want to
     * provision. You must specify sufficient ML storage for your scenario.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @return <p>
     *         The size of the ML storage volume in gigabytes that you want to
     *         provision. You must specify sufficient ML storage for your
     *         scenario.
     *         </p>
     */
    public Integer getVolumeSizeInGB() {
        return volumeSizeInGB;
    }

    /**
     * <p>
     * The size of the ML storage volume in gigabytes that you want to
     * provision. You must specify sufficient ML storage for your scenario.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @param volumeSizeInGB <p>
     *            The size of the ML storage volume in gigabytes that you want
     *            to provision. You must specify sufficient ML storage for your
     *            scenario.
     *            </p>
     */
    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size of the ML storage volume in gigabytes that you want to
     * provision. You must specify sufficient ML storage for your scenario.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @param volumeSizeInGB <p>
     *            The size of the ML storage volume in gigabytes that you want
     *            to provision. You must specify sufficient ML storage for your
     *            scenario.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingClusterConfig withVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt data on the storage volume attached to the ML compute
     * instance(s) that run the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The AWS Key Management Service (AWS KMS) key that Amazon
     *         SageMaker uses to encrypt data on the storage volume attached to
     *         the ML compute instance(s) that run the processing job.
     *         </p>
     */
    public String getVolumeKmsKeyId() {
        return volumeKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt data on the storage volume attached to the ML compute
     * instance(s) that run the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param volumeKmsKeyId <p>
     *            The AWS Key Management Service (AWS KMS) key that Amazon
     *            SageMaker uses to encrypt data on the storage volume attached
     *            to the ML compute instance(s) that run the processing job.
     *            </p>
     */
    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt data on the storage volume attached to the ML compute
     * instance(s) that run the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param volumeKmsKeyId <p>
     *            The AWS Key Management Service (AWS KMS) key that Amazon
     *            SageMaker uses to encrypt data on the storage volume attached
     *            to the ML compute instance(s) that run the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingClusterConfig withVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: " + getVolumeSizeInGB() + ",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: " + getVolumeKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingClusterConfig == false)
            return false;
        ProcessingClusterConfig other = (ProcessingClusterConfig) obj;

        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null
                && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null
                && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        return true;
    }
}
