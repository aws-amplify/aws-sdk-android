/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON request marshaller for ForecastGeofenceEventsRequest
 */
public class ForecastGeofenceEventsRequestMarshaller implements
        Marshaller<Request<ForecastGeofenceEventsRequest>, ForecastGeofenceEventsRequest> {

    public Request<ForecastGeofenceEventsRequest> marshall(
            ForecastGeofenceEventsRequest forecastGeofenceEventsRequest) {
        if (forecastGeofenceEventsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ForecastGeofenceEventsRequest)");
        }

        Request<ForecastGeofenceEventsRequest> request = new DefaultRequest<ForecastGeofenceEventsRequest>(
                forecastGeofenceEventsRequest, "AmazonLocation");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/geofencing/v0/collections/{CollectionName}/forecast-geofence-events";
        uriResourcePath = uriResourcePath.replace(
                "{CollectionName}",
                (forecastGeofenceEventsRequest.getCollectionName() == null) ? "" : StringUtils
                        .fromString(forecastGeofenceEventsRequest.getCollectionName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (forecastGeofenceEventsRequest.getDeviceState() != null) {
                ForecastGeofenceEventsDeviceState deviceState = forecastGeofenceEventsRequest
                        .getDeviceState();
                jsonWriter.name("DeviceState");
                ForecastGeofenceEventsDeviceStateJsonMarshaller.getInstance().marshall(deviceState,
                        jsonWriter);
            }
            if (forecastGeofenceEventsRequest.getTimeHorizonMinutes() != null) {
                Double timeHorizonMinutes = forecastGeofenceEventsRequest.getTimeHorizonMinutes();
                jsonWriter.name("TimeHorizonMinutes");
                jsonWriter.value(timeHorizonMinutes);
            }
            if (forecastGeofenceEventsRequest.getDistanceUnit() != null) {
                String distanceUnit = forecastGeofenceEventsRequest.getDistanceUnit();
                jsonWriter.name("DistanceUnit");
                jsonWriter.value(distanceUnit);
            }
            if (forecastGeofenceEventsRequest.getSpeedUnit() != null) {
                String speedUnit = forecastGeofenceEventsRequest.getSpeedUnit();
                jsonWriter.name("SpeedUnit");
                jsonWriter.value(speedUnit);
            }
            if (forecastGeofenceEventsRequest.getNextToken() != null) {
                String nextToken = forecastGeofenceEventsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (forecastGeofenceEventsRequest.getMaxResults() != null) {
                Integer maxResults = forecastGeofenceEventsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
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
        request.setHostPrefix("geofencing.");

        return request;
    }
}
