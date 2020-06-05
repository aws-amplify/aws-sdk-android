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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SolutionConfig
 */
class SolutionConfigJsonUnmarshaller implements
        Unmarshaller<SolutionConfig, JsonUnmarshallerContext> {

    public SolutionConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SolutionConfig solutionConfig = new SolutionConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("eventValueThreshold")) {
                solutionConfig.setEventValueThreshold(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hpoConfig")) {
                solutionConfig.setHpoConfig(HPOConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("algorithmHyperParameters")) {
                solutionConfig.setAlgorithmHyperParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("featureTransformationParameters")) {
                solutionConfig.setFeatureTransformationParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("autoMLConfig")) {
                solutionConfig.setAutoMLConfig(AutoMLConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return solutionConfig;
    }

    private static SolutionConfigJsonUnmarshaller instance;

    public static SolutionConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SolutionConfigJsonUnmarshaller();
        return instance;
    }
}
