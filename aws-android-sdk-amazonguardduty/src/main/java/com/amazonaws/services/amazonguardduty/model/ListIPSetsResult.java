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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

public class ListIPSetsResult implements Serializable {
    /**
     * <p>
     * The IDs of the IPSet resources.
     * </p>
     */
    private java.util.List<String> ipSetIds;

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of the IPSet resources.
     * </p>
     *
     * @return <p>
     *         The IDs of the IPSet resources.
     *         </p>
     */
    public java.util.List<String> getIpSetIds() {
        return ipSetIds;
    }

    /**
     * <p>
     * The IDs of the IPSet resources.
     * </p>
     *
     * @param ipSetIds <p>
     *            The IDs of the IPSet resources.
     *            </p>
     */
    public void setIpSetIds(java.util.Collection<String> ipSetIds) {
        if (ipSetIds == null) {
            this.ipSetIds = null;
            return;
        }

        this.ipSetIds = new java.util.ArrayList<String>(ipSetIds);
    }

    /**
     * <p>
     * The IDs of the IPSet resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipSetIds <p>
     *            The IDs of the IPSet resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIPSetsResult withIpSetIds(String... ipSetIds) {
        if (getIpSetIds() == null) {
            this.ipSetIds = new java.util.ArrayList<String>(ipSetIds.length);
        }
        for (String value : ipSetIds) {
            this.ipSetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the IPSet resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipSetIds <p>
     *            The IDs of the IPSet resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIPSetsResult withIpSetIds(java.util.Collection<String> ipSetIds) {
        setIpSetIds(ipSetIds);
        return this;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     *
     * @return <p>
     *         The pagination parameter to be used on the next list operation to
     *         retrieve more items.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination parameter to be used on the next list operation
     *            to retrieve more items.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination parameter to be used on the next list operation
     *            to retrieve more items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIPSetsResult withNextToken(String nextToken) {
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
        if (getIpSetIds() != null)
            sb.append("IpSetIds: " + getIpSetIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpSetIds() == null) ? 0 : getIpSetIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIPSetsResult == false)
            return false;
        ListIPSetsResult other = (ListIPSetsResult) obj;

        if (other.getIpSetIds() == null ^ this.getIpSetIds() == null)
            return false;
        if (other.getIpSetIds() != null && other.getIpSetIds().equals(this.getIpSetIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
