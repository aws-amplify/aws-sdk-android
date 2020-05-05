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
 * Creates a VPC endpoint for a specified service. An endpoint enables you to
 * create a private connection between your VPC and the service. The service may
 * be provided by AWS, an AWS Marketplace Partner, or another AWS account. For
 * more information, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html"
 * >VPC Endpoints</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 * <p>
 * A <code>gateway</code> endpoint serves as a target for a route in your route
 * table for traffic destined for the AWS service. You can specify an endpoint
 * policy to attach to the endpoint, which will control access to the service
 * from your VPC. You can also specify the VPC route tables that use the
 * endpoint.
 * </p>
 * <p>
 * An <code>interface</code> endpoint is a network interface in your subnet that
 * serves as an endpoint for communicating with the specified service. You can
 * specify the subnets in which to create an endpoint, and the security groups
 * to associate with the endpoint network interface.
 * </p>
 * <p>
 * Use <a>DescribeVpcEndpointServices</a> to get a list of supported services.
 * </p>
 */
public class CreateVpcEndpointRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The type of endpoint.
     * </p>
     * <p>
     * Default: Gateway
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     */
    private String vpcEndpointType;

    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The service name. To get a list of available services, use the
     * <a>DescribeVpcEndpointServices</a> request, or get the name from the
     * service provider.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service.
     * The policy must be in valid JSON format. If this parameter is not
     * specified, we attach a default policy that allows full access to the
     * service.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs.
     * </p>
     */
    private java.util.List<String> routeTableIds;

    /**
     * <p>
     * (Interface endpoint) The ID of one or more subnets in which to create an
     * endpoint network interface.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * (Interface endpoint) The ID of one or more security groups to associate
     * with the endpoint network interface.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * (Interface endpoint) Indicates whether to associate a private hosted zone
     * with the specified VPC. The private hosted zone contains a record set for
     * the default public DNS name for the service for the Region (for example,
     * <code>kinesis.us-east-1.amazonaws.com</code>), which resolves to the
     * private IP addresses of the endpoint network interfaces in the VPC. This
     * enables you to make requests to the default public DNS name for the
     * service instead of the public DNS names that are automatically generated
     * by the VPC endpoint service.
     * </p>
     * <p>
     * To use a private hosted zone, you must set the following VPC attributes
     * to <code>true</code>: <code>enableDnsHostnames</code> and
     * <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set the
     * VPC attributes.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean privateDnsEnabled;

    /**
     * <p>
     * The tags to associate with the endpoint.
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
    public CreateVpcEndpointRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Default: Gateway
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     *
     * @return <p>
     *         The type of endpoint.
     *         </p>
     *         <p>
     *         Default: Gateway
     *         </p>
     * @see VpcEndpointType
     */
    public String getVpcEndpointType() {
        return vpcEndpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Default: Gateway
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     *
     * @param vpcEndpointType <p>
     *            The type of endpoint.
     *            </p>
     *            <p>
     *            Default: Gateway
     *            </p>
     * @see VpcEndpointType
     */
    public void setVpcEndpointType(String vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Default: Gateway
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     *
     * @param vpcEndpointType <p>
     *            The type of endpoint.
     *            </p>
     *            <p>
     *            Default: Gateway
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcEndpointType
     */
    public CreateVpcEndpointRequest withVpcEndpointType(String vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType;
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Default: Gateway
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     *
     * @param vpcEndpointType <p>
     *            The type of endpoint.
     *            </p>
     *            <p>
     *            Default: Gateway
     *            </p>
     * @see VpcEndpointType
     */
    public void setVpcEndpointType(VpcEndpointType vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType.toString();
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Default: Gateway
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Interface, Gateway
     *
     * @param vpcEndpointType <p>
     *            The type of endpoint.
     *            </p>
     *            <p>
     *            Default: Gateway
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcEndpointType
     */
    public CreateVpcEndpointRequest withVpcEndpointType(VpcEndpointType vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC in which the endpoint will be used.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC in which the endpoint will be used.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC in which the endpoint will be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The service name. To get a list of available services, use the
     * <a>DescribeVpcEndpointServices</a> request, or get the name from the
     * service provider.
     * </p>
     *
     * @return <p>
     *         The service name. To get a list of available services, use the
     *         <a>DescribeVpcEndpointServices</a> request, or get the name from
     *         the service provider.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The service name. To get a list of available services, use the
     * <a>DescribeVpcEndpointServices</a> request, or get the name from the
     * service provider.
     * </p>
     *
     * @param serviceName <p>
     *            The service name. To get a list of available services, use the
     *            <a>DescribeVpcEndpointServices</a> request, or get the name
     *            from the service provider.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The service name. To get a list of available services, use the
     * <a>DescribeVpcEndpointServices</a> request, or get the name from the
     * service provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The service name. To get a list of available services, use the
     *            <a>DescribeVpcEndpointServices</a> request, or get the name
     *            from the service provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service.
     * The policy must be in valid JSON format. If this parameter is not
     * specified, we attach a default policy that allows full access to the
     * service.
     * </p>
     *
     * @return <p>
     *         A policy to attach to the endpoint that controls access to the
     *         service. The policy must be in valid JSON format. If this
     *         parameter is not specified, we attach a default policy that
     *         allows full access to the service.
     *         </p>
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service.
     * The policy must be in valid JSON format. If this parameter is not
     * specified, we attach a default policy that allows full access to the
     * service.
     * </p>
     *
     * @param policyDocument <p>
     *            A policy to attach to the endpoint that controls access to the
     *            service. The policy must be in valid JSON format. If this
     *            parameter is not specified, we attach a default policy that
     *            allows full access to the service.
     *            </p>
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service.
     * The policy must be in valid JSON format. If this parameter is not
     * specified, we attach a default policy that allows full access to the
     * service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDocument <p>
     *            A policy to attach to the endpoint that controls access to the
     *            service. The policy must be in valid JSON format. If this
     *            parameter is not specified, we attach a default policy that
     *            allows full access to the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs.
     * </p>
     *
     * @return <p>
     *         (Gateway endpoint) One or more route table IDs.
     *         </p>
     */
    public java.util.List<String> getRouteTableIds() {
        return routeTableIds;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs.
     * </p>
     *
     * @param routeTableIds <p>
     *            (Gateway endpoint) One or more route table IDs.
     *            </p>
     */
    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }

        this.routeTableIds = new java.util.ArrayList<String>(routeTableIds);
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTableIds <p>
     *            (Gateway endpoint) One or more route table IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withRouteTableIds(String... routeTableIds) {
        if (getRouteTableIds() == null) {
            this.routeTableIds = new java.util.ArrayList<String>(routeTableIds.length);
        }
        for (String value : routeTableIds) {
            this.routeTableIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTableIds <p>
     *            (Gateway endpoint) One or more route table IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withRouteTableIds(java.util.Collection<String> routeTableIds) {
        setRouteTableIds(routeTableIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more subnets in which to create an
     * endpoint network interface.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) The ID of one or more subnets in which to
     *         create an endpoint network interface.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more subnets in which to create an
     * endpoint network interface.
     * </p>
     *
     * @param subnetIds <p>
     *            (Interface endpoint) The ID of one or more subnets in which to
     *            create an endpoint network interface.
     *            </p>
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more subnets in which to create an
     * endpoint network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            (Interface endpoint) The ID of one or more subnets in which to
     *            create an endpoint network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more subnets in which to create an
     * endpoint network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            (Interface endpoint) The ID of one or more subnets in which to
     *            create an endpoint network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more security groups to associate
     * with the endpoint network interface.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) The ID of one or more security groups to
     *         associate with the endpoint network interface.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more security groups to associate
     * with the endpoint network interface.
     * </p>
     *
     * @param securityGroupIds <p>
     *            (Interface endpoint) The ID of one or more security groups to
     *            associate with the endpoint network interface.
     *            </p>
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more security groups to associate
     * with the endpoint network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            (Interface endpoint) The ID of one or more security groups to
     *            associate with the endpoint network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more security groups to associate
     * with the endpoint network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            (Interface endpoint) The ID of one or more security groups to
     *            associate with the endpoint network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
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
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
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
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
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
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether to associate a private hosted zone
     * with the specified VPC. The private hosted zone contains a record set for
     * the default public DNS name for the service for the Region (for example,
     * <code>kinesis.us-east-1.amazonaws.com</code>), which resolves to the
     * private IP addresses of the endpoint network interfaces in the VPC. This
     * enables you to make requests to the default public DNS name for the
     * service instead of the public DNS names that are automatically generated
     * by the VPC endpoint service.
     * </p>
     * <p>
     * To use a private hosted zone, you must set the following VPC attributes
     * to <code>true</code>: <code>enableDnsHostnames</code> and
     * <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set the
     * VPC attributes.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) Indicates whether to associate a private
     *         hosted zone with the specified VPC. The private hosted zone
     *         contains a record set for the default public DNS name for the
     *         service for the Region (for example,
     *         <code>kinesis.us-east-1.amazonaws.com</code>), which resolves to
     *         the private IP addresses of the endpoint network interfaces in
     *         the VPC. This enables you to make requests to the default public
     *         DNS name for the service instead of the public DNS names that are
     *         automatically generated by the VPC endpoint service.
     *         </p>
     *         <p>
     *         To use a private hosted zone, you must set the following VPC
     *         attributes to <code>true</code>: <code>enableDnsHostnames</code>
     *         and <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a>
     *         to set the VPC attributes.
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean isPrivateDnsEnabled() {
        return privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether to associate a private hosted zone
     * with the specified VPC. The private hosted zone contains a record set for
     * the default public DNS name for the service for the Region (for example,
     * <code>kinesis.us-east-1.amazonaws.com</code>), which resolves to the
     * private IP addresses of the endpoint network interfaces in the VPC. This
     * enables you to make requests to the default public DNS name for the
     * service instead of the public DNS names that are automatically generated
     * by the VPC endpoint service.
     * </p>
     * <p>
     * To use a private hosted zone, you must set the following VPC attributes
     * to <code>true</code>: <code>enableDnsHostnames</code> and
     * <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set the
     * VPC attributes.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) Indicates whether to associate a private
     *         hosted zone with the specified VPC. The private hosted zone
     *         contains a record set for the default public DNS name for the
     *         service for the Region (for example,
     *         <code>kinesis.us-east-1.amazonaws.com</code>), which resolves to
     *         the private IP addresses of the endpoint network interfaces in
     *         the VPC. This enables you to make requests to the default public
     *         DNS name for the service instead of the public DNS names that are
     *         automatically generated by the VPC endpoint service.
     *         </p>
     *         <p>
     *         To use a private hosted zone, you must set the following VPC
     *         attributes to <code>true</code>: <code>enableDnsHostnames</code>
     *         and <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a>
     *         to set the VPC attributes.
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean getPrivateDnsEnabled() {
        return privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether to associate a private hosted zone
     * with the specified VPC. The private hosted zone contains a record set for
     * the default public DNS name for the service for the Region (for example,
     * <code>kinesis.us-east-1.amazonaws.com</code>), which resolves to the
     * private IP addresses of the endpoint network interfaces in the VPC. This
     * enables you to make requests to the default public DNS name for the
     * service instead of the public DNS names that are automatically generated
     * by the VPC endpoint service.
     * </p>
     * <p>
     * To use a private hosted zone, you must set the following VPC attributes
     * to <code>true</code>: <code>enableDnsHostnames</code> and
     * <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set the
     * VPC attributes.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @param privateDnsEnabled <p>
     *            (Interface endpoint) Indicates whether to associate a private
     *            hosted zone with the specified VPC. The private hosted zone
     *            contains a record set for the default public DNS name for the
     *            service for the Region (for example,
     *            <code>kinesis.us-east-1.amazonaws.com</code>), which resolves
     *            to the private IP addresses of the endpoint network interfaces
     *            in the VPC. This enables you to make requests to the default
     *            public DNS name for the service instead of the public DNS
     *            names that are automatically generated by the VPC endpoint
     *            service.
     *            </p>
     *            <p>
     *            To use a private hosted zone, you must set the following VPC
     *            attributes to <code>true</code>:
     *            <code>enableDnsHostnames</code> and
     *            <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a>
     *            to set the VPC attributes.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     */
    public void setPrivateDnsEnabled(Boolean privateDnsEnabled) {
        this.privateDnsEnabled = privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether to associate a private hosted zone
     * with the specified VPC. The private hosted zone contains a record set for
     * the default public DNS name for the service for the Region (for example,
     * <code>kinesis.us-east-1.amazonaws.com</code>), which resolves to the
     * private IP addresses of the endpoint network interfaces in the VPC. This
     * enables you to make requests to the default public DNS name for the
     * service instead of the public DNS names that are automatically generated
     * by the VPC endpoint service.
     * </p>
     * <p>
     * To use a private hosted zone, you must set the following VPC attributes
     * to <code>true</code>: <code>enableDnsHostnames</code> and
     * <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set the
     * VPC attributes.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsEnabled <p>
     *            (Interface endpoint) Indicates whether to associate a private
     *            hosted zone with the specified VPC. The private hosted zone
     *            contains a record set for the default public DNS name for the
     *            service for the Region (for example,
     *            <code>kinesis.us-east-1.amazonaws.com</code>), which resolves
     *            to the private IP addresses of the endpoint network interfaces
     *            in the VPC. This enables you to make requests to the default
     *            public DNS name for the service instead of the public DNS
     *            names that are automatically generated by the VPC endpoint
     *            service.
     *            </p>
     *            <p>
     *            To use a private hosted zone, you must set the following VPC
     *            attributes to <code>true</code>:
     *            <code>enableDnsHostnames</code> and
     *            <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a>
     *            to set the VPC attributes.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withPrivateDnsEnabled(Boolean privateDnsEnabled) {
        this.privateDnsEnabled = privateDnsEnabled;
        return this;
    }

    /**
     * <p>
     * The tags to associate with the endpoint.
     * </p>
     *
     * @return <p>
     *         The tags to associate with the endpoint.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to associate with the endpoint.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to associate with the endpoint.
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
     * The tags to associate with the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to associate with the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to associate with the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to associate with the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointRequest withTagSpecifications(
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
        if (getVpcEndpointType() != null)
            sb.append("VpcEndpointType: " + getVpcEndpointType() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getRouteTableIds() != null)
            sb.append("RouteTableIds: " + getRouteTableIds() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getPrivateDnsEnabled() != null)
            sb.append("PrivateDnsEnabled: " + getPrivateDnsEnabled() + ",");
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
                + ((getVpcEndpointType() == null) ? 0 : getVpcEndpointType().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode
                + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateDnsEnabled() == null) ? 0 : getPrivateDnsEnabled().hashCode());
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

        if (obj instanceof CreateVpcEndpointRequest == false)
            return false;
        CreateVpcEndpointRequest other = (CreateVpcEndpointRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getVpcEndpointType() == null ^ this.getVpcEndpointType() == null)
            return false;
        if (other.getVpcEndpointType() != null
                && other.getVpcEndpointType().equals(this.getVpcEndpointType()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null)
            return false;
        if (other.getRouteTableIds() != null
                && other.getRouteTableIds().equals(this.getRouteTableIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getPrivateDnsEnabled() == null ^ this.getPrivateDnsEnabled() == null)
            return false;
        if (other.getPrivateDnsEnabled() != null
                && other.getPrivateDnsEnabled().equals(this.getPrivateDnsEnabled()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }
}
