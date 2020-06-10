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
 * Provides information about an S3 bucket that a finding applies to.
 * </p>
 */
public class S3Bucket implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket
     * was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The server-side encryption settings for the bucket.
     * </p>
     */
    private ServerSideEncryption defaultServerSideEncryption;

    /**
     * <p>
     * The name of the bucket.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The display name and account identifier for the user who owns the bucket.
     * </p>
     */
    private S3BucketOwner owner;

    /**
     * <p>
     * The permissions settings that determine whether the bucket is publicly
     * accessible.
     * </p>
     */
    private BucketPublicAccess publicAccess;

    /**
     * <p>
     * The tags that are associated with the bucket.
     * </p>
     */
    private java.util.List<KeyValuePair> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the bucket.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the bucket.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Bucket withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket
     * was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when the
     *         bucket was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket
     * was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the bucket was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket
     * was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the bucket was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Bucket withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The server-side encryption settings for the bucket.
     * </p>
     *
     * @return <p>
     *         The server-side encryption settings for the bucket.
     *         </p>
     */
    public ServerSideEncryption getDefaultServerSideEncryption() {
        return defaultServerSideEncryption;
    }

    /**
     * <p>
     * The server-side encryption settings for the bucket.
     * </p>
     *
     * @param defaultServerSideEncryption <p>
     *            The server-side encryption settings for the bucket.
     *            </p>
     */
    public void setDefaultServerSideEncryption(ServerSideEncryption defaultServerSideEncryption) {
        this.defaultServerSideEncryption = defaultServerSideEncryption;
    }

    /**
     * <p>
     * The server-side encryption settings for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultServerSideEncryption <p>
     *            The server-side encryption settings for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Bucket withDefaultServerSideEncryption(ServerSideEncryption defaultServerSideEncryption) {
        this.defaultServerSideEncryption = defaultServerSideEncryption;
        return this;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     *
     * @return <p>
     *         The name of the bucket.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     *
     * @param name <p>
     *            The name of the bucket.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Bucket withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The display name and account identifier for the user who owns the bucket.
     * </p>
     *
     * @return <p>
     *         The display name and account identifier for the user who owns the
     *         bucket.
     *         </p>
     */
    public S3BucketOwner getOwner() {
        return owner;
    }

    /**
     * <p>
     * The display name and account identifier for the user who owns the bucket.
     * </p>
     *
     * @param owner <p>
     *            The display name and account identifier for the user who owns
     *            the bucket.
     *            </p>
     */
    public void setOwner(S3BucketOwner owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The display name and account identifier for the user who owns the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            The display name and account identifier for the user who owns
     *            the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Bucket withOwner(S3BucketOwner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The permissions settings that determine whether the bucket is publicly
     * accessible.
     * </p>
     *
     * @return <p>
     *         The permissions settings that determine whether the bucket is
     *         publicly accessible.
     *         </p>
     */
    public BucketPublicAccess getPublicAccess() {
        return publicAccess;
    }

    /**
     * <p>
     * The permissions settings that determine whether the bucket is publicly
     * accessible.
     * </p>
     *
     * @param publicAccess <p>
     *            The permissions settings that determine whether the bucket is
     *            publicly accessible.
     *            </p>
     */
    public void setPublicAccess(BucketPublicAccess publicAccess) {
        this.publicAccess = publicAccess;
    }

    /**
     * <p>
     * The permissions settings that determine whether the bucket is publicly
     * accessible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicAccess <p>
     *            The permissions settings that determine whether the bucket is
     *            publicly accessible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Bucket withPublicAccess(BucketPublicAccess publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }

    /**
     * <p>
     * The tags that are associated with the bucket.
     * </p>
     *
     * @return <p>
     *         The tags that are associated with the bucket.
     *         </p>
     */
    public java.util.List<KeyValuePair> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that are associated with the bucket.
     * </p>
     *
     * @param tags <p>
     *            The tags that are associated with the bucket.
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
     * The tags that are associated with the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags that are associated with the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Bucket withTags(KeyValuePair... tags) {
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
     * The tags that are associated with the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags that are associated with the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Bucket withTags(java.util.Collection<KeyValuePair> tags) {
        setTags(tags);
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getDefaultServerSideEncryption() != null)
            sb.append("defaultServerSideEncryption: " + getDefaultServerSideEncryption() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getOwner() != null)
            sb.append("owner: " + getOwner() + ",");
        if (getPublicAccess() != null)
            sb.append("publicAccess: " + getPublicAccess() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultServerSideEncryption() == null) ? 0
                        : getDefaultServerSideEncryption().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode
                + ((getPublicAccess() == null) ? 0 : getPublicAccess().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Bucket == false)
            return false;
        S3Bucket other = (S3Bucket) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDefaultServerSideEncryption() == null
                ^ this.getDefaultServerSideEncryption() == null)
            return false;
        if (other.getDefaultServerSideEncryption() != null
                && other.getDefaultServerSideEncryption().equals(
                        this.getDefaultServerSideEncryption()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getPublicAccess() == null ^ this.getPublicAccess() == null)
            return false;
        if (other.getPublicAccess() != null
                && other.getPublicAccess().equals(this.getPublicAccess()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
