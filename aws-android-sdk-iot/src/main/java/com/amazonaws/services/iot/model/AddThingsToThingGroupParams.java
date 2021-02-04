/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Parameters used when defining a mitigation action that move a set of things
 * to a thing group.
 * </p>
 */
public class AddThingsToThingGroupParams implements Serializable {
    /**
     * <p>
     * The list of groups to which you want to add the things that triggered the
     * mitigation action. You can add a thing to a maximum of 10 groups, but you
     * can't add a thing to more than one group in the same hierarchy.
     * </p>
     */
    private java.util.List<String> thingGroupNames;

    /**
     * <p>
     * Specifies if this mitigation action can move the things that triggered
     * the mitigation action even if they are part of one or more dynamic thing
     * groups.
     * </p>
     */
    private Boolean overrideDynamicGroups;

    /**
     * <p>
     * The list of groups to which you want to add the things that triggered the
     * mitigation action. You can add a thing to a maximum of 10 groups, but you
     * can't add a thing to more than one group in the same hierarchy.
     * </p>
     *
     * @return <p>
     *         The list of groups to which you want to add the things that
     *         triggered the mitigation action. You can add a thing to a maximum
     *         of 10 groups, but you can't add a thing to more than one group in
     *         the same hierarchy.
     *         </p>
     */
    public java.util.List<String> getThingGroupNames() {
        return thingGroupNames;
    }

    /**
     * <p>
     * The list of groups to which you want to add the things that triggered the
     * mitigation action. You can add a thing to a maximum of 10 groups, but you
     * can't add a thing to more than one group in the same hierarchy.
     * </p>
     *
     * @param thingGroupNames <p>
     *            The list of groups to which you want to add the things that
     *            triggered the mitigation action. You can add a thing to a
     *            maximum of 10 groups, but you can't add a thing to more than
     *            one group in the same hierarchy.
     *            </p>
     */
    public void setThingGroupNames(java.util.Collection<String> thingGroupNames) {
        if (thingGroupNames == null) {
            this.thingGroupNames = null;
            return;
        }

        this.thingGroupNames = new java.util.ArrayList<String>(thingGroupNames);
    }

    /**
     * <p>
     * The list of groups to which you want to add the things that triggered the
     * mitigation action. You can add a thing to a maximum of 10 groups, but you
     * can't add a thing to more than one group in the same hierarchy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupNames <p>
     *            The list of groups to which you want to add the things that
     *            triggered the mitigation action. You can add a thing to a
     *            maximum of 10 groups, but you can't add a thing to more than
     *            one group in the same hierarchy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddThingsToThingGroupParams withThingGroupNames(String... thingGroupNames) {
        if (getThingGroupNames() == null) {
            this.thingGroupNames = new java.util.ArrayList<String>(thingGroupNames.length);
        }
        for (String value : thingGroupNames) {
            this.thingGroupNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of groups to which you want to add the things that triggered the
     * mitigation action. You can add a thing to a maximum of 10 groups, but you
     * can't add a thing to more than one group in the same hierarchy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupNames <p>
     *            The list of groups to which you want to add the things that
     *            triggered the mitigation action. You can add a thing to a
     *            maximum of 10 groups, but you can't add a thing to more than
     *            one group in the same hierarchy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddThingsToThingGroupParams withThingGroupNames(
            java.util.Collection<String> thingGroupNames) {
        setThingGroupNames(thingGroupNames);
        return this;
    }

    /**
     * <p>
     * Specifies if this mitigation action can move the things that triggered
     * the mitigation action even if they are part of one or more dynamic thing
     * groups.
     * </p>
     *
     * @return <p>
     *         Specifies if this mitigation action can move the things that
     *         triggered the mitigation action even if they are part of one or
     *         more dynamic thing groups.
     *         </p>
     */
    public Boolean isOverrideDynamicGroups() {
        return overrideDynamicGroups;
    }

    /**
     * <p>
     * Specifies if this mitigation action can move the things that triggered
     * the mitigation action even if they are part of one or more dynamic thing
     * groups.
     * </p>
     *
     * @return <p>
     *         Specifies if this mitigation action can move the things that
     *         triggered the mitigation action even if they are part of one or
     *         more dynamic thing groups.
     *         </p>
     */
    public Boolean getOverrideDynamicGroups() {
        return overrideDynamicGroups;
    }

    /**
     * <p>
     * Specifies if this mitigation action can move the things that triggered
     * the mitigation action even if they are part of one or more dynamic thing
     * groups.
     * </p>
     *
     * @param overrideDynamicGroups <p>
     *            Specifies if this mitigation action can move the things that
     *            triggered the mitigation action even if they are part of one
     *            or more dynamic thing groups.
     *            </p>
     */
    public void setOverrideDynamicGroups(Boolean overrideDynamicGroups) {
        this.overrideDynamicGroups = overrideDynamicGroups;
    }

    /**
     * <p>
     * Specifies if this mitigation action can move the things that triggered
     * the mitigation action even if they are part of one or more dynamic thing
     * groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overrideDynamicGroups <p>
     *            Specifies if this mitigation action can move the things that
     *            triggered the mitigation action even if they are part of one
     *            or more dynamic thing groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddThingsToThingGroupParams withOverrideDynamicGroups(Boolean overrideDynamicGroups) {
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
        if (getThingGroupNames() != null)
            sb.append("thingGroupNames: " + getThingGroupNames() + ",");
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
                + ((getThingGroupNames() == null) ? 0 : getThingGroupNames().hashCode());
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

        if (obj instanceof AddThingsToThingGroupParams == false)
            return false;
        AddThingsToThingGroupParams other = (AddThingsToThingGroupParams) obj;

        if (other.getThingGroupNames() == null ^ this.getThingGroupNames() == null)
            return false;
        if (other.getThingGroupNames() != null
                && other.getThingGroupNames().equals(this.getThingGroupNames()) == false)
            return false;
        if (other.getOverrideDynamicGroups() == null ^ this.getOverrideDynamicGroups() == null)
            return false;
        if (other.getOverrideDynamicGroups() != null
                && other.getOverrideDynamicGroups().equals(this.getOverrideDynamicGroups()) == false)
            return false;
        return true;
    }
}
