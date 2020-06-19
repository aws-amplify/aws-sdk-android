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

/**
 * <p>
 * Contains the output of DescribeVpcEndpointServices.
 * </p>
 */
public class DescribeVpcEndpointServicesResult implements Serializable {
    /**
     * <p>
     * A list of supported services.
     * </p>
     */
    private java.util.List<String> serviceNames;

    /**
     * <p>
     * Information about the service.
     * </p>
     */
    private java.util.List<ServiceDetail> serviceDetails;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of supported services.
     * </p>
     *
     * @return <p>
     *         A list of supported services.
     *         </p>
     */
    public java.util.List<String> getServiceNames() {
        return serviceNames;
    }

    /**
     * <p>
     * A list of supported services.
     * </p>
     *
     * @param serviceNames <p>
     *            A list of supported services.
     *            </p>
     */
    public void setServiceNames(java.util.Collection<String> serviceNames) {
        if (serviceNames == null) {
            this.serviceNames = null;
            return;
        }

        this.serviceNames = new java.util.ArrayList<String>(serviceNames);
    }

    /**
     * <p>
     * A list of supported services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceNames <p>
     *            A list of supported services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointServicesResult withServiceNames(String... serviceNames) {
        if (getServiceNames() == null) {
            this.serviceNames = new java.util.ArrayList<String>(serviceNames.length);
        }
        for (String value : serviceNames) {
            this.serviceNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of supported services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceNames <p>
     *            A list of supported services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointServicesResult withServiceNames(
            java.util.Collection<String> serviceNames) {
        setServiceNames(serviceNames);
        return this;
    }

    /**
     * <p>
     * Information about the service.
     * </p>
     *
     * @return <p>
     *         Information about the service.
     *         </p>
     */
    public java.util.List<ServiceDetail> getServiceDetails() {
        return serviceDetails;
    }

    /**
     * <p>
     * Information about the service.
     * </p>
     *
     * @param serviceDetails <p>
     *            Information about the service.
     *            </p>
     */
    public void setServiceDetails(java.util.Collection<ServiceDetail> serviceDetails) {
        if (serviceDetails == null) {
            this.serviceDetails = null;
            return;
        }

        this.serviceDetails = new java.util.ArrayList<ServiceDetail>(serviceDetails);
    }

    /**
     * <p>
     * Information about the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceDetails <p>
     *            Information about the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointServicesResult withServiceDetails(ServiceDetail... serviceDetails) {
        if (getServiceDetails() == null) {
            this.serviceDetails = new java.util.ArrayList<ServiceDetail>(serviceDetails.length);
        }
        for (ServiceDetail value : serviceDetails) {
            this.serviceDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceDetails <p>
     *            Information about the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointServicesResult withServiceDetails(
            java.util.Collection<ServiceDetail> serviceDetails) {
        setServiceDetails(serviceDetails);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @return <p>
     *         The token to use when requesting the next set of items. If there
     *         are no additional items to return, the string is empty.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointServicesResult withNextToken(String nextToken) {
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
        if (getServiceNames() != null)
            sb.append("ServiceNames: " + getServiceNames() + ",");
        if (getServiceDetails() != null)
            sb.append("ServiceDetails: " + getServiceDetails() + ",");
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
                + ((getServiceNames() == null) ? 0 : getServiceNames().hashCode());
        hashCode = prime * hashCode
                + ((getServiceDetails() == null) ? 0 : getServiceDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcEndpointServicesResult == false)
            return false;
        DescribeVpcEndpointServicesResult other = (DescribeVpcEndpointServicesResult) obj;

        if (other.getServiceNames() == null ^ this.getServiceNames() == null)
            return false;
        if (other.getServiceNames() != null
                && other.getServiceNames().equals(this.getServiceNames()) == false)
            return false;
        if (other.getServiceDetails() == null ^ this.getServiceDetails() == null)
            return false;
        if (other.getServiceDetails() != null
                && other.getServiceDetails().equals(this.getServiceDetails()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
