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
 * The tags specification for the launch template.
 * </p>
 */
public class LaunchTemplateTagSpecificationRequest implements Serializable {
    /**
     * <p>
     * The type of resource to tag. Currently, the resource types that support
     * tagging on creation are <code>instance</code> and <code>volume</code>. To
     * tag a resource after it has been created, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     * >CreateTags</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>client-vpn-endpoint, customer-gateway,
     * dedicated-host, dhcp-options, elastic-ip, fleet, fpga-image,
     * host-reservation, image, instance, internet-gateway, key-pair,
     * launch-template, natgateway, network-acl, network-interface,
     * placement-group, reserved-instances, route-table, security-group,
     * snapshot, spot-fleet-request, spot-instances-request, subnet,
     * traffic-mirror-filter, traffic-mirror-session, traffic-mirror-target,
     * transit-gateway, transit-gateway-attachment,
     * transit-gateway-multicast-domain, transit-gateway-route-table, volume,
     * vpc, vpc-peering-connection, vpn-connection, vpn-gateway, vpc-flow-log
     */
    private String resourceType;

    /**
     * <p>
     * The tags to apply to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The type of resource to tag. Currently, the resource types that support
     * tagging on creation are <code>instance</code> and <code>volume</code>. To
     * tag a resource after it has been created, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     * >CreateTags</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>client-vpn-endpoint, customer-gateway,
     * dedicated-host, dhcp-options, elastic-ip, fleet, fpga-image,
     * host-reservation, image, instance, internet-gateway, key-pair,
     * launch-template, natgateway, network-acl, network-interface,
     * placement-group, reserved-instances, route-table, security-group,
     * snapshot, spot-fleet-request, spot-instances-request, subnet,
     * traffic-mirror-filter, traffic-mirror-session, traffic-mirror-target,
     * transit-gateway, transit-gateway-attachment,
     * transit-gateway-multicast-domain, transit-gateway-route-table, volume,
     * vpc, vpc-peering-connection, vpn-connection, vpn-gateway, vpc-flow-log
     *
     * @return <p>
     *         The type of resource to tag. Currently, the resource types that
     *         support tagging on creation are <code>instance</code> and
     *         <code>volume</code>. To tag a resource after it has been created,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     *         >CreateTags</a>.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource to tag. Currently, the resource types that support
     * tagging on creation are <code>instance</code> and <code>volume</code>. To
     * tag a resource after it has been created, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     * >CreateTags</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>client-vpn-endpoint, customer-gateway,
     * dedicated-host, dhcp-options, elastic-ip, fleet, fpga-image,
     * host-reservation, image, instance, internet-gateway, key-pair,
     * launch-template, natgateway, network-acl, network-interface,
     * placement-group, reserved-instances, route-table, security-group,
     * snapshot, spot-fleet-request, spot-instances-request, subnet,
     * traffic-mirror-filter, traffic-mirror-session, traffic-mirror-target,
     * transit-gateway, transit-gateway-attachment,
     * transit-gateway-multicast-domain, transit-gateway-route-table, volume,
     * vpc, vpc-peering-connection, vpn-connection, vpn-gateway, vpc-flow-log
     *
     * @param resourceType <p>
     *            The type of resource to tag. Currently, the resource types
     *            that support tagging on creation are <code>instance</code> and
     *            <code>volume</code>. To tag a resource after it has been
     *            created, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     *            >CreateTags</a>.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to tag. Currently, the resource types that support
     * tagging on creation are <code>instance</code> and <code>volume</code>. To
     * tag a resource after it has been created, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     * >CreateTags</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>client-vpn-endpoint, customer-gateway,
     * dedicated-host, dhcp-options, elastic-ip, fleet, fpga-image,
     * host-reservation, image, instance, internet-gateway, key-pair,
     * launch-template, natgateway, network-acl, network-interface,
     * placement-group, reserved-instances, route-table, security-group,
     * snapshot, spot-fleet-request, spot-instances-request, subnet,
     * traffic-mirror-filter, traffic-mirror-session, traffic-mirror-target,
     * transit-gateway, transit-gateway-attachment,
     * transit-gateway-multicast-domain, transit-gateway-route-table, volume,
     * vpc, vpc-peering-connection, vpn-connection, vpn-gateway, vpc-flow-log
     *
     * @param resourceType <p>
     *            The type of resource to tag. Currently, the resource types
     *            that support tagging on creation are <code>instance</code> and
     *            <code>volume</code>. To tag a resource after it has been
     *            created, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     *            >CreateTags</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public LaunchTemplateTagSpecificationRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource to tag. Currently, the resource types that support
     * tagging on creation are <code>instance</code> and <code>volume</code>. To
     * tag a resource after it has been created, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     * >CreateTags</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>client-vpn-endpoint, customer-gateway,
     * dedicated-host, dhcp-options, elastic-ip, fleet, fpga-image,
     * host-reservation, image, instance, internet-gateway, key-pair,
     * launch-template, natgateway, network-acl, network-interface,
     * placement-group, reserved-instances, route-table, security-group,
     * snapshot, spot-fleet-request, spot-instances-request, subnet,
     * traffic-mirror-filter, traffic-mirror-session, traffic-mirror-target,
     * transit-gateway, transit-gateway-attachment,
     * transit-gateway-multicast-domain, transit-gateway-route-table, volume,
     * vpc, vpc-peering-connection, vpn-connection, vpn-gateway, vpc-flow-log
     *
     * @param resourceType <p>
     *            The type of resource to tag. Currently, the resource types
     *            that support tagging on creation are <code>instance</code> and
     *            <code>volume</code>. To tag a resource after it has been
     *            created, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     *            >CreateTags</a>.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource to tag. Currently, the resource types that support
     * tagging on creation are <code>instance</code> and <code>volume</code>. To
     * tag a resource after it has been created, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     * >CreateTags</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>client-vpn-endpoint, customer-gateway,
     * dedicated-host, dhcp-options, elastic-ip, fleet, fpga-image,
     * host-reservation, image, instance, internet-gateway, key-pair,
     * launch-template, natgateway, network-acl, network-interface,
     * placement-group, reserved-instances, route-table, security-group,
     * snapshot, spot-fleet-request, spot-instances-request, subnet,
     * traffic-mirror-filter, traffic-mirror-session, traffic-mirror-target,
     * transit-gateway, transit-gateway-attachment,
     * transit-gateway-multicast-domain, transit-gateway-route-table, volume,
     * vpc, vpc-peering-connection, vpn-connection, vpn-gateway, vpc-flow-log
     *
     * @param resourceType <p>
     *            The type of resource to tag. Currently, the resource types
     *            that support tagging on creation are <code>instance</code> and
     *            <code>volume</code>. To tag a resource after it has been
     *            created, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html"
     *            >CreateTags</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public LaunchTemplateTagSpecificationRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tags to apply to the resource.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the resource.
     * </p>
     *
     * @param tags <p>
     *            The tags to apply to the resource.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to apply to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to apply to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateTagSpecificationRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to apply to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateTagSpecificationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateTagSpecificationRequest == false)
            return false;
        LaunchTemplateTagSpecificationRequest other = (LaunchTemplateTagSpecificationRequest) obj;

        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
