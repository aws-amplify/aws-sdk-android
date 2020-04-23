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

package com.amazonaws.services.awsresourceaccessmanager.model.transform;

import com.amazonaws.services.awsresourceaccessmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ResourceShareAssociation
 */
class ResourceShareAssociationJsonUnmarshaller implements
        Unmarshaller<ResourceShareAssociation, JsonUnmarshallerContext> {

    public ResourceShareAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceShareAssociation resourceShareAssociation = new ResourceShareAssociation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("resourceShareArn")) {
                resourceShareAssociation.setResourceShareArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceShareName")) {
                resourceShareAssociation.setResourceShareName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("associatedEntity")) {
                resourceShareAssociation.setAssociatedEntity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("associationType")) {
                resourceShareAssociation.setAssociationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                resourceShareAssociation.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("statusMessage")) {
                resourceShareAssociation.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationTime")) {
                resourceShareAssociation.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedTime")) {
                resourceShareAssociation.setLastUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("external")) {
                resourceShareAssociation.setExternal(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceShareAssociation;
    }

    private static ResourceShareAssociationJsonUnmarshaller instance;

    public static ResourceShareAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceShareAssociationJsonUnmarshaller();
        return instance;
    }
}
