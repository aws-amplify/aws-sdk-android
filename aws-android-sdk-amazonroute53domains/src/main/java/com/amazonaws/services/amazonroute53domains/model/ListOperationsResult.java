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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The ListOperations response includes the following elements.
 * </p>
 */
public class ListOperationsResult implements Serializable {
    /**
     * <p>
     * Lists summaries of the operations.
     * </p>
     */
    private java.util.List<OperationSummary> operations;

    /**
     * <p>
     * If there are more operations than you specified for <code>MaxItems</code>
     * in the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String nextPageMarker;

    /**
     * <p>
     * Lists summaries of the operations.
     * </p>
     *
     * @return <p>
     *         Lists summaries of the operations.
     *         </p>
     */
    public java.util.List<OperationSummary> getOperations() {
        return operations;
    }

    /**
     * <p>
     * Lists summaries of the operations.
     * </p>
     *
     * @param operations <p>
     *            Lists summaries of the operations.
     *            </p>
     */
    public void setOperations(java.util.Collection<OperationSummary> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<OperationSummary>(operations);
    }

    /**
     * <p>
     * Lists summaries of the operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operations <p>
     *            Lists summaries of the operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOperationsResult withOperations(OperationSummary... operations) {
        if (getOperations() == null) {
            this.operations = new java.util.ArrayList<OperationSummary>(operations.length);
        }
        for (OperationSummary value : operations) {
            this.operations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Lists summaries of the operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operations <p>
     *            Lists summaries of the operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOperationsResult withOperations(java.util.Collection<OperationSummary> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * If there are more operations than you specified for <code>MaxItems</code>
     * in the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         If there are more operations than you specified for
     *         <code>MaxItems</code> in the request, submit another request and
     *         include the value of <code>NextPageMarker</code> in the value of
     *         <code>Marker</code>.
     *         </p>
     */
    public String getNextPageMarker() {
        return nextPageMarker;
    }

    /**
     * <p>
     * If there are more operations than you specified for <code>MaxItems</code>
     * in the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextPageMarker <p>
     *            If there are more operations than you specified for
     *            <code>MaxItems</code> in the request, submit another request
     *            and include the value of <code>NextPageMarker</code> in the
     *            value of <code>Marker</code>.
     *            </p>
     */
    public void setNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
    }

    /**
     * <p>
     * If there are more operations than you specified for <code>MaxItems</code>
     * in the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextPageMarker <p>
     *            If there are more operations than you specified for
     *            <code>MaxItems</code> in the request, submit another request
     *            and include the value of <code>NextPageMarker</code> in the
     *            value of <code>Marker</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOperationsResult withNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
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
        if (getOperations() != null)
            sb.append("Operations: " + getOperations() + ",");
        if (getNextPageMarker() != null)
            sb.append("NextPageMarker: " + getNextPageMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageMarker() == null) ? 0 : getNextPageMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOperationsResult == false)
            return false;
        ListOperationsResult other = (ListOperationsResult) obj;

        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null
                && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getNextPageMarker() == null ^ this.getNextPageMarker() == null)
            return false;
        if (other.getNextPageMarker() != null
                && other.getNextPageMarker().equals(this.getNextPageMarker()) == false)
            return false;
        return true;
    }
}
