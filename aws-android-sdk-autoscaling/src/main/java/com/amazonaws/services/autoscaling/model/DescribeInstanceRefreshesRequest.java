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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes one or more instance refreshes.
 * </p>
 * <p>
 * You can determine the status of a request by looking at the
 * <code>Status</code> parameter. The following are the possible statuses:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Pending</code> - The request was created, but the operation has not
 * started.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>InProgress</code> - The operation is in progress.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Successful</code> - The operation completed successfully.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Failed</code> - The operation failed to complete. You can troubleshoot
 * using the status reason and the scaling activities.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Cancelling</code> - An ongoing operation is being cancelled.
 * Cancellation does not roll back any replacements that have already been
 * completed, but it prevents new replacements from being started.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Cancelled</code> - The operation is cancelled.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html"
 * >Replacing Auto Scaling Instances Based on an Instance Refresh</a>.
 * </p>
 */
public class DescribeInstanceRefreshesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * One or more instance refresh IDs.
     * </p>
     */
    private java.util.List<String> instanceRefreshIds = new java.util.ArrayList<String>();

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is <code>50</code> and the maximum value is <code>100</code>.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceRefreshesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * One or more instance refresh IDs.
     * </p>
     *
     * @return <p>
     *         One or more instance refresh IDs.
     *         </p>
     */
    public java.util.List<String> getInstanceRefreshIds() {
        return instanceRefreshIds;
    }

    /**
     * <p>
     * One or more instance refresh IDs.
     * </p>
     *
     * @param instanceRefreshIds <p>
     *            One or more instance refresh IDs.
     *            </p>
     */
    public void setInstanceRefreshIds(java.util.Collection<String> instanceRefreshIds) {
        if (instanceRefreshIds == null) {
            this.instanceRefreshIds = null;
            return;
        }

        this.instanceRefreshIds = new java.util.ArrayList<String>(instanceRefreshIds);
    }

    /**
     * <p>
     * One or more instance refresh IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceRefreshIds <p>
     *            One or more instance refresh IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceRefreshesRequest withInstanceRefreshIds(String... instanceRefreshIds) {
        if (getInstanceRefreshIds() == null) {
            this.instanceRefreshIds = new java.util.ArrayList<String>(instanceRefreshIds.length);
        }
        for (String value : instanceRefreshIds) {
            this.instanceRefreshIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more instance refresh IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceRefreshIds <p>
     *            One or more instance refresh IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceRefreshesRequest withInstanceRefreshIds(
            java.util.Collection<String> instanceRefreshIds) {
        setInstanceRefreshIds(instanceRefreshIds);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceRefreshesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is <code>50</code> and the maximum value is <code>100</code>.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to return with this call. The default
     *         value is <code>50</code> and the maximum value is
     *         <code>100</code>.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is <code>50</code> and the maximum value is <code>100</code>.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of items to return with this call. The
     *            default value is <code>50</code> and the maximum value is
     *            <code>100</code>.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is <code>50</code> and the maximum value is <code>100</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of items to return with this call. The
     *            default value is <code>50</code> and the maximum value is
     *            <code>100</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceRefreshesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getInstanceRefreshIds() != null)
            sb.append("InstanceRefreshIds: " + getInstanceRefreshIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceRefreshIds() == null) ? 0 : getInstanceRefreshIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceRefreshesRequest == false)
            return false;
        DescribeInstanceRefreshesRequest other = (DescribeInstanceRefreshesRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getInstanceRefreshIds() == null ^ this.getInstanceRefreshIds() == null)
            return false;
        if (other.getInstanceRefreshIds() != null
                && other.getInstanceRefreshIds().equals(this.getInstanceRefreshIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }
}
