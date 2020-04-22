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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a single step of the Upgrade or Upgrade Eligibility Check
 * workflow.
 * </p>
 */
public class UpgradeStepItem implements Serializable {
    /**
     * <p>
     * Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check
     * does through:
     * <ul>
     * <li>PreUpgradeCheck</li>
     * <li>Snapshot</li>
     * <li>Upgrade</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE
     */
    private String upgradeStep;

    /**
     * <p>
     * The status of a particular step during an upgrade. The status can take
     * one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES,
     * FAILED
     */
    private String upgradeStepStatus;

    /**
     * <p>
     * A list of strings containing detailed information about the errors
     * encountered in a particular step.
     * </p>
     */
    private java.util.List<String> issues;

    /**
     * <p>
     * The Floating point value representing progress percentage of a particular
     * step.
     * </p>
     */
    private Double progressPercent;

    /**
     * <p>
     * Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check
     * does through:
     * <ul>
     * <li>PreUpgradeCheck</li>
     * <li>Snapshot</li>
     * <li>Upgrade</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE
     *
     * @return <p>
     *         Represents one of 3 steps that an Upgrade or Upgrade Eligibility
     *         Check does through:
     *         <ul>
     *         <li>PreUpgradeCheck</li>
     *         <li>Snapshot</li>
     *         <li>Upgrade</li>
     *         </ul>
     *         </p>
     * @see UpgradeStep
     */
    public String getUpgradeStep() {
        return upgradeStep;
    }

    /**
     * <p>
     * Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check
     * does through:
     * <ul>
     * <li>PreUpgradeCheck</li>
     * <li>Snapshot</li>
     * <li>Upgrade</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE
     *
     * @param upgradeStep <p>
     *            Represents one of 3 steps that an Upgrade or Upgrade
     *            Eligibility Check does through:
     *            <ul>
     *            <li>PreUpgradeCheck</li>
     *            <li>Snapshot</li>
     *            <li>Upgrade</li>
     *            </ul>
     *            </p>
     * @see UpgradeStep
     */
    public void setUpgradeStep(String upgradeStep) {
        this.upgradeStep = upgradeStep;
    }

    /**
     * <p>
     * Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check
     * does through:
     * <ul>
     * <li>PreUpgradeCheck</li>
     * <li>Snapshot</li>
     * <li>Upgrade</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE
     *
     * @param upgradeStep <p>
     *            Represents one of 3 steps that an Upgrade or Upgrade
     *            Eligibility Check does through:
     *            <ul>
     *            <li>PreUpgradeCheck</li>
     *            <li>Snapshot</li>
     *            <li>Upgrade</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpgradeStep
     */
    public UpgradeStepItem withUpgradeStep(String upgradeStep) {
        this.upgradeStep = upgradeStep;
        return this;
    }

    /**
     * <p>
     * Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check
     * does through:
     * <ul>
     * <li>PreUpgradeCheck</li>
     * <li>Snapshot</li>
     * <li>Upgrade</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE
     *
     * @param upgradeStep <p>
     *            Represents one of 3 steps that an Upgrade or Upgrade
     *            Eligibility Check does through:
     *            <ul>
     *            <li>PreUpgradeCheck</li>
     *            <li>Snapshot</li>
     *            <li>Upgrade</li>
     *            </ul>
     *            </p>
     * @see UpgradeStep
     */
    public void setUpgradeStep(UpgradeStep upgradeStep) {
        this.upgradeStep = upgradeStep.toString();
    }

    /**
     * <p>
     * Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check
     * does through:
     * <ul>
     * <li>PreUpgradeCheck</li>
     * <li>Snapshot</li>
     * <li>Upgrade</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE
     *
     * @param upgradeStep <p>
     *            Represents one of 3 steps that an Upgrade or Upgrade
     *            Eligibility Check does through:
     *            <ul>
     *            <li>PreUpgradeCheck</li>
     *            <li>Snapshot</li>
     *            <li>Upgrade</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpgradeStep
     */
    public UpgradeStepItem withUpgradeStep(UpgradeStep upgradeStep) {
        this.upgradeStep = upgradeStep.toString();
        return this;
    }

    /**
     * <p>
     * The status of a particular step during an upgrade. The status can take
     * one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES,
     * FAILED
     *
     * @return <p>
     *         The status of a particular step during an upgrade. The status can
     *         take one of the following values:
     *         <ul>
     *         <li>In Progress</li>
     *         <li>Succeeded</li>
     *         <li>Succeeded with Issues</li>
     *         <li>Failed</li>
     *         </ul>
     *         </p>
     * @see UpgradeStatus
     */
    public String getUpgradeStepStatus() {
        return upgradeStepStatus;
    }

    /**
     * <p>
     * The status of a particular step during an upgrade. The status can take
     * one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES,
     * FAILED
     *
     * @param upgradeStepStatus <p>
     *            The status of a particular step during an upgrade. The status
     *            can take one of the following values:
     *            <ul>
     *            <li>In Progress</li>
     *            <li>Succeeded</li>
     *            <li>Succeeded with Issues</li>
     *            <li>Failed</li>
     *            </ul>
     *            </p>
     * @see UpgradeStatus
     */
    public void setUpgradeStepStatus(String upgradeStepStatus) {
        this.upgradeStepStatus = upgradeStepStatus;
    }

    /**
     * <p>
     * The status of a particular step during an upgrade. The status can take
     * one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES,
     * FAILED
     *
     * @param upgradeStepStatus <p>
     *            The status of a particular step during an upgrade. The status
     *            can take one of the following values:
     *            <ul>
     *            <li>In Progress</li>
     *            <li>Succeeded</li>
     *            <li>Succeeded with Issues</li>
     *            <li>Failed</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpgradeStatus
     */
    public UpgradeStepItem withUpgradeStepStatus(String upgradeStepStatus) {
        this.upgradeStepStatus = upgradeStepStatus;
        return this;
    }

    /**
     * <p>
     * The status of a particular step during an upgrade. The status can take
     * one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES,
     * FAILED
     *
     * @param upgradeStepStatus <p>
     *            The status of a particular step during an upgrade. The status
     *            can take one of the following values:
     *            <ul>
     *            <li>In Progress</li>
     *            <li>Succeeded</li>
     *            <li>Succeeded with Issues</li>
     *            <li>Failed</li>
     *            </ul>
     *            </p>
     * @see UpgradeStatus
     */
    public void setUpgradeStepStatus(UpgradeStatus upgradeStepStatus) {
        this.upgradeStepStatus = upgradeStepStatus.toString();
    }

    /**
     * <p>
     * The status of a particular step during an upgrade. The status can take
     * one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES,
     * FAILED
     *
     * @param upgradeStepStatus <p>
     *            The status of a particular step during an upgrade. The status
     *            can take one of the following values:
     *            <ul>
     *            <li>In Progress</li>
     *            <li>Succeeded</li>
     *            <li>Succeeded with Issues</li>
     *            <li>Failed</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpgradeStatus
     */
    public UpgradeStepItem withUpgradeStepStatus(UpgradeStatus upgradeStepStatus) {
        this.upgradeStepStatus = upgradeStepStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of strings containing detailed information about the errors
     * encountered in a particular step.
     * </p>
     *
     * @return <p>
     *         A list of strings containing detailed information about the
     *         errors encountered in a particular step.
     *         </p>
     */
    public java.util.List<String> getIssues() {
        return issues;
    }

    /**
     * <p>
     * A list of strings containing detailed information about the errors
     * encountered in a particular step.
     * </p>
     *
     * @param issues <p>
     *            A list of strings containing detailed information about the
     *            errors encountered in a particular step.
     *            </p>
     */
    public void setIssues(java.util.Collection<String> issues) {
        if (issues == null) {
            this.issues = null;
            return;
        }

        this.issues = new java.util.ArrayList<String>(issues);
    }

    /**
     * <p>
     * A list of strings containing detailed information about the errors
     * encountered in a particular step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param issues <p>
     *            A list of strings containing detailed information about the
     *            errors encountered in a particular step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeStepItem withIssues(String... issues) {
        if (getIssues() == null) {
            this.issues = new java.util.ArrayList<String>(issues.length);
        }
        for (String value : issues) {
            this.issues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings containing detailed information about the errors
     * encountered in a particular step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param issues <p>
     *            A list of strings containing detailed information about the
     *            errors encountered in a particular step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeStepItem withIssues(java.util.Collection<String> issues) {
        setIssues(issues);
        return this;
    }

    /**
     * <p>
     * The Floating point value representing progress percentage of a particular
     * step.
     * </p>
     *
     * @return <p>
     *         The Floating point value representing progress percentage of a
     *         particular step.
     *         </p>
     */
    public Double getProgressPercent() {
        return progressPercent;
    }

    /**
     * <p>
     * The Floating point value representing progress percentage of a particular
     * step.
     * </p>
     *
     * @param progressPercent <p>
     *            The Floating point value representing progress percentage of a
     *            particular step.
     *            </p>
     */
    public void setProgressPercent(Double progressPercent) {
        this.progressPercent = progressPercent;
    }

    /**
     * <p>
     * The Floating point value representing progress percentage of a particular
     * step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progressPercent <p>
     *            The Floating point value representing progress percentage of a
     *            particular step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeStepItem withProgressPercent(Double progressPercent) {
        this.progressPercent = progressPercent;
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
        if (getUpgradeStep() != null)
            sb.append("UpgradeStep: " + getUpgradeStep() + ",");
        if (getUpgradeStepStatus() != null)
            sb.append("UpgradeStepStatus: " + getUpgradeStepStatus() + ",");
        if (getIssues() != null)
            sb.append("Issues: " + getIssues() + ",");
        if (getProgressPercent() != null)
            sb.append("ProgressPercent: " + getProgressPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUpgradeStep() == null) ? 0 : getUpgradeStep().hashCode());
        hashCode = prime * hashCode
                + ((getUpgradeStepStatus() == null) ? 0 : getUpgradeStepStatus().hashCode());
        hashCode = prime * hashCode + ((getIssues() == null) ? 0 : getIssues().hashCode());
        hashCode = prime * hashCode
                + ((getProgressPercent() == null) ? 0 : getProgressPercent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeStepItem == false)
            return false;
        UpgradeStepItem other = (UpgradeStepItem) obj;

        if (other.getUpgradeStep() == null ^ this.getUpgradeStep() == null)
            return false;
        if (other.getUpgradeStep() != null
                && other.getUpgradeStep().equals(this.getUpgradeStep()) == false)
            return false;
        if (other.getUpgradeStepStatus() == null ^ this.getUpgradeStepStatus() == null)
            return false;
        if (other.getUpgradeStepStatus() != null
                && other.getUpgradeStepStatus().equals(this.getUpgradeStepStatus()) == false)
            return false;
        if (other.getIssues() == null ^ this.getIssues() == null)
            return false;
        if (other.getIssues() != null && other.getIssues().equals(this.getIssues()) == false)
            return false;
        if (other.getProgressPercent() == null ^ this.getProgressPercent() == null)
            return false;
        if (other.getProgressPercent() != null
                && other.getProgressPercent().equals(this.getProgressPercent()) == false)
            return false;
        return true;
    }
}
