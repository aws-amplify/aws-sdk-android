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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsRdsDbInstanceDetails
 */
class AwsRdsDbInstanceDetailsJsonMarshaller {

    public void marshall(AwsRdsDbInstanceDetails awsRdsDbInstanceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsRdsDbInstanceDetails.getAssociatedRoles() != null) {
            java.util.List<AwsRdsDbInstanceAssociatedRole> associatedRoles = awsRdsDbInstanceDetails
                    .getAssociatedRoles();
            jsonWriter.name("AssociatedRoles");
            jsonWriter.beginArray();
            for (AwsRdsDbInstanceAssociatedRole associatedRolesItem : associatedRoles) {
                if (associatedRolesItem != null) {
                    AwsRdsDbInstanceAssociatedRoleJsonMarshaller.getInstance().marshall(
                            associatedRolesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsRdsDbInstanceDetails.getCACertificateIdentifier() != null) {
            String cACertificateIdentifier = awsRdsDbInstanceDetails.getCACertificateIdentifier();
            jsonWriter.name("CACertificateIdentifier");
            jsonWriter.value(cACertificateIdentifier);
        }
        if (awsRdsDbInstanceDetails.getDBClusterIdentifier() != null) {
            String dBClusterIdentifier = awsRdsDbInstanceDetails.getDBClusterIdentifier();
            jsonWriter.name("DBClusterIdentifier");
            jsonWriter.value(dBClusterIdentifier);
        }
        if (awsRdsDbInstanceDetails.getDBInstanceIdentifier() != null) {
            String dBInstanceIdentifier = awsRdsDbInstanceDetails.getDBInstanceIdentifier();
            jsonWriter.name("DBInstanceIdentifier");
            jsonWriter.value(dBInstanceIdentifier);
        }
        if (awsRdsDbInstanceDetails.getDBInstanceClass() != null) {
            String dBInstanceClass = awsRdsDbInstanceDetails.getDBInstanceClass();
            jsonWriter.name("DBInstanceClass");
            jsonWriter.value(dBInstanceClass);
        }
        if (awsRdsDbInstanceDetails.getDbInstancePort() != null) {
            Integer dbInstancePort = awsRdsDbInstanceDetails.getDbInstancePort();
            jsonWriter.name("DbInstancePort");
            jsonWriter.value(dbInstancePort);
        }
        if (awsRdsDbInstanceDetails.getDbiResourceId() != null) {
            String dbiResourceId = awsRdsDbInstanceDetails.getDbiResourceId();
            jsonWriter.name("DbiResourceId");
            jsonWriter.value(dbiResourceId);
        }
        if (awsRdsDbInstanceDetails.getDBName() != null) {
            String dBName = awsRdsDbInstanceDetails.getDBName();
            jsonWriter.name("DBName");
            jsonWriter.value(dBName);
        }
        if (awsRdsDbInstanceDetails.getDeletionProtection() != null) {
            Boolean deletionProtection = awsRdsDbInstanceDetails.getDeletionProtection();
            jsonWriter.name("DeletionProtection");
            jsonWriter.value(deletionProtection);
        }
        if (awsRdsDbInstanceDetails.getEndpoint() != null) {
            AwsRdsDbInstanceEndpoint endpoint = awsRdsDbInstanceDetails.getEndpoint();
            jsonWriter.name("Endpoint");
            AwsRdsDbInstanceEndpointJsonMarshaller.getInstance().marshall(endpoint, jsonWriter);
        }
        if (awsRdsDbInstanceDetails.getEngine() != null) {
            String engine = awsRdsDbInstanceDetails.getEngine();
            jsonWriter.name("Engine");
            jsonWriter.value(engine);
        }
        if (awsRdsDbInstanceDetails.getEngineVersion() != null) {
            String engineVersion = awsRdsDbInstanceDetails.getEngineVersion();
            jsonWriter.name("EngineVersion");
            jsonWriter.value(engineVersion);
        }
        if (awsRdsDbInstanceDetails.getIAMDatabaseAuthenticationEnabled() != null) {
            Boolean iAMDatabaseAuthenticationEnabled = awsRdsDbInstanceDetails
                    .getIAMDatabaseAuthenticationEnabled();
            jsonWriter.name("IAMDatabaseAuthenticationEnabled");
            jsonWriter.value(iAMDatabaseAuthenticationEnabled);
        }
        if (awsRdsDbInstanceDetails.getInstanceCreateTime() != null) {
            String instanceCreateTime = awsRdsDbInstanceDetails.getInstanceCreateTime();
            jsonWriter.name("InstanceCreateTime");
            jsonWriter.value(instanceCreateTime);
        }
        if (awsRdsDbInstanceDetails.getKmsKeyId() != null) {
            String kmsKeyId = awsRdsDbInstanceDetails.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (awsRdsDbInstanceDetails.getPubliclyAccessible() != null) {
            Boolean publiclyAccessible = awsRdsDbInstanceDetails.getPubliclyAccessible();
            jsonWriter.name("PubliclyAccessible");
            jsonWriter.value(publiclyAccessible);
        }
        if (awsRdsDbInstanceDetails.getStorageEncrypted() != null) {
            Boolean storageEncrypted = awsRdsDbInstanceDetails.getStorageEncrypted();
            jsonWriter.name("StorageEncrypted");
            jsonWriter.value(storageEncrypted);
        }
        if (awsRdsDbInstanceDetails.getTdeCredentialArn() != null) {
            String tdeCredentialArn = awsRdsDbInstanceDetails.getTdeCredentialArn();
            jsonWriter.name("TdeCredentialArn");
            jsonWriter.value(tdeCredentialArn);
        }
        if (awsRdsDbInstanceDetails.getVpcSecurityGroups() != null) {
            java.util.List<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups = awsRdsDbInstanceDetails
                    .getVpcSecurityGroups();
            jsonWriter.name("VpcSecurityGroups");
            jsonWriter.beginArray();
            for (AwsRdsDbInstanceVpcSecurityGroup vpcSecurityGroupsItem : vpcSecurityGroups) {
                if (vpcSecurityGroupsItem != null) {
                    AwsRdsDbInstanceVpcSecurityGroupJsonMarshaller.getInstance().marshall(
                            vpcSecurityGroupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AwsRdsDbInstanceDetailsJsonMarshaller instance;

    public static AwsRdsDbInstanceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbInstanceDetailsJsonMarshaller();
        return instance;
    }
}
