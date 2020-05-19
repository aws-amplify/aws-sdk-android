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

package com.amazonaws.services.chime.model.transform;

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
import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutVoiceConnectorLoggingConfigurationRequest
 */
public class PutVoiceConnectorLoggingConfigurationRequestMarshaller
        implements
        Marshaller<Request<PutVoiceConnectorLoggingConfigurationRequest>, PutVoiceConnectorLoggingConfigurationRequest> {

    public Request<PutVoiceConnectorLoggingConfigurationRequest> marshall(
            PutVoiceConnectorLoggingConfigurationRequest putVoiceConnectorLoggingConfigurationRequest) {
        if (putVoiceConnectorLoggingConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutVoiceConnectorLoggingConfigurationRequest)");
        }

        Request<PutVoiceConnectorLoggingConfigurationRequest> request = new DefaultRequest<PutVoiceConnectorLoggingConfigurationRequest>(
                putVoiceConnectorLoggingConfigurationRequest, "AmazonChime");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/voice-connectors/{voiceConnectorId}/logging-configuration";
        uriResourcePath = uriResourcePath.replace(
                "{voiceConnectorId}",
                (putVoiceConnectorLoggingConfigurationRequest.getVoiceConnectorId() == null) ? ""
                        : StringUtils.fromString(putVoiceConnectorLoggingConfigurationRequest
                                .getVoiceConnectorId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putVoiceConnectorLoggingConfigurationRequest.getLoggingConfiguration() != null) {
                LoggingConfiguration loggingConfiguration = putVoiceConnectorLoggingConfigurationRequest
                        .getLoggingConfiguration();
                jsonWriter.name("LoggingConfiguration");
                LoggingConfigurationJsonMarshaller.getInstance().marshall(loggingConfiguration,
                        jsonWriter);
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
