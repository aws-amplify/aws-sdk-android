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

public class ListThingGroupsForThingResult implements Serializable {
    /**
     * <p>
     * The thing groups.
     * </p>
     */
    private java.util.List<GroupNameAndArn> thingGroups;

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The thing groups.
     * </p>
     *
     * @return <p>
     *         The thing groups.
     *         </p>
     */
    public java.util.List<GroupNameAndArn> getThingGroups() {
        return thingGroups;
    }

    /**
     * <p>
     * The thing groups.
     * </p>
     *
     * @param thingGroups <p>
     *            The thing groups.
     *            </p>
     */
    public void setThingGroups(java.util.Collection<GroupNameAndArn> thingGroups) {
        if (thingGroups == null) {
            this.thingGroups = null;
            return;
        }

        this.thingGroups = new java.util.ArrayList<GroupNameAndArn>(thingGroups);
    }

    /**
     * <p>
     * The thing groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroups <p>
     *            The thing groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingGroupsForThingResult withThingGroups(GroupNameAndArn... thingGroups) {
        if (getThingGroups() == null) {
            this.thingGroups = new java.util.ArrayList<GroupNameAndArn>(thingGroups.length);
        }
        for (GroupNameAndArn value : thingGroups) {
            this.thingGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The thing groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroups <p>
     *            The thing groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingGroupsForThingResult withThingGroups(
            java.util.Collection<GroupNameAndArn> thingGroups) {
        setThingGroups(thingGroups);
        return this;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @return <p>
     *         The token used to get the next set of results, or <b>null</b> if
     *         there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            The token used to get the next set of results, or <b>null</b>
     *            if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token used to get the next set of results, or <b>null</b>
     *            if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingGroupsForThingResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getThingGroups() != null)
            sb.append("thingGroups: " + getThingGroups() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingGroups() == null) ? 0 : getThingGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThingGroupsForThingResult == false)
            return false;
        ListThingGroupsForThingResult other = (ListThingGroupsForThingResult) obj;

        if (other.getThingGroups() == null ^ this.getThingGroups() == null)
            return false;
        if (other.getThingGroups() != null
                && other.getThingGroups().equals(this.getThingGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
