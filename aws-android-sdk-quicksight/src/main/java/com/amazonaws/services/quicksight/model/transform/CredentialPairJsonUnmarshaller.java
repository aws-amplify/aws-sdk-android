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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CredentialPair
 */
class CredentialPairJsonUnmarshaller implements
        Unmarshaller<CredentialPair, JsonUnmarshallerContext> {

    public CredentialPair unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CredentialPair credentialPair = new CredentialPair();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Username")) {
                credentialPair.setUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Password")) {
                credentialPair.setPassword(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AlternateDataSourceParameters")) {
                credentialPair
                        .setAlternateDataSourceParameters(new ListUnmarshaller<DataSourceParameters>(
                                DataSourceParametersJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return credentialPair;
    }

    private static CredentialPairJsonUnmarshaller instance;

    public static CredentialPairJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CredentialPairJsonUnmarshaller();
        return instance;
    }
}
