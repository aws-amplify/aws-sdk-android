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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon EC2 Availability Zone configuration of the cluster (job flow).
 * </p>
 */
public class PlacementType implements Serializable {
    /**
     * <p>
     * The Amazon EC2 Availability Zone for the cluster.
     * <code>AvailabilityZone</code> is used for uniform instance groups, while
     * <code>AvailabilityZones</code> (plural) is used for instance fleets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String availabilityZone;

    /**
     * <p>
     * When multiple Availability Zones are specified, Amazon EMR evaluates them
     * and launches instances in the optimal Availability Zone.
     * <code>AvailabilityZones</code> is used for instance fleets, while
     * <code>AvailabilityZone</code> (singular) is used for uniform instance
     * groups.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the cluster.
     * <code>AvailabilityZone</code> is used for uniform instance groups, while
     * <code>AvailabilityZones</code> (plural) is used for instance fleets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon EC2 Availability Zone for the cluster.
     *         <code>AvailabilityZone</code> is used for uniform instance
     *         groups, while <code>AvailabilityZones</code> (plural) is used for
     *         instance fleets.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the cluster.
     * <code>AvailabilityZone</code> is used for uniform instance groups, while
     * <code>AvailabilityZones</code> (plural) is used for instance fleets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param availabilityZone <p>
     *            The Amazon EC2 Availability Zone for the cluster.
     *            <code>AvailabilityZone</code> is used for uniform instance
     *            groups, while <code>AvailabilityZones</code> (plural) is used
     *            for instance fleets.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the cluster.
     * <code>AvailabilityZone</code> is used for uniform instance groups, while
     * <code>AvailabilityZones</code> (plural) is used for instance fleets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param availabilityZone <p>
     *            The Amazon EC2 Availability Zone for the cluster.
     *            <code>AvailabilityZone</code> is used for uniform instance
     *            groups, while <code>AvailabilityZones</code> (plural) is used
     *            for instance fleets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlacementType withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * When multiple Availability Zones are specified, Amazon EMR evaluates them
     * and launches instances in the optimal Availability Zone.
     * <code>AvailabilityZones</code> is used for instance fleets, while
     * <code>AvailabilityZone</code> (singular) is used for uniform instance
     * groups.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     *
     * @return <p>
     *         When multiple Availability Zones are specified, Amazon EMR
     *         evaluates them and launches instances in the optimal Availability
     *         Zone. <code>AvailabilityZones</code> is used for instance fleets,
     *         while <code>AvailabilityZone</code> (singular) is used for
     *         uniform instance groups.
     *         </p>
     *         <note>
     *         <p>
     *         The instance fleet configuration is available only in Amazon EMR
     *         versions 4.8.0 and later, excluding 5.0.x versions.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * When multiple Availability Zones are specified, Amazon EMR evaluates them
     * and launches instances in the optimal Availability Zone.
     * <code>AvailabilityZones</code> is used for instance fleets, while
     * <code>AvailabilityZone</code> (singular) is used for uniform instance
     * groups.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     *
     * @param availabilityZones <p>
     *            When multiple Availability Zones are specified, Amazon EMR
     *            evaluates them and launches instances in the optimal
     *            Availability Zone. <code>AvailabilityZones</code> is used for
     *            instance fleets, while <code>AvailabilityZone</code>
     *            (singular) is used for uniform instance groups.
     *            </p>
     *            <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * When multiple Availability Zones are specified, Amazon EMR evaluates them
     * and launches instances in the optimal Availability Zone.
     * <code>AvailabilityZones</code> is used for instance fleets, while
     * <code>AvailabilityZone</code> (singular) is used for uniform instance
     * groups.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            When multiple Availability Zones are specified, Amazon EMR
     *            evaluates them and launches instances in the optimal
     *            Availability Zone. <code>AvailabilityZones</code> is used for
     *            instance fleets, while <code>AvailabilityZone</code>
     *            (singular) is used for uniform instance groups.
     *            </p>
     *            <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlacementType withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<String>(availabilityZones.length);
        }
        for (String value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * When multiple Availability Zones are specified, Amazon EMR evaluates them
     * and launches instances in the optimal Availability Zone.
     * <code>AvailabilityZones</code> is used for instance fleets, while
     * <code>AvailabilityZone</code> (singular) is used for uniform instance
     * groups.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            When multiple Availability Zones are specified, Amazon EMR
     *            evaluates them and launches instances in the optimal
     *            Availability Zone. <code>AvailabilityZones</code> is used for
     *            instance fleets, while <code>AvailabilityZone</code>
     *            (singular) is used for uniform instance groups.
     *            </p>
     *            <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlacementType withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones());
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
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementType == false)
            return false;
        PlacementType other = (PlacementType) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        return true;
    }
}
