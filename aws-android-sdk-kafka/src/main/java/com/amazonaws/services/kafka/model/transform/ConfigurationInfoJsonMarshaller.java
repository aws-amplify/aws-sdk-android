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

package com.amazonaws.services.kafka.model.transform;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConfigurationInfo
 */
class ConfigurationInfoJsonMarshaller {

    public void marshall(ConfigurationInfo configurationInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (configurationInfo.getArn() != null) {
            String arn = configurationInfo.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (configurationInfo.getRevision() != null) {
            Long revision = configurationInfo.getRevision();
            jsonWriter.name("Revision");
            jsonWriter.value(revision);
        }
        jsonWriter.endObject();
    }

    private static ConfigurationInfoJsonMarshaller instance;

    public static ConfigurationInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationInfoJsonMarshaller();
        return instance;
    }
}
