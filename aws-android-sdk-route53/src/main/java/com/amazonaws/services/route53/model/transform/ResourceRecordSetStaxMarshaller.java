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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ResourceRecordSet
 */
class ResourceRecordSetStaxMarshaller {

    public void marshall(ResourceRecordSet _resourceRecordSet, Request<?> request, String _prefix) {
        String prefix;
        if (_resourceRecordSet.getName() != null) {
            prefix = _prefix + "Name";
            String name = _resourceRecordSet.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_resourceRecordSet.getType() != null) {
            prefix = _prefix + "Type";
            String type = _resourceRecordSet.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_resourceRecordSet.getSetIdentifier() != null) {
            prefix = _prefix + "SetIdentifier";
            String setIdentifier = _resourceRecordSet.getSetIdentifier();
            request.addParameter(prefix, StringUtils.fromString(setIdentifier));
        }
        if (_resourceRecordSet.getWeight() != null) {
            prefix = _prefix + "Weight";
            Long weight = _resourceRecordSet.getWeight();
            request.addParameter(prefix, StringUtils.fromLong(weight));
        }
        if (_resourceRecordSet.getRegion() != null) {
            prefix = _prefix + "Region";
            String region = _resourceRecordSet.getRegion();
            request.addParameter(prefix, StringUtils.fromString(region));
        }
        if (_resourceRecordSet.getGeoLocation() != null) {
            prefix = _prefix + "GeoLocation";
            GeoLocation geoLocation = _resourceRecordSet.getGeoLocation();
            GeoLocationStaxMarshaller.getInstance().marshall(geoLocation, request, prefix + ".");
        }
        if (_resourceRecordSet.getFailover() != null) {
            prefix = _prefix + "Failover";
            String failover = _resourceRecordSet.getFailover();
            request.addParameter(prefix, StringUtils.fromString(failover));
        }
        if (_resourceRecordSet.getMultiValueAnswer() != null) {
            prefix = _prefix + "MultiValueAnswer";
            Boolean multiValueAnswer = _resourceRecordSet.getMultiValueAnswer();
            request.addParameter(prefix, StringUtils.fromBoolean(multiValueAnswer));
        }
        if (_resourceRecordSet.getTTL() != null) {
            prefix = _prefix + "TTL";
            Long tTL = _resourceRecordSet.getTTL();
            request.addParameter(prefix, StringUtils.fromLong(tTL));
        }
        if (_resourceRecordSet.getResourceRecords() != null) {
            prefix = _prefix + "ResourceRecords";
            java.util.List<ResourceRecord> resourceRecords = _resourceRecordSet
                    .getResourceRecords();
            int resourceRecordsIndex = 1;
            String resourceRecordsPrefix = prefix;
            for (ResourceRecord resourceRecordsItem : resourceRecords) {
                prefix = resourceRecordsPrefix + "." + resourceRecordsIndex;
                if (resourceRecordsItem != null) {
                    ResourceRecordStaxMarshaller.getInstance().marshall(resourceRecordsItem,
                            request, prefix + ".");
                }
                resourceRecordsIndex++;
            }
            prefix = resourceRecordsPrefix;
        }
        if (_resourceRecordSet.getAliasTarget() != null) {
            prefix = _prefix + "AliasTarget";
            AliasTarget aliasTarget = _resourceRecordSet.getAliasTarget();
            AliasTargetStaxMarshaller.getInstance().marshall(aliasTarget, request, prefix + ".");
        }
        if (_resourceRecordSet.getHealthCheckId() != null) {
            prefix = _prefix + "HealthCheckId";
            String healthCheckId = _resourceRecordSet.getHealthCheckId();
            request.addParameter(prefix, StringUtils.fromString(healthCheckId));
        }
        if (_resourceRecordSet.getTrafficPolicyInstanceId() != null) {
            prefix = _prefix + "TrafficPolicyInstanceId";
            String trafficPolicyInstanceId = _resourceRecordSet.getTrafficPolicyInstanceId();
            request.addParameter(prefix, StringUtils.fromString(trafficPolicyInstanceId));
        }
    }

    private static ResourceRecordSetStaxMarshaller instance;

    public static ResourceRecordSetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceRecordSetStaxMarshaller();
        return instance;
    }
}
