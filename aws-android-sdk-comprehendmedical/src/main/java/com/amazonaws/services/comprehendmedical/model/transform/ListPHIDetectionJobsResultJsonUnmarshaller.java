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
 * JSON unmarshaller for response ListPHIDetectionJobsResult
 */
public class ListPHIDetectionJobsResultJsonUnmarshaller implements
        Unmarshaller<ListPHIDetectionJobsResult, JsonUnmarshallerContext> {

    public ListPHIDetectionJobsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListPHIDetectionJobsResult listPHIDetectionJobsResult = new ListPHIDetectionJobsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ComprehendMedicalAsyncJobPropertiesList")) {
                listPHIDetectionJobsResult
                        .setComprehendMedicalAsyncJobPropertiesList(new ListUnmarshaller<ComprehendMedicalAsyncJobProperties>(
                                ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listPHIDetectionJobsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listPHIDetectionJobsResult;
    }

    private static ListPHIDetectionJobsResultJsonUnmarshaller instance;

    public static ListPHIDetectionJobsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListPHIDetectionJobsResultJsonUnmarshaller();
        return instance;
    }
}
