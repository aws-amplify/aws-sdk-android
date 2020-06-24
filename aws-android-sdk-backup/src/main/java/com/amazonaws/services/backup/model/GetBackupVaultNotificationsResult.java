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

public class GetBackupVaultNotificationsResult implements Serializable {
    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String backupVaultName;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault;
     * for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String backupVaultArn;

    /**
     * <p>
     * An ARN that uniquely identifies an Amazon Simple Notification Service
     * (Amazon SNS) topic; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyTopic</code>.
     * </p>
     */
    private String sNSTopicArn;

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources
     * to the backup vault.
     * </p>
     */
    private java.util.List<String> backupVaultEvents;

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         The name of a logical container where backups are stored. Backup
     *         vaults are identified by names that are unique to the account
     *         used to create them and the Region where they are created. They
     *         consist of lowercase letters, numbers, and hyphens.
     *         </p>
     */
    public String getBackupVaultName() {
        return backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param backupVaultName <p>
     *            The name of a logical container where backups are stored.
     *            Backup vaults are identified by names that are unique to the
     *            account used to create them and the Region where they are
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
     * them and the Region where they are created. They consist of lowercase
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
     *            account used to create them and the Region where they are
     *            created. They consist of lowercase letters, numbers, and
     *            hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBackupVaultNotificationsResult withBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault;
     * for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies a backup
     *         vault; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *         .
     *         </p>
     */
    public String getBackupVaultArn() {
        return backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault;
     * for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @param backupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            backup vault; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     */
    public void setBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault;
     * for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            backup vault; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBackupVaultNotificationsResult withBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies an Amazon Simple Notification Service
     * (Amazon SNS) topic; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyTopic</code>.
     * </p>
     *
     * @return <p>
     *         An ARN that uniquely identifies an Amazon Simple Notification
     *         Service (Amazon SNS) topic; for example,
     *         <code>arn:aws:sns:us-west-2:111122223333:MyTopic</code>.
     *         </p>
     */
    public String getSNSTopicArn() {
        return sNSTopicArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies an Amazon Simple Notification Service
     * (Amazon SNS) topic; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyTopic</code>.
     * </p>
     *
     * @param sNSTopicArn <p>
     *            An ARN that uniquely identifies an Amazon Simple Notification
     *            Service (Amazon SNS) topic; for example,
     *            <code>arn:aws:sns:us-west-2:111122223333:MyTopic</code>.
     *            </p>
     */
    public void setSNSTopicArn(String sNSTopicArn) {
        this.sNSTopicArn = sNSTopicArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies an Amazon Simple Notification Service
     * (Amazon SNS) topic; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyTopic</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sNSTopicArn <p>
     *            An ARN that uniquely identifies an Amazon Simple Notification
     *            Service (Amazon SNS) topic; for example,
     *            <code>arn:aws:sns:us-west-2:111122223333:MyTopic</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBackupVaultNotificationsResult withSNSTopicArn(String sNSTopicArn) {
        this.sNSTopicArn = sNSTopicArn;
        return this;
    }

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources
     * to the backup vault.
     * </p>
     *
     * @return <p>
     *         An array of events that indicate the status of jobs to back up
     *         resources to the backup vault.
     *         </p>
     */
    public java.util.List<String> getBackupVaultEvents() {
        return backupVaultEvents;
    }

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources
     * to the backup vault.
     * </p>
     *
     * @param backupVaultEvents <p>
     *            An array of events that indicate the status of jobs to back up
     *            resources to the backup vault.
     *            </p>
     */
    public void setBackupVaultEvents(java.util.Collection<String> backupVaultEvents) {
        if (backupVaultEvents == null) {
            this.backupVaultEvents = null;
            return;
        }

        this.backupVaultEvents = new java.util.ArrayList<String>(backupVaultEvents);
    }

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources
     * to the backup vault.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupVaultEvents <p>
     *            An array of events that indicate the status of jobs to back up
     *            resources to the backup vault.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBackupVaultNotificationsResult withBackupVaultEvents(String... backupVaultEvents) {
        if (getBackupVaultEvents() == null) {
            this.backupVaultEvents = new java.util.ArrayList<String>(backupVaultEvents.length);
        }
        for (String value : backupVaultEvents) {
            this.backupVaultEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources
     * to the backup vault.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupVaultEvents <p>
     *            An array of events that indicate the status of jobs to back up
     *            resources to the backup vault.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBackupVaultNotificationsResult withBackupVaultEvents(
            java.util.Collection<String> backupVaultEvents) {
        setBackupVaultEvents(backupVaultEvents);
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
        if (getBackupVaultArn() != null)
            sb.append("BackupVaultArn: " + getBackupVaultArn() + ",");
        if (getSNSTopicArn() != null)
            sb.append("SNSTopicArn: " + getSNSTopicArn() + ",");
        if (getBackupVaultEvents() != null)
            sb.append("BackupVaultEvents: " + getBackupVaultEvents());
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
                + ((getBackupVaultArn() == null) ? 0 : getBackupVaultArn().hashCode());
        hashCode = prime * hashCode
                + ((getSNSTopicArn() == null) ? 0 : getSNSTopicArn().hashCode());
        hashCode = prime * hashCode
                + ((getBackupVaultEvents() == null) ? 0 : getBackupVaultEvents().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackupVaultNotificationsResult == false)
            return false;
        GetBackupVaultNotificationsResult other = (GetBackupVaultNotificationsResult) obj;

        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null
                && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getBackupVaultArn() == null ^ this.getBackupVaultArn() == null)
            return false;
        if (other.getBackupVaultArn() != null
                && other.getBackupVaultArn().equals(this.getBackupVaultArn()) == false)
            return false;
        if (other.getSNSTopicArn() == null ^ this.getSNSTopicArn() == null)
            return false;
        if (other.getSNSTopicArn() != null
                && other.getSNSTopicArn().equals(this.getSNSTopicArn()) == false)
            return false;
        if (other.getBackupVaultEvents() == null ^ this.getBackupVaultEvents() == null)
            return false;
        if (other.getBackupVaultEvents() != null
                && other.getBackupVaultEvents().equals(this.getBackupVaultEvents()) == false)
            return false;
        return true;
    }
}
