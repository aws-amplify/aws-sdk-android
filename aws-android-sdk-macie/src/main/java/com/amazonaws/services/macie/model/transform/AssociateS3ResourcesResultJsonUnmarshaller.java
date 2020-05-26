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

package com.amazonaws.services.macie.model.transform;

import com.amazonaws.services.macie.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response AssociateS3ResourcesResult
 */
public class AssociateS3ResourcesResultJsonUnmarshaller implements
        Unmarshaller<AssociateS3ResourcesResult, JsonUnmarshallerContext> {

    public AssociateS3ResourcesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssociateS3ResourcesResult associateS3ResourcesResult = new AssociateS3ResourcesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("failedS3Resources")) {
                associateS3ResourcesResult
                        .setFailedS3Resources(new ListUnmarshaller<FailedS3Resource>(
                                FailedS3ResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return associateS3ResourcesResult;
    }

    private static AssociateS3ResourcesResultJsonUnmarshaller instance;

    public static AssociateS3ResourcesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateS3ResourcesResultJsonUnmarshaller();
        return instance;
    }
}
