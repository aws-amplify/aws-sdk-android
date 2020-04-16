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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the resources, including ML compute instances and ML storage
 * volumes, to use for model training.
 * </p>
 */
public class ResourceConfig implements Serializable {
    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.12xlarge,
     * ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.p3dn.24xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.c5n.xlarge, ml.c5n.2xlarge, ml.c5n.4xlarge,
     * ml.c5n.9xlarge, ml.c5n.18xlarge
     */
    private String instanceType;

    /**
     * <p>
     * The number of ML compute instances to use. For distributed training,
     * provide a value greater than 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The size of the ML storage volume that you want to provision.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training
     * algorithms might also use the ML storage volume for scratch space. If you
     * want to store the training data in the ML storage volume, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm
     * specification.
     * </p>
     * <p>
     * You must specify sufficient ML storage for your scenario.
     * </p>
     * <note>
     * <p>
     * Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage
     * volume type.
     * </p>
     * </note> <note>
     * <p>
     * Certain Nitro-based instances include local storage with a fixed total
     * size, dependent on the instance type. When using these instances for
     * training, Amazon SageMaker mounts the local instance storage instead of
     * Amazon EBS gp2 storage. You can't request a <code>VolumeSizeInGB</code>
     * greater than the total size of the local instance storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage,
     * including the total size per instance type, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer volumeSizeInGB;

    /**
     * <p>
     * The AWS KMS key that Amazon SageMaker uses to encrypt data on the storage
     * volume attached to the ML compute instance(s) that run the training job.
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the
     * instance type. Local storage volumes are encrypted using a hardware
     * module on the instance. You can't request a <code>VolumeKmsKeyId</code>
     * when using an instance type with local storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     * >SSD Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.12xlarge,
     * ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.p3dn.24xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.c5n.xlarge, ml.c5n.2xlarge, ml.c5n.4xlarge,
     * ml.c5n.9xlarge, ml.c5n.18xlarge
     *
     * @return <p>
     *         The ML compute instance type.
     *         </p>
     * @see TrainingInstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.12xlarge,
     * ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.p3dn.24xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.c5n.xlarge, ml.c5n.2xlarge, ml.c5n.4xlarge,
     * ml.c5n.9xlarge, ml.c5n.18xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type.
     *            </p>
     * @see TrainingInstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.12xlarge,
     * ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.p3dn.24xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.c5n.xlarge, ml.c5n.2xlarge, ml.c5n.4xlarge,
     * ml.c5n.9xlarge, ml.c5n.18xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingInstanceType
     */
    public ResourceConfig withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.12xlarge,
     * ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.p3dn.24xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.c5n.xlarge, ml.c5n.2xlarge, ml.c5n.4xlarge,
     * ml.c5n.9xlarge, ml.c5n.18xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type.
     *            </p>
     * @see TrainingInstanceType
     */
    public void setInstanceType(TrainingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.12xlarge,
     * ml.m5.24xlarge, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.p3dn.24xlarge,
     * ml.c5.xlarge, ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge,
     * ml.c5.18xlarge, ml.c5n.xlarge, ml.c5n.2xlarge, ml.c5n.4xlarge,
     * ml.c5n.9xlarge, ml.c5n.18xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingInstanceType
     */
    public ResourceConfig withInstanceType(TrainingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of ML compute instances to use. For distributed training,
     * provide a value greater than 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The number of ML compute instances to use. For distributed
     *         training, provide a value greater than 1.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of ML compute instances to use. For distributed training,
     * provide a value greater than 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param instanceCount <p>
     *            The number of ML compute instances to use. For distributed
     *            training, provide a value greater than 1.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of ML compute instances to use. For distributed training,
     * provide a value greater than 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param instanceCount <p>
     *            The number of ML compute instances to use. For distributed
     *            training, provide a value greater than 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * The size of the ML storage volume that you want to provision.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training
     * algorithms might also use the ML storage volume for scratch space. If you
     * want to store the training data in the ML storage volume, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm
     * specification.
     * </p>
     * <p>
     * You must specify sufficient ML storage for your scenario.
     * </p>
     * <note>
     * <p>
     * Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage
     * volume type.
     * </p>
     * </note> <note>
     * <p>
     * Certain Nitro-based instances include local storage with a fixed total
     * size, dependent on the instance type. When using these instances for
     * training, Amazon SageMaker mounts the local instance storage instead of
     * Amazon EBS gp2 storage. You can't request a <code>VolumeSizeInGB</code>
     * greater than the total size of the local instance storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage,
     * including the total size per instance type, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The size of the ML storage volume that you want to provision.
     *         </p>
     *         <p>
     *         ML storage volumes store model artifacts and incremental states.
     *         Training algorithms might also use the ML storage volume for
     *         scratch space. If you want to store the training data in the ML
     *         storage volume, choose <code>File</code> as the
     *         <code>TrainingInputMode</code> in the algorithm specification.
     *         </p>
     *         <p>
     *         You must specify sufficient ML storage for your scenario.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon SageMaker supports only the General Purpose SSD (gp2) ML
     *         storage volume type.
     *         </p>
     *         </note> <note>
     *         <p>
     *         Certain Nitro-based instances include local storage with a fixed
     *         total size, dependent on the instance type. When using these
     *         instances for training, Amazon SageMaker mounts the local
     *         instance storage instead of Amazon EBS gp2 storage. You can't
     *         request a <code>VolumeSizeInGB</code> greater than the total size
     *         of the local instance storage.
     *         </p>
     *         <p>
     *         For a list of instance types that support local instance storage,
     *         including the total size per instance type, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *         >Instance Store Volumes</a>.
     *         </p>
     *         </note>
     */
    public Integer getVolumeSizeInGB() {
        return volumeSizeInGB;
    }

    /**
     * <p>
     * The size of the ML storage volume that you want to provision.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training
     * algorithms might also use the ML storage volume for scratch space. If you
     * want to store the training data in the ML storage volume, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm
     * specification.
     * </p>
     * <p>
     * You must specify sufficient ML storage for your scenario.
     * </p>
     * <note>
     * <p>
     * Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage
     * volume type.
     * </p>
     * </note> <note>
     * <p>
     * Certain Nitro-based instances include local storage with a fixed total
     * size, dependent on the instance type. When using these instances for
     * training, Amazon SageMaker mounts the local instance storage instead of
     * Amazon EBS gp2 storage. You can't request a <code>VolumeSizeInGB</code>
     * greater than the total size of the local instance storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage,
     * including the total size per instance type, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param volumeSizeInGB <p>
     *            The size of the ML storage volume that you want to provision.
     *            </p>
     *            <p>
     *            ML storage volumes store model artifacts and incremental
     *            states. Training algorithms might also use the ML storage
     *            volume for scratch space. If you want to store the training
     *            data in the ML storage volume, choose <code>File</code> as the
     *            <code>TrainingInputMode</code> in the algorithm specification.
     *            </p>
     *            <p>
     *            You must specify sufficient ML storage for your scenario.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon SageMaker supports only the General Purpose SSD (gp2)
     *            ML storage volume type.
     *            </p>
     *            </note> <note>
     *            <p>
     *            Certain Nitro-based instances include local storage with a
     *            fixed total size, dependent on the instance type. When using
     *            these instances for training, Amazon SageMaker mounts the
     *            local instance storage instead of Amazon EBS gp2 storage. You
     *            can't request a <code>VolumeSizeInGB</code> greater than the
     *            total size of the local instance storage.
     *            </p>
     *            <p>
     *            For a list of instance types that support local instance
     *            storage, including the total size per instance type, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *            >Instance Store Volumes</a>.
     *            </p>
     *            </note>
     */
    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size of the ML storage volume that you want to provision.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training
     * algorithms might also use the ML storage volume for scratch space. If you
     * want to store the training data in the ML storage volume, choose
     * <code>File</code> as the <code>TrainingInputMode</code> in the algorithm
     * specification.
     * </p>
     * <p>
     * You must specify sufficient ML storage for your scenario.
     * </p>
     * <note>
     * <p>
     * Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage
     * volume type.
     * </p>
     * </note> <note>
     * <p>
     * Certain Nitro-based instances include local storage with a fixed total
     * size, dependent on the instance type. When using these instances for
     * training, Amazon SageMaker mounts the local instance storage instead of
     * Amazon EBS gp2 storage. You can't request a <code>VolumeSizeInGB</code>
     * greater than the total size of the local instance storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage,
     * including the total size per instance type, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param volumeSizeInGB <p>
     *            The size of the ML storage volume that you want to provision.
     *            </p>
     *            <p>
     *            ML storage volumes store model artifacts and incremental
     *            states. Training algorithms might also use the ML storage
     *            volume for scratch space. If you want to store the training
     *            data in the ML storage volume, choose <code>File</code> as the
     *            <code>TrainingInputMode</code> in the algorithm specification.
     *            </p>
     *            <p>
     *            You must specify sufficient ML storage for your scenario.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon SageMaker supports only the General Purpose SSD (gp2)
     *            ML storage volume type.
     *            </p>
     *            </note> <note>
     *            <p>
     *            Certain Nitro-based instances include local storage with a
     *            fixed total size, dependent on the instance type. When using
     *            these instances for training, Amazon SageMaker mounts the
     *            local instance storage instead of Amazon EBS gp2 storage. You
     *            can't request a <code>VolumeSizeInGB</code> greater than the
     *            total size of the local instance storage.
     *            </p>
     *            <p>
     *            For a list of instance types that support local instance
     *            storage, including the total size per instance type, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *            >Instance Store Volumes</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceConfig withVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key that Amazon SageMaker uses to encrypt data on the storage
     * volume attached to the ML compute instance(s) that run the training job.
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the
     * instance type. Local storage volumes are encrypted using a hardware
     * module on the instance. You can't request a <code>VolumeKmsKeyId</code>
     * when using an instance type with local storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     * >SSD Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The AWS KMS key that Amazon SageMaker uses to encrypt data on the
     *         storage volume attached to the ML compute instance(s) that run
     *         the training job.
     *         </p>
     *         <note>
     *         <p>
     *         Certain Nitro-based instances include local storage, dependent on
     *         the instance type. Local storage volumes are encrypted using a
     *         hardware module on the instance. You can't request a
     *         <code>VolumeKmsKeyId</code> when using an instance type with
     *         local storage.
     *         </p>
     *         <p>
     *         For a list of instance types that support local instance storage,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *         >Instance Store Volumes</a>.
     *         </p>
     *         <p>
     *         For more information about local instance storage encryption, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     *         >SSD Instance Store Volumes</a>.
     *         </p>
     *         </note>
     *         <p>
     *         The <code>VolumeKmsKeyId</code> can be in any of the following
     *         formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         // KMS Key ID
     *         </p>
     *         <p>
     *         <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // Amazon Resource Name (ARN) of a KMS Key
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getVolumeKmsKeyId() {
        return volumeKmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key that Amazon SageMaker uses to encrypt data on the storage
     * volume attached to the ML compute instance(s) that run the training job.
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the
     * instance type. Local storage volumes are encrypted using a hardware
     * module on the instance. You can't request a <code>VolumeKmsKeyId</code>
     * when using an instance type with local storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     * >SSD Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param volumeKmsKeyId <p>
     *            The AWS KMS key that Amazon SageMaker uses to encrypt data on
     *            the storage volume attached to the ML compute instance(s) that
     *            run the training job.
     *            </p>
     *            <note>
     *            <p>
     *            Certain Nitro-based instances include local storage, dependent
     *            on the instance type. Local storage volumes are encrypted
     *            using a hardware module on the instance. You can't request a
     *            <code>VolumeKmsKeyId</code> when using an instance type with
     *            local storage.
     *            </p>
     *            <p>
     *            For a list of instance types that support local instance
     *            storage, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *            >Instance Store Volumes</a>.
     *            </p>
     *            <p>
     *            For more information about local instance storage encryption,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     *            >SSD Instance Store Volumes</a>.
     *            </p>
     *            </note>
     *            <p>
     *            The <code>VolumeKmsKeyId</code> can be in any of the following
     *            formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            // KMS Key ID
     *            </p>
     *            <p>
     *            <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            // Amazon Resource Name (ARN) of a KMS Key
     *            </p>
     *            <p>
     *            <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key that Amazon SageMaker uses to encrypt data on the storage
     * volume attached to the ML compute instance(s) that run the training job.
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the
     * instance type. Local storage volumes are encrypted using a hardware
     * module on the instance. You can't request a <code>VolumeKmsKeyId</code>
     * when using an instance type with local storage.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     * >SSD Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * The <code>VolumeKmsKeyId</code> can be in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param volumeKmsKeyId <p>
     *            The AWS KMS key that Amazon SageMaker uses to encrypt data on
     *            the storage volume attached to the ML compute instance(s) that
     *            run the training job.
     *            </p>
     *            <note>
     *            <p>
     *            Certain Nitro-based instances include local storage, dependent
     *            on the instance type. Local storage volumes are encrypted
     *            using a hardware module on the instance. You can't request a
     *            <code>VolumeKmsKeyId</code> when using an instance type with
     *            local storage.
     *            </p>
     *            <p>
     *            For a list of instance types that support local instance
     *            storage, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *            >Instance Store Volumes</a>.
     *            </p>
     *            <p>
     *            For more information about local instance storage encryption,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     *            >SSD Instance Store Volumes</a>.
     *            </p>
     *            </note>
     *            <p>
     *            The <code>VolumeKmsKeyId</code> can be in any of the following
     *            formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            // KMS Key ID
     *            </p>
     *            <p>
     *            <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            // Amazon Resource Name (ARN) of a KMS Key
     *            </p>
     *            <p>
     *            <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceConfig withVolumeKmsKeyId(String volumeKmsKeyId) {
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
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
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
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
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

        if (obj instanceof ResourceConfig == false)
            return false;
        ResourceConfig other = (ResourceConfig) obj;

        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
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
