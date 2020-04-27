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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeNotebookInstanceResult
 */
public class DescribeNotebookInstanceResultJsonUnmarshaller implements
        Unmarshaller<DescribeNotebookInstanceResult, JsonUnmarshallerContext> {

    public DescribeNotebookInstanceResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeNotebookInstanceResult describeNotebookInstanceResult = new DescribeNotebookInstanceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NotebookInstanceArn")) {
                describeNotebookInstanceResult.setNotebookInstanceArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotebookInstanceName")) {
                describeNotebookInstanceResult.setNotebookInstanceName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotebookInstanceStatus")) {
                describeNotebookInstanceResult.setNotebookInstanceStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeNotebookInstanceResult.setFailureReason(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Url")) {
                describeNotebookInstanceResult.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                describeNotebookInstanceResult.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                describeNotebookInstanceResult.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                describeNotebookInstanceResult.setSecurityGroups(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                describeNotebookInstanceResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                describeNotebookInstanceResult.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                describeNotebookInstanceResult.setNetworkInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeNotebookInstanceResult.setLastModifiedTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeNotebookInstanceResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotebookInstanceLifecycleConfigName")) {
                describeNotebookInstanceResult
                        .setNotebookInstanceLifecycleConfigName(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DirectInternetAccess")) {
                describeNotebookInstanceResult.setDirectInternetAccess(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeSizeInGB")) {
                describeNotebookInstanceResult.setVolumeSizeInGB(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AcceleratorTypes")) {
                describeNotebookInstanceResult.setAcceleratorTypes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DefaultCodeRepository")) {
                describeNotebookInstanceResult.setDefaultCodeRepository(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdditionalCodeRepositories")) {
                describeNotebookInstanceResult
                        .setAdditionalCodeRepositories(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RootAccess")) {
                describeNotebookInstanceResult.setRootAccess(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeNotebookInstanceResult;
    }

    private static DescribeNotebookInstanceResultJsonUnmarshaller instance;

    public static DescribeNotebookInstanceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeNotebookInstanceResultJsonUnmarshaller();
        return instance;
    }
}
