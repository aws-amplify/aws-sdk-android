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
 * JSON unmarshaller for POJO Backup
 */
class BackupJsonUnmarshaller implements Unmarshaller<Backup, JsonUnmarshallerContext> {

    public Backup unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Backup backup = new Backup();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BackupArn")) {
                backup.setBackupArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("BackupId")) {
                backup.setBackupId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("BackupType")) {
                backup.setBackupType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                backup.setCreatedAt(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Description")) {
                backup.setDescription(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Engine")) {
                backup.setEngine(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("EngineModel")) {
                backup.setEngineModel(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("EngineVersion")) {
                backup.setEngineVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstanceProfileArn")) {
                backup.setInstanceProfileArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstanceType")) {
                backup.setInstanceType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("KeyPair")) {
                backup.setKeyPair(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PreferredBackupWindow")) {
                backup.setPreferredBackupWindow(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PreferredMaintenanceWindow")) {
                backup.setPreferredMaintenanceWindow(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("S3DataSize")) {
                backup.setS3DataSize(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("S3DataUrl")) {
                backup.setS3DataUrl(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("S3LogUrl")) {
                backup.setS3LogUrl(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SecurityGroupIds")) {
                backup.setSecurityGroupIds(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("ServerName")) {
                backup.setServerName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ServiceRoleArn")) {
                backup.setServiceRoleArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Status")) {
                backup.setStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StatusDescription")) {
                backup.setStatusDescription(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SubnetIds")) {
                backup.setSubnetIds(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("ToolsVersion")) {
                backup.setToolsVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("UserArn")) {
                backup.setUserArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return backup;
    }

    private static BackupJsonUnmarshaller instance;
    public static BackupJsonUnmarshaller getInstance() {
        if (instance == null) instance = new BackupJsonUnmarshaller();
        return instance;
    }
}
