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
 * <note>
 * <p>
 * The newer <code>BatchGetDeploymentTargets</code> should be used instead
 * because it works with all compute types. <code>ListDeploymentInstances</code>
 * throws an exception if it is used with a compute platform other than
 * EC2/On-premises or AWS Lambda.
 * </p>
 * </note>
 * <p>
 * Lists the instance for a deployment associated with the IAM user or AWS
 * account.
 * </p>
 */
public class ListDeploymentInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * An identifier returned from the previous list deployment instances call.
     * It can be used to return the next set of deployment instances in the
     * list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A subset of instances to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code>: Include those instances with pending deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>: Include those instances where deployments are
     * still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: Include those instances with successful
     * deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Include those instances with failed deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Skipped</code>: Include those instances with skipped deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code>: Include those instances with deployments in an
     * unknown state.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> instanceStatusFilter;

    /**
     * <p>
     * The set of instances in a blue/green deployment, either those in the
     * original environment ("BLUE") or those in the replacement environment
     * ("GREEN"), for which you want to view instance information.
     * </p>
     */
    private java.util.List<String> instanceTypeFilter;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentInstancesRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployment instances call.
     * It can be used to return the next set of deployment instances in the
     * list.
     * </p>
     *
     * @return <p>
     *         An identifier returned from the previous list deployment
     *         instances call. It can be used to return the next set of
     *         deployment instances in the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployment instances call.
     * It can be used to return the next set of deployment instances in the
     * list.
     * </p>
     *
     * @param nextToken <p>
     *            An identifier returned from the previous list deployment
     *            instances call. It can be used to return the next set of
     *            deployment instances in the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployment instances call.
     * It can be used to return the next set of deployment instances in the
     * list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An identifier returned from the previous list deployment
     *            instances call. It can be used to return the next set of
     *            deployment instances in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentInstancesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A subset of instances to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code>: Include those instances with pending deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>: Include those instances where deployments are
     * still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: Include those instances with successful
     * deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Include those instances with failed deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Skipped</code>: Include those instances with skipped deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code>: Include those instances with deployments in an
     * unknown state.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A subset of instances to list by status:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Pending</code>: Include those instances with pending
     *         deployments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InProgress</code>: Include those instances where
     *         deployments are still in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Succeeded</code>: Include those instances with successful
     *         deployments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code>: Include those instances with failed
     *         deployments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Skipped</code>: Include those instances with skipped
     *         deployments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unknown</code>: Include those instances with deployments in
     *         an unknown state.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getInstanceStatusFilter() {
        return instanceStatusFilter;
    }

    /**
     * <p>
     * A subset of instances to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code>: Include those instances with pending deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>: Include those instances where deployments are
     * still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: Include those instances with successful
     * deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Include those instances with failed deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Skipped</code>: Include those instances with skipped deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code>: Include those instances with deployments in an
     * unknown state.
     * </p>
     * </li>
     * </ul>
     *
     * @param instanceStatusFilter <p>
     *            A subset of instances to list by status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Pending</code>: Include those instances with pending
     *            deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InProgress</code>: Include those instances where
     *            deployments are still in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code>: Include those instances with
     *            successful deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: Include those instances with failed
     *            deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Skipped</code>: Include those instances with skipped
     *            deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unknown</code>: Include those instances with deployments
     *            in an unknown state.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setInstanceStatusFilter(java.util.Collection<String> instanceStatusFilter) {
        if (instanceStatusFilter == null) {
            this.instanceStatusFilter = null;
            return;
        }

        this.instanceStatusFilter = new java.util.ArrayList<String>(instanceStatusFilter);
    }

    /**
     * <p>
     * A subset of instances to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code>: Include those instances with pending deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>: Include those instances where deployments are
     * still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: Include those instances with successful
     * deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Include those instances with failed deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Skipped</code>: Include those instances with skipped deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code>: Include those instances with deployments in an
     * unknown state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceStatusFilter <p>
     *            A subset of instances to list by status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Pending</code>: Include those instances with pending
     *            deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InProgress</code>: Include those instances where
     *            deployments are still in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code>: Include those instances with
     *            successful deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: Include those instances with failed
     *            deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Skipped</code>: Include those instances with skipped
     *            deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unknown</code>: Include those instances with deployments
     *            in an unknown state.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentInstancesRequest withInstanceStatusFilter(String... instanceStatusFilter) {
        if (getInstanceStatusFilter() == null) {
            this.instanceStatusFilter = new java.util.ArrayList<String>(instanceStatusFilter.length);
        }
        for (String value : instanceStatusFilter) {
            this.instanceStatusFilter.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A subset of instances to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code>: Include those instances with pending deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>: Include those instances where deployments are
     * still in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: Include those instances with successful
     * deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Include those instances with failed deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Skipped</code>: Include those instances with skipped deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code>: Include those instances with deployments in an
     * unknown state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceStatusFilter <p>
     *            A subset of instances to list by status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Pending</code>: Include those instances with pending
     *            deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InProgress</code>: Include those instances where
     *            deployments are still in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code>: Include those instances with
     *            successful deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: Include those instances with failed
     *            deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Skipped</code>: Include those instances with skipped
     *            deployments.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unknown</code>: Include those instances with deployments
     *            in an unknown state.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentInstancesRequest withInstanceStatusFilter(
            java.util.Collection<String> instanceStatusFilter) {
        setInstanceStatusFilter(instanceStatusFilter);
        return this;
    }

    /**
     * <p>
     * The set of instances in a blue/green deployment, either those in the
     * original environment ("BLUE") or those in the replacement environment
     * ("GREEN"), for which you want to view instance information.
     * </p>
     *
     * @return <p>
     *         The set of instances in a blue/green deployment, either those in
     *         the original environment ("BLUE") or those in the replacement
     *         environment ("GREEN"), for which you want to view instance
     *         information.
     *         </p>
     */
    public java.util.List<String> getInstanceTypeFilter() {
        return instanceTypeFilter;
    }

    /**
     * <p>
     * The set of instances in a blue/green deployment, either those in the
     * original environment ("BLUE") or those in the replacement environment
     * ("GREEN"), for which you want to view instance information.
     * </p>
     *
     * @param instanceTypeFilter <p>
     *            The set of instances in a blue/green deployment, either those
     *            in the original environment ("BLUE") or those in the
     *            replacement environment ("GREEN"), for which you want to view
     *            instance information.
     *            </p>
     */
    public void setInstanceTypeFilter(java.util.Collection<String> instanceTypeFilter) {
        if (instanceTypeFilter == null) {
            this.instanceTypeFilter = null;
            return;
        }

        this.instanceTypeFilter = new java.util.ArrayList<String>(instanceTypeFilter);
    }

    /**
     * <p>
     * The set of instances in a blue/green deployment, either those in the
     * original environment ("BLUE") or those in the replacement environment
     * ("GREEN"), for which you want to view instance information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTypeFilter <p>
     *            The set of instances in a blue/green deployment, either those
     *            in the original environment ("BLUE") or those in the
     *            replacement environment ("GREEN"), for which you want to view
     *            instance information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentInstancesRequest withInstanceTypeFilter(String... instanceTypeFilter) {
        if (getInstanceTypeFilter() == null) {
            this.instanceTypeFilter = new java.util.ArrayList<String>(instanceTypeFilter.length);
        }
        for (String value : instanceTypeFilter) {
            this.instanceTypeFilter.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The set of instances in a blue/green deployment, either those in the
     * original environment ("BLUE") or those in the replacement environment
     * ("GREEN"), for which you want to view instance information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTypeFilter <p>
     *            The set of instances in a blue/green deployment, either those
     *            in the original environment ("BLUE") or those in the
     *            replacement environment ("GREEN"), for which you want to view
     *            instance information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentInstancesRequest withInstanceTypeFilter(
            java.util.Collection<String> instanceTypeFilter) {
        setInstanceTypeFilter(instanceTypeFilter);
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
        if (getDeploymentId() != null)
            sb.append("deploymentId: " + getDeploymentId() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getInstanceStatusFilter() != null)
            sb.append("instanceStatusFilter: " + getInstanceStatusFilter() + ",");
        if (getInstanceTypeFilter() != null)
            sb.append("instanceTypeFilter: " + getInstanceTypeFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceStatusFilter() == null) ? 0 : getInstanceStatusFilter().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceTypeFilter() == null) ? 0 : getInstanceTypeFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeploymentInstancesRequest == false)
            return false;
        ListDeploymentInstancesRequest other = (ListDeploymentInstancesRequest) obj;

        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getInstanceStatusFilter() == null ^ this.getInstanceStatusFilter() == null)
            return false;
        if (other.getInstanceStatusFilter() != null
                && other.getInstanceStatusFilter().equals(this.getInstanceStatusFilter()) == false)
            return false;
        if (other.getInstanceTypeFilter() == null ^ this.getInstanceTypeFilter() == null)
            return false;
        if (other.getInstanceTypeFilter() != null
                && other.getInstanceTypeFilter().equals(this.getInstanceTypeFilter()) == false)
            return false;
        return true;
    }
}
