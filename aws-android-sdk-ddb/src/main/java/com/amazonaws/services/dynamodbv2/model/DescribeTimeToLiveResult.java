/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

public class DescribeTimeToLiveResult implements Serializable {
    /**
     * <p/>
     */
    private TimeToLiveDescription timeToLiveDescription;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public TimeToLiveDescription getTimeToLiveDescription() {
        return timeToLiveDescription;
    }

    /**
     * <p/>
     *
     * @param timeToLiveDescription <p/>
     */
    public void setTimeToLiveDescription(TimeToLiveDescription timeToLiveDescription) {
        this.timeToLiveDescription = timeToLiveDescription;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeToLiveDescription <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTimeToLiveResult withTimeToLiveDescription(
            TimeToLiveDescription timeToLiveDescription) {
        this.timeToLiveDescription = timeToLiveDescription;
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
        if (getTimeToLiveDescription() != null)
            sb.append("TimeToLiveDescription: " + getTimeToLiveDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTimeToLiveDescription() == null) ? 0 : getTimeToLiveDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTimeToLiveResult == false)
            return false;
        DescribeTimeToLiveResult other = (DescribeTimeToLiveResult) obj;

        if (other.getTimeToLiveDescription() == null ^ this.getTimeToLiveDescription() == null)
            return false;
        if (other.getTimeToLiveDescription() != null
                && other.getTimeToLiveDescription().equals(this.getTimeToLiveDescription()) == false)
            return false;
        return true;
    }
}
