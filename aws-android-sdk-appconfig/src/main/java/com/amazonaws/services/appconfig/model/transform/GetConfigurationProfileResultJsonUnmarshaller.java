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

package com.amazonaws.services.appconfig.model.transform;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetConfigurationProfileResult
 */
public class GetConfigurationProfileResultJsonUnmarshaller implements
        Unmarshaller<GetConfigurationProfileResult, JsonUnmarshallerContext> {

    public GetConfigurationProfileResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetConfigurationProfileResult getConfigurationProfileResult = new GetConfigurationProfileResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                getConfigurationProfileResult.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                getConfigurationProfileResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                getConfigurationProfileResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                getConfigurationProfileResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocationUri")) {
                getConfigurationProfileResult.setLocationUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RetrievalRoleArn")) {
                getConfigurationProfileResult.setRetrievalRoleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Validators")) {
                getConfigurationProfileResult.setValidators(new ListUnmarshaller<Validator>(
                        ValidatorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getConfigurationProfileResult;
    }

    private static GetConfigurationProfileResultJsonUnmarshaller instance;

    public static GetConfigurationProfileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetConfigurationProfileResultJsonUnmarshaller();
        return instance;
    }
}
