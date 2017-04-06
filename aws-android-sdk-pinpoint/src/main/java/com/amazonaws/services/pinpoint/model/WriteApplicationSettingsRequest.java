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

public class WriteApplicationSettingsRequest implements Serializable {
    /**
     * The default campaign limits for the app. These limits apply to each
     * campaign for the app, unless the campaign overrides the default with
     * limits of its own.
     */
    private CampaignLimits limits;

    /**
     * The default quiet time for the app. Each campaign for this app sends no
     * messages during this time unless the campaign overrides the default with
     * a quiet time of its own.
     */
    private QuietTime quietTime;

    /**
     * The default campaign limits for the app. These limits apply to each
     * campaign for the app, unless the campaign overrides the default with
     * limits of its own.
     *
     * @return The default campaign limits for the app. These limits apply to
     *         each campaign for the app, unless the campaign overrides the
     *         default with limits of its own.
     */
    public CampaignLimits getLimits() {
        return limits;
    }

    /**
     * The default campaign limits for the app. These limits apply to each
     * campaign for the app, unless the campaign overrides the default with
     * limits of its own.
     *
     * @param limits The default campaign limits for the app. These limits apply
     *            to each campaign for the app, unless the campaign overrides
     *            the default with limits of its own.
     */
    public void setLimits(CampaignLimits limits) {
        this.limits = limits;
    }

    /**
     * The default campaign limits for the app. These limits apply to each
     * campaign for the app, unless the campaign overrides the default with
     * limits of its own.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limits The default campaign limits for the app. These limits apply
     *            to each campaign for the app, unless the campaign overrides
     *            the default with limits of its own.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteApplicationSettingsRequest withLimits(CampaignLimits limits) {
        this.limits = limits;
        return this;
    }

    /**
     * The default quiet time for the app. Each campaign for this app sends no
     * messages during this time unless the campaign overrides the default with
     * a quiet time of its own.
     *
     * @return The default quiet time for the app. Each campaign for this app
     *         sends no messages during this time unless the campaign overrides
     *         the default with a quiet time of its own.
     */
    public QuietTime getQuietTime() {
        return quietTime;
    }

    /**
     * The default quiet time for the app. Each campaign for this app sends no
     * messages during this time unless the campaign overrides the default with
     * a quiet time of its own.
     *
     * @param quietTime The default quiet time for the app. Each campaign for
     *            this app sends no messages during this time unless the
     *            campaign overrides the default with a quiet time of its own.
     */
    public void setQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
    }

    /**
     * The default quiet time for the app. Each campaign for this app sends no
     * messages during this time unless the campaign overrides the default with
     * a quiet time of its own.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quietTime The default quiet time for the app. Each campaign for
     *            this app sends no messages during this time unless the
     *            campaign overrides the default with a quiet time of its own.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteApplicationSettingsRequest withQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
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
        if (getLimits() != null)
            sb.append("Limits: " + getLimits() + ",");
        if (getQuietTime() != null)
            sb.append("QuietTime: " + getQuietTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime * hashCode + ((getQuietTime() == null) ? 0 : getQuietTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteApplicationSettingsRequest == false)
            return false;
        WriteApplicationSettingsRequest other = (WriteApplicationSettingsRequest) obj;

        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
            return false;
        if (other.getQuietTime() == null ^ this.getQuietTime() == null)
            return false;
        if (other.getQuietTime() != null
                && other.getQuietTime().equals(this.getQuietTime()) == false)
            return false;
        return true;
    }
}
