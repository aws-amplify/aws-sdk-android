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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class CreateFlowLogsResult implements Serializable {
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The IDs of the flow logs.
     * </p>
     */
    private java.util.List<String> flowLogIds;

    /**
     * <p>
     * Information about the flow logs that could not be created successfully.
     * </p>
     */
    private java.util.List<UnsuccessfulItem> unsuccessful;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsResult withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The IDs of the flow logs.
     * </p>
     *
     * @return <p>
     *         The IDs of the flow logs.
     *         </p>
     */
    public java.util.List<String> getFlowLogIds() {
        return flowLogIds;
    }

    /**
     * <p>
     * The IDs of the flow logs.
     * </p>
     *
     * @param flowLogIds <p>
     *            The IDs of the flow logs.
     *            </p>
     */
    public void setFlowLogIds(java.util.Collection<String> flowLogIds) {
        if (flowLogIds == null) {
            this.flowLogIds = null;
            return;
        }

        this.flowLogIds = new java.util.ArrayList<String>(flowLogIds);
    }

    /**
     * <p>
     * The IDs of the flow logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowLogIds <p>
     *            The IDs of the flow logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsResult withFlowLogIds(String... flowLogIds) {
        if (getFlowLogIds() == null) {
            this.flowLogIds = new java.util.ArrayList<String>(flowLogIds.length);
        }
        for (String value : flowLogIds) {
            this.flowLogIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the flow logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowLogIds <p>
     *            The IDs of the flow logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsResult withFlowLogIds(java.util.Collection<String> flowLogIds) {
        setFlowLogIds(flowLogIds);
        return this;
    }

    /**
     * <p>
     * Information about the flow logs that could not be created successfully.
     * </p>
     *
     * @return <p>
     *         Information about the flow logs that could not be created
     *         successfully.
     *         </p>
     */
    public java.util.List<UnsuccessfulItem> getUnsuccessful() {
        return unsuccessful;
    }

    /**
     * <p>
     * Information about the flow logs that could not be created successfully.
     * </p>
     *
     * @param unsuccessful <p>
     *            Information about the flow logs that could not be created
     *            successfully.
     *            </p>
     */
    public void setUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }

        this.unsuccessful = new java.util.ArrayList<UnsuccessfulItem>(unsuccessful);
    }

    /**
     * <p>
     * Information about the flow logs that could not be created successfully.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessful <p>
     *            Information about the flow logs that could not be created
     *            successfully.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsResult withUnsuccessful(UnsuccessfulItem... unsuccessful) {
        if (getUnsuccessful() == null) {
            this.unsuccessful = new java.util.ArrayList<UnsuccessfulItem>(unsuccessful.length);
        }
        for (UnsuccessfulItem value : unsuccessful) {
            this.unsuccessful.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the flow logs that could not be created successfully.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessful <p>
     *            Information about the flow logs that could not be created
     *            successfully.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsResult withUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        setUnsuccessful(unsuccessful);
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getFlowLogIds() != null)
            sb.append("FlowLogIds: " + getFlowLogIds() + ",");
        if (getUnsuccessful() != null)
            sb.append("Unsuccessful: " + getUnsuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFlowLogIds() == null) ? 0 : getFlowLogIds().hashCode());
        hashCode = prime * hashCode
                + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFlowLogsResult == false)
            return false;
        CreateFlowLogsResult other = (CreateFlowLogsResult) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFlowLogIds() == null ^ this.getFlowLogIds() == null)
            return false;
        if (other.getFlowLogIds() != null
                && other.getFlowLogIds().equals(this.getFlowLogIds()) == false)
            return false;
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null)
            return false;
        if (other.getUnsuccessful() != null
                && other.getUnsuccessful().equals(this.getUnsuccessful()) == false)
            return false;
        return true;
    }
}
