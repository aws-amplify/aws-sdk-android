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
 * Describes one or more scaling activities for the specified Auto Scaling
 * group.
 * </p>
 */
public class DescribeScalingActivitiesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The activity IDs of the desired scaling activities. You can specify up to
     * 50 IDs. If you omit this parameter, all activities for the past six weeks
     * are described. If unknown activities are requested, they are ignored with
     * no error. If you specify an Auto Scaling group, the results are limited
     * to that group.
     * </p>
     */
    private java.util.List<String> activityIds = new java.util.ArrayList<String>();

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
     * The maximum number of items to return with this call. The default value
     * is 100 and the maximum value is 100.
     * </p>
     */
    private Integer maxRecords;

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
     * The activity IDs of the desired scaling activities. You can specify up to
     * 50 IDs. If you omit this parameter, all activities for the past six weeks
     * are described. If unknown activities are requested, they are ignored with
     * no error. If you specify an Auto Scaling group, the results are limited
     * to that group.
     * </p>
     *
     * @return <p>
     *         The activity IDs of the desired scaling activities. You can
     *         specify up to 50 IDs. If you omit this parameter, all activities
     *         for the past six weeks are described. If unknown activities are
     *         requested, they are ignored with no error. If you specify an Auto
     *         Scaling group, the results are limited to that group.
     *         </p>
     */
    public java.util.List<String> getActivityIds() {
        return activityIds;
    }

    /**
     * <p>
     * The activity IDs of the desired scaling activities. You can specify up to
     * 50 IDs. If you omit this parameter, all activities for the past six weeks
     * are described. If unknown activities are requested, they are ignored with
     * no error. If you specify an Auto Scaling group, the results are limited
     * to that group.
     * </p>
     *
     * @param activityIds <p>
     *            The activity IDs of the desired scaling activities. You can
     *            specify up to 50 IDs. If you omit this parameter, all
     *            activities for the past six weeks are described. If unknown
     *            activities are requested, they are ignored with no error. If
     *            you specify an Auto Scaling group, the results are limited to
     *            that group.
     *            </p>
     */
    public void setActivityIds(java.util.Collection<String> activityIds) {
        if (activityIds == null) {
            this.activityIds = null;
            return;
        }

        this.activityIds = new java.util.ArrayList<String>(activityIds);
    }

    /**
     * <p>
     * The activity IDs of the desired scaling activities. You can specify up to
     * 50 IDs. If you omit this parameter, all activities for the past six weeks
     * are described. If unknown activities are requested, they are ignored with
     * no error. If you specify an Auto Scaling group, the results are limited
     * to that group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activityIds <p>
     *            The activity IDs of the desired scaling activities. You can
     *            specify up to 50 IDs. If you omit this parameter, all
     *            activities for the past six weeks are described. If unknown
     *            activities are requested, they are ignored with no error. If
     *            you specify an Auto Scaling group, the results are limited to
     *            that group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScalingActivitiesRequest withActivityIds(String... activityIds) {
        if (getActivityIds() == null) {
            this.activityIds = new java.util.ArrayList<String>(activityIds.length);
        }
        for (String value : activityIds) {
            this.activityIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The activity IDs of the desired scaling activities. You can specify up to
     * 50 IDs. If you omit this parameter, all activities for the past six weeks
     * are described. If unknown activities are requested, they are ignored with
     * no error. If you specify an Auto Scaling group, the results are limited
     * to that group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activityIds <p>
     *            The activity IDs of the desired scaling activities. You can
     *            specify up to 50 IDs. If you omit this parameter, all
     *            activities for the past six weeks are described. If unknown
     *            activities are requested, they are ignored with no error. If
     *            you specify an Auto Scaling group, the results are limited to
     *            that group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScalingActivitiesRequest withActivityIds(java.util.Collection<String> activityIds) {
        setActivityIds(activityIds);
        return this;
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
    public DescribeScalingActivitiesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is 100 and the maximum value is 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to return with this call. The default
     *         value is 100 and the maximum value is 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is 100 and the maximum value is 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of items to return with this call. The
     *            default value is 100 and the maximum value is 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is 100 and the maximum value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of items to return with this call. The
     *            default value is 100 and the maximum value is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScalingActivitiesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
    public DescribeScalingActivitiesRequest withNextToken(String nextToken) {
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
        if (getActivityIds() != null)
            sb.append("ActivityIds: " + getActivityIds() + ",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActivityIds() == null) ? 0 : getActivityIds().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScalingActivitiesRequest == false)
            return false;
        DescribeScalingActivitiesRequest other = (DescribeScalingActivitiesRequest) obj;

        if (other.getActivityIds() == null ^ this.getActivityIds() == null)
            return false;
        if (other.getActivityIds() != null
                && other.getActivityIds().equals(this.getActivityIds()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
