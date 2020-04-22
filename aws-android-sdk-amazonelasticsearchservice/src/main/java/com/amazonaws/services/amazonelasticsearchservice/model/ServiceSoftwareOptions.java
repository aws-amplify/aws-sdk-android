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
 * The current options of an Elasticsearch domain service software options.
 * </p>
 */
public class ServiceSoftwareOptions implements Serializable {
    /**
     * <p>
     * The current service software version that is present on the domain.
     * </p>
     */
    private String currentVersion;

    /**
     * <p>
     * The new service software version if one is available.
     * </p>
     */
    private String newVersion;

    /**
     * <p>
     * <code>True</code> if you are able to update you service software version.
     * <code>False</code> if you are not able to update your service software
     * version.
     * </p>
     */
    private Boolean updateAvailable;

    /**
     * <p>
     * <code>True</code> if you are able to cancel your service software version
     * update. <code>False</code> if you are not able to cancel your service
     * software version.
     * </p>
     */
    private Boolean cancellable;

    /**
     * <p>
     * The status of your service software update. This field can take the
     * following values: <code>ELIGIBLE</code>, <code>PENDING_UPDATE</code>,
     * <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and
     * <code>NOT_ELIGIBLE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_UPDATE, IN_PROGRESS, COMPLETED,
     * NOT_ELIGIBLE, ELIGIBLE
     */
    private String updateStatus;

    /**
     * <p>
     * The description of the <code>UpdateStatus</code>.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Timestamp, in Epoch time, until which you can manually request a service
     * software update. After this date, we automatically update your service
     * software.
     * </p>
     */
    private java.util.Date automatedUpdateDate;

    /**
     * <p>
     * <code>True</code> if a service software is never automatically updated.
     * <code>False</code> if a service software is automatically updated after
     * <code>AutomatedUpdateDate</code>.
     * </p>
     */
    private Boolean optionalDeployment;

    /**
     * <p>
     * The current service software version that is present on the domain.
     * </p>
     *
     * @return <p>
     *         The current service software version that is present on the
     *         domain.
     *         </p>
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * <p>
     * The current service software version that is present on the domain.
     * </p>
     *
     * @param currentVersion <p>
     *            The current service software version that is present on the
     *            domain.
     *            </p>
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current service software version that is present on the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentVersion <p>
     *            The current service software version that is present on the
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSoftwareOptions withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * <p>
     * The new service software version if one is available.
     * </p>
     *
     * @return <p>
     *         The new service software version if one is available.
     *         </p>
     */
    public String getNewVersion() {
        return newVersion;
    }

    /**
     * <p>
     * The new service software version if one is available.
     * </p>
     *
     * @param newVersion <p>
     *            The new service software version if one is available.
     *            </p>
     */
    public void setNewVersion(String newVersion) {
        this.newVersion = newVersion;
    }

    /**
     * <p>
     * The new service software version if one is available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newVersion <p>
     *            The new service software version if one is available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSoftwareOptions withNewVersion(String newVersion) {
        this.newVersion = newVersion;
        return this;
    }

    /**
     * <p>
     * <code>True</code> if you are able to update you service software version.
     * <code>False</code> if you are not able to update your service software
     * version.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if you are able to update you service software
     *         version. <code>False</code> if you are not able to update your
     *         service software version.
     *         </p>
     */
    public Boolean isUpdateAvailable() {
        return updateAvailable;
    }

    /**
     * <p>
     * <code>True</code> if you are able to update you service software version.
     * <code>False</code> if you are not able to update your service software
     * version.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if you are able to update you service software
     *         version. <code>False</code> if you are not able to update your
     *         service software version.
     *         </p>
     */
    public Boolean getUpdateAvailable() {
        return updateAvailable;
    }

    /**
     * <p>
     * <code>True</code> if you are able to update you service software version.
     * <code>False</code> if you are not able to update your service software
     * version.
     * </p>
     *
     * @param updateAvailable <p>
     *            <code>True</code> if you are able to update you service
     *            software version. <code>False</code> if you are not able to
     *            update your service software version.
     *            </p>
     */
    public void setUpdateAvailable(Boolean updateAvailable) {
        this.updateAvailable = updateAvailable;
    }

    /**
     * <p>
     * <code>True</code> if you are able to update you service software version.
     * <code>False</code> if you are not able to update your service software
     * version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateAvailable <p>
     *            <code>True</code> if you are able to update you service
     *            software version. <code>False</code> if you are not able to
     *            update your service software version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSoftwareOptions withUpdateAvailable(Boolean updateAvailable) {
        this.updateAvailable = updateAvailable;
        return this;
    }

    /**
     * <p>
     * <code>True</code> if you are able to cancel your service software version
     * update. <code>False</code> if you are not able to cancel your service
     * software version.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if you are able to cancel your service software
     *         version update. <code>False</code> if you are not able to cancel
     *         your service software version.
     *         </p>
     */
    public Boolean isCancellable() {
        return cancellable;
    }

    /**
     * <p>
     * <code>True</code> if you are able to cancel your service software version
     * update. <code>False</code> if you are not able to cancel your service
     * software version.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if you are able to cancel your service software
     *         version update. <code>False</code> if you are not able to cancel
     *         your service software version.
     *         </p>
     */
    public Boolean getCancellable() {
        return cancellable;
    }

    /**
     * <p>
     * <code>True</code> if you are able to cancel your service software version
     * update. <code>False</code> if you are not able to cancel your service
     * software version.
     * </p>
     *
     * @param cancellable <p>
     *            <code>True</code> if you are able to cancel your service
     *            software version update. <code>False</code> if you are not
     *            able to cancel your service software version.
     *            </p>
     */
    public void setCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
    }

    /**
     * <p>
     * <code>True</code> if you are able to cancel your service software version
     * update. <code>False</code> if you are not able to cancel your service
     * software version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cancellable <p>
     *            <code>True</code> if you are able to cancel your service
     *            software version update. <code>False</code> if you are not
     *            able to cancel your service software version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSoftwareOptions withCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
        return this;
    }

    /**
     * <p>
     * The status of your service software update. This field can take the
     * following values: <code>ELIGIBLE</code>, <code>PENDING_UPDATE</code>,
     * <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and
     * <code>NOT_ELIGIBLE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_UPDATE, IN_PROGRESS, COMPLETED,
     * NOT_ELIGIBLE, ELIGIBLE
     *
     * @return <p>
     *         The status of your service software update. This field can take
     *         the following values: <code>ELIGIBLE</code>,
     *         <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>,
     *         <code>COMPLETED</code>, and <code>NOT_ELIGIBLE</code>.
     *         </p>
     * @see DeploymentStatus
     */
    public String getUpdateStatus() {
        return updateStatus;
    }

    /**
     * <p>
     * The status of your service software update. This field can take the
     * following values: <code>ELIGIBLE</code>, <code>PENDING_UPDATE</code>,
     * <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and
     * <code>NOT_ELIGIBLE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_UPDATE, IN_PROGRESS, COMPLETED,
     * NOT_ELIGIBLE, ELIGIBLE
     *
     * @param updateStatus <p>
     *            The status of your service software update. This field can
     *            take the following values: <code>ELIGIBLE</code>,
     *            <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>,
     *            <code>COMPLETED</code>, and <code>NOT_ELIGIBLE</code>.
     *            </p>
     * @see DeploymentStatus
     */
    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The status of your service software update. This field can take the
     * following values: <code>ELIGIBLE</code>, <code>PENDING_UPDATE</code>,
     * <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and
     * <code>NOT_ELIGIBLE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_UPDATE, IN_PROGRESS, COMPLETED,
     * NOT_ELIGIBLE, ELIGIBLE
     *
     * @param updateStatus <p>
     *            The status of your service software update. This field can
     *            take the following values: <code>ELIGIBLE</code>,
     *            <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>,
     *            <code>COMPLETED</code>, and <code>NOT_ELIGIBLE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentStatus
     */
    public ServiceSoftwareOptions withUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }

    /**
     * <p>
     * The status of your service software update. This field can take the
     * following values: <code>ELIGIBLE</code>, <code>PENDING_UPDATE</code>,
     * <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and
     * <code>NOT_ELIGIBLE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_UPDATE, IN_PROGRESS, COMPLETED,
     * NOT_ELIGIBLE, ELIGIBLE
     *
     * @param updateStatus <p>
     *            The status of your service software update. This field can
     *            take the following values: <code>ELIGIBLE</code>,
     *            <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>,
     *            <code>COMPLETED</code>, and <code>NOT_ELIGIBLE</code>.
     *            </p>
     * @see DeploymentStatus
     */
    public void setUpdateStatus(DeploymentStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
    }

    /**
     * <p>
     * The status of your service software update. This field can take the
     * following values: <code>ELIGIBLE</code>, <code>PENDING_UPDATE</code>,
     * <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and
     * <code>NOT_ELIGIBLE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_UPDATE, IN_PROGRESS, COMPLETED,
     * NOT_ELIGIBLE, ELIGIBLE
     *
     * @param updateStatus <p>
     *            The status of your service software update. This field can
     *            take the following values: <code>ELIGIBLE</code>,
     *            <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>,
     *            <code>COMPLETED</code>, and <code>NOT_ELIGIBLE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentStatus
     */
    public ServiceSoftwareOptions withUpdateStatus(DeploymentStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The description of the <code>UpdateStatus</code>.
     * </p>
     *
     * @return <p>
     *         The description of the <code>UpdateStatus</code>.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the <code>UpdateStatus</code>.
     * </p>
     *
     * @param description <p>
     *            The description of the <code>UpdateStatus</code>.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the <code>UpdateStatus</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the <code>UpdateStatus</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSoftwareOptions withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Timestamp, in Epoch time, until which you can manually request a service
     * software update. After this date, we automatically update your service
     * software.
     * </p>
     *
     * @return <p>
     *         Timestamp, in Epoch time, until which you can manually request a
     *         service software update. After this date, we automatically update
     *         your service software.
     *         </p>
     */
    public java.util.Date getAutomatedUpdateDate() {
        return automatedUpdateDate;
    }

    /**
     * <p>
     * Timestamp, in Epoch time, until which you can manually request a service
     * software update. After this date, we automatically update your service
     * software.
     * </p>
     *
     * @param automatedUpdateDate <p>
     *            Timestamp, in Epoch time, until which you can manually request
     *            a service software update. After this date, we automatically
     *            update your service software.
     *            </p>
     */
    public void setAutomatedUpdateDate(java.util.Date automatedUpdateDate) {
        this.automatedUpdateDate = automatedUpdateDate;
    }

    /**
     * <p>
     * Timestamp, in Epoch time, until which you can manually request a service
     * software update. After this date, we automatically update your service
     * software.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automatedUpdateDate <p>
     *            Timestamp, in Epoch time, until which you can manually request
     *            a service software update. After this date, we automatically
     *            update your service software.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSoftwareOptions withAutomatedUpdateDate(java.util.Date automatedUpdateDate) {
        this.automatedUpdateDate = automatedUpdateDate;
        return this;
    }

    /**
     * <p>
     * <code>True</code> if a service software is never automatically updated.
     * <code>False</code> if a service software is automatically updated after
     * <code>AutomatedUpdateDate</code>.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if a service software is never automatically
     *         updated. <code>False</code> if a service software is
     *         automatically updated after <code>AutomatedUpdateDate</code>.
     *         </p>
     */
    public Boolean isOptionalDeployment() {
        return optionalDeployment;
    }

    /**
     * <p>
     * <code>True</code> if a service software is never automatically updated.
     * <code>False</code> if a service software is automatically updated after
     * <code>AutomatedUpdateDate</code>.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if a service software is never automatically
     *         updated. <code>False</code> if a service software is
     *         automatically updated after <code>AutomatedUpdateDate</code>.
     *         </p>
     */
    public Boolean getOptionalDeployment() {
        return optionalDeployment;
    }

    /**
     * <p>
     * <code>True</code> if a service software is never automatically updated.
     * <code>False</code> if a service software is automatically updated after
     * <code>AutomatedUpdateDate</code>.
     * </p>
     *
     * @param optionalDeployment <p>
     *            <code>True</code> if a service software is never automatically
     *            updated. <code>False</code> if a service software is
     *            automatically updated after <code>AutomatedUpdateDate</code>.
     *            </p>
     */
    public void setOptionalDeployment(Boolean optionalDeployment) {
        this.optionalDeployment = optionalDeployment;
    }

    /**
     * <p>
     * <code>True</code> if a service software is never automatically updated.
     * <code>False</code> if a service software is automatically updated after
     * <code>AutomatedUpdateDate</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionalDeployment <p>
     *            <code>True</code> if a service software is never automatically
     *            updated. <code>False</code> if a service software is
     *            automatically updated after <code>AutomatedUpdateDate</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSoftwareOptions withOptionalDeployment(Boolean optionalDeployment) {
        this.optionalDeployment = optionalDeployment;
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
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: " + getCurrentVersion() + ",");
        if (getNewVersion() != null)
            sb.append("NewVersion: " + getNewVersion() + ",");
        if (getUpdateAvailable() != null)
            sb.append("UpdateAvailable: " + getUpdateAvailable() + ",");
        if (getCancellable() != null)
            sb.append("Cancellable: " + getCancellable() + ",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: " + getUpdateStatus() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getAutomatedUpdateDate() != null)
            sb.append("AutomatedUpdateDate: " + getAutomatedUpdateDate() + ",");
        if (getOptionalDeployment() != null)
            sb.append("OptionalDeployment: " + getOptionalDeployment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getNewVersion() == null) ? 0 : getNewVersion().hashCode());
        hashCode = prime * hashCode
                + ((getUpdateAvailable() == null) ? 0 : getUpdateAvailable().hashCode());
        hashCode = prime * hashCode
                + ((getCancellable() == null) ? 0 : getCancellable().hashCode());
        hashCode = prime * hashCode
                + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getAutomatedUpdateDate() == null) ? 0 : getAutomatedUpdateDate().hashCode());
        hashCode = prime * hashCode
                + ((getOptionalDeployment() == null) ? 0 : getOptionalDeployment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceSoftwareOptions == false)
            return false;
        ServiceSoftwareOptions other = (ServiceSoftwareOptions) obj;

        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null
                && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getNewVersion() == null ^ this.getNewVersion() == null)
            return false;
        if (other.getNewVersion() != null
                && other.getNewVersion().equals(this.getNewVersion()) == false)
            return false;
        if (other.getUpdateAvailable() == null ^ this.getUpdateAvailable() == null)
            return false;
        if (other.getUpdateAvailable() != null
                && other.getUpdateAvailable().equals(this.getUpdateAvailable()) == false)
            return false;
        if (other.getCancellable() == null ^ this.getCancellable() == null)
            return false;
        if (other.getCancellable() != null
                && other.getCancellable().equals(this.getCancellable()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null
                && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAutomatedUpdateDate() == null ^ this.getAutomatedUpdateDate() == null)
            return false;
        if (other.getAutomatedUpdateDate() != null
                && other.getAutomatedUpdateDate().equals(this.getAutomatedUpdateDate()) == false)
            return false;
        if (other.getOptionalDeployment() == null ^ this.getOptionalDeployment() == null)
            return false;
        if (other.getOptionalDeployment() != null
                && other.getOptionalDeployment().equals(this.getOptionalDeployment()) == false)
            return false;
        return true;
    }
}
