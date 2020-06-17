/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.route53.model;

import java.util.HashMap;
import java.util.Map;

/**
 * VPCRegion
 */
public enum VPCRegion {

    UsEast1("us-east-1"),
    UsEast2("us-east-2"),
    UsWest1("us-west-1"),
    UsWest2("us-west-2"),
    EuWest1("eu-west-1"),
    EuWest2("eu-west-2"),
    EuWest3("eu-west-3"),
    EuCentral1("eu-central-1"),
    ApEast1("ap-east-1"),
    MeSouth1("me-south-1"),
    UsGovWest1("us-gov-west-1"),
    UsGovEast1("us-gov-east-1"),
    UsIsoEast1("us-iso-east-1"),
    UsIsobEast1("us-isob-east-1"),
    ApSoutheast1("ap-southeast-1"),
    ApSoutheast2("ap-southeast-2"),
    ApSouth1("ap-south-1"),
    ApNortheast1("ap-northeast-1"),
    ApNortheast2("ap-northeast-2"),
    ApNortheast3("ap-northeast-3"),
    EuNorth1("eu-north-1"),
    SaEast1("sa-east-1"),
    CaCentral1("ca-central-1"),
    CnNorth1("cn-north-1"),
    AfSouth1("af-south-1"),
    EuSouth1("eu-south-1");

    private String value;

    private VPCRegion(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, VPCRegion> enumMap;
    static {
        enumMap = new HashMap<String, VPCRegion>();
        enumMap.put("us-east-1", UsEast1);
        enumMap.put("us-east-2", UsEast2);
        enumMap.put("us-west-1", UsWest1);
        enumMap.put("us-west-2", UsWest2);
        enumMap.put("eu-west-1", EuWest1);
        enumMap.put("eu-west-2", EuWest2);
        enumMap.put("eu-west-3", EuWest3);
        enumMap.put("eu-central-1", EuCentral1);
        enumMap.put("ap-east-1", ApEast1);
        enumMap.put("me-south-1", MeSouth1);
        enumMap.put("us-gov-west-1", UsGovWest1);
        enumMap.put("us-gov-east-1", UsGovEast1);
        enumMap.put("us-iso-east-1", UsIsoEast1);
        enumMap.put("us-isob-east-1", UsIsobEast1);
        enumMap.put("ap-southeast-1", ApSoutheast1);
        enumMap.put("ap-southeast-2", ApSoutheast2);
        enumMap.put("ap-south-1", ApSouth1);
        enumMap.put("ap-northeast-1", ApNortheast1);
        enumMap.put("ap-northeast-2", ApNortheast2);
        enumMap.put("ap-northeast-3", ApNortheast3);
        enumMap.put("eu-north-1", EuNorth1);
        enumMap.put("sa-east-1", SaEast1);
        enumMap.put("ca-central-1", CaCentral1);
        enumMap.put("cn-north-1", CnNorth1);
        enumMap.put("af-south-1", AfSouth1);
        enumMap.put("eu-south-1", EuSouth1);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return VPCRegion corresponding to the value
     */
    public static VPCRegion fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
