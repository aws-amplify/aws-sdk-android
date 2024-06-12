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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Contains details about a call analytics job, including information about
 * skipped analytics features.
 * </p>
 */
public class CallAnalyticsJobDetails implements Serializable {
    /**
     * <p>
     * Contains information about any skipped analytics features during the
     * analysis of a call analytics job.
     * </p>
     * <p>
     * This array lists all the analytics features that were skipped, along with
     * their corresponding reason code and message.
     * </p>
     */
    private java.util.List<CallAnalyticsSkippedFeature> skipped;

    /**
     * <p>
     * Contains information about any skipped analytics features during the
     * analysis of a call analytics job.
     * </p>
     * <p>
     * This array lists all the analytics features that were skipped, along with
     * their corresponding reason code and message.
     * </p>
     *
     * @return <p>
     *         Contains information about any skipped analytics features during
     *         the analysis of a call analytics job.
     *         </p>
     *         <p>
     *         This array lists all the analytics features that were skipped,
     *         along with their corresponding reason code and message.
     *         </p>
     */
    public java.util.List<CallAnalyticsSkippedFeature> getSkipped() {
        return skipped;
    }

    /**
     * <p>
     * Contains information about any skipped analytics features during the
     * analysis of a call analytics job.
     * </p>
     * <p>
     * This array lists all the analytics features that were skipped, along with
     * their corresponding reason code and message.
     * </p>
     *
     * @param skipped <p>
     *            Contains information about any skipped analytics features
     *            during the analysis of a call analytics job.
     *            </p>
     *            <p>
     *            This array lists all the analytics features that were skipped,
     *            along with their corresponding reason code and message.
     *            </p>
     */
    public void setSkipped(java.util.Collection<CallAnalyticsSkippedFeature> skipped) {
        if (skipped == null) {
            this.skipped = null;
            return;
        }

        this.skipped = new java.util.ArrayList<CallAnalyticsSkippedFeature>(skipped);
    }

    /**
     * <p>
     * Contains information about any skipped analytics features during the
     * analysis of a call analytics job.
     * </p>
     * <p>
     * This array lists all the analytics features that were skipped, along with
     * their corresponding reason code and message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skipped <p>
     *            Contains information about any skipped analytics features
     *            during the analysis of a call analytics job.
     *            </p>
     *            <p>
     *            This array lists all the analytics features that were skipped,
     *            along with their corresponding reason code and message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJobDetails withSkipped(CallAnalyticsSkippedFeature... skipped) {
        if (getSkipped() == null) {
            this.skipped = new java.util.ArrayList<CallAnalyticsSkippedFeature>(skipped.length);
        }
        for (CallAnalyticsSkippedFeature value : skipped) {
            this.skipped.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about any skipped analytics features during the
     * analysis of a call analytics job.
     * </p>
     * <p>
     * This array lists all the analytics features that were skipped, along with
     * their corresponding reason code and message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skipped <p>
     *            Contains information about any skipped analytics features
     *            during the analysis of a call analytics job.
     *            </p>
     *            <p>
     *            This array lists all the analytics features that were skipped,
     *            along with their corresponding reason code and message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJobDetails withSkipped(
            java.util.Collection<CallAnalyticsSkippedFeature> skipped) {
        setSkipped(skipped);
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
        if (getSkipped() != null)
            sb.append("Skipped: " + getSkipped());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkipped() == null) ? 0 : getSkipped().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallAnalyticsJobDetails == false)
            return false;
        CallAnalyticsJobDetails other = (CallAnalyticsJobDetails) obj;

        if (other.getSkipped() == null ^ this.getSkipped() == null)
            return false;
        if (other.getSkipped() != null && other.getSkipped().equals(this.getSkipped()) == false)
            return false;
        return true;
    }
}
