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
 * Describes the ID format settings for resources for the specified IAM user,
 * IAM role, or root user. For example, you can view the resource types that are
 * enabled for longer IDs. This request only returns information about resource
 * types whose ID formats can be modified; it does not return information about
 * other resource types. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html"
 * >Resource IDs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 * <p>
 * The following resource types support longer IDs: <code>bundle</code> |
 * <code>conversion-task</code> | <code>customer-gateway</code> |
 * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
 * <code>elastic-ip-association</code> | <code>export-task</code> |
 * <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
 * <code>instance</code> | <code>internet-gateway</code> |
 * <code>network-acl</code> | <code>network-acl-association</code> |
 * <code>network-interface</code> | <code>network-interface-attachment</code> |
 * <code>prefix-list</code> | <code>reservation</code> |
 * <code>route-table</code> | <code>route-table-association</code> |
 * <code>security-group</code> | <code>snapshot</code> | <code>subnet</code> |
 * <code>subnet-cidr-block-association</code> | <code>volume</code> |
 * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
 * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
 * <code>vpn-connection</code> | <code>vpn-gateway</code>.
 * </p>
 * <p>
 * These settings apply to the principal specified in the request. They do not
 * apply to the principal that makes the request.
 * </p>
 */
public class DescribeIdentityIdFormatRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the principal, which can be an IAM role, IAM user, or the root
     * user.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     */
    private String resource;

    /**
     * <p>
     * The ARN of the principal, which can be an IAM role, IAM user, or the root
     * user.
     * </p>
     *
     * @return <p>
     *         The ARN of the principal, which can be an IAM role, IAM user, or
     *         the root user.
     *         </p>
     */
    public String getPrincipalArn() {
        return principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM role, IAM user, or the root
     * user.
     * </p>
     *
     * @param principalArn <p>
     *            The ARN of the principal, which can be an IAM role, IAM user,
     *            or the root user.
     *            </p>
     */
    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM role, IAM user, or the root
     * user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principalArn <p>
     *            The ARN of the principal, which can be an IAM role, IAM user,
     *            or the root user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIdentityIdFormatRequest withPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
        return this;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     *
     * @return <p>
     *         The type of resource: <code>bundle</code> |
     *         <code>conversion-task</code> | <code>customer-gateway</code> |
     *         <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     *         <code>elastic-ip-association</code> | <code>export-task</code> |
     *         <code>flow-log</code> | <code>image</code> |
     *         <code>import-task</code> | <code>instance</code> |
     *         <code>internet-gateway</code> | <code>network-acl</code> |
     *         <code>network-acl-association</code> |
     *         <code>network-interface</code> |
     *         <code>network-interface-attachment</code> |
     *         <code>prefix-list</code> | <code>reservation</code> |
     *         <code>route-table</code> | <code>route-table-association</code> |
     *         <code>security-group</code> | <code>snapshot</code> |
     *         <code>subnet</code> | <code>subnet-cidr-block-association</code>
     *         | <code>volume</code> | <code>vpc</code> |
     *         <code>vpc-cidr-block-association</code> |
     *         <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     *         <code>vpn-connection</code> | <code>vpn-gateway</code>
     *         </p>
     */
    public String getResource() {
        return resource;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     *
     * @param resource <p>
     *            The type of resource: <code>bundle</code> |
     *            <code>conversion-task</code> | <code>customer-gateway</code> |
     *            <code>dhcp-options</code> | <code>elastic-ip-allocation</code>
     *            | <code>elastic-ip-association</code> |
     *            <code>export-task</code> | <code>flow-log</code> |
     *            <code>image</code> | <code>import-task</code> |
     *            <code>instance</code> | <code>internet-gateway</code> |
     *            <code>network-acl</code> |
     *            <code>network-acl-association</code> |
     *            <code>network-interface</code> |
     *            <code>network-interface-attachment</code> |
     *            <code>prefix-list</code> | <code>reservation</code> |
     *            <code>route-table</code> |
     *            <code>route-table-association</code> |
     *            <code>security-group</code> | <code>snapshot</code> |
     *            <code>subnet</code> |
     *            <code>subnet-cidr-block-association</code> |
     *            <code>volume</code> | <code>vpc</code> |
     *            <code>vpc-cidr-block-association</code> |
     *            <code>vpc-endpoint</code> |
     *            <code>vpc-peering-connection</code> |
     *            <code>vpn-connection</code> | <code>vpn-gateway</code>
     *            </p>
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resource <p>
     *            The type of resource: <code>bundle</code> |
     *            <code>conversion-task</code> | <code>customer-gateway</code> |
     *            <code>dhcp-options</code> | <code>elastic-ip-allocation</code>
     *            | <code>elastic-ip-association</code> |
     *            <code>export-task</code> | <code>flow-log</code> |
     *            <code>image</code> | <code>import-task</code> |
     *            <code>instance</code> | <code>internet-gateway</code> |
     *            <code>network-acl</code> |
     *            <code>network-acl-association</code> |
     *            <code>network-interface</code> |
     *            <code>network-interface-attachment</code> |
     *            <code>prefix-list</code> | <code>reservation</code> |
     *            <code>route-table</code> |
     *            <code>route-table-association</code> |
     *            <code>security-group</code> | <code>snapshot</code> |
     *            <code>subnet</code> |
     *            <code>subnet-cidr-block-association</code> |
     *            <code>volume</code> | <code>vpc</code> |
     *            <code>vpc-cidr-block-association</code> |
     *            <code>vpc-endpoint</code> |
     *            <code>vpc-peering-connection</code> |
     *            <code>vpn-connection</code> | <code>vpn-gateway</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIdentityIdFormatRequest withResource(String resource) {
        this.resource = resource;
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
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: " + getPrincipalArn() + ",");
        if (getResource() != null)
            sb.append("Resource: " + getResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIdentityIdFormatRequest == false)
            return false;
        DescribeIdentityIdFormatRequest other = (DescribeIdentityIdFormatRequest) obj;

        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null
                && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        return true;
    }
}
