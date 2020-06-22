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

import java.util.HashMap;
import java.util.Map;

/**
 * Resource Type
 */
public enum ResourceType {

    ClientVpnEndpoint("client-vpn-endpoint"),
    CustomerGateway("customer-gateway"),
    DedicatedHost("dedicated-host"),
    DhcpOptions("dhcp-options"),
    ElasticIp("elastic-ip"),
    ElasticGpu("elastic-gpu"),
    ExportImageTask("export-image-task"),
    ExportInstanceTask("export-instance-task"),
    Fleet("fleet"),
    FpgaImage("fpga-image"),
    HostReservation("host-reservation"),
    Image("image"),
    ImportImageTask("import-image-task"),
    ImportSnapshotTask("import-snapshot-task"),
    Instance("instance"),
    InternetGateway("internet-gateway"),
    KeyPair("key-pair"),
    LaunchTemplate("launch-template"),
    LocalGatewayRouteTableVpcAssociation("local-gateway-route-table-vpc-association"),
    Natgateway("natgateway"),
    NetworkAcl("network-acl"),
    NetworkInterface("network-interface"),
    PlacementGroup("placement-group"),
    ReservedInstances("reserved-instances"),
    RouteTable("route-table"),
    SecurityGroup("security-group"),
    Snapshot("snapshot"),
    SpotFleetRequest("spot-fleet-request"),
    SpotInstancesRequest("spot-instances-request"),
    Subnet("subnet"),
    TrafficMirrorFilter("traffic-mirror-filter"),
    TrafficMirrorSession("traffic-mirror-session"),
    TrafficMirrorTarget("traffic-mirror-target"),
    TransitGateway("transit-gateway"),
    TransitGatewayAttachment("transit-gateway-attachment"),
    TransitGatewayMulticastDomain("transit-gateway-multicast-domain"),
    TransitGatewayRouteTable("transit-gateway-route-table"),
    Volume("volume"),
    Vpc("vpc"),
    VpcPeeringConnection("vpc-peering-connection"),
    VpnConnection("vpn-connection"),
    VpnGateway("vpn-gateway"),
    VpcFlowLog("vpc-flow-log");

    private String value;

    private ResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ResourceType> enumMap;
    static {
        enumMap = new HashMap<String, ResourceType>();
        enumMap.put("client-vpn-endpoint", ClientVpnEndpoint);
        enumMap.put("customer-gateway", CustomerGateway);
        enumMap.put("dedicated-host", DedicatedHost);
        enumMap.put("dhcp-options", DhcpOptions);
        enumMap.put("elastic-ip", ElasticIp);
        enumMap.put("elastic-gpu", ElasticGpu);
        enumMap.put("export-image-task", ExportImageTask);
        enumMap.put("export-instance-task", ExportInstanceTask);
        enumMap.put("fleet", Fleet);
        enumMap.put("fpga-image", FpgaImage);
        enumMap.put("host-reservation", HostReservation);
        enumMap.put("image", Image);
        enumMap.put("import-image-task", ImportImageTask);
        enumMap.put("import-snapshot-task", ImportSnapshotTask);
        enumMap.put("instance", Instance);
        enumMap.put("internet-gateway", InternetGateway);
        enumMap.put("key-pair", KeyPair);
        enumMap.put("launch-template", LaunchTemplate);
        enumMap.put("local-gateway-route-table-vpc-association",
                LocalGatewayRouteTableVpcAssociation);
        enumMap.put("natgateway", Natgateway);
        enumMap.put("network-acl", NetworkAcl);
        enumMap.put("network-interface", NetworkInterface);
        enumMap.put("placement-group", PlacementGroup);
        enumMap.put("reserved-instances", ReservedInstances);
        enumMap.put("route-table", RouteTable);
        enumMap.put("security-group", SecurityGroup);
        enumMap.put("snapshot", Snapshot);
        enumMap.put("spot-fleet-request", SpotFleetRequest);
        enumMap.put("spot-instances-request", SpotInstancesRequest);
        enumMap.put("subnet", Subnet);
        enumMap.put("traffic-mirror-filter", TrafficMirrorFilter);
        enumMap.put("traffic-mirror-session", TrafficMirrorSession);
        enumMap.put("traffic-mirror-target", TrafficMirrorTarget);
        enumMap.put("transit-gateway", TransitGateway);
        enumMap.put("transit-gateway-attachment", TransitGatewayAttachment);
        enumMap.put("transit-gateway-multicast-domain", TransitGatewayMulticastDomain);
        enumMap.put("transit-gateway-route-table", TransitGatewayRouteTable);
        enumMap.put("volume", Volume);
        enumMap.put("vpc", Vpc);
        enumMap.put("vpc-peering-connection", VpcPeeringConnection);
        enumMap.put("vpn-connection", VpnConnection);
        enumMap.put("vpn-gateway", VpnGateway);
        enumMap.put("vpc-flow-log", VpcFlowLog);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ResourceType corresponding to the value
     */
    public static ResourceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
