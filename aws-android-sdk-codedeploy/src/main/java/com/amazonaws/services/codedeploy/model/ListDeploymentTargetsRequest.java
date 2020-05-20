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
 * Returns an array of target IDs that are associated a deployment.
 * </p>
 */
public class ListDeploymentTargetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * A token identifier returned from the previous
     * <code>ListDeploymentTargets</code> call. It can be used to return the
     * next set of deployment targets in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A key used to filter the returned targets. The two valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetStatus</code> - A <code>TargetStatus</code> filter string can
     * be <code>Failed</code>, <code>InProgress</code>, <code>Pending</code>,
     * <code>Ready</code>, <code>Skipped</code>, <code>Succeeded</code>, or
     * <code>Unknown</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ServerInstanceLabel</code> - A <code>ServerInstanceLabel</code>
     * filter string can be <code>Blue</code> or <code>Green</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, java.util.List<String>> targetFilters;

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
    public ListDeploymentTargetsRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * A token identifier returned from the previous
     * <code>ListDeploymentTargets</code> call. It can be used to return the
     * next set of deployment targets in the list.
     * </p>
     *
     * @return <p>
     *         A token identifier returned from the previous
     *         <code>ListDeploymentTargets</code> call. It can be used to return
     *         the next set of deployment targets in the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token identifier returned from the previous
     * <code>ListDeploymentTargets</code> call. It can be used to return the
     * next set of deployment targets in the list.
     * </p>
     *
     * @param nextToken <p>
     *            A token identifier returned from the previous
     *            <code>ListDeploymentTargets</code> call. It can be used to
     *            return the next set of deployment targets in the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token identifier returned from the previous
     * <code>ListDeploymentTargets</code> call. It can be used to return the
     * next set of deployment targets in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token identifier returned from the previous
     *            <code>ListDeploymentTargets</code> call. It can be used to
     *            return the next set of deployment targets in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentTargetsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A key used to filter the returned targets. The two valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetStatus</code> - A <code>TargetStatus</code> filter string can
     * be <code>Failed</code>, <code>InProgress</code>, <code>Pending</code>,
     * <code>Ready</code>, <code>Skipped</code>, <code>Succeeded</code>, or
     * <code>Unknown</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ServerInstanceLabel</code> - A <code>ServerInstanceLabel</code>
     * filter string can be <code>Blue</code> or <code>Green</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A key used to filter the returned targets. The two valid values
     *         are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TargetStatus</code> - A <code>TargetStatus</code> filter
     *         string can be <code>Failed</code>, <code>InProgress</code>,
     *         <code>Pending</code>, <code>Ready</code>, <code>Skipped</code>,
     *         <code>Succeeded</code>, or <code>Unknown</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ServerInstanceLabel</code> - A
     *         <code>ServerInstanceLabel</code> filter string can be
     *         <code>Blue</code> or <code>Green</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, java.util.List<String>> getTargetFilters() {
        return targetFilters;
    }

    /**
     * <p>
     * A key used to filter the returned targets. The two valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetStatus</code> - A <code>TargetStatus</code> filter string can
     * be <code>Failed</code>, <code>InProgress</code>, <code>Pending</code>,
     * <code>Ready</code>, <code>Skipped</code>, <code>Succeeded</code>, or
     * <code>Unknown</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ServerInstanceLabel</code> - A <code>ServerInstanceLabel</code>
     * filter string can be <code>Blue</code> or <code>Green</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param targetFilters <p>
     *            A key used to filter the returned targets. The two valid
     *            values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TargetStatus</code> - A <code>TargetStatus</code> filter
     *            string can be <code>Failed</code>, <code>InProgress</code>,
     *            <code>Pending</code>, <code>Ready</code>, <code>Skipped</code>, <code>Succeeded</code>, or <code>Unknown</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ServerInstanceLabel</code> - A
     *            <code>ServerInstanceLabel</code> filter string can be
     *            <code>Blue</code> or <code>Green</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTargetFilters(java.util.Map<String, java.util.List<String>> targetFilters) {
        this.targetFilters = targetFilters;
    }

    /**
     * <p>
     * A key used to filter the returned targets. The two valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetStatus</code> - A <code>TargetStatus</code> filter string can
     * be <code>Failed</code>, <code>InProgress</code>, <code>Pending</code>,
     * <code>Ready</code>, <code>Skipped</code>, <code>Succeeded</code>, or
     * <code>Unknown</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ServerInstanceLabel</code> - A <code>ServerInstanceLabel</code>
     * filter string can be <code>Blue</code> or <code>Green</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetFilters <p>
     *            A key used to filter the returned targets. The two valid
     *            values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TargetStatus</code> - A <code>TargetStatus</code> filter
     *            string can be <code>Failed</code>, <code>InProgress</code>,
     *            <code>Pending</code>, <code>Ready</code>, <code>Skipped</code>, <code>Succeeded</code>, or <code>Unknown</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ServerInstanceLabel</code> - A
     *            <code>ServerInstanceLabel</code> filter string can be
     *            <code>Blue</code> or <code>Green</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentTargetsRequest withTargetFilters(
            java.util.Map<String, java.util.List<String>> targetFilters) {
        this.targetFilters = targetFilters;
        return this;
    }

    /**
     * <p>
     * A key used to filter the returned targets. The two valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetStatus</code> - A <code>TargetStatus</code> filter string can
     * be <code>Failed</code>, <code>InProgress</code>, <code>Pending</code>,
     * <code>Ready</code>, <code>Skipped</code>, <code>Succeeded</code>, or
     * <code>Unknown</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ServerInstanceLabel</code> - A <code>ServerInstanceLabel</code>
     * filter string can be <code>Blue</code> or <code>Green</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into targetFilters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into targetFilters.
     * @param value The corresponding value of the entry to be added into
     *            targetFilters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentTargetsRequest addtargetFiltersEntry(String key,
            java.util.List<String> value) {
        if (null == this.targetFilters) {
            this.targetFilters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.targetFilters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.targetFilters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into targetFilters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ListDeploymentTargetsRequest cleartargetFiltersEntries() {
        this.targetFilters = null;
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
        if (getTargetFilters() != null)
            sb.append("targetFilters: " + getTargetFilters());
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
                + ((getTargetFilters() == null) ? 0 : getTargetFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeploymentTargetsRequest == false)
            return false;
        ListDeploymentTargetsRequest other = (ListDeploymentTargetsRequest) obj;

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
        if (other.getTargetFilters() == null ^ this.getTargetFilters() == null)
            return false;
        if (other.getTargetFilters() != null
                && other.getTargetFilters().equals(this.getTargetFilters()) == false)
            return false;
        return true;
    }
}
