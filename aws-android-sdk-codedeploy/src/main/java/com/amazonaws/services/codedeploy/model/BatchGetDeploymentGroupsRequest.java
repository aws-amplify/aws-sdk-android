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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about one or more deployment groups.
 * </p>
 */
public class BatchGetDeploymentGroupsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable
     * IAM user or AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The names of the deployment groups.
     * </p>
     */
    private java.util.List<String> deploymentGroupNames;

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable
     * IAM user or AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of an AWS CodeDeploy application associated with the
     *         applicable IAM user or AWS account.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable
     * IAM user or AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of an AWS CodeDeploy application associated with the
     *            applicable IAM user or AWS account.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable
     * IAM user or AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of an AWS CodeDeploy application associated with the
     *            applicable IAM user or AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentGroupsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The names of the deployment groups.
     * </p>
     *
     * @return <p>
     *         The names of the deployment groups.
     *         </p>
     */
    public java.util.List<String> getDeploymentGroupNames() {
        return deploymentGroupNames;
    }

    /**
     * <p>
     * The names of the deployment groups.
     * </p>
     *
     * @param deploymentGroupNames <p>
     *            The names of the deployment groups.
     *            </p>
     */
    public void setDeploymentGroupNames(java.util.Collection<String> deploymentGroupNames) {
        if (deploymentGroupNames == null) {
            this.deploymentGroupNames = null;
            return;
        }

        this.deploymentGroupNames = new java.util.ArrayList<String>(deploymentGroupNames);
    }

    /**
     * <p>
     * The names of the deployment groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentGroupNames <p>
     *            The names of the deployment groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentGroupsRequest withDeploymentGroupNames(String... deploymentGroupNames) {
        if (getDeploymentGroupNames() == null) {
            this.deploymentGroupNames = new java.util.ArrayList<String>(deploymentGroupNames.length);
        }
        for (String value : deploymentGroupNames) {
            this.deploymentGroupNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the deployment groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentGroupNames <p>
     *            The names of the deployment groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentGroupsRequest withDeploymentGroupNames(
            java.util.Collection<String> deploymentGroupNames) {
        setDeploymentGroupNames(deploymentGroupNames);
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
        if (getApplicationName() != null)
            sb.append("applicationName: " + getApplicationName() + ",");
        if (getDeploymentGroupNames() != null)
            sb.append("deploymentGroupNames: " + getDeploymentGroupNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentGroupNames() == null) ? 0 : getDeploymentGroupNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDeploymentGroupsRequest == false)
            return false;
        BatchGetDeploymentGroupsRequest other = (BatchGetDeploymentGroupsRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupNames() == null ^ this.getDeploymentGroupNames() == null)
            return false;
        if (other.getDeploymentGroupNames() != null
                && other.getDeploymentGroupNames().equals(this.getDeploymentGroupNames()) == false)
            return false;
        return true;
    }
}
