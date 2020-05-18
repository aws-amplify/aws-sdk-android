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
 * Modifies the ID format of a resource for a specified IAM user, IAM role, or
 * the root user for an account; or all IAM users, IAM roles, and the root user
 * for an account. You can specify that resources should receive longer IDs
 * (17-character IDs) when they are created.
 * </p>
 * <p>
 * This request can only be used to modify longer ID settings for resource types
 * that are within the opt-in period. Resources currently in their opt-in period
 * include: <code>bundle</code> | <code>conversion-task</code> |
 * <code>customer-gateway</code> | <code>dhcp-options</code> |
 * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
 * <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
 * <code>import-task</code> | <code>internet-gateway</code> |
 * <code>network-acl</code> | <code>network-acl-association</code> |
 * <code>network-interface</code> | <code>network-interface-attachment</code> |
 * <code>prefix-list</code> | <code>route-table</code> |
 * <code>route-table-association</code> | <code>security-group</code> |
 * <code>subnet</code> | <code>subnet-cidr-block-association</code> |
 * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
 * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
 * <code>vpn-connection</code> | <code>vpn-gateway</code>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html"
 * >Resource IDs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 * <p>
 * This setting applies to the principal specified in the request; it does not
 * apply to the principal that makes the request.
 * </p>
 * <p>
 * Resources created with longer IDs are visible to all IAM roles and users,
 * regardless of these settings and provided that they have permission to use
 * the relevant <code>Describe</code> command for the resource type.
 * </p>
 */
public class ModifyIdentityIdFormatRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. Specify <code>all</code> to modify the ID format for all IAM users,
     * IAM roles, and the root user of the account.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>internet-gateway</code> |
     * <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>route-table</code> | <code>route-table-association</code> |
     * <code>security-group</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> |
     * <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     * <code>vpn-gateway</code>.
     * </p>
     * <p>
     * Alternatively, use the <code>all-current</code> option to include all
     * resource types that are currently within their opt-in period for longer
     * IDs.
     * </p>
     */
    private String resource;

    /**
     * <p>
     * Indicates whether the resource should use longer IDs (17-character IDs)
     * </p>
     */
    private Boolean useLongIds;

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. Specify <code>all</code> to modify the ID format for all IAM users,
     * IAM roles, and the root user of the account.
     * </p>
     *
     * @return <p>
     *         The ARN of the principal, which can be an IAM user, IAM role, or
     *         the root user. Specify <code>all</code> to modify the ID format
     *         for all IAM users, IAM roles, and the root user of the account.
     *         </p>
     */
    public String getPrincipalArn() {
        return principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. Specify <code>all</code> to modify the ID format for all IAM users,
     * IAM roles, and the root user of the account.
     * </p>
     *
     * @param principalArn <p>
     *            The ARN of the principal, which can be an IAM user, IAM role,
     *            or the root user. Specify <code>all</code> to modify the ID
     *            format for all IAM users, IAM roles, and the root user of the
     *            account.
     *            </p>
     */
    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. Specify <code>all</code> to modify the ID format for all IAM users,
     * IAM roles, and the root user of the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principalArn <p>
     *            The ARN of the principal, which can be an IAM user, IAM role,
     *            or the root user. Specify <code>all</code> to modify the ID
     *            format for all IAM users, IAM roles, and the root user of the
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyIdentityIdFormatRequest withPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
        return this;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>internet-gateway</code> |
     * <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>route-table</code> | <code>route-table-association</code> |
     * <code>security-group</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> |
     * <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     * <code>vpn-gateway</code>.
     * </p>
     * <p>
     * Alternatively, use the <code>all-current</code> option to include all
     * resource types that are currently within their opt-in period for longer
     * IDs.
     * </p>
     *
     * @return <p>
     *         The type of resource: <code>bundle</code> |
     *         <code>conversion-task</code> | <code>customer-gateway</code> |
     *         <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     *         <code>elastic-ip-association</code> | <code>export-task</code> |
     *         <code>flow-log</code> | <code>image</code> |
     *         <code>import-task</code> | <code>internet-gateway</code> |
     *         <code>network-acl</code> | <code>network-acl-association</code> |
     *         <code>network-interface</code> |
     *         <code>network-interface-attachment</code> |
     *         <code>prefix-list</code> | <code>route-table</code> |
     *         <code>route-table-association</code> |
     *         <code>security-group</code> | <code>subnet</code> |
     *         <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     *         <code>vpc-cidr-block-association</code> |
     *         <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     *         <code>vpn-connection</code> | <code>vpn-gateway</code>.
     *         </p>
     *         <p>
     *         Alternatively, use the <code>all-current</code> option to include
     *         all resource types that are currently within their opt-in period
     *         for longer IDs.
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
     * <code>import-task</code> | <code>internet-gateway</code> |
     * <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>route-table</code> | <code>route-table-association</code> |
     * <code>security-group</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> |
     * <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     * <code>vpn-gateway</code>.
     * </p>
     * <p>
     * Alternatively, use the <code>all-current</code> option to include all
     * resource types that are currently within their opt-in period for longer
     * IDs.
     * </p>
     *
     * @param resource <p>
     *            The type of resource: <code>bundle</code> |
     *            <code>conversion-task</code> | <code>customer-gateway</code> |
     *            <code>dhcp-options</code> | <code>elastic-ip-allocation</code>
     *            | <code>elastic-ip-association</code> |
     *            <code>export-task</code> | <code>flow-log</code> |
     *            <code>image</code> | <code>import-task</code> |
     *            <code>internet-gateway</code> | <code>network-acl</code> |
     *            <code>network-acl-association</code> |
     *            <code>network-interface</code> |
     *            <code>network-interface-attachment</code> |
     *            <code>prefix-list</code> | <code>route-table</code> |
     *            <code>route-table-association</code> |
     *            <code>security-group</code> | <code>subnet</code> |
     *            <code>subnet-cidr-block-association</code> | <code>vpc</code>
     *            | <code>vpc-cidr-block-association</code> |
     *            <code>vpc-endpoint</code> |
     *            <code>vpc-peering-connection</code> |
     *            <code>vpn-connection</code> | <code>vpn-gateway</code>.
     *            </p>
     *            <p>
     *            Alternatively, use the <code>all-current</code> option to
     *            include all resource types that are currently within their
     *            opt-in period for longer IDs.
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
     * <code>import-task</code> | <code>internet-gateway</code> |
     * <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>route-table</code> | <code>route-table-association</code> |
     * <code>security-group</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> |
     * <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     * <code>vpn-gateway</code>.
     * </p>
     * <p>
     * Alternatively, use the <code>all-current</code> option to include all
     * resource types that are currently within their opt-in period for longer
     * IDs.
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
     *            <code>internet-gateway</code> | <code>network-acl</code> |
     *            <code>network-acl-association</code> |
     *            <code>network-interface</code> |
     *            <code>network-interface-attachment</code> |
     *            <code>prefix-list</code> | <code>route-table</code> |
     *            <code>route-table-association</code> |
     *            <code>security-group</code> | <code>subnet</code> |
     *            <code>subnet-cidr-block-association</code> | <code>vpc</code>
     *            | <code>vpc-cidr-block-association</code> |
     *            <code>vpc-endpoint</code> |
     *            <code>vpc-peering-connection</code> |
     *            <code>vpn-connection</code> | <code>vpn-gateway</code>.
     *            </p>
     *            <p>
     *            Alternatively, use the <code>all-current</code> option to
     *            include all resource types that are currently within their
     *            opt-in period for longer IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyIdentityIdFormatRequest withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * <p>
     * Indicates whether the resource should use longer IDs (17-character IDs)
     * </p>
     *
     * @return <p>
     *         Indicates whether the resource should use longer IDs
     *         (17-character IDs)
     *         </p>
     */
    public Boolean isUseLongIds() {
        return useLongIds;
    }

    /**
     * <p>
     * Indicates whether the resource should use longer IDs (17-character IDs)
     * </p>
     *
     * @return <p>
     *         Indicates whether the resource should use longer IDs
     *         (17-character IDs)
     *         </p>
     */
    public Boolean getUseLongIds() {
        return useLongIds;
    }

    /**
     * <p>
     * Indicates whether the resource should use longer IDs (17-character IDs)
     * </p>
     *
     * @param useLongIds <p>
     *            Indicates whether the resource should use longer IDs
     *            (17-character IDs)
     *            </p>
     */
    public void setUseLongIds(Boolean useLongIds) {
        this.useLongIds = useLongIds;
    }

    /**
     * <p>
     * Indicates whether the resource should use longer IDs (17-character IDs)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useLongIds <p>
     *            Indicates whether the resource should use longer IDs
     *            (17-character IDs)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyIdentityIdFormatRequest withUseLongIds(Boolean useLongIds) {
        this.useLongIds = useLongIds;
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
            sb.append("Resource: " + getResource() + ",");
        if (getUseLongIds() != null)
            sb.append("UseLongIds: " + getUseLongIds());
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
        hashCode = prime * hashCode + ((getUseLongIds() == null) ? 0 : getUseLongIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyIdentityIdFormatRequest == false)
            return false;
        ModifyIdentityIdFormatRequest other = (ModifyIdentityIdFormatRequest) obj;

        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null
                && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getUseLongIds() == null ^ this.getUseLongIds() == null)
            return false;
        if (other.getUseLongIds() != null
                && other.getUseLongIds().equals(this.getUseLongIds()) == false)
            return false;
        return true;
    }
}
