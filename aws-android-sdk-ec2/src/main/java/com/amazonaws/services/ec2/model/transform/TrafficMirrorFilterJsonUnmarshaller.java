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
 * JSON unmarshaller for POJO TrafficMirrorFilter
 */
class TrafficMirrorFilterJsonUnmarshaller implements
        Unmarshaller<TrafficMirrorFilter, JsonUnmarshallerContext> {

    public TrafficMirrorFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TrafficMirrorFilter trafficMirrorFilter = new TrafficMirrorFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrafficMirrorFilterId")) {
                trafficMirrorFilter.setTrafficMirrorFilterId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IngressFilterRules")) {
                trafficMirrorFilter
                        .setIngressFilterRules(new ListUnmarshaller<TrafficMirrorFilterRule>(
                                TrafficMirrorFilterRuleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EgressFilterRules")) {
                trafficMirrorFilter
                        .setEgressFilterRules(new ListUnmarshaller<TrafficMirrorFilterRule>(
                                TrafficMirrorFilterRuleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkServices")) {
                trafficMirrorFilter.setNetworkServices(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                trafficMirrorFilter.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                trafficMirrorFilter.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return trafficMirrorFilter;
    }

    private static TrafficMirrorFilterJsonUnmarshaller instance;

    public static TrafficMirrorFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrafficMirrorFilterJsonUnmarshaller();
        return instance;
    }
}
