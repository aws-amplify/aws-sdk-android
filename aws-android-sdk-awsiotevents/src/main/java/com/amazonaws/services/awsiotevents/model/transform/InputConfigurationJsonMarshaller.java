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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputConfiguration
 */
class InputConfigurationJsonMarshaller {

    public void marshall(InputConfiguration inputConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inputConfiguration.getInputName() != null) {
            String inputName = inputConfiguration.getInputName();
            jsonWriter.name("inputName");
            jsonWriter.value(inputName);
        }
        if (inputConfiguration.getInputDescription() != null) {
            String inputDescription = inputConfiguration.getInputDescription();
            jsonWriter.name("inputDescription");
            jsonWriter.value(inputDescription);
        }
        if (inputConfiguration.getInputArn() != null) {
            String inputArn = inputConfiguration.getInputArn();
            jsonWriter.name("inputArn");
            jsonWriter.value(inputArn);
        }
        if (inputConfiguration.getCreationTime() != null) {
            java.util.Date creationTime = inputConfiguration.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (inputConfiguration.getLastUpdateTime() != null) {
            java.util.Date lastUpdateTime = inputConfiguration.getLastUpdateTime();
            jsonWriter.name("lastUpdateTime");
            jsonWriter.value(lastUpdateTime);
        }
        if (inputConfiguration.getStatus() != null) {
            String status = inputConfiguration.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static InputConfigurationJsonMarshaller instance;

    public static InputConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputConfigurationJsonMarshaller();
        return instance;
    }
}
