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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the target S3 bucket for the Resource Data Sync.
 * </p>
 */
public class ResourceDataSyncS3Destination implements Serializable {
    /**
     * <p>
     * The name of the S3 bucket where the aggregated data is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String bucketName;

    /**
     * <p>
     * An Amazon S3 prefix for the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String prefix;

    /**
     * <p>
     * A supported sync format. The following format is currently supported:
     * JsonSerDe
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JsonSerDe
     */
    private String syncFormat;

    /**
     * <p>
     * The AWS Region with the S3 bucket targeted by the Resource Data Sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String region;

    /**
     * <p>
     * The ARN of an encryption key for a destination in Amazon S3. Must belong
     * to the same Region as the destination S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>arn:.*<br/>
     */
    private String aWSKMSKeyARN;

    /**
     * <p>
     * Enables destination data sharing. By default, this field is
     * <code>null</code>.
     * </p>
     */
    private ResourceDataSyncDestinationDataSharing destinationDataSharing;

    /**
     * <p>
     * The name of the S3 bucket where the aggregated data is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The name of the S3 bucket where the aggregated data is stored.
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where the aggregated data is stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param bucketName <p>
     *            The name of the S3 bucket where the aggregated data is stored.
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where the aggregated data is stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param bucketName <p>
     *            The name of the S3 bucket where the aggregated data is stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncS3Destination withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * <p>
     * An Amazon S3 prefix for the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         An Amazon S3 prefix for the bucket.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * An Amazon S3 prefix for the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param prefix <p>
     *            An Amazon S3 prefix for the bucket.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An Amazon S3 prefix for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param prefix <p>
     *            An Amazon S3 prefix for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncS3Destination withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * A supported sync format. The following format is currently supported:
     * JsonSerDe
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JsonSerDe
     *
     * @return <p>
     *         A supported sync format. The following format is currently
     *         supported: JsonSerDe
     *         </p>
     * @see ResourceDataSyncS3Format
     */
    public String getSyncFormat() {
        return syncFormat;
    }

    /**
     * <p>
     * A supported sync format. The following format is currently supported:
     * JsonSerDe
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JsonSerDe
     *
     * @param syncFormat <p>
     *            A supported sync format. The following format is currently
     *            supported: JsonSerDe
     *            </p>
     * @see ResourceDataSyncS3Format
     */
    public void setSyncFormat(String syncFormat) {
        this.syncFormat = syncFormat;
    }

    /**
     * <p>
     * A supported sync format. The following format is currently supported:
     * JsonSerDe
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JsonSerDe
     *
     * @param syncFormat <p>
     *            A supported sync format. The following format is currently
     *            supported: JsonSerDe
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceDataSyncS3Format
     */
    public ResourceDataSyncS3Destination withSyncFormat(String syncFormat) {
        this.syncFormat = syncFormat;
        return this;
    }

    /**
     * <p>
     * A supported sync format. The following format is currently supported:
     * JsonSerDe
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JsonSerDe
     *
     * @param syncFormat <p>
     *            A supported sync format. The following format is currently
     *            supported: JsonSerDe
     *            </p>
     * @see ResourceDataSyncS3Format
     */
    public void setSyncFormat(ResourceDataSyncS3Format syncFormat) {
        this.syncFormat = syncFormat.toString();
    }

    /**
     * <p>
     * A supported sync format. The following format is currently supported:
     * JsonSerDe
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JsonSerDe
     *
     * @param syncFormat <p>
     *            A supported sync format. The following format is currently
     *            supported: JsonSerDe
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceDataSyncS3Format
     */
    public ResourceDataSyncS3Destination withSyncFormat(ResourceDataSyncS3Format syncFormat) {
        this.syncFormat = syncFormat.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Region with the S3 bucket targeted by the Resource Data Sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The AWS Region with the S3 bucket targeted by the Resource Data
     *         Sync.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS Region with the S3 bucket targeted by the Resource Data Sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param region <p>
     *            The AWS Region with the S3 bucket targeted by the Resource
     *            Data Sync.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region with the S3 bucket targeted by the Resource Data Sync.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param region <p>
     *            The AWS Region with the S3 bucket targeted by the Resource
     *            Data Sync.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncS3Destination withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The ARN of an encryption key for a destination in Amazon S3. Must belong
     * to the same Region as the destination S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @return <p>
     *         The ARN of an encryption key for a destination in Amazon S3. Must
     *         belong to the same Region as the destination S3 bucket.
     *         </p>
     */
    public String getAWSKMSKeyARN() {
        return aWSKMSKeyARN;
    }

    /**
     * <p>
     * The ARN of an encryption key for a destination in Amazon S3. Must belong
     * to the same Region as the destination S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param aWSKMSKeyARN <p>
     *            The ARN of an encryption key for a destination in Amazon S3.
     *            Must belong to the same Region as the destination S3 bucket.
     *            </p>
     */
    public void setAWSKMSKeyARN(String aWSKMSKeyARN) {
        this.aWSKMSKeyARN = aWSKMSKeyARN;
    }

    /**
     * <p>
     * The ARN of an encryption key for a destination in Amazon S3. Must belong
     * to the same Region as the destination S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param aWSKMSKeyARN <p>
     *            The ARN of an encryption key for a destination in Amazon S3.
     *            Must belong to the same Region as the destination S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncS3Destination withAWSKMSKeyARN(String aWSKMSKeyARN) {
        this.aWSKMSKeyARN = aWSKMSKeyARN;
        return this;
    }

    /**
     * <p>
     * Enables destination data sharing. By default, this field is
     * <code>null</code>.
     * </p>
     *
     * @return <p>
     *         Enables destination data sharing. By default, this field is
     *         <code>null</code>.
     *         </p>
     */
    public ResourceDataSyncDestinationDataSharing getDestinationDataSharing() {
        return destinationDataSharing;
    }

    /**
     * <p>
     * Enables destination data sharing. By default, this field is
     * <code>null</code>.
     * </p>
     *
     * @param destinationDataSharing <p>
     *            Enables destination data sharing. By default, this field is
     *            <code>null</code>.
     *            </p>
     */
    public void setDestinationDataSharing(
            ResourceDataSyncDestinationDataSharing destinationDataSharing) {
        this.destinationDataSharing = destinationDataSharing;
    }

    /**
     * <p>
     * Enables destination data sharing. By default, this field is
     * <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationDataSharing <p>
     *            Enables destination data sharing. By default, this field is
     *            <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncS3Destination withDestinationDataSharing(
            ResourceDataSyncDestinationDataSharing destinationDataSharing) {
        this.destinationDataSharing = destinationDataSharing;
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
        if (getBucketName() != null)
            sb.append("BucketName: " + getBucketName() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getSyncFormat() != null)
            sb.append("SyncFormat: " + getSyncFormat() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getAWSKMSKeyARN() != null)
            sb.append("AWSKMSKeyARN: " + getAWSKMSKeyARN() + ",");
        if (getDestinationDataSharing() != null)
            sb.append("DestinationDataSharing: " + getDestinationDataSharing());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getSyncFormat() == null) ? 0 : getSyncFormat().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getAWSKMSKeyARN() == null) ? 0 : getAWSKMSKeyARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationDataSharing() == null) ? 0 : getDestinationDataSharing()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDataSyncS3Destination == false)
            return false;
        ResourceDataSyncS3Destination other = (ResourceDataSyncS3Destination) obj;

        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null
                && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getSyncFormat() == null ^ this.getSyncFormat() == null)
            return false;
        if (other.getSyncFormat() != null
                && other.getSyncFormat().equals(this.getSyncFormat()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAWSKMSKeyARN() == null ^ this.getAWSKMSKeyARN() == null)
            return false;
        if (other.getAWSKMSKeyARN() != null
                && other.getAWSKMSKeyARN().equals(this.getAWSKMSKeyARN()) == false)
            return false;
        if (other.getDestinationDataSharing() == null ^ this.getDestinationDataSharing() == null)
            return false;
        if (other.getDestinationDataSharing() != null
                && other.getDestinationDataSharing().equals(this.getDestinationDataSharing()) == false)
            return false;
        return true;
    }
}
