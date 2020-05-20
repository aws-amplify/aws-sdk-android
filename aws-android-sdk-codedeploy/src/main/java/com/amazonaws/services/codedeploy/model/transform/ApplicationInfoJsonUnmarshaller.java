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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ApplicationInfo
 */
class ApplicationInfoJsonUnmarshaller implements
        Unmarshaller<ApplicationInfo, JsonUnmarshallerContext> {

    public ApplicationInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ApplicationInfo applicationInfo = new ApplicationInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("applicationId")) {
                applicationInfo.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("applicationName")) {
                applicationInfo.setApplicationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createTime")) {
                applicationInfo.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("linkedToGitHub")) {
                applicationInfo.setLinkedToGitHub(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gitHubAccountName")) {
                applicationInfo.setGitHubAccountName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("computePlatform")) {
                applicationInfo.setComputePlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return applicationInfo;
    }

    private static ApplicationInfoJsonUnmarshaller instance;

    public static ApplicationInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationInfoJsonUnmarshaller();
        return instance;
    }
}
