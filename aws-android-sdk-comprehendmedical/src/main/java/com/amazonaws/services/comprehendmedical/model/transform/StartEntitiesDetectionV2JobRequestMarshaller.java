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

package com.amazonaws.services.comprehendmedical.model.transform;

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
import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartEntitiesDetectionV2JobRequest
 */
public class StartEntitiesDetectionV2JobRequestMarshaller implements
        Marshaller<Request<StartEntitiesDetectionV2JobRequest>, StartEntitiesDetectionV2JobRequest> {

    public Request<StartEntitiesDetectionV2JobRequest> marshall(
            StartEntitiesDetectionV2JobRequest startEntitiesDetectionV2JobRequest) {
        if (startEntitiesDetectionV2JobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartEntitiesDetectionV2JobRequest)");
        }

        Request<StartEntitiesDetectionV2JobRequest> request = new DefaultRequest<StartEntitiesDetectionV2JobRequest>(
                startEntitiesDetectionV2JobRequest, "AWSComprehendMedical");
        String target = "ComprehendMedical_20181030.StartEntitiesDetectionV2Job";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startEntitiesDetectionV2JobRequest.getInputDataConfig() != null) {
                InputDataConfig inputDataConfig = startEntitiesDetectionV2JobRequest
                        .getInputDataConfig();
                jsonWriter.name("InputDataConfig");
                InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
            }
            if (startEntitiesDetectionV2JobRequest.getOutputDataConfig() != null) {
                OutputDataConfig outputDataConfig = startEntitiesDetectionV2JobRequest
                        .getOutputDataConfig();
                jsonWriter.name("OutputDataConfig");
                OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
            }
            if (startEntitiesDetectionV2JobRequest.getDataAccessRoleArn() != null) {
                String dataAccessRoleArn = startEntitiesDetectionV2JobRequest
                        .getDataAccessRoleArn();
                jsonWriter.name("DataAccessRoleArn");
                jsonWriter.value(dataAccessRoleArn);
            }
            if (startEntitiesDetectionV2JobRequest.getJobName() != null) {
                String jobName = startEntitiesDetectionV2JobRequest.getJobName();
                jsonWriter.name("JobName");
                jsonWriter.value(jobName);
            }
            if (startEntitiesDetectionV2JobRequest.getClientRequestToken() != null) {
                String clientRequestToken = startEntitiesDetectionV2JobRequest
                        .getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startEntitiesDetectionV2JobRequest.getKMSKey() != null) {
                String kMSKey = startEntitiesDetectionV2JobRequest.getKMSKey();
                jsonWriter.name("KMSKey");
                jsonWriter.value(kMSKey);
            }
            if (startEntitiesDetectionV2JobRequest.getLanguageCode() != null) {
                String languageCode = startEntitiesDetectionV2JobRequest.getLanguageCode();
                jsonWriter.name("LanguageCode");
                jsonWriter.value(languageCode);
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
