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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeIndexResult
 */
public class DescribeIndexResultJsonUnmarshaller implements
        Unmarshaller<DescribeIndexResult, JsonUnmarshallerContext> {

    public DescribeIndexResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeIndexResult describeIndexResult = new DescribeIndexResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                describeIndexResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                describeIndexResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Edition")) {
                describeIndexResult.setEdition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                describeIndexResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServerSideEncryptionConfiguration")) {
                describeIndexResult
                        .setServerSideEncryptionConfiguration(ServerSideEncryptionConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                describeIndexResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                describeIndexResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                describeIndexResult.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdatedAt")) {
                describeIndexResult.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentMetadataConfigurations")) {
                describeIndexResult
                        .setDocumentMetadataConfigurations(new ListUnmarshaller<DocumentMetadataConfiguration>(
                                DocumentMetadataConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IndexStatistics")) {
                describeIndexResult.setIndexStatistics(IndexStatisticsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorMessage")) {
                describeIndexResult.setErrorMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CapacityUnits")) {
                describeIndexResult.setCapacityUnits(CapacityUnitsConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeIndexResult;
    }

    private static DescribeIndexResultJsonUnmarshaller instance;

    public static DescribeIndexResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeIndexResultJsonUnmarshaller();
        return instance;
    }
}
