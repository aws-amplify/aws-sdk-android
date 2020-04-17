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
 * JSON unmarshaller for response GetDetectorVersionResult
 */
public class GetDetectorVersionResultJsonUnmarshaller implements
        Unmarshaller<GetDetectorVersionResult, JsonUnmarshallerContext> {

    public GetDetectorVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDetectorVersionResult getDetectorVersionResult = new GetDetectorVersionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("detectorId")) {
                getDetectorVersionResult.setDetectorId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("detectorVersionId")) {
                getDetectorVersionResult.setDetectorVersionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                getDetectorVersionResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("externalModelEndpoints")) {
                getDetectorVersionResult.setExternalModelEndpoints(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("modelVersions")) {
                getDetectorVersionResult.setModelVersions(new ListUnmarshaller<ModelVersion>(
                        ModelVersionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("rules")) {
                getDetectorVersionResult.setRules(new ListUnmarshaller<Rule>(RuleJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                getDetectorVersionResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedTime")) {
                getDetectorVersionResult.setLastUpdatedTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdTime")) {
                getDetectorVersionResult.setCreatedTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ruleExecutionMode")) {
                getDetectorVersionResult.setRuleExecutionMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDetectorVersionResult;
    }

    private static GetDetectorVersionResultJsonUnmarshaller instance;

    public static GetDetectorVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDetectorVersionResultJsonUnmarshaller();
        return instance;
    }
}
