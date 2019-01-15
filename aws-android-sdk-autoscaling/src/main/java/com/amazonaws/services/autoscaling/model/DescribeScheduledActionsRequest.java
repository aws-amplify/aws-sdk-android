/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the actions scheduled for your Auto Scaling group that haven't run.
 * To describe the actions that have already run, use
 * <a>DescribeScalingActivities</a>.
 * </p>
 */
public class DescribeScheduledActionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The names of one or more scheduled actions. You can specify up to 50
     * actions. If you omit this parameter, all scheduled actions are described.
     * If you specify an unknown scheduled action, it is ignored with no error.
     * </p>
     */
    private java.util.List<String> scheduledActionNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The latest scheduled start time to return. If scheduled action names are
     * provided, this parameter is ignored.
     * </p>
     */
    private java.util.Date endTime;

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
     * is 50 and the maximum value is 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
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
     * <b>Length: </b>1 - 1600<br/>
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
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledActionsRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The names of one or more scheduled actions. You can specify up to 50
     * actions. If you omit this parameter, all scheduled actions are described.
     * If you specify an unknown scheduled action, it is ignored with no error.
     * </p>
     *
     * @return <p>
     *         The names of one or more scheduled actions. You can specify up to
     *         50 actions. If you omit this parameter, all scheduled actions are
     *         described. If you specify an unknown scheduled action, it is
     *         ignored with no error.
     *         </p>
     */
    public java.util.List<String> getScheduledActionNames() {
        return scheduledActionNames;
    }

    /**
     * <p>
     * The names of one or more scheduled actions. You can specify up to 50
     * actions. If you omit this parameter, all scheduled actions are described.
     * If you specify an unknown scheduled action, it is ignored with no error.
     * </p>
     *
     * @param scheduledActionNames <p>
     *            The names of one or more scheduled actions. You can specify up
     *            to 50 actions. If you omit this parameter, all scheduled
     *            actions are described. If you specify an unknown scheduled
     *            action, it is ignored with no error.
     *            </p>
     */
    public void setScheduledActionNames(java.util.Collection<String> scheduledActionNames) {
        if (scheduledActionNames == null) {
            this.scheduledActionNames = null;
            return;
        }

        this.scheduledActionNames = new java.util.ArrayList<String>(scheduledActionNames);
    }

    /**
     * <p>
     * The names of one or more scheduled actions. You can specify up to 50
     * actions. If you omit this parameter, all scheduled actions are described.
     * If you specify an unknown scheduled action, it is ignored with no error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledActionNames <p>
     *            The names of one or more scheduled actions. You can specify up
     *            to 50 actions. If you omit this parameter, all scheduled
     *            actions are described. If you specify an unknown scheduled
     *            action, it is ignored with no error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledActionsRequest withScheduledActionNames(String... scheduledActionNames) {
        if (getScheduledActionNames() == null) {
            this.scheduledActionNames = new java.util.ArrayList<String>(scheduledActionNames.length);
        }
        for (String value : scheduledActionNames) {
            this.scheduledActionNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more scheduled actions. You can specify up to 50
     * actions. If you omit this parameter, all scheduled actions are described.
     * If you specify an unknown scheduled action, it is ignored with no error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledActionNames <p>
     *            The names of one or more scheduled actions. You can specify up
     *            to 50 actions. If you omit this parameter, all scheduled
     *            actions are described. If you specify an unknown scheduled
     *            action, it is ignored with no error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledActionsRequest withScheduledActionNames(
            java.util.Collection<String> scheduledActionNames) {
        setScheduledActionNames(scheduledActionNames);
        return this;
    }

    /**
     * <p>
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     * </p>
     *
     * @return <p>
     *         The earliest scheduled start time to return. If scheduled action
     *         names are provided, this parameter is ignored.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     * </p>
     *
     * @param startTime <p>
     *            The earliest scheduled start time to return. If scheduled
     *            action names are provided, this parameter is ignored.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The earliest scheduled start time to return. If scheduled
     *            action names are provided, this parameter is ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledActionsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The latest scheduled start time to return. If scheduled action names are
     * provided, this parameter is ignored.
     * </p>
     *
     * @return <p>
     *         The latest scheduled start time to return. If scheduled action
     *         names are provided, this parameter is ignored.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The latest scheduled start time to return. If scheduled action names are
     * provided, this parameter is ignored.
     * </p>
     *
     * @param endTime <p>
     *            The latest scheduled start time to return. If scheduled action
     *            names are provided, this parameter is ignored.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The latest scheduled start time to return. If scheduled action names are
     * provided, this parameter is ignored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The latest scheduled start time to return. If scheduled action
     *            names are provided, this parameter is ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledActionsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
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
    public DescribeScheduledActionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is 50 and the maximum value is 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to return with this call. The default
     *         value is 50 and the maximum value is 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is 50 and the maximum value is 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of items to return with this call. The
     *            default value is 50 and the maximum value is 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is 50 and the maximum value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of items to return with this call. The
     *            default value is 50 and the maximum value is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledActionsRequest withMaxRecords(Integer maxRecords) {
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
        if (getScheduledActionNames() != null)
            sb.append("ScheduledActionNames: " + getScheduledActionNames() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
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
                + ((getScheduledActionNames() == null) ? 0 : getScheduledActionNames().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
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

        if (obj instanceof DescribeScheduledActionsRequest == false)
            return false;
        DescribeScheduledActionsRequest other = (DescribeScheduledActionsRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScheduledActionNames() == null ^ this.getScheduledActionNames() == null)
            return false;
        if (other.getScheduledActionNames() != null
                && other.getScheduledActionNames().equals(this.getScheduledActionNames()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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
