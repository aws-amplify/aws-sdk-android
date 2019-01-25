/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeAccountAuditConfigurationResult
 */
public class DescribeAccountAuditConfigurationResultJsonUnmarshaller implements
        Unmarshaller<DescribeAccountAuditConfigurationResult, JsonUnmarshallerContext> {

    public DescribeAccountAuditConfigurationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeAccountAuditConfigurationResult describeAccountAuditConfigurationResult = new DescribeAccountAuditConfigurationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("roleArn")) {
                describeAccountAuditConfigurationResult.setRoleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("auditNotificationTargetConfigurations")) {
                describeAccountAuditConfigurationResult
                        .setAuditNotificationTargetConfigurations(new MapUnmarshaller<AuditNotificationTarget>(
                                AuditNotificationTargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("auditCheckConfigurations")) {
                describeAccountAuditConfigurationResult
                        .setAuditCheckConfigurations(new MapUnmarshaller<AuditCheckConfiguration>(
                                AuditCheckConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeAccountAuditConfigurationResult;
    }

    private static DescribeAccountAuditConfigurationResultJsonUnmarshaller instance;

    public static DescribeAccountAuditConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAccountAuditConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
