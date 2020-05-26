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
 * JSON marshaller for POJO TrafficMirrorFilterRule
 */
class TrafficMirrorFilterRuleJsonMarshaller {

    public void marshall(TrafficMirrorFilterRule trafficMirrorFilterRule, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trafficMirrorFilterRule.getTrafficMirrorFilterRuleId() != null) {
            String trafficMirrorFilterRuleId = trafficMirrorFilterRule
                    .getTrafficMirrorFilterRuleId();
            jsonWriter.name("TrafficMirrorFilterRuleId");
            jsonWriter.value(trafficMirrorFilterRuleId);
        }
        if (trafficMirrorFilterRule.getTrafficMirrorFilterId() != null) {
            String trafficMirrorFilterId = trafficMirrorFilterRule.getTrafficMirrorFilterId();
            jsonWriter.name("TrafficMirrorFilterId");
            jsonWriter.value(trafficMirrorFilterId);
        }
        if (trafficMirrorFilterRule.getTrafficDirection() != null) {
            String trafficDirection = trafficMirrorFilterRule.getTrafficDirection();
            jsonWriter.name("TrafficDirection");
            jsonWriter.value(trafficDirection);
        }
        if (trafficMirrorFilterRule.getRuleNumber() != null) {
            Integer ruleNumber = trafficMirrorFilterRule.getRuleNumber();
            jsonWriter.name("RuleNumber");
            jsonWriter.value(ruleNumber);
        }
        if (trafficMirrorFilterRule.getRuleAction() != null) {
            String ruleAction = trafficMirrorFilterRule.getRuleAction();
            jsonWriter.name("RuleAction");
            jsonWriter.value(ruleAction);
        }
        if (trafficMirrorFilterRule.getProtocol() != null) {
            Integer protocol = trafficMirrorFilterRule.getProtocol();
            jsonWriter.name("Protocol");
            jsonWriter.value(protocol);
        }
        if (trafficMirrorFilterRule.getDestinationPortRange() != null) {
            TrafficMirrorPortRange destinationPortRange = trafficMirrorFilterRule
                    .getDestinationPortRange();
            jsonWriter.name("DestinationPortRange");
            TrafficMirrorPortRangeJsonMarshaller.getInstance().marshall(destinationPortRange,
                    jsonWriter);
        }
        if (trafficMirrorFilterRule.getSourcePortRange() != null) {
            TrafficMirrorPortRange sourcePortRange = trafficMirrorFilterRule.getSourcePortRange();
            jsonWriter.name("SourcePortRange");
            TrafficMirrorPortRangeJsonMarshaller.getInstance()
                    .marshall(sourcePortRange, jsonWriter);
        }
        if (trafficMirrorFilterRule.getDestinationCidrBlock() != null) {
            String destinationCidrBlock = trafficMirrorFilterRule.getDestinationCidrBlock();
            jsonWriter.name("DestinationCidrBlock");
            jsonWriter.value(destinationCidrBlock);
        }
        if (trafficMirrorFilterRule.getSourceCidrBlock() != null) {
            String sourceCidrBlock = trafficMirrorFilterRule.getSourceCidrBlock();
            jsonWriter.name("SourceCidrBlock");
            jsonWriter.value(sourceCidrBlock);
        }
        if (trafficMirrorFilterRule.getDescription() != null) {
            String description = trafficMirrorFilterRule.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static TrafficMirrorFilterRuleJsonMarshaller instance;

    public static TrafficMirrorFilterRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrafficMirrorFilterRuleJsonMarshaller();
        return instance;
    }
}
