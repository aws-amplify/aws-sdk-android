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

package com.amazonaws.services.awsmediatailor.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration for pre-roll ad insertion.
 * </p>
 */
public class LivePreRollConfiguration implements Serializable {
    /**
     * <p>
     * The URL for the ad decision server (ADS) for pre-roll ads. This includes
     * the specification of static parameters and placeholders for dynamic
     * parameters. AWS Elemental MediaTailor substitutes player-specific and
     * session-specific parameters as needed when calling the ADS. Alternately,
     * for testing, you can provide a static VAST URL. The maximum length is
     * 25,000 characters.
     * </p>
     */
    private String adDecisionServerUrl;

    /**
     * The maximum allowed duration for the pre-roll ad avail. AWS Elemental
     * MediaTailor won't play pre-roll ads to exceed this duration, regardless
     * of the total duration of ads that the ADS returns.
     */
    private Integer maxDurationSeconds;

    /**
     * <p>
     * The URL for the ad decision server (ADS) for pre-roll ads. This includes
     * the specification of static parameters and placeholders for dynamic
     * parameters. AWS Elemental MediaTailor substitutes player-specific and
     * session-specific parameters as needed when calling the ADS. Alternately,
     * for testing, you can provide a static VAST URL. The maximum length is
     * 25,000 characters.
     * </p>
     *
     * @return <p>
     *         The URL for the ad decision server (ADS) for pre-roll ads. This
     *         includes the specification of static parameters and placeholders
     *         for dynamic parameters. AWS Elemental MediaTailor substitutes
     *         player-specific and session-specific parameters as needed when
     *         calling the ADS. Alternately, for testing, you can provide a
     *         static VAST URL. The maximum length is 25,000 characters.
     *         </p>
     */
    public String getAdDecisionServerUrl() {
        return adDecisionServerUrl;
    }

    /**
     * <p>
     * The URL for the ad decision server (ADS) for pre-roll ads. This includes
     * the specification of static parameters and placeholders for dynamic
     * parameters. AWS Elemental MediaTailor substitutes player-specific and
     * session-specific parameters as needed when calling the ADS. Alternately,
     * for testing, you can provide a static VAST URL. The maximum length is
     * 25,000 characters.
     * </p>
     *
     * @param adDecisionServerUrl <p>
     *            The URL for the ad decision server (ADS) for pre-roll ads.
     *            This includes the specification of static parameters and
     *            placeholders for dynamic parameters. AWS Elemental MediaTailor
     *            substitutes player-specific and session-specific parameters as
     *            needed when calling the ADS. Alternately, for testing, you can
     *            provide a static VAST URL. The maximum length is 25,000
     *            characters.
     *            </p>
     */
    public void setAdDecisionServerUrl(String adDecisionServerUrl) {
        this.adDecisionServerUrl = adDecisionServerUrl;
    }

    /**
     * <p>
     * The URL for the ad decision server (ADS) for pre-roll ads. This includes
     * the specification of static parameters and placeholders for dynamic
     * parameters. AWS Elemental MediaTailor substitutes player-specific and
     * session-specific parameters as needed when calling the ADS. Alternately,
     * for testing, you can provide a static VAST URL. The maximum length is
     * 25,000 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adDecisionServerUrl <p>
     *            The URL for the ad decision server (ADS) for pre-roll ads.
     *            This includes the specification of static parameters and
     *            placeholders for dynamic parameters. AWS Elemental MediaTailor
     *            substitutes player-specific and session-specific parameters as
     *            needed when calling the ADS. Alternately, for testing, you can
     *            provide a static VAST URL. The maximum length is 25,000
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LivePreRollConfiguration withAdDecisionServerUrl(String adDecisionServerUrl) {
        this.adDecisionServerUrl = adDecisionServerUrl;
        return this;
    }

    /**
     * The maximum allowed duration for the pre-roll ad avail. AWS Elemental
     * MediaTailor won't play pre-roll ads to exceed this duration, regardless
     * of the total duration of ads that the ADS returns.
     *
     * @return The maximum allowed duration for the pre-roll ad avail. AWS
     *         Elemental MediaTailor won't play pre-roll ads to exceed this
     *         duration, regardless of the total duration of ads that the ADS
     *         returns.
     */
    public Integer getMaxDurationSeconds() {
        return maxDurationSeconds;
    }

    /**
     * The maximum allowed duration for the pre-roll ad avail. AWS Elemental
     * MediaTailor won't play pre-roll ads to exceed this duration, regardless
     * of the total duration of ads that the ADS returns.
     *
     * @param maxDurationSeconds The maximum allowed duration for the pre-roll
     *            ad avail. AWS Elemental MediaTailor won't play pre-roll ads to
     *            exceed this duration, regardless of the total duration of ads
     *            that the ADS returns.
     */
    public void setMaxDurationSeconds(Integer maxDurationSeconds) {
        this.maxDurationSeconds = maxDurationSeconds;
    }

    /**
     * The maximum allowed duration for the pre-roll ad avail. AWS Elemental
     * MediaTailor won't play pre-roll ads to exceed this duration, regardless
     * of the total duration of ads that the ADS returns.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxDurationSeconds The maximum allowed duration for the pre-roll
     *            ad avail. AWS Elemental MediaTailor won't play pre-roll ads to
     *            exceed this duration, regardless of the total duration of ads
     *            that the ADS returns.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LivePreRollConfiguration withMaxDurationSeconds(Integer maxDurationSeconds) {
        this.maxDurationSeconds = maxDurationSeconds;
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
        if (getAdDecisionServerUrl() != null)
            sb.append("AdDecisionServerUrl: " + getAdDecisionServerUrl() + ",");
        if (getMaxDurationSeconds() != null)
            sb.append("MaxDurationSeconds: " + getMaxDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdDecisionServerUrl() == null) ? 0 : getAdDecisionServerUrl().hashCode());
        hashCode = prime * hashCode
                + ((getMaxDurationSeconds() == null) ? 0 : getMaxDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LivePreRollConfiguration == false)
            return false;
        LivePreRollConfiguration other = (LivePreRollConfiguration) obj;

        if (other.getAdDecisionServerUrl() == null ^ this.getAdDecisionServerUrl() == null)
            return false;
        if (other.getAdDecisionServerUrl() != null
                && other.getAdDecisionServerUrl().equals(this.getAdDecisionServerUrl()) == false)
            return false;
        if (other.getMaxDurationSeconds() == null ^ this.getMaxDurationSeconds() == null)
            return false;
        if (other.getMaxDurationSeconds() != null
                && other.getMaxDurationSeconds().equals(this.getMaxDurationSeconds()) == false)
            return false;
        return true;
    }
}
