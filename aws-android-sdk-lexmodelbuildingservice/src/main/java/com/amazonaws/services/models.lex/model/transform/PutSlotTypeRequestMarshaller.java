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

package com.amazonaws.services.models.lex.model.transform;

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
import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutSlotTypeRequest
 */
public class PutSlotTypeRequestMarshaller implements
        Marshaller<Request<PutSlotTypeRequest>, PutSlotTypeRequest> {

    public Request<PutSlotTypeRequest> marshall(PutSlotTypeRequest putSlotTypeRequest) {
        if (putSlotTypeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutSlotTypeRequest)");
        }

        Request<PutSlotTypeRequest> request = new DefaultRequest<PutSlotTypeRequest>(
                putSlotTypeRequest, "AmazonLexModelBuildingService");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/slottypes/{name}/versions/$LATEST";
        uriResourcePath = uriResourcePath.replace(
                "{name}",
                (putSlotTypeRequest.getName() == null) ? "" : StringUtils
                        .fromString(putSlotTypeRequest.getName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putSlotTypeRequest.getDescription() != null) {
                String description = putSlotTypeRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (putSlotTypeRequest.getEnumerationValues() != null) {
                java.util.List<EnumerationValue> enumerationValues = putSlotTypeRequest
                        .getEnumerationValues();
                jsonWriter.name("enumerationValues");
                jsonWriter.beginArray();
                for (EnumerationValue enumerationValuesItem : enumerationValues) {
                    if (enumerationValuesItem != null) {
                        EnumerationValueJsonMarshaller.getInstance().marshall(
                                enumerationValuesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (putSlotTypeRequest.getChecksum() != null) {
                String checksum = putSlotTypeRequest.getChecksum();
                jsonWriter.name("checksum");
                jsonWriter.value(checksum);
            }
            if (putSlotTypeRequest.getValueSelectionStrategy() != null) {
                String valueSelectionStrategy = putSlotTypeRequest.getValueSelectionStrategy();
                jsonWriter.name("valueSelectionStrategy");
                jsonWriter.value(valueSelectionStrategy);
            }
            if (putSlotTypeRequest.getCreateVersion() != null) {
                Boolean createVersion = putSlotTypeRequest.getCreateVersion();
                jsonWriter.name("createVersion");
                jsonWriter.value(createVersion);
            }
            if (putSlotTypeRequest.getParentSlotTypeSignature() != null) {
                String parentSlotTypeSignature = putSlotTypeRequest.getParentSlotTypeSignature();
                jsonWriter.name("parentSlotTypeSignature");
                jsonWriter.value(parentSlotTypeSignature);
            }
            if (putSlotTypeRequest.getSlotTypeConfigurations() != null) {
                java.util.List<SlotTypeConfiguration> slotTypeConfigurations = putSlotTypeRequest
                        .getSlotTypeConfigurations();
                jsonWriter.name("slotTypeConfigurations");
                jsonWriter.beginArray();
                for (SlotTypeConfiguration slotTypeConfigurationsItem : slotTypeConfigurations) {
                    if (slotTypeConfigurationsItem != null) {
                        SlotTypeConfigurationJsonMarshaller.getInstance().marshall(
                                slotTypeConfigurationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
