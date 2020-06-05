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
 * JSON unmarshaller for POJO Solution
 */
class SolutionJsonUnmarshaller implements Unmarshaller<Solution, JsonUnmarshallerContext> {

    public Solution unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Solution solution = new Solution();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                solution.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("solutionArn")) {
                solution.setSolutionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("performHPO")) {
                solution.setPerformHPO(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("performAutoML")) {
                solution.setPerformAutoML(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("recipeArn")) {
                solution.setRecipeArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("datasetGroupArn")) {
                solution.setDatasetGroupArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventType")) {
                solution.setEventType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("solutionConfig")) {
                solution.setSolutionConfig(SolutionConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("autoMLResult")) {
                solution.setAutoMLResult(AutoMLResultJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                solution.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDateTime")) {
                solution.setCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDateTime")) {
                solution.setLastUpdatedDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("latestSolutionVersion")) {
                solution.setLatestSolutionVersion(SolutionVersionSummaryJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return solution;
    }

    private static SolutionJsonUnmarshaller instance;

    public static SolutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SolutionJsonUnmarshaller();
        return instance;
    }
}
