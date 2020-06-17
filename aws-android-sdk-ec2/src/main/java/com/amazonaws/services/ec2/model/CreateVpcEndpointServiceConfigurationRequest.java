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
 * Creates a VPC endpoint service configuration to which service consumers (AWS
 * accounts, IAM users, and IAM roles) can connect. Service consumers can create
 * an interface VPC endpoint to connect to your service.
 * </p>
 * <p>
 * To create an endpoint service configuration, you must first create a Network
 * Load Balancer for your service. For more information, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html">VPC
 * Endpoint Services</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 * <p>
 * If you set the private DNS name, you must prove that you own the private DNS
 * domain name. For more information, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html"
 * >VPC Endpoint Service Private DNS Name Verification</a> in the <i>Amazon
 * Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class CreateVpcEndpointServiceConfigurationRequest extends AmazonWebServiceRequest implements
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
     * Indicates whether requests from service consumers to create an endpoint
     * to your service must be accepted. To accept a request, use
     * <a>AcceptVpcEndpointConnections</a>.
     * </p>
     */
    private Boolean acceptanceRequired;

    /**
     * <p>
     * The private DNS name to assign to the VPC endpoint service.
     * </p>
     */
    private String privateDnsName;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of one or more Network Load Balancers
     * for your service.
     * </p>
     */
    private java.util.List<String> networkLoadBalancerArns;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The tags to associate with the service.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

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
    public CreateVpcEndpointServiceConfigurationRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Indicates whether requests from service consumers to create an endpoint
     * to your service must be accepted. To accept a request, use
     * <a>AcceptVpcEndpointConnections</a>.
     * </p>
     *
     * @return <p>
     *         Indicates whether requests from service consumers to create an
     *         endpoint to your service must be accepted. To accept a request,
     *         use <a>AcceptVpcEndpointConnections</a>.
     *         </p>
     */
    public Boolean isAcceptanceRequired() {
        return acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether requests from service consumers to create an endpoint
     * to your service must be accepted. To accept a request, use
     * <a>AcceptVpcEndpointConnections</a>.
     * </p>
     *
     * @return <p>
     *         Indicates whether requests from service consumers to create an
     *         endpoint to your service must be accepted. To accept a request,
     *         use <a>AcceptVpcEndpointConnections</a>.
     *         </p>
     */
    public Boolean getAcceptanceRequired() {
        return acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether requests from service consumers to create an endpoint
     * to your service must be accepted. To accept a request, use
     * <a>AcceptVpcEndpointConnections</a>.
     * </p>
     *
     * @param acceptanceRequired <p>
     *            Indicates whether requests from service consumers to create an
     *            endpoint to your service must be accepted. To accept a
     *            request, use <a>AcceptVpcEndpointConnections</a>.
     *            </p>
     */
    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether requests from service consumers to create an endpoint
     * to your service must be accepted. To accept a request, use
     * <a>AcceptVpcEndpointConnections</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceptanceRequired <p>
     *            Indicates whether requests from service consumers to create an
     *            endpoint to your service must be accepted. To accept a
     *            request, use <a>AcceptVpcEndpointConnections</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointServiceConfigurationRequest withAcceptanceRequired(
            Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
        return this;
    }

    /**
     * <p>
     * The private DNS name to assign to the VPC endpoint service.
     * </p>
     *
     * @return <p>
     *         The private DNS name to assign to the VPC endpoint service.
     *         </p>
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /**
     * <p>
     * The private DNS name to assign to the VPC endpoint service.
     * </p>
     *
     * @param privateDnsName <p>
     *            The private DNS name to assign to the VPC endpoint service.
     *            </p>
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name to assign to the VPC endpoint service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsName <p>
     *            The private DNS name to assign to the VPC endpoint service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointServiceConfigurationRequest withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of one or more Network Load Balancers
     * for your service.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARNs) of one or more Network Load
     *         Balancers for your service.
     *         </p>
     */
    public java.util.List<String> getNetworkLoadBalancerArns() {
        return networkLoadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of one or more Network Load Balancers
     * for your service.
     * </p>
     *
     * @param networkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of one or more Network Load
     *            Balancers for your service.
     *            </p>
     */
    public void setNetworkLoadBalancerArns(java.util.Collection<String> networkLoadBalancerArns) {
        if (networkLoadBalancerArns == null) {
            this.networkLoadBalancerArns = null;
            return;
        }

        this.networkLoadBalancerArns = new java.util.ArrayList<String>(networkLoadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of one or more Network Load Balancers
     * for your service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of one or more Network Load
     *            Balancers for your service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointServiceConfigurationRequest withNetworkLoadBalancerArns(
            String... networkLoadBalancerArns) {
        if (getNetworkLoadBalancerArns() == null) {
            this.networkLoadBalancerArns = new java.util.ArrayList<String>(
                    networkLoadBalancerArns.length);
        }
        for (String value : networkLoadBalancerArns) {
            this.networkLoadBalancerArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of one or more Network Load Balancers
     * for your service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of one or more Network Load
     *            Balancers for your service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointServiceConfigurationRequest withNetworkLoadBalancerArns(
            java.util.Collection<String> networkLoadBalancerArns) {
        setNetworkLoadBalancerArns(networkLoadBalancerArns);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointServiceConfigurationRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The tags to associate with the service.
     * </p>
     *
     * @return <p>
     *         The tags to associate with the service.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to associate with the service.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to associate with the service.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to associate with the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to associate with the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointServiceConfigurationRequest withTagSpecifications(
            TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to associate with the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to associate with the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointServiceConfigurationRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
        if (getAcceptanceRequired() != null)
            sb.append("AcceptanceRequired: " + getAcceptanceRequired() + ",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getNetworkLoadBalancerArns() != null)
            sb.append("NetworkLoadBalancerArns: " + getNetworkLoadBalancerArns() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getAcceptanceRequired() == null) ? 0 : getAcceptanceRequired().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime
                * hashCode
                + ((getNetworkLoadBalancerArns() == null) ? 0 : getNetworkLoadBalancerArns()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcEndpointServiceConfigurationRequest == false)
            return false;
        CreateVpcEndpointServiceConfigurationRequest other = (CreateVpcEndpointServiceConfigurationRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getAcceptanceRequired() == null ^ this.getAcceptanceRequired() == null)
            return false;
        if (other.getAcceptanceRequired() != null
                && other.getAcceptanceRequired().equals(this.getAcceptanceRequired()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null
                && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getNetworkLoadBalancerArns() == null ^ this.getNetworkLoadBalancerArns() == null)
            return false;
        if (other.getNetworkLoadBalancerArns() != null
                && other.getNetworkLoadBalancerArns().equals(this.getNetworkLoadBalancerArns()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }
}
