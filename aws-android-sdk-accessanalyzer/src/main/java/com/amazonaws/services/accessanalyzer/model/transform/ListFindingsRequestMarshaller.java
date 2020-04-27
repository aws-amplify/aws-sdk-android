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

package com.amazonaws.services.accessanalyzer.model.transform;

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
import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListFindingsRequest
 */
public class ListFindingsRequestMarshaller implements
        Marshaller<Request<ListFindingsRequest>, ListFindingsRequest> {

    public Request<ListFindingsRequest> marshall(ListFindingsRequest listFindingsRequest) {
        if (listFindingsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListFindingsRequest)");
        }

        Request<ListFindingsRequest> request = new DefaultRequest<ListFindingsRequest>(
                listFindingsRequest, "AccessAnalyzer");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/finding";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listFindingsRequest.getAnalyzerArn() != null) {
                String analyzerArn = listFindingsRequest.getAnalyzerArn();
                jsonWriter.name("analyzerArn");
                jsonWriter.value(analyzerArn);
            }
            if (listFindingsRequest.getFilter() != null) {
                java.util.Map<String, Criterion> filter = listFindingsRequest.getFilter();
                jsonWriter.name("filter");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, Criterion> filterEntry : filter.entrySet()) {
                    Criterion filterValue = filterEntry.getValue();
                    if (filterValue != null) {
                        jsonWriter.name(filterEntry.getKey());
                        CriterionJsonMarshaller.getInstance().marshall(filterValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (listFindingsRequest.getMaxResults() != null) {
                Integer maxResults = listFindingsRequest.getMaxResults();
                jsonWriter.name("maxResults");
                jsonWriter.value(maxResults);
            }
            if (listFindingsRequest.getNextToken() != null) {
                String nextToken = listFindingsRequest.getNextToken();
                jsonWriter.name("nextToken");
                jsonWriter.value(nextToken);
            }
            if (listFindingsRequest.getSort() != null) {
                SortCriteria sort = listFindingsRequest.getSort();
                jsonWriter.name("sort");
                SortCriteriaJsonMarshaller.getInstance().marshall(sort, jsonWriter);
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
