/*
 * Copyright 2013-2019 Amazon Technologies, Inc.
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

package com.amazonaws.regions;

/**
 * Enumeration of region names
 */
public enum Regions {

    /** us-gov-west-1. */
    GovCloud("us-gov-west-1"),

    /** us-gov-east-1. */
    US_GOV_EAST_1("us-gov-east-1"),

    /** us-east-1. */
    US_EAST_1("us-east-1"),

    /** us-east-2. */
    US_EAST_2("us-east-2"),

    /** us-west-1. */
    US_WEST_1("us-west-1"),

    /** us-west-2. */
    US_WEST_2("us-west-2"),

    /** eu-west-1/ */
    EU_WEST_1("eu-west-1"),

    /** eu-west-2. */
    EU_WEST_2("eu-west-2"),

    /** eu-west-3. */
    EU_WEST_3("eu-west-3"),

    /** eu-central-1. */
    EU_CENTRAL_1("eu-central-1"),

    /** eu-north-1. */
    EU_NORTH_1("eu-north-1"),

    /** ap-south-1. */
    AP_SOUTH_1("ap-south-1"),

    /** ap-southeast-1. */
    AP_SOUTHEAST_1("ap-southeast-1"),

    /** ap-southeast-2. */
    AP_SOUTHEAST_2("ap-southeast-2"),

    /** ap-northeast-1. */
    AP_NORTHEAST_1("ap-northeast-1"),

    /** ap-northeast-2. */
    AP_NORTHEAST_2("ap-northeast-2"),

    /** sa-east-1. */
    SA_EAST_1("sa-east-1"),

    /** ca-central-1. */
    CA_CENTRAL_1("ca-central-1"),

    /** cn-north-1. */
    CN_NORTH_1("cn-north-1"),
    
    /** cn-northwest-1. */
    CN_NORTHWEST_1("cn-northwest-1");

    /**
     * The default region that new customers in the US are encouraged to use
     * when using AWS services for the first time.
     */
    public static final Regions DEFAULT_REGION = US_WEST_2;

    private final String name;

    private Regions(String name) {
        this.name = name;
    }

    /**
     * @return the name of this region, used in the regions.xml file to identify it.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a region enum corresponding to the given region name.
     *
     * @param regionName The name of the region. Ex.: eu-west-1
     * @return Region enum representing the given region name.
     */
    public static Regions fromName(String regionName) {
        for (final Regions region : Regions.values()) {
            if (regionName.equals(region.getName())) {
                return region;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + regionName + " value!");
    }

}
