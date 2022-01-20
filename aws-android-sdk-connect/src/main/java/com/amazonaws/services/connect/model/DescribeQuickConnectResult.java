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

public class DescribeQuickConnectResult implements Serializable {
    /**
     * <p>
     * Information about the quick connect.
     * </p>
     */
    private QuickConnect quickConnect;

    /**
     * <p>
     * Information about the quick connect.
     * </p>
     *
     * @return <p>
     *         Information about the quick connect.
     *         </p>
     */
    public QuickConnect getQuickConnect() {
        return quickConnect;
    }

    /**
     * <p>
     * Information about the quick connect.
     * </p>
     *
     * @param quickConnect <p>
     *            Information about the quick connect.
     *            </p>
     */
    public void setQuickConnect(QuickConnect quickConnect) {
        this.quickConnect = quickConnect;
    }

    /**
     * <p>
     * Information about the quick connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnect <p>
     *            Information about the quick connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeQuickConnectResult withQuickConnect(QuickConnect quickConnect) {
        this.quickConnect = quickConnect;
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
        if (getQuickConnect() != null)
            sb.append("QuickConnect: " + getQuickConnect());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQuickConnect() == null) ? 0 : getQuickConnect().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeQuickConnectResult == false)
            return false;
        DescribeQuickConnectResult other = (DescribeQuickConnectResult) obj;

        if (other.getQuickConnect() == null ^ this.getQuickConnect() == null)
            return false;
        if (other.getQuickConnect() != null
                && other.getQuickConnect().equals(this.getQuickConnect()) == false)
            return false;
        return true;
    }
}
