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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FailureDetails
 */
class FailureDetailsJsonUnmarshaller implements
        Unmarshaller<FailureDetails, JsonUnmarshallerContext> {

    public FailureDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FailureDetails failureDetails = new FailureDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FailureStage")) {
                failureDetails.setFailureStage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureType")) {
                failureDetails.setFailureType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Details")) {
                failureDetails.setDetails(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return failureDetails;
    }

    private static FailureDetailsJsonUnmarshaller instance;

    public static FailureDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FailureDetailsJsonUnmarshaller();
        return instance;
    }
}
