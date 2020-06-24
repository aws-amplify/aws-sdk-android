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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new backend environment for an Amplify app.
 * </p>
 */
public class CreateBackendEnvironmentRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String appId;

    /**
     * <p>
     * The name for the backend environment.
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
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The unique ID for an Amplify app.
     *         </p>
     */
    public String getAppId() {
        return appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param appId <p>
     *            The unique ID for an Amplify app.
     *            </p>
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param appId <p>
     *            The unique ID for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackendEnvironmentRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * <p>
     * The name for the backend environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name for the backend environment.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name for the backend environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param environmentName <p>
     *            The name for the backend environment.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name for the backend environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param environmentName <p>
     *            The name for the backend environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackendEnvironmentRequest withEnvironmentName(String environmentName) {
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
    public CreateBackendEnvironmentRequest withStackName(String stackName) {
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
    public CreateBackendEnvironmentRequest withDeploymentArtifacts(String deploymentArtifacts) {
        this.deploymentArtifacts = deploymentArtifacts;
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
        if (getAppId() != null)
            sb.append("appId: " + getAppId() + ",");
        if (getEnvironmentName() != null)
            sb.append("environmentName: " + getEnvironmentName() + ",");
        if (getStackName() != null)
            sb.append("stackName: " + getStackName() + ",");
        if (getDeploymentArtifacts() != null)
            sb.append("deploymentArtifacts: " + getDeploymentArtifacts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentArtifacts() == null) ? 0 : getDeploymentArtifacts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendEnvironmentRequest == false)
            return false;
        CreateBackendEnvironmentRequest other = (CreateBackendEnvironmentRequest) obj;

        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
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
        return true;
    }
}
