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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreatePortalResult
 */
public class CreatePortalResultJsonUnmarshaller implements
        Unmarshaller<CreatePortalResult, JsonUnmarshallerContext> {

    public CreatePortalResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePortalResult createPortalResult = new CreatePortalResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("portalId")) {
                createPortalResult.setPortalId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalArn")) {
                createPortalResult.setPortalArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalStartUrl")) {
                createPortalResult.setPortalStartUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalStatus")) {
                createPortalResult.setPortalStatus(PortalStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ssoApplicationId")) {
                createPortalResult.setSsoApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createPortalResult;
    }

    private static CreatePortalResultJsonUnmarshaller instance;

    public static CreatePortalResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePortalResultJsonUnmarshaller();
        return instance;
    }
}
