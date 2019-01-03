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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the groups to which the thing belongs.
 * </p>
 */
public class UpdateThingGroupsForThingRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The thing whose group memberships will be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The groups to which the thing will be added.
     * </p>
     */
    private java.util.List<String> thingGroupsToAdd;

    /**
     * <p>
     * The groups from which the thing will be removed.
     * </p>
     */
    private java.util.List<String> thingGroupsToRemove;

    /**
     * <p>
     * Override dynamic thing groups with static thing groups when 10-group
     * limit is reached. If a thing belongs to 10 thing groups, and one or more
     * of those groups are dynamic thing groups, adding a thing to a static
     * group removes the thing from the last dynamic group.
     * </p>
     */
    private Boolean overrideDynamicGroups;

    /**
     * <p>
     * The thing whose group memberships will be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The thing whose group memberships will be updated.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The thing whose group memberships will be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The thing whose group memberships will be updated.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The thing whose group memberships will be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The thing whose group memberships will be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateThingGroupsForThingRequest withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The groups to which the thing will be added.
     * </p>
     *
     * @return <p>
     *         The groups to which the thing will be added.
     *         </p>
     */
    public java.util.List<String> getThingGroupsToAdd() {
        return thingGroupsToAdd;
    }

    /**
     * <p>
     * The groups to which the thing will be added.
     * </p>
     *
     * @param thingGroupsToAdd <p>
     *            The groups to which the thing will be added.
     *            </p>
     */
    public void setThingGroupsToAdd(java.util.Collection<String> thingGroupsToAdd) {
        if (thingGroupsToAdd == null) {
            this.thingGroupsToAdd = null;
            return;
        }

        this.thingGroupsToAdd = new java.util.ArrayList<String>(thingGroupsToAdd);
    }

    /**
     * <p>
     * The groups to which the thing will be added.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupsToAdd <p>
     *            The groups to which the thing will be added.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateThingGroupsForThingRequest withThingGroupsToAdd(String... thingGroupsToAdd) {
        if (getThingGroupsToAdd() == null) {
            this.thingGroupsToAdd = new java.util.ArrayList<String>(thingGroupsToAdd.length);
        }
        for (String value : thingGroupsToAdd) {
            this.thingGroupsToAdd.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The groups to which the thing will be added.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupsToAdd <p>
     *            The groups to which the thing will be added.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateThingGroupsForThingRequest withThingGroupsToAdd(
            java.util.Collection<String> thingGroupsToAdd) {
        setThingGroupsToAdd(thingGroupsToAdd);
        return this;
    }

    /**
     * <p>
     * The groups from which the thing will be removed.
     * </p>
     *
     * @return <p>
     *         The groups from which the thing will be removed.
     *         </p>
     */
    public java.util.List<String> getThingGroupsToRemove() {
        return thingGroupsToRemove;
    }

    /**
     * <p>
     * The groups from which the thing will be removed.
     * </p>
     *
     * @param thingGroupsToRemove <p>
     *            The groups from which the thing will be removed.
     *            </p>
     */
    public void setThingGroupsToRemove(java.util.Collection<String> thingGroupsToRemove) {
        if (thingGroupsToRemove == null) {
            this.thingGroupsToRemove = null;
            return;
        }

        this.thingGroupsToRemove = new java.util.ArrayList<String>(thingGroupsToRemove);
    }

    /**
     * <p>
     * The groups from which the thing will be removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupsToRemove <p>
     *            The groups from which the thing will be removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateThingGroupsForThingRequest withThingGroupsToRemove(String... thingGroupsToRemove) {
        if (getThingGroupsToRemove() == null) {
            this.thingGroupsToRemove = new java.util.ArrayList<String>(thingGroupsToRemove.length);
        }
        for (String value : thingGroupsToRemove) {
            this.thingGroupsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The groups from which the thing will be removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupsToRemove <p>
     *            The groups from which the thing will be removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateThingGroupsForThingRequest withThingGroupsToRemove(
            java.util.Collection<String> thingGroupsToRemove) {
        setThingGroupsToRemove(thingGroupsToRemove);
        return this;
    }

    /**
     * <p>
     * Override dynamic thing groups with static thing groups when 10-group
     * limit is reached. If a thing belongs to 10 thing groups, and one or more
     * of those groups are dynamic thing groups, adding a thing to a static
     * group removes the thing from the last dynamic group.
     * </p>
     *
     * @return <p>
     *         Override dynamic thing groups with static thing groups when
     *         10-group limit is reached. If a thing belongs to 10 thing groups,
     *         and one or more of those groups are dynamic thing groups, adding
     *         a thing to a static group removes the thing from the last dynamic
     *         group.
     *         </p>
     */
    public Boolean isOverrideDynamicGroups() {
        return overrideDynamicGroups;
    }

    /**
     * <p>
     * Override dynamic thing groups with static thing groups when 10-group
     * limit is reached. If a thing belongs to 10 thing groups, and one or more
     * of those groups are dynamic thing groups, adding a thing to a static
     * group removes the thing from the last dynamic group.
     * </p>
     *
     * @return <p>
     *         Override dynamic thing groups with static thing groups when
     *         10-group limit is reached. If a thing belongs to 10 thing groups,
     *         and one or more of those groups are dynamic thing groups, adding
     *         a thing to a static group removes the thing from the last dynamic
     *         group.
     *         </p>
     */
    public Boolean getOverrideDynamicGroups() {
        return overrideDynamicGroups;
    }

    /**
     * <p>
     * Override dynamic thing groups with static thing groups when 10-group
     * limit is reached. If a thing belongs to 10 thing groups, and one or more
     * of those groups are dynamic thing groups, adding a thing to a static
     * group removes the thing from the last dynamic group.
     * </p>
     *
     * @param overrideDynamicGroups <p>
     *            Override dynamic thing groups with static thing groups when
     *            10-group limit is reached. If a thing belongs to 10 thing
     *            groups, and one or more of those groups are dynamic thing
     *            groups, adding a thing to a static group removes the thing
     *            from the last dynamic group.
     *            </p>
     */
    public void setOverrideDynamicGroups(Boolean overrideDynamicGroups) {
        this.overrideDynamicGroups = overrideDynamicGroups;
    }

    /**
     * <p>
     * Override dynamic thing groups with static thing groups when 10-group
     * limit is reached. If a thing belongs to 10 thing groups, and one or more
     * of those groups are dynamic thing groups, adding a thing to a static
     * group removes the thing from the last dynamic group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overrideDynamicGroups <p>
     *            Override dynamic thing groups with static thing groups when
     *            10-group limit is reached. If a thing belongs to 10 thing
     *            groups, and one or more of those groups are dynamic thing
     *            groups, adding a thing to a static group removes the thing
     *            from the last dynamic group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateThingGroupsForThingRequest withOverrideDynamicGroups(Boolean overrideDynamicGroups) {
        this.overrideDynamicGroups = overrideDynamicGroups;
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
        if (getThingName() != null)
            sb.append("thingName: " + getThingName() + ",");
        if (getThingGroupsToAdd() != null)
            sb.append("thingGroupsToAdd: " + getThingGroupsToAdd() + ",");
        if (getThingGroupsToRemove() != null)
            sb.append("thingGroupsToRemove: " + getThingGroupsToRemove() + ",");
        if (getOverrideDynamicGroups() != null)
            sb.append("overrideDynamicGroups: " + getOverrideDynamicGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupsToAdd() == null) ? 0 : getThingGroupsToAdd().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupsToRemove() == null) ? 0 : getThingGroupsToRemove().hashCode());
        hashCode = prime
                * hashCode
                + ((getOverrideDynamicGroups() == null) ? 0 : getOverrideDynamicGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThingGroupsForThingRequest == false)
            return false;
        UpdateThingGroupsForThingRequest other = (UpdateThingGroupsForThingRequest) obj;

        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingGroupsToAdd() == null ^ this.getThingGroupsToAdd() == null)
            return false;
        if (other.getThingGroupsToAdd() != null
                && other.getThingGroupsToAdd().equals(this.getThingGroupsToAdd()) == false)
            return false;
        if (other.getThingGroupsToRemove() == null ^ this.getThingGroupsToRemove() == null)
            return false;
        if (other.getThingGroupsToRemove() != null
                && other.getThingGroupsToRemove().equals(this.getThingGroupsToRemove()) == false)
            return false;
        if (other.getOverrideDynamicGroups() == null ^ this.getOverrideDynamicGroups() == null)
            return false;
        if (other.getOverrideDynamicGroups() != null
                && other.getOverrideDynamicGroups().equals(this.getOverrideDynamicGroups()) == false)
            return false;
        return true;
    }
}
