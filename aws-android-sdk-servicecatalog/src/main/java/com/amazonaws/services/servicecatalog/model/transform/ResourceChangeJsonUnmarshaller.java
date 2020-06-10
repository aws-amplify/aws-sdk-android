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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ResourceChange
 */
class ResourceChangeJsonUnmarshaller implements
        Unmarshaller<ResourceChange, JsonUnmarshallerContext> {

    public ResourceChange unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceChange resourceChange = new ResourceChange();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Action")) {
                resourceChange.setAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogicalResourceId")) {
                resourceChange.setLogicalResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhysicalResourceId")) {
                resourceChange.setPhysicalResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                resourceChange.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Replacement")) {
                resourceChange.setReplacement(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scope")) {
                resourceChange.setScope(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Details")) {
                resourceChange.setDetails(new ListUnmarshaller<ResourceChangeDetail>(
                        ResourceChangeDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceChange;
    }

    private static ResourceChangeJsonUnmarshaller instance;

    public static ResourceChangeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceChangeJsonUnmarshaller();
        return instance;
    }
}
