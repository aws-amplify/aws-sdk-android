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
 * JSON marshaller for POJO TargetCapacitySpecificationRequest
 */
class TargetCapacitySpecificationRequestJsonMarshaller {

    public void marshall(TargetCapacitySpecificationRequest targetCapacitySpecificationRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (targetCapacitySpecificationRequest.getTotalTargetCapacity() != null) {
            Integer totalTargetCapacity = targetCapacitySpecificationRequest
                    .getTotalTargetCapacity();
            jsonWriter.name("TotalTargetCapacity");
            jsonWriter.value(totalTargetCapacity);
        }
        if (targetCapacitySpecificationRequest.getOnDemandTargetCapacity() != null) {
            Integer onDemandTargetCapacity = targetCapacitySpecificationRequest
                    .getOnDemandTargetCapacity();
            jsonWriter.name("OnDemandTargetCapacity");
            jsonWriter.value(onDemandTargetCapacity);
        }
        if (targetCapacitySpecificationRequest.getSpotTargetCapacity() != null) {
            Integer spotTargetCapacity = targetCapacitySpecificationRequest.getSpotTargetCapacity();
            jsonWriter.name("SpotTargetCapacity");
            jsonWriter.value(spotTargetCapacity);
        }
        if (targetCapacitySpecificationRequest.getDefaultTargetCapacityType() != null) {
            String defaultTargetCapacityType = targetCapacitySpecificationRequest
                    .getDefaultTargetCapacityType();
            jsonWriter.name("DefaultTargetCapacityType");
            jsonWriter.value(defaultTargetCapacityType);
        }
        jsonWriter.endObject();
    }

    private static TargetCapacitySpecificationRequestJsonMarshaller instance;

    public static TargetCapacitySpecificationRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetCapacitySpecificationRequestJsonMarshaller();
        return instance;
    }
}
