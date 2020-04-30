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

package com.amazonaws.services.schemas.model.transform;

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
import com.amazonaws.services.schemas.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetCodeBindingSourceRequest
 */
public class GetCodeBindingSourceRequestMarshaller implements
        Marshaller<Request<GetCodeBindingSourceRequest>, GetCodeBindingSourceRequest> {

    public Request<GetCodeBindingSourceRequest> marshall(
            GetCodeBindingSourceRequest getCodeBindingSourceRequest) {
        if (getCodeBindingSourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetCodeBindingSourceRequest)");
        }

        Request<GetCodeBindingSourceRequest> request = new DefaultRequest<GetCodeBindingSourceRequest>(
                getCodeBindingSourceRequest, "Schemas");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/registries/name/{registryName}/schemas/name/{schemaName}/language/{language}/source";
        uriResourcePath = uriResourcePath.replace(
                "{language}",
                (getCodeBindingSourceRequest.getLanguage() == null) ? "" : StringUtils
                        .fromString(getCodeBindingSourceRequest.getLanguage()));
        uriResourcePath = uriResourcePath.replace(
                "{registryName}",
                (getCodeBindingSourceRequest.getRegistryName() == null) ? "" : StringUtils
                        .fromString(getCodeBindingSourceRequest.getRegistryName()));
        uriResourcePath = uriResourcePath.replace(
                "{schemaName}",
                (getCodeBindingSourceRequest.getSchemaName() == null) ? "" : StringUtils
                        .fromString(getCodeBindingSourceRequest.getSchemaName()));
        if (getCodeBindingSourceRequest.getSchemaVersion() != null) {
            request.addParameter("schemaVersion",
                    StringUtils.fromString(getCodeBindingSourceRequest.getSchemaVersion()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
