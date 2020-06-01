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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Ec2InstanceAttributes
 */
class Ec2InstanceAttributesJsonUnmarshaller implements
        Unmarshaller<Ec2InstanceAttributes, JsonUnmarshallerContext> {

    public Ec2InstanceAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Ec2InstanceAttributes ec2InstanceAttributes = new Ec2InstanceAttributes();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ec2KeyName")) {
                ec2InstanceAttributes.setEc2KeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ec2SubnetId")) {
                ec2InstanceAttributes.setEc2SubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestedEc2SubnetIds")) {
                ec2InstanceAttributes.setRequestedEc2SubnetIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Ec2AvailabilityZone")) {
                ec2InstanceAttributes.setEc2AvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestedEc2AvailabilityZones")) {
                ec2InstanceAttributes
                        .setRequestedEc2AvailabilityZones(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IamInstanceProfile")) {
                ec2InstanceAttributes.setIamInstanceProfile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmrManagedMasterSecurityGroup")) {
                ec2InstanceAttributes.setEmrManagedMasterSecurityGroup(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmrManagedSlaveSecurityGroup")) {
                ec2InstanceAttributes.setEmrManagedSlaveSecurityGroup(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceAccessSecurityGroup")) {
                ec2InstanceAttributes.setServiceAccessSecurityGroup(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdditionalMasterSecurityGroups")) {
                ec2InstanceAttributes
                        .setAdditionalMasterSecurityGroups(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AdditionalSlaveSecurityGroups")) {
                ec2InstanceAttributes
                        .setAdditionalSlaveSecurityGroups(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return ec2InstanceAttributes;
    }

    private static Ec2InstanceAttributesJsonUnmarshaller instance;

    public static Ec2InstanceAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ec2InstanceAttributesJsonUnmarshaller();
        return instance;
    }
}
