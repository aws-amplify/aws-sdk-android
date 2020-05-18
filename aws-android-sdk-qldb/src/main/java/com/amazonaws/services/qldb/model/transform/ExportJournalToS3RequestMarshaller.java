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

package com.amazonaws.services.qldb.model.transform;

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
import com.amazonaws.services.qldb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ExportJournalToS3Request
 */
public class ExportJournalToS3RequestMarshaller implements
        Marshaller<Request<ExportJournalToS3Request>, ExportJournalToS3Request> {

    public Request<ExportJournalToS3Request> marshall(
            ExportJournalToS3Request exportJournalToS3Request) {
        if (exportJournalToS3Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ExportJournalToS3Request)");
        }

        Request<ExportJournalToS3Request> request = new DefaultRequest<ExportJournalToS3Request>(
                exportJournalToS3Request, "AmazonQLDB");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/ledgers/{name}/journal-s3-exports";
        uriResourcePath = uriResourcePath.replace(
                "{name}",
                (exportJournalToS3Request.getName() == null) ? "" : StringUtils
                        .fromString(exportJournalToS3Request.getName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (exportJournalToS3Request.getInclusiveStartTime() != null) {
                java.util.Date inclusiveStartTime = exportJournalToS3Request
                        .getInclusiveStartTime();
                jsonWriter.name("InclusiveStartTime");
                jsonWriter.value(inclusiveStartTime);
            }
            if (exportJournalToS3Request.getExclusiveEndTime() != null) {
                java.util.Date exclusiveEndTime = exportJournalToS3Request.getExclusiveEndTime();
                jsonWriter.name("ExclusiveEndTime");
                jsonWriter.value(exclusiveEndTime);
            }
            if (exportJournalToS3Request.getS3ExportConfiguration() != null) {
                S3ExportConfiguration s3ExportConfiguration = exportJournalToS3Request
                        .getS3ExportConfiguration();
                jsonWriter.name("S3ExportConfiguration");
                S3ExportConfigurationJsonMarshaller.getInstance().marshall(s3ExportConfiguration,
                        jsonWriter);
            }
            if (exportJournalToS3Request.getRoleArn() != null) {
                String roleArn = exportJournalToS3Request.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
