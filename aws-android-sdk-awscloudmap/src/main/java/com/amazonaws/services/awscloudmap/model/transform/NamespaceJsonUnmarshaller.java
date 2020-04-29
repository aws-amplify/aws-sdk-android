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

package com.amazonaws.services.awscloudmap.model.transform;

import com.amazonaws.services.awscloudmap.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Namespace
 */
class NamespaceJsonUnmarshaller implements Unmarshaller<Namespace, JsonUnmarshallerContext> {

    public Namespace unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Namespace namespace = new Namespace();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                namespace.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                namespace.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                namespace.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                namespace.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                namespace.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceCount")) {
                namespace.setServiceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Properties")) {
                namespace.setProperties(NamespacePropertiesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateDate")) {
                namespace.setCreateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatorRequestId")) {
                namespace.setCreatorRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return namespace;
    }

    private static NamespaceJsonUnmarshaller instance;

    public static NamespaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NamespaceJsonUnmarshaller();
        return instance;
    }
}
