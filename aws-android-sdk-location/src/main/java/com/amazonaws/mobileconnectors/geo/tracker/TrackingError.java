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

import androidx.annotation.NonNull;

/**
 * Describes an error which occurred during use of AWSLocationTracker.
 */
public final class TrackingError extends Exception {
    private final Type type;
    private final String recoverySuggestion;

    private TrackingError(
            @NonNull final Type type,
            @NonNull final String message,
            @NonNull final String recoverySuggestion) {
        super(message);
        this.recoverySuggestion = recoverySuggestion;
        this.type = type;
    }

    private TrackingError(
            @NonNull final Type type,
            @NonNull final String message,
            @NonNull final Throwable cause,
            @NonNull final String recoverySuggestion) {
        super(message, cause);
        this.recoverySuggestion = recoverySuggestion;
        this.type = type;
    }

    /**
     * Returns an enumerated value of the type of error which occurred.
     * @return an enumerated value of the type of error which occurred.
     */
    public Type getType() {
        return type;
    }

    /**
     * Returns a helpful, practical suggestion for how to address the error.
     * @return a helpful, practical suggestion for how to address the error.
     */
    public String getRecoverySuggestion() {
        return recoverySuggestion;
    }

    /**
     * Create an instance of TrackingError in the case of an invalid tracker name.
     * @return an instance of TrackingError in the case of an invalid tracker name.
     */
    public static TrackingError invalidTrackerName() {
        return new TrackingError(
                Type.INVALID_TRACKER_NAME,
                "The tracker name provided does not match any created tracker on the server.",
                "Check for misspellings and verify you already created a tracker with that name."
        );
    }

    /**
     * Create an instance of TrackingError in the case of the tracking already being started.
     * @return an instance of TrackingError in the case of the tracking already being started.
     */
    public static TrackingError trackerAlreadyStarted() {
        return new TrackingError(
                Type.TRACKER_ALREADY_STARTED,
                "This tracker is currently running.",
                "If you want to start it again with different options, first call stopTracking()."
        );
    }

    /**
     * Create an instance of TrackingError in the case where the user hasn't previously obtained location permissions.
     * @return an instance of TrackingError in the case where the user hasn't previously obtained location permissions.
     */
    public static TrackingError missingLocationPermissions() {
        return new TrackingError(
                Type.MISSING_LOCATION_PERMISSIONS,
                "The required location permissions to perform tracking have either not been granted or " +
                    "possibly were revoked by the user.",
                "Check that you have included the necessary permissions in the Manifest and " +
                        " that the user has granted them per the documentation."
        );
    }

    /**
     * Create an instance of TrackingError in the case of the user being unauthorized.
     * @return an instance of TrackingError in the case of the user being unauthorized.
     */
    public static TrackingError unauthorized() {
        return new TrackingError(
                Type.UNAUTHORIZED,
                "You are not authorized to upload tracking data.",
                "Check that you are providing a valid credentials provider and the user is logged in."
        );
    }

    /**
     * Create an instance of TrackingError for the case an error came back from a service call.
     * @param error The error returned from the service call.
     * @return an instance of TrackingError for the case an error came back from a service call.
     */
    public static TrackingError serviceError(Throwable error) {
        return new TrackingError(
                Type.SERVICE_ERROR,
                "Received an error on attempting to upload tracking data.",
                error,
                "See the attached exception for more information."
        );
    }

    public enum Type {
        /**
         * User provided a tracker name that doesn't match a created tracking resource.
         */
        INVALID_TRACKER_NAME,

        /**
         * Attempted to start tracking after it was already started.
         */
        TRACKER_ALREADY_STARTED,

        /**
         * User failed to obtain location permissions before starting tracker.
         */
        MISSING_LOCATION_PERMISSIONS,

        /**
         * User is unauthorized to access service.
         */
        UNAUTHORIZED,

        /**
         * An error came back from a service call.
         */
        SERVICE_ERROR
    }
}
