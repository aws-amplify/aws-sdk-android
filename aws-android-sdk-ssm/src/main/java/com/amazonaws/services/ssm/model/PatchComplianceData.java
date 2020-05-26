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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the state of a patch on a particular instance as it relates
 * to the patch baseline used to patch the instance.
 * </p>
 */
public class PatchComplianceData implements Serializable {
    /**
     * <p>
     * The title of the patch.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The operating system-specific ID of the patch.
     * </p>
     */
    private String kBId;

    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates,
     * CriticalUpdates).
     * </p>
     */
    private String classification;

    /**
     * <p>
     * The severity of the patch (for example, Critical, Important, Moderate).
     * </p>
     */
    private String severity;

    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTALLED, INSTALLED_OTHER,
     * INSTALLED_PENDING_REBOOT, INSTALLED_REJECTED, MISSING, NOT_APPLICABLE,
     * FAILED
     */
    private String state;

    /**
     * <p>
     * The date/time the patch was installed on the instance. Note that not all
     * operating systems provide this level of information.
     * </p>
     */
    private java.util.Date installedTime;

    /**
     * <p>
     * The title of the patch.
     * </p>
     *
     * @return <p>
     *         The title of the patch.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title of the patch.
     * </p>
     *
     * @param title <p>
     *            The title of the patch.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the patch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title <p>
     *            The title of the patch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchComplianceData withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The operating system-specific ID of the patch.
     * </p>
     *
     * @return <p>
     *         The operating system-specific ID of the patch.
     *         </p>
     */
    public String getKBId() {
        return kBId;
    }

    /**
     * <p>
     * The operating system-specific ID of the patch.
     * </p>
     *
     * @param kBId <p>
     *            The operating system-specific ID of the patch.
     *            </p>
     */
    public void setKBId(String kBId) {
        this.kBId = kBId;
    }

    /**
     * <p>
     * The operating system-specific ID of the patch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kBId <p>
     *            The operating system-specific ID of the patch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchComplianceData withKBId(String kBId) {
        this.kBId = kBId;
        return this;
    }

    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates,
     * CriticalUpdates).
     * </p>
     *
     * @return <p>
     *         The classification of the patch (for example, SecurityUpdates,
     *         Updates, CriticalUpdates).
     *         </p>
     */
    public String getClassification() {
        return classification;
    }

    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates,
     * CriticalUpdates).
     * </p>
     *
     * @param classification <p>
     *            The classification of the patch (for example, SecurityUpdates,
     *            Updates, CriticalUpdates).
     *            </p>
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * The classification of the patch (for example, SecurityUpdates, Updates,
     * CriticalUpdates).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classification <p>
     *            The classification of the patch (for example, SecurityUpdates,
     *            Updates, CriticalUpdates).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchComplianceData withClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * <p>
     * The severity of the patch (for example, Critical, Important, Moderate).
     * </p>
     *
     * @return <p>
     *         The severity of the patch (for example, Critical, Important,
     *         Moderate).
     *         </p>
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * <p>
     * The severity of the patch (for example, Critical, Important, Moderate).
     * </p>
     *
     * @param severity <p>
     *            The severity of the patch (for example, Critical, Important,
     *            Moderate).
     *            </p>
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the patch (for example, Critical, Important, Moderate).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param severity <p>
     *            The severity of the patch (for example, Critical, Important,
     *            Moderate).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchComplianceData withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTALLED, INSTALLED_OTHER,
     * INSTALLED_PENDING_REBOOT, INSTALLED_REJECTED, MISSING, NOT_APPLICABLE,
     * FAILED
     *
     * @return <p>
     *         The state of the patch on the instance, such as INSTALLED or
     *         FAILED.
     *         </p>
     *         <p>
     *         For descriptions of each patch state, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     *         >About patch compliance</a> in the <i>AWS Systems Manager User
     *         Guide</i>.
     *         </p>
     * @see PatchComplianceDataState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTALLED, INSTALLED_OTHER,
     * INSTALLED_PENDING_REBOOT, INSTALLED_REJECTED, MISSING, NOT_APPLICABLE,
     * FAILED
     *
     * @param state <p>
     *            The state of the patch on the instance, such as INSTALLED or
     *            FAILED.
     *            </p>
     *            <p>
     *            For descriptions of each patch state, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     *            >About patch compliance</a> in the <i>AWS Systems Manager User
     *            Guide</i>.
     *            </p>
     * @see PatchComplianceDataState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTALLED, INSTALLED_OTHER,
     * INSTALLED_PENDING_REBOOT, INSTALLED_REJECTED, MISSING, NOT_APPLICABLE,
     * FAILED
     *
     * @param state <p>
     *            The state of the patch on the instance, such as INSTALLED or
     *            FAILED.
     *            </p>
     *            <p>
     *            For descriptions of each patch state, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     *            >About patch compliance</a> in the <i>AWS Systems Manager User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchComplianceDataState
     */
    public PatchComplianceData withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTALLED, INSTALLED_OTHER,
     * INSTALLED_PENDING_REBOOT, INSTALLED_REJECTED, MISSING, NOT_APPLICABLE,
     * FAILED
     *
     * @param state <p>
     *            The state of the patch on the instance, such as INSTALLED or
     *            FAILED.
     *            </p>
     *            <p>
     *            For descriptions of each patch state, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     *            >About patch compliance</a> in the <i>AWS Systems Manager User
     *            Guide</i>.
     *            </p>
     * @see PatchComplianceDataState
     */
    public void setState(PatchComplianceDataState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the patch on the instance, such as INSTALLED or FAILED.
     * </p>
     * <p>
     * For descriptions of each patch state, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     * >About patch compliance</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTALLED, INSTALLED_OTHER,
     * INSTALLED_PENDING_REBOOT, INSTALLED_REJECTED, MISSING, NOT_APPLICABLE,
     * FAILED
     *
     * @param state <p>
     *            The state of the patch on the instance, such as INSTALLED or
     *            FAILED.
     *            </p>
     *            <p>
     *            For descriptions of each patch state, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-compliance-about.html#sysman-compliance-monitor-patch"
     *            >About patch compliance</a> in the <i>AWS Systems Manager User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchComplianceDataState
     */
    public PatchComplianceData withState(PatchComplianceDataState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date/time the patch was installed on the instance. Note that not all
     * operating systems provide this level of information.
     * </p>
     *
     * @return <p>
     *         The date/time the patch was installed on the instance. Note that
     *         not all operating systems provide this level of information.
     *         </p>
     */
    public java.util.Date getInstalledTime() {
        return installedTime;
    }

    /**
     * <p>
     * The date/time the patch was installed on the instance. Note that not all
     * operating systems provide this level of information.
     * </p>
     *
     * @param installedTime <p>
     *            The date/time the patch was installed on the instance. Note
     *            that not all operating systems provide this level of
     *            information.
     *            </p>
     */
    public void setInstalledTime(java.util.Date installedTime) {
        this.installedTime = installedTime;
    }

    /**
     * <p>
     * The date/time the patch was installed on the instance. Note that not all
     * operating systems provide this level of information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param installedTime <p>
     *            The date/time the patch was installed on the instance. Note
     *            that not all operating systems provide this level of
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchComplianceData withInstalledTime(java.util.Date installedTime) {
        this.installedTime = installedTime;
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
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getKBId() != null)
            sb.append("KBId: " + getKBId() + ",");
        if (getClassification() != null)
            sb.append("Classification: " + getClassification() + ",");
        if (getSeverity() != null)
            sb.append("Severity: " + getSeverity() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getInstalledTime() != null)
            sb.append("InstalledTime: " + getInstalledTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getKBId() == null) ? 0 : getKBId().hashCode());
        hashCode = prime * hashCode
                + ((getClassification() == null) ? 0 : getClassification().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getInstalledTime() == null) ? 0 : getInstalledTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchComplianceData == false)
            return false;
        PatchComplianceData other = (PatchComplianceData) obj;

        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getKBId() == null ^ this.getKBId() == null)
            return false;
        if (other.getKBId() != null && other.getKBId().equals(this.getKBId()) == false)
            return false;
        if (other.getClassification() == null ^ this.getClassification() == null)
            return false;
        if (other.getClassification() != null
                && other.getClassification().equals(this.getClassification()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getInstalledTime() == null ^ this.getInstalledTime() == null)
            return false;
        if (other.getInstalledTime() != null
                && other.getInstalledTime().equals(this.getInstalledTime()) == false)
            return false;
        return true;
    }
}
