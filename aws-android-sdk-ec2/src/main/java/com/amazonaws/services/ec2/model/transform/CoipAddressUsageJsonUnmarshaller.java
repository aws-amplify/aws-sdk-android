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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CoipAddressUsage
 */
class CoipAddressUsageJsonUnmarshaller implements
        Unmarshaller<CoipAddressUsage, JsonUnmarshallerContext> {

    public CoipAddressUsage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CoipAddressUsage coipAddressUsage = new CoipAddressUsage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AllocationId")) {
                coipAddressUsage.setAllocationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsAccountId")) {
                coipAddressUsage.setAwsAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsService")) {
                coipAddressUsage.setAwsService(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CoIp")) {
                coipAddressUsage.setCoIp(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return coipAddressUsage;
    }

    private static CoipAddressUsageJsonUnmarshaller instance;

    public static CoipAddressUsageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CoipAddressUsageJsonUnmarshaller();
        return instance;
    }
}
