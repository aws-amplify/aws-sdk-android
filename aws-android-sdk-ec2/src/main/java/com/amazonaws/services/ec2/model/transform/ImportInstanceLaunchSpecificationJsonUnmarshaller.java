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
 * JSON unmarshaller for POJO ImportInstanceLaunchSpecification
 */
class ImportInstanceLaunchSpecificationJsonUnmarshaller implements
        Unmarshaller<ImportInstanceLaunchSpecification, JsonUnmarshallerContext> {

    public ImportInstanceLaunchSpecification unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImportInstanceLaunchSpecification importInstanceLaunchSpecification = new ImportInstanceLaunchSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdditionalInfo")) {
                importInstanceLaunchSpecification.setAdditionalInfo(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Architecture")) {
                importInstanceLaunchSpecification.setArchitecture(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupIds")) {
                importInstanceLaunchSpecification.setGroupIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("GroupNames")) {
                importInstanceLaunchSpecification.setGroupNames(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InstanceInitiatedShutdownBehavior")) {
                importInstanceLaunchSpecification
                        .setInstanceInitiatedShutdownBehavior(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                importInstanceLaunchSpecification.setInstanceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Monitoring")) {
                importInstanceLaunchSpecification.setMonitoring(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Placement")) {
                importInstanceLaunchSpecification.setPlacement(PlacementJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateIpAddress")) {
                importInstanceLaunchSpecification.setPrivateIpAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                importInstanceLaunchSpecification.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserData")) {
                importInstanceLaunchSpecification.setUserData(UserDataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return importInstanceLaunchSpecification;
    }

    private static ImportInstanceLaunchSpecificationJsonUnmarshaller instance;

    public static ImportInstanceLaunchSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportInstanceLaunchSpecificationJsonUnmarshaller();
        return instance;
    }
}
