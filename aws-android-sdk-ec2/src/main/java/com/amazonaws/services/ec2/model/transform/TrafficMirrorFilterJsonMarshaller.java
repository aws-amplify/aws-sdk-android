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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrafficMirrorFilter
 */
class TrafficMirrorFilterJsonMarshaller {

    public void marshall(TrafficMirrorFilter trafficMirrorFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trafficMirrorFilter.getTrafficMirrorFilterId() != null) {
            String trafficMirrorFilterId = trafficMirrorFilter.getTrafficMirrorFilterId();
            jsonWriter.name("TrafficMirrorFilterId");
            jsonWriter.value(trafficMirrorFilterId);
        }
        if (trafficMirrorFilter.getIngressFilterRules() != null) {
            java.util.List<TrafficMirrorFilterRule> ingressFilterRules = trafficMirrorFilter
                    .getIngressFilterRules();
            jsonWriter.name("IngressFilterRules");
            jsonWriter.beginArray();
            for (TrafficMirrorFilterRule ingressFilterRulesItem : ingressFilterRules) {
                if (ingressFilterRulesItem != null) {
                    TrafficMirrorFilterRuleJsonMarshaller.getInstance().marshall(
                            ingressFilterRulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trafficMirrorFilter.getEgressFilterRules() != null) {
            java.util.List<TrafficMirrorFilterRule> egressFilterRules = trafficMirrorFilter
                    .getEgressFilterRules();
            jsonWriter.name("EgressFilterRules");
            jsonWriter.beginArray();
            for (TrafficMirrorFilterRule egressFilterRulesItem : egressFilterRules) {
                if (egressFilterRulesItem != null) {
                    TrafficMirrorFilterRuleJsonMarshaller.getInstance().marshall(
                            egressFilterRulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trafficMirrorFilter.getNetworkServices() != null) {
            java.util.List<String> networkServices = trafficMirrorFilter.getNetworkServices();
            jsonWriter.name("NetworkServices");
            jsonWriter.beginArray();
            for (String networkServicesItem : networkServices) {
                if (networkServicesItem != null) {
                    jsonWriter.value(networkServicesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (trafficMirrorFilter.getDescription() != null) {
            String description = trafficMirrorFilter.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (trafficMirrorFilter.getTags() != null) {
            java.util.List<Tag> tags = trafficMirrorFilter.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TrafficMirrorFilterJsonMarshaller instance;

    public static TrafficMirrorFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrafficMirrorFilterJsonMarshaller();
        return instance;
    }
}
