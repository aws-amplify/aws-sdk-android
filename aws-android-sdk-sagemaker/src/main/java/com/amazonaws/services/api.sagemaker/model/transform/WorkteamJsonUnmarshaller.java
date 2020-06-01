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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Workteam
 */
class WorkteamJsonUnmarshaller implements Unmarshaller<Workteam, JsonUnmarshallerContext> {

    public Workteam unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Workteam workteam = new Workteam();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WorkteamName")) {
                workteam.setWorkteamName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MemberDefinitions")) {
                workteam.setMemberDefinitions(new ListUnmarshaller<MemberDefinition>(
                        MemberDefinitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("WorkteamArn")) {
                workteam.setWorkteamArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductListingIds")) {
                workteam.setProductListingIds(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                workteam.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubDomain")) {
                workteam.setSubDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateDate")) {
                workteam.setCreateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedDate")) {
                workteam.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotificationConfiguration")) {
                workteam.setNotificationConfiguration(NotificationConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return workteam;
    }

    private static WorkteamJsonUnmarshaller instance;

    public static WorkteamJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkteamJsonUnmarshaller();
        return instance;
    }
}
