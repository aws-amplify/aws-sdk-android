/*
 * Copyright 2017-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.mobile.config;

import android.content.Context;

import com.amazonaws.ClientConfiguration;

/**
 * The {@code AWSConfigurable} interface defines the methods
 * in the lifecycle of any SDK Client object that uses 
 * {@link com.amazonaws.mobile.config.AWSConfiguration}.
 * 
 * <p>
 * Any SDK client that need to be configurable will
 * implement this interface by overriding these methods.
 * 
 * {@link com.amazonaws.mobile.client.AWSMobileClient} will
 * use these methods to control the creation and initialization of a SDK client.
 * </p>
 */
public interface AWSConfigurable {

    /**
     * Initialize the SDK Client. This method will construct the instance
     * of the client and perform basic initialization. The 
     * {@link com.amazonaws.mobile.config.AWSConfiguration} will be
     * constructed based on awsconfiguration.json file.
     * 
     * @param context               Reference to the application context.
     * @return the client instance that conforms to AWSConfigurable
     */
    public AWSConfigurable initialize(Context context) throws Exception;

    /**
     * Initialize the SDK Client. This method will construct the instance
     * of the client and perform basic initialization.
     * 
     * @param context               Reference to the application context.
     * @param configuration         Instance of {@link AWSConfiguration}
     * @return the client instance that conforms to AWSConfigurable
     */
    public AWSConfigurable initialize(Context context,
                                      AWSConfiguration configuration) throws Exception;

    /**
     * Initialize the SDK Client. This method will construct the instance
     * of the client and perform basic initialization.
     * 
     * @param context               Reference to the application context.
     * @param configuration         Instance of {@link AWSConfiguration}
     * @param clientConfiguration   Instance of {@link com.amazonaws.ClientConfiguration}
     * @return the client instance that conforms to AWSConfigurable
     */
    public AWSConfigurable initialize(Context context,
                                      AWSConfiguration configuration,
                                      ClientConfiguration clientConfiguration) throws Exception;
}
