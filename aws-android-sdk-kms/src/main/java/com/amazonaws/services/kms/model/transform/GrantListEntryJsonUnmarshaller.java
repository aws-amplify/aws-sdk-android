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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO GrantListEntry
 */
class GrantListEntryJsonUnmarshaller implements
        Unmarshaller<GrantListEntry, JsonUnmarshallerContext> {

    public GrantListEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GrantListEntry grantListEntry = new GrantListEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("KeyId")) {
                grantListEntry.setKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GrantId")) {
                grantListEntry.setGrantId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                grantListEntry.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                grantListEntry.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GranteePrincipal")) {
                grantListEntry.setGranteePrincipal(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RetiringPrincipal")) {
                grantListEntry.setRetiringPrincipal(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IssuingAccount")) {
                grantListEntry.setIssuingAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Operations")) {
                grantListEntry.setOperations(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Constraints")) {
                grantListEntry.setConstraints(GrantConstraintsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return grantListEntry;
    }

    private static GrantListEntryJsonUnmarshaller instance;

    public static GrantListEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GrantListEntryJsonUnmarshaller();
        return instance;
    }
}
