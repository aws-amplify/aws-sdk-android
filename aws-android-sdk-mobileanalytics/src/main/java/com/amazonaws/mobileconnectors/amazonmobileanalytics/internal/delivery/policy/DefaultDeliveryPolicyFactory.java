/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class DefaultDeliveryPolicyFactory implements DeliveryPolicyFactory {
    public static final String KEY_FORCE_SUBMISSION_WAIT = "forceSubmissionWaitTime";

    private final AnalyticsContext context;
    private final boolean isWanAllowed;
    private final long backgroundSubmissionInterval;
    public final long forceSubmissionInterval;

    private static final long BG_SUBMISSION_WAIT_TIME_SEC = 0l;
    private static final long FORCE_SUBMISSION_WAIT_TIME_SEC = 60l;

    public DefaultDeliveryPolicyFactory(AnalyticsContext context, boolean isWanAllowed) {
        this.context = context;
        this.isWanAllowed = isWanAllowed;
        this.forceSubmissionInterval = context.getConfiguration().optLong(
                KEY_FORCE_SUBMISSION_WAIT, FORCE_SUBMISSION_WAIT_TIME_SEC) * 1000;
        this.backgroundSubmissionInterval = context.getConfiguration().optLong(
                "backgroundSubmissionWaitTime", BG_SUBMISSION_WAIT_TIME_SEC) * 1000;
    }

    @Override
    public DeliveryPolicy newConnectivityPolicy() {
        return new ConnectivityPolicy(context, isWanAllowed);
    }

    @Override
    public DeliveryPolicy newForceSubmissionTimePolicy() {
        return new SubmissionTimePolicy(context, forceSubmissionInterval);
    }

    @Override
    public DeliveryPolicy newBackgroundSubmissionTimePolicy() {
        return new SubmissionTimePolicy(context, backgroundSubmissionInterval);
    }

}
