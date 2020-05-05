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
 * Describes an Availability Zone or Local Zone.
 * </p>
 */
public class AvailabilityZone implements Serializable {
    /**
     * <p>
     * The state of the Availability Zone or Local Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, information, impaired, unavailable
     */
    private String state;

    /**
     * <p>
     * For Availability Zones, this parameter always has the value of
     * <code>opt-in-not-required</code>.
     * </p>
     * <p>
     * For Local Zones, this parameter is the opt in status. The possible values
     * are <code>opted-in</code>, and <code>not-opted-in</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opt-in-not-required, opted-in, not-opted-in
     */
    private String optInStatus;

    /**
     * <p>
     * Any messages about the Availability Zone or Local Zone.
     * </p>
     */
    private java.util.List<AvailabilityZoneMessage> messages;

    /**
     * <p>
     * The name of the Region.
     * </p>
     */
    private String regionName;

    /**
     * <p>
     * The name of the Availability Zone or Local Zone.
     * </p>
     */
    private String zoneName;

    /**
     * <p>
     * The ID of the Availability Zone or Local Zone.
     * </p>
     */
    private String zoneId;

    /**
     * <p>
     * For Availability Zones, this parameter has the same value as the Region
     * name.
     * </p>
     * <p>
     * For Local Zones, the name of the associated group, for example
     * <code>us-west-2-lax-1</code>.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The name of the location from which the address is advertised.
     * </p>
     */
    private String networkBorderGroup;

    /**
     * <p>
     * The state of the Availability Zone or Local Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, information, impaired, unavailable
     *
     * @return <p>
     *         The state of the Availability Zone or Local Zone.
     *         </p>
     * @see AvailabilityZoneState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the Availability Zone or Local Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, information, impaired, unavailable
     *
     * @param state <p>
     *            The state of the Availability Zone or Local Zone.
     *            </p>
     * @see AvailabilityZoneState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Availability Zone or Local Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, information, impaired, unavailable
     *
     * @param state <p>
     *            The state of the Availability Zone or Local Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AvailabilityZoneState
     */
    public AvailabilityZone withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the Availability Zone or Local Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, information, impaired, unavailable
     *
     * @param state <p>
     *            The state of the Availability Zone or Local Zone.
     *            </p>
     * @see AvailabilityZoneState
     */
    public void setState(AvailabilityZoneState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the Availability Zone or Local Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, information, impaired, unavailable
     *
     * @param state <p>
     *            The state of the Availability Zone or Local Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AvailabilityZoneState
     */
    public AvailabilityZone withState(AvailabilityZoneState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * For Availability Zones, this parameter always has the value of
     * <code>opt-in-not-required</code>.
     * </p>
     * <p>
     * For Local Zones, this parameter is the opt in status. The possible values
     * are <code>opted-in</code>, and <code>not-opted-in</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opt-in-not-required, opted-in, not-opted-in
     *
     * @return <p>
     *         For Availability Zones, this parameter always has the value of
     *         <code>opt-in-not-required</code>.
     *         </p>
     *         <p>
     *         For Local Zones, this parameter is the opt in status. The
     *         possible values are <code>opted-in</code>, and
     *         <code>not-opted-in</code>.
     *         </p>
     * @see AvailabilityZoneOptInStatus
     */
    public String getOptInStatus() {
        return optInStatus;
    }

    /**
     * <p>
     * For Availability Zones, this parameter always has the value of
     * <code>opt-in-not-required</code>.
     * </p>
     * <p>
     * For Local Zones, this parameter is the opt in status. The possible values
     * are <code>opted-in</code>, and <code>not-opted-in</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opt-in-not-required, opted-in, not-opted-in
     *
     * @param optInStatus <p>
     *            For Availability Zones, this parameter always has the value of
     *            <code>opt-in-not-required</code>.
     *            </p>
     *            <p>
     *            For Local Zones, this parameter is the opt in status. The
     *            possible values are <code>opted-in</code>, and
     *            <code>not-opted-in</code>.
     *            </p>
     * @see AvailabilityZoneOptInStatus
     */
    public void setOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
    }

    /**
     * <p>
     * For Availability Zones, this parameter always has the value of
     * <code>opt-in-not-required</code>.
     * </p>
     * <p>
     * For Local Zones, this parameter is the opt in status. The possible values
     * are <code>opted-in</code>, and <code>not-opted-in</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opt-in-not-required, opted-in, not-opted-in
     *
     * @param optInStatus <p>
     *            For Availability Zones, this parameter always has the value of
     *            <code>opt-in-not-required</code>.
     *            </p>
     *            <p>
     *            For Local Zones, this parameter is the opt in status. The
     *            possible values are <code>opted-in</code>, and
     *            <code>not-opted-in</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AvailabilityZoneOptInStatus
     */
    public AvailabilityZone withOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
        return this;
    }

    /**
     * <p>
     * For Availability Zones, this parameter always has the value of
     * <code>opt-in-not-required</code>.
     * </p>
     * <p>
     * For Local Zones, this parameter is the opt in status. The possible values
     * are <code>opted-in</code>, and <code>not-opted-in</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opt-in-not-required, opted-in, not-opted-in
     *
     * @param optInStatus <p>
     *            For Availability Zones, this parameter always has the value of
     *            <code>opt-in-not-required</code>.
     *            </p>
     *            <p>
     *            For Local Zones, this parameter is the opt in status. The
     *            possible values are <code>opted-in</code>, and
     *            <code>not-opted-in</code>.
     *            </p>
     * @see AvailabilityZoneOptInStatus
     */
    public void setOptInStatus(AvailabilityZoneOptInStatus optInStatus) {
        this.optInStatus = optInStatus.toString();
    }

    /**
     * <p>
     * For Availability Zones, this parameter always has the value of
     * <code>opt-in-not-required</code>.
     * </p>
     * <p>
     * For Local Zones, this parameter is the opt in status. The possible values
     * are <code>opted-in</code>, and <code>not-opted-in</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opt-in-not-required, opted-in, not-opted-in
     *
     * @param optInStatus <p>
     *            For Availability Zones, this parameter always has the value of
     *            <code>opt-in-not-required</code>.
     *            </p>
     *            <p>
     *            For Local Zones, this parameter is the opt in status. The
     *            possible values are <code>opted-in</code>, and
     *            <code>not-opted-in</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AvailabilityZoneOptInStatus
     */
    public AvailabilityZone withOptInStatus(AvailabilityZoneOptInStatus optInStatus) {
        this.optInStatus = optInStatus.toString();
        return this;
    }

    /**
     * <p>
     * Any messages about the Availability Zone or Local Zone.
     * </p>
     *
     * @return <p>
     *         Any messages about the Availability Zone or Local Zone.
     *         </p>
     */
    public java.util.List<AvailabilityZoneMessage> getMessages() {
        return messages;
    }

    /**
     * <p>
     * Any messages about the Availability Zone or Local Zone.
     * </p>
     *
     * @param messages <p>
     *            Any messages about the Availability Zone or Local Zone.
     *            </p>
     */
    public void setMessages(java.util.Collection<AvailabilityZoneMessage> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<AvailabilityZoneMessage>(messages);
    }

    /**
     * <p>
     * Any messages about the Availability Zone or Local Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messages <p>
     *            Any messages about the Availability Zone or Local Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withMessages(AvailabilityZoneMessage... messages) {
        if (getMessages() == null) {
            this.messages = new java.util.ArrayList<AvailabilityZoneMessage>(messages.length);
        }
        for (AvailabilityZoneMessage value : messages) {
            this.messages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any messages about the Availability Zone or Local Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messages <p>
     *            Any messages about the Availability Zone or Local Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withMessages(java.util.Collection<AvailabilityZoneMessage> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     *
     * @return <p>
     *         The name of the Region.
     *         </p>
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     *
     * @param regionName <p>
     *            The name of the Region.
     *            </p>
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionName <p>
     *            The name of the Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone or Local Zone.
     * </p>
     *
     * @return <p>
     *         The name of the Availability Zone or Local Zone.
     *         </p>
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone or Local Zone.
     * </p>
     *
     * @param zoneName <p>
     *            The name of the Availability Zone or Local Zone.
     *            </p>
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone or Local Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zoneName <p>
     *            The name of the Availability Zone or Local Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * <p>
     * The ID of the Availability Zone or Local Zone.
     * </p>
     *
     * @return <p>
     *         The ID of the Availability Zone or Local Zone.
     *         </p>
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone or Local Zone.
     * </p>
     *
     * @param zoneId <p>
     *            The ID of the Availability Zone or Local Zone.
     *            </p>
     */
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone or Local Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zoneId <p>
     *            The ID of the Availability Zone or Local Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * <p>
     * For Availability Zones, this parameter has the same value as the Region
     * name.
     * </p>
     * <p>
     * For Local Zones, the name of the associated group, for example
     * <code>us-west-2-lax-1</code>.
     * </p>
     *
     * @return <p>
     *         For Availability Zones, this parameter has the same value as the
     *         Region name.
     *         </p>
     *         <p>
     *         For Local Zones, the name of the associated group, for example
     *         <code>us-west-2-lax-1</code>.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * For Availability Zones, this parameter has the same value as the Region
     * name.
     * </p>
     * <p>
     * For Local Zones, the name of the associated group, for example
     * <code>us-west-2-lax-1</code>.
     * </p>
     *
     * @param groupName <p>
     *            For Availability Zones, this parameter has the same value as
     *            the Region name.
     *            </p>
     *            <p>
     *            For Local Zones, the name of the associated group, for example
     *            <code>us-west-2-lax-1</code>.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * For Availability Zones, this parameter has the same value as the Region
     * name.
     * </p>
     * <p>
     * For Local Zones, the name of the associated group, for example
     * <code>us-west-2-lax-1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            For Availability Zones, this parameter has the same value as
     *            the Region name.
     *            </p>
     *            <p>
     *            For Local Zones, the name of the associated group, for example
     *            <code>us-west-2-lax-1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The name of the location from which the address is advertised.
     * </p>
     *
     * @return <p>
     *         The name of the location from which the address is advertised.
     *         </p>
     */
    public String getNetworkBorderGroup() {
        return networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which the address is advertised.
     * </p>
     *
     * @param networkBorderGroup <p>
     *            The name of the location from which the address is advertised.
     *            </p>
     */
    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which the address is advertised.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBorderGroup <p>
     *            The name of the location from which the address is advertised.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getOptInStatus() != null)
            sb.append("OptInStatus: " + getOptInStatus() + ",");
        if (getMessages() != null)
            sb.append("Messages: " + getMessages() + ",");
        if (getRegionName() != null)
            sb.append("RegionName: " + getRegionName() + ",");
        if (getZoneName() != null)
            sb.append("ZoneName: " + getZoneName() + ",");
        if (getZoneId() != null)
            sb.append("ZoneId: " + getZoneId() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: " + getNetworkBorderGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getOptInStatus() == null) ? 0 : getOptInStatus().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getZoneName() == null) ? 0 : getZoneName().hashCode());
        hashCode = prime * hashCode + ((getZoneId() == null) ? 0 : getZoneId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailabilityZone == false)
            return false;
        AvailabilityZone other = (AvailabilityZone) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getOptInStatus() == null ^ this.getOptInStatus() == null)
            return false;
        if (other.getOptInStatus() != null
                && other.getOptInStatus().equals(this.getOptInStatus()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null
                && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getZoneName() == null ^ this.getZoneName() == null)
            return false;
        if (other.getZoneName() != null && other.getZoneName().equals(this.getZoneName()) == false)
            return false;
        if (other.getZoneId() == null ^ this.getZoneId() == null)
            return false;
        if (other.getZoneId() != null && other.getZoneId().equals(this.getZoneId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null
                && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        return true;
    }
}
