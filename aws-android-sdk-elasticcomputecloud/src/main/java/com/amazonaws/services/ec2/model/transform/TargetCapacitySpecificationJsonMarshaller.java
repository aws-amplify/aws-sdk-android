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
 * JSON marshaller for POJO TargetCapacitySpecification
 */
class TargetCapacitySpecificationJsonMarshaller {

    public void marshall(TargetCapacitySpecification targetCapacitySpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (targetCapacitySpecification.getTotalTargetCapacity() != null) {
            Integer totalTargetCapacity = targetCapacitySpecification.getTotalTargetCapacity();
            jsonWriter.name("TotalTargetCapacity");
            jsonWriter.value(totalTargetCapacity);
        }
        if (targetCapacitySpecification.getOnDemandTargetCapacity() != null) {
            Integer onDemandTargetCapacity = targetCapacitySpecification
                    .getOnDemandTargetCapacity();
            jsonWriter.name("OnDemandTargetCapacity");
            jsonWriter.value(onDemandTargetCapacity);
        }
        if (targetCapacitySpecification.getSpotTargetCapacity() != null) {
            Integer spotTargetCapacity = targetCapacitySpecification.getSpotTargetCapacity();
            jsonWriter.name("SpotTargetCapacity");
            jsonWriter.value(spotTargetCapacity);
        }
        if (targetCapacitySpecification.getDefaultTargetCapacityType() != null) {
            String defaultTargetCapacityType = targetCapacitySpecification
                    .getDefaultTargetCapacityType();
            jsonWriter.name("DefaultTargetCapacityType");
            jsonWriter.value(defaultTargetCapacityType);
        }
        jsonWriter.endObject();
    }

    private static TargetCapacitySpecificationJsonMarshaller instance;

    public static TargetCapacitySpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetCapacitySpecificationJsonMarshaller();
        return instance;
    }
}
