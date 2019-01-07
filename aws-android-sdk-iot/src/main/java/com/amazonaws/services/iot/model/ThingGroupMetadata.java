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

/**
 * <p>
 * Thing group metadata.
 * </p>
 */
public class ThingGroupMetadata implements Serializable {
    /**
     * <p>
     * The parent thing group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String parentGroupName;

    /**
     * <p>
     * The root parent thing group.
     * </p>
     */
    private java.util.List<GroupNameAndArn> rootToParentThingGroups;

    /**
     * <p>
     * The UNIX timestamp of when the thing group was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The parent thing group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The parent thing group name.
     *         </p>
     */
    public String getParentGroupName() {
        return parentGroupName;
    }

    /**
     * <p>
     * The parent thing group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param parentGroupName <p>
     *            The parent thing group name.
     *            </p>
     */
    public void setParentGroupName(String parentGroupName) {
        this.parentGroupName = parentGroupName;
    }

    /**
     * <p>
     * The parent thing group name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param parentGroupName <p>
     *            The parent thing group name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupMetadata withParentGroupName(String parentGroupName) {
        this.parentGroupName = parentGroupName;
        return this;
    }

    /**
     * <p>
     * The root parent thing group.
     * </p>
     *
     * @return <p>
     *         The root parent thing group.
     *         </p>
     */
    public java.util.List<GroupNameAndArn> getRootToParentThingGroups() {
        return rootToParentThingGroups;
    }

    /**
     * <p>
     * The root parent thing group.
     * </p>
     *
     * @param rootToParentThingGroups <p>
     *            The root parent thing group.
     *            </p>
     */
    public void setRootToParentThingGroups(
            java.util.Collection<GroupNameAndArn> rootToParentThingGroups) {
        if (rootToParentThingGroups == null) {
            this.rootToParentThingGroups = null;
            return;
        }

        this.rootToParentThingGroups = new java.util.ArrayList<GroupNameAndArn>(
                rootToParentThingGroups);
    }

    /**
     * <p>
     * The root parent thing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rootToParentThingGroups <p>
     *            The root parent thing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupMetadata withRootToParentThingGroups(
            GroupNameAndArn... rootToParentThingGroups) {
        if (getRootToParentThingGroups() == null) {
            this.rootToParentThingGroups = new java.util.ArrayList<GroupNameAndArn>(
                    rootToParentThingGroups.length);
        }
        for (GroupNameAndArn value : rootToParentThingGroups) {
            this.rootToParentThingGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The root parent thing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rootToParentThingGroups <p>
     *            The root parent thing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupMetadata withRootToParentThingGroups(
            java.util.Collection<GroupNameAndArn> rootToParentThingGroups) {
        setRootToParentThingGroups(rootToParentThingGroups);
        return this;
    }

    /**
     * <p>
     * The UNIX timestamp of when the thing group was created.
     * </p>
     *
     * @return <p>
     *         The UNIX timestamp of when the thing group was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the thing group was created.
     * </p>
     *
     * @param creationDate <p>
     *            The UNIX timestamp of when the thing group was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the thing group was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The UNIX timestamp of when the thing group was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupMetadata withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        if (getParentGroupName() != null)
            sb.append("parentGroupName: " + getParentGroupName() + ",");
        if (getRootToParentThingGroups() != null)
            sb.append("rootToParentThingGroups: " + getRootToParentThingGroups() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParentGroupName() == null) ? 0 : getParentGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getRootToParentThingGroups() == null) ? 0 : getRootToParentThingGroups()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingGroupMetadata == false)
            return false;
        ThingGroupMetadata other = (ThingGroupMetadata) obj;

        if (other.getParentGroupName() == null ^ this.getParentGroupName() == null)
            return false;
        if (other.getParentGroupName() != null
                && other.getParentGroupName().equals(this.getParentGroupName()) == false)
            return false;
        if (other.getRootToParentThingGroups() == null ^ this.getRootToParentThingGroups() == null)
            return false;
        if (other.getRootToParentThingGroups() != null
                && other.getRootToParentThingGroups().equals(this.getRootToParentThingGroups()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }
}
