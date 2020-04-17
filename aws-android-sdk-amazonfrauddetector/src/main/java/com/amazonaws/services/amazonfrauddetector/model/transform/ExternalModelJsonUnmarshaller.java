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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ExternalModel
 */
class ExternalModelJsonUnmarshaller implements Unmarshaller<ExternalModel, JsonUnmarshallerContext> {

    public ExternalModel unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ExternalModel externalModel = new ExternalModel();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("modelEndpoint")) {
                externalModel.setModelEndpoint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("modelSource")) {
                externalModel.setModelSource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("role")) {
                externalModel.setRole(RoleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("inputConfiguration")) {
                externalModel.setInputConfiguration(ModelInputConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("outputConfiguration")) {
                externalModel.setOutputConfiguration(ModelOutputConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("modelEndpointStatus")) {
                externalModel.setModelEndpointStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedTime")) {
                externalModel.setLastUpdatedTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdTime")) {
                externalModel.setCreatedTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return externalModel;
    }

    private static ExternalModelJsonUnmarshaller instance;

    public static ExternalModelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExternalModelJsonUnmarshaller();
        return instance;
    }
}
