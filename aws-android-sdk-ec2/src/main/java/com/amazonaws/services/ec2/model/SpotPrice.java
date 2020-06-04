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

import java.io.Serializable;

/**
 * <p>
 * Describes the maximum price per hour that you are willing to pay for a Spot
 * Instance.
 * </p>
 */
public class SpotPrice implements Serializable {
    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     */
    private String instanceType;

    /**
     * <p>
     * A general description of the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     */
    private String productDescription;

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance.
     * </p>
     */
    private String spotPrice;

    /**
     * <p>
     * The date and time the request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The Availability Zone.
     * </p>
     *
     * @return <p>
     *         The Availability Zone.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotPrice withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @return <p>
     *         The instance type.
     *         </p>
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public SpotPrice withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5a.large,
     * c5a.xlarge, c5a.2xlarge, c5a.4xlarge, c5a.8xlarge, c5a.12xlarge,
     * c5a.16xlarge, c5a.24xlarge, c5d.large, c5d.xlarge, c5d.2xlarge,
     * c5d.4xlarge, c5d.9xlarge, c5d.12xlarge, c5d.18xlarge, c5d.24xlarge,
     * c5d.metal, c5n.large, c5n.xlarge, c5n.2xlarge, c5n.4xlarge, c5n.9xlarge,
     * c5n.18xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge,
     * g3.4xlarge, g3.8xlarge, g3.16xlarge, g3s.xlarge, g4dn.xlarge,
     * g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge, g4dn.12xlarge, g4dn.16xlarge,
     * g4dn.metal, cg1.4xlarge, p2.xlarge, p2.8xlarge, p2.16xlarge, p3.2xlarge,
     * p3.8xlarge, p3.16xlarge, p3dn.24xlarge, d2.xlarge, d2.2xlarge,
     * d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge, f1.16xlarge, m5.large,
     * m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge, m5.12xlarge, m5.16xlarge,
     * m5.24xlarge, m5.metal, m5a.large, m5a.xlarge, m5a.2xlarge, m5a.4xlarge,
     * m5a.8xlarge, m5a.12xlarge, m5a.16xlarge, m5a.24xlarge, m5d.large,
     * m5d.xlarge, m5d.2xlarge, m5d.4xlarge, m5d.8xlarge, m5d.12xlarge,
     * m5d.16xlarge, m5d.24xlarge, m5d.metal, m5ad.large, m5ad.xlarge,
     * m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge, m5ad.12xlarge, m5ad.16xlarge,
     * m5ad.24xlarge, h1.2xlarge, h1.4xlarge, h1.8xlarge, h1.16xlarge,
     * z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge, z1d.6xlarge,
     * z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal, u-12tb1.metal,
     * u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large, a1.xlarge, a1.2xlarge,
     * a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge, m5dn.2xlarge,
     * m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge, m5dn.24xlarge,
     * m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge, m5n.8xlarge,
     * m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large, r5dn.xlarge,
     * r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge, r5dn.16xlarge,
     * r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge, r5n.4xlarge,
     * r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge, inf1.xlarge,
     * inf1.2xlarge, inf1.6xlarge, inf1.24xlarge, m6g.metal, m6g.medium,
     * m6g.large, m6g.xlarge, m6g.2xlarge, m6g.4xlarge, m6g.8xlarge,
     * m6g.12xlarge, m6g.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public SpotPrice withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * A general description of the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @return <p>
     *         A general description of the AMI.
     *         </p>
     * @see RIProductDescription
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * <p>
     * A general description of the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            A general description of the AMI.
     *            </p>
     * @see RIProductDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * A general description of the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            A general description of the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RIProductDescription
     */
    public SpotPrice withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * <p>
     * A general description of the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            A general description of the AMI.
     *            </p>
     * @see RIProductDescription
     */
    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }

    /**
     * <p>
     * A general description of the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            A general description of the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RIProductDescription
     */
    public SpotPrice withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance.
     * </p>
     *
     * @return <p>
     *         The maximum price per hour that you are willing to pay for a Spot
     *         Instance.
     *         </p>
     */
    public String getSpotPrice() {
        return spotPrice;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance.
     * </p>
     *
     * @param spotPrice <p>
     *            The maximum price per hour that you are willing to pay for a
     *            Spot Instance.
     *            </p>
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum price per hour that you are willing to pay for a Spot
     * Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotPrice <p>
     *            The maximum price per hour that you are willing to pay for a
     *            Spot Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotPrice withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * <p>
     * The date and time the request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @return <p>
     *         The date and time the request was created, in UTC format (for
     *         example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The date and time the request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @param timestamp <p>
     *            The date and time the request was created, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z).
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date and time the request was created, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The date and time the request was created, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotPrice withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotPrice == false)
            return false;
        SpotPrice other = (SpotPrice) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null
                && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null
                && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
