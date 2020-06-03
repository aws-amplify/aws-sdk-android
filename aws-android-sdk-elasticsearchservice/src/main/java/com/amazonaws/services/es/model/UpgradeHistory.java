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
 * History of the last 10 Upgrades and Upgrade Eligibility Checks.
 * </p>
 */
public class UpgradeHistory implements Serializable {
    /**
     * <p>
     * A string that describes the update briefly
     * </p>
     */
    private String upgradeName;

    /**
     * <p>
     * UTC Timestamp at which the Upgrade API call was made in
     * "yyyy-MM-ddTHH:mm:ssZ" format.
     * </p>
     */
    private java.util.Date startTimestamp;

    /**
     * <p>
     * The overall status of the update. The status can take one of the
     * following values:
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
    private String upgradeStatus;

    /**
     * <p>
     * A list of <code> <a>UpgradeStepItem</a> </code> s representing
     * information about each step performed as pard of a specific Upgrade or
     * Upgrade Eligibility Check.
     * </p>
     */
    private java.util.List<UpgradeStepItem> stepsList;

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
    public UpgradeHistory withUpgradeName(String upgradeName) {
        this.upgradeName = upgradeName;
        return this;
    }

    /**
     * <p>
     * UTC Timestamp at which the Upgrade API call was made in
     * "yyyy-MM-ddTHH:mm:ssZ" format.
     * </p>
     *
     * @return <p>
     *         UTC Timestamp at which the Upgrade API call was made in
     *         "yyyy-MM-ddTHH:mm:ssZ" format.
     *         </p>
     */
    public java.util.Date getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * <p>
     * UTC Timestamp at which the Upgrade API call was made in
     * "yyyy-MM-ddTHH:mm:ssZ" format.
     * </p>
     *
     * @param startTimestamp <p>
     *            UTC Timestamp at which the Upgrade API call was made in
     *            "yyyy-MM-ddTHH:mm:ssZ" format.
     *            </p>
     */
    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * UTC Timestamp at which the Upgrade API call was made in
     * "yyyy-MM-ddTHH:mm:ssZ" format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimestamp <p>
     *            UTC Timestamp at which the Upgrade API call was made in
     *            "yyyy-MM-ddTHH:mm:ssZ" format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeHistory withStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * <p>
     * The overall status of the update. The status can take one of the
     * following values:
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
     *         The overall status of the update. The status can take one of the
     *         following values:
     *         <ul>
     *         <li>In Progress</li>
     *         <li>Succeeded</li>
     *         <li>Succeeded with Issues</li>
     *         <li>Failed</li>
     *         </ul>
     *         </p>
     * @see UpgradeStatus
     */
    public String getUpgradeStatus() {
        return upgradeStatus;
    }

    /**
     * <p>
     * The overall status of the update. The status can take one of the
     * following values:
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
     * @param upgradeStatus <p>
     *            The overall status of the update. The status can take one of
     *            the following values:
     *            <ul>
     *            <li>In Progress</li>
     *            <li>Succeeded</li>
     *            <li>Succeeded with Issues</li>
     *            <li>Failed</li>
     *            </ul>
     *            </p>
     * @see UpgradeStatus
     */
    public void setUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
    }

    /**
     * <p>
     * The overall status of the update. The status can take one of the
     * following values:
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
     * @param upgradeStatus <p>
     *            The overall status of the update. The status can take one of
     *            the following values:
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
    public UpgradeHistory withUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
        return this;
    }

    /**
     * <p>
     * The overall status of the update. The status can take one of the
     * following values:
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
     * @param upgradeStatus <p>
     *            The overall status of the update. The status can take one of
     *            the following values:
     *            <ul>
     *            <li>In Progress</li>
     *            <li>Succeeded</li>
     *            <li>Succeeded with Issues</li>
     *            <li>Failed</li>
     *            </ul>
     *            </p>
     * @see UpgradeStatus
     */
    public void setUpgradeStatus(UpgradeStatus upgradeStatus) {
        this.upgradeStatus = upgradeStatus.toString();
    }

    /**
     * <p>
     * The overall status of the update. The status can take one of the
     * following values:
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
     * @param upgradeStatus <p>
     *            The overall status of the update. The status can take one of
     *            the following values:
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
    public UpgradeHistory withUpgradeStatus(UpgradeStatus upgradeStatus) {
        this.upgradeStatus = upgradeStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of <code> <a>UpgradeStepItem</a> </code> s representing
     * information about each step performed as pard of a specific Upgrade or
     * Upgrade Eligibility Check.
     * </p>
     *
     * @return <p>
     *         A list of <code> <a>UpgradeStepItem</a> </code> s representing
     *         information about each step performed as pard of a specific
     *         Upgrade or Upgrade Eligibility Check.
     *         </p>
     */
    public java.util.List<UpgradeStepItem> getStepsList() {
        return stepsList;
    }

    /**
     * <p>
     * A list of <code> <a>UpgradeStepItem</a> </code> s representing
     * information about each step performed as pard of a specific Upgrade or
     * Upgrade Eligibility Check.
     * </p>
     *
     * @param stepsList <p>
     *            A list of <code> <a>UpgradeStepItem</a> </code> s representing
     *            information about each step performed as pard of a specific
     *            Upgrade or Upgrade Eligibility Check.
     *            </p>
     */
    public void setStepsList(java.util.Collection<UpgradeStepItem> stepsList) {
        if (stepsList == null) {
            this.stepsList = null;
            return;
        }

        this.stepsList = new java.util.ArrayList<UpgradeStepItem>(stepsList);
    }

    /**
     * <p>
     * A list of <code> <a>UpgradeStepItem</a> </code> s representing
     * information about each step performed as pard of a specific Upgrade or
     * Upgrade Eligibility Check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepsList <p>
     *            A list of <code> <a>UpgradeStepItem</a> </code> s representing
     *            information about each step performed as pard of a specific
     *            Upgrade or Upgrade Eligibility Check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeHistory withStepsList(UpgradeStepItem... stepsList) {
        if (getStepsList() == null) {
            this.stepsList = new java.util.ArrayList<UpgradeStepItem>(stepsList.length);
        }
        for (UpgradeStepItem value : stepsList) {
            this.stepsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code> <a>UpgradeStepItem</a> </code> s representing
     * information about each step performed as pard of a specific Upgrade or
     * Upgrade Eligibility Check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepsList <p>
     *            A list of <code> <a>UpgradeStepItem</a> </code> s representing
     *            information about each step performed as pard of a specific
     *            Upgrade or Upgrade Eligibility Check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeHistory withStepsList(java.util.Collection<UpgradeStepItem> stepsList) {
        setStepsList(stepsList);
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
        if (getUpgradeName() != null)
            sb.append("UpgradeName: " + getUpgradeName() + ",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: " + getStartTimestamp() + ",");
        if (getUpgradeStatus() != null)
            sb.append("UpgradeStatus: " + getUpgradeStatus() + ",");
        if (getStepsList() != null)
            sb.append("StepsList: " + getStepsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUpgradeName() == null) ? 0 : getUpgradeName().hashCode());
        hashCode = prime * hashCode
                + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getUpgradeStatus() == null) ? 0 : getUpgradeStatus().hashCode());
        hashCode = prime * hashCode + ((getStepsList() == null) ? 0 : getStepsList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeHistory == false)
            return false;
        UpgradeHistory other = (UpgradeHistory) obj;

        if (other.getUpgradeName() == null ^ this.getUpgradeName() == null)
            return false;
        if (other.getUpgradeName() != null
                && other.getUpgradeName().equals(this.getUpgradeName()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null
                && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getUpgradeStatus() == null ^ this.getUpgradeStatus() == null)
            return false;
        if (other.getUpgradeStatus() != null
                && other.getUpgradeStatus().equals(this.getUpgradeStatus()) == false)
            return false;
        if (other.getStepsList() == null ^ this.getStepsList() == null)
            return false;
        if (other.getStepsList() != null
                && other.getStepsList().equals(this.getStepsList()) == false)
            return false;
        return true;
    }
}
