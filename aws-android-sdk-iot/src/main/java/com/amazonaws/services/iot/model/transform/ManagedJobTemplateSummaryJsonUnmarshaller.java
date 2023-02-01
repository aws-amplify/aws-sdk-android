/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ManagedJobTemplateSummary
 */
class ManagedJobTemplateSummaryJsonUnmarshaller implements
        Unmarshaller<ManagedJobTemplateSummary, JsonUnmarshallerContext> {

    public ManagedJobTemplateSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ManagedJobTemplateSummary managedJobTemplateSummary = new ManagedJobTemplateSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("templateArn")) {
                managedJobTemplateSummary.setTemplateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("templateName")) {
                managedJobTemplateSummary.setTemplateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                managedJobTemplateSummary.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("environments")) {
                managedJobTemplateSummary.setEnvironments(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("templateVersion")) {
                managedJobTemplateSummary.setTemplateVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return managedJobTemplateSummary;
    }

    private static ManagedJobTemplateSummaryJsonUnmarshaller instance;

    public static ManagedJobTemplateSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ManagedJobTemplateSummaryJsonUnmarshaller();
        return instance;
    }
}
