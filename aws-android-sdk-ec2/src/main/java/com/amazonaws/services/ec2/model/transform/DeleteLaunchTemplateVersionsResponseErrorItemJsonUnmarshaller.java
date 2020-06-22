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
 * JSON unmarshaller for POJO DeleteLaunchTemplateVersionsResponseErrorItem
 */
class DeleteLaunchTemplateVersionsResponseErrorItemJsonUnmarshaller implements
        Unmarshaller<DeleteLaunchTemplateVersionsResponseErrorItem, JsonUnmarshallerContext> {

    public DeleteLaunchTemplateVersionsResponseErrorItem unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DeleteLaunchTemplateVersionsResponseErrorItem deleteLaunchTemplateVersionsResponseErrorItem = new DeleteLaunchTemplateVersionsResponseErrorItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LaunchTemplateId")) {
                deleteLaunchTemplateVersionsResponseErrorItem
                        .setLaunchTemplateId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("LaunchTemplateName")) {
                deleteLaunchTemplateVersionsResponseErrorItem
                        .setLaunchTemplateName(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("VersionNumber")) {
                deleteLaunchTemplateVersionsResponseErrorItem.setVersionNumber(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResponseError")) {
                deleteLaunchTemplateVersionsResponseErrorItem
                        .setResponseError(ResponseErrorJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deleteLaunchTemplateVersionsResponseErrorItem;
    }

    private static DeleteLaunchTemplateVersionsResponseErrorItemJsonUnmarshaller instance;

    public static DeleteLaunchTemplateVersionsResponseErrorItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteLaunchTemplateVersionsResponseErrorItemJsonUnmarshaller();
        return instance;
    }
}
