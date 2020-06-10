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
 * JSON unmarshaller for POJO Host
 */
class HostJsonUnmarshaller implements Unmarshaller<Host, JsonUnmarshallerContext> {

    public Host unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Host host = new Host();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AutoPlacement")) {
                host.setAutoPlacement(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZone")) {
                host.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailableCapacity")) {
                host.setAvailableCapacity(AvailableCapacityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientToken")) {
                host.setClientToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostId")) {
                host.setHostId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostProperties")) {
                host.setHostProperties(HostPropertiesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostReservationId")) {
                host.setHostReservationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Instances")) {
                host.setInstances(new ListUnmarshaller<HostInstance>(HostInstanceJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("State")) {
                host.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllocationTime")) {
                host.setAllocationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReleaseTime")) {
                host.setReleaseTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                host.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("HostRecovery")) {
                host.setHostRecovery(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowsMultipleInstanceTypes")) {
                host.setAllowsMultipleInstanceTypes(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                host.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZoneId")) {
                host.setAvailabilityZoneId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MemberOfServiceLinkedResourceGroup")) {
                host.setMemberOfServiceLinkedResourceGroup(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return host;
    }

    private static HostJsonUnmarshaller instance;

    public static HostJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HostJsonUnmarshaller();
        return instance;
    }
}
