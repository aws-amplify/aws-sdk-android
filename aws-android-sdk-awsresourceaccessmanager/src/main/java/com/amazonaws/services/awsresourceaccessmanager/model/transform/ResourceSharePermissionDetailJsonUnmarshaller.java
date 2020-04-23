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
 * JSON unmarshaller for POJO ResourceSharePermissionDetail
 */
class ResourceSharePermissionDetailJsonUnmarshaller implements
        Unmarshaller<ResourceSharePermissionDetail, JsonUnmarshallerContext> {

    public ResourceSharePermissionDetail unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceSharePermissionDetail resourceSharePermissionDetail = new ResourceSharePermissionDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                resourceSharePermissionDetail.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                resourceSharePermissionDetail.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("defaultVersion")) {
                resourceSharePermissionDetail.setDefaultVersion(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                resourceSharePermissionDetail.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                resourceSharePermissionDetail.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("permission")) {
                resourceSharePermissionDetail.setPermission(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationTime")) {
                resourceSharePermissionDetail.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedTime")) {
                resourceSharePermissionDetail.setLastUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceSharePermissionDetail;
    }

    private static ResourceSharePermissionDetailJsonUnmarshaller instance;

    public static ResourceSharePermissionDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceSharePermissionDetailJsonUnmarshaller();
        return instance;
    }
}
