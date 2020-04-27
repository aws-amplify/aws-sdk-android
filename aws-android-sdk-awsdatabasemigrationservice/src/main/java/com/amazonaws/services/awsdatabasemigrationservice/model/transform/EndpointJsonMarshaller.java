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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Endpoint
 */
class EndpointJsonMarshaller {

    public void marshall(Endpoint endpoint, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (endpoint.getEndpointIdentifier() != null) {
            String endpointIdentifier = endpoint.getEndpointIdentifier();
            jsonWriter.name("EndpointIdentifier");
            jsonWriter.value(endpointIdentifier);
        }
        if (endpoint.getEndpointType() != null) {
            String endpointType = endpoint.getEndpointType();
            jsonWriter.name("EndpointType");
            jsonWriter.value(endpointType);
        }
        if (endpoint.getEngineName() != null) {
            String engineName = endpoint.getEngineName();
            jsonWriter.name("EngineName");
            jsonWriter.value(engineName);
        }
        if (endpoint.getEngineDisplayName() != null) {
            String engineDisplayName = endpoint.getEngineDisplayName();
            jsonWriter.name("EngineDisplayName");
            jsonWriter.value(engineDisplayName);
        }
        if (endpoint.getUsername() != null) {
            String username = endpoint.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        if (endpoint.getServerName() != null) {
            String serverName = endpoint.getServerName();
            jsonWriter.name("ServerName");
            jsonWriter.value(serverName);
        }
        if (endpoint.getPort() != null) {
            Integer port = endpoint.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        if (endpoint.getDatabaseName() != null) {
            String databaseName = endpoint.getDatabaseName();
            jsonWriter.name("DatabaseName");
            jsonWriter.value(databaseName);
        }
        if (endpoint.getExtraConnectionAttributes() != null) {
            String extraConnectionAttributes = endpoint.getExtraConnectionAttributes();
            jsonWriter.name("ExtraConnectionAttributes");
            jsonWriter.value(extraConnectionAttributes);
        }
        if (endpoint.getStatus() != null) {
            String status = endpoint.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (endpoint.getKmsKeyId() != null) {
            String kmsKeyId = endpoint.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (endpoint.getEndpointArn() != null) {
            String endpointArn = endpoint.getEndpointArn();
            jsonWriter.name("EndpointArn");
            jsonWriter.value(endpointArn);
        }
        if (endpoint.getCertificateArn() != null) {
            String certificateArn = endpoint.getCertificateArn();
            jsonWriter.name("CertificateArn");
            jsonWriter.value(certificateArn);
        }
        if (endpoint.getSslMode() != null) {
            String sslMode = endpoint.getSslMode();
            jsonWriter.name("SslMode");
            jsonWriter.value(sslMode);
        }
        if (endpoint.getServiceAccessRoleArn() != null) {
            String serviceAccessRoleArn = endpoint.getServiceAccessRoleArn();
            jsonWriter.name("ServiceAccessRoleArn");
            jsonWriter.value(serviceAccessRoleArn);
        }
        if (endpoint.getExternalTableDefinition() != null) {
            String externalTableDefinition = endpoint.getExternalTableDefinition();
            jsonWriter.name("ExternalTableDefinition");
            jsonWriter.value(externalTableDefinition);
        }
        if (endpoint.getExternalId() != null) {
            String externalId = endpoint.getExternalId();
            jsonWriter.name("ExternalId");
            jsonWriter.value(externalId);
        }
        if (endpoint.getDynamoDbSettings() != null) {
            DynamoDbSettings dynamoDbSettings = endpoint.getDynamoDbSettings();
            jsonWriter.name("DynamoDbSettings");
            DynamoDbSettingsJsonMarshaller.getInstance().marshall(dynamoDbSettings, jsonWriter);
        }
        if (endpoint.getS3Settings() != null) {
            S3Settings s3Settings = endpoint.getS3Settings();
            jsonWriter.name("S3Settings");
            S3SettingsJsonMarshaller.getInstance().marshall(s3Settings, jsonWriter);
        }
        if (endpoint.getDmsTransferSettings() != null) {
            DmsTransferSettings dmsTransferSettings = endpoint.getDmsTransferSettings();
            jsonWriter.name("DmsTransferSettings");
            DmsTransferSettingsJsonMarshaller.getInstance().marshall(dmsTransferSettings,
                    jsonWriter);
        }
        if (endpoint.getMongoDbSettings() != null) {
            MongoDbSettings mongoDbSettings = endpoint.getMongoDbSettings();
            jsonWriter.name("MongoDbSettings");
            MongoDbSettingsJsonMarshaller.getInstance().marshall(mongoDbSettings, jsonWriter);
        }
        if (endpoint.getKinesisSettings() != null) {
            KinesisSettings kinesisSettings = endpoint.getKinesisSettings();
            jsonWriter.name("KinesisSettings");
            KinesisSettingsJsonMarshaller.getInstance().marshall(kinesisSettings, jsonWriter);
        }
        if (endpoint.getKafkaSettings() != null) {
            KafkaSettings kafkaSettings = endpoint.getKafkaSettings();
            jsonWriter.name("KafkaSettings");
            KafkaSettingsJsonMarshaller.getInstance().marshall(kafkaSettings, jsonWriter);
        }
        if (endpoint.getElasticsearchSettings() != null) {
            ElasticsearchSettings elasticsearchSettings = endpoint.getElasticsearchSettings();
            jsonWriter.name("ElasticsearchSettings");
            ElasticsearchSettingsJsonMarshaller.getInstance().marshall(elasticsearchSettings,
                    jsonWriter);
        }
        if (endpoint.getNeptuneSettings() != null) {
            NeptuneSettings neptuneSettings = endpoint.getNeptuneSettings();
            jsonWriter.name("NeptuneSettings");
            NeptuneSettingsJsonMarshaller.getInstance().marshall(neptuneSettings, jsonWriter);
        }
        if (endpoint.getRedshiftSettings() != null) {
            RedshiftSettings redshiftSettings = endpoint.getRedshiftSettings();
            jsonWriter.name("RedshiftSettings");
            RedshiftSettingsJsonMarshaller.getInstance().marshall(redshiftSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EndpointJsonMarshaller instance;

    public static EndpointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointJsonMarshaller();
        return instance;
    }
}
