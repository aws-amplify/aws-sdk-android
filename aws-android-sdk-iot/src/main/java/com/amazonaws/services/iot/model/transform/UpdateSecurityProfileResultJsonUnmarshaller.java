/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateSecurityProfileResult
 */
public class UpdateSecurityProfileResultJsonUnmarshaller implements
        Unmarshaller<UpdateSecurityProfileResult, JsonUnmarshallerContext> {

    public UpdateSecurityProfileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSecurityProfileResult updateSecurityProfileResult = new UpdateSecurityProfileResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("securityProfileName")) {
                updateSecurityProfileResult.setSecurityProfileName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("securityProfileArn")) {
                updateSecurityProfileResult.setSecurityProfileArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("securityProfileDescription")) {
                updateSecurityProfileResult.setSecurityProfileDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("behaviors")) {
                updateSecurityProfileResult.setBehaviors(new ListUnmarshaller<Behavior>(
                        BehaviorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("alertTargets")) {
                updateSecurityProfileResult.setAlertTargets(new MapUnmarshaller<AlertTarget>(
                        AlertTargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("version")) {
                updateSecurityProfileResult.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                updateSecurityProfileResult.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                updateSecurityProfileResult.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateSecurityProfileResult;
    }

    private static UpdateSecurityProfileResultJsonUnmarshaller instance;

    public static UpdateSecurityProfileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSecurityProfileResultJsonUnmarshaller();
        return instance;
    }
}
