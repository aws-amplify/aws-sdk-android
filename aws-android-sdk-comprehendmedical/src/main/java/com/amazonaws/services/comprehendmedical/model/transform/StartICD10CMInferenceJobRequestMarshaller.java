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
 * JSON request marshaller for StartICD10CMInferenceJobRequest
 */
public class StartICD10CMInferenceJobRequestMarshaller implements
        Marshaller<Request<StartICD10CMInferenceJobRequest>, StartICD10CMInferenceJobRequest> {

    public Request<StartICD10CMInferenceJobRequest> marshall(
            StartICD10CMInferenceJobRequest startICD10CMInferenceJobRequest) {
        if (startICD10CMInferenceJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartICD10CMInferenceJobRequest)");
        }

        Request<StartICD10CMInferenceJobRequest> request = new DefaultRequest<StartICD10CMInferenceJobRequest>(
                startICD10CMInferenceJobRequest, "AWSComprehendMedical");
        String target = "ComprehendMedical_20181030.StartICD10CMInferenceJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startICD10CMInferenceJobRequest.getInputDataConfig() != null) {
                InputDataConfig inputDataConfig = startICD10CMInferenceJobRequest
                        .getInputDataConfig();
                jsonWriter.name("InputDataConfig");
                InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
            }
            if (startICD10CMInferenceJobRequest.getOutputDataConfig() != null) {
                OutputDataConfig outputDataConfig = startICD10CMInferenceJobRequest
                        .getOutputDataConfig();
                jsonWriter.name("OutputDataConfig");
                OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
            }
            if (startICD10CMInferenceJobRequest.getDataAccessRoleArn() != null) {
                String dataAccessRoleArn = startICD10CMInferenceJobRequest.getDataAccessRoleArn();
                jsonWriter.name("DataAccessRoleArn");
                jsonWriter.value(dataAccessRoleArn);
            }
            if (startICD10CMInferenceJobRequest.getJobName() != null) {
                String jobName = startICD10CMInferenceJobRequest.getJobName();
                jsonWriter.name("JobName");
                jsonWriter.value(jobName);
            }
            if (startICD10CMInferenceJobRequest.getClientRequestToken() != null) {
                String clientRequestToken = startICD10CMInferenceJobRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startICD10CMInferenceJobRequest.getKMSKey() != null) {
                String kMSKey = startICD10CMInferenceJobRequest.getKMSKey();
                jsonWriter.name("KMSKey");
                jsonWriter.value(kMSKey);
            }
            if (startICD10CMInferenceJobRequest.getLanguageCode() != null) {
                String languageCode = startICD10CMInferenceJobRequest.getLanguageCode();
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
