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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AccessPolicySummary
 */
class AccessPolicySummaryJsonUnmarshaller implements
        Unmarshaller<AccessPolicySummary, JsonUnmarshallerContext> {

    public AccessPolicySummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AccessPolicySummary accessPolicySummary = new AccessPolicySummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                accessPolicySummary.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("identity")) {
                accessPolicySummary.setIdentity(IdentityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resource")) {
                accessPolicySummary.setResource(ResourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("permission")) {
                accessPolicySummary.setPermission(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                accessPolicySummary.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdateDate")) {
                accessPolicySummary.setLastUpdateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return accessPolicySummary;
    }

    private static AccessPolicySummaryJsonUnmarshaller instance;

    public static AccessPolicySummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccessPolicySummaryJsonUnmarshaller();
        return instance;
    }
}
