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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the response to a
 * <code>GetHostedZoneCount</code> request.
 * </p>
 */
public class GetHostedZoneCountResult implements Serializable {
    /**
     * <p>
     * The total number of public and private hosted zones that are associated
     * with the current AWS account.
     * </p>
     */
    private Long hostedZoneCount;

    /**
     * <p>
     * The total number of public and private hosted zones that are associated
     * with the current AWS account.
     * </p>
     *
     * @return <p>
     *         The total number of public and private hosted zones that are
     *         associated with the current AWS account.
     *         </p>
     */
    public Long getHostedZoneCount() {
        return hostedZoneCount;
    }

    /**
     * <p>
     * The total number of public and private hosted zones that are associated
     * with the current AWS account.
     * </p>
     *
     * @param hostedZoneCount <p>
     *            The total number of public and private hosted zones that are
     *            associated with the current AWS account.
     *            </p>
     */
    public void setHostedZoneCount(Long hostedZoneCount) {
        this.hostedZoneCount = hostedZoneCount;
    }

    /**
     * <p>
     * The total number of public and private hosted zones that are associated
     * with the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZoneCount <p>
     *            The total number of public and private hosted zones that are
     *            associated with the current AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostedZoneCountResult withHostedZoneCount(Long hostedZoneCount) {
        this.hostedZoneCount = hostedZoneCount;
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
        if (getHostedZoneCount() != null)
            sb.append("HostedZoneCount: " + getHostedZoneCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHostedZoneCount() == null) ? 0 : getHostedZoneCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHostedZoneCountResult == false)
            return false;
        GetHostedZoneCountResult other = (GetHostedZoneCountResult) obj;

        if (other.getHostedZoneCount() == null ^ this.getHostedZoneCount() == null)
            return false;
        if (other.getHostedZoneCount() != null
                && other.getHostedZoneCount().equals(this.getHostedZoneCount()) == false)
            return false;
        return true;
    }
}
