/*
 * Copyright 2018-2018 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobile.client;

/**
 * Convenience enum to specify the identity providers' login keys
 */
public enum IdentityProvider {
    AMAZON("www.amazon.com"),
    FACEBOOK("graph.facebook.com"),
    GOOGLE("accounts.google.com"),
    TWITTER("api.twitter.com"),
    DEVELOPER("cognito-identity.amazonaws.com"),
    ;

    private final String key;

    IdentityProvider(final String key) {
        this.key = key;
    }

    public String toString() {
        return this.key;
    }

    /**
     * Utility comparison for the String value of the enum
     * @param other The String that is being compared to the IdentityProvider's string value
     * @return
     */
    public boolean equals(final String other) {
        return key.equals(other);
    }
}
