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
 * JSON unmarshaller for POJO Algorithm
 */
class AlgorithmJsonUnmarshaller implements Unmarshaller<Algorithm, JsonUnmarshallerContext> {

    public Algorithm unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Algorithm algorithm = new Algorithm();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                algorithm.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("algorithmArn")) {
                algorithm.setAlgorithmArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("algorithmImage")) {
                algorithm.setAlgorithmImage(AlgorithmImageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("defaultHyperParameters")) {
                algorithm.setDefaultHyperParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("defaultHyperParameterRanges")) {
                algorithm
                        .setDefaultHyperParameterRanges(DefaultHyperParameterRangesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("defaultResourceConfig")) {
                algorithm.setDefaultResourceConfig(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("trainingInputMode")) {
                algorithm.setTrainingInputMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("roleArn")) {
                algorithm.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDateTime")) {
                algorithm.setCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDateTime")) {
                algorithm.setLastUpdatedDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return algorithm;
    }

    private static AlgorithmJsonUnmarshaller instance;

    public static AlgorithmJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AlgorithmJsonUnmarshaller();
        return instance;
    }
}
