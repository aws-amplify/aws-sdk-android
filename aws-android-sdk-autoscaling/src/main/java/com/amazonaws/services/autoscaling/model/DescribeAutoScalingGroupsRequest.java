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
 * Describes one or more Auto Scaling groups.
 * </p>
 */
public class DescribeAutoScalingGroupsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The names of the Auto Scaling groups. Each name can be a maximum of 1600
     * characters. By default, you can only specify up to 50 names. You can
     * optionally increase this limit using the <code>MaxRecords</code>
     * parameter.
     * </p>
     * <p>
     * If you omit this parameter, all Auto Scaling groups are described.
     * </p>
     */
    private java.util.List<String> autoScalingGroupNames = new java.util.ArrayList<String>();

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
     * The names of the Auto Scaling groups. Each name can be a maximum of 1600
     * characters. By default, you can only specify up to 50 names. You can
     * optionally increase this limit using the <code>MaxRecords</code>
     * parameter.
     * </p>
     * <p>
     * If you omit this parameter, all Auto Scaling groups are described.
     * </p>
     *
     * @return <p>
     *         The names of the Auto Scaling groups. Each name can be a maximum
     *         of 1600 characters. By default, you can only specify up to 50
     *         names. You can optionally increase this limit using the
     *         <code>MaxRecords</code> parameter.
     *         </p>
     *         <p>
     *         If you omit this parameter, all Auto Scaling groups are
     *         described.
     *         </p>
     */
    public java.util.List<String> getAutoScalingGroupNames() {
        return autoScalingGroupNames;
    }

    /**
     * <p>
     * The names of the Auto Scaling groups. Each name can be a maximum of 1600
     * characters. By default, you can only specify up to 50 names. You can
     * optionally increase this limit using the <code>MaxRecords</code>
     * parameter.
     * </p>
     * <p>
     * If you omit this parameter, all Auto Scaling groups are described.
     * </p>
     *
     * @param autoScalingGroupNames <p>
     *            The names of the Auto Scaling groups. Each name can be a
     *            maximum of 1600 characters. By default, you can only specify
     *            up to 50 names. You can optionally increase this limit using
     *            the <code>MaxRecords</code> parameter.
     *            </p>
     *            <p>
     *            If you omit this parameter, all Auto Scaling groups are
     *            described.
     *            </p>
     */
    public void setAutoScalingGroupNames(java.util.Collection<String> autoScalingGroupNames) {
        if (autoScalingGroupNames == null) {
            this.autoScalingGroupNames = null;
            return;
        }

        this.autoScalingGroupNames = new java.util.ArrayList<String>(autoScalingGroupNames);
    }

    /**
     * <p>
     * The names of the Auto Scaling groups. Each name can be a maximum of 1600
     * characters. By default, you can only specify up to 50 names. You can
     * optionally increase this limit using the <code>MaxRecords</code>
     * parameter.
     * </p>
     * <p>
     * If you omit this parameter, all Auto Scaling groups are described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroupNames <p>
     *            The names of the Auto Scaling groups. Each name can be a
     *            maximum of 1600 characters. By default, you can only specify
     *            up to 50 names. You can optionally increase this limit using
     *            the <code>MaxRecords</code> parameter.
     *            </p>
     *            <p>
     *            If you omit this parameter, all Auto Scaling groups are
     *            described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoScalingGroupsRequest withAutoScalingGroupNames(
            String... autoScalingGroupNames) {
        if (getAutoScalingGroupNames() == null) {
            this.autoScalingGroupNames = new java.util.ArrayList<String>(
                    autoScalingGroupNames.length);
        }
        for (String value : autoScalingGroupNames) {
            this.autoScalingGroupNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the Auto Scaling groups. Each name can be a maximum of 1600
     * characters. By default, you can only specify up to 50 names. You can
     * optionally increase this limit using the <code>MaxRecords</code>
     * parameter.
     * </p>
     * <p>
     * If you omit this parameter, all Auto Scaling groups are described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroupNames <p>
     *            The names of the Auto Scaling groups. Each name can be a
     *            maximum of 1600 characters. By default, you can only specify
     *            up to 50 names. You can optionally increase this limit using
     *            the <code>MaxRecords</code> parameter.
     *            </p>
     *            <p>
     *            If you omit this parameter, all Auto Scaling groups are
     *            described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoScalingGroupsRequest withAutoScalingGroupNames(
            java.util.Collection<String> autoScalingGroupNames) {
        setAutoScalingGroupNames(autoScalingGroupNames);
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
    public DescribeAutoScalingGroupsRequest withNextToken(String nextToken) {
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
    public DescribeAutoScalingGroupsRequest withMaxRecords(Integer maxRecords) {
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
        if (getAutoScalingGroupNames() != null)
            sb.append("AutoScalingGroupNames: " + getAutoScalingGroupNames() + ",");
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

        hashCode = prime
                * hashCode
                + ((getAutoScalingGroupNames() == null) ? 0 : getAutoScalingGroupNames().hashCode());
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

        if (obj instanceof DescribeAutoScalingGroupsRequest == false)
            return false;
        DescribeAutoScalingGroupsRequest other = (DescribeAutoScalingGroupsRequest) obj;

        if (other.getAutoScalingGroupNames() == null ^ this.getAutoScalingGroupNames() == null)
            return false;
        if (other.getAutoScalingGroupNames() != null
                && other.getAutoScalingGroupNames().equals(this.getAutoScalingGroupNames()) == false)
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
