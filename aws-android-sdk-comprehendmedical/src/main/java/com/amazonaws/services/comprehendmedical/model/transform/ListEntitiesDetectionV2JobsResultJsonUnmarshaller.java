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
 * JSON unmarshaller for response ListEntitiesDetectionV2JobsResult
 */
public class ListEntitiesDetectionV2JobsResultJsonUnmarshaller implements
        Unmarshaller<ListEntitiesDetectionV2JobsResult, JsonUnmarshallerContext> {

    public ListEntitiesDetectionV2JobsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListEntitiesDetectionV2JobsResult listEntitiesDetectionV2JobsResult = new ListEntitiesDetectionV2JobsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ComprehendMedicalAsyncJobPropertiesList")) {
                listEntitiesDetectionV2JobsResult
                        .setComprehendMedicalAsyncJobPropertiesList(new ListUnmarshaller<ComprehendMedicalAsyncJobProperties>(
                                ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listEntitiesDetectionV2JobsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listEntitiesDetectionV2JobsResult;
    }

    private static ListEntitiesDetectionV2JobsResultJsonUnmarshaller instance;

    public static ListEntitiesDetectionV2JobsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListEntitiesDetectionV2JobsResultJsonUnmarshaller();
        return instance;
    }
}
