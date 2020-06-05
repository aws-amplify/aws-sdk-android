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
 * JSON unmarshaller for POJO SolutionVersion
 */
class SolutionVersionJsonUnmarshaller implements
        Unmarshaller<SolutionVersion, JsonUnmarshallerContext> {

    public SolutionVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SolutionVersion solutionVersion = new SolutionVersion();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("solutionVersionArn")) {
                solutionVersion.setSolutionVersionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("solutionArn")) {
                solutionVersion.setSolutionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("performHPO")) {
                solutionVersion.setPerformHPO(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("performAutoML")) {
                solutionVersion.setPerformAutoML(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("recipeArn")) {
                solutionVersion.setRecipeArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventType")) {
                solutionVersion.setEventType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("datasetGroupArn")) {
                solutionVersion.setDatasetGroupArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("solutionConfig")) {
                solutionVersion.setSolutionConfig(SolutionConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("trainingHours")) {
                solutionVersion.setTrainingHours(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("trainingMode")) {
                solutionVersion.setTrainingMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tunedHPOParams")) {
                solutionVersion.setTunedHPOParams(TunedHPOParamsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                solutionVersion.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("failureReason")) {
                solutionVersion.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDateTime")) {
                solutionVersion.setCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDateTime")) {
                solutionVersion.setLastUpdatedDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return solutionVersion;
    }

    private static SolutionVersionJsonUnmarshaller instance;

    public static SolutionVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SolutionVersionJsonUnmarshaller();
        return instance;
    }
}
