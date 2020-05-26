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
 * JSON marshaller for POJO ReservedInstancesModificationResult
 */
class ReservedInstancesModificationResultJsonMarshaller {

    public void marshall(ReservedInstancesModificationResult reservedInstancesModificationResult,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reservedInstancesModificationResult.getReservedInstancesId() != null) {
            String reservedInstancesId = reservedInstancesModificationResult
                    .getReservedInstancesId();
            jsonWriter.name("ReservedInstancesId");
            jsonWriter.value(reservedInstancesId);
        }
        if (reservedInstancesModificationResult.getTargetConfiguration() != null) {
            ReservedInstancesConfiguration targetConfiguration = reservedInstancesModificationResult
                    .getTargetConfiguration();
            jsonWriter.name("TargetConfiguration");
            ReservedInstancesConfigurationJsonMarshaller.getInstance().marshall(
                    targetConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReservedInstancesModificationResultJsonMarshaller instance;

    public static ReservedInstancesModificationResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstancesModificationResultJsonMarshaller();
        return instance;
    }
}
