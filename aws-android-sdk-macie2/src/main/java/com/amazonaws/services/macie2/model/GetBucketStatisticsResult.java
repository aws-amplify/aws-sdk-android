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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

public class GetBucketStatisticsResult implements Serializable {
    /**
     * <p>
     * The total number of buckets.
     * </p>
     */
    private Long bucketCount;

    /**
     * <p>
     * The total number of buckets that are publicly accessible, based on a
     * combination of permissions settings for each bucket.
     * </p>
     */
    private BucketCountByEffectivePermission bucketCountByEffectivePermission;

    /**
     * <p>
     * The total number of buckets, grouped by server-side encryption type. This
     * object also reports the total number of buckets that aren't encrypted.
     * </p>
     */
    private BucketCountByEncryptionType bucketCountByEncryptionType;

    /**
     * <p>
     * The total number of buckets that are shared with another AWS account or
     * configured to support cross-origin resource sharing (CORS).
     * </p>
     */
    private BucketCountBySharedAccessType bucketCountBySharedAccessType;

    /**
     * <p>
     * The total number of objects that Amazon Macie can monitor and analyze in
     * all the buckets. These objects use a file format, file extension, or
     * content type that Amazon Macie supports.
     * </p>
     */
    private Long classifiableObjectCount;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie
     * last analyzed the buckets.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The total number of objects in all the buckets.
     * </p>
     */
    private Long objectCount;

    /**
     * <p>
     * The total storage size, in bytes, of all the buckets.
     * </p>
     */
    private Long sizeInBytes;

    /**
     * <p>
     * The total compressed storage size, in bytes, of all the buckets.
     * </p>
     */
    private Long sizeInBytesCompressed;

    /**
     * <p>
     * The total number of buckets.
     * </p>
     *
     * @return <p>
     *         The total number of buckets.
     *         </p>
     */
    public Long getBucketCount() {
        return bucketCount;
    }

    /**
     * <p>
     * The total number of buckets.
     * </p>
     *
     * @param bucketCount <p>
     *            The total number of buckets.
     *            </p>
     */
    public void setBucketCount(Long bucketCount) {
        this.bucketCount = bucketCount;
    }

    /**
     * <p>
     * The total number of buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketCount <p>
     *            The total number of buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketStatisticsResult withBucketCount(Long bucketCount) {
        this.bucketCount = bucketCount;
        return this;
    }

    /**
     * <p>
     * The total number of buckets that are publicly accessible, based on a
     * combination of permissions settings for each bucket.
     * </p>
     *
     * @return <p>
     *         The total number of buckets that are publicly accessible, based
     *         on a combination of permissions settings for each bucket.
     *         </p>
     */
    public BucketCountByEffectivePermission getBucketCountByEffectivePermission() {
        return bucketCountByEffectivePermission;
    }

    /**
     * <p>
     * The total number of buckets that are publicly accessible, based on a
     * combination of permissions settings for each bucket.
     * </p>
     *
     * @param bucketCountByEffectivePermission <p>
     *            The total number of buckets that are publicly accessible,
     *            based on a combination of permissions settings for each
     *            bucket.
     *            </p>
     */
    public void setBucketCountByEffectivePermission(
            BucketCountByEffectivePermission bucketCountByEffectivePermission) {
        this.bucketCountByEffectivePermission = bucketCountByEffectivePermission;
    }

    /**
     * <p>
     * The total number of buckets that are publicly accessible, based on a
     * combination of permissions settings for each bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketCountByEffectivePermission <p>
     *            The total number of buckets that are publicly accessible,
     *            based on a combination of permissions settings for each
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketStatisticsResult withBucketCountByEffectivePermission(
            BucketCountByEffectivePermission bucketCountByEffectivePermission) {
        this.bucketCountByEffectivePermission = bucketCountByEffectivePermission;
        return this;
    }

    /**
     * <p>
     * The total number of buckets, grouped by server-side encryption type. This
     * object also reports the total number of buckets that aren't encrypted.
     * </p>
     *
     * @return <p>
     *         The total number of buckets, grouped by server-side encryption
     *         type. This object also reports the total number of buckets that
     *         aren't encrypted.
     *         </p>
     */
    public BucketCountByEncryptionType getBucketCountByEncryptionType() {
        return bucketCountByEncryptionType;
    }

    /**
     * <p>
     * The total number of buckets, grouped by server-side encryption type. This
     * object also reports the total number of buckets that aren't encrypted.
     * </p>
     *
     * @param bucketCountByEncryptionType <p>
     *            The total number of buckets, grouped by server-side encryption
     *            type. This object also reports the total number of buckets
     *            that aren't encrypted.
     *            </p>
     */
    public void setBucketCountByEncryptionType(
            BucketCountByEncryptionType bucketCountByEncryptionType) {
        this.bucketCountByEncryptionType = bucketCountByEncryptionType;
    }

    /**
     * <p>
     * The total number of buckets, grouped by server-side encryption type. This
     * object also reports the total number of buckets that aren't encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketCountByEncryptionType <p>
     *            The total number of buckets, grouped by server-side encryption
     *            type. This object also reports the total number of buckets
     *            that aren't encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketStatisticsResult withBucketCountByEncryptionType(
            BucketCountByEncryptionType bucketCountByEncryptionType) {
        this.bucketCountByEncryptionType = bucketCountByEncryptionType;
        return this;
    }

    /**
     * <p>
     * The total number of buckets that are shared with another AWS account or
     * configured to support cross-origin resource sharing (CORS).
     * </p>
     *
     * @return <p>
     *         The total number of buckets that are shared with another AWS
     *         account or configured to support cross-origin resource sharing
     *         (CORS).
     *         </p>
     */
    public BucketCountBySharedAccessType getBucketCountBySharedAccessType() {
        return bucketCountBySharedAccessType;
    }

    /**
     * <p>
     * The total number of buckets that are shared with another AWS account or
     * configured to support cross-origin resource sharing (CORS).
     * </p>
     *
     * @param bucketCountBySharedAccessType <p>
     *            The total number of buckets that are shared with another AWS
     *            account or configured to support cross-origin resource sharing
     *            (CORS).
     *            </p>
     */
    public void setBucketCountBySharedAccessType(
            BucketCountBySharedAccessType bucketCountBySharedAccessType) {
        this.bucketCountBySharedAccessType = bucketCountBySharedAccessType;
    }

    /**
     * <p>
     * The total number of buckets that are shared with another AWS account or
     * configured to support cross-origin resource sharing (CORS).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketCountBySharedAccessType <p>
     *            The total number of buckets that are shared with another AWS
     *            account or configured to support cross-origin resource sharing
     *            (CORS).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketStatisticsResult withBucketCountBySharedAccessType(
            BucketCountBySharedAccessType bucketCountBySharedAccessType) {
        this.bucketCountBySharedAccessType = bucketCountBySharedAccessType;
        return this;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can monitor and analyze in
     * all the buckets. These objects use a file format, file extension, or
     * content type that Amazon Macie supports.
     * </p>
     *
     * @return <p>
     *         The total number of objects that Amazon Macie can monitor and
     *         analyze in all the buckets. These objects use a file format, file
     *         extension, or content type that Amazon Macie supports.
     *         </p>
     */
    public Long getClassifiableObjectCount() {
        return classifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can monitor and analyze in
     * all the buckets. These objects use a file format, file extension, or
     * content type that Amazon Macie supports.
     * </p>
     *
     * @param classifiableObjectCount <p>
     *            The total number of objects that Amazon Macie can monitor and
     *            analyze in all the buckets. These objects use a file format,
     *            file extension, or content type that Amazon Macie supports.
     *            </p>
     */
    public void setClassifiableObjectCount(Long classifiableObjectCount) {
        this.classifiableObjectCount = classifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can monitor and analyze in
     * all the buckets. These objects use a file format, file extension, or
     * content type that Amazon Macie supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classifiableObjectCount <p>
     *            The total number of objects that Amazon Macie can monitor and
     *            analyze in all the buckets. These objects use a file format,
     *            file extension, or content type that Amazon Macie supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketStatisticsResult withClassifiableObjectCount(Long classifiableObjectCount) {
        this.classifiableObjectCount = classifiableObjectCount;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie
     * last analyzed the buckets.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when
     *         Amazon Macie last analyzed the buckets.
     *         </p>
     */
    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie
     * last analyzed the buckets.
     * </p>
     *
     * @param lastUpdated <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            Amazon Macie last analyzed the buckets.
     *            </p>
     */
    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie
     * last analyzed the buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdated <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            Amazon Macie last analyzed the buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketStatisticsResult withLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * <p>
     * The total number of objects in all the buckets.
     * </p>
     *
     * @return <p>
     *         The total number of objects in all the buckets.
     *         </p>
     */
    public Long getObjectCount() {
        return objectCount;
    }

    /**
     * <p>
     * The total number of objects in all the buckets.
     * </p>
     *
     * @param objectCount <p>
     *            The total number of objects in all the buckets.
     *            </p>
     */
    public void setObjectCount(Long objectCount) {
        this.objectCount = objectCount;
    }

    /**
     * <p>
     * The total number of objects in all the buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectCount <p>
     *            The total number of objects in all the buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketStatisticsResult withObjectCount(Long objectCount) {
        this.objectCount = objectCount;
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of all the buckets.
     * </p>
     *
     * @return <p>
     *         The total storage size, in bytes, of all the buckets.
     *         </p>
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of all the buckets.
     * </p>
     *
     * @param sizeInBytes <p>
     *            The total storage size, in bytes, of all the buckets.
     *            </p>
     */
    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of all the buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInBytes <p>
     *            The total storage size, in bytes, of all the buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketStatisticsResult withSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * <p>
     * The total compressed storage size, in bytes, of all the buckets.
     * </p>
     *
     * @return <p>
     *         The total compressed storage size, in bytes, of all the buckets.
     *         </p>
     */
    public Long getSizeInBytesCompressed() {
        return sizeInBytesCompressed;
    }

    /**
     * <p>
     * The total compressed storage size, in bytes, of all the buckets.
     * </p>
     *
     * @param sizeInBytesCompressed <p>
     *            The total compressed storage size, in bytes, of all the
     *            buckets.
     *            </p>
     */
    public void setSizeInBytesCompressed(Long sizeInBytesCompressed) {
        this.sizeInBytesCompressed = sizeInBytesCompressed;
    }

    /**
     * <p>
     * The total compressed storage size, in bytes, of all the buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInBytesCompressed <p>
     *            The total compressed storage size, in bytes, of all the
     *            buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketStatisticsResult withSizeInBytesCompressed(Long sizeInBytesCompressed) {
        this.sizeInBytesCompressed = sizeInBytesCompressed;
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
        if (getBucketCount() != null)
            sb.append("bucketCount: " + getBucketCount() + ",");
        if (getBucketCountByEffectivePermission() != null)
            sb.append("bucketCountByEffectivePermission: " + getBucketCountByEffectivePermission()
                    + ",");
        if (getBucketCountByEncryptionType() != null)
            sb.append("bucketCountByEncryptionType: " + getBucketCountByEncryptionType() + ",");
        if (getBucketCountBySharedAccessType() != null)
            sb.append("bucketCountBySharedAccessType: " + getBucketCountBySharedAccessType() + ",");
        if (getClassifiableObjectCount() != null)
            sb.append("classifiableObjectCount: " + getClassifiableObjectCount() + ",");
        if (getLastUpdated() != null)
            sb.append("lastUpdated: " + getLastUpdated() + ",");
        if (getObjectCount() != null)
            sb.append("objectCount: " + getObjectCount() + ",");
        if (getSizeInBytes() != null)
            sb.append("sizeInBytes: " + getSizeInBytes() + ",");
        if (getSizeInBytesCompressed() != null)
            sb.append("sizeInBytesCompressed: " + getSizeInBytesCompressed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBucketCount() == null) ? 0 : getBucketCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getBucketCountByEffectivePermission() == null) ? 0
                        : getBucketCountByEffectivePermission().hashCode());
        hashCode = prime
                * hashCode
                + ((getBucketCountByEncryptionType() == null) ? 0
                        : getBucketCountByEncryptionType().hashCode());
        hashCode = prime
                * hashCode
                + ((getBucketCountBySharedAccessType() == null) ? 0
                        : getBucketCountBySharedAccessType().hashCode());
        hashCode = prime
                * hashCode
                + ((getClassifiableObjectCount() == null) ? 0 : getClassifiableObjectCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode
                + ((getObjectCount() == null) ? 0 : getObjectCount().hashCode());
        hashCode = prime * hashCode
                + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSizeInBytesCompressed() == null) ? 0 : getSizeInBytesCompressed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketStatisticsResult == false)
            return false;
        GetBucketStatisticsResult other = (GetBucketStatisticsResult) obj;

        if (other.getBucketCount() == null ^ this.getBucketCount() == null)
            return false;
        if (other.getBucketCount() != null
                && other.getBucketCount().equals(this.getBucketCount()) == false)
            return false;
        if (other.getBucketCountByEffectivePermission() == null
                ^ this.getBucketCountByEffectivePermission() == null)
            return false;
        if (other.getBucketCountByEffectivePermission() != null
                && other.getBucketCountByEffectivePermission().equals(
                        this.getBucketCountByEffectivePermission()) == false)
            return false;
        if (other.getBucketCountByEncryptionType() == null
                ^ this.getBucketCountByEncryptionType() == null)
            return false;
        if (other.getBucketCountByEncryptionType() != null
                && other.getBucketCountByEncryptionType().equals(
                        this.getBucketCountByEncryptionType()) == false)
            return false;
        if (other.getBucketCountBySharedAccessType() == null
                ^ this.getBucketCountBySharedAccessType() == null)
            return false;
        if (other.getBucketCountBySharedAccessType() != null
                && other.getBucketCountBySharedAccessType().equals(
                        this.getBucketCountBySharedAccessType()) == false)
            return false;
        if (other.getClassifiableObjectCount() == null ^ this.getClassifiableObjectCount() == null)
            return false;
        if (other.getClassifiableObjectCount() != null
                && other.getClassifiableObjectCount().equals(this.getClassifiableObjectCount()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null
                && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getObjectCount() == null ^ this.getObjectCount() == null)
            return false;
        if (other.getObjectCount() != null
                && other.getObjectCount().equals(this.getObjectCount()) == false)
            return false;
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null
                && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
            return false;
        if (other.getSizeInBytesCompressed() == null ^ this.getSizeInBytesCompressed() == null)
            return false;
        if (other.getSizeInBytesCompressed() != null
                && other.getSizeInBytesCompressed().equals(this.getSizeInBytesCompressed()) == false)
            return false;
        return true;
    }
}
