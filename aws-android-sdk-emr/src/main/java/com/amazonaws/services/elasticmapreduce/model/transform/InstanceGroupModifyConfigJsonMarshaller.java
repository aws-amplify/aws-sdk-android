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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceGroupModifyConfig
 */
class InstanceGroupModifyConfigJsonMarshaller {

    public void marshall(InstanceGroupModifyConfig instanceGroupModifyConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceGroupModifyConfig.getInstanceGroupId() != null) {
            String instanceGroupId = instanceGroupModifyConfig.getInstanceGroupId();
            jsonWriter.name("InstanceGroupId");
            jsonWriter.value(instanceGroupId);
        }
        if (instanceGroupModifyConfig.getInstanceCount() != null) {
            Integer instanceCount = instanceGroupModifyConfig.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (instanceGroupModifyConfig.getEC2InstanceIdsToTerminate() != null) {
            java.util.List<String> eC2InstanceIdsToTerminate = instanceGroupModifyConfig
                    .getEC2InstanceIdsToTerminate();
            jsonWriter.name("EC2InstanceIdsToTerminate");
            jsonWriter.beginArray();
            for (String eC2InstanceIdsToTerminateItem : eC2InstanceIdsToTerminate) {
                if (eC2InstanceIdsToTerminateItem != null) {
                    jsonWriter.value(eC2InstanceIdsToTerminateItem);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceGroupModifyConfig.getShrinkPolicy() != null) {
            ShrinkPolicy shrinkPolicy = instanceGroupModifyConfig.getShrinkPolicy();
            jsonWriter.name("ShrinkPolicy");
            ShrinkPolicyJsonMarshaller.getInstance().marshall(shrinkPolicy, jsonWriter);
        }
        if (instanceGroupModifyConfig.getConfigurations() != null) {
            java.util.List<Configuration> configurations = instanceGroupModifyConfig
                    .getConfigurations();
            jsonWriter.name("Configurations");
            jsonWriter.beginArray();
            for (Configuration configurationsItem : configurations) {
                if (configurationsItem != null) {
                    ConfigurationJsonMarshaller.getInstance().marshall(configurationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InstanceGroupModifyConfigJsonMarshaller instance;

    public static InstanceGroupModifyConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupModifyConfigJsonMarshaller();
        return instance;
    }
}
