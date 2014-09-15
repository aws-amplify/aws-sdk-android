/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client;

import android.util.Log;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent;

/**
 * Session Logic for when the Application Session is INACTIVE.
 *   ie: The session has either been stopped or not started yet.
 * 
 */
public class InactiveSessionState extends SessionClientState {
	
	public InactiveSessionState(final DefaultSessionClient client) {
	    super(client);
    }

	/**
	 * If no Session is active, then ignore the resume.
	 * 
	 * NOTE: Fires a blank Session Resume event to identify frequency of
	 * 	this edge case. (does not contain session id) - Evan [evro@amazon.com]
	 */
	@Override
    public void resume() {
		// fire blank resume event
		AnalyticsEvent e = client.eventClient.createEvent(DefaultSessionClient.SESSION_RESUME_EVENT_TYPE);
		client.eventClient.recordEvent(e);
		
		// log failure
		DefaultSessionClient.logger.devi("Session Resume Failed: No session is paused.");
    }
	
	/**
	 * If no Session is active, then ignore the pause.
	 */
	@Override
    public void pause() {
		// fire blank pause event
		// log failure
		DefaultSessionClient.logger.devi("Session Pause Failed: No session is running.");
    }
	
	/**
	 * If no session is active, start one.
	 */
	@Override
    public void start() {
	    Log.d("InactiveSession","InactiveSession starting");
		super.executeStart();
    }
	
	/**
	 * If no session is active, ignore the stop.
	 */
	@Override
    public void stop() {
		// Log Failure
		DefaultSessionClient.logger.devi("Session Stop Failed: No session is running.");
    }	
}
