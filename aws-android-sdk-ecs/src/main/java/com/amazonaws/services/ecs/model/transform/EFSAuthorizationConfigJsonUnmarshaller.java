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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EFSAuthorizationConfig
 */
class EFSAuthorizationConfigJsonUnmarshaller implements
        Unmarshaller<EFSAuthorizationConfig, JsonUnmarshallerContext> {

    public EFSAuthorizationConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EFSAuthorizationConfig eFSAuthorizationConfig = new EFSAuthorizationConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("accessPointId")) {
                eFSAuthorizationConfig.setAccessPointId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("iam")) {
                eFSAuthorizationConfig.setIam(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return eFSAuthorizationConfig;
    }

    private static EFSAuthorizationConfigJsonUnmarshaller instance;

    public static EFSAuthorizationConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EFSAuthorizationConfigJsonUnmarshaller();
        return instance;
    }
}
