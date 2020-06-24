/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.iot;

/**
 * Iot instrumented tests need following configuration values.
 */
enum ConfigKey {
    /**
     * HTTP request header key for the custom authorization token.
     */
    TOKEN_KEY_NAME("token_key_name"),

    /**
     * Custom authorization token used to connect via IoT custom authorizer.
     */
    TOKEN("token"),

    /**
     * Custom authorization token signature.
     */
    TOKEN_SIGNATURE("token_signature"),

    /**
     * Name of the AWS IoT custom authorizer to be used.
     */
    CUSTOM_AUTHORIZER_NAME("custom_authorizer_name"),

    /**
     * Identity pool id used to authorize connection via IAM.
     */
    IDENTITY_POOL_ID("identity_pool_id");

    private final String configKey;

    ConfigKey(String configKey) {
        this.configKey = configKey;
    }

    @Override
    public String toString() {
        return configKey;
    }
}
