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
 * Modifies the ID format for the specified resource on a per-Region basis. You
 * can specify that resources should receive longer IDs (17-character IDs) when
 * they are created.
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
 * This setting applies to the IAM user who makes the request; it does not apply
 * to the entire AWS account. By default, an IAM user defaults to the same
 * settings as the root user. If you're using this action as the root user, then
 * these settings apply to the entire account, unless an IAM user explicitly
 * overrides these settings for themselves. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html"
 * >Resource IDs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 * <p>
 * Resources created with longer IDs are visible to all IAM roles and users,
 * regardless of these settings and provided that they have permission to use
 * the relevant <code>Describe</code> command for the resource type.
 * </p>
 */
public class ModifyIdFormatRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Indicate whether the resource should use longer IDs (17-character IDs).
     * </p>
     */
    private Boolean useLongIds;

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
    public ModifyIdFormatRequest withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * <p>
     * Indicate whether the resource should use longer IDs (17-character IDs).
     * </p>
     *
     * @return <p>
     *         Indicate whether the resource should use longer IDs (17-character
     *         IDs).
     *         </p>
     */
    public Boolean isUseLongIds() {
        return useLongIds;
    }

    /**
     * <p>
     * Indicate whether the resource should use longer IDs (17-character IDs).
     * </p>
     *
     * @return <p>
     *         Indicate whether the resource should use longer IDs (17-character
     *         IDs).
     *         </p>
     */
    public Boolean getUseLongIds() {
        return useLongIds;
    }

    /**
     * <p>
     * Indicate whether the resource should use longer IDs (17-character IDs).
     * </p>
     *
     * @param useLongIds <p>
     *            Indicate whether the resource should use longer IDs
     *            (17-character IDs).
     *            </p>
     */
    public void setUseLongIds(Boolean useLongIds) {
        this.useLongIds = useLongIds;
    }

    /**
     * <p>
     * Indicate whether the resource should use longer IDs (17-character IDs).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useLongIds <p>
     *            Indicate whether the resource should use longer IDs
     *            (17-character IDs).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyIdFormatRequest withUseLongIds(Boolean useLongIds) {
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

        if (obj instanceof ModifyIdFormatRequest == false)
            return false;
        ModifyIdFormatRequest other = (ModifyIdFormatRequest) obj;

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
