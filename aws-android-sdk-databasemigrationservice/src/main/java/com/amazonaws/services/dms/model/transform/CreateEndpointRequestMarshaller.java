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
 * JSON request marshaller for CreateEndpointRequest
 */
public class CreateEndpointRequestMarshaller implements
        Marshaller<Request<CreateEndpointRequest>, CreateEndpointRequest> {

    public Request<CreateEndpointRequest> marshall(CreateEndpointRequest createEndpointRequest) {
        if (createEndpointRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateEndpointRequest)");
        }

        Request<CreateEndpointRequest> request = new DefaultRequest<CreateEndpointRequest>(
                createEndpointRequest, "AWSDatabaseMigrationService");
        String target = "AmazonDMSv20160101.CreateEndpoint";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createEndpointRequest.getEndpointIdentifier() != null) {
                String endpointIdentifier = createEndpointRequest.getEndpointIdentifier();
                jsonWriter.name("EndpointIdentifier");
                jsonWriter.value(endpointIdentifier);
            }
            if (createEndpointRequest.getEndpointType() != null) {
                String endpointType = createEndpointRequest.getEndpointType();
                jsonWriter.name("EndpointType");
                jsonWriter.value(endpointType);
            }
            if (createEndpointRequest.getEngineName() != null) {
                String engineName = createEndpointRequest.getEngineName();
                jsonWriter.name("EngineName");
                jsonWriter.value(engineName);
            }
            if (createEndpointRequest.getUsername() != null) {
                String username = createEndpointRequest.getUsername();
                jsonWriter.name("Username");
                jsonWriter.value(username);
            }
            if (createEndpointRequest.getPassword() != null) {
                String password = createEndpointRequest.getPassword();
                jsonWriter.name("Password");
                jsonWriter.value(password);
            }
            if (createEndpointRequest.getServerName() != null) {
                String serverName = createEndpointRequest.getServerName();
                jsonWriter.name("ServerName");
                jsonWriter.value(serverName);
            }
            if (createEndpointRequest.getPort() != null) {
                Integer port = createEndpointRequest.getPort();
                jsonWriter.name("Port");
                jsonWriter.value(port);
            }
            if (createEndpointRequest.getDatabaseName() != null) {
                String databaseName = createEndpointRequest.getDatabaseName();
                jsonWriter.name("DatabaseName");
                jsonWriter.value(databaseName);
            }
            if (createEndpointRequest.getExtraConnectionAttributes() != null) {
                String extraConnectionAttributes = createEndpointRequest
                        .getExtraConnectionAttributes();
                jsonWriter.name("ExtraConnectionAttributes");
                jsonWriter.value(extraConnectionAttributes);
            }
            if (createEndpointRequest.getKmsKeyId() != null) {
                String kmsKeyId = createEndpointRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (createEndpointRequest.getTags() != null) {
                java.util.List<Tag> tags = createEndpointRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createEndpointRequest.getCertificateArn() != null) {
                String certificateArn = createEndpointRequest.getCertificateArn();
                jsonWriter.name("CertificateArn");
                jsonWriter.value(certificateArn);
            }
            if (createEndpointRequest.getSslMode() != null) {
                String sslMode = createEndpointRequest.getSslMode();
                jsonWriter.name("SslMode");
                jsonWriter.value(sslMode);
            }
            if (createEndpointRequest.getServiceAccessRoleArn() != null) {
                String serviceAccessRoleArn = createEndpointRequest.getServiceAccessRoleArn();
                jsonWriter.name("ServiceAccessRoleArn");
                jsonWriter.value(serviceAccessRoleArn);
            }
            if (createEndpointRequest.getExternalTableDefinition() != null) {
                String externalTableDefinition = createEndpointRequest.getExternalTableDefinition();
                jsonWriter.name("ExternalTableDefinition");
                jsonWriter.value(externalTableDefinition);
            }
            if (createEndpointRequest.getDynamoDbSettings() != null) {
                DynamoDbSettings dynamoDbSettings = createEndpointRequest.getDynamoDbSettings();
                jsonWriter.name("DynamoDbSettings");
                DynamoDbSettingsJsonMarshaller.getInstance().marshall(dynamoDbSettings, jsonWriter);
            }
            if (createEndpointRequest.getS3Settings() != null) {
                S3Settings s3Settings = createEndpointRequest.getS3Settings();
                jsonWriter.name("S3Settings");
                S3SettingsJsonMarshaller.getInstance().marshall(s3Settings, jsonWriter);
            }
            if (createEndpointRequest.getDmsTransferSettings() != null) {
                DmsTransferSettings dmsTransferSettings = createEndpointRequest
                        .getDmsTransferSettings();
                jsonWriter.name("DmsTransferSettings");
                DmsTransferSettingsJsonMarshaller.getInstance().marshall(dmsTransferSettings,
                        jsonWriter);
            }
            if (createEndpointRequest.getMongoDbSettings() != null) {
                MongoDbSettings mongoDbSettings = createEndpointRequest.getMongoDbSettings();
                jsonWriter.name("MongoDbSettings");
                MongoDbSettingsJsonMarshaller.getInstance().marshall(mongoDbSettings, jsonWriter);
            }
            if (createEndpointRequest.getKinesisSettings() != null) {
                KinesisSettings kinesisSettings = createEndpointRequest.getKinesisSettings();
                jsonWriter.name("KinesisSettings");
                KinesisSettingsJsonMarshaller.getInstance().marshall(kinesisSettings, jsonWriter);
            }
            if (createEndpointRequest.getKafkaSettings() != null) {
                KafkaSettings kafkaSettings = createEndpointRequest.getKafkaSettings();
                jsonWriter.name("KafkaSettings");
                KafkaSettingsJsonMarshaller.getInstance().marshall(kafkaSettings, jsonWriter);
            }
            if (createEndpointRequest.getElasticsearchSettings() != null) {
                ElasticsearchSettings elasticsearchSettings = createEndpointRequest
                        .getElasticsearchSettings();
                jsonWriter.name("ElasticsearchSettings");
                ElasticsearchSettingsJsonMarshaller.getInstance().marshall(elasticsearchSettings,
                        jsonWriter);
            }
            if (createEndpointRequest.getNeptuneSettings() != null) {
                NeptuneSettings neptuneSettings = createEndpointRequest.getNeptuneSettings();
                jsonWriter.name("NeptuneSettings");
                NeptuneSettingsJsonMarshaller.getInstance().marshall(neptuneSettings, jsonWriter);
            }
            if (createEndpointRequest.getRedshiftSettings() != null) {
                RedshiftSettings redshiftSettings = createEndpointRequest.getRedshiftSettings();
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
