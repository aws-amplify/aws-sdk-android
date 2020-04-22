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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeEventCategoriesResult implements Serializable {
    /**
     * <p>
     * A list of event categories descriptions.
     * </p>
     */
    private java.util.List<EventCategoriesMap> eventCategoriesMapList;

    /**
     * <p>
     * A list of event categories descriptions.
     * </p>
     *
     * @return <p>
     *         A list of event categories descriptions.
     *         </p>
     */
    public java.util.List<EventCategoriesMap> getEventCategoriesMapList() {
        return eventCategoriesMapList;
    }

    /**
     * <p>
     * A list of event categories descriptions.
     * </p>
     *
     * @param eventCategoriesMapList <p>
     *            A list of event categories descriptions.
     *            </p>
     */
    public void setEventCategoriesMapList(
            java.util.Collection<EventCategoriesMap> eventCategoriesMapList) {
        if (eventCategoriesMapList == null) {
            this.eventCategoriesMapList = null;
            return;
        }

        this.eventCategoriesMapList = new java.util.ArrayList<EventCategoriesMap>(
                eventCategoriesMapList);
    }

    /**
     * <p>
     * A list of event categories descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategoriesMapList <p>
     *            A list of event categories descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventCategoriesResult withEventCategoriesMapList(
            EventCategoriesMap... eventCategoriesMapList) {
        if (getEventCategoriesMapList() == null) {
            this.eventCategoriesMapList = new java.util.ArrayList<EventCategoriesMap>(
                    eventCategoriesMapList.length);
        }
        for (EventCategoriesMap value : eventCategoriesMapList) {
            this.eventCategoriesMapList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event categories descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategoriesMapList <p>
     *            A list of event categories descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventCategoriesResult withEventCategoriesMapList(
            java.util.Collection<EventCategoriesMap> eventCategoriesMapList) {
        setEventCategoriesMapList(eventCategoriesMapList);
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
        if (getEventCategoriesMapList() != null)
            sb.append("EventCategoriesMapList: " + getEventCategoriesMapList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEventCategoriesMapList() == null) ? 0 : getEventCategoriesMapList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventCategoriesResult == false)
            return false;
        DescribeEventCategoriesResult other = (DescribeEventCategoriesResult) obj;

        if (other.getEventCategoriesMapList() == null ^ this.getEventCategoriesMapList() == null)
            return false;
        if (other.getEventCategoriesMapList() != null
                && other.getEventCategoriesMapList().equals(this.getEventCategoriesMapList()) == false)
            return false;
        return true;
    }
}
