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

public class DescribeInstanceRefreshesResult implements Serializable {
    /**
     * <p>
     * The instance refreshes for the specified group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html"
     * >Replacing Auto Scaling Instances Based on an Instance Refresh</a>.
     * </p>
     */
    private java.util.List<InstanceRefresh> instanceRefreshes = new java.util.ArrayList<InstanceRefresh>();

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The instance refreshes for the specified group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html"
     * >Replacing Auto Scaling Instances Based on an Instance Refresh</a>.
     * </p>
     *
     * @return <p>
     *         The instance refreshes for the specified group.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html"
     *         >Replacing Auto Scaling Instances Based on an Instance
     *         Refresh</a>.
     *         </p>
     */
    public java.util.List<InstanceRefresh> getInstanceRefreshes() {
        return instanceRefreshes;
    }

    /**
     * <p>
     * The instance refreshes for the specified group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html"
     * >Replacing Auto Scaling Instances Based on an Instance Refresh</a>.
     * </p>
     *
     * @param instanceRefreshes <p>
     *            The instance refreshes for the specified group.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html"
     *            >Replacing Auto Scaling Instances Based on an Instance
     *            Refresh</a>.
     *            </p>
     */
    public void setInstanceRefreshes(java.util.Collection<InstanceRefresh> instanceRefreshes) {
        if (instanceRefreshes == null) {
            this.instanceRefreshes = null;
            return;
        }

        this.instanceRefreshes = new java.util.ArrayList<InstanceRefresh>(instanceRefreshes);
    }

    /**
     * <p>
     * The instance refreshes for the specified group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html"
     * >Replacing Auto Scaling Instances Based on an Instance Refresh</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceRefreshes <p>
     *            The instance refreshes for the specified group.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html"
     *            >Replacing Auto Scaling Instances Based on an Instance
     *            Refresh</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceRefreshesResult withInstanceRefreshes(
            InstanceRefresh... instanceRefreshes) {
        if (getInstanceRefreshes() == null) {
            this.instanceRefreshes = new java.util.ArrayList<InstanceRefresh>(
                    instanceRefreshes.length);
        }
        for (InstanceRefresh value : instanceRefreshes) {
            this.instanceRefreshes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The instance refreshes for the specified group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html"
     * >Replacing Auto Scaling Instances Based on an Instance Refresh</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceRefreshes <p>
     *            The instance refreshes for the specified group.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html"
     *            >Replacing Auto Scaling Instances Based on an Instance
     *            Refresh</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceRefreshesResult withInstanceRefreshes(
            java.util.Collection<InstanceRefresh> instanceRefreshes) {
        setInstanceRefreshes(instanceRefreshes);
        return this;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A string that indicates that the response contains more items
     *         than can be returned in a single response. To receive additional
     *         items, specify this string for the <code>NextToken</code> value
     *         when requesting the next set of items. This value is null when
     *         there are no more items to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            A string that indicates that the response contains more items
     *            than can be returned in a single response. To receive
     *            additional items, specify this string for the
     *            <code>NextToken</code> value when requesting the next set of
     *            items. This value is null when there are no more items to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
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
     *            A string that indicates that the response contains more items
     *            than can be returned in a single response. To receive
     *            additional items, specify this string for the
     *            <code>NextToken</code> value when requesting the next set of
     *            items. This value is null when there are no more items to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceRefreshesResult withNextToken(String nextToken) {
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
        if (getInstanceRefreshes() != null)
            sb.append("InstanceRefreshes: " + getInstanceRefreshes() + ",");
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
                + ((getInstanceRefreshes() == null) ? 0 : getInstanceRefreshes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceRefreshesResult == false)
            return false;
        DescribeInstanceRefreshesResult other = (DescribeInstanceRefreshesResult) obj;

        if (other.getInstanceRefreshes() == null ^ this.getInstanceRefreshes() == null)
            return false;
        if (other.getInstanceRefreshes() != null
                && other.getInstanceRefreshes().equals(this.getInstanceRefreshes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
