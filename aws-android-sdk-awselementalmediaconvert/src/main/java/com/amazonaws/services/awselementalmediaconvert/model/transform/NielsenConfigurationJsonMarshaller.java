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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NielsenConfiguration
 */
class NielsenConfigurationJsonMarshaller {

    public void marshall(NielsenConfiguration nielsenConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (nielsenConfiguration.getBreakoutCode() != null) {
            Integer breakoutCode = nielsenConfiguration.getBreakoutCode();
            jsonWriter.name("BreakoutCode");
            jsonWriter.value(breakoutCode);
        }
        if (nielsenConfiguration.getDistributorId() != null) {
            String distributorId = nielsenConfiguration.getDistributorId();
            jsonWriter.name("DistributorId");
            jsonWriter.value(distributorId);
        }
        jsonWriter.endObject();
    }

    private static NielsenConfigurationJsonMarshaller instance;

    public static NielsenConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NielsenConfigurationJsonMarshaller();
        return instance;
    }
}
