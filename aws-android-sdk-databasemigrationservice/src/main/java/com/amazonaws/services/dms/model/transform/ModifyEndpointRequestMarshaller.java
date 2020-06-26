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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ModifyEndpointRequest
 */
public class ModifyEndpointRequestMarshaller implements
        Marshaller<Request<ModifyEndpointRequest>, ModifyEndpointRequest> {

    public Request<ModifyEndpointRequest> marshall(ModifyEndpointRequest modifyEndpointRequest) {
        if (modifyEndpointRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyEndpointRequest)");
        }

        Request<ModifyEndpointRequest> request = new DefaultRequest<ModifyEndpointRequest>(
                modifyEndpointRequest, "AWSDatabaseMigrationService");
        String target = "AmazonDMSv20160101.ModifyEndpoint";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (modifyEndpointRequest.getEndpointArn() != null) {
                String endpointArn = modifyEndpointRequest.getEndpointArn();
                jsonWriter.name("EndpointArn");
                jsonWriter.value(endpointArn);
            }
            if (modifyEndpointRequest.getEndpointIdentifier() != null) {
                String endpointIdentifier = modifyEndpointRequest.getEndpointIdentifier();
                jsonWriter.name("EndpointIdentifier");
                jsonWriter.value(endpointIdentifier);
            }
            if (modifyEndpointRequest.getEndpointType() != null) {
                String endpointType = modifyEndpointRequest.getEndpointType();
                jsonWriter.name("EndpointType");
                jsonWriter.value(endpointType);
            }
            if (modifyEndpointRequest.getEngineName() != null) {
                String engineName = modifyEndpointRequest.getEngineName();
                jsonWriter.name("EngineName");
                jsonWriter.value(engineName);
            }
            if (modifyEndpointRequest.getUsername() != null) {
                String username = modifyEndpointRequest.getUsername();
                jsonWriter.name("Username");
                jsonWriter.value(username);
            }
            if (modifyEndpointRequest.getPassword() != null) {
                String password = modifyEndpointRequest.getPassword();
                jsonWriter.name("Password");
                jsonWriter.value(password);
            }
            if (modifyEndpointRequest.getServerName() != null) {
                String serverName = modifyEndpointRequest.getServerName();
                jsonWriter.name("ServerName");
                jsonWriter.value(serverName);
            }
            if (modifyEndpointRequest.getPort() != null) {
                Integer port = modifyEndpointRequest.getPort();
                jsonWriter.name("Port");
                jsonWriter.value(port);
            }
            if (modifyEndpointRequest.getDatabaseName() != null) {
                String databaseName = modifyEndpointRequest.getDatabaseName();
                jsonWriter.name("DatabaseName");
                jsonWriter.value(databaseName);
            }
            if (modifyEndpointRequest.getExtraConnectionAttributes() != null) {
                String extraConnectionAttributes = modifyEndpointRequest
                        .getExtraConnectionAttributes();
                jsonWriter.name("ExtraConnectionAttributes");
                jsonWriter.value(extraConnectionAttributes);
            }
            if (modifyEndpointRequest.getCertificateArn() != null) {
                String certificateArn = modifyEndpointRequest.getCertificateArn();
                jsonWriter.name("CertificateArn");
                jsonWriter.value(certificateArn);
            }
            if (modifyEndpointRequest.getSslMode() != null) {
                String sslMode = modifyEndpointRequest.getSslMode();
                jsonWriter.name("SslMode");
                jsonWriter.value(sslMode);
            }
            if (modifyEndpointRequest.getServiceAccessRoleArn() != null) {
                String serviceAccessRoleArn = modifyEndpointRequest.getServiceAccessRoleArn();
                jsonWriter.name("ServiceAccessRoleArn");
                jsonWriter.value(serviceAccessRoleArn);
            }
            if (modifyEndpointRequest.getExternalTableDefinition() != null) {
                String externalTableDefinition = modifyEndpointRequest.getExternalTableDefinition();
                jsonWriter.name("ExternalTableDefinition");
                jsonWriter.value(externalTableDefinition);
            }
            if (modifyEndpointRequest.getDynamoDbSettings() != null) {
                DynamoDbSettings dynamoDbSettings = modifyEndpointRequest.getDynamoDbSettings();
                jsonWriter.name("DynamoDbSettings");
                DynamoDbSettingsJsonMarshaller.getInstance().marshall(dynamoDbSettings, jsonWriter);
            }
            if (modifyEndpointRequest.getS3Settings() != null) {
                S3Settings s3Settings = modifyEndpointRequest.getS3Settings();
                jsonWriter.name("S3Settings");
                S3SettingsJsonMarshaller.getInstance().marshall(s3Settings, jsonWriter);
            }
            if (modifyEndpointRequest.getDmsTransferSettings() != null) {
                DmsTransferSettings dmsTransferSettings = modifyEndpointRequest
                        .getDmsTransferSettings();
                jsonWriter.name("DmsTransferSettings");
                DmsTransferSettingsJsonMarshaller.getInstance().marshall(dmsTransferSettings,
                        jsonWriter);
            }
            if (modifyEndpointRequest.getMongoDbSettings() != null) {
                MongoDbSettings mongoDbSettings = modifyEndpointRequest.getMongoDbSettings();
                jsonWriter.name("MongoDbSettings");
                MongoDbSettingsJsonMarshaller.getInstance().marshall(mongoDbSettings, jsonWriter);
            }
            if (modifyEndpointRequest.getKinesisSettings() != null) {
                KinesisSettings kinesisSettings = modifyEndpointRequest.getKinesisSettings();
                jsonWriter.name("KinesisSettings");
                KinesisSettingsJsonMarshaller.getInstance().marshall(kinesisSettings, jsonWriter);
            }
            if (modifyEndpointRequest.getKafkaSettings() != null) {
                KafkaSettings kafkaSettings = modifyEndpointRequest.getKafkaSettings();
                jsonWriter.name("KafkaSettings");
                KafkaSettingsJsonMarshaller.getInstance().marshall(kafkaSettings, jsonWriter);
            }
            if (modifyEndpointRequest.getElasticsearchSettings() != null) {
                ElasticsearchSettings elasticsearchSettings = modifyEndpointRequest
                        .getElasticsearchSettings();
                jsonWriter.name("ElasticsearchSettings");
                ElasticsearchSettingsJsonMarshaller.getInstance().marshall(elasticsearchSettings,
                        jsonWriter);
            }
            if (modifyEndpointRequest.getNeptuneSettings() != null) {
                NeptuneSettings neptuneSettings = modifyEndpointRequest.getNeptuneSettings();
                jsonWriter.name("NeptuneSettings");
                NeptuneSettingsJsonMarshaller.getInstance().marshall(neptuneSettings, jsonWriter);
            }
            if (modifyEndpointRequest.getRedshiftSettings() != null) {
                RedshiftSettings redshiftSettings = modifyEndpointRequest.getRedshiftSettings();
                jsonWriter.name("RedshiftSettings");
                RedshiftSettingsJsonMarshaller.getInstance().marshall(redshiftSettings, jsonWriter);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
