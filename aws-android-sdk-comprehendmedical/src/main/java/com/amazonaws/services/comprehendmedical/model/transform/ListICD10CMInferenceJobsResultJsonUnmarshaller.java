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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListICD10CMInferenceJobsResult
 */
public class ListICD10CMInferenceJobsResultJsonUnmarshaller implements
        Unmarshaller<ListICD10CMInferenceJobsResult, JsonUnmarshallerContext> {

    public ListICD10CMInferenceJobsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListICD10CMInferenceJobsResult listICD10CMInferenceJobsResult = new ListICD10CMInferenceJobsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ComprehendMedicalAsyncJobPropertiesList")) {
                listICD10CMInferenceJobsResult
                        .setComprehendMedicalAsyncJobPropertiesList(new ListUnmarshaller<ComprehendMedicalAsyncJobProperties>(
                                ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listICD10CMInferenceJobsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listICD10CMInferenceJobsResult;
    }

    private static ListICD10CMInferenceJobsResultJsonUnmarshaller instance;

    public static ListICD10CMInferenceJobsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListICD10CMInferenceJobsResultJsonUnmarshaller();
        return instance;
    }
}
