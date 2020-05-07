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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DeleteLaunchTemplateVersionsResult
 */
public class DeleteLaunchTemplateVersionsResultJsonUnmarshaller implements
        Unmarshaller<DeleteLaunchTemplateVersionsResult, JsonUnmarshallerContext> {

    public DeleteLaunchTemplateVersionsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DeleteLaunchTemplateVersionsResult deleteLaunchTemplateVersionsResult = new DeleteLaunchTemplateVersionsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SuccessfullyDeletedLaunchTemplateVersions")) {
                deleteLaunchTemplateVersionsResult
                        .setSuccessfullyDeletedLaunchTemplateVersions(new ListUnmarshaller<DeleteLaunchTemplateVersionsResponseSuccessItem>(
                                DeleteLaunchTemplateVersionsResponseSuccessItemJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UnsuccessfullyDeletedLaunchTemplateVersions")) {
                deleteLaunchTemplateVersionsResult
                        .setUnsuccessfullyDeletedLaunchTemplateVersions(new ListUnmarshaller<DeleteLaunchTemplateVersionsResponseErrorItem>(
                                DeleteLaunchTemplateVersionsResponseErrorItemJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteLaunchTemplateVersionsResult;
    }

    private static DeleteLaunchTemplateVersionsResultJsonUnmarshaller instance;

    public static DeleteLaunchTemplateVersionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteLaunchTemplateVersionsResultJsonUnmarshaller();
        return instance;
    }
}
