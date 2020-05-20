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
 * JSON unmarshaller for POJO InstanceInfo
 */
class InstanceInfoJsonUnmarshaller implements Unmarshaller<InstanceInfo, JsonUnmarshallerContext> {

    public InstanceInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceInfo instanceInfo = new InstanceInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("instanceName")) {
                instanceInfo.setInstanceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("iamSessionArn")) {
                instanceInfo.setIamSessionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("iamUserArn")) {
                instanceInfo.setIamUserArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("instanceArn")) {
                instanceInfo.setInstanceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("registerTime")) {
                instanceInfo.setRegisterTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deregisterTime")) {
                instanceInfo.setDeregisterTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                instanceInfo.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceInfo;
    }

    private static InstanceInfoJsonUnmarshaller instance;

    public static InstanceInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceInfoJsonUnmarshaller();
        return instance;
    }
}
