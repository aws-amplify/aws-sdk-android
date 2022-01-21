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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class CreateQuickConnectResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the quick connect.
     * </p>
     */
    private String quickConnectARN;

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     */
    private String quickConnectId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the quick connect.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the quick connect.
     *         </p>
     */
    public String getQuickConnectARN() {
        return quickConnectARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the quick connect.
     * </p>
     *
     * @param quickConnectARN <p>
     *            The Amazon Resource Name (ARN) for the quick connect.
     *            </p>
     */
    public void setQuickConnectARN(String quickConnectARN) {
        this.quickConnectARN = quickConnectARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the quick connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectARN <p>
     *            The Amazon Resource Name (ARN) for the quick connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQuickConnectResult withQuickConnectARN(String quickConnectARN) {
        this.quickConnectARN = quickConnectARN;
        return this;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     *
     * @return <p>
     *         The identifier for the quick connect.
     *         </p>
     */
    public String getQuickConnectId() {
        return quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     *
     * @param quickConnectId <p>
     *            The identifier for the quick connect.
     *            </p>
     */
    public void setQuickConnectId(String quickConnectId) {
        this.quickConnectId = quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectId <p>
     *            The identifier for the quick connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQuickConnectResult withQuickConnectId(String quickConnectId) {
        this.quickConnectId = quickConnectId;
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
        if (getQuickConnectARN() != null)
            sb.append("QuickConnectARN: " + getQuickConnectARN() + ",");
        if (getQuickConnectId() != null)
            sb.append("QuickConnectId: " + getQuickConnectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQuickConnectARN() == null) ? 0 : getQuickConnectARN().hashCode());
        hashCode = prime * hashCode
                + ((getQuickConnectId() == null) ? 0 : getQuickConnectId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQuickConnectResult == false)
            return false;
        CreateQuickConnectResult other = (CreateQuickConnectResult) obj;

        if (other.getQuickConnectARN() == null ^ this.getQuickConnectARN() == null)
            return false;
        if (other.getQuickConnectARN() != null
                && other.getQuickConnectARN().equals(this.getQuickConnectARN()) == false)
            return false;
        if (other.getQuickConnectId() == null ^ this.getQuickConnectId() == null)
            return false;
        if (other.getQuickConnectId() != null
                && other.getQuickConnectId().equals(this.getQuickConnectId()) == false)
            return false;
        return true;
    }
}
