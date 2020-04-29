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
 * JSON unmarshaller for POJO NamespaceSummary
 */
class NamespaceSummaryJsonUnmarshaller implements
        Unmarshaller<NamespaceSummary, JsonUnmarshallerContext> {

    public NamespaceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NamespaceSummary namespaceSummary = new NamespaceSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                namespaceSummary.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                namespaceSummary.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                namespaceSummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                namespaceSummary.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                namespaceSummary.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceCount")) {
                namespaceSummary.setServiceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Properties")) {
                namespaceSummary.setProperties(NamespacePropertiesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateDate")) {
                namespaceSummary.setCreateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return namespaceSummary;
    }

    private static NamespaceSummaryJsonUnmarshaller instance;

    public static NamespaceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NamespaceSummaryJsonUnmarshaller();
        return instance;
    }
}
