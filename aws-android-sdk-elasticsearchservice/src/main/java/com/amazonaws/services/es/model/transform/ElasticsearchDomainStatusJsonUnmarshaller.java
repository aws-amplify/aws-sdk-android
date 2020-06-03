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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ElasticsearchDomainStatus
 */
class ElasticsearchDomainStatusJsonUnmarshaller implements
        Unmarshaller<ElasticsearchDomainStatus, JsonUnmarshallerContext> {

    public ElasticsearchDomainStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ElasticsearchDomainStatus elasticsearchDomainStatus = new ElasticsearchDomainStatus();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DomainId")) {
                elasticsearchDomainStatus.setDomainId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainName")) {
                elasticsearchDomainStatus.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ARN")) {
                elasticsearchDomainStatus.setARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Created")) {
                elasticsearchDomainStatus.setCreated(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Deleted")) {
                elasticsearchDomainStatus.setDeleted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Endpoint")) {
                elasticsearchDomainStatus.setEndpoint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Endpoints")) {
                elasticsearchDomainStatus.setEndpoints(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Processing")) {
                elasticsearchDomainStatus.setProcessing(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpgradeProcessing")) {
                elasticsearchDomainStatus.setUpgradeProcessing(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ElasticsearchVersion")) {
                elasticsearchDomainStatus.setElasticsearchVersion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ElasticsearchClusterConfig")) {
                elasticsearchDomainStatus
                        .setElasticsearchClusterConfig(ElasticsearchClusterConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("EBSOptions")) {
                elasticsearchDomainStatus.setEBSOptions(EBSOptionsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccessPolicies")) {
                elasticsearchDomainStatus.setAccessPolicies(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnapshotOptions")) {
                elasticsearchDomainStatus.setSnapshotOptions(SnapshotOptionsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VPCOptions")) {
                elasticsearchDomainStatus.setVPCOptions(VPCDerivedInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CognitoOptions")) {
                elasticsearchDomainStatus.setCognitoOptions(CognitoOptionsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionAtRestOptions")) {
                elasticsearchDomainStatus
                        .setEncryptionAtRestOptions(EncryptionAtRestOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("NodeToNodeEncryptionOptions")) {
                elasticsearchDomainStatus
                        .setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AdvancedOptions")) {
                elasticsearchDomainStatus.setAdvancedOptions(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LogPublishingOptions")) {
                elasticsearchDomainStatus
                        .setLogPublishingOptions(new MapUnmarshaller<LogPublishingOption>(
                                LogPublishingOptionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ServiceSoftwareOptions")) {
                elasticsearchDomainStatus
                        .setServiceSoftwareOptions(ServiceSoftwareOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DomainEndpointOptions")) {
                elasticsearchDomainStatus
                        .setDomainEndpointOptions(DomainEndpointOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AdvancedSecurityOptions")) {
                elasticsearchDomainStatus
                        .setAdvancedSecurityOptions(AdvancedSecurityOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return elasticsearchDomainStatus;
    }

    private static ElasticsearchDomainStatusJsonUnmarshaller instance;

    public static ElasticsearchDomainStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDomainStatusJsonUnmarshaller();
        return instance;
    }
}
