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

package com.amazonaws.mobileconnectors.amazonmobileanalytics;

/**
 * SessionClient is the entry point into the Amazon Mobile Analytics SDK where
 * sessions can be paused or resumed. A session is created and started
 * immediately after instantiating the MobileAnalyticsManager object. The
 * session remains active until it is paused. When in a paused state, the
 * session time will not accumulate. When resuming a session, if enough time has
 * elapsed from when the session is paused to when it's resumed, the session is
 * ended and a new session is created and started. Otherwise, the paused session
 * is resumed and the session time continues to accumulate. Currently this delta
 * is 5 seconds.
 * <p>
 * For example, when MobileAnalyticsManager is first instantiated, it creates
 * Session 1. As the user transitions from activity to activity, the old
 * activity will pause the current session, and the new activity will
 * immediately resume the current session. In this case, Session 1 remains
 * active and accumulates session time. The user continues to use the App for a
 * total of 3 minutes, at which point, the user receives a phone call. When
 * transitioning to the phone call, the current activity will pause the session
 * and then transition to the phone app. In this case Session 1 remains paused
 * while the phone call is in progress and session time does not accumulate.
 * After completing the phone call a few minutes later, the user returns to the
 * App and the activity will resume Session 1. Since enough time has elapsed
 * since resuming Session 1, Session 1 will be ended with a play time of 3
 * minutes. Session 2 will then be immediately created and started.
 * </p>
 * <p>
 * In order for MobileAnalyticsManager to track sessions, you must call the
 * <code>pauseSession()</code> and <code>resumeSession()</code> methods in each
 * activity of your Android app. Alternatively, if you have a base activity that
 * all other activities inherit from, these calls only need to be made from the
 * base activity.
 * </p>
 * <h3>Session Example</h3> The example below demonstrates how to pause and
 * resume a session within each Activity. Example:
 *
 * <pre class="prettyprint">
 * public void onPause() {
 *     super.onPause();
 *
 *     // Notify MobileAnalyticsManager that a session pause happened in this
 *     // Android activity.
 *     // Be sure to include this in every activity's onPause.
 *     this.mobileAnalyticsManager.getSessionClient().pauseSession();
 * }
 *
 * public void onResume() {
 *     super.onResume();
 *     // Notify MobileAnalyticsManager that a session resume happened in this
 *     // Android activity.
 *     // Be sure to include this in every activity's onResume.
 *     this.mobileAnalyticsManager.getSessionClient().resumeSession();
 * }
 * </pre>
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public interface SessionClient {

    /**
     * Pauses the current session.
     */
    public void pauseSession();

    /**
     * Resumes the current session.
     */
    public void resumeSession();
}
