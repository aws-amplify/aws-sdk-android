/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.geo.tracker;

import com.amazonaws.services.geo.model.BatchUpdateDevicePositionRequest;
import com.amazonaws.services.geo.model.BatchUpdateDevicePositionResult;

/**
 * Contains information about the locations which were successfully published.
 */
public class TrackingPublishedEvent {
    private BatchUpdateDevicePositionRequest request;
    private BatchUpdateDevicePositionResult result;

    /**
     * Constructs event with original request and result.
     * @param request Original request object
     * @param result Original result object
     */
    public TrackingPublishedEvent(BatchUpdateDevicePositionRequest request, BatchUpdateDevicePositionResult result) {
        this.request = request;
        this.result = result;
    }

    /**
     * Get original request object with the locations which were published.
     * @return original request object with the locations which were published.
     */
    public BatchUpdateDevicePositionRequest getRequest() {
        return request;
    }

    /**
     * Get original response object with the results of the batch publish including possibly errors.
     * @return original response object with the results of the batch publish.
     */
    public BatchUpdateDevicePositionResult getResult() {
        return result;
    }
}
