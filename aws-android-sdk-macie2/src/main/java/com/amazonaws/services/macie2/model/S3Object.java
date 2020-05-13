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

/**
 * <p>
 * Provides information about an S3 object that a finding applies to.
 * </p>
 */
public class S3Object implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket that contains the object.
     * </p>
     */
    private String bucketArn;

    /**
     * <p>
     * The entity tag (ETag) that identifies the affected version of the object.
     * If the object was overwritten or changed after Amazon Macie produced the
     * finding, this value might be different from the current ETag for the
     * object.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The file extension of the object. If the object doesn't have a file
     * extension, this value is "".
     * </p>
     */
    private String extension;

    /**
     * <p>
     * The full key (name) that's assigned to the object.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the object
     * was last modified.
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * The path to the object, including the full key (name).
     * </p>
     */
    private String path;

    /**
     * <p>
     * Specifies whether the object is publicly accessible due to the
     * combination of permissions settings that apply to the object.
     * </p>
     */
    private Boolean publicAccess;

    /**
     * <p>
     * The server-side encryption settings for the object.
     * </p>
     */
    private ServerSideEncryption serverSideEncryption;

    /**
     * <p>
     * The total storage size, in bytes, of the object.
     * </p>
     */
    private Long size;

    /**
     * <p>
     * The storage class of the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE, ONEZONE_IA, GLACIER
     */
    private String storageClass;

    /**
     * <p>
     * The tags that are associated with the object.
     * </p>
     */
    private java.util.List<KeyValuePair> tags;

    /**
     * <p>
     * The identifier for the affected version of the object.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket that contains the object.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the bucket that contains the
     *         object.
     *         </p>
     */
    public String getBucketArn() {
        return bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket that contains the object.
     * </p>
     *
     * @param bucketArn <p>
     *            The Amazon Resource Name (ARN) of the bucket that contains the
     *            object.
     *            </p>
     */
    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket that contains the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketArn <p>
     *            The Amazon Resource Name (ARN) of the bucket that contains the
     *            object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
        return this;
    }

    /**
     * <p>
     * The entity tag (ETag) that identifies the affected version of the object.
     * If the object was overwritten or changed after Amazon Macie produced the
     * finding, this value might be different from the current ETag for the
     * object.
     * </p>
     *
     * @return <p>
     *         The entity tag (ETag) that identifies the affected version of the
     *         object. If the object was overwritten or changed after Amazon
     *         Macie produced the finding, this value might be different from
     *         the current ETag for the object.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * The entity tag (ETag) that identifies the affected version of the object.
     * If the object was overwritten or changed after Amazon Macie produced the
     * finding, this value might be different from the current ETag for the
     * object.
     * </p>
     *
     * @param eTag <p>
     *            The entity tag (ETag) that identifies the affected version of
     *            the object. If the object was overwritten or changed after
     *            Amazon Macie produced the finding, this value might be
     *            different from the current ETag for the object.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The entity tag (ETag) that identifies the affected version of the object.
     * If the object was overwritten or changed after Amazon Macie produced the
     * finding, this value might be different from the current ETag for the
     * object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            The entity tag (ETag) that identifies the affected version of
     *            the object. If the object was overwritten or changed after
     *            Amazon Macie produced the finding, this value might be
     *            different from the current ETag for the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * <p>
     * The file extension of the object. If the object doesn't have a file
     * extension, this value is "".
     * </p>
     *
     * @return <p>
     *         The file extension of the object. If the object doesn't have a
     *         file extension, this value is "".
     *         </p>
     */
    public String getExtension() {
        return extension;
    }

    /**
     * <p>
     * The file extension of the object. If the object doesn't have a file
     * extension, this value is "".
     * </p>
     *
     * @param extension <p>
     *            The file extension of the object. If the object doesn't have a
     *            file extension, this value is "".
     *            </p>
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * <p>
     * The file extension of the object. If the object doesn't have a file
     * extension, this value is "".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extension <p>
     *            The file extension of the object. If the object doesn't have a
     *            file extension, this value is "".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * <p>
     * The full key (name) that's assigned to the object.
     * </p>
     *
     * @return <p>
     *         The full key (name) that's assigned to the object.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The full key (name) that's assigned to the object.
     * </p>
     *
     * @param key <p>
     *            The full key (name) that's assigned to the object.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The full key (name) that's assigned to the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The full key (name) that's assigned to the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the object
     * was last modified.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when the
     *         object was last modified.
     *         </p>
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the object
     * was last modified.
     * </p>
     *
     * @param lastModified <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the object was last modified.
     *            </p>
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the object
     * was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModified <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the object was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * <p>
     * The path to the object, including the full key (name).
     * </p>
     *
     * @return <p>
     *         The path to the object, including the full key (name).
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the object, including the full key (name).
     * </p>
     *
     * @param path <p>
     *            The path to the object, including the full key (name).
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the object, including the full key (name).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The path to the object, including the full key (name).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * Specifies whether the object is publicly accessible due to the
     * combination of permissions settings that apply to the object.
     * </p>
     *
     * @return <p>
     *         Specifies whether the object is publicly accessible due to the
     *         combination of permissions settings that apply to the object.
     *         </p>
     */
    public Boolean isPublicAccess() {
        return publicAccess;
    }

    /**
     * <p>
     * Specifies whether the object is publicly accessible due to the
     * combination of permissions settings that apply to the object.
     * </p>
     *
     * @return <p>
     *         Specifies whether the object is publicly accessible due to the
     *         combination of permissions settings that apply to the object.
     *         </p>
     */
    public Boolean getPublicAccess() {
        return publicAccess;
    }

    /**
     * <p>
     * Specifies whether the object is publicly accessible due to the
     * combination of permissions settings that apply to the object.
     * </p>
     *
     * @param publicAccess <p>
     *            Specifies whether the object is publicly accessible due to the
     *            combination of permissions settings that apply to the object.
     *            </p>
     */
    public void setPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
    }

    /**
     * <p>
     * Specifies whether the object is publicly accessible due to the
     * combination of permissions settings that apply to the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicAccess <p>
     *            Specifies whether the object is publicly accessible due to the
     *            combination of permissions settings that apply to the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }

    /**
     * <p>
     * The server-side encryption settings for the object.
     * </p>
     *
     * @return <p>
     *         The server-side encryption settings for the object.
     *         </p>
     */
    public ServerSideEncryption getServerSideEncryption() {
        return serverSideEncryption;
    }

    /**
     * <p>
     * The server-side encryption settings for the object.
     * </p>
     *
     * @param serverSideEncryption <p>
     *            The server-side encryption settings for the object.
     *            </p>
     */
    public void setServerSideEncryption(ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
    }

    /**
     * <p>
     * The server-side encryption settings for the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverSideEncryption <p>
     *            The server-side encryption settings for the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withServerSideEncryption(ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the object.
     * </p>
     *
     * @return <p>
     *         The total storage size, in bytes, of the object.
     *         </p>
     */
    public Long getSize() {
        return size;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the object.
     * </p>
     *
     * @param size <p>
     *            The total storage size, in bytes, of the object.
     *            </p>
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            The total storage size, in bytes, of the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * <p>
     * The storage class of the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE, ONEZONE_IA, GLACIER
     *
     * @return <p>
     *         The storage class of the object.
     *         </p>
     * @see StorageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p>
     * The storage class of the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE, ONEZONE_IA, GLACIER
     *
     * @param storageClass <p>
     *            The storage class of the object.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The storage class of the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE, ONEZONE_IA, GLACIER
     *
     * @param storageClass <p>
     *            The storage class of the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public S3Object withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p>
     * The storage class of the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE, ONEZONE_IA, GLACIER
     *
     * @param storageClass <p>
     *            The storage class of the object.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p>
     * The storage class of the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE, ONEZONE_IA, GLACIER
     *
     * @param storageClass <p>
     *            The storage class of the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public S3Object withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * The tags that are associated with the object.
     * </p>
     *
     * @return <p>
     *         The tags that are associated with the object.
     *         </p>
     */
    public java.util.List<KeyValuePair> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that are associated with the object.
     * </p>
     *
     * @param tags <p>
     *            The tags that are associated with the object.
     *            </p>
     */
    public void setTags(java.util.Collection<KeyValuePair> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<KeyValuePair>(tags);
    }

    /**
     * <p>
     * The tags that are associated with the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags that are associated with the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withTags(KeyValuePair... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<KeyValuePair>(tags.length);
        }
        for (KeyValuePair value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags that are associated with the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags that are associated with the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withTags(java.util.Collection<KeyValuePair> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The identifier for the affected version of the object.
     * </p>
     *
     * @return <p>
     *         The identifier for the affected version of the object.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * The identifier for the affected version of the object.
     * </p>
     *
     * @param versionId <p>
     *            The identifier for the affected version of the object.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The identifier for the affected version of the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            The identifier for the affected version of the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withVersionId(String versionId) {
        this.versionId = versionId;
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
        if (getBucketArn() != null)
            sb.append("bucketArn: " + getBucketArn() + ",");
        if (getETag() != null)
            sb.append("eTag: " + getETag() + ",");
        if (getExtension() != null)
            sb.append("extension: " + getExtension() + ",");
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getLastModified() != null)
            sb.append("lastModified: " + getLastModified() + ",");
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getPublicAccess() != null)
            sb.append("publicAccess: " + getPublicAccess() + ",");
        if (getServerSideEncryption() != null)
            sb.append("serverSideEncryption: " + getServerSideEncryption() + ",");
        if (getSize() != null)
            sb.append("size: " + getSize() + ",");
        if (getStorageClass() != null)
            sb.append("storageClass: " + getStorageClass() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getVersionId() != null)
            sb.append("versionId: " + getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getExtension() == null) ? 0 : getExtension().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode
                + ((getPublicAccess() == null) ? 0 : getPublicAccess().hashCode());
        hashCode = prime * hashCode
                + ((getServerSideEncryption() == null) ? 0 : getServerSideEncryption().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode
                + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Object == false)
            return false;
        S3Object other = (S3Object) obj;

        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null
                && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getExtension() == null ^ this.getExtension() == null)
            return false;
        if (other.getExtension() != null
                && other.getExtension().equals(this.getExtension()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPublicAccess() == null ^ this.getPublicAccess() == null)
            return false;
        if (other.getPublicAccess() != null
                && other.getPublicAccess().equals(this.getPublicAccess()) == false)
            return false;
        if (other.getServerSideEncryption() == null ^ this.getServerSideEncryption() == null)
            return false;
        if (other.getServerSideEncryption() != null
                && other.getServerSideEncryption().equals(this.getServerSideEncryption()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null
                && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }
}
