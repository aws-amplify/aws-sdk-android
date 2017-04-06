/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class CampaignLimits implements Serializable {
    /**
     * The maximum number of messages that the campaign can send daily.
     */
    private Integer daily;

    /**
     * The maximum total number of messages that the campaign can send.
     */
    private Integer total;

    /**
     * The maximum number of messages that the campaign can send daily.
     *
     * @return The maximum number of messages that the campaign can send daily.
     */
    public Integer getDaily() {
        return daily;
    }

    /**
     * The maximum number of messages that the campaign can send daily.
     *
     * @param daily The maximum number of messages that the campaign can send
     *            daily.
     */
    public void setDaily(Integer daily) {
        this.daily = daily;
    }

    /**
     * The maximum number of messages that the campaign can send daily.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param daily The maximum number of messages that the campaign can send
     *            daily.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignLimits withDaily(Integer daily) {
        this.daily = daily;
        return this;
    }

    /**
     * The maximum total number of messages that the campaign can send.
     *
     * @return The maximum total number of messages that the campaign can send.
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * The maximum total number of messages that the campaign can send.
     *
     * @param total The maximum total number of messages that the campaign can
     *            send.
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * The maximum total number of messages that the campaign can send.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total The maximum total number of messages that the campaign can
     *            send.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignLimits withTotal(Integer total) {
        this.total = total;
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
        if (getDaily() != null)
            sb.append("Daily: " + getDaily() + ",");
        if (getTotal() != null)
            sb.append("Total: " + getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDaily() == null) ? 0 : getDaily().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignLimits == false)
            return false;
        CampaignLimits other = (CampaignLimits) obj;

        if (other.getDaily() == null ^ this.getDaily() == null)
            return false;
        if (other.getDaily() != null && other.getDaily().equals(this.getDaily()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }
}
