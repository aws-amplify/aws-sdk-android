/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.internal.config;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HostRegexToRegionMapping {
    private final String hostNameRegex;
    private final String regionName;

    public HostRegexToRegionMapping(
            String hostNameRegex, String regionName) {
        if (hostNameRegex == null || hostNameRegex.isEmpty()) {
            throw new IllegalArgumentException(
                    "Invalid HostRegexToRegionMapping configuration: " +
                            "hostNameRegex must be non-empty");
        }
        try {
            Pattern.compile(hostNameRegex);
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException(
                    "Invalid HostRegexToRegionMapping configuration: " +
                            "hostNameRegex is not a valid regex",
                    e);
        }
        if (regionName == null || regionName.isEmpty()) {
            throw new IllegalArgumentException(
                    "Invalid HostRegexToRegionMapping configuration: " +
                            "regionName must be non-empty");
        }
        this.hostNameRegex = hostNameRegex;
        this.regionName = regionName;
    }

    public String getHostNameRegex() {
        return hostNameRegex;
    }

    public String getRegionName() {
        return regionName;
    }
}
