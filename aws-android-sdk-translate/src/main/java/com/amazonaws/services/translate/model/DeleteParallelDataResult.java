/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

public class DeleteParallelDataResult implements Serializable {
    /**
     * <p>
     * The name of the parallel data resource that is being deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * The status of the parallel data deletion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     */
    private String status;

    /**
     * <p>
     * The name of the parallel data resource that is being deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @return <p>
     *         The name of the parallel data resource that is being deleted.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the parallel data resource that is being deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the parallel data resource that is being deleted.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parallel data resource that is being deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the parallel data resource that is being deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteParallelDataResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The status of the parallel data deletion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @return <p>
     *         The status of the parallel data deletion.
     *         </p>
     * @see ParallelDataStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the parallel data deletion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data deletion.
     *            </p>
     * @see ParallelDataStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the parallel data deletion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data deletion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataStatus
     */
    public DeleteParallelDataResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the parallel data deletion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data deletion.
     *            </p>
     * @see ParallelDataStatus
     */
    public void setStatus(ParallelDataStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the parallel data deletion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data deletion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataStatus
     */
    public DeleteParallelDataResult withStatus(ParallelDataStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteParallelDataResult == false)
            return false;
        DeleteParallelDataResult other = (DeleteParallelDataResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
