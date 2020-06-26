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
     * Identity pool id used to authorize connection via IAM.
     */
    IDENTITY_POOL_ID("identity_pool_id"),

    /**
     * The name of the key in the key-value pair that the client sends in its header,
     * while the client is using custom authorization. e.g., if Authorization=123123123,
     * this *config* key would store a value of "Authorization".
     */
    CUSTOM_AUTHORIZER_TOKEN_KEY_NAME("custom_authorizer_token_key_name"),

    /**
     * A value to associate to the token key above, that the custom authorizer will evaluate
     * as having access. e.g., if Authorization=123 and Authorization=345 are possible headers,
     * 123 might be an authorized value, while 345 may not be. In this case, the value associated
     * to this config key might be "123".
     */
    CUSTOM_AUTHORIZER_TOKEN_VALUE("custom_authorizer_token_value"),

    /**
     * ARN for a Lambda function which will be used to evaluate custom authorizaztion rules.
     * This is created by CDK scripts in amplify-ci-support, iot_stack.py.
     */
    CUSTOM_AUTHORIZER_LAMBDA_ARN("custom_authorizer_lambda_arn");

    private final String configKey;

    ConfigKey(String configKey) {
        this.configKey = configKey;
    }

    @Override
    public String toString() {
        return configKey;
    }
}
