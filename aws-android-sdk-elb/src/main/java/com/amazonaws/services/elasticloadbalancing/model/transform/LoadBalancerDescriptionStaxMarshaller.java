/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO LoadBalancerDescription
 */
class LoadBalancerDescriptionStaxMarshaller {

    public void marshall(LoadBalancerDescription _loadBalancerDescription, Request<?> request,
            String _prefix) {
        String prefix;
        if (_loadBalancerDescription.getLoadBalancerName() != null) {
            prefix = _prefix + "LoadBalancerName";
            String loadBalancerName = _loadBalancerDescription.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (_loadBalancerDescription.getDNSName() != null) {
            prefix = _prefix + "DNSName";
            String dNSName = _loadBalancerDescription.getDNSName();
            request.addParameter(prefix, StringUtils.fromString(dNSName));
        }
        if (_loadBalancerDescription.getCanonicalHostedZoneName() != null) {
            prefix = _prefix + "CanonicalHostedZoneName";
            String canonicalHostedZoneName = _loadBalancerDescription.getCanonicalHostedZoneName();
            request.addParameter(prefix, StringUtils.fromString(canonicalHostedZoneName));
        }
        if (_loadBalancerDescription.getCanonicalHostedZoneNameID() != null) {
            prefix = _prefix + "CanonicalHostedZoneNameID";
            String canonicalHostedZoneNameID = _loadBalancerDescription
                    .getCanonicalHostedZoneNameID();
            request.addParameter(prefix, StringUtils.fromString(canonicalHostedZoneNameID));
        }
        if (_loadBalancerDescription.getListenerDescriptions() != null) {
            prefix = _prefix + "ListenerDescriptions";
            java.util.List<ListenerDescription> listenerDescriptions = _loadBalancerDescription
                    .getListenerDescriptions();
            int listenerDescriptionsIndex = 1;
            String listenerDescriptionsPrefix = prefix;
            for (ListenerDescription listenerDescriptionsItem : listenerDescriptions) {
                prefix = listenerDescriptionsPrefix + ".member." + listenerDescriptionsIndex;
                if (listenerDescriptionsItem != null) {
                    ListenerDescriptionStaxMarshaller.getInstance().marshall(
                            listenerDescriptionsItem, request, prefix + ".");
                }
                listenerDescriptionsIndex++;
            }
            prefix = listenerDescriptionsPrefix;
        }
        if (_loadBalancerDescription.getPolicies() != null) {
            prefix = _prefix + "Policies";
            Policies policies = _loadBalancerDescription.getPolicies();
            PoliciesStaxMarshaller.getInstance().marshall(policies, request, prefix + ".");
        }
        if (_loadBalancerDescription.getBackendServerDescriptions() != null) {
            prefix = _prefix + "BackendServerDescriptions";
            java.util.List<BackendServerDescription> backendServerDescriptions = _loadBalancerDescription
                    .getBackendServerDescriptions();
            int backendServerDescriptionsIndex = 1;
            String backendServerDescriptionsPrefix = prefix;
            for (BackendServerDescription backendServerDescriptionsItem : backendServerDescriptions) {
                prefix = backendServerDescriptionsPrefix + ".member."
                        + backendServerDescriptionsIndex;
                if (backendServerDescriptionsItem != null) {
                    BackendServerDescriptionStaxMarshaller.getInstance().marshall(
                            backendServerDescriptionsItem, request, prefix + ".");
                }
                backendServerDescriptionsIndex++;
            }
            prefix = backendServerDescriptionsPrefix;
        }
        if (_loadBalancerDescription.getAvailabilityZones() != null) {
            prefix = _prefix + "AvailabilityZones";
            java.util.List<String> availabilityZones = _loadBalancerDescription
                    .getAvailabilityZones();
            int availabilityZonesIndex = 1;
            String availabilityZonesPrefix = prefix;
            for (String availabilityZonesItem : availabilityZones) {
                prefix = availabilityZonesPrefix + ".member." + availabilityZonesIndex;
                if (availabilityZonesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(availabilityZonesItem));
                }
                availabilityZonesIndex++;
            }
            prefix = availabilityZonesPrefix;
        }
        if (_loadBalancerDescription.getSubnets() != null) {
            prefix = _prefix + "Subnets";
            java.util.List<String> subnets = _loadBalancerDescription.getSubnets();
            int subnetsIndex = 1;
            String subnetsPrefix = prefix;
            for (String subnetsItem : subnets) {
                prefix = subnetsPrefix + ".member." + subnetsIndex;
                if (subnetsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(subnetsItem));
                }
                subnetsIndex++;
            }
            prefix = subnetsPrefix;
        }
        if (_loadBalancerDescription.getVPCId() != null) {
            prefix = _prefix + "VPCId";
            String vPCId = _loadBalancerDescription.getVPCId();
            request.addParameter(prefix, StringUtils.fromString(vPCId));
        }
        if (_loadBalancerDescription.getInstances() != null) {
            prefix = _prefix + "Instances";
            java.util.List<Instance> instances = _loadBalancerDescription.getInstances();
            int instancesIndex = 1;
            String instancesPrefix = prefix;
            for (Instance instancesItem : instances) {
                prefix = instancesPrefix + ".member." + instancesIndex;
                if (instancesItem != null) {
                    InstanceStaxMarshaller.getInstance().marshall(instancesItem, request,
                            prefix + ".");
                }
                instancesIndex++;
            }
            prefix = instancesPrefix;
        }
        if (_loadBalancerDescription.getHealthCheck() != null) {
            prefix = _prefix + "HealthCheck";
            HealthCheck healthCheck = _loadBalancerDescription.getHealthCheck();
            HealthCheckStaxMarshaller.getInstance().marshall(healthCheck, request, prefix + ".");
        }
        if (_loadBalancerDescription.getSourceSecurityGroup() != null) {
            prefix = _prefix + "SourceSecurityGroup";
            SourceSecurityGroup sourceSecurityGroup = _loadBalancerDescription
                    .getSourceSecurityGroup();
            SourceSecurityGroupStaxMarshaller.getInstance().marshall(sourceSecurityGroup, request,
                    prefix + ".");
        }
        if (_loadBalancerDescription.getSecurityGroups() != null) {
            prefix = _prefix + "SecurityGroups";
            java.util.List<String> securityGroups = _loadBalancerDescription.getSecurityGroups();
            int securityGroupsIndex = 1;
            String securityGroupsPrefix = prefix;
            for (String securityGroupsItem : securityGroups) {
                prefix = securityGroupsPrefix + ".member." + securityGroupsIndex;
                if (securityGroupsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(securityGroupsItem));
                }
                securityGroupsIndex++;
            }
            prefix = securityGroupsPrefix;
        }
        if (_loadBalancerDescription.getCreatedTime() != null) {
            prefix = _prefix + "CreatedTime";
            java.util.Date createdTime = _loadBalancerDescription.getCreatedTime();
            request.addParameter(prefix, StringUtils.fromDate(createdTime));
        }
        if (_loadBalancerDescription.getScheme() != null) {
            prefix = _prefix + "Scheme";
            String scheme = _loadBalancerDescription.getScheme();
            request.addParameter(prefix, StringUtils.fromString(scheme));
        }
    }

    private static LoadBalancerDescriptionStaxMarshaller instance;

    public static LoadBalancerDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerDescriptionStaxMarshaller();
        return instance;
    }
}
