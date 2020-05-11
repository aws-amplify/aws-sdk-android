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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO OneDriveConfiguration
 */
class OneDriveConfigurationJsonUnmarshaller implements
        Unmarshaller<OneDriveConfiguration, JsonUnmarshallerContext> {

    public OneDriveConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        OneDriveConfiguration oneDriveConfiguration = new OneDriveConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TenantDomain")) {
                oneDriveConfiguration.setTenantDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecretArn")) {
                oneDriveConfiguration.setSecretArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OneDriveUsers")) {
                oneDriveConfiguration.setOneDriveUsers(OneDriveUsersJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InclusionPatterns")) {
                oneDriveConfiguration.setInclusionPatterns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ExclusionPatterns")) {
                oneDriveConfiguration.setExclusionPatterns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FieldMappings")) {
                oneDriveConfiguration
                        .setFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                                DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return oneDriveConfiguration;
    }

    private static OneDriveConfigurationJsonUnmarshaller instance;

    public static OneDriveConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OneDriveConfigurationJsonUnmarshaller();
        return instance;
    }
}
