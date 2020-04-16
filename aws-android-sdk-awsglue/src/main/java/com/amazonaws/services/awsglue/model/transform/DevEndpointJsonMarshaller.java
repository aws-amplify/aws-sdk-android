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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DevEndpoint
 */
class DevEndpointJsonMarshaller {

    public void marshall(DevEndpoint devEndpoint, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (devEndpoint.getEndpointName() != null) {
            String endpointName = devEndpoint.getEndpointName();
            jsonWriter.name("EndpointName");
            jsonWriter.value(endpointName);
        }
        if (devEndpoint.getRoleArn() != null) {
            String roleArn = devEndpoint.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (devEndpoint.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = devEndpoint.getSecurityGroupIds();
            jsonWriter.name("SecurityGroupIds");
            jsonWriter.beginArray();
            for (String securityGroupIdsItem : securityGroupIds) {
                if (securityGroupIdsItem != null) {
                    jsonWriter.value(securityGroupIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (devEndpoint.getSubnetId() != null) {
            String subnetId = devEndpoint.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (devEndpoint.getYarnEndpointAddress() != null) {
            String yarnEndpointAddress = devEndpoint.getYarnEndpointAddress();
            jsonWriter.name("YarnEndpointAddress");
            jsonWriter.value(yarnEndpointAddress);
        }
        if (devEndpoint.getPrivateAddress() != null) {
            String privateAddress = devEndpoint.getPrivateAddress();
            jsonWriter.name("PrivateAddress");
            jsonWriter.value(privateAddress);
        }
        if (devEndpoint.getZeppelinRemoteSparkInterpreterPort() != null) {
            Integer zeppelinRemoteSparkInterpreterPort = devEndpoint
                    .getZeppelinRemoteSparkInterpreterPort();
            jsonWriter.name("ZeppelinRemoteSparkInterpreterPort");
            jsonWriter.value(zeppelinRemoteSparkInterpreterPort);
        }
        if (devEndpoint.getPublicAddress() != null) {
            String publicAddress = devEndpoint.getPublicAddress();
            jsonWriter.name("PublicAddress");
            jsonWriter.value(publicAddress);
        }
        if (devEndpoint.getStatus() != null) {
            String status = devEndpoint.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (devEndpoint.getWorkerType() != null) {
            String workerType = devEndpoint.getWorkerType();
            jsonWriter.name("WorkerType");
            jsonWriter.value(workerType);
        }
        if (devEndpoint.getGlueVersion() != null) {
            String glueVersion = devEndpoint.getGlueVersion();
            jsonWriter.name("GlueVersion");
            jsonWriter.value(glueVersion);
        }
        if (devEndpoint.getNumberOfWorkers() != null) {
            Integer numberOfWorkers = devEndpoint.getNumberOfWorkers();
            jsonWriter.name("NumberOfWorkers");
            jsonWriter.value(numberOfWorkers);
        }
        if (devEndpoint.getNumberOfNodes() != null) {
            Integer numberOfNodes = devEndpoint.getNumberOfNodes();
            jsonWriter.name("NumberOfNodes");
            jsonWriter.value(numberOfNodes);
        }
        if (devEndpoint.getAvailabilityZone() != null) {
            String availabilityZone = devEndpoint.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (devEndpoint.getVpcId() != null) {
            String vpcId = devEndpoint.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (devEndpoint.getExtraPythonLibsS3Path() != null) {
            String extraPythonLibsS3Path = devEndpoint.getExtraPythonLibsS3Path();
            jsonWriter.name("ExtraPythonLibsS3Path");
            jsonWriter.value(extraPythonLibsS3Path);
        }
        if (devEndpoint.getExtraJarsS3Path() != null) {
            String extraJarsS3Path = devEndpoint.getExtraJarsS3Path();
            jsonWriter.name("ExtraJarsS3Path");
            jsonWriter.value(extraJarsS3Path);
        }
        if (devEndpoint.getFailureReason() != null) {
            String failureReason = devEndpoint.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (devEndpoint.getLastUpdateStatus() != null) {
            String lastUpdateStatus = devEndpoint.getLastUpdateStatus();
            jsonWriter.name("LastUpdateStatus");
            jsonWriter.value(lastUpdateStatus);
        }
        if (devEndpoint.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = devEndpoint.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (devEndpoint.getLastModifiedTimestamp() != null) {
            java.util.Date lastModifiedTimestamp = devEndpoint.getLastModifiedTimestamp();
            jsonWriter.name("LastModifiedTimestamp");
            jsonWriter.value(lastModifiedTimestamp);
        }
        if (devEndpoint.getPublicKey() != null) {
            String publicKey = devEndpoint.getPublicKey();
            jsonWriter.name("PublicKey");
            jsonWriter.value(publicKey);
        }
        if (devEndpoint.getPublicKeys() != null) {
            java.util.List<String> publicKeys = devEndpoint.getPublicKeys();
            jsonWriter.name("PublicKeys");
            jsonWriter.beginArray();
            for (String publicKeysItem : publicKeys) {
                if (publicKeysItem != null) {
                    jsonWriter.value(publicKeysItem);
                }
            }
            jsonWriter.endArray();
        }
        if (devEndpoint.getSecurityConfiguration() != null) {
            String securityConfiguration = devEndpoint.getSecurityConfiguration();
            jsonWriter.name("SecurityConfiguration");
            jsonWriter.value(securityConfiguration);
        }
        if (devEndpoint.getArguments() != null) {
            java.util.Map<String, String> arguments = devEndpoint.getArguments();
            jsonWriter.name("Arguments");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> argumentsEntry : arguments.entrySet()) {
                String argumentsValue = argumentsEntry.getValue();
                if (argumentsValue != null) {
                    jsonWriter.name(argumentsEntry.getKey());
                    jsonWriter.value(argumentsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static DevEndpointJsonMarshaller instance;

    public static DevEndpointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DevEndpointJsonMarshaller();
        return instance;
    }
}
