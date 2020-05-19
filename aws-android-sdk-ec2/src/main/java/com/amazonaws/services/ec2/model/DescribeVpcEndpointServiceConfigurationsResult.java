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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DescribeVpcEndpointServiceConfigurationsResult implements Serializable {
    /**
     * <p>
     * Information about one or more services.
     * </p>
     */
    private java.util.List<ServiceConfiguration> serviceConfigurations;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about one or more services.
     * </p>
     *
     * @return <p>
     *         Information about one or more services.
     *         </p>
     */
    public java.util.List<ServiceConfiguration> getServiceConfigurations() {
        return serviceConfigurations;
    }

    /**
     * <p>
     * Information about one or more services.
     * </p>
     *
     * @param serviceConfigurations <p>
     *            Information about one or more services.
     *            </p>
     */
    public void setServiceConfigurations(
            java.util.Collection<ServiceConfiguration> serviceConfigurations) {
        if (serviceConfigurations == null) {
            this.serviceConfigurations = null;
            return;
        }

        this.serviceConfigurations = new java.util.ArrayList<ServiceConfiguration>(
                serviceConfigurations);
    }

    /**
     * <p>
     * Information about one or more services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceConfigurations <p>
     *            Information about one or more services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointServiceConfigurationsResult withServiceConfigurations(
            ServiceConfiguration... serviceConfigurations) {
        if (getServiceConfigurations() == null) {
            this.serviceConfigurations = new java.util.ArrayList<ServiceConfiguration>(
                    serviceConfigurations.length);
        }
        for (ServiceConfiguration value : serviceConfigurations) {
            this.serviceConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceConfigurations <p>
     *            Information about one or more services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointServiceConfigurationsResult withServiceConfigurations(
            java.util.Collection<ServiceConfiguration> serviceConfigurations) {
        setServiceConfigurations(serviceConfigurations);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointServiceConfigurationsResult withNextToken(String nextToken) {
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
        if (getServiceConfigurations() != null)
            sb.append("ServiceConfigurations: " + getServiceConfigurations() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getServiceConfigurations() == null) ? 0 : getServiceConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcEndpointServiceConfigurationsResult == false)
            return false;
        DescribeVpcEndpointServiceConfigurationsResult other = (DescribeVpcEndpointServiceConfigurationsResult) obj;

        if (other.getServiceConfigurations() == null ^ this.getServiceConfigurations() == null)
            return false;
        if (other.getServiceConfigurations() != null
                && other.getServiceConfigurations().equals(this.getServiceConfigurations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
