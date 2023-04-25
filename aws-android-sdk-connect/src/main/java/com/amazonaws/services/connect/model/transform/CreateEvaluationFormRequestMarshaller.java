/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateEvaluationFormRequest
 */
public class CreateEvaluationFormRequestMarshaller implements
        Marshaller<Request<CreateEvaluationFormRequest>, CreateEvaluationFormRequest> {

    public Request<CreateEvaluationFormRequest> marshall(
            CreateEvaluationFormRequest createEvaluationFormRequest) {
        if (createEvaluationFormRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateEvaluationFormRequest)");
        }

        Request<CreateEvaluationFormRequest> request = new DefaultRequest<CreateEvaluationFormRequest>(
                createEvaluationFormRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/evaluation-forms/{InstanceId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (createEvaluationFormRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(createEvaluationFormRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createEvaluationFormRequest.getTitle() != null) {
                String title = createEvaluationFormRequest.getTitle();
                jsonWriter.name("Title");
                jsonWriter.value(title);
            }
            if (createEvaluationFormRequest.getDescription() != null) {
                String description = createEvaluationFormRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createEvaluationFormRequest.getItems() != null) {
                java.util.List<EvaluationFormItem> items = createEvaluationFormRequest.getItems();
                jsonWriter.name("Items");
                jsonWriter.beginArray();
                for (EvaluationFormItem itemsItem : items) {
                    if (itemsItem != null) {
                        EvaluationFormItemJsonMarshaller.getInstance().marshall(itemsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createEvaluationFormRequest.getScoringStrategy() != null) {
                EvaluationFormScoringStrategy scoringStrategy = createEvaluationFormRequest
                        .getScoringStrategy();
                jsonWriter.name("ScoringStrategy");
                EvaluationFormScoringStrategyJsonMarshaller.getInstance().marshall(scoringStrategy,
                        jsonWriter);
            }
            if (createEvaluationFormRequest.getClientToken() != null) {
                String clientToken = createEvaluationFormRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
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
