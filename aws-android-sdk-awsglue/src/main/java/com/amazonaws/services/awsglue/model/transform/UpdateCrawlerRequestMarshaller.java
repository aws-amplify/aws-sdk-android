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

package com.amazonaws.services.awsglue.model.transform;

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
import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateCrawlerRequest
 */
public class UpdateCrawlerRequestMarshaller implements
        Marshaller<Request<UpdateCrawlerRequest>, UpdateCrawlerRequest> {

    public Request<UpdateCrawlerRequest> marshall(UpdateCrawlerRequest updateCrawlerRequest) {
        if (updateCrawlerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateCrawlerRequest)");
        }

        Request<UpdateCrawlerRequest> request = new DefaultRequest<UpdateCrawlerRequest>(
                updateCrawlerRequest, "AWSGlue");
        String target = "AWSGlue.UpdateCrawler";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateCrawlerRequest.getName() != null) {
                String name = updateCrawlerRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateCrawlerRequest.getRole() != null) {
                String role = updateCrawlerRequest.getRole();
                jsonWriter.name("Role");
                jsonWriter.value(role);
            }
            if (updateCrawlerRequest.getDatabaseName() != null) {
                String databaseName = updateCrawlerRequest.getDatabaseName();
                jsonWriter.name("DatabaseName");
                jsonWriter.value(databaseName);
            }
            if (updateCrawlerRequest.getDescription() != null) {
                String description = updateCrawlerRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateCrawlerRequest.getTargets() != null) {
                CrawlerTargets targets = updateCrawlerRequest.getTargets();
                jsonWriter.name("Targets");
                CrawlerTargetsJsonMarshaller.getInstance().marshall(targets, jsonWriter);
            }
            if (updateCrawlerRequest.getSchedule() != null) {
                String schedule = updateCrawlerRequest.getSchedule();
                jsonWriter.name("Schedule");
                jsonWriter.value(schedule);
            }
            if (updateCrawlerRequest.getClassifiers() != null) {
                java.util.List<String> classifiers = updateCrawlerRequest.getClassifiers();
                jsonWriter.name("Classifiers");
                jsonWriter.beginArray();
                for (String classifiersItem : classifiers) {
                    if (classifiersItem != null) {
                        jsonWriter.value(classifiersItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateCrawlerRequest.getTablePrefix() != null) {
                String tablePrefix = updateCrawlerRequest.getTablePrefix();
                jsonWriter.name("TablePrefix");
                jsonWriter.value(tablePrefix);
            }
            if (updateCrawlerRequest.getSchemaChangePolicy() != null) {
                SchemaChangePolicy schemaChangePolicy = updateCrawlerRequest
                        .getSchemaChangePolicy();
                jsonWriter.name("SchemaChangePolicy");
                SchemaChangePolicyJsonMarshaller.getInstance().marshall(schemaChangePolicy,
                        jsonWriter);
            }
            if (updateCrawlerRequest.getConfiguration() != null) {
                String configuration = updateCrawlerRequest.getConfiguration();
                jsonWriter.name("Configuration");
                jsonWriter.value(configuration);
            }
            if (updateCrawlerRequest.getCrawlerSecurityConfiguration() != null) {
                String crawlerSecurityConfiguration = updateCrawlerRequest
                        .getCrawlerSecurityConfiguration();
                jsonWriter.name("CrawlerSecurityConfiguration");
                jsonWriter.value(crawlerSecurityConfiguration);
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
