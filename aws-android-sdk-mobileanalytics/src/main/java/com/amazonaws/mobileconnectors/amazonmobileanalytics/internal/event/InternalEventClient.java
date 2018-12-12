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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.EventClient;
/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public interface InternalEventClient extends EventClient {
    public InternalEvent createInternalEvent(final String eventType, final long sessionStart,
            final Long sessionEnd, final Long duration);

    public AnalyticsEvent createEvent(String eventType, boolean applyGlobalAttributes);

    public void addEventObserver(final EventObserver observer);

    public void removeEventObserver(final EventObserver observer);

    public void setSessionId(final String sessionId);

    public void setSessionStartTime(final long sessionStartTime);

    public String getSessionId();

    public long getSessionStartTime();
}
