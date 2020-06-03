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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * Container for response returned by <code> <a>GetUpgradeStatus</a> </code>
 * operation.
 * </p>
 */
public class GetUpgradeStatusResult implements Serializable {
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
     * One of 4 statuses that a step can go through returned as part of the
     * <code> <a>GetUpgradeStatusResponse</a> </code> object. The status can
     * take one of the following values:
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
    private String stepStatus;

    /**
     * <p>
     * A string that describes the update briefly
     * </p>
     */
    private String upgradeName;

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
    public GetUpgradeStatusResult withUpgradeStep(String upgradeStep) {
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
    public GetUpgradeStatusResult withUpgradeStep(UpgradeStep upgradeStep) {
        this.upgradeStep = upgradeStep.toString();
        return this;
    }

    /**
     * <p>
     * One of 4 statuses that a step can go through returned as part of the
     * <code> <a>GetUpgradeStatusResponse</a> </code> object. The status can
     * take one of the following values:
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
     *         One of 4 statuses that a step can go through returned as part of
     *         the <code> <a>GetUpgradeStatusResponse</a> </code> object. The
     *         status can take one of the following values:
     *         <ul>
     *         <li>In Progress</li>
     *         <li>Succeeded</li>
     *         <li>Succeeded with Issues</li>
     *         <li>Failed</li>
     *         </ul>
     *         </p>
     * @see UpgradeStatus
     */
    public String getStepStatus() {
        return stepStatus;
    }

    /**
     * <p>
     * One of 4 statuses that a step can go through returned as part of the
     * <code> <a>GetUpgradeStatusResponse</a> </code> object. The status can
     * take one of the following values:
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
     * @param stepStatus <p>
     *            One of 4 statuses that a step can go through returned as part
     *            of the <code> <a>GetUpgradeStatusResponse</a> </code> object.
     *            The status can take one of the following values:
     *            <ul>
     *            <li>In Progress</li>
     *            <li>Succeeded</li>
     *            <li>Succeeded with Issues</li>
     *            <li>Failed</li>
     *            </ul>
     *            </p>
     * @see UpgradeStatus
     */
    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
    }

    /**
     * <p>
     * One of 4 statuses that a step can go through returned as part of the
     * <code> <a>GetUpgradeStatusResponse</a> </code> object. The status can
     * take one of the following values:
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
     * @param stepStatus <p>
     *            One of 4 statuses that a step can go through returned as part
     *            of the <code> <a>GetUpgradeStatusResponse</a> </code> object.
     *            The status can take one of the following values:
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
    public GetUpgradeStatusResult withStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
        return this;
    }

    /**
     * <p>
     * One of 4 statuses that a step can go through returned as part of the
     * <code> <a>GetUpgradeStatusResponse</a> </code> object. The status can
     * take one of the following values:
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
     * @param stepStatus <p>
     *            One of 4 statuses that a step can go through returned as part
     *            of the <code> <a>GetUpgradeStatusResponse</a> </code> object.
     *            The status can take one of the following values:
     *            <ul>
     *            <li>In Progress</li>
     *            <li>Succeeded</li>
     *            <li>Succeeded with Issues</li>
     *            <li>Failed</li>
     *            </ul>
     *            </p>
     * @see UpgradeStatus
     */
    public void setStepStatus(UpgradeStatus stepStatus) {
        this.stepStatus = stepStatus.toString();
    }

    /**
     * <p>
     * One of 4 statuses that a step can go through returned as part of the
     * <code> <a>GetUpgradeStatusResponse</a> </code> object. The status can
     * take one of the following values:
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
     * @param stepStatus <p>
     *            One of 4 statuses that a step can go through returned as part
     *            of the <code> <a>GetUpgradeStatusResponse</a> </code> object.
     *            The status can take one of the following values:
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
    public GetUpgradeStatusResult withStepStatus(UpgradeStatus stepStatus) {
        this.stepStatus = stepStatus.toString();
        return this;
    }

    /**
     * <p>
     * A string that describes the update briefly
     * </p>
     *
     * @return <p>
     *         A string that describes the update briefly
     *         </p>
     */
    public String getUpgradeName() {
        return upgradeName;
    }

    /**
     * <p>
     * A string that describes the update briefly
     * </p>
     *
     * @param upgradeName <p>
     *            A string that describes the update briefly
     *            </p>
     */
    public void setUpgradeName(String upgradeName) {
        this.upgradeName = upgradeName;
    }

    /**
     * <p>
     * A string that describes the update briefly
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param upgradeName <p>
     *            A string that describes the update briefly
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUpgradeStatusResult withUpgradeName(String upgradeName) {
        this.upgradeName = upgradeName;
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
        if (getStepStatus() != null)
            sb.append("StepStatus: " + getStepStatus() + ",");
        if (getUpgradeName() != null)
            sb.append("UpgradeName: " + getUpgradeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUpgradeStep() == null) ? 0 : getUpgradeStep().hashCode());
        hashCode = prime * hashCode + ((getStepStatus() == null) ? 0 : getStepStatus().hashCode());
        hashCode = prime * hashCode
                + ((getUpgradeName() == null) ? 0 : getUpgradeName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUpgradeStatusResult == false)
            return false;
        GetUpgradeStatusResult other = (GetUpgradeStatusResult) obj;

        if (other.getUpgradeStep() == null ^ this.getUpgradeStep() == null)
            return false;
        if (other.getUpgradeStep() != null
                && other.getUpgradeStep().equals(this.getUpgradeStep()) == false)
            return false;
        if (other.getStepStatus() == null ^ this.getStepStatus() == null)
            return false;
        if (other.getStepStatus() != null
                && other.getStepStatus().equals(this.getStepStatus()) == false)
            return false;
        if (other.getUpgradeName() == null ^ this.getUpgradeName() == null)
            return false;
        if (other.getUpgradeName() != null
                && other.getUpgradeName().equals(this.getUpgradeName()) == false)
            return false;
        return true;
    }
}
