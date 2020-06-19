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
package com.amazonaws.services.opsworks-cm.model.transform;

import com.amazonaws.services.opsworks-cm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO Server
 */
class ServerJsonUnmarshaller implements Unmarshaller<Server, JsonUnmarshallerContext> {

    public Server unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Server server = new Server();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssociatePublicIpAddress")) {
                server.setAssociatePublicIpAddress(BooleanJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("BackupRetentionCount")) {
                server.setBackupRetentionCount(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ServerName")) {
                server.setServerName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                server.setCreatedAt(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CloudFormationStackArn")) {
                server.setCloudFormationStackArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CustomDomain")) {
                server.setCustomDomain(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DisableAutomatedBackup")) {
                server.setDisableAutomatedBackup(BooleanJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Endpoint")) {
                server.setEndpoint(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Engine")) {
                server.setEngine(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("EngineModel")) {
                server.setEngineModel(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("EngineAttributes")) {
                server.setEngineAttributes(new ListUnmarshaller<EngineAttribute>(EngineAttributeJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("EngineVersion")) {
                server.setEngineVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstanceProfileArn")) {
                server.setInstanceProfileArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstanceType")) {
                server.setInstanceType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("KeyPair")) {
                server.setKeyPair(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MaintenanceStatus")) {
                server.setMaintenanceStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PreferredMaintenanceWindow")) {
                server.setPreferredMaintenanceWindow(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PreferredBackupWindow")) {
                server.setPreferredBackupWindow(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SecurityGroupIds")) {
                server.setSecurityGroupIds(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("ServiceRoleArn")) {
                server.setServiceRoleArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Status")) {
                server.setStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StatusReason")) {
                server.setStatusReason(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SubnetIds")) {
                server.setSubnetIds(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("ServerArn")) {
                server.setServerArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return server;
    }

    private static ServerJsonUnmarshaller instance;
    public static ServerJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ServerJsonUnmarshaller();
        return instance;
    }
}
