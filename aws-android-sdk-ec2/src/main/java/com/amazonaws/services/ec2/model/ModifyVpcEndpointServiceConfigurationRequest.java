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
 * Modifies the attributes of your VPC endpoint service configuration. You can
 * change the Network Load Balancers for your service, and you can specify
 * whether acceptance is required for requests to connect to your endpoint
 * service through an interface VPC endpoint.
 * </p>
 * <p>
 * If you set or modify the private DNS name, you must prove that you own the
 * private DNS domain name. For more information, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html"
 * >VPC Endpoint Service Private DNS Name Verification</a> in the <i>Amazon
 * Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class ModifyVpcEndpointServiceConfigurationRequest extends AmazonWebServiceRequest implements
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
     * The ID of the service.
     * </p>
     */
    private String serviceId;

    /**
     * <p>
     * The private DNS name to assign to the endpoint service.
     * </p>
     */
    private String privateDnsName;

    /**
     * <p>
     * Removes the private DNS name of the endpoint service.
     * </p>
     */
    private Boolean removePrivateDnsName;

    /**
     * <p>
     * Indicates whether requests to create an endpoint to your service must be
     * accepted.
     * </p>
     */
    private Boolean acceptanceRequired;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your
     * service configuration.
     * </p>
     */
    private java.util.List<String> addNetworkLoadBalancerArns;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from
     * your service configuration.
     * </p>
     */
    private java.util.List<String> removeNetworkLoadBalancerArns;

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
    public ModifyVpcEndpointServiceConfigurationRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     *
     * @return <p>
     *         The ID of the service.
     *         </p>
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     *
     * @param serviceId <p>
     *            The ID of the service.
     *            </p>
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceId <p>
     *            The ID of the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServiceConfigurationRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * <p>
     * The private DNS name to assign to the endpoint service.
     * </p>
     *
     * @return <p>
     *         The private DNS name to assign to the endpoint service.
     *         </p>
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /**
     * <p>
     * The private DNS name to assign to the endpoint service.
     * </p>
     *
     * @param privateDnsName <p>
     *            The private DNS name to assign to the endpoint service.
     *            </p>
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name to assign to the endpoint service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsName <p>
     *            The private DNS name to assign to the endpoint service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServiceConfigurationRequest withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * <p>
     * Removes the private DNS name of the endpoint service.
     * </p>
     *
     * @return <p>
     *         Removes the private DNS name of the endpoint service.
     *         </p>
     */
    public Boolean isRemovePrivateDnsName() {
        return removePrivateDnsName;
    }

    /**
     * <p>
     * Removes the private DNS name of the endpoint service.
     * </p>
     *
     * @return <p>
     *         Removes the private DNS name of the endpoint service.
     *         </p>
     */
    public Boolean getRemovePrivateDnsName() {
        return removePrivateDnsName;
    }

    /**
     * <p>
     * Removes the private DNS name of the endpoint service.
     * </p>
     *
     * @param removePrivateDnsName <p>
     *            Removes the private DNS name of the endpoint service.
     *            </p>
     */
    public void setRemovePrivateDnsName(Boolean removePrivateDnsName) {
        this.removePrivateDnsName = removePrivateDnsName;
    }

    /**
     * <p>
     * Removes the private DNS name of the endpoint service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removePrivateDnsName <p>
     *            Removes the private DNS name of the endpoint service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServiceConfigurationRequest withRemovePrivateDnsName(
            Boolean removePrivateDnsName) {
        this.removePrivateDnsName = removePrivateDnsName;
        return this;
    }

    /**
     * <p>
     * Indicates whether requests to create an endpoint to your service must be
     * accepted.
     * </p>
     *
     * @return <p>
     *         Indicates whether requests to create an endpoint to your service
     *         must be accepted.
     *         </p>
     */
    public Boolean isAcceptanceRequired() {
        return acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether requests to create an endpoint to your service must be
     * accepted.
     * </p>
     *
     * @return <p>
     *         Indicates whether requests to create an endpoint to your service
     *         must be accepted.
     *         </p>
     */
    public Boolean getAcceptanceRequired() {
        return acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether requests to create an endpoint to your service must be
     * accepted.
     * </p>
     *
     * @param acceptanceRequired <p>
     *            Indicates whether requests to create an endpoint to your
     *            service must be accepted.
     *            </p>
     */
    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether requests to create an endpoint to your service must be
     * accepted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceptanceRequired <p>
     *            Indicates whether requests to create an endpoint to your
     *            service must be accepted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServiceConfigurationRequest withAcceptanceRequired(
            Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your
     * service configuration.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARNs) of Network Load Balancers to add
     *         to your service configuration.
     *         </p>
     */
    public java.util.List<String> getAddNetworkLoadBalancerArns() {
        return addNetworkLoadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your
     * service configuration.
     * </p>
     *
     * @param addNetworkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of Network Load Balancers to
     *            add to your service configuration.
     *            </p>
     */
    public void setAddNetworkLoadBalancerArns(
            java.util.Collection<String> addNetworkLoadBalancerArns) {
        if (addNetworkLoadBalancerArns == null) {
            this.addNetworkLoadBalancerArns = null;
            return;
        }

        this.addNetworkLoadBalancerArns = new java.util.ArrayList<String>(
                addNetworkLoadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your
     * service configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addNetworkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of Network Load Balancers to
     *            add to your service configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServiceConfigurationRequest withAddNetworkLoadBalancerArns(
            String... addNetworkLoadBalancerArns) {
        if (getAddNetworkLoadBalancerArns() == null) {
            this.addNetworkLoadBalancerArns = new java.util.ArrayList<String>(
                    addNetworkLoadBalancerArns.length);
        }
        for (String value : addNetworkLoadBalancerArns) {
            this.addNetworkLoadBalancerArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your
     * service configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addNetworkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of Network Load Balancers to
     *            add to your service configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServiceConfigurationRequest withAddNetworkLoadBalancerArns(
            java.util.Collection<String> addNetworkLoadBalancerArns) {
        setAddNetworkLoadBalancerArns(addNetworkLoadBalancerArns);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from
     * your service configuration.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARNs) of Network Load Balancers to
     *         remove from your service configuration.
     *         </p>
     */
    public java.util.List<String> getRemoveNetworkLoadBalancerArns() {
        return removeNetworkLoadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from
     * your service configuration.
     * </p>
     *
     * @param removeNetworkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of Network Load Balancers to
     *            remove from your service configuration.
     *            </p>
     */
    public void setRemoveNetworkLoadBalancerArns(
            java.util.Collection<String> removeNetworkLoadBalancerArns) {
        if (removeNetworkLoadBalancerArns == null) {
            this.removeNetworkLoadBalancerArns = null;
            return;
        }

        this.removeNetworkLoadBalancerArns = new java.util.ArrayList<String>(
                removeNetworkLoadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from
     * your service configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeNetworkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of Network Load Balancers to
     *            remove from your service configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServiceConfigurationRequest withRemoveNetworkLoadBalancerArns(
            String... removeNetworkLoadBalancerArns) {
        if (getRemoveNetworkLoadBalancerArns() == null) {
            this.removeNetworkLoadBalancerArns = new java.util.ArrayList<String>(
                    removeNetworkLoadBalancerArns.length);
        }
        for (String value : removeNetworkLoadBalancerArns) {
            this.removeNetworkLoadBalancerArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from
     * your service configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeNetworkLoadBalancerArns <p>
     *            The Amazon Resource Names (ARNs) of Network Load Balancers to
     *            remove from your service configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServiceConfigurationRequest withRemoveNetworkLoadBalancerArns(
            java.util.Collection<String> removeNetworkLoadBalancerArns) {
        setRemoveNetworkLoadBalancerArns(removeNetworkLoadBalancerArns);
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
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getRemovePrivateDnsName() != null)
            sb.append("RemovePrivateDnsName: " + getRemovePrivateDnsName() + ",");
        if (getAcceptanceRequired() != null)
            sb.append("AcceptanceRequired: " + getAcceptanceRequired() + ",");
        if (getAddNetworkLoadBalancerArns() != null)
            sb.append("AddNetworkLoadBalancerArns: " + getAddNetworkLoadBalancerArns() + ",");
        if (getRemoveNetworkLoadBalancerArns() != null)
            sb.append("RemoveNetworkLoadBalancerArns: " + getRemoveNetworkLoadBalancerArns());
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
                + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getRemovePrivateDnsName() == null) ? 0 : getRemovePrivateDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getAcceptanceRequired() == null) ? 0 : getAcceptanceRequired().hashCode());
        hashCode = prime
                * hashCode
                + ((getAddNetworkLoadBalancerArns() == null) ? 0 : getAddNetworkLoadBalancerArns()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoveNetworkLoadBalancerArns() == null) ? 0
                        : getRemoveNetworkLoadBalancerArns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcEndpointServiceConfigurationRequest == false)
            return false;
        ModifyVpcEndpointServiceConfigurationRequest other = (ModifyVpcEndpointServiceConfigurationRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null
                && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null
                && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getRemovePrivateDnsName() == null ^ this.getRemovePrivateDnsName() == null)
            return false;
        if (other.getRemovePrivateDnsName() != null
                && other.getRemovePrivateDnsName().equals(this.getRemovePrivateDnsName()) == false)
            return false;
        if (other.getAcceptanceRequired() == null ^ this.getAcceptanceRequired() == null)
            return false;
        if (other.getAcceptanceRequired() != null
                && other.getAcceptanceRequired().equals(this.getAcceptanceRequired()) == false)
            return false;
        if (other.getAddNetworkLoadBalancerArns() == null
                ^ this.getAddNetworkLoadBalancerArns() == null)
            return false;
        if (other.getAddNetworkLoadBalancerArns() != null
                && other.getAddNetworkLoadBalancerArns().equals(
                        this.getAddNetworkLoadBalancerArns()) == false)
            return false;
        if (other.getRemoveNetworkLoadBalancerArns() == null
                ^ this.getRemoveNetworkLoadBalancerArns() == null)
            return false;
        if (other.getRemoveNetworkLoadBalancerArns() != null
                && other.getRemoveNetworkLoadBalancerArns().equals(
                        this.getRemoveNetworkLoadBalancerArns()) == false)
            return false;
        return true;
    }
}
