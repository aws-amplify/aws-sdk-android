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
 * Adds a thing to a thing group.
 * </p>
 */
public class AddThingToThingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the group to which you are adding a thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingGroupName;

    /**
     * <p>
     * The ARN of the group to which you are adding a thing.
     * </p>
     */
    private String thingGroupArn;

    /**
     * <p>
     * The name of the thing to add to a group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The ARN of the thing to add to a group.
     * </p>
     */
    private String thingArn;

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
     * The name of the group to which you are adding a thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the group to which you are adding a thing.
     *         </p>
     */
    public String getThingGroupName() {
        return thingGroupName;
    }

    /**
     * <p>
     * The name of the group to which you are adding a thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingGroupName <p>
     *            The name of the group to which you are adding a thing.
     *            </p>
     */
    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The name of the group to which you are adding a thing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingGroupName <p>
     *            The name of the group to which you are adding a thing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddThingToThingGroupRequest withThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
        return this;
    }

    /**
     * <p>
     * The ARN of the group to which you are adding a thing.
     * </p>
     *
     * @return <p>
     *         The ARN of the group to which you are adding a thing.
     *         </p>
     */
    public String getThingGroupArn() {
        return thingGroupArn;
    }

    /**
     * <p>
     * The ARN of the group to which you are adding a thing.
     * </p>
     *
     * @param thingGroupArn <p>
     *            The ARN of the group to which you are adding a thing.
     *            </p>
     */
    public void setThingGroupArn(String thingGroupArn) {
        this.thingGroupArn = thingGroupArn;
    }

    /**
     * <p>
     * The ARN of the group to which you are adding a thing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupArn <p>
     *            The ARN of the group to which you are adding a thing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddThingToThingGroupRequest withThingGroupArn(String thingGroupArn) {
        this.thingGroupArn = thingGroupArn;
        return this;
    }

    /**
     * <p>
     * The name of the thing to add to a group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing to add to a group.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing to add to a group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing to add to a group.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing to add to a group.
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
     *            The name of the thing to add to a group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddThingToThingGroupRequest withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The ARN of the thing to add to a group.
     * </p>
     *
     * @return <p>
     *         The ARN of the thing to add to a group.
     *         </p>
     */
    public String getThingArn() {
        return thingArn;
    }

    /**
     * <p>
     * The ARN of the thing to add to a group.
     * </p>
     *
     * @param thingArn <p>
     *            The ARN of the thing to add to a group.
     *            </p>
     */
    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the thing to add to a group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingArn <p>
     *            The ARN of the thing to add to a group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddThingToThingGroupRequest withThingArn(String thingArn) {
        this.thingArn = thingArn;
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
    public AddThingToThingGroupRequest withOverrideDynamicGroups(Boolean overrideDynamicGroups) {
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
        if (getThingGroupName() != null)
            sb.append("thingGroupName: " + getThingGroupName() + ",");
        if (getThingGroupArn() != null)
            sb.append("thingGroupArn: " + getThingGroupArn() + ",");
        if (getThingName() != null)
            sb.append("thingName: " + getThingName() + ",");
        if (getThingArn() != null)
            sb.append("thingArn: " + getThingArn() + ",");
        if (getOverrideDynamicGroups() != null)
            sb.append("overrideDynamicGroups: " + getOverrideDynamicGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupArn() == null) ? 0 : getThingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
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

        if (obj instanceof AddThingToThingGroupRequest == false)
            return false;
        AddThingToThingGroupRequest other = (AddThingToThingGroupRequest) obj;

        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null
                && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupArn() == null ^ this.getThingGroupArn() == null)
            return false;
        if (other.getThingGroupArn() != null
                && other.getThingGroupArn().equals(this.getThingGroupArn()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        if (other.getOverrideDynamicGroups() == null ^ this.getOverrideDynamicGroups() == null)
            return false;
        if (other.getOverrideDynamicGroups() != null
                && other.getOverrideDynamicGroups().equals(this.getOverrideDynamicGroups()) == false)
            return false;
        return true;
    }
}
