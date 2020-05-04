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
 * Modifies attributes of a specified VPC endpoint. The attributes that you can
 * modify depend on the type of VPC endpoint (interface or gateway). For more
 * information, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html"
 * >VPC Endpoints</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class ModifyVpcEndpointRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The ID of the endpoint.
     * </p>
     */
    private String vpcEndpointId;

    /**
     * <p>
     * (Gateway endpoint) Specify <code>true</code> to reset the policy document
     * to the default policy. The default policy allows full access to the
     * service.
     * </p>
     */
    private Boolean resetPolicy;

    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service.
     * The policy must be in valid JSON format.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * (Gateway endpoint) One or more route tables IDs to associate with the
     * endpoint.
     * </p>
     */
    private java.util.List<String> addRouteTableIds;

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs to disassociate from the
     * endpoint.
     * </p>
     */
    private java.util.List<String> removeRouteTableIds;

    /**
     * <p>
     * (Interface endpoint) One or more subnet IDs in which to serve the
     * endpoint.
     * </p>
     */
    private java.util.List<String> addSubnetIds;

    /**
     * <p>
     * (Interface endpoint) One or more subnets IDs in which to remove the
     * endpoint.
     * </p>
     */
    private java.util.List<String> removeSubnetIds;

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to associate with the
     * network interface.
     * </p>
     */
    private java.util.List<String> addSecurityGroupIds;

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to disassociate from
     * the network interface.
     * </p>
     */
    private java.util.List<String> removeSecurityGroupIds;

    /**
     * <p>
     * (Interface endpoint) Indicates whether a private hosted zone is
     * associated with the VPC.
     * </p>
     */
    private Boolean privateDnsEnabled;

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
    public ModifyVpcEndpointRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     *
     * @return <p>
     *         The ID of the endpoint.
     *         </p>
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     *
     * @param vpcEndpointId <p>
     *            The ID of the endpoint.
     *            </p>
     */
    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointId <p>
     *            The ID of the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) Specify <code>true</code> to reset the policy document
     * to the default policy. The default policy allows full access to the
     * service.
     * </p>
     *
     * @return <p>
     *         (Gateway endpoint) Specify <code>true</code> to reset the policy
     *         document to the default policy. The default policy allows full
     *         access to the service.
     *         </p>
     */
    public Boolean isResetPolicy() {
        return resetPolicy;
    }

    /**
     * <p>
     * (Gateway endpoint) Specify <code>true</code> to reset the policy document
     * to the default policy. The default policy allows full access to the
     * service.
     * </p>
     *
     * @return <p>
     *         (Gateway endpoint) Specify <code>true</code> to reset the policy
     *         document to the default policy. The default policy allows full
     *         access to the service.
     *         </p>
     */
    public Boolean getResetPolicy() {
        return resetPolicy;
    }

    /**
     * <p>
     * (Gateway endpoint) Specify <code>true</code> to reset the policy document
     * to the default policy. The default policy allows full access to the
     * service.
     * </p>
     *
     * @param resetPolicy <p>
     *            (Gateway endpoint) Specify <code>true</code> to reset the
     *            policy document to the default policy. The default policy
     *            allows full access to the service.
     *            </p>
     */
    public void setResetPolicy(Boolean resetPolicy) {
        this.resetPolicy = resetPolicy;
    }

    /**
     * <p>
     * (Gateway endpoint) Specify <code>true</code> to reset the policy document
     * to the default policy. The default policy allows full access to the
     * service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resetPolicy <p>
     *            (Gateway endpoint) Specify <code>true</code> to reset the
     *            policy document to the default policy. The default policy
     *            allows full access to the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withResetPolicy(Boolean resetPolicy) {
        this.resetPolicy = resetPolicy;
        return this;
    }

    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service.
     * The policy must be in valid JSON format.
     * </p>
     *
     * @return <p>
     *         A policy to attach to the endpoint that controls access to the
     *         service. The policy must be in valid JSON format.
     *         </p>
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service.
     * The policy must be in valid JSON format.
     * </p>
     *
     * @param policyDocument <p>
     *            A policy to attach to the endpoint that controls access to the
     *            service. The policy must be in valid JSON format.
     *            </p>
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service.
     * The policy must be in valid JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDocument <p>
     *            A policy to attach to the endpoint that controls access to the
     *            service. The policy must be in valid JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables IDs to associate with the
     * endpoint.
     * </p>
     *
     * @return <p>
     *         (Gateway endpoint) One or more route tables IDs to associate with
     *         the endpoint.
     *         </p>
     */
    public java.util.List<String> getAddRouteTableIds() {
        return addRouteTableIds;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables IDs to associate with the
     * endpoint.
     * </p>
     *
     * @param addRouteTableIds <p>
     *            (Gateway endpoint) One or more route tables IDs to associate
     *            with the endpoint.
     *            </p>
     */
    public void setAddRouteTableIds(java.util.Collection<String> addRouteTableIds) {
        if (addRouteTableIds == null) {
            this.addRouteTableIds = null;
            return;
        }

        this.addRouteTableIds = new java.util.ArrayList<String>(addRouteTableIds);
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables IDs to associate with the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addRouteTableIds <p>
     *            (Gateway endpoint) One or more route tables IDs to associate
     *            with the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withAddRouteTableIds(String... addRouteTableIds) {
        if (getAddRouteTableIds() == null) {
            this.addRouteTableIds = new java.util.ArrayList<String>(addRouteTableIds.length);
        }
        for (String value : addRouteTableIds) {
            this.addRouteTableIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables IDs to associate with the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addRouteTableIds <p>
     *            (Gateway endpoint) One or more route tables IDs to associate
     *            with the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withAddRouteTableIds(
            java.util.Collection<String> addRouteTableIds) {
        setAddRouteTableIds(addRouteTableIds);
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs to disassociate from the
     * endpoint.
     * </p>
     *
     * @return <p>
     *         (Gateway endpoint) One or more route table IDs to disassociate
     *         from the endpoint.
     *         </p>
     */
    public java.util.List<String> getRemoveRouteTableIds() {
        return removeRouteTableIds;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs to disassociate from the
     * endpoint.
     * </p>
     *
     * @param removeRouteTableIds <p>
     *            (Gateway endpoint) One or more route table IDs to disassociate
     *            from the endpoint.
     *            </p>
     */
    public void setRemoveRouteTableIds(java.util.Collection<String> removeRouteTableIds) {
        if (removeRouteTableIds == null) {
            this.removeRouteTableIds = null;
            return;
        }

        this.removeRouteTableIds = new java.util.ArrayList<String>(removeRouteTableIds);
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs to disassociate from the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeRouteTableIds <p>
     *            (Gateway endpoint) One or more route table IDs to disassociate
     *            from the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withRemoveRouteTableIds(String... removeRouteTableIds) {
        if (getRemoveRouteTableIds() == null) {
            this.removeRouteTableIds = new java.util.ArrayList<String>(removeRouteTableIds.length);
        }
        for (String value : removeRouteTableIds) {
            this.removeRouteTableIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs to disassociate from the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeRouteTableIds <p>
     *            (Gateway endpoint) One or more route table IDs to disassociate
     *            from the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withRemoveRouteTableIds(
            java.util.Collection<String> removeRouteTableIds) {
        setRemoveRouteTableIds(removeRouteTableIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnet IDs in which to serve the
     * endpoint.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) One or more subnet IDs in which to serve the
     *         endpoint.
     *         </p>
     */
    public java.util.List<String> getAddSubnetIds() {
        return addSubnetIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnet IDs in which to serve the
     * endpoint.
     * </p>
     *
     * @param addSubnetIds <p>
     *            (Interface endpoint) One or more subnet IDs in which to serve
     *            the endpoint.
     *            </p>
     */
    public void setAddSubnetIds(java.util.Collection<String> addSubnetIds) {
        if (addSubnetIds == null) {
            this.addSubnetIds = null;
            return;
        }

        this.addSubnetIds = new java.util.ArrayList<String>(addSubnetIds);
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnet IDs in which to serve the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addSubnetIds <p>
     *            (Interface endpoint) One or more subnet IDs in which to serve
     *            the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withAddSubnetIds(String... addSubnetIds) {
        if (getAddSubnetIds() == null) {
            this.addSubnetIds = new java.util.ArrayList<String>(addSubnetIds.length);
        }
        for (String value : addSubnetIds) {
            this.addSubnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnet IDs in which to serve the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addSubnetIds <p>
     *            (Interface endpoint) One or more subnet IDs in which to serve
     *            the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withAddSubnetIds(java.util.Collection<String> addSubnetIds) {
        setAddSubnetIds(addSubnetIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets IDs in which to remove the
     * endpoint.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) One or more subnets IDs in which to remove
     *         the endpoint.
     *         </p>
     */
    public java.util.List<String> getRemoveSubnetIds() {
        return removeSubnetIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets IDs in which to remove the
     * endpoint.
     * </p>
     *
     * @param removeSubnetIds <p>
     *            (Interface endpoint) One or more subnets IDs in which to
     *            remove the endpoint.
     *            </p>
     */
    public void setRemoveSubnetIds(java.util.Collection<String> removeSubnetIds) {
        if (removeSubnetIds == null) {
            this.removeSubnetIds = null;
            return;
        }

        this.removeSubnetIds = new java.util.ArrayList<String>(removeSubnetIds);
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets IDs in which to remove the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeSubnetIds <p>
     *            (Interface endpoint) One or more subnets IDs in which to
     *            remove the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withRemoveSubnetIds(String... removeSubnetIds) {
        if (getRemoveSubnetIds() == null) {
            this.removeSubnetIds = new java.util.ArrayList<String>(removeSubnetIds.length);
        }
        for (String value : removeSubnetIds) {
            this.removeSubnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets IDs in which to remove the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeSubnetIds <p>
     *            (Interface endpoint) One or more subnets IDs in which to
     *            remove the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withRemoveSubnetIds(java.util.Collection<String> removeSubnetIds) {
        setRemoveSubnetIds(removeSubnetIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to associate with the
     * network interface.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) One or more security group IDs to associate
     *         with the network interface.
     *         </p>
     */
    public java.util.List<String> getAddSecurityGroupIds() {
        return addSecurityGroupIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to associate with the
     * network interface.
     * </p>
     *
     * @param addSecurityGroupIds <p>
     *            (Interface endpoint) One or more security group IDs to
     *            associate with the network interface.
     *            </p>
     */
    public void setAddSecurityGroupIds(java.util.Collection<String> addSecurityGroupIds) {
        if (addSecurityGroupIds == null) {
            this.addSecurityGroupIds = null;
            return;
        }

        this.addSecurityGroupIds = new java.util.ArrayList<String>(addSecurityGroupIds);
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to associate with the
     * network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addSecurityGroupIds <p>
     *            (Interface endpoint) One or more security group IDs to
     *            associate with the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withAddSecurityGroupIds(String... addSecurityGroupIds) {
        if (getAddSecurityGroupIds() == null) {
            this.addSecurityGroupIds = new java.util.ArrayList<String>(addSecurityGroupIds.length);
        }
        for (String value : addSecurityGroupIds) {
            this.addSecurityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to associate with the
     * network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addSecurityGroupIds <p>
     *            (Interface endpoint) One or more security group IDs to
     *            associate with the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withAddSecurityGroupIds(
            java.util.Collection<String> addSecurityGroupIds) {
        setAddSecurityGroupIds(addSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to disassociate from
     * the network interface.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) One or more security group IDs to
     *         disassociate from the network interface.
     *         </p>
     */
    public java.util.List<String> getRemoveSecurityGroupIds() {
        return removeSecurityGroupIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to disassociate from
     * the network interface.
     * </p>
     *
     * @param removeSecurityGroupIds <p>
     *            (Interface endpoint) One or more security group IDs to
     *            disassociate from the network interface.
     *            </p>
     */
    public void setRemoveSecurityGroupIds(java.util.Collection<String> removeSecurityGroupIds) {
        if (removeSecurityGroupIds == null) {
            this.removeSecurityGroupIds = null;
            return;
        }

        this.removeSecurityGroupIds = new java.util.ArrayList<String>(removeSecurityGroupIds);
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to disassociate from
     * the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeSecurityGroupIds <p>
     *            (Interface endpoint) One or more security group IDs to
     *            disassociate from the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withRemoveSecurityGroupIds(String... removeSecurityGroupIds) {
        if (getRemoveSecurityGroupIds() == null) {
            this.removeSecurityGroupIds = new java.util.ArrayList<String>(
                    removeSecurityGroupIds.length);
        }
        for (String value : removeSecurityGroupIds) {
            this.removeSecurityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to disassociate from
     * the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeSecurityGroupIds <p>
     *            (Interface endpoint) One or more security group IDs to
     *            disassociate from the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withRemoveSecurityGroupIds(
            java.util.Collection<String> removeSecurityGroupIds) {
        setRemoveSecurityGroupIds(removeSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether a private hosted zone is
     * associated with the VPC.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) Indicates whether a private hosted zone is
     *         associated with the VPC.
     *         </p>
     */
    public Boolean isPrivateDnsEnabled() {
        return privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether a private hosted zone is
     * associated with the VPC.
     * </p>
     *
     * @return <p>
     *         (Interface endpoint) Indicates whether a private hosted zone is
     *         associated with the VPC.
     *         </p>
     */
    public Boolean getPrivateDnsEnabled() {
        return privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether a private hosted zone is
     * associated with the VPC.
     * </p>
     *
     * @param privateDnsEnabled <p>
     *            (Interface endpoint) Indicates whether a private hosted zone
     *            is associated with the VPC.
     *            </p>
     */
    public void setPrivateDnsEnabled(Boolean privateDnsEnabled) {
        this.privateDnsEnabled = privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicates whether a private hosted zone is
     * associated with the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsEnabled <p>
     *            (Interface endpoint) Indicates whether a private hosted zone
     *            is associated with the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointRequest withPrivateDnsEnabled(Boolean privateDnsEnabled) {
        this.privateDnsEnabled = privateDnsEnabled;
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
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: " + getVpcEndpointId() + ",");
        if (getResetPolicy() != null)
            sb.append("ResetPolicy: " + getResetPolicy() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getAddRouteTableIds() != null)
            sb.append("AddRouteTableIds: " + getAddRouteTableIds() + ",");
        if (getRemoveRouteTableIds() != null)
            sb.append("RemoveRouteTableIds: " + getRemoveRouteTableIds() + ",");
        if (getAddSubnetIds() != null)
            sb.append("AddSubnetIds: " + getAddSubnetIds() + ",");
        if (getRemoveSubnetIds() != null)
            sb.append("RemoveSubnetIds: " + getRemoveSubnetIds() + ",");
        if (getAddSecurityGroupIds() != null)
            sb.append("AddSecurityGroupIds: " + getAddSecurityGroupIds() + ",");
        if (getRemoveSecurityGroupIds() != null)
            sb.append("RemoveSecurityGroupIds: " + getRemoveSecurityGroupIds() + ",");
        if (getPrivateDnsEnabled() != null)
            sb.append("PrivateDnsEnabled: " + getPrivateDnsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode
                + ((getResetPolicy() == null) ? 0 : getResetPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode
                + ((getAddRouteTableIds() == null) ? 0 : getAddRouteTableIds().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveRouteTableIds() == null) ? 0 : getRemoveRouteTableIds().hashCode());
        hashCode = prime * hashCode
                + ((getAddSubnetIds() == null) ? 0 : getAddSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveSubnetIds() == null) ? 0 : getRemoveSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getAddSecurityGroupIds() == null) ? 0 : getAddSecurityGroupIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoveSecurityGroupIds() == null) ? 0 : getRemoveSecurityGroupIds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPrivateDnsEnabled() == null) ? 0 : getPrivateDnsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcEndpointRequest == false)
            return false;
        ModifyVpcEndpointRequest other = (ModifyVpcEndpointRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null
                && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getResetPolicy() == null ^ this.getResetPolicy() == null)
            return false;
        if (other.getResetPolicy() != null
                && other.getResetPolicy().equals(this.getResetPolicy()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getAddRouteTableIds() == null ^ this.getAddRouteTableIds() == null)
            return false;
        if (other.getAddRouteTableIds() != null
                && other.getAddRouteTableIds().equals(this.getAddRouteTableIds()) == false)
            return false;
        if (other.getRemoveRouteTableIds() == null ^ this.getRemoveRouteTableIds() == null)
            return false;
        if (other.getRemoveRouteTableIds() != null
                && other.getRemoveRouteTableIds().equals(this.getRemoveRouteTableIds()) == false)
            return false;
        if (other.getAddSubnetIds() == null ^ this.getAddSubnetIds() == null)
            return false;
        if (other.getAddSubnetIds() != null
                && other.getAddSubnetIds().equals(this.getAddSubnetIds()) == false)
            return false;
        if (other.getRemoveSubnetIds() == null ^ this.getRemoveSubnetIds() == null)
            return false;
        if (other.getRemoveSubnetIds() != null
                && other.getRemoveSubnetIds().equals(this.getRemoveSubnetIds()) == false)
            return false;
        if (other.getAddSecurityGroupIds() == null ^ this.getAddSecurityGroupIds() == null)
            return false;
        if (other.getAddSecurityGroupIds() != null
                && other.getAddSecurityGroupIds().equals(this.getAddSecurityGroupIds()) == false)
            return false;
        if (other.getRemoveSecurityGroupIds() == null ^ this.getRemoveSecurityGroupIds() == null)
            return false;
        if (other.getRemoveSecurityGroupIds() != null
                && other.getRemoveSecurityGroupIds().equals(this.getRemoveSecurityGroupIds()) == false)
            return false;
        if (other.getPrivateDnsEnabled() == null ^ this.getPrivateDnsEnabled() == null)
            return false;
        if (other.getPrivateDnsEnabled() != null
                && other.getPrivateDnsEnabled().equals(this.getPrivateDnsEnabled()) == false)
            return false;
        return true;
    }
}
