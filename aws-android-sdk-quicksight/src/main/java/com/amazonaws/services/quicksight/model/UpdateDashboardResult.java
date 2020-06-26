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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

public class UpdateDashboardResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ARN of the dashboard, including the version number.
     * </p>
     */
    private String versionArn;

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String dashboardId;

    /**
     * <p>
     * The creation status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     */
    private String creationStatus;

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The ARN of the dashboard, including the version number.
     * </p>
     *
     * @return <p>
     *         The ARN of the dashboard, including the version number.
     *         </p>
     */
    public String getVersionArn() {
        return versionArn;
    }

    /**
     * <p>
     * The ARN of the dashboard, including the version number.
     * </p>
     *
     * @param versionArn <p>
     *            The ARN of the dashboard, including the version number.
     *            </p>
     */
    public void setVersionArn(String versionArn) {
        this.versionArn = versionArn;
    }

    /**
     * <p>
     * The ARN of the dashboard, including the version number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionArn <p>
     *            The ARN of the dashboard, including the version number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardResult withVersionArn(String versionArn) {
        this.versionArn = versionArn;
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         The ID for the dashboard.
     *         </p>
     */
    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param dashboardId <p>
     *            The ID for the dashboard.
     *            </p>
     */
    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param dashboardId <p>
     *            The ID for the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardResult withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * <p>
     * The creation status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @return <p>
     *         The creation status of the request.
     *         </p>
     * @see ResourceStatus
     */
    public String getCreationStatus() {
        return creationStatus;
    }

    /**
     * <p>
     * The creation status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param creationStatus <p>
     *            The creation status of the request.
     *            </p>
     * @see ResourceStatus
     */
    public void setCreationStatus(String creationStatus) {
        this.creationStatus = creationStatus;
    }

    /**
     * <p>
     * The creation status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param creationStatus <p>
     *            The creation status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public UpdateDashboardResult withCreationStatus(String creationStatus) {
        this.creationStatus = creationStatus;
        return this;
    }

    /**
     * <p>
     * The creation status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param creationStatus <p>
     *            The creation status of the request.
     *            </p>
     * @see ResourceStatus
     */
    public void setCreationStatus(ResourceStatus creationStatus) {
        this.creationStatus = creationStatus.toString();
    }

    /**
     * <p>
     * The creation status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param creationStatus <p>
     *            The creation status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public UpdateDashboardResult withCreationStatus(ResourceStatus creationStatus) {
        this.creationStatus = creationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     *
     * @return <p>
     *         The HTTP status of the request.
     *         </p>
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardResult withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     *
     * @return <p>
     *         The AWS request ID for this operation.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     *
     * @param requestId <p>
     *            The AWS request ID for this operation.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId <p>
     *            The AWS request ID for this operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardResult withRequestId(String requestId) {
        this.requestId = requestId;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getVersionArn() != null)
            sb.append("VersionArn: " + getVersionArn() + ",");
        if (getDashboardId() != null)
            sb.append("DashboardId: " + getDashboardId() + ",");
        if (getCreationStatus() != null)
            sb.append("CreationStatus: " + getCreationStatus() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVersionArn() == null) ? 0 : getVersionArn().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationStatus() == null) ? 0 : getCreationStatus().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDashboardResult == false)
            return false;
        UpdateDashboardResult other = (UpdateDashboardResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVersionArn() == null ^ this.getVersionArn() == null)
            return false;
        if (other.getVersionArn() != null
                && other.getVersionArn().equals(this.getVersionArn()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null
                && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getCreationStatus() == null ^ this.getCreationStatus() == null)
            return false;
        if (other.getCreationStatus() != null
                && other.getCreationStatus().equals(this.getCreationStatus()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }
}
