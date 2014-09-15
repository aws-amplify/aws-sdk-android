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
package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.log.Logger;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Preferences;


public class SharedPrefsUniqueIdService implements UniqueIdService {

    private static Logger logger = Logger.getLogger(SharedPrefsUniqueIdService.class);
    protected static final String PREFS_NAME = SharedPrefsUniqueIdService.class.getName();
    protected static final String UNIQUE_ID_KEY = "UniqueId";
    
    private final UniqueIdGenerator generator;
    
    /**
     * Creates a new UniqueIdService with a random id generator
     * @return an instance of the SharedPrefUniqueId service
     */
    public static UniqueIdService newInstance() {
        return new SharedPrefsUniqueIdService(new RandomUUIDGenerator());
    }
    
    /**
     * Uses Shared prefs to recall and store the unique ID
     * @param generator used to create new unique id's
     */
    public SharedPrefsUniqueIdService(UniqueIdGenerator generator) {
        this.generator = generator;
    }
    
    @Override
    public Id getUniqueId(AnalyticsContext context) {
    	if(context == null || context.getSystem() == null || context.getSystem().getPreferences() == null) {
    	    logger.devd("Unable to generate unique id, context has not been fully initialized");
    		return Id.getEmptyId();
    	}
    	
        Id uniqueId = getIdFromPreferences(context.getSystem().getPreferences());
        if( uniqueId == Id.getEmptyId()) {
            // an id doesn't exist for this context, create one and persist it
            uniqueId = new Id(generator.generateUniqueIdString());
            storeUniqueId(context.getSystem().getPreferences(), uniqueId);              
        } 
        
        return uniqueId;
    }
    
    private Id getIdFromPreferences(Preferences preferences) {
        Id uniqueId = Id.getEmptyId();
        
        String uniqueIdString = preferences.getString(UNIQUE_ID_KEY, null);
        if(uniqueIdString != null) {
            // create an id object from the stored string
            uniqueId = new Id(uniqueIdString);
        }
        
        return uniqueId;
    }
    
    private void storeUniqueId(Preferences preferences, Id uniqueId) {
        try {
        	preferences.putString(UNIQUE_ID_KEY, uniqueId.getValue());
        } catch (Exception ex) {
            logger.e("There was an exception when trying to store the unique id into the Preferences", ex);
        }  
    }
}
