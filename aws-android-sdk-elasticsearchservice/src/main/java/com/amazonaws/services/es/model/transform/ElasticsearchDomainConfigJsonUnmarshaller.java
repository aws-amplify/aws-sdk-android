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
 * JSON unmarshaller for POJO ElasticsearchDomainConfig
 */
class ElasticsearchDomainConfigJsonUnmarshaller implements
        Unmarshaller<ElasticsearchDomainConfig, JsonUnmarshallerContext> {

    public ElasticsearchDomainConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ElasticsearchDomainConfig elasticsearchDomainConfig = new ElasticsearchDomainConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ElasticsearchVersion")) {
                elasticsearchDomainConfig
                        .setElasticsearchVersion(ElasticsearchVersionStatusJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ElasticsearchClusterConfig")) {
                elasticsearchDomainConfig
                        .setElasticsearchClusterConfig(ElasticsearchClusterConfigStatusJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("EBSOptions")) {
                elasticsearchDomainConfig.setEBSOptions(EBSOptionsStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccessPolicies")) {
                elasticsearchDomainConfig.setAccessPolicies(AccessPoliciesStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnapshotOptions")) {
                elasticsearchDomainConfig.setSnapshotOptions(SnapshotOptionsStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VPCOptions")) {
                elasticsearchDomainConfig.setVPCOptions(VPCDerivedInfoStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CognitoOptions")) {
                elasticsearchDomainConfig.setCognitoOptions(CognitoOptionsStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionAtRestOptions")) {
                elasticsearchDomainConfig
                        .setEncryptionAtRestOptions(EncryptionAtRestOptionsStatusJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("NodeToNodeEncryptionOptions")) {
                elasticsearchDomainConfig
                        .setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsStatusJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AdvancedOptions")) {
                elasticsearchDomainConfig.setAdvancedOptions(AdvancedOptionsStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogPublishingOptions")) {
                elasticsearchDomainConfig
                        .setLogPublishingOptions(LogPublishingOptionsStatusJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DomainEndpointOptions")) {
                elasticsearchDomainConfig
                        .setDomainEndpointOptions(DomainEndpointOptionsStatusJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AdvancedSecurityOptions")) {
                elasticsearchDomainConfig
                        .setAdvancedSecurityOptions(AdvancedSecurityOptionsStatusJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return elasticsearchDomainConfig;
    }

    private static ElasticsearchDomainConfigJsonUnmarshaller instance;

    public static ElasticsearchDomainConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDomainConfigJsonUnmarshaller();
        return instance;
    }
}
