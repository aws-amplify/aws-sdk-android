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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a logical container where backups are stored. A
 * <code>CreateBackupVault</code> request includes a name, optionally one or
 * more resource tags, an encryption key, and a request ID.
 * </p>
 * <note>
 * <p>
 * Sensitive data, such as passport numbers, should not be included the name of
 * a backup vault.
 * </p>
 * </note>
 */
public class CreateBackupVaultRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String backupVaultName;

    /**
     * <p>
     * Metadata that you can assign to help organize the resources that you
     * create. Each tag is a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> backupVaultTags;

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for
     * example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     */
    private String encryptionKeyArn;

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to
     * be retried without the risk of executing the operation twice.
     * </p>
     */
    private String creatorRequestId;

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         The name of a logical container where backups are stored. Backup
     *         vaults are identified by names that are unique to the account
     *         used to create them and the AWS Region where they are created.
     *         They consist of lowercase letters, numbers, and hyphens.
     *         </p>
     */
    public String getBackupVaultName() {
        return backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param backupVaultName <p>
     *            The name of a logical container where backups are stored.
     *            Backup vaults are identified by names that are unique to the
     *            account used to create them and the AWS Region where they are
     *            created. They consist of lowercase letters, numbers, and
     *            hyphens.
     *            </p>
     */
    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param backupVaultName <p>
     *            The name of a logical container where backups are stored.
     *            Backup vaults are identified by names that are unique to the
     *            account used to create them and the AWS Region where they are
     *            created. They consist of lowercase letters, numbers, and
     *            hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupVaultRequest withBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
        return this;
    }

    /**
     * <p>
     * Metadata that you can assign to help organize the resources that you
     * create. Each tag is a key-value pair.
     * </p>
     *
     * @return <p>
     *         Metadata that you can assign to help organize the resources that
     *         you create. Each tag is a key-value pair.
     *         </p>
     */
    public java.util.Map<String, String> getBackupVaultTags() {
        return backupVaultTags;
    }

    /**
     * <p>
     * Metadata that you can assign to help organize the resources that you
     * create. Each tag is a key-value pair.
     * </p>
     *
     * @param backupVaultTags <p>
     *            Metadata that you can assign to help organize the resources
     *            that you create. Each tag is a key-value pair.
     *            </p>
     */
    public void setBackupVaultTags(java.util.Map<String, String> backupVaultTags) {
        this.backupVaultTags = backupVaultTags;
    }

    /**
     * <p>
     * Metadata that you can assign to help organize the resources that you
     * create. Each tag is a key-value pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupVaultTags <p>
     *            Metadata that you can assign to help organize the resources
     *            that you create. Each tag is a key-value pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupVaultRequest withBackupVaultTags(
            java.util.Map<String, String> backupVaultTags) {
        this.backupVaultTags = backupVaultTags;
        return this;
    }

    /**
     * <p>
     * Metadata that you can assign to help organize the resources that you
     * create. Each tag is a key-value pair.
     * </p>
     * <p>
     * The method adds a new key-value pair into BackupVaultTags parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into BackupVaultTags.
     * @param value The corresponding value of the entry to be added into
     *            BackupVaultTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupVaultRequest addBackupVaultTagsEntry(String key, String value) {
        if (null == this.backupVaultTags) {
            this.backupVaultTags = new java.util.HashMap<String, String>();
        }
        if (this.backupVaultTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.backupVaultTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BackupVaultTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateBackupVaultRequest clearBackupVaultTagsEntries() {
        this.backupVaultTags = null;
        return this;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for
     * example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     *
     * @return <p>
     *         The server-side encryption key that is used to protect your
     *         backups; for example,
     *         <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         .
     *         </p>
     */
    public String getEncryptionKeyArn() {
        return encryptionKeyArn;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for
     * example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     *
     * @param encryptionKeyArn <p>
     *            The server-side encryption key that is used to protect your
     *            backups; for example,
     *            <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            .
     *            </p>
     */
    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for
     * example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionKeyArn <p>
     *            The server-side encryption key that is used to protect your
     *            backups; for example,
     *            <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupVaultRequest withEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to
     * be retried without the risk of executing the operation twice.
     * </p>
     *
     * @return <p>
     *         A unique string that identifies the request and allows failed
     *         requests to be retried without the risk of executing the
     *         operation twice.
     *         </p>
     */
    public String getCreatorRequestId() {
        return creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to
     * be retried without the risk of executing the operation twice.
     * </p>
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and allows failed
     *            requests to be retried without the risk of executing the
     *            operation twice.
     *            </p>
     */
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to
     * be retried without the risk of executing the operation twice.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and allows failed
     *            requests to be retried without the risk of executing the
     *            operation twice.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupVaultRequest withCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
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
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: " + getBackupVaultName() + ",");
        if (getBackupVaultTags() != null)
            sb.append("BackupVaultTags: " + getBackupVaultTags() + ",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: " + getEncryptionKeyArn() + ",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: " + getCreatorRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode
                + ((getBackupVaultTags() == null) ? 0 : getBackupVaultTags().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackupVaultRequest == false)
            return false;
        CreateBackupVaultRequest other = (CreateBackupVaultRequest) obj;

        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null
                && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getBackupVaultTags() == null ^ this.getBackupVaultTags() == null)
            return false;
        if (other.getBackupVaultTags() != null
                && other.getBackupVaultTags().equals(this.getBackupVaultTags()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null
                && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null
                && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        return true;
    }
}
