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
 * JSON request marshaller for CalculateRouteRequest
 */
public class CalculateRouteRequestMarshaller implements
        Marshaller<Request<CalculateRouteRequest>, CalculateRouteRequest> {

    public Request<CalculateRouteRequest> marshall(CalculateRouteRequest calculateRouteRequest) {
        if (calculateRouteRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CalculateRouteRequest)");
        }

        Request<CalculateRouteRequest> request = new DefaultRequest<CalculateRouteRequest>(
                calculateRouteRequest, "AmazonLocation");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/routes/v0/calculators/{CalculatorName}/calculate/route";
        uriResourcePath = uriResourcePath.replace(
                "{CalculatorName}",
                (calculateRouteRequest.getCalculatorName() == null) ? "" : StringUtils
                        .fromString(calculateRouteRequest.getCalculatorName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (calculateRouteRequest.getCarModeOptions() != null) {
                CalculateRouteCarModeOptions carModeOptions = calculateRouteRequest
                        .getCarModeOptions();
                jsonWriter.name("CarModeOptions");
                CalculateRouteCarModeOptionsJsonMarshaller.getInstance().marshall(carModeOptions,
                        jsonWriter);
            }
            if (calculateRouteRequest.getDepartNow() != null) {
                Boolean departNow = calculateRouteRequest.getDepartNow();
                jsonWriter.name("DepartNow");
                jsonWriter.value(departNow);
            }
            if (calculateRouteRequest.getDeparturePosition() != null) {
                java.util.List<Double> departurePosition = calculateRouteRequest
                        .getDeparturePosition();
                jsonWriter.name("DeparturePosition");
                jsonWriter.beginArray();
                for (Double departurePositionItem : departurePosition) {
                    if (departurePositionItem != null) {
                        jsonWriter.value(departurePositionItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (calculateRouteRequest.getDepartureTime() != null) {
                java.util.Date departureTime = calculateRouteRequest.getDepartureTime();
                jsonWriter.name("DepartureTime");
                jsonWriter.value(DateUtils.formatISO8601Date(departureTime));
            }
            if (calculateRouteRequest.getDestinationPosition() != null) {
                java.util.List<Double> destinationPosition = calculateRouteRequest
                        .getDestinationPosition();
                jsonWriter.name("DestinationPosition");
                jsonWriter.beginArray();
                for (Double destinationPositionItem : destinationPosition) {
                    if (destinationPositionItem != null) {
                        jsonWriter.value(destinationPositionItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (calculateRouteRequest.getDistanceUnit() != null) {
                String distanceUnit = calculateRouteRequest.getDistanceUnit();
                jsonWriter.name("DistanceUnit");
                jsonWriter.value(distanceUnit);
            }
            if (calculateRouteRequest.getIncludeLegGeometry() != null) {
                Boolean includeLegGeometry = calculateRouteRequest.getIncludeLegGeometry();
                jsonWriter.name("IncludeLegGeometry");
                jsonWriter.value(includeLegGeometry);
            }
            if (calculateRouteRequest.getTravelMode() != null) {
                String travelMode = calculateRouteRequest.getTravelMode();
                jsonWriter.name("TravelMode");
                jsonWriter.value(travelMode);
            }
            if (calculateRouteRequest.getTruckModeOptions() != null) {
                CalculateRouteTruckModeOptions truckModeOptions = calculateRouteRequest
                        .getTruckModeOptions();
                jsonWriter.name("TruckModeOptions");
                CalculateRouteTruckModeOptionsJsonMarshaller.getInstance().marshall(
                        truckModeOptions, jsonWriter);
            }
            if (calculateRouteRequest.getWaypointPositions() != null) {
                java.util.List<java.util.List<Double>> waypointPositions = calculateRouteRequest
                        .getWaypointPositions();
                jsonWriter.name("WaypointPositions");
                jsonWriter.beginArray();
                for (java.util.List<Double> waypointPositionsItem : waypointPositions) {
                    if (waypointPositionsItem != null) {
                        jsonWriter.beginArray();
                        for (Double waypointPositionsItemItem : waypointPositionsItem) {
                            if (waypointPositionsItemItem != null) {
                                jsonWriter.value(waypointPositionsItemItem);
                            }
                        }
                        jsonWriter.endArray();
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
        request.setHostPrefix("routes.");

        return request;
    }
}
