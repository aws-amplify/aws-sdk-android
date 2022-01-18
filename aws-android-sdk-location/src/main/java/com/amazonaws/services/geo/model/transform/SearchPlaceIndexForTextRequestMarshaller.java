/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

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
import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for SearchPlaceIndexForTextRequest
 */
public class SearchPlaceIndexForTextRequestMarshaller implements
        Marshaller<Request<SearchPlaceIndexForTextRequest>, SearchPlaceIndexForTextRequest> {

    public Request<SearchPlaceIndexForTextRequest> marshall(
            SearchPlaceIndexForTextRequest searchPlaceIndexForTextRequest) {
        if (searchPlaceIndexForTextRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SearchPlaceIndexForTextRequest)");
        }

        Request<SearchPlaceIndexForTextRequest> request = new DefaultRequest<SearchPlaceIndexForTextRequest>(
                searchPlaceIndexForTextRequest, "AmazonLocation");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/places/v0/indexes/{IndexName}/search/text";
        uriResourcePath = uriResourcePath.replace(
                "{IndexName}",
                (searchPlaceIndexForTextRequest.getIndexName() == null) ? "" : StringUtils
                        .fromString(searchPlaceIndexForTextRequest.getIndexName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (searchPlaceIndexForTextRequest.getBiasPosition() != null) {
                java.util.List<Double> biasPosition = searchPlaceIndexForTextRequest
                        .getBiasPosition();
                jsonWriter.name("BiasPosition");
                jsonWriter.beginArray();
                for (Double biasPositionItem : biasPosition) {
                    if (biasPositionItem != null) {
                        jsonWriter.value(biasPositionItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (searchPlaceIndexForTextRequest.getFilterBBox() != null) {
                java.util.List<Double> filterBBox = searchPlaceIndexForTextRequest.getFilterBBox();
                jsonWriter.name("FilterBBox");
                jsonWriter.beginArray();
                for (Double filterBBoxItem : filterBBox) {
                    if (filterBBoxItem != null) {
                        jsonWriter.value(filterBBoxItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (searchPlaceIndexForTextRequest.getFilterCountries() != null) {
                java.util.List<String> filterCountries = searchPlaceIndexForTextRequest
                        .getFilterCountries();
                jsonWriter.name("FilterCountries");
                jsonWriter.beginArray();
                for (String filterCountriesItem : filterCountries) {
                    if (filterCountriesItem != null) {
                        jsonWriter.value(filterCountriesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (searchPlaceIndexForTextRequest.getLanguage() != null) {
                String language = searchPlaceIndexForTextRequest.getLanguage();
                jsonWriter.name("Language");
                jsonWriter.value(language);
            }
            if (searchPlaceIndexForTextRequest.getMaxResults() != null) {
                Integer maxResults = searchPlaceIndexForTextRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (searchPlaceIndexForTextRequest.getText() != null) {
                String text = searchPlaceIndexForTextRequest.getText();
                jsonWriter.name("Text");
                jsonWriter.value(text);
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
        request.setHostPrefix("places.");

        return request;
    }
}
