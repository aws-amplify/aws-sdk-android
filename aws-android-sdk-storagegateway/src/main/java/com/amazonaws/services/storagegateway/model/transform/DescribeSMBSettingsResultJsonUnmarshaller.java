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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeSMBSettingsResult
 */
public class DescribeSMBSettingsResultJsonUnmarshaller implements
        Unmarshaller<DescribeSMBSettingsResult, JsonUnmarshallerContext> {

    public DescribeSMBSettingsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSMBSettingsResult describeSMBSettingsResult = new DescribeSMBSettingsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("GatewayARN")) {
                describeSMBSettingsResult.setGatewayARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainName")) {
                describeSMBSettingsResult.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ActiveDirectoryStatus")) {
                describeSMBSettingsResult.setActiveDirectoryStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SMBGuestPasswordSet")) {
                describeSMBSettingsResult.setSMBGuestPasswordSet(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SMBSecurityStrategy")) {
                describeSMBSettingsResult.setSMBSecurityStrategy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeSMBSettingsResult;
    }

    private static DescribeSMBSettingsResultJsonUnmarshaller instance;

    public static DescribeSMBSettingsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSMBSettingsResultJsonUnmarshaller();
        return instance;
    }
}
