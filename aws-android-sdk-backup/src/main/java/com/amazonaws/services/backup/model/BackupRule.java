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

/**
 * <p>
 * Specifies a scheduled task used to back up a selection of resources.
 * </p>
 */
public class BackupRule implements Serializable {
    /**
     * <p>
     * An optional display name for a backup rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String ruleName;

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
    private String targetBackupVaultName;

    /**
     * <p>
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * </p>
     */
    private String scheduleExpression;

    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be
     * canceled if it doesn't start successfully. This value is optional.
     * </p>
     */
    private Long startWindowMinutes;

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it
     * must be completed or it will be canceled by AWS Backup. This value is
     * optional.
     * </p>
     */
    private Long completionWindowMinutes;

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup transitions and expires backups
     * automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, the “expire after days” setting must be 90
     * days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup
     * has been transitioned to cold.
     * </p>
     */
    private Lifecycle lifecycle;

    /**
     * <p>
     * An array of key-value pair strings that are assigned to resources that
     * are associated with this rule when restored from backup.
     * </p>
     */
    private java.util.Map<String, String> recoveryPointTags;

    /**
     * <p>
     * Uniquely identifies a rule that is used to schedule the backup of a
     * selection of resources.
     * </p>
     */
    private String ruleId;

    /**
     * <p>
     * An array of <code>CopyAction</code> objects, which contains the details
     * of the copy operation.
     * </p>
     */
    private java.util.List<CopyAction> copyActions;

    /**
     * <p>
     * An optional display name for a backup rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         An optional display name for a backup rule.
     *         </p>
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * <p>
     * An optional display name for a backup rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param ruleName <p>
     *            An optional display name for a backup rule.
     *            </p>
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * An optional display name for a backup rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param ruleName <p>
     *            An optional display name for a backup rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupRule withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
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
     * @return <p>
     *         The name of a logical container where backups are stored. Backup
     *         vaults are identified by names that are unique to the account
     *         used to create them and the AWS Region where they are created.
     *         They consist of lowercase letters, numbers, and hyphens.
     *         </p>
     */
    public String getTargetBackupVaultName() {
        return targetBackupVaultName;
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
     * @param targetBackupVaultName <p>
     *            The name of a logical container where backups are stored.
     *            Backup vaults are identified by names that are unique to the
     *            account used to create them and the AWS Region where they are
     *            created. They consist of lowercase letters, numbers, and
     *            hyphens.
     *            </p>
     */
    public void setTargetBackupVaultName(String targetBackupVaultName) {
        this.targetBackupVaultName = targetBackupVaultName;
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
     * @param targetBackupVaultName <p>
     *            The name of a logical container where backups are stored.
     *            Backup vaults are identified by names that are unique to the
     *            account used to create them and the AWS Region where they are
     *            created. They consist of lowercase letters, numbers, and
     *            hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupRule withTargetBackupVaultName(String targetBackupVaultName) {
        this.targetBackupVaultName = targetBackupVaultName;
        return this;
    }

    /**
     * <p>
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * </p>
     *
     * @return <p>
     *         A CRON expression specifying when AWS Backup initiates a backup
     *         job.
     *         </p>
     */
    public String getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * <p>
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * </p>
     *
     * @param scheduleExpression <p>
     *            A CRON expression specifying when AWS Backup initiates a
     *            backup job.
     *            </p>
     */
    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleExpression <p>
     *            A CRON expression specifying when AWS Backup initiates a
     *            backup job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupRule withScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be
     * canceled if it doesn't start successfully. This value is optional.
     * </p>
     *
     * @return <p>
     *         A value in minutes after a backup is scheduled before a job will
     *         be canceled if it doesn't start successfully. This value is
     *         optional.
     *         </p>
     */
    public Long getStartWindowMinutes() {
        return startWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be
     * canceled if it doesn't start successfully. This value is optional.
     * </p>
     *
     * @param startWindowMinutes <p>
     *            A value in minutes after a backup is scheduled before a job
     *            will be canceled if it doesn't start successfully. This value
     *            is optional.
     *            </p>
     */
    public void setStartWindowMinutes(Long startWindowMinutes) {
        this.startWindowMinutes = startWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be
     * canceled if it doesn't start successfully. This value is optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startWindowMinutes <p>
     *            A value in minutes after a backup is scheduled before a job
     *            will be canceled if it doesn't start successfully. This value
     *            is optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupRule withStartWindowMinutes(Long startWindowMinutes) {
        this.startWindowMinutes = startWindowMinutes;
        return this;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it
     * must be completed or it will be canceled by AWS Backup. This value is
     * optional.
     * </p>
     *
     * @return <p>
     *         A value in minutes after a backup job is successfully started
     *         before it must be completed or it will be canceled by AWS Backup.
     *         This value is optional.
     *         </p>
     */
    public Long getCompletionWindowMinutes() {
        return completionWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it
     * must be completed or it will be canceled by AWS Backup. This value is
     * optional.
     * </p>
     *
     * @param completionWindowMinutes <p>
     *            A value in minutes after a backup job is successfully started
     *            before it must be completed or it will be canceled by AWS
     *            Backup. This value is optional.
     *            </p>
     */
    public void setCompletionWindowMinutes(Long completionWindowMinutes) {
        this.completionWindowMinutes = completionWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it
     * must be completed or it will be canceled by AWS Backup. This value is
     * optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionWindowMinutes <p>
     *            A value in minutes after a backup job is successfully started
     *            before it must be completed or it will be canceled by AWS
     *            Backup. This value is optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupRule withCompletionWindowMinutes(Long completionWindowMinutes) {
        this.completionWindowMinutes = completionWindowMinutes;
        return this;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup transitions and expires backups
     * automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, the “expire after days” setting must be 90
     * days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup
     * has been transitioned to cold.
     * </p>
     *
     * @return <p>
     *         The lifecycle defines when a protected resource is transitioned
     *         to cold storage and when it expires. AWS Backup transitions and
     *         expires backups automatically according to the lifecycle that you
     *         define.
     *         </p>
     *         <p>
     *         Backups transitioned to cold storage must be stored in cold
     *         storage for a minimum of 90 days. Therefore, the “expire after
     *         days” setting must be 90 days greater than the “transition to
     *         cold after days” setting. The “transition to cold after days”
     *         setting cannot be changed after a backup has been transitioned to
     *         cold.
     *         </p>
     */
    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup transitions and expires backups
     * automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, the “expire after days” setting must be 90
     * days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup
     * has been transitioned to cold.
     * </p>
     *
     * @param lifecycle <p>
     *            The lifecycle defines when a protected resource is
     *            transitioned to cold storage and when it expires. AWS Backup
     *            transitions and expires backups automatically according to the
     *            lifecycle that you define.
     *            </p>
     *            <p>
     *            Backups transitioned to cold storage must be stored in cold
     *            storage for a minimum of 90 days. Therefore, the “expire after
     *            days” setting must be 90 days greater than the “transition to
     *            cold after days” setting. The “transition to cold after days”
     *            setting cannot be changed after a backup has been transitioned
     *            to cold.
     *            </p>
     */
    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup transitions and expires backups
     * automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, the “expire after days” setting must be 90
     * days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup
     * has been transitioned to cold.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycle <p>
     *            The lifecycle defines when a protected resource is
     *            transitioned to cold storage and when it expires. AWS Backup
     *            transitions and expires backups automatically according to the
     *            lifecycle that you define.
     *            </p>
     *            <p>
     *            Backups transitioned to cold storage must be stored in cold
     *            storage for a minimum of 90 days. Therefore, the “expire after
     *            days” setting must be 90 days greater than the “transition to
     *            cold after days” setting. The “transition to cold after days”
     *            setting cannot be changed after a backup has been transitioned
     *            to cold.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupRule withLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * <p>
     * An array of key-value pair strings that are assigned to resources that
     * are associated with this rule when restored from backup.
     * </p>
     *
     * @return <p>
     *         An array of key-value pair strings that are assigned to resources
     *         that are associated with this rule when restored from backup.
     *         </p>
     */
    public java.util.Map<String, String> getRecoveryPointTags() {
        return recoveryPointTags;
    }

    /**
     * <p>
     * An array of key-value pair strings that are assigned to resources that
     * are associated with this rule when restored from backup.
     * </p>
     *
     * @param recoveryPointTags <p>
     *            An array of key-value pair strings that are assigned to
     *            resources that are associated with this rule when restored
     *            from backup.
     *            </p>
     */
    public void setRecoveryPointTags(java.util.Map<String, String> recoveryPointTags) {
        this.recoveryPointTags = recoveryPointTags;
    }

    /**
     * <p>
     * An array of key-value pair strings that are assigned to resources that
     * are associated with this rule when restored from backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recoveryPointTags <p>
     *            An array of key-value pair strings that are assigned to
     *            resources that are associated with this rule when restored
     *            from backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupRule withRecoveryPointTags(java.util.Map<String, String> recoveryPointTags) {
        this.recoveryPointTags = recoveryPointTags;
        return this;
    }

    /**
     * <p>
     * An array of key-value pair strings that are assigned to resources that
     * are associated with this rule when restored from backup.
     * </p>
     * <p>
     * The method adds a new key-value pair into RecoveryPointTags parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into RecoveryPointTags.
     * @param value The corresponding value of the entry to be added into
     *            RecoveryPointTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupRule addRecoveryPointTagsEntry(String key, String value) {
        if (null == this.recoveryPointTags) {
            this.recoveryPointTags = new java.util.HashMap<String, String>();
        }
        if (this.recoveryPointTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.recoveryPointTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RecoveryPointTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public BackupRule clearRecoveryPointTagsEntries() {
        this.recoveryPointTags = null;
        return this;
    }

    /**
     * <p>
     * Uniquely identifies a rule that is used to schedule the backup of a
     * selection of resources.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies a rule that is used to schedule the backup of
     *         a selection of resources.
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * Uniquely identifies a rule that is used to schedule the backup of a
     * selection of resources.
     * </p>
     *
     * @param ruleId <p>
     *            Uniquely identifies a rule that is used to schedule the backup
     *            of a selection of resources.
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * Uniquely identifies a rule that is used to schedule the backup of a
     * selection of resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleId <p>
     *            Uniquely identifies a rule that is used to schedule the backup
     *            of a selection of resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupRule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * An array of <code>CopyAction</code> objects, which contains the details
     * of the copy operation.
     * </p>
     *
     * @return <p>
     *         An array of <code>CopyAction</code> objects, which contains the
     *         details of the copy operation.
     *         </p>
     */
    public java.util.List<CopyAction> getCopyActions() {
        return copyActions;
    }

    /**
     * <p>
     * An array of <code>CopyAction</code> objects, which contains the details
     * of the copy operation.
     * </p>
     *
     * @param copyActions <p>
     *            An array of <code>CopyAction</code> objects, which contains
     *            the details of the copy operation.
     *            </p>
     */
    public void setCopyActions(java.util.Collection<CopyAction> copyActions) {
        if (copyActions == null) {
            this.copyActions = null;
            return;
        }

        this.copyActions = new java.util.ArrayList<CopyAction>(copyActions);
    }

    /**
     * <p>
     * An array of <code>CopyAction</code> objects, which contains the details
     * of the copy operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyActions <p>
     *            An array of <code>CopyAction</code> objects, which contains
     *            the details of the copy operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupRule withCopyActions(CopyAction... copyActions) {
        if (getCopyActions() == null) {
            this.copyActions = new java.util.ArrayList<CopyAction>(copyActions.length);
        }
        for (CopyAction value : copyActions) {
            this.copyActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>CopyAction</code> objects, which contains the details
     * of the copy operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyActions <p>
     *            An array of <code>CopyAction</code> objects, which contains
     *            the details of the copy operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupRule withCopyActions(java.util.Collection<CopyAction> copyActions) {
        setCopyActions(copyActions);
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
        if (getRuleName() != null)
            sb.append("RuleName: " + getRuleName() + ",");
        if (getTargetBackupVaultName() != null)
            sb.append("TargetBackupVaultName: " + getTargetBackupVaultName() + ",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: " + getScheduleExpression() + ",");
        if (getStartWindowMinutes() != null)
            sb.append("StartWindowMinutes: " + getStartWindowMinutes() + ",");
        if (getCompletionWindowMinutes() != null)
            sb.append("CompletionWindowMinutes: " + getCompletionWindowMinutes() + ",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle() + ",");
        if (getRecoveryPointTags() != null)
            sb.append("RecoveryPointTags: " + getRecoveryPointTags() + ",");
        if (getRuleId() != null)
            sb.append("RuleId: " + getRuleId() + ",");
        if (getCopyActions() != null)
            sb.append("CopyActions: " + getCopyActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetBackupVaultName() == null) ? 0 : getTargetBackupVaultName().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode
                + ((getStartWindowMinutes() == null) ? 0 : getStartWindowMinutes().hashCode());
        hashCode = prime
                * hashCode
                + ((getCompletionWindowMinutes() == null) ? 0 : getCompletionWindowMinutes()
                        .hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode
                + ((getRecoveryPointTags() == null) ? 0 : getRecoveryPointTags().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode
                + ((getCopyActions() == null) ? 0 : getCopyActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupRule == false)
            return false;
        BackupRule other = (BackupRule) obj;

        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getTargetBackupVaultName() == null ^ this.getTargetBackupVaultName() == null)
            return false;
        if (other.getTargetBackupVaultName() != null
                && other.getTargetBackupVaultName().equals(this.getTargetBackupVaultName()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null
                && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getStartWindowMinutes() == null ^ this.getStartWindowMinutes() == null)
            return false;
        if (other.getStartWindowMinutes() != null
                && other.getStartWindowMinutes().equals(this.getStartWindowMinutes()) == false)
            return false;
        if (other.getCompletionWindowMinutes() == null ^ this.getCompletionWindowMinutes() == null)
            return false;
        if (other.getCompletionWindowMinutes() != null
                && other.getCompletionWindowMinutes().equals(this.getCompletionWindowMinutes()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getRecoveryPointTags() == null ^ this.getRecoveryPointTags() == null)
            return false;
        if (other.getRecoveryPointTags() != null
                && other.getRecoveryPointTags().equals(this.getRecoveryPointTags()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getCopyActions() == null ^ this.getCopyActions() == null)
            return false;
        if (other.getCopyActions() != null
                && other.getCopyActions().equals(this.getCopyActions()) == false)
            return false;
        return true;
    }
}
