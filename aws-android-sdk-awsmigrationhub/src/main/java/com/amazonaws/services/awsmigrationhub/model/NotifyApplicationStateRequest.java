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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the migration state of an application. For a given application
 * identified by the value passed to <code>ApplicationId</code>, its status is
 * set or updated by passing one of three values to <code>Status</code>:
 * <code>NOT_STARTED | IN_PROGRESS | COMPLETED</code>.
 * </p>
 */
public class NotifyApplicationStateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The configurationId in Application Discovery Service that uniquely
     * identifies the grouped application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^.{1,1600}$<br/>
     */
    private String applicationId;

    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     */
    private String status;

    /**
     * <p>
     * The timestamp when the application state changed.
     * </p>
     */
    private java.util.Date updateDateTime;

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The configurationId in Application Discovery Service that uniquely
     * identifies the grouped application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^.{1,1600}$<br/>
     *
     * @return <p>
     *         The configurationId in Application Discovery Service that
     *         uniquely identifies the grouped application.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The configurationId in Application Discovery Service that uniquely
     * identifies the grouped application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^.{1,1600}$<br/>
     *
     * @param applicationId <p>
     *            The configurationId in Application Discovery Service that
     *            uniquely identifies the grouped application.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The configurationId in Application Discovery Service that uniquely
     * identifies the grouped application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^.{1,1600}$<br/>
     *
     * @param applicationId <p>
     *            The configurationId in Application Discovery Service that
     *            uniquely identifies the grouped application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyApplicationStateRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     *
     * @return <p>
     *         Status of the application - Not Started, In-Progress, Complete.
     *         </p>
     * @see ApplicationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     *
     * @param status <p>
     *            Status of the application - Not Started, In-Progress,
     *            Complete.
     *            </p>
     * @see ApplicationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     *
     * @param status <p>
     *            Status of the application - Not Started, In-Progress,
     *            Complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApplicationStatus
     */
    public NotifyApplicationStateRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     *
     * @param status <p>
     *            Status of the application - Not Started, In-Progress,
     *            Complete.
     *            </p>
     * @see ApplicationStatus
     */
    public void setStatus(ApplicationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     *
     * @param status <p>
     *            Status of the application - Not Started, In-Progress,
     *            Complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApplicationStatus
     */
    public NotifyApplicationStateRequest withStatus(ApplicationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the application state changed.
     * </p>
     *
     * @return <p>
     *         The timestamp when the application state changed.
     *         </p>
     */
    public java.util.Date getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * <p>
     * The timestamp when the application state changed.
     * </p>
     *
     * @param updateDateTime <p>
     *            The timestamp when the application state changed.
     *            </p>
     */
    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The timestamp when the application state changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateDateTime <p>
     *            The timestamp when the application state changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyApplicationStateRequest withUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @return <p>
     *         Optional boolean flag to indicate whether any effect should take
     *         place. Used to test if the caller has permission to make the
     *         call.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @return <p>
     *         Optional boolean flag to indicate whether any effect should take
     *         place. Used to test if the caller has permission to make the
     *         call.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @param dryRun <p>
     *            Optional boolean flag to indicate whether any effect should
     *            take place. Used to test if the caller has permission to make
     *            the call.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Optional boolean flag to indicate whether any effect should
     *            take place. Used to test if the caller has permission to make
     *            the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyApplicationStateRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: " + getUpdateDateTime() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyApplicationStateRequest == false)
            return false;
        NotifyApplicationStateRequest other = (NotifyApplicationStateRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null
                && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
