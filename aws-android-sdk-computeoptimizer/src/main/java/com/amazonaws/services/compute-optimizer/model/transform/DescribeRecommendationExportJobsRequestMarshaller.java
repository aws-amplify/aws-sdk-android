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
 * JSON request marshaller for DescribeRecommendationExportJobsRequest
 */
public class DescribeRecommendationExportJobsRequestMarshaller implements Marshaller<Request<DescribeRecommendationExportJobsRequest>, DescribeRecommendationExportJobsRequest> {

    public Request<DescribeRecommendationExportJobsRequest> marshall(DescribeRecommendationExportJobsRequest describeRecommendationExportJobsRequest) {
        if (describeRecommendationExportJobsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DescribeRecommendationExportJobsRequest)");
        }

        Request<DescribeRecommendationExportJobsRequest> request = new DefaultRequest<DescribeRecommendationExportJobsRequest>(describeRecommendationExportJobsRequest, "AWSComputeOptimizer");
        String target = "ComputeOptimizerService.DescribeRecommendationExportJobs";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (describeRecommendationExportJobsRequest.getJobIds() != null) {
                java.util.List<String> jobIds = describeRecommendationExportJobsRequest.getJobIds();
                jsonWriter.name("jobIds");
            jsonWriter.beginArray();
            for (String jobIdsItem : jobIds) {
                if (jobIdsItem != null) {
            jsonWriter.value(jobIdsItem);
                    }
            }
            jsonWriter.endArray();
            }
            if (describeRecommendationExportJobsRequest.getFilters() != null) {
                java.util.List<JobFilter> filters = describeRecommendationExportJobsRequest.getFilters();
                jsonWriter.name("filters");
            jsonWriter.beginArray();
            for (JobFilter filtersItem : filters) {
                if (filtersItem != null) {
            JobFilterJsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
            }
            if (describeRecommendationExportJobsRequest.getNextToken() != null) {
                String nextToken = describeRecommendationExportJobsRequest.getNextToken();
                jsonWriter.name("nextToken");
            jsonWriter.value(nextToken);
            }
            if (describeRecommendationExportJobsRequest.getMaxResults() != null) {
                Integer maxResults = describeRecommendationExportJobsRequest.getMaxResults();
                jsonWriter.name("maxResults");
            jsonWriter.value(maxResults);
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
