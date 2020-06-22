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
 * JSON unmarshaller for POJO PublicIpv4Pool
 */
class PublicIpv4PoolJsonUnmarshaller implements
        Unmarshaller<PublicIpv4Pool, JsonUnmarshallerContext> {

    public PublicIpv4Pool unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PublicIpv4Pool publicIpv4Pool = new PublicIpv4Pool();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PoolId")) {
                publicIpv4Pool.setPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                publicIpv4Pool.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PoolAddressRanges")) {
                publicIpv4Pool.setPoolAddressRanges(new ListUnmarshaller<PublicIpv4PoolRange>(
                        PublicIpv4PoolRangeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TotalAddressCount")) {
                publicIpv4Pool.setTotalAddressCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalAvailableAddressCount")) {
                publicIpv4Pool.setTotalAvailableAddressCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkBorderGroup")) {
                publicIpv4Pool.setNetworkBorderGroup(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                publicIpv4Pool.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return publicIpv4Pool;
    }

    private static PublicIpv4PoolJsonUnmarshaller instance;

    public static PublicIpv4PoolJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PublicIpv4PoolJsonUnmarshaller();
        return instance;
    }
}
