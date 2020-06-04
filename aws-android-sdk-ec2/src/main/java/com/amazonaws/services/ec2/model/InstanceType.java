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

package com.amazonaws.services.ec2.model;

import java.util.HashMap;
import java.util.Map;

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
    T2Xlarge("t2.xlarge"),
    T22xlarge("t2.2xlarge"),
    T3Nano("t3.nano"),
    T3Micro("t3.micro"),
    T3Small("t3.small"),
    T3Medium("t3.medium"),
    T3Large("t3.large"),
    T3Xlarge("t3.xlarge"),
    T32xlarge("t3.2xlarge"),
    T3aNano("t3a.nano"),
    T3aMicro("t3a.micro"),
    T3aSmall("t3a.small"),
    T3aMedium("t3a.medium"),
    T3aLarge("t3a.large"),
    T3aXlarge("t3a.xlarge"),
    T3a2xlarge("t3a.2xlarge"),
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
    M416xlarge("m4.16xlarge"),
    M2Xlarge("m2.xlarge"),
    M22xlarge("m2.2xlarge"),
    M24xlarge("m2.4xlarge"),
    Cr18xlarge("cr1.8xlarge"),
    R3Large("r3.large"),
    R3Xlarge("r3.xlarge"),
    R32xlarge("r3.2xlarge"),
    R34xlarge("r3.4xlarge"),
    R38xlarge("r3.8xlarge"),
    R4Large("r4.large"),
    R4Xlarge("r4.xlarge"),
    R42xlarge("r4.2xlarge"),
    R44xlarge("r4.4xlarge"),
    R48xlarge("r4.8xlarge"),
    R416xlarge("r4.16xlarge"),
    R5Large("r5.large"),
    R5Xlarge("r5.xlarge"),
    R52xlarge("r5.2xlarge"),
    R54xlarge("r5.4xlarge"),
    R58xlarge("r5.8xlarge"),
    R512xlarge("r5.12xlarge"),
    R516xlarge("r5.16xlarge"),
    R524xlarge("r5.24xlarge"),
    R5Metal("r5.metal"),
    R5aLarge("r5a.large"),
    R5aXlarge("r5a.xlarge"),
    R5a2xlarge("r5a.2xlarge"),
    R5a4xlarge("r5a.4xlarge"),
    R5a8xlarge("r5a.8xlarge"),
    R5a12xlarge("r5a.12xlarge"),
    R5a16xlarge("r5a.16xlarge"),
    R5a24xlarge("r5a.24xlarge"),
    R5dLarge("r5d.large"),
    R5dXlarge("r5d.xlarge"),
    R5d2xlarge("r5d.2xlarge"),
    R5d4xlarge("r5d.4xlarge"),
    R5d8xlarge("r5d.8xlarge"),
    R5d12xlarge("r5d.12xlarge"),
    R5d16xlarge("r5d.16xlarge"),
    R5d24xlarge("r5d.24xlarge"),
    R5dMetal("r5d.metal"),
    R5adLarge("r5ad.large"),
    R5adXlarge("r5ad.xlarge"),
    R5ad2xlarge("r5ad.2xlarge"),
    R5ad4xlarge("r5ad.4xlarge"),
    R5ad8xlarge("r5ad.8xlarge"),
    R5ad12xlarge("r5ad.12xlarge"),
    R5ad16xlarge("r5ad.16xlarge"),
    R5ad24xlarge("r5ad.24xlarge"),
    X116xlarge("x1.16xlarge"),
    X132xlarge("x1.32xlarge"),
    X1eXlarge("x1e.xlarge"),
    X1e2xlarge("x1e.2xlarge"),
    X1e4xlarge("x1e.4xlarge"),
    X1e8xlarge("x1e.8xlarge"),
    X1e16xlarge("x1e.16xlarge"),
    X1e32xlarge("x1e.32xlarge"),
    I2Xlarge("i2.xlarge"),
    I22xlarge("i2.2xlarge"),
    I24xlarge("i2.4xlarge"),
    I28xlarge("i2.8xlarge"),
    I3Large("i3.large"),
    I3Xlarge("i3.xlarge"),
    I32xlarge("i3.2xlarge"),
    I34xlarge("i3.4xlarge"),
    I38xlarge("i3.8xlarge"),
    I316xlarge("i3.16xlarge"),
    I3Metal("i3.metal"),
    I3enLarge("i3en.large"),
    I3enXlarge("i3en.xlarge"),
    I3en2xlarge("i3en.2xlarge"),
    I3en3xlarge("i3en.3xlarge"),
    I3en6xlarge("i3en.6xlarge"),
    I3en12xlarge("i3en.12xlarge"),
    I3en24xlarge("i3en.24xlarge"),
    I3enMetal("i3en.metal"),
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
    C5Large("c5.large"),
    C5Xlarge("c5.xlarge"),
    C52xlarge("c5.2xlarge"),
    C54xlarge("c5.4xlarge"),
    C59xlarge("c5.9xlarge"),
    C512xlarge("c5.12xlarge"),
    C518xlarge("c5.18xlarge"),
    C524xlarge("c5.24xlarge"),
    C5Metal("c5.metal"),
    C5aLarge("c5a.large"),
    C5aXlarge("c5a.xlarge"),
    C5a2xlarge("c5a.2xlarge"),
    C5a4xlarge("c5a.4xlarge"),
    C5a8xlarge("c5a.8xlarge"),
    C5a12xlarge("c5a.12xlarge"),
    C5a16xlarge("c5a.16xlarge"),
    C5a24xlarge("c5a.24xlarge"),
    C5dLarge("c5d.large"),
    C5dXlarge("c5d.xlarge"),
    C5d2xlarge("c5d.2xlarge"),
    C5d4xlarge("c5d.4xlarge"),
    C5d9xlarge("c5d.9xlarge"),
    C5d12xlarge("c5d.12xlarge"),
    C5d18xlarge("c5d.18xlarge"),
    C5d24xlarge("c5d.24xlarge"),
    C5dMetal("c5d.metal"),
    C5nLarge("c5n.large"),
    C5nXlarge("c5n.xlarge"),
    C5n2xlarge("c5n.2xlarge"),
    C5n4xlarge("c5n.4xlarge"),
    C5n9xlarge("c5n.9xlarge"),
    C5n18xlarge("c5n.18xlarge"),
    Cc14xlarge("cc1.4xlarge"),
    Cc28xlarge("cc2.8xlarge"),
    G22xlarge("g2.2xlarge"),
    G28xlarge("g2.8xlarge"),
    G34xlarge("g3.4xlarge"),
    G38xlarge("g3.8xlarge"),
    G316xlarge("g3.16xlarge"),
    G3sXlarge("g3s.xlarge"),
    G4dnXlarge("g4dn.xlarge"),
    G4dn2xlarge("g4dn.2xlarge"),
    G4dn4xlarge("g4dn.4xlarge"),
    G4dn8xlarge("g4dn.8xlarge"),
    G4dn12xlarge("g4dn.12xlarge"),
    G4dn16xlarge("g4dn.16xlarge"),
    G4dnMetal("g4dn.metal"),
    Cg14xlarge("cg1.4xlarge"),
    P2Xlarge("p2.xlarge"),
    P28xlarge("p2.8xlarge"),
    P216xlarge("p2.16xlarge"),
    P32xlarge("p3.2xlarge"),
    P38xlarge("p3.8xlarge"),
    P316xlarge("p3.16xlarge"),
    P3dn24xlarge("p3dn.24xlarge"),
    D2Xlarge("d2.xlarge"),
    D22xlarge("d2.2xlarge"),
    D24xlarge("d2.4xlarge"),
    D28xlarge("d2.8xlarge"),
    F12xlarge("f1.2xlarge"),
    F14xlarge("f1.4xlarge"),
    F116xlarge("f1.16xlarge"),
    M5Large("m5.large"),
    M5Xlarge("m5.xlarge"),
    M52xlarge("m5.2xlarge"),
    M54xlarge("m5.4xlarge"),
    M58xlarge("m5.8xlarge"),
    M512xlarge("m5.12xlarge"),
    M516xlarge("m5.16xlarge"),
    M524xlarge("m5.24xlarge"),
    M5Metal("m5.metal"),
    M5aLarge("m5a.large"),
    M5aXlarge("m5a.xlarge"),
    M5a2xlarge("m5a.2xlarge"),
    M5a4xlarge("m5a.4xlarge"),
    M5a8xlarge("m5a.8xlarge"),
    M5a12xlarge("m5a.12xlarge"),
    M5a16xlarge("m5a.16xlarge"),
    M5a24xlarge("m5a.24xlarge"),
    M5dLarge("m5d.large"),
    M5dXlarge("m5d.xlarge"),
    M5d2xlarge("m5d.2xlarge"),
    M5d4xlarge("m5d.4xlarge"),
    M5d8xlarge("m5d.8xlarge"),
    M5d12xlarge("m5d.12xlarge"),
    M5d16xlarge("m5d.16xlarge"),
    M5d24xlarge("m5d.24xlarge"),
    M5dMetal("m5d.metal"),
    M5adLarge("m5ad.large"),
    M5adXlarge("m5ad.xlarge"),
    M5ad2xlarge("m5ad.2xlarge"),
    M5ad4xlarge("m5ad.4xlarge"),
    M5ad8xlarge("m5ad.8xlarge"),
    M5ad12xlarge("m5ad.12xlarge"),
    M5ad16xlarge("m5ad.16xlarge"),
    M5ad24xlarge("m5ad.24xlarge"),
    H12xlarge("h1.2xlarge"),
    H14xlarge("h1.4xlarge"),
    H18xlarge("h1.8xlarge"),
    H116xlarge("h1.16xlarge"),
    Z1dLarge("z1d.large"),
    Z1dXlarge("z1d.xlarge"),
    Z1d2xlarge("z1d.2xlarge"),
    Z1d3xlarge("z1d.3xlarge"),
    Z1d6xlarge("z1d.6xlarge"),
    Z1d12xlarge("z1d.12xlarge"),
    Z1dMetal("z1d.metal"),
    U6tb1Metal("u-6tb1.metal"),
    U9tb1Metal("u-9tb1.metal"),
    U12tb1Metal("u-12tb1.metal"),
    U18tb1Metal("u-18tb1.metal"),
    U24tb1Metal("u-24tb1.metal"),
    A1Medium("a1.medium"),
    A1Large("a1.large"),
    A1Xlarge("a1.xlarge"),
    A12xlarge("a1.2xlarge"),
    A14xlarge("a1.4xlarge"),
    A1Metal("a1.metal"),
    M5dnLarge("m5dn.large"),
    M5dnXlarge("m5dn.xlarge"),
    M5dn2xlarge("m5dn.2xlarge"),
    M5dn4xlarge("m5dn.4xlarge"),
    M5dn8xlarge("m5dn.8xlarge"),
    M5dn12xlarge("m5dn.12xlarge"),
    M5dn16xlarge("m5dn.16xlarge"),
    M5dn24xlarge("m5dn.24xlarge"),
    M5nLarge("m5n.large"),
    M5nXlarge("m5n.xlarge"),
    M5n2xlarge("m5n.2xlarge"),
    M5n4xlarge("m5n.4xlarge"),
    M5n8xlarge("m5n.8xlarge"),
    M5n12xlarge("m5n.12xlarge"),
    M5n16xlarge("m5n.16xlarge"),
    M5n24xlarge("m5n.24xlarge"),
    R5dnLarge("r5dn.large"),
    R5dnXlarge("r5dn.xlarge"),
    R5dn2xlarge("r5dn.2xlarge"),
    R5dn4xlarge("r5dn.4xlarge"),
    R5dn8xlarge("r5dn.8xlarge"),
    R5dn12xlarge("r5dn.12xlarge"),
    R5dn16xlarge("r5dn.16xlarge"),
    R5dn24xlarge("r5dn.24xlarge"),
    R5nLarge("r5n.large"),
    R5nXlarge("r5n.xlarge"),
    R5n2xlarge("r5n.2xlarge"),
    R5n4xlarge("r5n.4xlarge"),
    R5n8xlarge("r5n.8xlarge"),
    R5n12xlarge("r5n.12xlarge"),
    R5n16xlarge("r5n.16xlarge"),
    R5n24xlarge("r5n.24xlarge"),
    Inf1Xlarge("inf1.xlarge"),
    Inf12xlarge("inf1.2xlarge"),
    Inf16xlarge("inf1.6xlarge"),
    Inf124xlarge("inf1.24xlarge"),
    M6gMetal("m6g.metal"),
    M6gMedium("m6g.medium"),
    M6gLarge("m6g.large"),
    M6gXlarge("m6g.xlarge"),
    M6g2xlarge("m6g.2xlarge"),
    M6g4xlarge("m6g.4xlarge"),
    M6g8xlarge("m6g.8xlarge"),
    M6g12xlarge("m6g.12xlarge"),
    M6g16xlarge("m6g.16xlarge");

    private String value;

    private InstanceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InstanceType> enumMap;
    static {
        enumMap = new HashMap<String, InstanceType>();
        enumMap.put("t1.micro", T1Micro);
        enumMap.put("t2.nano", T2Nano);
        enumMap.put("t2.micro", T2Micro);
        enumMap.put("t2.small", T2Small);
        enumMap.put("t2.medium", T2Medium);
        enumMap.put("t2.large", T2Large);
        enumMap.put("t2.xlarge", T2Xlarge);
        enumMap.put("t2.2xlarge", T22xlarge);
        enumMap.put("t3.nano", T3Nano);
        enumMap.put("t3.micro", T3Micro);
        enumMap.put("t3.small", T3Small);
        enumMap.put("t3.medium", T3Medium);
        enumMap.put("t3.large", T3Large);
        enumMap.put("t3.xlarge", T3Xlarge);
        enumMap.put("t3.2xlarge", T32xlarge);
        enumMap.put("t3a.nano", T3aNano);
        enumMap.put("t3a.micro", T3aMicro);
        enumMap.put("t3a.small", T3aSmall);
        enumMap.put("t3a.medium", T3aMedium);
        enumMap.put("t3a.large", T3aLarge);
        enumMap.put("t3a.xlarge", T3aXlarge);
        enumMap.put("t3a.2xlarge", T3a2xlarge);
        enumMap.put("m1.small", M1Small);
        enumMap.put("m1.medium", M1Medium);
        enumMap.put("m1.large", M1Large);
        enumMap.put("m1.xlarge", M1Xlarge);
        enumMap.put("m3.medium", M3Medium);
        enumMap.put("m3.large", M3Large);
        enumMap.put("m3.xlarge", M3Xlarge);
        enumMap.put("m3.2xlarge", M32xlarge);
        enumMap.put("m4.large", M4Large);
        enumMap.put("m4.xlarge", M4Xlarge);
        enumMap.put("m4.2xlarge", M42xlarge);
        enumMap.put("m4.4xlarge", M44xlarge);
        enumMap.put("m4.10xlarge", M410xlarge);
        enumMap.put("m4.16xlarge", M416xlarge);
        enumMap.put("m2.xlarge", M2Xlarge);
        enumMap.put("m2.2xlarge", M22xlarge);
        enumMap.put("m2.4xlarge", M24xlarge);
        enumMap.put("cr1.8xlarge", Cr18xlarge);
        enumMap.put("r3.large", R3Large);
        enumMap.put("r3.xlarge", R3Xlarge);
        enumMap.put("r3.2xlarge", R32xlarge);
        enumMap.put("r3.4xlarge", R34xlarge);
        enumMap.put("r3.8xlarge", R38xlarge);
        enumMap.put("r4.large", R4Large);
        enumMap.put("r4.xlarge", R4Xlarge);
        enumMap.put("r4.2xlarge", R42xlarge);
        enumMap.put("r4.4xlarge", R44xlarge);
        enumMap.put("r4.8xlarge", R48xlarge);
        enumMap.put("r4.16xlarge", R416xlarge);
        enumMap.put("r5.large", R5Large);
        enumMap.put("r5.xlarge", R5Xlarge);
        enumMap.put("r5.2xlarge", R52xlarge);
        enumMap.put("r5.4xlarge", R54xlarge);
        enumMap.put("r5.8xlarge", R58xlarge);
        enumMap.put("r5.12xlarge", R512xlarge);
        enumMap.put("r5.16xlarge", R516xlarge);
        enumMap.put("r5.24xlarge", R524xlarge);
        enumMap.put("r5.metal", R5Metal);
        enumMap.put("r5a.large", R5aLarge);
        enumMap.put("r5a.xlarge", R5aXlarge);
        enumMap.put("r5a.2xlarge", R5a2xlarge);
        enumMap.put("r5a.4xlarge", R5a4xlarge);
        enumMap.put("r5a.8xlarge", R5a8xlarge);
        enumMap.put("r5a.12xlarge", R5a12xlarge);
        enumMap.put("r5a.16xlarge", R5a16xlarge);
        enumMap.put("r5a.24xlarge", R5a24xlarge);
        enumMap.put("r5d.large", R5dLarge);
        enumMap.put("r5d.xlarge", R5dXlarge);
        enumMap.put("r5d.2xlarge", R5d2xlarge);
        enumMap.put("r5d.4xlarge", R5d4xlarge);
        enumMap.put("r5d.8xlarge", R5d8xlarge);
        enumMap.put("r5d.12xlarge", R5d12xlarge);
        enumMap.put("r5d.16xlarge", R5d16xlarge);
        enumMap.put("r5d.24xlarge", R5d24xlarge);
        enumMap.put("r5d.metal", R5dMetal);
        enumMap.put("r5ad.large", R5adLarge);
        enumMap.put("r5ad.xlarge", R5adXlarge);
        enumMap.put("r5ad.2xlarge", R5ad2xlarge);
        enumMap.put("r5ad.4xlarge", R5ad4xlarge);
        enumMap.put("r5ad.8xlarge", R5ad8xlarge);
        enumMap.put("r5ad.12xlarge", R5ad12xlarge);
        enumMap.put("r5ad.16xlarge", R5ad16xlarge);
        enumMap.put("r5ad.24xlarge", R5ad24xlarge);
        enumMap.put("x1.16xlarge", X116xlarge);
        enumMap.put("x1.32xlarge", X132xlarge);
        enumMap.put("x1e.xlarge", X1eXlarge);
        enumMap.put("x1e.2xlarge", X1e2xlarge);
        enumMap.put("x1e.4xlarge", X1e4xlarge);
        enumMap.put("x1e.8xlarge", X1e8xlarge);
        enumMap.put("x1e.16xlarge", X1e16xlarge);
        enumMap.put("x1e.32xlarge", X1e32xlarge);
        enumMap.put("i2.xlarge", I2Xlarge);
        enumMap.put("i2.2xlarge", I22xlarge);
        enumMap.put("i2.4xlarge", I24xlarge);
        enumMap.put("i2.8xlarge", I28xlarge);
        enumMap.put("i3.large", I3Large);
        enumMap.put("i3.xlarge", I3Xlarge);
        enumMap.put("i3.2xlarge", I32xlarge);
        enumMap.put("i3.4xlarge", I34xlarge);
        enumMap.put("i3.8xlarge", I38xlarge);
        enumMap.put("i3.16xlarge", I316xlarge);
        enumMap.put("i3.metal", I3Metal);
        enumMap.put("i3en.large", I3enLarge);
        enumMap.put("i3en.xlarge", I3enXlarge);
        enumMap.put("i3en.2xlarge", I3en2xlarge);
        enumMap.put("i3en.3xlarge", I3en3xlarge);
        enumMap.put("i3en.6xlarge", I3en6xlarge);
        enumMap.put("i3en.12xlarge", I3en12xlarge);
        enumMap.put("i3en.24xlarge", I3en24xlarge);
        enumMap.put("i3en.metal", I3enMetal);
        enumMap.put("hi1.4xlarge", Hi14xlarge);
        enumMap.put("hs1.8xlarge", Hs18xlarge);
        enumMap.put("c1.medium", C1Medium);
        enumMap.put("c1.xlarge", C1Xlarge);
        enumMap.put("c3.large", C3Large);
        enumMap.put("c3.xlarge", C3Xlarge);
        enumMap.put("c3.2xlarge", C32xlarge);
        enumMap.put("c3.4xlarge", C34xlarge);
        enumMap.put("c3.8xlarge", C38xlarge);
        enumMap.put("c4.large", C4Large);
        enumMap.put("c4.xlarge", C4Xlarge);
        enumMap.put("c4.2xlarge", C42xlarge);
        enumMap.put("c4.4xlarge", C44xlarge);
        enumMap.put("c4.8xlarge", C48xlarge);
        enumMap.put("c5.large", C5Large);
        enumMap.put("c5.xlarge", C5Xlarge);
        enumMap.put("c5.2xlarge", C52xlarge);
        enumMap.put("c5.4xlarge", C54xlarge);
        enumMap.put("c5.9xlarge", C59xlarge);
        enumMap.put("c5.12xlarge", C512xlarge);
        enumMap.put("c5.18xlarge", C518xlarge);
        enumMap.put("c5.24xlarge", C524xlarge);
        enumMap.put("c5.metal", C5Metal);
        enumMap.put("c5a.large", C5aLarge);
        enumMap.put("c5a.xlarge", C5aXlarge);
        enumMap.put("c5a.2xlarge", C5a2xlarge);
        enumMap.put("c5a.4xlarge", C5a4xlarge);
        enumMap.put("c5a.8xlarge", C5a8xlarge);
        enumMap.put("c5a.12xlarge", C5a12xlarge);
        enumMap.put("c5a.16xlarge", C5a16xlarge);
        enumMap.put("c5a.24xlarge", C5a24xlarge);
        enumMap.put("c5d.large", C5dLarge);
        enumMap.put("c5d.xlarge", C5dXlarge);
        enumMap.put("c5d.2xlarge", C5d2xlarge);
        enumMap.put("c5d.4xlarge", C5d4xlarge);
        enumMap.put("c5d.9xlarge", C5d9xlarge);
        enumMap.put("c5d.12xlarge", C5d12xlarge);
        enumMap.put("c5d.18xlarge", C5d18xlarge);
        enumMap.put("c5d.24xlarge", C5d24xlarge);
        enumMap.put("c5d.metal", C5dMetal);
        enumMap.put("c5n.large", C5nLarge);
        enumMap.put("c5n.xlarge", C5nXlarge);
        enumMap.put("c5n.2xlarge", C5n2xlarge);
        enumMap.put("c5n.4xlarge", C5n4xlarge);
        enumMap.put("c5n.9xlarge", C5n9xlarge);
        enumMap.put("c5n.18xlarge", C5n18xlarge);
        enumMap.put("cc1.4xlarge", Cc14xlarge);
        enumMap.put("cc2.8xlarge", Cc28xlarge);
        enumMap.put("g2.2xlarge", G22xlarge);
        enumMap.put("g2.8xlarge", G28xlarge);
        enumMap.put("g3.4xlarge", G34xlarge);
        enumMap.put("g3.8xlarge", G38xlarge);
        enumMap.put("g3.16xlarge", G316xlarge);
        enumMap.put("g3s.xlarge", G3sXlarge);
        enumMap.put("g4dn.xlarge", G4dnXlarge);
        enumMap.put("g4dn.2xlarge", G4dn2xlarge);
        enumMap.put("g4dn.4xlarge", G4dn4xlarge);
        enumMap.put("g4dn.8xlarge", G4dn8xlarge);
        enumMap.put("g4dn.12xlarge", G4dn12xlarge);
        enumMap.put("g4dn.16xlarge", G4dn16xlarge);
        enumMap.put("g4dn.metal", G4dnMetal);
        enumMap.put("cg1.4xlarge", Cg14xlarge);
        enumMap.put("p2.xlarge", P2Xlarge);
        enumMap.put("p2.8xlarge", P28xlarge);
        enumMap.put("p2.16xlarge", P216xlarge);
        enumMap.put("p3.2xlarge", P32xlarge);
        enumMap.put("p3.8xlarge", P38xlarge);
        enumMap.put("p3.16xlarge", P316xlarge);
        enumMap.put("p3dn.24xlarge", P3dn24xlarge);
        enumMap.put("d2.xlarge", D2Xlarge);
        enumMap.put("d2.2xlarge", D22xlarge);
        enumMap.put("d2.4xlarge", D24xlarge);
        enumMap.put("d2.8xlarge", D28xlarge);
        enumMap.put("f1.2xlarge", F12xlarge);
        enumMap.put("f1.4xlarge", F14xlarge);
        enumMap.put("f1.16xlarge", F116xlarge);
        enumMap.put("m5.large", M5Large);
        enumMap.put("m5.xlarge", M5Xlarge);
        enumMap.put("m5.2xlarge", M52xlarge);
        enumMap.put("m5.4xlarge", M54xlarge);
        enumMap.put("m5.8xlarge", M58xlarge);
        enumMap.put("m5.12xlarge", M512xlarge);
        enumMap.put("m5.16xlarge", M516xlarge);
        enumMap.put("m5.24xlarge", M524xlarge);
        enumMap.put("m5.metal", M5Metal);
        enumMap.put("m5a.large", M5aLarge);
        enumMap.put("m5a.xlarge", M5aXlarge);
        enumMap.put("m5a.2xlarge", M5a2xlarge);
        enumMap.put("m5a.4xlarge", M5a4xlarge);
        enumMap.put("m5a.8xlarge", M5a8xlarge);
        enumMap.put("m5a.12xlarge", M5a12xlarge);
        enumMap.put("m5a.16xlarge", M5a16xlarge);
        enumMap.put("m5a.24xlarge", M5a24xlarge);
        enumMap.put("m5d.large", M5dLarge);
        enumMap.put("m5d.xlarge", M5dXlarge);
        enumMap.put("m5d.2xlarge", M5d2xlarge);
        enumMap.put("m5d.4xlarge", M5d4xlarge);
        enumMap.put("m5d.8xlarge", M5d8xlarge);
        enumMap.put("m5d.12xlarge", M5d12xlarge);
        enumMap.put("m5d.16xlarge", M5d16xlarge);
        enumMap.put("m5d.24xlarge", M5d24xlarge);
        enumMap.put("m5d.metal", M5dMetal);
        enumMap.put("m5ad.large", M5adLarge);
        enumMap.put("m5ad.xlarge", M5adXlarge);
        enumMap.put("m5ad.2xlarge", M5ad2xlarge);
        enumMap.put("m5ad.4xlarge", M5ad4xlarge);
        enumMap.put("m5ad.8xlarge", M5ad8xlarge);
        enumMap.put("m5ad.12xlarge", M5ad12xlarge);
        enumMap.put("m5ad.16xlarge", M5ad16xlarge);
        enumMap.put("m5ad.24xlarge", M5ad24xlarge);
        enumMap.put("h1.2xlarge", H12xlarge);
        enumMap.put("h1.4xlarge", H14xlarge);
        enumMap.put("h1.8xlarge", H18xlarge);
        enumMap.put("h1.16xlarge", H116xlarge);
        enumMap.put("z1d.large", Z1dLarge);
        enumMap.put("z1d.xlarge", Z1dXlarge);
        enumMap.put("z1d.2xlarge", Z1d2xlarge);
        enumMap.put("z1d.3xlarge", Z1d3xlarge);
        enumMap.put("z1d.6xlarge", Z1d6xlarge);
        enumMap.put("z1d.12xlarge", Z1d12xlarge);
        enumMap.put("z1d.metal", Z1dMetal);
        enumMap.put("u-6tb1.metal", U6tb1Metal);
        enumMap.put("u-9tb1.metal", U9tb1Metal);
        enumMap.put("u-12tb1.metal", U12tb1Metal);
        enumMap.put("u-18tb1.metal", U18tb1Metal);
        enumMap.put("u-24tb1.metal", U24tb1Metal);
        enumMap.put("a1.medium", A1Medium);
        enumMap.put("a1.large", A1Large);
        enumMap.put("a1.xlarge", A1Xlarge);
        enumMap.put("a1.2xlarge", A12xlarge);
        enumMap.put("a1.4xlarge", A14xlarge);
        enumMap.put("a1.metal", A1Metal);
        enumMap.put("m5dn.large", M5dnLarge);
        enumMap.put("m5dn.xlarge", M5dnXlarge);
        enumMap.put("m5dn.2xlarge", M5dn2xlarge);
        enumMap.put("m5dn.4xlarge", M5dn4xlarge);
        enumMap.put("m5dn.8xlarge", M5dn8xlarge);
        enumMap.put("m5dn.12xlarge", M5dn12xlarge);
        enumMap.put("m5dn.16xlarge", M5dn16xlarge);
        enumMap.put("m5dn.24xlarge", M5dn24xlarge);
        enumMap.put("m5n.large", M5nLarge);
        enumMap.put("m5n.xlarge", M5nXlarge);
        enumMap.put("m5n.2xlarge", M5n2xlarge);
        enumMap.put("m5n.4xlarge", M5n4xlarge);
        enumMap.put("m5n.8xlarge", M5n8xlarge);
        enumMap.put("m5n.12xlarge", M5n12xlarge);
        enumMap.put("m5n.16xlarge", M5n16xlarge);
        enumMap.put("m5n.24xlarge", M5n24xlarge);
        enumMap.put("r5dn.large", R5dnLarge);
        enumMap.put("r5dn.xlarge", R5dnXlarge);
        enumMap.put("r5dn.2xlarge", R5dn2xlarge);
        enumMap.put("r5dn.4xlarge", R5dn4xlarge);
        enumMap.put("r5dn.8xlarge", R5dn8xlarge);
        enumMap.put("r5dn.12xlarge", R5dn12xlarge);
        enumMap.put("r5dn.16xlarge", R5dn16xlarge);
        enumMap.put("r5dn.24xlarge", R5dn24xlarge);
        enumMap.put("r5n.large", R5nLarge);
        enumMap.put("r5n.xlarge", R5nXlarge);
        enumMap.put("r5n.2xlarge", R5n2xlarge);
        enumMap.put("r5n.4xlarge", R5n4xlarge);
        enumMap.put("r5n.8xlarge", R5n8xlarge);
        enumMap.put("r5n.12xlarge", R5n12xlarge);
        enumMap.put("r5n.16xlarge", R5n16xlarge);
        enumMap.put("r5n.24xlarge", R5n24xlarge);
        enumMap.put("inf1.xlarge", Inf1Xlarge);
        enumMap.put("inf1.2xlarge", Inf12xlarge);
        enumMap.put("inf1.6xlarge", Inf16xlarge);
        enumMap.put("inf1.24xlarge", Inf124xlarge);
        enumMap.put("m6g.metal", M6gMetal);
        enumMap.put("m6g.medium", M6gMedium);
        enumMap.put("m6g.large", M6gLarge);
        enumMap.put("m6g.xlarge", M6gXlarge);
        enumMap.put("m6g.2xlarge", M6g2xlarge);
        enumMap.put("m6g.4xlarge", M6g4xlarge);
        enumMap.put("m6g.8xlarge", M6g8xlarge);
        enumMap.put("m6g.12xlarge", M6g12xlarge);
        enumMap.put("m6g.16xlarge", M6g16xlarge);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InstanceType corresponding to the value
     */
    public static InstanceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
