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

package com.amazonaws.services.awselementalmediapackagevod.model.transform;

import com.amazonaws.services.awselementalmediapackagevod.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreatePackagingConfigurationResult
 */
public class CreatePackagingConfigurationResultJsonUnmarshaller implements
        Unmarshaller<CreatePackagingConfigurationResult, JsonUnmarshallerContext> {

    public CreatePackagingConfigurationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreatePackagingConfigurationResult createPackagingConfigurationResult = new CreatePackagingConfigurationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                createPackagingConfigurationResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CmafPackage")) {
                createPackagingConfigurationResult.setCmafPackage(CmafPackageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DashPackage")) {
                createPackagingConfigurationResult.setDashPackage(DashPackageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HlsPackage")) {
                createPackagingConfigurationResult.setHlsPackage(HlsPackageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                createPackagingConfigurationResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MssPackage")) {
                createPackagingConfigurationResult.setMssPackage(MssPackageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PackagingGroupId")) {
                createPackagingConfigurationResult.setPackagingGroupId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                createPackagingConfigurationResult.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createPackagingConfigurationResult;
    }

    private static CreatePackagingConfigurationResultJsonUnmarshaller instance;

    public static CreatePackagingConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePackagingConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
