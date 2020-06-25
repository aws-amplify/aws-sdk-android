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
 * JSON marshaller for POJO ConnectionLogOptions
 */
class ConnectionLogOptionsJsonMarshaller {

    public void marshall(ConnectionLogOptions connectionLogOptions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (connectionLogOptions.getEnabled() != null) {
            Boolean enabled = connectionLogOptions.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (connectionLogOptions.getCloudwatchLogGroup() != null) {
            String cloudwatchLogGroup = connectionLogOptions.getCloudwatchLogGroup();
            jsonWriter.name("CloudwatchLogGroup");
            jsonWriter.value(cloudwatchLogGroup);
        }
        if (connectionLogOptions.getCloudwatchLogStream() != null) {
            String cloudwatchLogStream = connectionLogOptions.getCloudwatchLogStream();
            jsonWriter.name("CloudwatchLogStream");
            jsonWriter.value(cloudwatchLogStream);
        }
        jsonWriter.endObject();
    }

    private static ConnectionLogOptionsJsonMarshaller instance;

    public static ConnectionLogOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionLogOptionsJsonMarshaller();
        return instance;
    }
}
