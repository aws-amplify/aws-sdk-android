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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO InstanceInformation
 */
class InstanceInformationJsonUnmarshaller implements Unmarshaller<InstanceInformation, JsonUnmarshallerContext> {

    public InstanceInformation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceInformation instanceInformation = new InstanceInformation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceId")) {
                instanceInformation.setInstanceId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PingStatus")) {
                instanceInformation.setPingStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastPingDateTime")) {
                instanceInformation.setLastPingDateTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("AgentVersion")) {
                instanceInformation.setAgentVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("IsLatestVersion")) {
                instanceInformation.setIsLatestVersion(BooleanJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PlatformType")) {
                instanceInformation.setPlatformType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PlatformName")) {
                instanceInformation.setPlatformName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PlatformVersion")) {
                instanceInformation.setPlatformVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ActivationId")) {
                instanceInformation.setActivationId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("IamRole")) {
                instanceInformation.setIamRole(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RegistrationDate")) {
                instanceInformation.setRegistrationDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ResourceType")) {
                instanceInformation.setResourceType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Name")) {
                instanceInformation.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("IPAddress")) {
                instanceInformation.setIPAddress(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ComputerName")) {
                instanceInformation.setComputerName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("AssociationStatus")) {
                instanceInformation.setAssociationStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastAssociationExecutionDate")) {
                instanceInformation.setLastAssociationExecutionDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastSuccessfulAssociationExecutionDate")) {
                instanceInformation.setLastSuccessfulAssociationExecutionDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("AssociationOverview")) {
                instanceInformation.setAssociationOverview(InstanceAggregatedAssociationOverviewJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceInformation;
    }

    private static InstanceInformationJsonUnmarshaller instance;
    public static InstanceInformationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new InstanceInformationJsonUnmarshaller();
        return instance;
    }
}
