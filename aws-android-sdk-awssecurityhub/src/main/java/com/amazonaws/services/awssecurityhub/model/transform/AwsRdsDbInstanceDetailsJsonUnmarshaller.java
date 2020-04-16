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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AwsRdsDbInstanceDetails
 */
class AwsRdsDbInstanceDetailsJsonUnmarshaller implements
        Unmarshaller<AwsRdsDbInstanceDetails, JsonUnmarshallerContext> {

    public AwsRdsDbInstanceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsRdsDbInstanceDetails awsRdsDbInstanceDetails = new AwsRdsDbInstanceDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssociatedRoles")) {
                awsRdsDbInstanceDetails
                        .setAssociatedRoles(new ListUnmarshaller<AwsRdsDbInstanceAssociatedRole>(
                                AwsRdsDbInstanceAssociatedRoleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CACertificateIdentifier")) {
                awsRdsDbInstanceDetails.setCACertificateIdentifier(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DBClusterIdentifier")) {
                awsRdsDbInstanceDetails.setDBClusterIdentifier(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DBInstanceIdentifier")) {
                awsRdsDbInstanceDetails.setDBInstanceIdentifier(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DBInstanceClass")) {
                awsRdsDbInstanceDetails.setDBInstanceClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DbInstancePort")) {
                awsRdsDbInstanceDetails.setDbInstancePort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DbiResourceId")) {
                awsRdsDbInstanceDetails.setDbiResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DBName")) {
                awsRdsDbInstanceDetails.setDBName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeletionProtection")) {
                awsRdsDbInstanceDetails.setDeletionProtection(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Endpoint")) {
                awsRdsDbInstanceDetails.setEndpoint(AwsRdsDbInstanceEndpointJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Engine")) {
                awsRdsDbInstanceDetails.setEngine(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EngineVersion")) {
                awsRdsDbInstanceDetails.setEngineVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IAMDatabaseAuthenticationEnabled")) {
                awsRdsDbInstanceDetails.setIAMDatabaseAuthenticationEnabled(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCreateTime")) {
                awsRdsDbInstanceDetails.setInstanceCreateTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                awsRdsDbInstanceDetails.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PubliclyAccessible")) {
                awsRdsDbInstanceDetails.setPubliclyAccessible(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StorageEncrypted")) {
                awsRdsDbInstanceDetails.setStorageEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TdeCredentialArn")) {
                awsRdsDbInstanceDetails.setTdeCredentialArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcSecurityGroups")) {
                awsRdsDbInstanceDetails
                        .setVpcSecurityGroups(new ListUnmarshaller<AwsRdsDbInstanceVpcSecurityGroup>(
                                AwsRdsDbInstanceVpcSecurityGroupJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsRdsDbInstanceDetails;
    }

    private static AwsRdsDbInstanceDetailsJsonUnmarshaller instance;

    public static AwsRdsDbInstanceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbInstanceDetailsJsonUnmarshaller();
        return instance;
    }
}
