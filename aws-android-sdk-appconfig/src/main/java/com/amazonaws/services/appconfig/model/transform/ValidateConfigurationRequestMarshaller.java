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
 * JSON request marshaller for ValidateConfigurationRequest
 */
public class ValidateConfigurationRequestMarshaller implements
        Marshaller<Request<ValidateConfigurationRequest>, ValidateConfigurationRequest> {

    public Request<ValidateConfigurationRequest> marshall(
            ValidateConfigurationRequest validateConfigurationRequest) {
        if (validateConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ValidateConfigurationRequest)");
        }

        Request<ValidateConfigurationRequest> request = new DefaultRequest<ValidateConfigurationRequest>(
                validateConfigurationRequest, "AmazonAppConfig");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/applications/{ApplicationId}/configurationprofiles/{ConfigurationProfileId}/validators";
        uriResourcePath = uriResourcePath.replace(
                "{ApplicationId}",
                (validateConfigurationRequest.getApplicationId() == null) ? "" : StringUtils
                        .fromString(validateConfigurationRequest.getApplicationId()));
        uriResourcePath = uriResourcePath.replace(
                "{ConfigurationProfileId}",
                (validateConfigurationRequest.getConfigurationProfileId() == null) ? ""
                        : StringUtils.fromString(validateConfigurationRequest
                                .getConfigurationProfileId()));
        if (validateConfigurationRequest.getConfigurationVersion() != null) {
            request.addParameter("configuration_version",
                    StringUtils.fromString(validateConfigurationRequest.getConfigurationVersion()));
        }
        request.setResourcePath(uriResourcePath);
        request.addHeader("Content-Length", "0");
        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
