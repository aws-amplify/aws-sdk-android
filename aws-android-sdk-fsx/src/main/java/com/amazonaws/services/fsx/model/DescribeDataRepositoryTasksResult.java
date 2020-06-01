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

public class DescribeDataRepositoryTasksResult implements Serializable {
    /**
     * <p>
     * The collection of data repository task descriptions returned.
     * </p>
     */
    private java.util.List<DataRepositoryTask> dataRepositoryTasks;

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous operation
     * (String). If present, this token indicates from what point you can
     * continue processing the request, where the previous
     * <code>NextToken</code> value left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The collection of data repository task descriptions returned.
     * </p>
     *
     * @return <p>
     *         The collection of data repository task descriptions returned.
     *         </p>
     */
    public java.util.List<DataRepositoryTask> getDataRepositoryTasks() {
        return dataRepositoryTasks;
    }

    /**
     * <p>
     * The collection of data repository task descriptions returned.
     * </p>
     *
     * @param dataRepositoryTasks <p>
     *            The collection of data repository task descriptions returned.
     *            </p>
     */
    public void setDataRepositoryTasks(java.util.Collection<DataRepositoryTask> dataRepositoryTasks) {
        if (dataRepositoryTasks == null) {
            this.dataRepositoryTasks = null;
            return;
        }

        this.dataRepositoryTasks = new java.util.ArrayList<DataRepositoryTask>(dataRepositoryTasks);
    }

    /**
     * <p>
     * The collection of data repository task descriptions returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataRepositoryTasks <p>
     *            The collection of data repository task descriptions returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataRepositoryTasksResult withDataRepositoryTasks(
            DataRepositoryTask... dataRepositoryTasks) {
        if (getDataRepositoryTasks() == null) {
            this.dataRepositoryTasks = new java.util.ArrayList<DataRepositoryTask>(
                    dataRepositoryTasks.length);
        }
        for (DataRepositoryTask value : dataRepositoryTasks) {
            this.dataRepositoryTasks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The collection of data repository task descriptions returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataRepositoryTasks <p>
     *            The collection of data repository task descriptions returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataRepositoryTasksResult withDataRepositoryTasks(
            java.util.Collection<DataRepositoryTask> dataRepositoryTasks) {
        setDataRepositoryTasks(dataRepositoryTasks);
        return this;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous operation
     * (String). If present, this token indicates from what point you can
     * continue processing the request, where the previous
     * <code>NextToken</code> value left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @return <p>
     *         (Optional) Opaque pagination token returned from a previous
     *         operation (String). If present, this token indicates from what
     *         point you can continue processing the request, where the previous
     *         <code>NextToken</code> value left off.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous operation
     * (String). If present, this token indicates from what point you can
     * continue processing the request, where the previous
     * <code>NextToken</code> value left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @param nextToken <p>
     *            (Optional) Opaque pagination token returned from a previous
     *            operation (String). If present, this token indicates from what
     *            point you can continue processing the request, where the
     *            previous <code>NextToken</code> value left off.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous operation
     * (String). If present, this token indicates from what point you can
     * continue processing the request, where the previous
     * <code>NextToken</code> value left off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @param nextToken <p>
     *            (Optional) Opaque pagination token returned from a previous
     *            operation (String). If present, this token indicates from what
     *            point you can continue processing the request, where the
     *            previous <code>NextToken</code> value left off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataRepositoryTasksResult withNextToken(String nextToken) {
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
        if (getDataRepositoryTasks() != null)
            sb.append("DataRepositoryTasks: " + getDataRepositoryTasks() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataRepositoryTasks() == null) ? 0 : getDataRepositoryTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDataRepositoryTasksResult == false)
            return false;
        DescribeDataRepositoryTasksResult other = (DescribeDataRepositoryTasksResult) obj;

        if (other.getDataRepositoryTasks() == null ^ this.getDataRepositoryTasks() == null)
            return false;
        if (other.getDataRepositoryTasks() != null
                && other.getDataRepositoryTasks().equals(this.getDataRepositoryTasks()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
