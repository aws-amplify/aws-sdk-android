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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO MaintenanceWindowRunCommandParameters
 */
class MaintenanceWindowRunCommandParametersJsonUnmarshaller implements Unmarshaller<MaintenanceWindowRunCommandParameters, JsonUnmarshallerContext> {

    public MaintenanceWindowRunCommandParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MaintenanceWindowRunCommandParameters maintenanceWindowRunCommandParameters = new MaintenanceWindowRunCommandParameters();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Comment")) {
                maintenanceWindowRunCommandParameters.setComment(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CloudWatchOutputConfig")) {
                maintenanceWindowRunCommandParameters.setCloudWatchOutputConfig(CloudWatchOutputConfigJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentHash")) {
                maintenanceWindowRunCommandParameters.setDocumentHash(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentHashType")) {
                maintenanceWindowRunCommandParameters.setDocumentHashType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                maintenanceWindowRunCommandParameters.setDocumentVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("NotificationConfig")) {
                maintenanceWindowRunCommandParameters.setNotificationConfig(NotificationConfigJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OutputS3BucketName")) {
                maintenanceWindowRunCommandParameters.setOutputS3BucketName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OutputS3KeyPrefix")) {
                maintenanceWindowRunCommandParameters.setOutputS3KeyPrefix(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Parameters")) {
                maintenanceWindowRunCommandParameters.setParameters(new MapUnmarshaller<java.util.List<String>>(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
)
.unmarshall(context));
            } else if (name.equals("ServiceRoleArn")) {
                maintenanceWindowRunCommandParameters.setServiceRoleArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("TimeoutSeconds")) {
                maintenanceWindowRunCommandParameters.setTimeoutSeconds(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return maintenanceWindowRunCommandParameters;
    }

    private static MaintenanceWindowRunCommandParametersJsonUnmarshaller instance;
    public static MaintenanceWindowRunCommandParametersJsonUnmarshaller getInstance() {
        if (instance == null) instance = new MaintenanceWindowRunCommandParametersJsonUnmarshaller();
        return instance;
    }
}
