/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

/**
 * Instance Type
 */
public enum InstanceType {
    
    T1Micro("t1.micro"),
    T2Nano("t2.nano"),
    T2Micro("t2.micro"),
    T2Small("t2.small"),
    T2Medium("t2.medium"),
    T2Large("t2.large"),
    M1Small("m1.small"),
    M1Medium("m1.medium"),
    M1Large("m1.large"),
    M1Xlarge("m1.xlarge"),
    M3Medium("m3.medium"),
    M3Large("m3.large"),
    M3Xlarge("m3.xlarge"),
    M32xlarge("m3.2xlarge"),
    M4Large("m4.large"),
    M4Xlarge("m4.xlarge"),
    M42xlarge("m4.2xlarge"),
    M44xlarge("m4.4xlarge"),
    M410xlarge("m4.10xlarge"),
    M2Xlarge("m2.xlarge"),
    M22xlarge("m2.2xlarge"),
    M24xlarge("m2.4xlarge"),
    Cr18xlarge("cr1.8xlarge"),
    R3Large("r3.large"),
    R3Xlarge("r3.xlarge"),
    R32xlarge("r3.2xlarge"),
    R34xlarge("r3.4xlarge"),
    R38xlarge("r3.8xlarge"),
    X14xlarge("x1.4xlarge"),
    X18xlarge("x1.8xlarge"),
    X116xlarge("x1.16xlarge"),
    X132xlarge("x1.32xlarge"),
    I2Xlarge("i2.xlarge"),
    I22xlarge("i2.2xlarge"),
    I24xlarge("i2.4xlarge"),
    I28xlarge("i2.8xlarge"),
    Hi14xlarge("hi1.4xlarge"),
    Hs18xlarge("hs1.8xlarge"),
    C1Medium("c1.medium"),
    C1Xlarge("c1.xlarge"),
    C3Large("c3.large"),
    C3Xlarge("c3.xlarge"),
    C32xlarge("c3.2xlarge"),
    C34xlarge("c3.4xlarge"),
    C38xlarge("c3.8xlarge"),
    C4Large("c4.large"),
    C4Xlarge("c4.xlarge"),
    C42xlarge("c4.2xlarge"),
    C44xlarge("c4.4xlarge"),
    C48xlarge("c4.8xlarge"),
    Cc14xlarge("cc1.4xlarge"),
    Cc28xlarge("cc2.8xlarge"),
    G22xlarge("g2.2xlarge"),
    G28xlarge("g2.8xlarge"),
    Cg14xlarge("cg1.4xlarge"),
    D2Xlarge("d2.xlarge"),
    D22xlarge("d2.2xlarge"),
    D24xlarge("d2.4xlarge"),
    D28xlarge("d2.8xlarge");

    private String value;

    private InstanceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return InstanceType corresponding to the value
     */
    public static InstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("t1.micro".equals(value)) {
            return InstanceType.T1Micro;
        } else if ("t2.nano".equals(value)) {
            return InstanceType.T2Nano;
        } else if ("t2.micro".equals(value)) {
            return InstanceType.T2Micro;
        } else if ("t2.small".equals(value)) {
            return InstanceType.T2Small;
        } else if ("t2.medium".equals(value)) {
            return InstanceType.T2Medium;
        } else if ("t2.large".equals(value)) {
            return InstanceType.T2Large;
        } else if ("m1.small".equals(value)) {
            return InstanceType.M1Small;
        } else if ("m1.medium".equals(value)) {
            return InstanceType.M1Medium;
        } else if ("m1.large".equals(value)) {
            return InstanceType.M1Large;
        } else if ("m1.xlarge".equals(value)) {
            return InstanceType.M1Xlarge;
        } else if ("m3.medium".equals(value)) {
            return InstanceType.M3Medium;
        } else if ("m3.large".equals(value)) {
            return InstanceType.M3Large;
        } else if ("m3.xlarge".equals(value)) {
            return InstanceType.M3Xlarge;
        } else if ("m3.2xlarge".equals(value)) {
            return InstanceType.M32xlarge;
        } else if ("m4.large".equals(value)) {
            return InstanceType.M4Large;
        } else if ("m4.xlarge".equals(value)) {
            return InstanceType.M4Xlarge;
        } else if ("m4.2xlarge".equals(value)) {
            return InstanceType.M42xlarge;
        } else if ("m4.4xlarge".equals(value)) {
            return InstanceType.M44xlarge;
        } else if ("m4.10xlarge".equals(value)) {
            return InstanceType.M410xlarge;
        } else if ("m2.xlarge".equals(value)) {
            return InstanceType.M2Xlarge;
        } else if ("m2.2xlarge".equals(value)) {
            return InstanceType.M22xlarge;
        } else if ("m2.4xlarge".equals(value)) {
            return InstanceType.M24xlarge;
        } else if ("cr1.8xlarge".equals(value)) {
            return InstanceType.Cr18xlarge;
        } else if ("r3.large".equals(value)) {
            return InstanceType.R3Large;
        } else if ("r3.xlarge".equals(value)) {
            return InstanceType.R3Xlarge;
        } else if ("r3.2xlarge".equals(value)) {
            return InstanceType.R32xlarge;
        } else if ("r3.4xlarge".equals(value)) {
            return InstanceType.R34xlarge;
        } else if ("r3.8xlarge".equals(value)) {
            return InstanceType.R38xlarge;
        } else if ("x1.4xlarge".equals(value)) {
            return InstanceType.X14xlarge;
        } else if ("x1.8xlarge".equals(value)) {
            return InstanceType.X18xlarge;
        } else if ("x1.16xlarge".equals(value)) {
            return InstanceType.X116xlarge;
        } else if ("x1.32xlarge".equals(value)) {
            return InstanceType.X132xlarge;
        } else if ("i2.xlarge".equals(value)) {
            return InstanceType.I2Xlarge;
        } else if ("i2.2xlarge".equals(value)) {
            return InstanceType.I22xlarge;
        } else if ("i2.4xlarge".equals(value)) {
            return InstanceType.I24xlarge;
        } else if ("i2.8xlarge".equals(value)) {
            return InstanceType.I28xlarge;
        } else if ("hi1.4xlarge".equals(value)) {
            return InstanceType.Hi14xlarge;
        } else if ("hs1.8xlarge".equals(value)) {
            return InstanceType.Hs18xlarge;
        } else if ("c1.medium".equals(value)) {
            return InstanceType.C1Medium;
        } else if ("c1.xlarge".equals(value)) {
            return InstanceType.C1Xlarge;
        } else if ("c3.large".equals(value)) {
            return InstanceType.C3Large;
        } else if ("c3.xlarge".equals(value)) {
            return InstanceType.C3Xlarge;
        } else if ("c3.2xlarge".equals(value)) {
            return InstanceType.C32xlarge;
        } else if ("c3.4xlarge".equals(value)) {
            return InstanceType.C34xlarge;
        } else if ("c3.8xlarge".equals(value)) {
            return InstanceType.C38xlarge;
        } else if ("c4.large".equals(value)) {
            return InstanceType.C4Large;
        } else if ("c4.xlarge".equals(value)) {
            return InstanceType.C4Xlarge;
        } else if ("c4.2xlarge".equals(value)) {
            return InstanceType.C42xlarge;
        } else if ("c4.4xlarge".equals(value)) {
            return InstanceType.C44xlarge;
        } else if ("c4.8xlarge".equals(value)) {
            return InstanceType.C48xlarge;
        } else if ("cc1.4xlarge".equals(value)) {
            return InstanceType.Cc14xlarge;
        } else if ("cc2.8xlarge".equals(value)) {
            return InstanceType.Cc28xlarge;
        } else if ("g2.2xlarge".equals(value)) {
            return InstanceType.G22xlarge;
        } else if ("g2.8xlarge".equals(value)) {
            return InstanceType.G28xlarge;
        } else if ("cg1.4xlarge".equals(value)) {
            return InstanceType.Cg14xlarge;
        } else if ("d2.xlarge".equals(value)) {
            return InstanceType.D2Xlarge;
        } else if ("d2.2xlarge".equals(value)) {
            return InstanceType.D22xlarge;
        } else if ("d2.4xlarge".equals(value)) {
            return InstanceType.D24xlarge;
        } else if ("d2.8xlarge".equals(value)) {
            return InstanceType.D28xlarge;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    