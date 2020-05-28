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

package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;

/**
 * <p>
 * A filter object, used to optionally filter results from calls to the
 * <code>ListEntities</code> and <code>ListChangeSets</code> actions.
 * </p>
 */
public class Filter implements Serializable {
    /**
     * <p>
     * For <code>ListEntities</code>, the supported value for this is an
     * <code>EntityId</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, the supported values are as follows:
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     */
    private String name;

    /**
     * <p>
     * <code>ListEntities</code> - This is a list of unique
     * <code>EntityId</code>s.
     * </p>
     * <p>
     * <code>ListChangeSets</code> - The supported filter names and associated
     * <code>ValueList</code>s is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChangeSetName</code> - The supported <code>ValueList</code> is a
     * list of non-unique <code>ChangeSetName</code>s. These are defined when
     * you call the <code>StartChangeSet</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> - The supported <code>ValueList</code> is a list of
     * statuses for all change set requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntityId</code> - The supported <code>ValueList</code> is a list of
     * unique <code>EntityId</code>s.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that started before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterStartTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that started after the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that ended before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that ended after the filter value.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> valueList;

    /**
     * <p>
     * For <code>ListEntities</code>, the supported value for this is an
     * <code>EntityId</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, the supported values are as follows:
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @return <p>
     *         For <code>ListEntities</code>, the supported value for this is an
     *         <code>EntityId</code>.
     *         </p>
     *         <p>
     *         For <code>ListChangeSets</code>, the supported values are as
     *         follows:
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * For <code>ListEntities</code>, the supported value for this is an
     * <code>EntityId</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, the supported values are as follows:
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param name <p>
     *            For <code>ListEntities</code>, the supported value for this is
     *            an <code>EntityId</code>.
     *            </p>
     *            <p>
     *            For <code>ListChangeSets</code>, the supported values are as
     *            follows:
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * For <code>ListEntities</code>, the supported value for this is an
     * <code>EntityId</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, the supported values are as follows:
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param name <p>
     *            For <code>ListEntities</code>, the supported value for this is
     *            an <code>EntityId</code>.
     *            </p>
     *            <p>
     *            For <code>ListChangeSets</code>, the supported values are as
     *            follows:
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * <code>ListEntities</code> - This is a list of unique
     * <code>EntityId</code>s.
     * </p>
     * <p>
     * <code>ListChangeSets</code> - The supported filter names and associated
     * <code>ValueList</code>s is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChangeSetName</code> - The supported <code>ValueList</code> is a
     * list of non-unique <code>ChangeSetName</code>s. These are defined when
     * you call the <code>StartChangeSet</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> - The supported <code>ValueList</code> is a list of
     * statuses for all change set requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntityId</code> - The supported <code>ValueList</code> is a list of
     * unique <code>EntityId</code>s.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that started before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterStartTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that started after the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that ended before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that ended after the filter value.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         <code>ListEntities</code> - This is a list of unique
     *         <code>EntityId</code>s.
     *         </p>
     *         <p>
     *         <code>ListChangeSets</code> - The supported filter names and
     *         associated <code>ValueList</code>s is as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ChangeSetName</code> - The supported <code>ValueList</code>
     *         is a list of non-unique <code>ChangeSetName</code>s. These are
     *         defined when you call the <code>StartChangeSet</code> action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Status</code> - The supported <code>ValueList</code> is a
     *         list of statuses for all change set requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EntityId</code> - The supported <code>ValueList</code> is a
     *         list of unique <code>EntityId</code>s.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BeforeStartTime</code> - The supported
     *         <code>ValueList</code> is a list of all change sets that started
     *         before the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AfterStartTime</code> - The supported
     *         <code>ValueList</code> is a list of all change sets that started
     *         after the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BeforeEndTime</code> - The supported <code>ValueList</code>
     *         is a list of all change sets that ended before the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AfterEndTime</code> - The supported <code>ValueList</code>
     *         is a list of all change sets that ended after the filter value.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getValueList() {
        return valueList;
    }

    /**
     * <p>
     * <code>ListEntities</code> - This is a list of unique
     * <code>EntityId</code>s.
     * </p>
     * <p>
     * <code>ListChangeSets</code> - The supported filter names and associated
     * <code>ValueList</code>s is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChangeSetName</code> - The supported <code>ValueList</code> is a
     * list of non-unique <code>ChangeSetName</code>s. These are defined when
     * you call the <code>StartChangeSet</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> - The supported <code>ValueList</code> is a list of
     * statuses for all change set requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntityId</code> - The supported <code>ValueList</code> is a list of
     * unique <code>EntityId</code>s.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that started before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterStartTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that started after the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that ended before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that ended after the filter value.
     * </p>
     * </li>
     * </ul>
     *
     * @param valueList <p>
     *            <code>ListEntities</code> - This is a list of unique
     *            <code>EntityId</code>s.
     *            </p>
     *            <p>
     *            <code>ListChangeSets</code> - The supported filter names and
     *            associated <code>ValueList</code>s is as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ChangeSetName</code> - The supported
     *            <code>ValueList</code> is a list of non-unique
     *            <code>ChangeSetName</code>s. These are defined when you call
     *            the <code>StartChangeSet</code> action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Status</code> - The supported <code>ValueList</code> is
     *            a list of statuses for all change set requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EntityId</code> - The supported <code>ValueList</code>
     *            is a list of unique <code>EntityId</code>s.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BeforeStartTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that
     *            started before the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AfterStartTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that
     *            started after the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BeforeEndTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that ended
     *            before the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AfterEndTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that ended
     *            after the filter value.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setValueList(java.util.Collection<String> valueList) {
        if (valueList == null) {
            this.valueList = null;
            return;
        }

        this.valueList = new java.util.ArrayList<String>(valueList);
    }

    /**
     * <p>
     * <code>ListEntities</code> - This is a list of unique
     * <code>EntityId</code>s.
     * </p>
     * <p>
     * <code>ListChangeSets</code> - The supported filter names and associated
     * <code>ValueList</code>s is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChangeSetName</code> - The supported <code>ValueList</code> is a
     * list of non-unique <code>ChangeSetName</code>s. These are defined when
     * you call the <code>StartChangeSet</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> - The supported <code>ValueList</code> is a list of
     * statuses for all change set requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntityId</code> - The supported <code>ValueList</code> is a list of
     * unique <code>EntityId</code>s.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that started before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterStartTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that started after the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that ended before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that ended after the filter value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valueList <p>
     *            <code>ListEntities</code> - This is a list of unique
     *            <code>EntityId</code>s.
     *            </p>
     *            <p>
     *            <code>ListChangeSets</code> - The supported filter names and
     *            associated <code>ValueList</code>s is as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ChangeSetName</code> - The supported
     *            <code>ValueList</code> is a list of non-unique
     *            <code>ChangeSetName</code>s. These are defined when you call
     *            the <code>StartChangeSet</code> action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Status</code> - The supported <code>ValueList</code> is
     *            a list of statuses for all change set requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EntityId</code> - The supported <code>ValueList</code>
     *            is a list of unique <code>EntityId</code>s.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BeforeStartTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that
     *            started before the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AfterStartTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that
     *            started after the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BeforeEndTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that ended
     *            before the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AfterEndTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that ended
     *            after the filter value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withValueList(String... valueList) {
        if (getValueList() == null) {
            this.valueList = new java.util.ArrayList<String>(valueList.length);
        }
        for (String value : valueList) {
            this.valueList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * <code>ListEntities</code> - This is a list of unique
     * <code>EntityId</code>s.
     * </p>
     * <p>
     * <code>ListChangeSets</code> - The supported filter names and associated
     * <code>ValueList</code>s is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChangeSetName</code> - The supported <code>ValueList</code> is a
     * list of non-unique <code>ChangeSetName</code>s. These are defined when
     * you call the <code>StartChangeSet</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> - The supported <code>ValueList</code> is a list of
     * statuses for all change set requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntityId</code> - The supported <code>ValueList</code> is a list of
     * unique <code>EntityId</code>s.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that started before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterStartTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that started after the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that ended before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> - The supported <code>ValueList</code> is a
     * list of all change sets that ended after the filter value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valueList <p>
     *            <code>ListEntities</code> - This is a list of unique
     *            <code>EntityId</code>s.
     *            </p>
     *            <p>
     *            <code>ListChangeSets</code> - The supported filter names and
     *            associated <code>ValueList</code>s is as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ChangeSetName</code> - The supported
     *            <code>ValueList</code> is a list of non-unique
     *            <code>ChangeSetName</code>s. These are defined when you call
     *            the <code>StartChangeSet</code> action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Status</code> - The supported <code>ValueList</code> is
     *            a list of statuses for all change set requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EntityId</code> - The supported <code>ValueList</code>
     *            is a list of unique <code>EntityId</code>s.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BeforeStartTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that
     *            started before the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AfterStartTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that
     *            started after the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BeforeEndTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that ended
     *            before the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AfterEndTime</code> - The supported
     *            <code>ValueList</code> is a list of all change sets that ended
     *            after the filter value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withValueList(java.util.Collection<String> valueList) {
        setValueList(valueList);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValueList() != null)
            sb.append("ValueList: " + getValueList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValueList() == null) ? 0 : getValueList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValueList() == null ^ this.getValueList() == null)
            return false;
        if (other.getValueList() != null
                && other.getValueList().equals(this.getValueList()) == false)
            return false;
        return true;
    }
}
