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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the specified the load balancers. If no load balancers are
 * specified, the call describes all of your load balancers.
 * </p>
 */
public class DescribeLoadBalancersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The names of the load balancers.
     * </p>
     */
    private java.util.List<String> loadBalancerNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a
     * previous call.)
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The maximum number of results to return with this call (a number from 1
     * to 400). The default is 400.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 400<br/>
     */
    private Integer pageSize;

    /**
     * Default constructor for DescribeLoadBalancersRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     */
    public DescribeLoadBalancersRequest() {
    }

    /**
     * Constructs a new DescribeLoadBalancersRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param loadBalancerNames <p>
     *            The names of the load balancers.
     *            </p>
     */
    public DescribeLoadBalancersRequest(java.util.List<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
    }

    /**
     * <p>
     * The names of the load balancers.
     * </p>
     *
     * @return <p>
     *         The names of the load balancers.
     *         </p>
     */
    public java.util.List<String> getLoadBalancerNames() {
        return loadBalancerNames;
    }

    /**
     * <p>
     * The names of the load balancers.
     * </p>
     *
     * @param loadBalancerNames <p>
     *            The names of the load balancers.
     *            </p>
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }

        this.loadBalancerNames = new java.util.ArrayList<String>(loadBalancerNames);
    }

    /**
     * <p>
     * The names of the load balancers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerNames <p>
     *            The names of the load balancers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancersRequest withLoadBalancerNames(String... loadBalancerNames) {
        if (getLoadBalancerNames() == null) {
            this.loadBalancerNames = new java.util.ArrayList<String>(loadBalancerNames.length);
        }
        for (String value : loadBalancerNames) {
            this.loadBalancerNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the load balancers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerNames <p>
     *            The names of the load balancers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancersRequest withLoadBalancerNames(
            java.util.Collection<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a
     * previous call.)
     * </p>
     *
     * @return <p>
     *         The marker for the next set of results. (You received this marker
     *         from a previous call.)
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a
     * previous call.)
     * </p>
     *
     * @param marker <p>
     *            The marker for the next set of results. (You received this
     *            marker from a previous call.)
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a
     * previous call.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            The marker for the next set of results. (You received this
     *            marker from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with this call (a number from 1
     * to 400). The default is 400.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 400<br/>
     *
     * @return <p>
     *         The maximum number of results to return with this call (a number
     *         from 1 to 400). The default is 400.
     *         </p>
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The maximum number of results to return with this call (a number from 1
     * to 400). The default is 400.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 400<br/>
     *
     * @param pageSize <p>
     *            The maximum number of results to return with this call (a
     *            number from 1 to 400). The default is 400.
     *            </p>
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of results to return with this call (a number from 1
     * to 400). The default is 400.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 400<br/>
     *
     * @param pageSize <p>
     *            The maximum number of results to return with this call (a
     *            number from 1 to 400). The default is 400.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancersRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
        if (getLoadBalancerNames() != null)
            sb.append("LoadBalancerNames: " + getLoadBalancerNames() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancersRequest == false)
            return false;
        DescribeLoadBalancersRequest other = (DescribeLoadBalancersRequest) obj;

        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null)
            return false;
        if (other.getLoadBalancerNames() != null
                && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }
}
