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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the AWS Region.
 * </p>
 */
public class Region implements Serializable {
    /**
     * <p>
     * The continent code (e.g., <code>NA</code>, meaning North America).
     * </p>
     */
    private String continentCode;

    /**
     * <p>
     * The description of the AWS Region (e.g.,
     * <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>
     * ).
     * </p>
     */
    private String description;

    /**
     * <p>
     * The display name (e.g., <code>Ohio</code>).
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * The region name (e.g., <code>us-east-2</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     */
    private String name;

    /**
     * <p>
     * The Availability Zones. Follows the format <code>us-east-2a</code>
     * (case-sensitive).
     * </p>
     */
    private java.util.List<AvailabilityZone> availabilityZones;

    /**
     * <p>
     * The Availability Zones for databases. Follows the format
     * <code>us-east-2a</code> (case-sensitive).
     * </p>
     */
    private java.util.List<AvailabilityZone> relationalDatabaseAvailabilityZones;

    /**
     * <p>
     * The continent code (e.g., <code>NA</code>, meaning North America).
     * </p>
     *
     * @return <p>
     *         The continent code (e.g., <code>NA</code>, meaning North
     *         America).
     *         </p>
     */
    public String getContinentCode() {
        return continentCode;
    }

    /**
     * <p>
     * The continent code (e.g., <code>NA</code>, meaning North America).
     * </p>
     *
     * @param continentCode <p>
     *            The continent code (e.g., <code>NA</code>, meaning North
     *            America).
     *            </p>
     */
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    /**
     * <p>
     * The continent code (e.g., <code>NA</code>, meaning North America).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param continentCode <p>
     *            The continent code (e.g., <code>NA</code>, meaning North
     *            America).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Region withContinentCode(String continentCode) {
        this.continentCode = continentCode;
        return this;
    }

    /**
     * <p>
     * The description of the AWS Region (e.g.,
     * <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>
     * ).
     * </p>
     *
     * @return <p>
     *         The description of the AWS Region (e.g.,
     *         <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>
     *         ).
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the AWS Region (e.g.,
     * <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>
     * ).
     * </p>
     *
     * @param description <p>
     *            The description of the AWS Region (e.g.,
     *            <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>
     *            ).
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the AWS Region (e.g.,
     * <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>
     * ).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the AWS Region (e.g.,
     *            <code>This region is recommended to serve users in the eastern United States and eastern Canada</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Region withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The display name (e.g., <code>Ohio</code>).
     * </p>
     *
     * @return <p>
     *         The display name (e.g., <code>Ohio</code>).
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The display name (e.g., <code>Ohio</code>).
     * </p>
     *
     * @param displayName <p>
     *            The display name (e.g., <code>Ohio</code>).
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name (e.g., <code>Ohio</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param displayName <p>
     *            The display name (e.g., <code>Ohio</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Region withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The region name (e.g., <code>us-east-2</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @return <p>
     *         The region name (e.g., <code>us-east-2</code>).
     *         </p>
     * @see RegionName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The region name (e.g., <code>us-east-2</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param name <p>
     *            The region name (e.g., <code>us-east-2</code>).
     *            </p>
     * @see RegionName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The region name (e.g., <code>us-east-2</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param name <p>
     *            The region name (e.g., <code>us-east-2</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegionName
     */
    public Region withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The region name (e.g., <code>us-east-2</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param name <p>
     *            The region name (e.g., <code>us-east-2</code>).
     *            </p>
     * @see RegionName
     */
    public void setName(RegionName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The region name (e.g., <code>us-east-2</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param name <p>
     *            The region name (e.g., <code>us-east-2</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegionName
     */
    public Region withName(RegionName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zones. Follows the format <code>us-east-2a</code>
     * (case-sensitive).
     * </p>
     *
     * @return <p>
     *         The Availability Zones. Follows the format
     *         <code>us-east-2a</code> (case-sensitive).
     *         </p>
     */
    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones. Follows the format <code>us-east-2a</code>
     * (case-sensitive).
     * </p>
     *
     * @param availabilityZones <p>
     *            The Availability Zones. Follows the format
     *            <code>us-east-2a</code> (case-sensitive).
     *            </p>
     */
    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones. Follows the format <code>us-east-2a</code>
     * (case-sensitive).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            The Availability Zones. Follows the format
     *            <code>us-east-2a</code> (case-sensitive).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Region withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(
                    availabilityZones.length);
        }
        for (AvailabilityZone value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones. Follows the format <code>us-east-2a</code>
     * (case-sensitive).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            The Availability Zones. Follows the format
     *            <code>us-east-2a</code> (case-sensitive).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Region withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The Availability Zones for databases. Follows the format
     * <code>us-east-2a</code> (case-sensitive).
     * </p>
     *
     * @return <p>
     *         The Availability Zones for databases. Follows the format
     *         <code>us-east-2a</code> (case-sensitive).
     *         </p>
     */
    public java.util.List<AvailabilityZone> getRelationalDatabaseAvailabilityZones() {
        return relationalDatabaseAvailabilityZones;
    }

    /**
     * <p>
     * The Availability Zones for databases. Follows the format
     * <code>us-east-2a</code> (case-sensitive).
     * </p>
     *
     * @param relationalDatabaseAvailabilityZones <p>
     *            The Availability Zones for databases. Follows the format
     *            <code>us-east-2a</code> (case-sensitive).
     *            </p>
     */
    public void setRelationalDatabaseAvailabilityZones(
            java.util.Collection<AvailabilityZone> relationalDatabaseAvailabilityZones) {
        if (relationalDatabaseAvailabilityZones == null) {
            this.relationalDatabaseAvailabilityZones = null;
            return;
        }

        this.relationalDatabaseAvailabilityZones = new java.util.ArrayList<AvailabilityZone>(
                relationalDatabaseAvailabilityZones);
    }

    /**
     * <p>
     * The Availability Zones for databases. Follows the format
     * <code>us-east-2a</code> (case-sensitive).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationalDatabaseAvailabilityZones <p>
     *            The Availability Zones for databases. Follows the format
     *            <code>us-east-2a</code> (case-sensitive).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Region withRelationalDatabaseAvailabilityZones(
            AvailabilityZone... relationalDatabaseAvailabilityZones) {
        if (getRelationalDatabaseAvailabilityZones() == null) {
            this.relationalDatabaseAvailabilityZones = new java.util.ArrayList<AvailabilityZone>(
                    relationalDatabaseAvailabilityZones.length);
        }
        for (AvailabilityZone value : relationalDatabaseAvailabilityZones) {
            this.relationalDatabaseAvailabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones for databases. Follows the format
     * <code>us-east-2a</code> (case-sensitive).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationalDatabaseAvailabilityZones <p>
     *            The Availability Zones for databases. Follows the format
     *            <code>us-east-2a</code> (case-sensitive).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Region withRelationalDatabaseAvailabilityZones(
            java.util.Collection<AvailabilityZone> relationalDatabaseAvailabilityZones) {
        setRelationalDatabaseAvailabilityZones(relationalDatabaseAvailabilityZones);
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
        if (getContinentCode() != null)
            sb.append("continentCode: " + getContinentCode() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getDisplayName() != null)
            sb.append("displayName: " + getDisplayName() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getAvailabilityZones() != null)
            sb.append("availabilityZones: " + getAvailabilityZones() + ",");
        if (getRelationalDatabaseAvailabilityZones() != null)
            sb.append("relationalDatabaseAvailabilityZones: "
                    + getRelationalDatabaseAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContinentCode() == null) ? 0 : getContinentCode().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseAvailabilityZones() == null) ? 0
                        : getRelationalDatabaseAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Region == false)
            return false;
        Region other = (Region) obj;

        if (other.getContinentCode() == null ^ this.getContinentCode() == null)
            return false;
        if (other.getContinentCode() != null
                && other.getContinentCode().equals(this.getContinentCode()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getRelationalDatabaseAvailabilityZones() == null
                ^ this.getRelationalDatabaseAvailabilityZones() == null)
            return false;
        if (other.getRelationalDatabaseAvailabilityZones() != null
                && other.getRelationalDatabaseAvailabilityZones().equals(
                        this.getRelationalDatabaseAvailabilityZones()) == false)
            return false;
        return true;
    }
}
