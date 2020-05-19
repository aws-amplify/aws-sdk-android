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
 * JSON unmarshaller for POJO Placement
 */
class PlacementJsonUnmarshaller implements Unmarshaller<Placement, JsonUnmarshallerContext> {

    public Placement unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Placement placement = new Placement();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AvailabilityZone")) {
                placement.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Affinity")) {
                placement.setAffinity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupName")) {
                placement.setGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PartitionNumber")) {
                placement.setPartitionNumber(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostId")) {
                placement.setHostId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tenancy")) {
                placement.setTenancy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpreadDomain")) {
                placement.setSpreadDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostResourceGroupArn")) {
                placement.setHostResourceGroupArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return placement;
    }

    private static PlacementJsonUnmarshaller instance;

    public static PlacementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlacementJsonUnmarshaller();
        return instance;
    }
}
