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
 * Contains information about the backup plan and rule that AWS Backup used to
 * initiate the recovery point backup.
 * </p>
 */
public class RecoveryPointCreator implements Serializable {
    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     */
    private String backupPlanId;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     * .
     * </p>
     */
    private String backupPlanArn;

    /**
     * <p>
     * Version IDs are unique, randomly generated, Unicode, UTF-8 encoded
     * strings that are at most 1,024 bytes long. They cannot be edited.
     * </p>
     */
    private String backupPlanVersion;

    /**
     * <p>
     * Uniquely identifies a rule used to schedule the backup of a selection of
     * resources.
     * </p>
     */
    private String backupRuleId;

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies a backup plan.
     *         </p>
     */
    public String getBackupPlanId() {
        return backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     *
     * @param backupPlanId <p>
     *            Uniquely identifies a backup plan.
     *            </p>
     */
    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanId <p>
     *            Uniquely identifies a backup plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointCreator withBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     * .
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies a backup
     *         plan; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     *         .
     *         </p>
     */
    public String getBackupPlanArn() {
        return backupPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     * .
     * </p>
     *
     * @param backupPlanArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            backup plan; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     *            .
     *            </p>
     */
    public void setBackupPlanArn(String backupPlanArn) {
        this.backupPlanArn = backupPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            backup plan; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointCreator withBackupPlanArn(String backupPlanArn) {
        this.backupPlanArn = backupPlanArn;
        return this;
    }

    /**
     * <p>
     * Version IDs are unique, randomly generated, Unicode, UTF-8 encoded
     * strings that are at most 1,024 bytes long. They cannot be edited.
     * </p>
     *
     * @return <p>
     *         Version IDs are unique, randomly generated, Unicode, UTF-8
     *         encoded strings that are at most 1,024 bytes long. They cannot be
     *         edited.
     *         </p>
     */
    public String getBackupPlanVersion() {
        return backupPlanVersion;
    }

    /**
     * <p>
     * Version IDs are unique, randomly generated, Unicode, UTF-8 encoded
     * strings that are at most 1,024 bytes long. They cannot be edited.
     * </p>
     *
     * @param backupPlanVersion <p>
     *            Version IDs are unique, randomly generated, Unicode, UTF-8
     *            encoded strings that are at most 1,024 bytes long. They cannot
     *            be edited.
     *            </p>
     */
    public void setBackupPlanVersion(String backupPlanVersion) {
        this.backupPlanVersion = backupPlanVersion;
    }

    /**
     * <p>
     * Version IDs are unique, randomly generated, Unicode, UTF-8 encoded
     * strings that are at most 1,024 bytes long. They cannot be edited.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanVersion <p>
     *            Version IDs are unique, randomly generated, Unicode, UTF-8
     *            encoded strings that are at most 1,024 bytes long. They cannot
     *            be edited.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointCreator withBackupPlanVersion(String backupPlanVersion) {
        this.backupPlanVersion = backupPlanVersion;
        return this;
    }

    /**
     * <p>
     * Uniquely identifies a rule used to schedule the backup of a selection of
     * resources.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies a rule used to schedule the backup of a
     *         selection of resources.
     *         </p>
     */
    public String getBackupRuleId() {
        return backupRuleId;
    }

    /**
     * <p>
     * Uniquely identifies a rule used to schedule the backup of a selection of
     * resources.
     * </p>
     *
     * @param backupRuleId <p>
     *            Uniquely identifies a rule used to schedule the backup of a
     *            selection of resources.
     *            </p>
     */
    public void setBackupRuleId(String backupRuleId) {
        this.backupRuleId = backupRuleId;
    }

    /**
     * <p>
     * Uniquely identifies a rule used to schedule the backup of a selection of
     * resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupRuleId <p>
     *            Uniquely identifies a rule used to schedule the backup of a
     *            selection of resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointCreator withBackupRuleId(String backupRuleId) {
        this.backupRuleId = backupRuleId;
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
        if (getBackupPlanId() != null)
            sb.append("BackupPlanId: " + getBackupPlanId() + ",");
        if (getBackupPlanArn() != null)
            sb.append("BackupPlanArn: " + getBackupPlanArn() + ",");
        if (getBackupPlanVersion() != null)
            sb.append("BackupPlanVersion: " + getBackupPlanVersion() + ",");
        if (getBackupRuleId() != null)
            sb.append("BackupRuleId: " + getBackupRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode
                + ((getBackupPlanArn() == null) ? 0 : getBackupPlanArn().hashCode());
        hashCode = prime * hashCode
                + ((getBackupPlanVersion() == null) ? 0 : getBackupPlanVersion().hashCode());
        hashCode = prime * hashCode
                + ((getBackupRuleId() == null) ? 0 : getBackupRuleId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryPointCreator == false)
            return false;
        RecoveryPointCreator other = (RecoveryPointCreator) obj;

        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null
                && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getBackupPlanArn() == null ^ this.getBackupPlanArn() == null)
            return false;
        if (other.getBackupPlanArn() != null
                && other.getBackupPlanArn().equals(this.getBackupPlanArn()) == false)
            return false;
        if (other.getBackupPlanVersion() == null ^ this.getBackupPlanVersion() == null)
            return false;
        if (other.getBackupPlanVersion() != null
                && other.getBackupPlanVersion().equals(this.getBackupPlanVersion()) == false)
            return false;
        if (other.getBackupRuleId() == null ^ this.getBackupRuleId() == null)
            return false;
        if (other.getBackupRuleId() != null
                && other.getBackupRuleId().equals(this.getBackupRuleId()) == false)
            return false;
        return true;
    }
}
