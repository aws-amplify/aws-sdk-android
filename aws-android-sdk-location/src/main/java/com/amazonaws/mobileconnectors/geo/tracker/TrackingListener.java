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

/**
 * A collection of callbacks to listen for the various events which happen during the tracking lifecycle.
 */
public interface TrackingListener {
    /**
     * Triggered when the stopTracking() method is called.
     */
    void onStop();

    /**
     * Triggered each time a batch of location points are sent to Amazon Location Service successfully.
     * @param event Contains data about the locations which were successfully published.
     */
    void onDataPublished(TrackingPublishedEvent event);

    /**
     * Triggered any time a batch of location points fail to be published.
     * @param error The reason publishing failed.
     */
    void onDataPublicationError(TrackingError error);
}
