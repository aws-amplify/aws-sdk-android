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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DelegatedAdministrator
 */
class DelegatedAdministratorJsonUnmarshaller implements
        Unmarshaller<DelegatedAdministrator, JsonUnmarshallerContext> {

    public DelegatedAdministrator unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DelegatedAdministrator delegatedAdministrator = new DelegatedAdministrator();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                delegatedAdministrator.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                delegatedAdministrator.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Email")) {
                delegatedAdministrator.setEmail(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                delegatedAdministrator.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                delegatedAdministrator.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JoinedMethod")) {
                delegatedAdministrator.setJoinedMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JoinedTimestamp")) {
                delegatedAdministrator.setJoinedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DelegationEnabledDate")) {
                delegatedAdministrator.setDelegationEnabledDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return delegatedAdministrator;
    }

    private static DelegatedAdministratorJsonUnmarshaller instance;

    public static DelegatedAdministratorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DelegatedAdministratorJsonUnmarshaller();
        return instance;
    }
}
