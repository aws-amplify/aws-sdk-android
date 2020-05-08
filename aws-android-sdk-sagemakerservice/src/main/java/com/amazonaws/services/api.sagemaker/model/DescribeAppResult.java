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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class DescribeAppResult implements Serializable {
    /**
     * <p>
     * The app's Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:app/.*
     * <br/>
     */
    private String appArn;

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     */
    private String appType;

    /**
     * <p>
     * The name of the app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String appName;

    /**
     * <p>
     * The domain ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     */
    private String domainId;

    /**
     * <p>
     * The user profile name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String userProfileName;

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleted, Deleting, Failed, InService, Pending
     */
    private String status;

    /**
     * <p>
     * The timestamp of the last health check.
     * </p>
     */
    private java.util.Date lastHealthCheckTimestamp;

    /**
     * <p>
     * The timestamp of the last user's activity.
     * </p>
     */
    private java.util.Date lastUserActivityTimestamp;

    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker
     * image created on the instance.
     * </p>
     */
    private ResourceSpec resourceSpec;

    /**
     * <p>
     * The app's Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:app/.*
     * <br/>
     *
     * @return <p>
     *         The app's Amazon Resource Name (ARN).
     *         </p>
     */
    public String getAppArn() {
        return appArn;
    }

    /**
     * <p>
     * The app's Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:app/.*
     * <br/>
     *
     * @param appArn <p>
     *            The app's Amazon Resource Name (ARN).
     *            </p>
     */
    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The app's Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:app/.*
     * <br/>
     *
     * @param appArn <p>
     *            The app's Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppResult withAppArn(String appArn) {
        this.appArn = appArn;
        return this;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     *
     * @return <p>
     *         The type of app.
     *         </p>
     * @see AppType
     */
    public String getAppType() {
        return appType;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     *
     * @param appType <p>
     *            The type of app.
     *            </p>
     * @see AppType
     */
    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     *
     * @param appType <p>
     *            The type of app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppType
     */
    public DescribeAppResult withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     *
     * @param appType <p>
     *            The type of app.
     *            </p>
     * @see AppType
     */
    public void setAppType(AppType appType) {
        this.appType = appType.toString();
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     *
     * @param appType <p>
     *            The type of app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppType
     */
    public DescribeAppResult withAppType(AppType appType) {
        this.appType = appType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the app.
     *         </p>
     */
    public String getAppName() {
        return appName;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param appName <p>
     *            The name of the app.
     *            </p>
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param appName <p>
     *            The name of the app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppResult withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @return <p>
     *         The domain ID.
     *         </p>
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainId <p>
     *            The domain ID.
     *            </p>
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainId <p>
     *            The domain ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * <p>
     * The user profile name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The user profile name.
     *         </p>
     */
    public String getUserProfileName() {
        return userProfileName;
    }

    /**
     * <p>
     * The user profile name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param userProfileName <p>
     *            The user profile name.
     *            </p>
     */
    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    /**
     * <p>
     * The user profile name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param userProfileName <p>
     *            The user profile name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppResult withUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleted, Deleting, Failed, InService, Pending
     *
     * @return <p>
     *         The status.
     *         </p>
     * @see AppStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleted, Deleting, Failed, InService, Pending
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @see AppStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleted, Deleting, Failed, InService, Pending
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppStatus
     */
    public DescribeAppResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleted, Deleting, Failed, InService, Pending
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @see AppStatus
     */
    public void setStatus(AppStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleted, Deleting, Failed, InService, Pending
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppStatus
     */
    public DescribeAppResult withStatus(AppStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of the last health check.
     * </p>
     *
     * @return <p>
     *         The timestamp of the last health check.
     *         </p>
     */
    public java.util.Date getLastHealthCheckTimestamp() {
        return lastHealthCheckTimestamp;
    }

    /**
     * <p>
     * The timestamp of the last health check.
     * </p>
     *
     * @param lastHealthCheckTimestamp <p>
     *            The timestamp of the last health check.
     *            </p>
     */
    public void setLastHealthCheckTimestamp(java.util.Date lastHealthCheckTimestamp) {
        this.lastHealthCheckTimestamp = lastHealthCheckTimestamp;
    }

    /**
     * <p>
     * The timestamp of the last health check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastHealthCheckTimestamp <p>
     *            The timestamp of the last health check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppResult withLastHealthCheckTimestamp(java.util.Date lastHealthCheckTimestamp) {
        this.lastHealthCheckTimestamp = lastHealthCheckTimestamp;
        return this;
    }

    /**
     * <p>
     * The timestamp of the last user's activity.
     * </p>
     *
     * @return <p>
     *         The timestamp of the last user's activity.
     *         </p>
     */
    public java.util.Date getLastUserActivityTimestamp() {
        return lastUserActivityTimestamp;
    }

    /**
     * <p>
     * The timestamp of the last user's activity.
     * </p>
     *
     * @param lastUserActivityTimestamp <p>
     *            The timestamp of the last user's activity.
     *            </p>
     */
    public void setLastUserActivityTimestamp(java.util.Date lastUserActivityTimestamp) {
        this.lastUserActivityTimestamp = lastUserActivityTimestamp;
    }

    /**
     * <p>
     * The timestamp of the last user's activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUserActivityTimestamp <p>
     *            The timestamp of the last user's activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppResult withLastUserActivityTimestamp(java.util.Date lastUserActivityTimestamp) {
        this.lastUserActivityTimestamp = lastUserActivityTimestamp;
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     *
     * @return <p>
     *         The creation time.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     *
     * @param creationTime <p>
     *            The creation time.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The failure reason.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The failure reason.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The failure reason.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker
     * image created on the instance.
     * </p>
     *
     * @return <p>
     *         The instance type and the Amazon Resource Name (ARN) of the
     *         SageMaker image created on the instance.
     *         </p>
     */
    public ResourceSpec getResourceSpec() {
        return resourceSpec;
    }

    /**
     * <p>
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker
     * image created on the instance.
     * </p>
     *
     * @param resourceSpec <p>
     *            The instance type and the Amazon Resource Name (ARN) of the
     *            SageMaker image created on the instance.
     *            </p>
     */
    public void setResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
    }

    /**
     * <p>
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker
     * image created on the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceSpec <p>
     *            The instance type and the Amazon Resource Name (ARN) of the
     *            SageMaker image created on the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppResult withResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
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
        if (getAppArn() != null)
            sb.append("AppArn: " + getAppArn() + ",");
        if (getAppType() != null)
            sb.append("AppType: " + getAppType() + ",");
        if (getAppName() != null)
            sb.append("AppName: " + getAppName() + ",");
        if (getDomainId() != null)
            sb.append("DomainId: " + getDomainId() + ",");
        if (getUserProfileName() != null)
            sb.append("UserProfileName: " + getUserProfileName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastHealthCheckTimestamp() != null)
            sb.append("LastHealthCheckTimestamp: " + getLastHealthCheckTimestamp() + ",");
        if (getLastUserActivityTimestamp() != null)
            sb.append("LastUserActivityTimestamp: " + getLastUserActivityTimestamp() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getResourceSpec() != null)
            sb.append("ResourceSpec: " + getResourceSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppType() == null) ? 0 : getAppType().hashCode());
        hashCode = prime * hashCode + ((getAppName() == null) ? 0 : getAppName().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode
                + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastHealthCheckTimestamp() == null) ? 0 : getLastHealthCheckTimestamp()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLastUserActivityTimestamp() == null) ? 0 : getLastUserActivityTimestamp()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getResourceSpec() == null) ? 0 : getResourceSpec().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppResult == false)
            return false;
        DescribeAppResult other = (DescribeAppResult) obj;

        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppType() == null ^ this.getAppType() == null)
            return false;
        if (other.getAppType() != null && other.getAppType().equals(this.getAppType()) == false)
            return false;
        if (other.getAppName() == null ^ this.getAppName() == null)
            return false;
        if (other.getAppName() != null && other.getAppName().equals(this.getAppName()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getUserProfileName() == null ^ this.getUserProfileName() == null)
            return false;
        if (other.getUserProfileName() != null
                && other.getUserProfileName().equals(this.getUserProfileName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastHealthCheckTimestamp() == null
                ^ this.getLastHealthCheckTimestamp() == null)
            return false;
        if (other.getLastHealthCheckTimestamp() != null
                && other.getLastHealthCheckTimestamp().equals(this.getLastHealthCheckTimestamp()) == false)
            return false;
        if (other.getLastUserActivityTimestamp() == null
                ^ this.getLastUserActivityTimestamp() == null)
            return false;
        if (other.getLastUserActivityTimestamp() != null
                && other.getLastUserActivityTimestamp().equals(this.getLastUserActivityTimestamp()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getResourceSpec() == null ^ this.getResourceSpec() == null)
            return false;
        if (other.getResourceSpec() != null
                && other.getResourceSpec().equals(this.getResourceSpec()) == false)
            return false;
        return true;
    }
}
