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

public class CreateDataRepositoryTaskResult implements Serializable {
    /**
     * <p>
     * The description of the data repository task that you just created.
     * </p>
     */
    private DataRepositoryTask dataRepositoryTask;

    /**
     * <p>
     * The description of the data repository task that you just created.
     * </p>
     *
     * @return <p>
     *         The description of the data repository task that you just
     *         created.
     *         </p>
     */
    public DataRepositoryTask getDataRepositoryTask() {
        return dataRepositoryTask;
    }

    /**
     * <p>
     * The description of the data repository task that you just created.
     * </p>
     *
     * @param dataRepositoryTask <p>
     *            The description of the data repository task that you just
     *            created.
     *            </p>
     */
    public void setDataRepositoryTask(DataRepositoryTask dataRepositoryTask) {
        this.dataRepositoryTask = dataRepositoryTask;
    }

    /**
     * <p>
     * The description of the data repository task that you just created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataRepositoryTask <p>
     *            The description of the data repository task that you just
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataRepositoryTaskResult withDataRepositoryTask(
            DataRepositoryTask dataRepositoryTask) {
        this.dataRepositoryTask = dataRepositoryTask;
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
        if (getDataRepositoryTask() != null)
            sb.append("DataRepositoryTask: " + getDataRepositoryTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataRepositoryTask() == null) ? 0 : getDataRepositoryTask().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataRepositoryTaskResult == false)
            return false;
        CreateDataRepositoryTaskResult other = (CreateDataRepositoryTaskResult) obj;

        if (other.getDataRepositoryTask() == null ^ this.getDataRepositoryTask() == null)
            return false;
        if (other.getDataRepositoryTask() != null
                && other.getDataRepositoryTask().equals(this.getDataRepositoryTask()) == false)
            return false;
        return true;
    }
}
