/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Summary information about a traffic distribution group user.
 * </p>
 */
public class TrafficDistributionGroupUserSummary implements Serializable {
    /**
     * <p>
     * The identifier for the user. This can be the ID or the ARN of the user.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The identifier for the user. This can be the ID or the ARN of the user.
     * </p>
     *
     * @return <p>
     *         The identifier for the user. This can be the ID or the ARN of the
     *         user.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The identifier for the user. This can be the ID or the ARN of the user.
     * </p>
     *
     * @param userId <p>
     *            The identifier for the user. This can be the ID or the ARN of
     *            the user.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for the user. This can be the ID or the ARN of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userId <p>
     *            The identifier for the user. This can be the ID or the ARN of
     *            the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficDistributionGroupUserSummary withUserId(String userId) {
        this.userId = userId;
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
        if (getUserId() != null)
            sb.append("UserId: " + getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficDistributionGroupUserSummary == false)
            return false;
        TrafficDistributionGroupUserSummary other = (TrafficDistributionGroupUserSummary) obj;

        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }
}
