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
package com.amazonaws.services.compute-optimizer.model.transform;

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
import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;


/**
 * JSON request marshaller for ExportAutoScalingGroupRecommendationsRequest
 */
public class ExportAutoScalingGroupRecommendationsRequestMarshaller implements Marshaller<Request<ExportAutoScalingGroupRecommendationsRequest>, ExportAutoScalingGroupRecommendationsRequest> {

    public Request<ExportAutoScalingGroupRecommendationsRequest> marshall(ExportAutoScalingGroupRecommendationsRequest exportAutoScalingGroupRecommendationsRequest) {
        if (exportAutoScalingGroupRecommendationsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ExportAutoScalingGroupRecommendationsRequest)");
        }

        Request<ExportAutoScalingGroupRecommendationsRequest> request = new DefaultRequest<ExportAutoScalingGroupRecommendationsRequest>(exportAutoScalingGroupRecommendationsRequest, "AWSComputeOptimizer");
        String target = "ComputeOptimizerService.ExportAutoScalingGroupRecommendations";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (exportAutoScalingGroupRecommendationsRequest.getAccountIds() != null) {
                java.util.List<String> accountIds = exportAutoScalingGroupRecommendationsRequest.getAccountIds();
                jsonWriter.name("accountIds");
            jsonWriter.beginArray();
            for (String accountIdsItem : accountIds) {
                if (accountIdsItem != null) {
            jsonWriter.value(accountIdsItem);
                    }
            }
            jsonWriter.endArray();
            }
            if (exportAutoScalingGroupRecommendationsRequest.getFilters() != null) {
                java.util.List<Filter> filters = exportAutoScalingGroupRecommendationsRequest.getFilters();
                jsonWriter.name("filters");
            jsonWriter.beginArray();
            for (Filter filtersItem : filters) {
                if (filtersItem != null) {
            FilterJsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
            }
            if (exportAutoScalingGroupRecommendationsRequest.getFieldsToExport() != null) {
                java.util.List<String> fieldsToExport = exportAutoScalingGroupRecommendationsRequest.getFieldsToExport();
                jsonWriter.name("fieldsToExport");
            jsonWriter.beginArray();
            for (String fieldsToExportItem : fieldsToExport) {
                if (fieldsToExportItem != null) {
            jsonWriter.value(fieldsToExportItem);
                    }
            }
            jsonWriter.endArray();
            }
            if (exportAutoScalingGroupRecommendationsRequest.getS3DestinationConfig() != null) {
                S3DestinationConfig s3DestinationConfig = exportAutoScalingGroupRecommendationsRequest.getS3DestinationConfig();
                jsonWriter.name("s3DestinationConfig");
            S3DestinationConfigJsonMarshaller.getInstance().marshall(s3DestinationConfig, jsonWriter);
            }
            if (exportAutoScalingGroupRecommendationsRequest.getFileFormat() != null) {
                String fileFormat = exportAutoScalingGroupRecommendationsRequest.getFileFormat();
                jsonWriter.name("fileFormat");
            jsonWriter.value(fileFormat);
            }
            if (exportAutoScalingGroupRecommendationsRequest.getIncludeMemberAccounts() != null) {
                Boolean includeMemberAccounts = exportAutoScalingGroupRecommendationsRequest.getIncludeMemberAccounts();
                jsonWriter.name("includeMemberAccounts");
            jsonWriter.value(includeMemberAccounts);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
