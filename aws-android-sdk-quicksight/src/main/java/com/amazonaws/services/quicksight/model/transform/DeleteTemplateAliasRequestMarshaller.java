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

package com.amazonaws.services.quicksight.model.transform;

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
import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DeleteTemplateAliasRequest
 */
public class DeleteTemplateAliasRequestMarshaller implements
        Marshaller<Request<DeleteTemplateAliasRequest>, DeleteTemplateAliasRequest> {

    public Request<DeleteTemplateAliasRequest> marshall(
            DeleteTemplateAliasRequest deleteTemplateAliasRequest) {
        if (deleteTemplateAliasRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteTemplateAliasRequest)");
        }

        Request<DeleteTemplateAliasRequest> request = new DefaultRequest<DeleteTemplateAliasRequest>(
                deleteTemplateAliasRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/accounts/{AwsAccountId}/templates/{TemplateId}/aliases/{AliasName}";
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (deleteTemplateAliasRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(deleteTemplateAliasRequest.getAwsAccountId()));
        uriResourcePath = uriResourcePath.replace(
                "{TemplateId}",
                (deleteTemplateAliasRequest.getTemplateId() == null) ? "" : StringUtils
                        .fromString(deleteTemplateAliasRequest.getTemplateId()));
        uriResourcePath = uriResourcePath.replace(
                "{AliasName}",
                (deleteTemplateAliasRequest.getAliasName() == null) ? "" : StringUtils
                        .fromString(deleteTemplateAliasRequest.getAliasName()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
