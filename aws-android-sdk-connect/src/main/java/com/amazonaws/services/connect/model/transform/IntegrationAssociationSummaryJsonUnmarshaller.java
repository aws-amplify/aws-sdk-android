/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO IntegrationAssociationSummary
 */
class IntegrationAssociationSummaryJsonUnmarshaller implements
        Unmarshaller<IntegrationAssociationSummary, JsonUnmarshallerContext> {

    public IntegrationAssociationSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        IntegrationAssociationSummary integrationAssociationSummary = new IntegrationAssociationSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IntegrationAssociationId")) {
                integrationAssociationSummary.setIntegrationAssociationId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationAssociationArn")) {
                integrationAssociationSummary.setIntegrationAssociationArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                integrationAssociationSummary.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationType")) {
                integrationAssociationSummary.setIntegrationType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntegrationArn")) {
                integrationAssociationSummary.setIntegrationArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceApplicationUrl")) {
                integrationAssociationSummary.setSourceApplicationUrl(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceApplicationName")) {
                integrationAssociationSummary.setSourceApplicationName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceType")) {
                integrationAssociationSummary.setSourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return integrationAssociationSummary;
    }

    private static IntegrationAssociationSummaryJsonUnmarshaller instance;

    public static IntegrationAssociationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IntegrationAssociationSummaryJsonUnmarshaller();
        return instance;
    }
}
