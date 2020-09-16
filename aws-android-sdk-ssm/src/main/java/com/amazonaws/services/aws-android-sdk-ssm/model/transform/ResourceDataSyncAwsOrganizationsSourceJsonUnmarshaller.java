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
 * JSON unmarshaller for POJO ResourceDataSyncAwsOrganizationsSource
 */
class ResourceDataSyncAwsOrganizationsSourceJsonUnmarshaller implements Unmarshaller<ResourceDataSyncAwsOrganizationsSource, JsonUnmarshallerContext> {

    public ResourceDataSyncAwsOrganizationsSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceDataSyncAwsOrganizationsSource resourceDataSyncAwsOrganizationsSource = new ResourceDataSyncAwsOrganizationsSource();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OrganizationSourceType")) {
                resourceDataSyncAwsOrganizationsSource.setOrganizationSourceType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OrganizationalUnits")) {
                resourceDataSyncAwsOrganizationsSource.setOrganizationalUnits(new ListUnmarshaller<ResourceDataSyncOrganizationalUnit>(ResourceDataSyncOrganizationalUnitJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceDataSyncAwsOrganizationsSource;
    }

    private static ResourceDataSyncAwsOrganizationsSourceJsonUnmarshaller instance;
    public static ResourceDataSyncAwsOrganizationsSourceJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ResourceDataSyncAwsOrganizationsSourceJsonUnmarshaller();
        return instance;
    }
}
