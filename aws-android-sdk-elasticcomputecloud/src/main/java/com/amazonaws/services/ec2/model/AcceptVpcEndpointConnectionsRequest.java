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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Accepts one or more interface VPC endpoint connection requests to your VPC
 * endpoint service.
 * </p>
 */
public class AcceptVpcEndpointConnectionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID of the VPC endpoint service.
     * </p>
     */
    private String serviceId;

    /**
     * <p>
     * The IDs of one or more interface VPC endpoints.
     * </p>
     */
    private java.util.List<String> vpcEndpointIds;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptVpcEndpointConnectionsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC endpoint service.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC endpoint service.
     *         </p>
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint service.
     * </p>
     *
     * @param serviceId <p>
     *            The ID of the VPC endpoint service.
     *            </p>
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceId <p>
     *            The ID of the VPC endpoint service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptVpcEndpointConnectionsRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * <p>
     * The IDs of one or more interface VPC endpoints.
     * </p>
     *
     * @return <p>
     *         The IDs of one or more interface VPC endpoints.
     *         </p>
     */
    public java.util.List<String> getVpcEndpointIds() {
        return vpcEndpointIds;
    }

    /**
     * <p>
     * The IDs of one or more interface VPC endpoints.
     * </p>
     *
     * @param vpcEndpointIds <p>
     *            The IDs of one or more interface VPC endpoints.
     *            </p>
     */
    public void setVpcEndpointIds(java.util.Collection<String> vpcEndpointIds) {
        if (vpcEndpointIds == null) {
            this.vpcEndpointIds = null;
            return;
        }

        this.vpcEndpointIds = new java.util.ArrayList<String>(vpcEndpointIds);
    }

    /**
     * <p>
     * The IDs of one or more interface VPC endpoints.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointIds <p>
     *            The IDs of one or more interface VPC endpoints.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptVpcEndpointConnectionsRequest withVpcEndpointIds(String... vpcEndpointIds) {
        if (getVpcEndpointIds() == null) {
            this.vpcEndpointIds = new java.util.ArrayList<String>(vpcEndpointIds.length);
        }
        for (String value : vpcEndpointIds) {
            this.vpcEndpointIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more interface VPC endpoints.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointIds <p>
     *            The IDs of one or more interface VPC endpoints.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptVpcEndpointConnectionsRequest withVpcEndpointIds(
            java.util.Collection<String> vpcEndpointIds) {
        setVpcEndpointIds(vpcEndpointIds);
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getServiceId() != null)
            sb.append("ServiceId: " + getServiceId() + ",");
        if (getVpcEndpointIds() != null)
            sb.append("VpcEndpointIds: " + getVpcEndpointIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode
                + ((getVpcEndpointIds() == null) ? 0 : getVpcEndpointIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptVpcEndpointConnectionsRequest == false)
            return false;
        AcceptVpcEndpointConnectionsRequest other = (AcceptVpcEndpointConnectionsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null
                && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getVpcEndpointIds() == null ^ this.getVpcEndpointIds() == null)
            return false;
        if (other.getVpcEndpointIds() != null
                && other.getVpcEndpointIds().equals(this.getVpcEndpointIds()) == false)
            return false;
        return true;
    }
}
