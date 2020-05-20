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
 * Lists the deployments in a deployment group for an application registered
 * with the IAM user or AWS account.
 * </p>
 */
public class ListDeploymentsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <note>
     * <p>
     * If <code>applicationName</code> is specified, then
     * <code>deploymentGroupName</code> must be specified. If it is not
     * specified, then <code>deploymentGroupName</code> must not be specified.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The name of a deployment group for the specified application.
     * </p>
     * <note>
     * <p>
     * If <code>deploymentGroupName</code> is specified, then
     * <code>applicationName</code> must be specified. If it is not specified,
     * then <code>applicationName</code> must not be specified.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentGroupName;

    /**
     * <p>
     * The unique ID of an external resource for returning deployments linked to
     * the external resource.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * A subset of deployments to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code>: Include created deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Queued</code>: Include queued deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>In Progress</code>: Include in-progress deployments in the
     * resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: Include successful deployments in the resulting
     * list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Include failed deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code>: Include stopped deployments in the resulting list.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> includeOnlyStatuses;

    /**
     * <p>
     * A time range (start and end) for returning a subset of the list of
     * deployments.
     * </p>
     */
    private TimeRange createTimeRange;

    /**
     * <p>
     * An identifier returned from the previous list deployments call. It can be
     * used to return the next set of deployments in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <note>
     * <p>
     * If <code>applicationName</code> is specified, then
     * <code>deploymentGroupName</code> must be specified. If it is not
     * specified, then <code>deploymentGroupName</code> must not be specified.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of an AWS CodeDeploy application associated with the IAM
     *         user or AWS account.
     *         </p>
     *         <note>
     *         <p>
     *         If <code>applicationName</code> is specified, then
     *         <code>deploymentGroupName</code> must be specified. If it is not
     *         specified, then <code>deploymentGroupName</code> must not be
     *         specified.
     *         </p>
     *         </note>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <note>
     * <p>
     * If <code>applicationName</code> is specified, then
     * <code>deploymentGroupName</code> must be specified. If it is not
     * specified, then <code>deploymentGroupName</code> must not be specified.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of an AWS CodeDeploy application associated with the
     *            IAM user or AWS account.
     *            </p>
     *            <note>
     *            <p>
     *            If <code>applicationName</code> is specified, then
     *            <code>deploymentGroupName</code> must be specified. If it is
     *            not specified, then <code>deploymentGroupName</code> must not
     *            be specified.
     *            </p>
     *            </note>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <note>
     * <p>
     * If <code>applicationName</code> is specified, then
     * <code>deploymentGroupName</code> must be specified. If it is not
     * specified, then <code>deploymentGroupName</code> must not be specified.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of an AWS CodeDeploy application associated with the
     *            IAM user or AWS account.
     *            </p>
     *            <note>
     *            <p>
     *            If <code>applicationName</code> is specified, then
     *            <code>deploymentGroupName</code> must be specified. If it is
     *            not specified, then <code>deploymentGroupName</code> must not
     *            be specified.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The name of a deployment group for the specified application.
     * </p>
     * <note>
     * <p>
     * If <code>deploymentGroupName</code> is specified, then
     * <code>applicationName</code> must be specified. If it is not specified,
     * then <code>applicationName</code> must not be specified.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of a deployment group for the specified application.
     *         </p>
     *         <note>
     *         <p>
     *         If <code>deploymentGroupName</code> is specified, then
     *         <code>applicationName</code> must be specified. If it is not
     *         specified, then <code>applicationName</code> must not be
     *         specified.
     *         </p>
     *         </note>
     */
    public String getDeploymentGroupName() {
        return deploymentGroupName;
    }

    /**
     * <p>
     * The name of a deployment group for the specified application.
     * </p>
     * <note>
     * <p>
     * If <code>deploymentGroupName</code> is specified, then
     * <code>applicationName</code> must be specified. If it is not specified,
     * then <code>applicationName</code> must not be specified.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName <p>
     *            The name of a deployment group for the specified application.
     *            </p>
     *            <note>
     *            <p>
     *            If <code>deploymentGroupName</code> is specified, then
     *            <code>applicationName</code> must be specified. If it is not
     *            specified, then <code>applicationName</code> must not be
     *            specified.
     *            </p>
     *            </note>
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    /**
     * <p>
     * The name of a deployment group for the specified application.
     * </p>
     * <note>
     * <p>
     * If <code>deploymentGroupName</code> is specified, then
     * <code>applicationName</code> must be specified. If it is not specified,
     * then <code>applicationName</code> must not be specified.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName <p>
     *            The name of a deployment group for the specified application.
     *            </p>
     *            <note>
     *            <p>
     *            If <code>deploymentGroupName</code> is specified, then
     *            <code>applicationName</code> must be specified. If it is not
     *            specified, then <code>applicationName</code> must not be
     *            specified.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentsRequest withDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
        return this;
    }

    /**
     * <p>
     * The unique ID of an external resource for returning deployments linked to
     * the external resource.
     * </p>
     *
     * @return <p>
     *         The unique ID of an external resource for returning deployments
     *         linked to the external resource.
     *         </p>
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * <p>
     * The unique ID of an external resource for returning deployments linked to
     * the external resource.
     * </p>
     *
     * @param externalId <p>
     *            The unique ID of an external resource for returning
     *            deployments linked to the external resource.
     *            </p>
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The unique ID of an external resource for returning deployments linked to
     * the external resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalId <p>
     *            The unique ID of an external resource for returning
     *            deployments linked to the external resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentsRequest withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * <p>
     * A subset of deployments to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code>: Include created deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Queued</code>: Include queued deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>In Progress</code>: Include in-progress deployments in the
     * resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: Include successful deployments in the resulting
     * list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Include failed deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code>: Include stopped deployments in the resulting list.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A subset of deployments to list by status:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Created</code>: Include created deployments in the
     *         resulting list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Queued</code>: Include queued deployments in the resulting
     *         list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>In Progress</code>: Include in-progress deployments in the
     *         resulting list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Succeeded</code>: Include successful deployments in the
     *         resulting list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code>: Include failed deployments in the resulting
     *         list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopped</code>: Include stopped deployments in the
     *         resulting list.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getIncludeOnlyStatuses() {
        return includeOnlyStatuses;
    }

    /**
     * <p>
     * A subset of deployments to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code>: Include created deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Queued</code>: Include queued deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>In Progress</code>: Include in-progress deployments in the
     * resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: Include successful deployments in the resulting
     * list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Include failed deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code>: Include stopped deployments in the resulting list.
     * </p>
     * </li>
     * </ul>
     *
     * @param includeOnlyStatuses <p>
     *            A subset of deployments to list by status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Created</code>: Include created deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Queued</code>: Include queued deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>In Progress</code>: Include in-progress deployments in
     *            the resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code>: Include successful deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: Include failed deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code>: Include stopped deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setIncludeOnlyStatuses(java.util.Collection<String> includeOnlyStatuses) {
        if (includeOnlyStatuses == null) {
            this.includeOnlyStatuses = null;
            return;
        }

        this.includeOnlyStatuses = new java.util.ArrayList<String>(includeOnlyStatuses);
    }

    /**
     * <p>
     * A subset of deployments to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code>: Include created deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Queued</code>: Include queued deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>In Progress</code>: Include in-progress deployments in the
     * resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: Include successful deployments in the resulting
     * list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Include failed deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code>: Include stopped deployments in the resulting list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeOnlyStatuses <p>
     *            A subset of deployments to list by status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Created</code>: Include created deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Queued</code>: Include queued deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>In Progress</code>: Include in-progress deployments in
     *            the resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code>: Include successful deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: Include failed deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code>: Include stopped deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentsRequest withIncludeOnlyStatuses(String... includeOnlyStatuses) {
        if (getIncludeOnlyStatuses() == null) {
            this.includeOnlyStatuses = new java.util.ArrayList<String>(includeOnlyStatuses.length);
        }
        for (String value : includeOnlyStatuses) {
            this.includeOnlyStatuses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A subset of deployments to list by status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code>: Include created deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Queued</code>: Include queued deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>In Progress</code>: Include in-progress deployments in the
     * resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: Include successful deployments in the resulting
     * list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Include failed deployments in the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code>: Include stopped deployments in the resulting list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeOnlyStatuses <p>
     *            A subset of deployments to list by status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Created</code>: Include created deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Queued</code>: Include queued deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>In Progress</code>: Include in-progress deployments in
     *            the resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code>: Include successful deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: Include failed deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code>: Include stopped deployments in the
     *            resulting list.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentsRequest withIncludeOnlyStatuses(
            java.util.Collection<String> includeOnlyStatuses) {
        setIncludeOnlyStatuses(includeOnlyStatuses);
        return this;
    }

    /**
     * <p>
     * A time range (start and end) for returning a subset of the list of
     * deployments.
     * </p>
     *
     * @return <p>
     *         A time range (start and end) for returning a subset of the list
     *         of deployments.
     *         </p>
     */
    public TimeRange getCreateTimeRange() {
        return createTimeRange;
    }

    /**
     * <p>
     * A time range (start and end) for returning a subset of the list of
     * deployments.
     * </p>
     *
     * @param createTimeRange <p>
     *            A time range (start and end) for returning a subset of the
     *            list of deployments.
     *            </p>
     */
    public void setCreateTimeRange(TimeRange createTimeRange) {
        this.createTimeRange = createTimeRange;
    }

    /**
     * <p>
     * A time range (start and end) for returning a subset of the list of
     * deployments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTimeRange <p>
     *            A time range (start and end) for returning a subset of the
     *            list of deployments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentsRequest withCreateTimeRange(TimeRange createTimeRange) {
        this.createTimeRange = createTimeRange;
        return this;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployments call. It can be
     * used to return the next set of deployments in the list.
     * </p>
     *
     * @return <p>
     *         An identifier returned from the previous list deployments call.
     *         It can be used to return the next set of deployments in the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployments call. It can be
     * used to return the next set of deployments in the list.
     * </p>
     *
     * @param nextToken <p>
     *            An identifier returned from the previous list deployments
     *            call. It can be used to return the next set of deployments in
     *            the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list deployments call. It can be
     * used to return the next set of deployments in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An identifier returned from the previous list deployments
     *            call. It can be used to return the next set of deployments in
     *            the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDeploymentGroupName() != null)
            sb.append("deploymentGroupName: " + getDeploymentGroupName() + ",");
        if (getExternalId() != null)
            sb.append("externalId: " + getExternalId() + ",");
        if (getIncludeOnlyStatuses() != null)
            sb.append("includeOnlyStatuses: " + getIncludeOnlyStatuses() + ",");
        if (getCreateTimeRange() != null)
            sb.append("createTimeRange: " + getCreateTimeRange() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
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
                + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeOnlyStatuses() == null) ? 0 : getIncludeOnlyStatuses().hashCode());
        hashCode = prime * hashCode
                + ((getCreateTimeRange() == null) ? 0 : getCreateTimeRange().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeploymentsRequest == false)
            return false;
        ListDeploymentsRequest other = (ListDeploymentsRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null)
            return false;
        if (other.getDeploymentGroupName() != null
                && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null
                && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getIncludeOnlyStatuses() == null ^ this.getIncludeOnlyStatuses() == null)
            return false;
        if (other.getIncludeOnlyStatuses() != null
                && other.getIncludeOnlyStatuses().equals(this.getIncludeOnlyStatuses()) == false)
            return false;
        if (other.getCreateTimeRange() == null ^ this.getCreateTimeRange() == null)
            return false;
        if (other.getCreateTimeRange() != null
                && other.getCreateTimeRange().equals(this.getCreateTimeRange()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
