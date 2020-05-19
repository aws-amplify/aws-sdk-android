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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NetworkInterfacePermission
 */
class NetworkInterfacePermissionJsonMarshaller {

    public void marshall(NetworkInterfacePermission networkInterfacePermission,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (networkInterfacePermission.getNetworkInterfacePermissionId() != null) {
            String networkInterfacePermissionId = networkInterfacePermission
                    .getNetworkInterfacePermissionId();
            jsonWriter.name("NetworkInterfacePermissionId");
            jsonWriter.value(networkInterfacePermissionId);
        }
        if (networkInterfacePermission.getNetworkInterfaceId() != null) {
            String networkInterfaceId = networkInterfacePermission.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (networkInterfacePermission.getAwsAccountId() != null) {
            String awsAccountId = networkInterfacePermission.getAwsAccountId();
            jsonWriter.name("AwsAccountId");
            jsonWriter.value(awsAccountId);
        }
        if (networkInterfacePermission.getAwsService() != null) {
            String awsService = networkInterfacePermission.getAwsService();
            jsonWriter.name("AwsService");
            jsonWriter.value(awsService);
        }
        if (networkInterfacePermission.getPermission() != null) {
            String permission = networkInterfacePermission.getPermission();
            jsonWriter.name("Permission");
            jsonWriter.value(permission);
        }
        if (networkInterfacePermission.getPermissionState() != null) {
            NetworkInterfacePermissionState permissionState = networkInterfacePermission
                    .getPermissionState();
            jsonWriter.name("PermissionState");
            NetworkInterfacePermissionStateJsonMarshaller.getInstance().marshall(permissionState,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static NetworkInterfacePermissionJsonMarshaller instance;

    public static NetworkInterfacePermissionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfacePermissionJsonMarshaller();
        return instance;
    }
}
