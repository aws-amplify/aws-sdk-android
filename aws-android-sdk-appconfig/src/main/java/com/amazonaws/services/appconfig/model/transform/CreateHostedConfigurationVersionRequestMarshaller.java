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

package com.amazonaws.services.appconfig.model.transform;

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
import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateHostedConfigurationVersionRequest
 */
public class CreateHostedConfigurationVersionRequestMarshaller
        implements
        Marshaller<Request<CreateHostedConfigurationVersionRequest>, CreateHostedConfigurationVersionRequest> {

    public Request<CreateHostedConfigurationVersionRequest> marshall(
            CreateHostedConfigurationVersionRequest createHostedConfigurationVersionRequest) {
        if (createHostedConfigurationVersionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateHostedConfigurationVersionRequest)");
        }

        Request<CreateHostedConfigurationVersionRequest> request = new DefaultRequest<CreateHostedConfigurationVersionRequest>(
                createHostedConfigurationVersionRequest, "AmazonAppConfig");
        request.setHttpMethod(HttpMethodName.POST);

        if (createHostedConfigurationVersionRequest.getDescription() != null) {
            request.addHeader("Description", StringUtils
                    .fromString(createHostedConfigurationVersionRequest.getDescription()));
        }
        if (createHostedConfigurationVersionRequest.getContentType() != null) {
            request.addHeader("Content-Type", StringUtils
                    .fromString(createHostedConfigurationVersionRequest.getContentType()));
        }
        if (createHostedConfigurationVersionRequest.getLatestVersionNumber() != null) {
            request.addHeader("Latest-Version-Number", StringUtils
                    .fromInteger(createHostedConfigurationVersionRequest.getLatestVersionNumber()));
        }
        String uriResourcePath = "/applications/{ApplicationId}/configurationprofiles/{ConfigurationProfileId}/hostedconfigurationversions";
        uriResourcePath = uriResourcePath.replace(
                "{ApplicationId}",
                (createHostedConfigurationVersionRequest.getApplicationId() == null) ? ""
                        : StringUtils.fromString(createHostedConfigurationVersionRequest
                                .getApplicationId()));
        uriResourcePath = uriResourcePath.replace(
                "{ConfigurationProfileId}",
                (createHostedConfigurationVersionRequest.getConfigurationProfileId() == null) ? ""
                        : StringUtils.fromString(createHostedConfigurationVersionRequest
                                .getConfigurationProfileId()));
        request.setResourcePath(uriResourcePath);
        request.addHeader("Content-Length",
                Integer.toString(createHostedConfigurationVersionRequest.getContent().remaining()));
        request.setContent(BinaryUtils.toStream(createHostedConfigurationVersionRequest
                .getContent()));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
