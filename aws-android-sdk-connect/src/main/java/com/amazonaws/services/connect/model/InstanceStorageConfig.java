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
 * The storage configuration for the instance.
 * </p>
 */
public class InstanceStorageConfig implements Serializable {
    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource
     * type and storage config for the given instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String associationId;

    /**
     * <p>
     * A valid storage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, KINESIS_VIDEO_STREAM, KINESIS_STREAM,
     * KINESIS_FIREHOSE
     */
    private String storageType;

    /**
     * <p>
     * The S3 bucket configuration.
     * </p>
     */
    private S3Config s3Config;

    /**
     * <p>
     * The configuration of the Kinesis video stream.
     * </p>
     */
    private KinesisVideoStreamConfig kinesisVideoStreamConfig;

    /**
     * <p>
     * The configuration of the Kinesis data stream.
     * </p>
     */
    private KinesisStreamConfig kinesisStreamConfig;

    /**
     * <p>
     * The configuration of the Kinesis Firehose delivery stream.
     * </p>
     */
    private KinesisFirehoseConfig kinesisFirehoseConfig;

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource
     * type and storage config for the given instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The existing association identifier that uniquely identifies the
     *         resource type and storage config for the given instance ID.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource
     * type and storage config for the given instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param associationId <p>
     *            The existing association identifier that uniquely identifies
     *            the resource type and storage config for the given instance
     *            ID.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource
     * type and storage config for the given instance ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param associationId <p>
     *            The existing association identifier that uniquely identifies
     *            the resource type and storage config for the given instance
     *            ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStorageConfig withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, KINESIS_VIDEO_STREAM, KINESIS_STREAM,
     * KINESIS_FIREHOSE
     *
     * @return <p>
     *         A valid storage type.
     *         </p>
     * @see StorageType
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, KINESIS_VIDEO_STREAM, KINESIS_STREAM,
     * KINESIS_FIREHOSE
     *
     * @param storageType <p>
     *            A valid storage type.
     *            </p>
     * @see StorageType
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, KINESIS_VIDEO_STREAM, KINESIS_STREAM,
     * KINESIS_FIREHOSE
     *
     * @param storageType <p>
     *            A valid storage type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageType
     */
    public InstanceStorageConfig withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, KINESIS_VIDEO_STREAM, KINESIS_STREAM,
     * KINESIS_FIREHOSE
     *
     * @param storageType <p>
     *            A valid storage type.
     *            </p>
     * @see StorageType
     */
    public void setStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, KINESIS_VIDEO_STREAM, KINESIS_STREAM,
     * KINESIS_FIREHOSE
     *
     * @param storageType <p>
     *            A valid storage type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageType
     */
    public InstanceStorageConfig withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
        return this;
    }

    /**
     * <p>
     * The S3 bucket configuration.
     * </p>
     *
     * @return <p>
     *         The S3 bucket configuration.
     *         </p>
     */
    public S3Config getS3Config() {
        return s3Config;
    }

    /**
     * <p>
     * The S3 bucket configuration.
     * </p>
     *
     * @param s3Config <p>
     *            The S3 bucket configuration.
     *            </p>
     */
    public void setS3Config(S3Config s3Config) {
        this.s3Config = s3Config;
    }

    /**
     * <p>
     * The S3 bucket configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Config <p>
     *            The S3 bucket configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStorageConfig withS3Config(S3Config s3Config) {
        this.s3Config = s3Config;
        return this;
    }

    /**
     * <p>
     * The configuration of the Kinesis video stream.
     * </p>
     *
     * @return <p>
     *         The configuration of the Kinesis video stream.
     *         </p>
     */
    public KinesisVideoStreamConfig getKinesisVideoStreamConfig() {
        return kinesisVideoStreamConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis video stream.
     * </p>
     *
     * @param kinesisVideoStreamConfig <p>
     *            The configuration of the Kinesis video stream.
     *            </p>
     */
    public void setKinesisVideoStreamConfig(KinesisVideoStreamConfig kinesisVideoStreamConfig) {
        this.kinesisVideoStreamConfig = kinesisVideoStreamConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis video stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesisVideoStreamConfig <p>
     *            The configuration of the Kinesis video stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStorageConfig withKinesisVideoStreamConfig(
            KinesisVideoStreamConfig kinesisVideoStreamConfig) {
        this.kinesisVideoStreamConfig = kinesisVideoStreamConfig;
        return this;
    }

    /**
     * <p>
     * The configuration of the Kinesis data stream.
     * </p>
     *
     * @return <p>
     *         The configuration of the Kinesis data stream.
     *         </p>
     */
    public KinesisStreamConfig getKinesisStreamConfig() {
        return kinesisStreamConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis data stream.
     * </p>
     *
     * @param kinesisStreamConfig <p>
     *            The configuration of the Kinesis data stream.
     *            </p>
     */
    public void setKinesisStreamConfig(KinesisStreamConfig kinesisStreamConfig) {
        this.kinesisStreamConfig = kinesisStreamConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis data stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesisStreamConfig <p>
     *            The configuration of the Kinesis data stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStorageConfig withKinesisStreamConfig(KinesisStreamConfig kinesisStreamConfig) {
        this.kinesisStreamConfig = kinesisStreamConfig;
        return this;
    }

    /**
     * <p>
     * The configuration of the Kinesis Firehose delivery stream.
     * </p>
     *
     * @return <p>
     *         The configuration of the Kinesis Firehose delivery stream.
     *         </p>
     */
    public KinesisFirehoseConfig getKinesisFirehoseConfig() {
        return kinesisFirehoseConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis Firehose delivery stream.
     * </p>
     *
     * @param kinesisFirehoseConfig <p>
     *            The configuration of the Kinesis Firehose delivery stream.
     *            </p>
     */
    public void setKinesisFirehoseConfig(KinesisFirehoseConfig kinesisFirehoseConfig) {
        this.kinesisFirehoseConfig = kinesisFirehoseConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis Firehose delivery stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesisFirehoseConfig <p>
     *            The configuration of the Kinesis Firehose delivery stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStorageConfig withKinesisFirehoseConfig(
            KinesisFirehoseConfig kinesisFirehoseConfig) {
        this.kinesisFirehoseConfig = kinesisFirehoseConfig;
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
        if (getAssociationId() != null)
            sb.append("AssociationId: " + getAssociationId() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getS3Config() != null)
            sb.append("S3Config: " + getS3Config() + ",");
        if (getKinesisVideoStreamConfig() != null)
            sb.append("KinesisVideoStreamConfig: " + getKinesisVideoStreamConfig() + ",");
        if (getKinesisStreamConfig() != null)
            sb.append("KinesisStreamConfig: " + getKinesisStreamConfig() + ",");
        if (getKinesisFirehoseConfig() != null)
            sb.append("KinesisFirehoseConfig: " + getKinesisFirehoseConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getS3Config() == null) ? 0 : getS3Config().hashCode());
        hashCode = prime
                * hashCode
                + ((getKinesisVideoStreamConfig() == null) ? 0 : getKinesisVideoStreamConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKinesisStreamConfig() == null) ? 0 : getKinesisStreamConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getKinesisFirehoseConfig() == null) ? 0 : getKinesisFirehoseConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStorageConfig == false)
            return false;
        InstanceStorageConfig other = (InstanceStorageConfig) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null
                && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getS3Config() == null ^ this.getS3Config() == null)
            return false;
        if (other.getS3Config() != null && other.getS3Config().equals(this.getS3Config()) == false)
            return false;
        if (other.getKinesisVideoStreamConfig() == null
                ^ this.getKinesisVideoStreamConfig() == null)
            return false;
        if (other.getKinesisVideoStreamConfig() != null
                && other.getKinesisVideoStreamConfig().equals(this.getKinesisVideoStreamConfig()) == false)
            return false;
        if (other.getKinesisStreamConfig() == null ^ this.getKinesisStreamConfig() == null)
            return false;
        if (other.getKinesisStreamConfig() != null
                && other.getKinesisStreamConfig().equals(this.getKinesisStreamConfig()) == false)
            return false;
        if (other.getKinesisFirehoseConfig() == null ^ this.getKinesisFirehoseConfig() == null)
            return false;
        if (other.getKinesisFirehoseConfig() != null
                && other.getKinesisFirehoseConfig().equals(this.getKinesisFirehoseConfig()) == false)
            return false;
        return true;
    }
}
