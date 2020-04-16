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
 * JSON unmarshaller for POJO AwsElasticsearchDomainDetails
 */
class AwsElasticsearchDomainDetailsJsonUnmarshaller implements
        Unmarshaller<AwsElasticsearchDomainDetails, JsonUnmarshallerContext> {

    public AwsElasticsearchDomainDetails unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsElasticsearchDomainDetails awsElasticsearchDomainDetails = new AwsElasticsearchDomainDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AccessPolicies")) {
                awsElasticsearchDomainDetails.setAccessPolicies(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainEndpointOptions")) {
                awsElasticsearchDomainDetails
                        .setDomainEndpointOptions(AwsElasticsearchDomainDomainEndpointOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DomainId")) {
                awsElasticsearchDomainDetails.setDomainId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainName")) {
                awsElasticsearchDomainDetails.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Endpoint")) {
                awsElasticsearchDomainDetails.setEndpoint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Endpoints")) {
                awsElasticsearchDomainDetails.setEndpoints(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ElasticsearchVersion")) {
                awsElasticsearchDomainDetails.setElasticsearchVersion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionAtRestOptions")) {
                awsElasticsearchDomainDetails
                        .setEncryptionAtRestOptions(AwsElasticsearchDomainEncryptionAtRestOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("NodeToNodeEncryptionOptions")) {
                awsElasticsearchDomainDetails
                        .setNodeToNodeEncryptionOptions(AwsElasticsearchDomainNodeToNodeEncryptionOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("VPCOptions")) {
                awsElasticsearchDomainDetails
                        .setVPCOptions(AwsElasticsearchDomainVPCOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsElasticsearchDomainDetails;
    }

    private static AwsElasticsearchDomainDetailsJsonUnmarshaller instance;

    public static AwsElasticsearchDomainDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsElasticsearchDomainDetailsJsonUnmarshaller();
        return instance;
    }
}
