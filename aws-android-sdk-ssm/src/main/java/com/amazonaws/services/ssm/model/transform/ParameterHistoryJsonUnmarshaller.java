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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ParameterHistory
 */
class ParameterHistoryJsonUnmarshaller implements
        Unmarshaller<ParameterHistory, JsonUnmarshallerContext> {

    public ParameterHistory unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ParameterHistory parameterHistory = new ParameterHistory();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                parameterHistory.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                parameterHistory.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyId")) {
                parameterHistory.setKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                parameterHistory.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedUser")) {
                parameterHistory.setLastModifiedUser(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                parameterHistory.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Value")) {
                parameterHistory.setValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowedPattern")) {
                parameterHistory.setAllowedPattern(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                parameterHistory.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Labels")) {
                parameterHistory.setLabels(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tier")) {
                parameterHistory.setTier(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Policies")) {
                parameterHistory.setPolicies(new ListUnmarshaller<ParameterInlinePolicy>(
                        ParameterInlinePolicyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return parameterHistory;
    }

    private static ParameterHistoryJsonUnmarshaller instance;

    public static ParameterHistoryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParameterHistoryJsonUnmarshaller();
        return instance;
    }
}
