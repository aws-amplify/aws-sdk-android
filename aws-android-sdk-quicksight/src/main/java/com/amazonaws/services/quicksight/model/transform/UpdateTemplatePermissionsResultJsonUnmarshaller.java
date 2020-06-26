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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateTemplatePermissionsResult
 */
public class UpdateTemplatePermissionsResultJsonUnmarshaller implements
        Unmarshaller<UpdateTemplatePermissionsResult, JsonUnmarshallerContext> {

    public UpdateTemplatePermissionsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdateTemplatePermissionsResult updateTemplatePermissionsResult = new UpdateTemplatePermissionsResult();

        updateTemplatePermissionsResult.setStatus(context.getHttpResponse().getStatusCode());
        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TemplateId")) {
                updateTemplatePermissionsResult.setTemplateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemplateArn")) {
                updateTemplatePermissionsResult.setTemplateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Permissions")) {
                updateTemplatePermissionsResult
                        .setPermissions(new ListUnmarshaller<ResourcePermission>(
                                ResourcePermissionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RequestId")) {
                updateTemplatePermissionsResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                updateTemplatePermissionsResult.setStatus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateTemplatePermissionsResult;
    }

    private static UpdateTemplatePermissionsResultJsonUnmarshaller instance;

    public static UpdateTemplatePermissionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateTemplatePermissionsResultJsonUnmarshaller();
        return instance;
    }
}
