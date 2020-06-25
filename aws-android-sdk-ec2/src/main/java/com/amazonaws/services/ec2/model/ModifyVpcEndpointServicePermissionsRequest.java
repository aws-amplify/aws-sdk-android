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
 * Modifies the permissions for your <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html">VPC
 * endpoint service</a>. You can add or remove permissions for service consumers
 * (IAM users, IAM roles, and AWS accounts) to connect to your endpoint service.
 * </p>
 * <p>
 * If you grant permissions to all principals, the service is public. Any users
 * who know the name of a public service can send a request to attach an
 * endpoint. If the service does not require manual approval, attachments are
 * automatically approved.
 * </p>
 */
public class ModifyVpcEndpointServicePermissionsRequest extends AmazonWebServiceRequest implements
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
     * The Amazon Resource Names (ARN) of one or more principals. Permissions
     * are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*).
     * </p>
     */
    private java.util.List<String> addAllowedPrincipals;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions
     * are revoked for principals in this list.
     * </p>
     */
    private java.util.List<String> removeAllowedPrincipals;

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
    public ModifyVpcEndpointServicePermissionsRequest withDryRun(Boolean dryRun) {
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
    public ModifyVpcEndpointServicePermissionsRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions
     * are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*).
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARN) of one or more principals.
     *         Permissions are granted to the principals in this list. To grant
     *         permissions to all principals, specify an asterisk (*).
     *         </p>
     */
    public java.util.List<String> getAddAllowedPrincipals() {
        return addAllowedPrincipals;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions
     * are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*).
     * </p>
     *
     * @param addAllowedPrincipals <p>
     *            The Amazon Resource Names (ARN) of one or more principals.
     *            Permissions are granted to the principals in this list. To
     *            grant permissions to all principals, specify an asterisk (*).
     *            </p>
     */
    public void setAddAllowedPrincipals(java.util.Collection<String> addAllowedPrincipals) {
        if (addAllowedPrincipals == null) {
            this.addAllowedPrincipals = null;
            return;
        }

        this.addAllowedPrincipals = new java.util.ArrayList<String>(addAllowedPrincipals);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions
     * are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addAllowedPrincipals <p>
     *            The Amazon Resource Names (ARN) of one or more principals.
     *            Permissions are granted to the principals in this list. To
     *            grant permissions to all principals, specify an asterisk (*).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServicePermissionsRequest withAddAllowedPrincipals(
            String... addAllowedPrincipals) {
        if (getAddAllowedPrincipals() == null) {
            this.addAllowedPrincipals = new java.util.ArrayList<String>(addAllowedPrincipals.length);
        }
        for (String value : addAllowedPrincipals) {
            this.addAllowedPrincipals.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions
     * are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addAllowedPrincipals <p>
     *            The Amazon Resource Names (ARN) of one or more principals.
     *            Permissions are granted to the principals in this list. To
     *            grant permissions to all principals, specify an asterisk (*).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServicePermissionsRequest withAddAllowedPrincipals(
            java.util.Collection<String> addAllowedPrincipals) {
        setAddAllowedPrincipals(addAllowedPrincipals);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions
     * are revoked for principals in this list.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARN) of one or more principals.
     *         Permissions are revoked for principals in this list.
     *         </p>
     */
    public java.util.List<String> getRemoveAllowedPrincipals() {
        return removeAllowedPrincipals;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions
     * are revoked for principals in this list.
     * </p>
     *
     * @param removeAllowedPrincipals <p>
     *            The Amazon Resource Names (ARN) of one or more principals.
     *            Permissions are revoked for principals in this list.
     *            </p>
     */
    public void setRemoveAllowedPrincipals(java.util.Collection<String> removeAllowedPrincipals) {
        if (removeAllowedPrincipals == null) {
            this.removeAllowedPrincipals = null;
            return;
        }

        this.removeAllowedPrincipals = new java.util.ArrayList<String>(removeAllowedPrincipals);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions
     * are revoked for principals in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeAllowedPrincipals <p>
     *            The Amazon Resource Names (ARN) of one or more principals.
     *            Permissions are revoked for principals in this list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServicePermissionsRequest withRemoveAllowedPrincipals(
            String... removeAllowedPrincipals) {
        if (getRemoveAllowedPrincipals() == null) {
            this.removeAllowedPrincipals = new java.util.ArrayList<String>(
                    removeAllowedPrincipals.length);
        }
        for (String value : removeAllowedPrincipals) {
            this.removeAllowedPrincipals.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of one or more principals. Permissions
     * are revoked for principals in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeAllowedPrincipals <p>
     *            The Amazon Resource Names (ARN) of one or more principals.
     *            Permissions are revoked for principals in this list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointServicePermissionsRequest withRemoveAllowedPrincipals(
            java.util.Collection<String> removeAllowedPrincipals) {
        setRemoveAllowedPrincipals(removeAllowedPrincipals);
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
        if (getAddAllowedPrincipals() != null)
            sb.append("AddAllowedPrincipals: " + getAddAllowedPrincipals() + ",");
        if (getRemoveAllowedPrincipals() != null)
            sb.append("RemoveAllowedPrincipals: " + getRemoveAllowedPrincipals());
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
                + ((getAddAllowedPrincipals() == null) ? 0 : getAddAllowedPrincipals().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoveAllowedPrincipals() == null) ? 0 : getRemoveAllowedPrincipals()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcEndpointServicePermissionsRequest == false)
            return false;
        ModifyVpcEndpointServicePermissionsRequest other = (ModifyVpcEndpointServicePermissionsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null
                && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getAddAllowedPrincipals() == null ^ this.getAddAllowedPrincipals() == null)
            return false;
        if (other.getAddAllowedPrincipals() != null
                && other.getAddAllowedPrincipals().equals(this.getAddAllowedPrincipals()) == false)
            return false;
        if (other.getRemoveAllowedPrincipals() == null ^ this.getRemoveAllowedPrincipals() == null)
            return false;
        if (other.getRemoveAllowedPrincipals() != null
                && other.getRemoveAllowedPrincipals().equals(this.getRemoveAllowedPrincipals()) == false)
            return false;
        return true;
    }
}
