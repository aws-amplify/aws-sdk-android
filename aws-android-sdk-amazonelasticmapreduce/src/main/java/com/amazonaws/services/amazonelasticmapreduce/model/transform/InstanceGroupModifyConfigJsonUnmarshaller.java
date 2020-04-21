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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InstanceGroupModifyConfig
 */
class InstanceGroupModifyConfigJsonUnmarshaller implements
        Unmarshaller<InstanceGroupModifyConfig, JsonUnmarshallerContext> {

    public InstanceGroupModifyConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceGroupModifyConfig instanceGroupModifyConfig = new InstanceGroupModifyConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceGroupId")) {
                instanceGroupModifyConfig.setInstanceGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCount")) {
                instanceGroupModifyConfig.setInstanceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EC2InstanceIdsToTerminate")) {
                instanceGroupModifyConfig
                        .setEC2InstanceIdsToTerminate(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ShrinkPolicy")) {
                instanceGroupModifyConfig.setShrinkPolicy(ShrinkPolicyJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Configurations")) {
                instanceGroupModifyConfig.setConfigurations(new ListUnmarshaller<Configuration>(
                        ConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceGroupModifyConfig;
    }

    private static InstanceGroupModifyConfigJsonUnmarshaller instance;

    public static InstanceGroupModifyConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupModifyConfigJsonUnmarshaller();
        return instance;
    }
}
