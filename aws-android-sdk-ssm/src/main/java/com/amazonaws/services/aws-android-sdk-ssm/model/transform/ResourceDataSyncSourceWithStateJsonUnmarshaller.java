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
 * JSON unmarshaller for POJO ResourceDataSyncSourceWithState
 */
class ResourceDataSyncSourceWithStateJsonUnmarshaller implements Unmarshaller<ResourceDataSyncSourceWithState, JsonUnmarshallerContext> {

    public ResourceDataSyncSourceWithState unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceDataSyncSourceWithState resourceDataSyncSourceWithState = new ResourceDataSyncSourceWithState();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SourceType")) {
                resourceDataSyncSourceWithState.setSourceType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("AwsOrganizationsSource")) {
                resourceDataSyncSourceWithState.setAwsOrganizationsSource(ResourceDataSyncAwsOrganizationsSourceJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SourceRegions")) {
                resourceDataSyncSourceWithState.setSourceRegions(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("IncludeFutureRegions")) {
                resourceDataSyncSourceWithState.setIncludeFutureRegions(BooleanJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("State")) {
                resourceDataSyncSourceWithState.setState(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceDataSyncSourceWithState;
    }

    private static ResourceDataSyncSourceWithStateJsonUnmarshaller instance;
    public static ResourceDataSyncSourceWithStateJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ResourceDataSyncSourceWithStateJsonUnmarshaller();
        return instance;
    }
}
