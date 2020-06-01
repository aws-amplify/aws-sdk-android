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
 * JSON marshaller for POJO InstanceFleetModifyConfig
 */
class InstanceFleetModifyConfigJsonMarshaller {

    public void marshall(InstanceFleetModifyConfig instanceFleetModifyConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceFleetModifyConfig.getInstanceFleetId() != null) {
            String instanceFleetId = instanceFleetModifyConfig.getInstanceFleetId();
            jsonWriter.name("InstanceFleetId");
            jsonWriter.value(instanceFleetId);
        }
        if (instanceFleetModifyConfig.getTargetOnDemandCapacity() != null) {
            Integer targetOnDemandCapacity = instanceFleetModifyConfig.getTargetOnDemandCapacity();
            jsonWriter.name("TargetOnDemandCapacity");
            jsonWriter.value(targetOnDemandCapacity);
        }
        if (instanceFleetModifyConfig.getTargetSpotCapacity() != null) {
            Integer targetSpotCapacity = instanceFleetModifyConfig.getTargetSpotCapacity();
            jsonWriter.name("TargetSpotCapacity");
            jsonWriter.value(targetSpotCapacity);
        }
        jsonWriter.endObject();
    }

    private static InstanceFleetModifyConfigJsonMarshaller instance;

    public static InstanceFleetModifyConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceFleetModifyConfigJsonMarshaller();
        return instance;
    }
}
