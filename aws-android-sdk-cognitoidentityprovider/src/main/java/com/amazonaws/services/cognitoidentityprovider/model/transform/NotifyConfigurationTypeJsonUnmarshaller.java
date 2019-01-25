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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NotifyConfigurationType
 */
class NotifyConfigurationTypeJsonUnmarshaller implements
        Unmarshaller<NotifyConfigurationType, JsonUnmarshallerContext> {

    public NotifyConfigurationType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NotifyConfigurationType notifyConfigurationType = new NotifyConfigurationType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("From")) {
                notifyConfigurationType.setFrom(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplyTo")) {
                notifyConfigurationType.setReplyTo(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceArn")) {
                notifyConfigurationType.setSourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BlockEmail")) {
                notifyConfigurationType.setBlockEmail(NotifyEmailTypeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NoActionEmail")) {
                notifyConfigurationType.setNoActionEmail(NotifyEmailTypeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MfaEmail")) {
                notifyConfigurationType.setMfaEmail(NotifyEmailTypeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return notifyConfigurationType;
    }

    private static NotifyConfigurationTypeJsonUnmarshaller instance;

    public static NotifyConfigurationTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NotifyConfigurationTypeJsonUnmarshaller();
        return instance;
    }
}
