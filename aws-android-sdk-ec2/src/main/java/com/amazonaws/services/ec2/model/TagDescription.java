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
 * Describes a tag.
 * </p>
 */
public class TagDescription implements Serializable {
    /**
     * <p>
     * The tag key.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The resource type.
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
     * The tag value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The tag key.
     * </p>
     *
     * @return <p>
     *         The tag key.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The tag key.
     * </p>
     *
     * @param key <p>
     *            The tag key.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The tag key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The tag key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagDescription withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     *
     * @return <p>
     *         The ID of the resource.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     *
     * @param resourceId <p>
     *            The ID of the resource.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            The ID of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagDescription withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The resource type.
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
     *         The resource type.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type.
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
     *            The resource type.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
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
     *            The resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public TagDescription withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The resource type.
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
     *            The resource type.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The resource type.
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
     *            The resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public TagDescription withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tag value.
     * </p>
     *
     * @return <p>
     *         The tag value.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The tag value.
     * </p>
     *
     * @param value <p>
     *            The tag value.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The tag value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The tag value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagDescription withValue(String value) {
        this.value = value;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagDescription == false)
            return false;
        TagDescription other = (TagDescription) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
