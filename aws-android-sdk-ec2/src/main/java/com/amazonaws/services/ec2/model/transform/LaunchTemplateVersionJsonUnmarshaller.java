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
 * JSON unmarshaller for POJO LaunchTemplateVersion
 */
class LaunchTemplateVersionJsonUnmarshaller implements
        Unmarshaller<LaunchTemplateVersion, JsonUnmarshallerContext> {

    public LaunchTemplateVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LaunchTemplateVersion launchTemplateVersion = new LaunchTemplateVersion();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LaunchTemplateId")) {
                launchTemplateVersion.setLaunchTemplateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LaunchTemplateName")) {
                launchTemplateVersion.setLaunchTemplateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VersionNumber")) {
                launchTemplateVersion.setVersionNumber(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VersionDescription")) {
                launchTemplateVersion.setVersionDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                launchTemplateVersion.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                launchTemplateVersion.setCreatedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultVersion")) {
                launchTemplateVersion.setDefaultVersion(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LaunchTemplateData")) {
                launchTemplateVersion
                        .setLaunchTemplateData(ResponseLaunchTemplateDataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return launchTemplateVersion;
    }

    private static LaunchTemplateVersionJsonUnmarshaller instance;

    public static LaunchTemplateVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateVersionJsonUnmarshaller();
        return instance;
    }
}
