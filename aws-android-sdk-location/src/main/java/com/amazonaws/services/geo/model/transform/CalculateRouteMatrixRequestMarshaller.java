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
 * JSON request marshaller for CalculateRouteMatrixRequest
 */
public class CalculateRouteMatrixRequestMarshaller implements
        Marshaller<Request<CalculateRouteMatrixRequest>, CalculateRouteMatrixRequest> {

    public Request<CalculateRouteMatrixRequest> marshall(
            CalculateRouteMatrixRequest calculateRouteMatrixRequest) {
        if (calculateRouteMatrixRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CalculateRouteMatrixRequest)");
        }

        Request<CalculateRouteMatrixRequest> request = new DefaultRequest<CalculateRouteMatrixRequest>(
                calculateRouteMatrixRequest, "AmazonLocation");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/routes/v0/calculators/{CalculatorName}/calculate/route-matrix";
        uriResourcePath = uriResourcePath.replace(
                "{CalculatorName}",
                (calculateRouteMatrixRequest.getCalculatorName() == null) ? "" : StringUtils
                        .fromString(calculateRouteMatrixRequest.getCalculatorName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (calculateRouteMatrixRequest.getCarModeOptions() != null) {
                CalculateRouteCarModeOptions carModeOptions = calculateRouteMatrixRequest
                        .getCarModeOptions();
                jsonWriter.name("CarModeOptions");
                CalculateRouteCarModeOptionsJsonMarshaller.getInstance().marshall(carModeOptions,
                        jsonWriter);
            }
            if (calculateRouteMatrixRequest.getDepartNow() != null) {
                Boolean departNow = calculateRouteMatrixRequest.getDepartNow();
                jsonWriter.name("DepartNow");
                jsonWriter.value(departNow);
            }
            if (calculateRouteMatrixRequest.getDeparturePositions() != null) {
                java.util.List<java.util.List<Double>> departurePositions = calculateRouteMatrixRequest
                        .getDeparturePositions();
                jsonWriter.name("DeparturePositions");
                jsonWriter.beginArray();
                for (java.util.List<Double> departurePositionsItem : departurePositions) {
                    if (departurePositionsItem != null) {
                        jsonWriter.beginArray();
                        for (Double departurePositionsItemItem : departurePositionsItem) {
                            if (departurePositionsItemItem != null) {
                                jsonWriter.value(departurePositionsItemItem);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endArray();
            }
            if (calculateRouteMatrixRequest.getDepartureTime() != null) {
                java.util.Date departureTime = calculateRouteMatrixRequest.getDepartureTime();
                jsonWriter.name("DepartureTime");
                jsonWriter.value(DateUtils.formatISO8601Date(departureTime));
            }
            if (calculateRouteMatrixRequest.getDestinationPositions() != null) {
                java.util.List<java.util.List<Double>> destinationPositions = calculateRouteMatrixRequest
                        .getDestinationPositions();
                jsonWriter.name("DestinationPositions");
                jsonWriter.beginArray();
                for (java.util.List<Double> destinationPositionsItem : destinationPositions) {
                    if (destinationPositionsItem != null) {
                        jsonWriter.beginArray();
                        for (Double destinationPositionsItemItem : destinationPositionsItem) {
                            if (destinationPositionsItemItem != null) {
                                jsonWriter.value(destinationPositionsItemItem);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endArray();
            }
            if (calculateRouteMatrixRequest.getDistanceUnit() != null) {
                String distanceUnit = calculateRouteMatrixRequest.getDistanceUnit();
                jsonWriter.name("DistanceUnit");
                jsonWriter.value(distanceUnit);
            }
            if (calculateRouteMatrixRequest.getTravelMode() != null) {
                String travelMode = calculateRouteMatrixRequest.getTravelMode();
                jsonWriter.name("TravelMode");
                jsonWriter.value(travelMode);
            }
            if (calculateRouteMatrixRequest.getTruckModeOptions() != null) {
                CalculateRouteTruckModeOptions truckModeOptions = calculateRouteMatrixRequest
                        .getTruckModeOptions();
                jsonWriter.name("TruckModeOptions");
                CalculateRouteTruckModeOptionsJsonMarshaller.getInstance().marshall(
                        truckModeOptions, jsonWriter);
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
