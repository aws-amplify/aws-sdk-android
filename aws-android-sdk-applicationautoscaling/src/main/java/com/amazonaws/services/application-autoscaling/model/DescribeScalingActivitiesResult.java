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
package com.amazonaws.services.application-autoscaling.model;

import java.io.Serializable;


public class DescribeScalingActivitiesResult implements Serializable {
    /**
     * <p>A list of scaling activity objects.</p>
     */
    private java.util.List<ScalingActivity> scalingActivities;

    /**
     * <p>The token required to get the next set of results. This value is <code>null</code> if there are no more results to return.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * <p>A list of scaling activity objects.</p>
     *
     * @return <p>A list of scaling activity objects.</p>
     */
    public java.util.List<ScalingActivity> getScalingActivities() {
        return scalingActivities;
    }

    /**
     * <p>A list of scaling activity objects.</p>
     *
     * @param scalingActivities <p>A list of scaling activity objects.</p>
     */
    public void setScalingActivities(java.util.Collection<ScalingActivity> scalingActivities) {
        if (scalingActivities == null) {
            this.scalingActivities = null;
            return;
        }

        this.scalingActivities = new java.util.ArrayList<ScalingActivity>(scalingActivities);
    }

    /**
     * <p>A list of scaling activity objects.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingActivities <p>A list of scaling activity objects.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeScalingActivitiesResult withScalingActivities(ScalingActivity... scalingActivities) {
        if (getScalingActivities() == null) {
            this.scalingActivities = new java.util.ArrayList<ScalingActivity>(scalingActivities.length);
        }
        for (ScalingActivity value : scalingActivities) {
            this.scalingActivities.add(value);
        }
        return this;
    }

    /**
     * <p>A list of scaling activity objects.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingActivities <p>A list of scaling activity objects.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeScalingActivitiesResult withScalingActivities(java.util.Collection<ScalingActivity> scalingActivities) {
        setScalingActivities(scalingActivities);
        return this;
    }

    /**
     * <p>The token required to get the next set of results. This value is <code>null</code> if there are no more results to return.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return <p>The token required to get the next set of results. This value is <code>null</code> if there are no more results to return.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token required to get the next set of results. This value is <code>null</code> if there are no more results to return.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken <p>The token required to get the next set of results. This value is <code>null</code> if there are no more results to return.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token required to get the next set of results. This value is <code>null</code> if there are no more results to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken <p>The token required to get the next set of results. This value is <code>null</code> if there are no more results to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeScalingActivitiesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getScalingActivities() != null) sb.append("ScalingActivities: " + getScalingActivities() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalingActivities() == null) ? 0 : getScalingActivities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeScalingActivitiesResult == false) return false;
        DescribeScalingActivitiesResult other = (DescribeScalingActivitiesResult)obj;

        if (other.getScalingActivities() == null ^ this.getScalingActivities() == null) return false;
        if (other.getScalingActivities() != null && other.getScalingActivities().equals(this.getScalingActivities()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
