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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the backend environment for an Amplify app.
 * </p>
 */
public class BackendEnvironment implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of
     * an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String backendEnvironmentArn;

    /**
     * <p>
     * The name for a backend environment that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String environmentName;

    /**
     * <p>
     * The AWS CloudFormation stack name of a backend environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String stackName;

    /**
     * <p>
     * The name of deployment artifacts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String deploymentArtifacts;

    /**
     * <p>
     * The creation date and time for a backend environment that is part of an
     * Amplify app.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The last updated date and time for a backend environment that is part of
     * an Amplify app.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of
     * an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for a backend environment that is
     *         part of an Amplify app.
     *         </p>
     */
    public String getBackendEnvironmentArn() {
        return backendEnvironmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of
     * an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param backendEnvironmentArn <p>
     *            The Amazon Resource Name (ARN) for a backend environment that
     *            is part of an Amplify app.
     *            </p>
     */
    public void setBackendEnvironmentArn(String backendEnvironmentArn) {
        this.backendEnvironmentArn = backendEnvironmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of
     * an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param backendEnvironmentArn <p>
     *            The Amazon Resource Name (ARN) for a backend environment that
     *            is part of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackendEnvironment withBackendEnvironmentArn(String backendEnvironmentArn) {
        this.backendEnvironmentArn = backendEnvironmentArn;
        return this;
    }

    /**
     * <p>
     * The name for a backend environment that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name for a backend environment that is part of an Amplify
     *         app.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name for a backend environment that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param environmentName <p>
     *            The name for a backend environment that is part of an Amplify
     *            app.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name for a backend environment that is part of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param environmentName <p>
     *            The name for a backend environment that is part of an Amplify
     *            app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackendEnvironment withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * The AWS CloudFormation stack name of a backend environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The AWS CloudFormation stack name of a backend environment.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The AWS CloudFormation stack name of a backend environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param stackName <p>
     *            The AWS CloudFormation stack name of a backend environment.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The AWS CloudFormation stack name of a backend environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param stackName <p>
     *            The AWS CloudFormation stack name of a backend environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackendEnvironment withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * The name of deployment artifacts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The name of deployment artifacts.
     *         </p>
     */
    public String getDeploymentArtifacts() {
        return deploymentArtifacts;
    }

    /**
     * <p>
     * The name of deployment artifacts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param deploymentArtifacts <p>
     *            The name of deployment artifacts.
     *            </p>
     */
    public void setDeploymentArtifacts(String deploymentArtifacts) {
        this.deploymentArtifacts = deploymentArtifacts;
    }

    /**
     * <p>
     * The name of deployment artifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param deploymentArtifacts <p>
     *            The name of deployment artifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackendEnvironment withDeploymentArtifacts(String deploymentArtifacts) {
        this.deploymentArtifacts = deploymentArtifacts;
        return this;
    }

    /**
     * <p>
     * The creation date and time for a backend environment that is part of an
     * Amplify app.
     * </p>
     *
     * @return <p>
     *         The creation date and time for a backend environment that is part
     *         of an Amplify app.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The creation date and time for a backend environment that is part of an
     * Amplify app.
     * </p>
     *
     * @param createTime <p>
     *            The creation date and time for a backend environment that is
     *            part of an Amplify app.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The creation date and time for a backend environment that is part of an
     * Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The creation date and time for a backend environment that is
     *            part of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackendEnvironment withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The last updated date and time for a backend environment that is part of
     * an Amplify app.
     * </p>
     *
     * @return <p>
     *         The last updated date and time for a backend environment that is
     *         part of an Amplify app.
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * The last updated date and time for a backend environment that is part of
     * an Amplify app.
     * </p>
     *
     * @param updateTime <p>
     *            The last updated date and time for a backend environment that
     *            is part of an Amplify app.
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The last updated date and time for a backend environment that is part of
     * an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            The last updated date and time for a backend environment that
     *            is part of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackendEnvironment withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
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
        if (getBackendEnvironmentArn() != null)
            sb.append("backendEnvironmentArn: " + getBackendEnvironmentArn() + ",");
        if (getEnvironmentName() != null)
            sb.append("environmentName: " + getEnvironmentName() + ",");
        if (getStackName() != null)
            sb.append("stackName: " + getStackName() + ",");
        if (getDeploymentArtifacts() != null)
            sb.append("deploymentArtifacts: " + getDeploymentArtifacts() + ",");
        if (getCreateTime() != null)
            sb.append("createTime: " + getCreateTime() + ",");
        if (getUpdateTime() != null)
            sb.append("updateTime: " + getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBackendEnvironmentArn() == null) ? 0 : getBackendEnvironmentArn().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentArtifacts() == null) ? 0 : getDeploymentArtifacts().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackendEnvironment == false)
            return false;
        BackendEnvironment other = (BackendEnvironment) obj;

        if (other.getBackendEnvironmentArn() == null ^ this.getBackendEnvironmentArn() == null)
            return false;
        if (other.getBackendEnvironmentArn() != null
                && other.getBackendEnvironmentArn().equals(this.getBackendEnvironmentArn()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getDeploymentArtifacts() == null ^ this.getDeploymentArtifacts() == null)
            return false;
        if (other.getDeploymentArtifacts() != null
                && other.getDeploymentArtifacts().equals(this.getDeploymentArtifacts()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }
}
