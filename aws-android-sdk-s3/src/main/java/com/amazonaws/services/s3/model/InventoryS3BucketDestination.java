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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the bucket name, file format, bucket owner (optional), and prefix
 * (optional) where inventory results are published.
 * </p>
 */
public class InventoryS3BucketDestination implements Serializable {
    /**
     * <p>
     * The account ID that owns the destination S3 bucket. If no account ID is
     * provided, the owner is not validated before exporting data.
     * </p>
     * <note>
     * <p>
     * Although this value is optional, we strongly recommend that you set it to
     * help prevent problems if the destination bucket ownership changes.
     * </p>
     * </note>
     */
    private String accountId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket where inventory results will
     * be published.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Specifies the output format of the inventory results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, ORC, Parquet
     */
    private String format;

    /**
     * <p>
     * The prefix that is prepended to all inventory results.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * Contains the type of server-side encryption used to encrypt the inventory
     * results.
     * </p>
     */
    private InventoryEncryption encryption;

    /**
     * <p>
     * The account ID that owns the destination S3 bucket. If no account ID is
     * provided, the owner is not validated before exporting data.
     * </p>
     * <note>
     * <p>
     * Although this value is optional, we strongly recommend that you set it to
     * help prevent problems if the destination bucket ownership changes.
     * </p>
     * </note>
     *
     * @return <p>
     *         The account ID that owns the destination S3 bucket. If no account
     *         ID is provided, the owner is not validated before exporting data.
     *         </p>
     *         <note>
     *         <p>
     *         Although this value is optional, we strongly recommend that you
     *         set it to help prevent problems if the destination bucket
     *         ownership changes.
     *         </p>
     *         </note>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The account ID that owns the destination S3 bucket. If no account ID is
     * provided, the owner is not validated before exporting data.
     * </p>
     * <note>
     * <p>
     * Although this value is optional, we strongly recommend that you set it to
     * help prevent problems if the destination bucket ownership changes.
     * </p>
     * </note>
     *
     * @param accountId <p>
     *            The account ID that owns the destination S3 bucket. If no
     *            account ID is provided, the owner is not validated before
     *            exporting data.
     *            </p>
     *            <note>
     *            <p>
     *            Although this value is optional, we strongly recommend that
     *            you set it to help prevent problems if the destination bucket
     *            ownership changes.
     *            </p>
     *            </note>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID that owns the destination S3 bucket. If no account ID is
     * provided, the owner is not validated before exporting data.
     * </p>
     * <note>
     * <p>
     * Although this value is optional, we strongly recommend that you set it to
     * help prevent problems if the destination bucket ownership changes.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The account ID that owns the destination S3 bucket. If no
     *            account ID is provided, the owner is not validated before
     *            exporting data.
     *            </p>
     *            <note>
     *            <p>
     *            Although this value is optional, we strongly recommend that
     *            you set it to help prevent problems if the destination bucket
     *            ownership changes.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryS3BucketDestination withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket where inventory results will
     * be published.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the bucket where inventory
     *         results will be published.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket where inventory results will
     * be published.
     * </p>
     *
     * @param bucket <p>
     *            The Amazon Resource Name (ARN) of the bucket where inventory
     *            results will be published.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket where inventory results will
     * be published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The Amazon Resource Name (ARN) of the bucket where inventory
     *            results will be published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryS3BucketDestination withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Specifies the output format of the inventory results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, ORC, Parquet
     *
     * @return <p>
     *         Specifies the output format of the inventory results.
     *         </p>
     * @see InventoryFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * Specifies the output format of the inventory results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, ORC, Parquet
     *
     * @param format <p>
     *            Specifies the output format of the inventory results.
     *            </p>
     * @see InventoryFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Specifies the output format of the inventory results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, ORC, Parquet
     *
     * @param format <p>
     *            Specifies the output format of the inventory results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InventoryFormat
     */
    public InventoryS3BucketDestination withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * Specifies the output format of the inventory results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, ORC, Parquet
     *
     * @param format <p>
     *            Specifies the output format of the inventory results.
     *            </p>
     * @see InventoryFormat
     */
    public void setFormat(InventoryFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * Specifies the output format of the inventory results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, ORC, Parquet
     *
     * @param format <p>
     *            Specifies the output format of the inventory results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InventoryFormat
     */
    public InventoryS3BucketDestination withFormat(InventoryFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The prefix that is prepended to all inventory results.
     * </p>
     *
     * @return <p>
     *         The prefix that is prepended to all inventory results.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The prefix that is prepended to all inventory results.
     * </p>
     *
     * @param prefix <p>
     *            The prefix that is prepended to all inventory results.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix that is prepended to all inventory results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            The prefix that is prepended to all inventory results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryS3BucketDestination withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * Contains the type of server-side encryption used to encrypt the inventory
     * results.
     * </p>
     *
     * @return <p>
     *         Contains the type of server-side encryption used to encrypt the
     *         inventory results.
     *         </p>
     */
    public InventoryEncryption getEncryption() {
        return encryption;
    }

    /**
     * <p>
     * Contains the type of server-side encryption used to encrypt the inventory
     * results.
     * </p>
     *
     * @param encryption <p>
     *            Contains the type of server-side encryption used to encrypt
     *            the inventory results.
     *            </p>
     */
    public void setEncryption(InventoryEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * Contains the type of server-side encryption used to encrypt the inventory
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryption <p>
     *            Contains the type of server-side encryption used to encrypt
     *            the inventory results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryS3BucketDestination withEncryption(InventoryEncryption encryption) {
        this.encryption = encryption;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getEncryption() != null)
            sb.append("Encryption: " + getEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryS3BucketDestination == false)
            return false;
        InventoryS3BucketDestination other = (InventoryS3BucketDestination) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null
                && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        return true;
    }
}
