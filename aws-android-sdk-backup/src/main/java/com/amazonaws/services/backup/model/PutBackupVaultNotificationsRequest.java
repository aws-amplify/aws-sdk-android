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
 * Turns on notifications on a backup vault for the specified topic and events.
 * </p>
 */
public class PutBackupVaultNotificationsRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The Amazon Resource Name (ARN) that specifies the topic for a backup
     * vault’s events; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
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
    public PutBackupVaultNotificationsRequest withBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the topic for a backup
     * vault’s events; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that specifies the topic for a
     *         backup vault’s events; for example,
     *         <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     *         </p>
     */
    public String getSNSTopicArn() {
        return sNSTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the topic for a backup
     * vault’s events; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     * </p>
     *
     * @param sNSTopicArn <p>
     *            The Amazon Resource Name (ARN) that specifies the topic for a
     *            backup vault’s events; for example,
     *            <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     *            </p>
     */
    public void setSNSTopicArn(String sNSTopicArn) {
        this.sNSTopicArn = sNSTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the topic for a backup
     * vault’s events; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sNSTopicArn <p>
     *            The Amazon Resource Name (ARN) that specifies the topic for a
     *            backup vault’s events; for example,
     *            <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBackupVaultNotificationsRequest withSNSTopicArn(String sNSTopicArn) {
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
    public PutBackupVaultNotificationsRequest withBackupVaultEvents(String... backupVaultEvents) {
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
    public PutBackupVaultNotificationsRequest withBackupVaultEvents(
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

        if (obj instanceof PutBackupVaultNotificationsRequest == false)
            return false;
        PutBackupVaultNotificationsRequest other = (PutBackupVaultNotificationsRequest) obj;

        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null
                && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
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
