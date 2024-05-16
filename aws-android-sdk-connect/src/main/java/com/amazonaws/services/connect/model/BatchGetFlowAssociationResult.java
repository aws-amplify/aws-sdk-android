/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class BatchGetFlowAssociationResult implements Serializable {
    /**
     * <p>
     * Information about flow associations.
     * </p>
     */
    private java.util.List<FlowAssociationSummary> flowAssociationSummaryList;

    /**
     * <p>
     * Information about flow associations.
     * </p>
     *
     * @return <p>
     *         Information about flow associations.
     *         </p>
     */
    public java.util.List<FlowAssociationSummary> getFlowAssociationSummaryList() {
        return flowAssociationSummaryList;
    }

    /**
     * <p>
     * Information about flow associations.
     * </p>
     *
     * @param flowAssociationSummaryList <p>
     *            Information about flow associations.
     *            </p>
     */
    public void setFlowAssociationSummaryList(
            java.util.Collection<FlowAssociationSummary> flowAssociationSummaryList) {
        if (flowAssociationSummaryList == null) {
            this.flowAssociationSummaryList = null;
            return;
        }

        this.flowAssociationSummaryList = new java.util.ArrayList<FlowAssociationSummary>(
                flowAssociationSummaryList);
    }

    /**
     * <p>
     * Information about flow associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowAssociationSummaryList <p>
     *            Information about flow associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetFlowAssociationResult withFlowAssociationSummaryList(
            FlowAssociationSummary... flowAssociationSummaryList) {
        if (getFlowAssociationSummaryList() == null) {
            this.flowAssociationSummaryList = new java.util.ArrayList<FlowAssociationSummary>(
                    flowAssociationSummaryList.length);
        }
        for (FlowAssociationSummary value : flowAssociationSummaryList) {
            this.flowAssociationSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about flow associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowAssociationSummaryList <p>
     *            Information about flow associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetFlowAssociationResult withFlowAssociationSummaryList(
            java.util.Collection<FlowAssociationSummary> flowAssociationSummaryList) {
        setFlowAssociationSummaryList(flowAssociationSummaryList);
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
        if (getFlowAssociationSummaryList() != null)
            sb.append("FlowAssociationSummaryList: " + getFlowAssociationSummaryList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFlowAssociationSummaryList() == null) ? 0 : getFlowAssociationSummaryList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetFlowAssociationResult == false)
            return false;
        BatchGetFlowAssociationResult other = (BatchGetFlowAssociationResult) obj;

        if (other.getFlowAssociationSummaryList() == null
                ^ this.getFlowAssociationSummaryList() == null)
            return false;
        if (other.getFlowAssociationSummaryList() != null
                && other.getFlowAssociationSummaryList().equals(
                        this.getFlowAssociationSummaryList()) == false)
            return false;
        return true;
    }
}
