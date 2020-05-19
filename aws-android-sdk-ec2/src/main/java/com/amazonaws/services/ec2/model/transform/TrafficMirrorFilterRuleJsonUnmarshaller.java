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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TrafficMirrorFilterRule
 */
class TrafficMirrorFilterRuleJsonUnmarshaller implements
        Unmarshaller<TrafficMirrorFilterRule, JsonUnmarshallerContext> {

    public TrafficMirrorFilterRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TrafficMirrorFilterRule trafficMirrorFilterRule = new TrafficMirrorFilterRule();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrafficMirrorFilterRuleId")) {
                trafficMirrorFilterRule.setTrafficMirrorFilterRuleId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrafficMirrorFilterId")) {
                trafficMirrorFilterRule.setTrafficMirrorFilterId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrafficDirection")) {
                trafficMirrorFilterRule.setTrafficDirection(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RuleNumber")) {
                trafficMirrorFilterRule.setRuleNumber(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RuleAction")) {
                trafficMirrorFilterRule.setRuleAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Protocol")) {
                trafficMirrorFilterRule.setProtocol(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationPortRange")) {
                trafficMirrorFilterRule
                        .setDestinationPortRange(TrafficMirrorPortRangeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("SourcePortRange")) {
                trafficMirrorFilterRule.setSourcePortRange(TrafficMirrorPortRangeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationCidrBlock")) {
                trafficMirrorFilterRule.setDestinationCidrBlock(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceCidrBlock")) {
                trafficMirrorFilterRule.setSourceCidrBlock(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                trafficMirrorFilterRule.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return trafficMirrorFilterRule;
    }

    private static TrafficMirrorFilterRuleJsonUnmarshaller instance;

    public static TrafficMirrorFilterRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrafficMirrorFilterRuleJsonUnmarshaller();
        return instance;
    }
}
