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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Endpoint
 */
class EndpointJsonUnmarshaller implements Unmarshaller<Endpoint, JsonUnmarshallerContext> {

    public Endpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Endpoint endpoint = new Endpoint();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EndpointIdentifier")) {
                endpoint.setEndpointIdentifier(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointType")) {
                endpoint.setEndpointType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EngineName")) {
                endpoint.setEngineName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EngineDisplayName")) {
                endpoint.setEngineDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Username")) {
                endpoint.setUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServerName")) {
                endpoint.setServerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Port")) {
                endpoint.setPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatabaseName")) {
                endpoint.setDatabaseName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExtraConnectionAttributes")) {
                endpoint.setExtraConnectionAttributes(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                endpoint.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                endpoint.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointArn")) {
                endpoint.setEndpointArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CertificateArn")) {
                endpoint.setCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SslMode")) {
                endpoint.setSslMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceAccessRoleArn")) {
                endpoint.setServiceAccessRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExternalTableDefinition")) {
                endpoint.setExternalTableDefinition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExternalId")) {
                endpoint.setExternalId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DynamoDbSettings")) {
                endpoint.setDynamoDbSettings(DynamoDbSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3Settings")) {
                endpoint.setS3Settings(S3SettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DmsTransferSettings")) {
                endpoint.setDmsTransferSettings(DmsTransferSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MongoDbSettings")) {
                endpoint.setMongoDbSettings(MongoDbSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KinesisSettings")) {
                endpoint.setKinesisSettings(KinesisSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KafkaSettings")) {
                endpoint.setKafkaSettings(KafkaSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ElasticsearchSettings")) {
                endpoint.setElasticsearchSettings(ElasticsearchSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NeptuneSettings")) {
                endpoint.setNeptuneSettings(NeptuneSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RedshiftSettings")) {
                endpoint.setRedshiftSettings(RedshiftSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return endpoint;
    }

    private static EndpointJsonUnmarshaller instance;

    public static EndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointJsonUnmarshaller();
        return instance;
    }
}
