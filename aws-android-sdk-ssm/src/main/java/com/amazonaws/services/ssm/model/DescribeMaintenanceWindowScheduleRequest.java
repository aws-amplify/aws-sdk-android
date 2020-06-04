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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about upcoming executions of a maintenance window.
 * </p>
 */
public class DescribeMaintenanceWindowScheduleRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the maintenance window to retrieve information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>
     * The instance ID or key/value pair to retrieve information about.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * The type of resource you want to retrieve information about. For example,
     * "INSTANCE".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     */
    private String resourceType;

    /**
     * <p>
     * Filters used to limit the range of results. For example, you can limit
     * maintenance window executions to only those scheduled before or after a
     * certain date and time.
     * </p>
     */
    private java.util.List<PatchOrchestratorFilter> filters;

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the maintenance window to retrieve information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>
     *         The ID of the maintenance window to retrieve information about.
     *         </p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window to retrieve information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the maintenance window to retrieve information
     *            about.
     *            </p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window to retrieve information about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the maintenance window to retrieve information
     *            about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowScheduleRequest withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>
     * The instance ID or key/value pair to retrieve information about.
     * </p>
     *
     * @return <p>
     *         The instance ID or key/value pair to retrieve information about.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The instance ID or key/value pair to retrieve information about.
     * </p>
     *
     * @param targets <p>
     *            The instance ID or key/value pair to retrieve information
     *            about.
     *            </p>
     */
    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * The instance ID or key/value pair to retrieve information about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The instance ID or key/value pair to retrieve information
     *            about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowScheduleRequest withTargets(Target... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<Target>(targets.length);
        }
        for (Target value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The instance ID or key/value pair to retrieve information about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The instance ID or key/value pair to retrieve information
     *            about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowScheduleRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The type of resource you want to retrieve information about. For example,
     * "INSTANCE".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @return <p>
     *         The type of resource you want to retrieve information about. For
     *         example, "INSTANCE".
     *         </p>
     * @see MaintenanceWindowResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource you want to retrieve information about. For example,
     * "INSTANCE".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>
     *            The type of resource you want to retrieve information about.
     *            For example, "INSTANCE".
     *            </p>
     * @see MaintenanceWindowResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource you want to retrieve information about. For example,
     * "INSTANCE".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>
     *            The type of resource you want to retrieve information about.
     *            For example, "INSTANCE".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MaintenanceWindowResourceType
     */
    public DescribeMaintenanceWindowScheduleRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource you want to retrieve information about. For example,
     * "INSTANCE".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>
     *            The type of resource you want to retrieve information about.
     *            For example, "INSTANCE".
     *            </p>
     * @see MaintenanceWindowResourceType
     */
    public void setResourceType(MaintenanceWindowResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource you want to retrieve information about. For example,
     * "INSTANCE".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>
     *            The type of resource you want to retrieve information about.
     *            For example, "INSTANCE".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MaintenanceWindowResourceType
     */
    public DescribeMaintenanceWindowScheduleRequest withResourceType(
            MaintenanceWindowResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Filters used to limit the range of results. For example, you can limit
     * maintenance window executions to only those scheduled before or after a
     * certain date and time.
     * </p>
     *
     * @return <p>
     *         Filters used to limit the range of results. For example, you can
     *         limit maintenance window executions to only those scheduled
     *         before or after a certain date and time.
     *         </p>
     */
    public java.util.List<PatchOrchestratorFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters used to limit the range of results. For example, you can limit
     * maintenance window executions to only those scheduled before or after a
     * certain date and time.
     * </p>
     *
     * @param filters <p>
     *            Filters used to limit the range of results. For example, you
     *            can limit maintenance window executions to only those
     *            scheduled before or after a certain date and time.
     *            </p>
     */
    public void setFilters(java.util.Collection<PatchOrchestratorFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<PatchOrchestratorFilter>(filters);
    }

    /**
     * <p>
     * Filters used to limit the range of results. For example, you can limit
     * maintenance window executions to only those scheduled before or after a
     * certain date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters used to limit the range of results. For example, you
     *            can limit maintenance window executions to only those
     *            scheduled before or after a certain date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowScheduleRequest withFilters(PatchOrchestratorFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<PatchOrchestratorFilter>(filters.length);
        }
        for (PatchOrchestratorFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filters used to limit the range of results. For example, you can limit
     * maintenance window executions to only those scheduled before or after a
     * certain date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters used to limit the range of results. For example, you
     *            can limit maintenance window executions to only those
     *            scheduled before or after a certain date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowScheduleRequest withFilters(
            java.util.Collection<PatchOrchestratorFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of items to return for this call. The call
     *         also returns a token that you can specify in a subsequent call to
     *         get the next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowScheduleRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     *
     * @return <p>
     *         The token for the next set of items to return. (You received this
     *         token from a previous call.)
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowScheduleRequest withNextToken(String nextToken) {
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
        if (getWindowId() != null)
            sb.append("WindowId: " + getWindowId() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMaintenanceWindowScheduleRequest == false)
            return false;
        DescribeMaintenanceWindowScheduleRequest other = (DescribeMaintenanceWindowScheduleRequest) obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
