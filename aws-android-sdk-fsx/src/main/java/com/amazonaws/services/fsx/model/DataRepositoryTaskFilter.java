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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * (Optional) An array of filter objects you can use to filter the response of
 * data repository tasks you will see in the the response. You can filter the
 * tasks returned in the response by one or more file system IDs, task
 * lifecycles, and by task type. A filter object consists of a filter
 * <code>Name</code>, and one or more <code>Values</code> for the filter.
 * </p>
 */
public class DataRepositoryTaskFilter implements Serializable {
    /**
     * <p>
     * Name of the task property to use in filtering the tasks returned in the
     * response.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>file-system-id</code> to retrieve data repository tasks for
     * specific file systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>task-lifecycle</code> to retrieve data repository tasks with
     * one or more specific lifecycle states, as follows: CANCELED, EXECUTING,
     * FAILED, PENDING, and SUCCEEDED.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>file-system-id, task-lifecycle
     */
    private String name;

    /**
     * <p>
     * Use Values to include the specific file system IDs and task lifecycle
     * states for the filters you are using.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * Name of the task property to use in filtering the tasks returned in the
     * response.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>file-system-id</code> to retrieve data repository tasks for
     * specific file systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>task-lifecycle</code> to retrieve data repository tasks with
     * one or more specific lifecycle states, as follows: CANCELED, EXECUTING,
     * FAILED, PENDING, and SUCCEEDED.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>file-system-id, task-lifecycle
     *
     * @return <p>
     *         Name of the task property to use in filtering the tasks returned
     *         in the response.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Use <code>file-system-id</code> to retrieve data repository tasks
     *         for specific file systems.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use <code>task-lifecycle</code> to retrieve data repository tasks
     *         with one or more specific lifecycle states, as follows: CANCELED,
     *         EXECUTING, FAILED, PENDING, and SUCCEEDED.
     *         </p>
     *         </li>
     *         </ul>
     * @see DataRepositoryTaskFilterName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the task property to use in filtering the tasks returned in the
     * response.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>file-system-id</code> to retrieve data repository tasks for
     * specific file systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>task-lifecycle</code> to retrieve data repository tasks with
     * one or more specific lifecycle states, as follows: CANCELED, EXECUTING,
     * FAILED, PENDING, and SUCCEEDED.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>file-system-id, task-lifecycle
     *
     * @param name <p>
     *            Name of the task property to use in filtering the tasks
     *            returned in the response.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Use <code>file-system-id</code> to retrieve data repository
     *            tasks for specific file systems.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use <code>task-lifecycle</code> to retrieve data repository
     *            tasks with one or more specific lifecycle states, as follows:
     *            CANCELED, EXECUTING, FAILED, PENDING, and SUCCEEDED.
     *            </p>
     *            </li>
     *            </ul>
     * @see DataRepositoryTaskFilterName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the task property to use in filtering the tasks returned in the
     * response.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>file-system-id</code> to retrieve data repository tasks for
     * specific file systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>task-lifecycle</code> to retrieve data repository tasks with
     * one or more specific lifecycle states, as follows: CANCELED, EXECUTING,
     * FAILED, PENDING, and SUCCEEDED.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>file-system-id, task-lifecycle
     *
     * @param name <p>
     *            Name of the task property to use in filtering the tasks
     *            returned in the response.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Use <code>file-system-id</code> to retrieve data repository
     *            tasks for specific file systems.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use <code>task-lifecycle</code> to retrieve data repository
     *            tasks with one or more specific lifecycle states, as follows:
     *            CANCELED, EXECUTING, FAILED, PENDING, and SUCCEEDED.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataRepositoryTaskFilterName
     */
    public DataRepositoryTaskFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Name of the task property to use in filtering the tasks returned in the
     * response.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>file-system-id</code> to retrieve data repository tasks for
     * specific file systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>task-lifecycle</code> to retrieve data repository tasks with
     * one or more specific lifecycle states, as follows: CANCELED, EXECUTING,
     * FAILED, PENDING, and SUCCEEDED.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>file-system-id, task-lifecycle
     *
     * @param name <p>
     *            Name of the task property to use in filtering the tasks
     *            returned in the response.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Use <code>file-system-id</code> to retrieve data repository
     *            tasks for specific file systems.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use <code>task-lifecycle</code> to retrieve data repository
     *            tasks with one or more specific lifecycle states, as follows:
     *            CANCELED, EXECUTING, FAILED, PENDING, and SUCCEEDED.
     *            </p>
     *            </li>
     *            </ul>
     * @see DataRepositoryTaskFilterName
     */
    public void setName(DataRepositoryTaskFilterName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * Name of the task property to use in filtering the tasks returned in the
     * response.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>file-system-id</code> to retrieve data repository tasks for
     * specific file systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>task-lifecycle</code> to retrieve data repository tasks with
     * one or more specific lifecycle states, as follows: CANCELED, EXECUTING,
     * FAILED, PENDING, and SUCCEEDED.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>file-system-id, task-lifecycle
     *
     * @param name <p>
     *            Name of the task property to use in filtering the tasks
     *            returned in the response.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Use <code>file-system-id</code> to retrieve data repository
     *            tasks for specific file systems.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use <code>task-lifecycle</code> to retrieve data repository
     *            tasks with one or more specific lifecycle states, as follows:
     *            CANCELED, EXECUTING, FAILED, PENDING, and SUCCEEDED.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataRepositoryTaskFilterName
     */
    public DataRepositoryTaskFilter withName(DataRepositoryTaskFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Use Values to include the specific file system IDs and task lifecycle
     * states for the filters you are using.
     * </p>
     *
     * @return <p>
     *         Use Values to include the specific file system IDs and task
     *         lifecycle states for the filters you are using.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * Use Values to include the specific file system IDs and task lifecycle
     * states for the filters you are using.
     * </p>
     *
     * @param values <p>
     *            Use Values to include the specific file system IDs and task
     *            lifecycle states for the filters you are using.
     *            </p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * Use Values to include the specific file system IDs and task lifecycle
     * states for the filters you are using.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            Use Values to include the specific file system IDs and task
     *            lifecycle states for the filters you are using.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTaskFilter withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Use Values to include the specific file system IDs and task lifecycle
     * states for the filters you are using.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            Use Values to include the specific file system IDs and task
     *            lifecycle states for the filters you are using.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTaskFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataRepositoryTaskFilter == false)
            return false;
        DataRepositoryTaskFilter other = (DataRepositoryTaskFilter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
