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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a maintenance action pending for an AWS DMS resource, including
 * when and how it will be applied. This data type is a response element to the
 * <code>DescribePendingMaintenanceActions</code> operation.
 * </p>
 */
public class PendingMaintenanceAction implements Serializable {
    /**
     * <p>
     * The type of pending maintenance action that is available for the
     * resource.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The date of the maintenance window when the action is to be applied. The
     * maintenance action is applied to the resource during its first
     * maintenance window after this date. If this date is specified, any
     * <code>next-maintenance</code> opt-in requests are ignored.
     * </p>
     */
    private java.util.Date autoAppliedAfterDate;

    /**
     * <p>
     * The date when the maintenance action will be automatically applied. The
     * maintenance action is applied to the resource on this date regardless of
     * the maintenance window for the resource. If this date is specified, any
     * <code>immediate</code> opt-in requests are ignored.
     * </p>
     */
    private java.util.Date forcedApplyDate;

    /**
     * <p>
     * The type of opt-in request that has been received for the resource.
     * </p>
     */
    private String optInStatus;

    /**
     * <p>
     * The effective date when the pending maintenance action will be applied to
     * the resource. This date takes into account opt-in requests received from
     * the <code>ApplyPendingMaintenanceAction</code> API operation, and also
     * the <code>AutoAppliedAfterDate</code> and <code>ForcedApplyDate</code>
     * parameter values. This value is blank if an opt-in request has not been
     * received and nothing has been specified for
     * <code>AutoAppliedAfterDate</code> or <code>ForcedApplyDate</code>.
     * </p>
     */
    private java.util.Date currentApplyDate;

    /**
     * <p>
     * A description providing more detail about the maintenance action.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The type of pending maintenance action that is available for the
     * resource.
     * </p>
     *
     * @return <p>
     *         The type of pending maintenance action that is available for the
     *         resource.
     *         </p>
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The type of pending maintenance action that is available for the
     * resource.
     * </p>
     *
     * @param action <p>
     *            The type of pending maintenance action that is available for
     *            the resource.
     *            </p>
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of pending maintenance action that is available for the
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            The type of pending maintenance action that is available for
     *            the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingMaintenanceAction withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The date of the maintenance window when the action is to be applied. The
     * maintenance action is applied to the resource during its first
     * maintenance window after this date. If this date is specified, any
     * <code>next-maintenance</code> opt-in requests are ignored.
     * </p>
     *
     * @return <p>
     *         The date of the maintenance window when the action is to be
     *         applied. The maintenance action is applied to the resource during
     *         its first maintenance window after this date. If this date is
     *         specified, any <code>next-maintenance</code> opt-in requests are
     *         ignored.
     *         </p>
     */
    public java.util.Date getAutoAppliedAfterDate() {
        return autoAppliedAfterDate;
    }

    /**
     * <p>
     * The date of the maintenance window when the action is to be applied. The
     * maintenance action is applied to the resource during its first
     * maintenance window after this date. If this date is specified, any
     * <code>next-maintenance</code> opt-in requests are ignored.
     * </p>
     *
     * @param autoAppliedAfterDate <p>
     *            The date of the maintenance window when the action is to be
     *            applied. The maintenance action is applied to the resource
     *            during its first maintenance window after this date. If this
     *            date is specified, any <code>next-maintenance</code> opt-in
     *            requests are ignored.
     *            </p>
     */
    public void setAutoAppliedAfterDate(java.util.Date autoAppliedAfterDate) {
        this.autoAppliedAfterDate = autoAppliedAfterDate;
    }

    /**
     * <p>
     * The date of the maintenance window when the action is to be applied. The
     * maintenance action is applied to the resource during its first
     * maintenance window after this date. If this date is specified, any
     * <code>next-maintenance</code> opt-in requests are ignored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoAppliedAfterDate <p>
     *            The date of the maintenance window when the action is to be
     *            applied. The maintenance action is applied to the resource
     *            during its first maintenance window after this date. If this
     *            date is specified, any <code>next-maintenance</code> opt-in
     *            requests are ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingMaintenanceAction withAutoAppliedAfterDate(java.util.Date autoAppliedAfterDate) {
        this.autoAppliedAfterDate = autoAppliedAfterDate;
        return this;
    }

    /**
     * <p>
     * The date when the maintenance action will be automatically applied. The
     * maintenance action is applied to the resource on this date regardless of
     * the maintenance window for the resource. If this date is specified, any
     * <code>immediate</code> opt-in requests are ignored.
     * </p>
     *
     * @return <p>
     *         The date when the maintenance action will be automatically
     *         applied. The maintenance action is applied to the resource on
     *         this date regardless of the maintenance window for the resource.
     *         If this date is specified, any <code>immediate</code> opt-in
     *         requests are ignored.
     *         </p>
     */
    public java.util.Date getForcedApplyDate() {
        return forcedApplyDate;
    }

    /**
     * <p>
     * The date when the maintenance action will be automatically applied. The
     * maintenance action is applied to the resource on this date regardless of
     * the maintenance window for the resource. If this date is specified, any
     * <code>immediate</code> opt-in requests are ignored.
     * </p>
     *
     * @param forcedApplyDate <p>
     *            The date when the maintenance action will be automatically
     *            applied. The maintenance action is applied to the resource on
     *            this date regardless of the maintenance window for the
     *            resource. If this date is specified, any
     *            <code>immediate</code> opt-in requests are ignored.
     *            </p>
     */
    public void setForcedApplyDate(java.util.Date forcedApplyDate) {
        this.forcedApplyDate = forcedApplyDate;
    }

    /**
     * <p>
     * The date when the maintenance action will be automatically applied. The
     * maintenance action is applied to the resource on this date regardless of
     * the maintenance window for the resource. If this date is specified, any
     * <code>immediate</code> opt-in requests are ignored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forcedApplyDate <p>
     *            The date when the maintenance action will be automatically
     *            applied. The maintenance action is applied to the resource on
     *            this date regardless of the maintenance window for the
     *            resource. If this date is specified, any
     *            <code>immediate</code> opt-in requests are ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingMaintenanceAction withForcedApplyDate(java.util.Date forcedApplyDate) {
        this.forcedApplyDate = forcedApplyDate;
        return this;
    }

    /**
     * <p>
     * The type of opt-in request that has been received for the resource.
     * </p>
     *
     * @return <p>
     *         The type of opt-in request that has been received for the
     *         resource.
     *         </p>
     */
    public String getOptInStatus() {
        return optInStatus;
    }

    /**
     * <p>
     * The type of opt-in request that has been received for the resource.
     * </p>
     *
     * @param optInStatus <p>
     *            The type of opt-in request that has been received for the
     *            resource.
     *            </p>
     */
    public void setOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
    }

    /**
     * <p>
     * The type of opt-in request that has been received for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optInStatus <p>
     *            The type of opt-in request that has been received for the
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingMaintenanceAction withOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
        return this;
    }

    /**
     * <p>
     * The effective date when the pending maintenance action will be applied to
     * the resource. This date takes into account opt-in requests received from
     * the <code>ApplyPendingMaintenanceAction</code> API operation, and also
     * the <code>AutoAppliedAfterDate</code> and <code>ForcedApplyDate</code>
     * parameter values. This value is blank if an opt-in request has not been
     * received and nothing has been specified for
     * <code>AutoAppliedAfterDate</code> or <code>ForcedApplyDate</code>.
     * </p>
     *
     * @return <p>
     *         The effective date when the pending maintenance action will be
     *         applied to the resource. This date takes into account opt-in
     *         requests received from the
     *         <code>ApplyPendingMaintenanceAction</code> API operation, and
     *         also the <code>AutoAppliedAfterDate</code> and
     *         <code>ForcedApplyDate</code> parameter values. This value is
     *         blank if an opt-in request has not been received and nothing has
     *         been specified for <code>AutoAppliedAfterDate</code> or
     *         <code>ForcedApplyDate</code>.
     *         </p>
     */
    public java.util.Date getCurrentApplyDate() {
        return currentApplyDate;
    }

    /**
     * <p>
     * The effective date when the pending maintenance action will be applied to
     * the resource. This date takes into account opt-in requests received from
     * the <code>ApplyPendingMaintenanceAction</code> API operation, and also
     * the <code>AutoAppliedAfterDate</code> and <code>ForcedApplyDate</code>
     * parameter values. This value is blank if an opt-in request has not been
     * received and nothing has been specified for
     * <code>AutoAppliedAfterDate</code> or <code>ForcedApplyDate</code>.
     * </p>
     *
     * @param currentApplyDate <p>
     *            The effective date when the pending maintenance action will be
     *            applied to the resource. This date takes into account opt-in
     *            requests received from the
     *            <code>ApplyPendingMaintenanceAction</code> API operation, and
     *            also the <code>AutoAppliedAfterDate</code> and
     *            <code>ForcedApplyDate</code> parameter values. This value is
     *            blank if an opt-in request has not been received and nothing
     *            has been specified for <code>AutoAppliedAfterDate</code> or
     *            <code>ForcedApplyDate</code>.
     *            </p>
     */
    public void setCurrentApplyDate(java.util.Date currentApplyDate) {
        this.currentApplyDate = currentApplyDate;
    }

    /**
     * <p>
     * The effective date when the pending maintenance action will be applied to
     * the resource. This date takes into account opt-in requests received from
     * the <code>ApplyPendingMaintenanceAction</code> API operation, and also
     * the <code>AutoAppliedAfterDate</code> and <code>ForcedApplyDate</code>
     * parameter values. This value is blank if an opt-in request has not been
     * received and nothing has been specified for
     * <code>AutoAppliedAfterDate</code> or <code>ForcedApplyDate</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentApplyDate <p>
     *            The effective date when the pending maintenance action will be
     *            applied to the resource. This date takes into account opt-in
     *            requests received from the
     *            <code>ApplyPendingMaintenanceAction</code> API operation, and
     *            also the <code>AutoAppliedAfterDate</code> and
     *            <code>ForcedApplyDate</code> parameter values. This value is
     *            blank if an opt-in request has not been received and nothing
     *            has been specified for <code>AutoAppliedAfterDate</code> or
     *            <code>ForcedApplyDate</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingMaintenanceAction withCurrentApplyDate(java.util.Date currentApplyDate) {
        this.currentApplyDate = currentApplyDate;
        return this;
    }

    /**
     * <p>
     * A description providing more detail about the maintenance action.
     * </p>
     *
     * @return <p>
     *         A description providing more detail about the maintenance action.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description providing more detail about the maintenance action.
     * </p>
     *
     * @param description <p>
     *            A description providing more detail about the maintenance
     *            action.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description providing more detail about the maintenance action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description providing more detail about the maintenance
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingMaintenanceAction withDescription(String description) {
        this.description = description;
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getAutoAppliedAfterDate() != null)
            sb.append("AutoAppliedAfterDate: " + getAutoAppliedAfterDate() + ",");
        if (getForcedApplyDate() != null)
            sb.append("ForcedApplyDate: " + getForcedApplyDate() + ",");
        if (getOptInStatus() != null)
            sb.append("OptInStatus: " + getOptInStatus() + ",");
        if (getCurrentApplyDate() != null)
            sb.append("CurrentApplyDate: " + getCurrentApplyDate() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getAutoAppliedAfterDate() == null) ? 0 : getAutoAppliedAfterDate().hashCode());
        hashCode = prime * hashCode
                + ((getForcedApplyDate() == null) ? 0 : getForcedApplyDate().hashCode());
        hashCode = prime * hashCode
                + ((getOptInStatus() == null) ? 0 : getOptInStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentApplyDate() == null) ? 0 : getCurrentApplyDate().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingMaintenanceAction == false)
            return false;
        PendingMaintenanceAction other = (PendingMaintenanceAction) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getAutoAppliedAfterDate() == null ^ this.getAutoAppliedAfterDate() == null)
            return false;
        if (other.getAutoAppliedAfterDate() != null
                && other.getAutoAppliedAfterDate().equals(this.getAutoAppliedAfterDate()) == false)
            return false;
        if (other.getForcedApplyDate() == null ^ this.getForcedApplyDate() == null)
            return false;
        if (other.getForcedApplyDate() != null
                && other.getForcedApplyDate().equals(this.getForcedApplyDate()) == false)
            return false;
        if (other.getOptInStatus() == null ^ this.getOptInStatus() == null)
            return false;
        if (other.getOptInStatus() != null
                && other.getOptInStatus().equals(this.getOptInStatus()) == false)
            return false;
        if (other.getCurrentApplyDate() == null ^ this.getCurrentApplyDate() == null)
            return false;
        if (other.getCurrentApplyDate() != null
                && other.getCurrentApplyDate().equals(this.getCurrentApplyDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
