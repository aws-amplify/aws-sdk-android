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

package com.amazonaws.services.es.model;

import java.util.HashMap;
import java.util.Map;

/**
 * ESPartition Instance Type
 */
public enum ESPartitionInstanceType {

    M3MediumElasticsearch("m3.medium.elasticsearch"),
    M3LargeElasticsearch("m3.large.elasticsearch"),
    M3XlargeElasticsearch("m3.xlarge.elasticsearch"),
    M32xlargeElasticsearch("m3.2xlarge.elasticsearch"),
    M4LargeElasticsearch("m4.large.elasticsearch"),
    M4XlargeElasticsearch("m4.xlarge.elasticsearch"),
    M42xlargeElasticsearch("m4.2xlarge.elasticsearch"),
    M44xlargeElasticsearch("m4.4xlarge.elasticsearch"),
    M410xlargeElasticsearch("m4.10xlarge.elasticsearch"),
    M5LargeElasticsearch("m5.large.elasticsearch"),
    M5XlargeElasticsearch("m5.xlarge.elasticsearch"),
    M52xlargeElasticsearch("m5.2xlarge.elasticsearch"),
    M54xlargeElasticsearch("m5.4xlarge.elasticsearch"),
    M512xlargeElasticsearch("m5.12xlarge.elasticsearch"),
    R5LargeElasticsearch("r5.large.elasticsearch"),
    R5XlargeElasticsearch("r5.xlarge.elasticsearch"),
    R52xlargeElasticsearch("r5.2xlarge.elasticsearch"),
    R54xlargeElasticsearch("r5.4xlarge.elasticsearch"),
    R512xlargeElasticsearch("r5.12xlarge.elasticsearch"),
    C5LargeElasticsearch("c5.large.elasticsearch"),
    C5XlargeElasticsearch("c5.xlarge.elasticsearch"),
    C52xlargeElasticsearch("c5.2xlarge.elasticsearch"),
    C54xlargeElasticsearch("c5.4xlarge.elasticsearch"),
    C59xlargeElasticsearch("c5.9xlarge.elasticsearch"),
    C518xlargeElasticsearch("c5.18xlarge.elasticsearch"),
    Ultrawarm1MediumElasticsearch("ultrawarm1.medium.elasticsearch"),
    Ultrawarm1LargeElasticsearch("ultrawarm1.large.elasticsearch"),
    T2MicroElasticsearch("t2.micro.elasticsearch"),
    T2SmallElasticsearch("t2.small.elasticsearch"),
    T2MediumElasticsearch("t2.medium.elasticsearch"),
    R3LargeElasticsearch("r3.large.elasticsearch"),
    R3XlargeElasticsearch("r3.xlarge.elasticsearch"),
    R32xlargeElasticsearch("r3.2xlarge.elasticsearch"),
    R34xlargeElasticsearch("r3.4xlarge.elasticsearch"),
    R38xlargeElasticsearch("r3.8xlarge.elasticsearch"),
    I2XlargeElasticsearch("i2.xlarge.elasticsearch"),
    I22xlargeElasticsearch("i2.2xlarge.elasticsearch"),
    D2XlargeElasticsearch("d2.xlarge.elasticsearch"),
    D22xlargeElasticsearch("d2.2xlarge.elasticsearch"),
    D24xlargeElasticsearch("d2.4xlarge.elasticsearch"),
    D28xlargeElasticsearch("d2.8xlarge.elasticsearch"),
    C4LargeElasticsearch("c4.large.elasticsearch"),
    C4XlargeElasticsearch("c4.xlarge.elasticsearch"),
    C42xlargeElasticsearch("c4.2xlarge.elasticsearch"),
    C44xlargeElasticsearch("c4.4xlarge.elasticsearch"),
    C48xlargeElasticsearch("c4.8xlarge.elasticsearch"),
    R4LargeElasticsearch("r4.large.elasticsearch"),
    R4XlargeElasticsearch("r4.xlarge.elasticsearch"),
    R42xlargeElasticsearch("r4.2xlarge.elasticsearch"),
    R44xlargeElasticsearch("r4.4xlarge.elasticsearch"),
    R48xlargeElasticsearch("r4.8xlarge.elasticsearch"),
    R416xlargeElasticsearch("r4.16xlarge.elasticsearch"),
    I3LargeElasticsearch("i3.large.elasticsearch"),
    I3XlargeElasticsearch("i3.xlarge.elasticsearch"),
    I32xlargeElasticsearch("i3.2xlarge.elasticsearch"),
    I34xlargeElasticsearch("i3.4xlarge.elasticsearch"),
    I38xlargeElasticsearch("i3.8xlarge.elasticsearch"),
    I316xlargeElasticsearch("i3.16xlarge.elasticsearch");

    private String value;

    private ESPartitionInstanceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ESPartitionInstanceType> enumMap;
    static {
        enumMap = new HashMap<String, ESPartitionInstanceType>();
        enumMap.put("m3.medium.elasticsearch", M3MediumElasticsearch);
        enumMap.put("m3.large.elasticsearch", M3LargeElasticsearch);
        enumMap.put("m3.xlarge.elasticsearch", M3XlargeElasticsearch);
        enumMap.put("m3.2xlarge.elasticsearch", M32xlargeElasticsearch);
        enumMap.put("m4.large.elasticsearch", M4LargeElasticsearch);
        enumMap.put("m4.xlarge.elasticsearch", M4XlargeElasticsearch);
        enumMap.put("m4.2xlarge.elasticsearch", M42xlargeElasticsearch);
        enumMap.put("m4.4xlarge.elasticsearch", M44xlargeElasticsearch);
        enumMap.put("m4.10xlarge.elasticsearch", M410xlargeElasticsearch);
        enumMap.put("m5.large.elasticsearch", M5LargeElasticsearch);
        enumMap.put("m5.xlarge.elasticsearch", M5XlargeElasticsearch);
        enumMap.put("m5.2xlarge.elasticsearch", M52xlargeElasticsearch);
        enumMap.put("m5.4xlarge.elasticsearch", M54xlargeElasticsearch);
        enumMap.put("m5.12xlarge.elasticsearch", M512xlargeElasticsearch);
        enumMap.put("r5.large.elasticsearch", R5LargeElasticsearch);
        enumMap.put("r5.xlarge.elasticsearch", R5XlargeElasticsearch);
        enumMap.put("r5.2xlarge.elasticsearch", R52xlargeElasticsearch);
        enumMap.put("r5.4xlarge.elasticsearch", R54xlargeElasticsearch);
        enumMap.put("r5.12xlarge.elasticsearch", R512xlargeElasticsearch);
        enumMap.put("c5.large.elasticsearch", C5LargeElasticsearch);
        enumMap.put("c5.xlarge.elasticsearch", C5XlargeElasticsearch);
        enumMap.put("c5.2xlarge.elasticsearch", C52xlargeElasticsearch);
        enumMap.put("c5.4xlarge.elasticsearch", C54xlargeElasticsearch);
        enumMap.put("c5.9xlarge.elasticsearch", C59xlargeElasticsearch);
        enumMap.put("c5.18xlarge.elasticsearch", C518xlargeElasticsearch);
        enumMap.put("ultrawarm1.medium.elasticsearch", Ultrawarm1MediumElasticsearch);
        enumMap.put("ultrawarm1.large.elasticsearch", Ultrawarm1LargeElasticsearch);
        enumMap.put("t2.micro.elasticsearch", T2MicroElasticsearch);
        enumMap.put("t2.small.elasticsearch", T2SmallElasticsearch);
        enumMap.put("t2.medium.elasticsearch", T2MediumElasticsearch);
        enumMap.put("r3.large.elasticsearch", R3LargeElasticsearch);
        enumMap.put("r3.xlarge.elasticsearch", R3XlargeElasticsearch);
        enumMap.put("r3.2xlarge.elasticsearch", R32xlargeElasticsearch);
        enumMap.put("r3.4xlarge.elasticsearch", R34xlargeElasticsearch);
        enumMap.put("r3.8xlarge.elasticsearch", R38xlargeElasticsearch);
        enumMap.put("i2.xlarge.elasticsearch", I2XlargeElasticsearch);
        enumMap.put("i2.2xlarge.elasticsearch", I22xlargeElasticsearch);
        enumMap.put("d2.xlarge.elasticsearch", D2XlargeElasticsearch);
        enumMap.put("d2.2xlarge.elasticsearch", D22xlargeElasticsearch);
        enumMap.put("d2.4xlarge.elasticsearch", D24xlargeElasticsearch);
        enumMap.put("d2.8xlarge.elasticsearch", D28xlargeElasticsearch);
        enumMap.put("c4.large.elasticsearch", C4LargeElasticsearch);
        enumMap.put("c4.xlarge.elasticsearch", C4XlargeElasticsearch);
        enumMap.put("c4.2xlarge.elasticsearch", C42xlargeElasticsearch);
        enumMap.put("c4.4xlarge.elasticsearch", C44xlargeElasticsearch);
        enumMap.put("c4.8xlarge.elasticsearch", C48xlargeElasticsearch);
        enumMap.put("r4.large.elasticsearch", R4LargeElasticsearch);
        enumMap.put("r4.xlarge.elasticsearch", R4XlargeElasticsearch);
        enumMap.put("r4.2xlarge.elasticsearch", R42xlargeElasticsearch);
        enumMap.put("r4.4xlarge.elasticsearch", R44xlargeElasticsearch);
        enumMap.put("r4.8xlarge.elasticsearch", R48xlargeElasticsearch);
        enumMap.put("r4.16xlarge.elasticsearch", R416xlargeElasticsearch);
        enumMap.put("i3.large.elasticsearch", I3LargeElasticsearch);
        enumMap.put("i3.xlarge.elasticsearch", I3XlargeElasticsearch);
        enumMap.put("i3.2xlarge.elasticsearch", I32xlargeElasticsearch);
        enumMap.put("i3.4xlarge.elasticsearch", I34xlargeElasticsearch);
        enumMap.put("i3.8xlarge.elasticsearch", I38xlargeElasticsearch);
        enumMap.put("i3.16xlarge.elasticsearch", I316xlargeElasticsearch);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ESPartitionInstanceType corresponding to the value
     */
    public static ESPartitionInstanceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
