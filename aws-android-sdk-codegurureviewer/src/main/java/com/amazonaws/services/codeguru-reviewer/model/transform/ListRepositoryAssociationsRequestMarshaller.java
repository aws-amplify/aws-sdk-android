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
package com.amazonaws.services.codeguru-reviewer.model.transform;

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
import com.amazonaws.services.codeguru-reviewer.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;


/**
 * JSON request marshaller for ListRepositoryAssociationsRequest
 */
public class ListRepositoryAssociationsRequestMarshaller implements Marshaller<Request<ListRepositoryAssociationsRequest>, ListRepositoryAssociationsRequest> {

    public Request<ListRepositoryAssociationsRequest> marshall(ListRepositoryAssociationsRequest listRepositoryAssociationsRequest) {
        if (listRepositoryAssociationsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListRepositoryAssociationsRequest)");
        }

        Request<ListRepositoryAssociationsRequest> request = new DefaultRequest<ListRepositoryAssociationsRequest>(listRepositoryAssociationsRequest, "AmazonCodeGuruReviewer");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/associations";
        if (listRepositoryAssociationsRequest.getProviderTypes() != null) {
            request.addParameter("ProviderType", StringUtils.join(",", listRepositoryAssociationsRequest.getProviderTypes().toArray(new String[0])));
        }
        if (listRepositoryAssociationsRequest.getStates() != null) {
            request.addParameter("State", StringUtils.join(",", listRepositoryAssociationsRequest.getStates().toArray(new String[0])));
        }
        if (listRepositoryAssociationsRequest.getNames() != null) {
            request.addParameter("Name", StringUtils.join(",", listRepositoryAssociationsRequest.getNames().toArray(new String[0])));
        }
        if (listRepositoryAssociationsRequest.getOwners() != null) {
            request.addParameter("Owner", StringUtils.join(",", listRepositoryAssociationsRequest.getOwners().toArray(new String[0])));
        }
        if (listRepositoryAssociationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listRepositoryAssociationsRequest.getMaxResults()));
        }
        if (listRepositoryAssociationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listRepositoryAssociationsRequest.getNextToken()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
