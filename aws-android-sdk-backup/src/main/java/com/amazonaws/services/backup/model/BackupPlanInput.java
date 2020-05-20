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
 * Contains an optional backup plan display name and an array of
 * <code>BackupRule</code> objects, each of which specifies a backup rule. Each
 * rule in a backup plan is a separate scheduled task and can back up a
 * different selection of AWS resources.
 * </p>
 */
public class BackupPlanInput implements Serializable {
    /**
     * <p>
     * The display name of a backup plan.
     * </p>
     */
    private String backupPlanName;

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a
     * scheduled task that is used to back up a selection of resources.
     * </p>
     */
    private java.util.List<BackupRuleInput> rules;

    /**
     * <p>
     * The display name of a backup plan.
     * </p>
     *
     * @return <p>
     *         The display name of a backup plan.
     *         </p>
     */
    public String getBackupPlanName() {
        return backupPlanName;
    }

    /**
     * <p>
     * The display name of a backup plan.
     * </p>
     *
     * @param backupPlanName <p>
     *            The display name of a backup plan.
     *            </p>
     */
    public void setBackupPlanName(String backupPlanName) {
        this.backupPlanName = backupPlanName;
    }

    /**
     * <p>
     * The display name of a backup plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanName <p>
     *            The display name of a backup plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupPlanInput withBackupPlanName(String backupPlanName) {
        this.backupPlanName = backupPlanName;
        return this;
    }

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a
     * scheduled task that is used to back up a selection of resources.
     * </p>
     *
     * @return <p>
     *         An array of <code>BackupRule</code> objects, each of which
     *         specifies a scheduled task that is used to back up a selection of
     *         resources.
     *         </p>
     */
    public java.util.List<BackupRuleInput> getRules() {
        return rules;
    }

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a
     * scheduled task that is used to back up a selection of resources.
     * </p>
     *
     * @param rules <p>
     *            An array of <code>BackupRule</code> objects, each of which
     *            specifies a scheduled task that is used to back up a selection
     *            of resources.
     *            </p>
     */
    public void setRules(java.util.Collection<BackupRuleInput> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<BackupRuleInput>(rules);
    }

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a
     * scheduled task that is used to back up a selection of resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            An array of <code>BackupRule</code> objects, each of which
     *            specifies a scheduled task that is used to back up a selection
     *            of resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupPlanInput withRules(BackupRuleInput... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<BackupRuleInput>(rules.length);
        }
        for (BackupRuleInput value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a
     * scheduled task that is used to back up a selection of resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            An array of <code>BackupRule</code> objects, each of which
     *            specifies a scheduled task that is used to back up a selection
     *            of resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupPlanInput withRules(java.util.Collection<BackupRuleInput> rules) {
        setRules(rules);
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
        if (getBackupPlanName() != null)
            sb.append("BackupPlanName: " + getBackupPlanName() + ",");
        if (getRules() != null)
            sb.append("Rules: " + getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupPlanName() == null) ? 0 : getBackupPlanName().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupPlanInput == false)
            return false;
        BackupPlanInput other = (BackupPlanInput) obj;

        if (other.getBackupPlanName() == null ^ this.getBackupPlanName() == null)
            return false;
        if (other.getBackupPlanName() != null
                && other.getBackupPlanName().equals(this.getBackupPlanName()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }
}
