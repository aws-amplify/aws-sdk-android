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
 * JSON marshaller for POJO ConnectionLogResponseOptions
 */
class ConnectionLogResponseOptionsJsonMarshaller {

    public void marshall(ConnectionLogResponseOptions connectionLogResponseOptions,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (connectionLogResponseOptions.getEnabled() != null) {
            Boolean enabled = connectionLogResponseOptions.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (connectionLogResponseOptions.getCloudwatchLogGroup() != null) {
            String cloudwatchLogGroup = connectionLogResponseOptions.getCloudwatchLogGroup();
            jsonWriter.name("CloudwatchLogGroup");
            jsonWriter.value(cloudwatchLogGroup);
        }
        if (connectionLogResponseOptions.getCloudwatchLogStream() != null) {
            String cloudwatchLogStream = connectionLogResponseOptions.getCloudwatchLogStream();
            jsonWriter.name("CloudwatchLogStream");
            jsonWriter.value(cloudwatchLogStream);
        }
        jsonWriter.endObject();
    }

    private static ConnectionLogResponseOptionsJsonMarshaller instance;

    public static ConnectionLogResponseOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionLogResponseOptionsJsonMarshaller();
        return instance;
    }
}
