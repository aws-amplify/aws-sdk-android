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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information for score and potential quality issues for Audio
 * </p>
 */
public class AudioQualityMetricsInfo implements Serializable {
    /**
     * <p>
     * Number measuring the estimated quality of the media connection.
     * </p>
     */
    private Float qualityScore;

    /**
     * <p>
     * List of potential issues causing degradation of quality on a media
     * connection. If the service did not detect any potential quality issues
     * the list is empty.
     * </p>
     * <p>
     * Valid values: <code>HighPacketLoss</code> |
     * <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * </p>
     */
    private java.util.List<String> potentialQualityIssues;

    /**
     * <p>
     * Number measuring the estimated quality of the media connection.
     * </p>
     *
     * @return <p>
     *         Number measuring the estimated quality of the media connection.
     *         </p>
     */
    public Float getQualityScore() {
        return qualityScore;
    }

    /**
     * <p>
     * Number measuring the estimated quality of the media connection.
     * </p>
     *
     * @param qualityScore <p>
     *            Number measuring the estimated quality of the media
     *            connection.
     *            </p>
     */
    public void setQualityScore(Float qualityScore) {
        this.qualityScore = qualityScore;
    }

    /**
     * <p>
     * Number measuring the estimated quality of the media connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param qualityScore <p>
     *            Number measuring the estimated quality of the media
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioQualityMetricsInfo withQualityScore(Float qualityScore) {
        this.qualityScore = qualityScore;
        return this;
    }

    /**
     * <p>
     * List of potential issues causing degradation of quality on a media
     * connection. If the service did not detect any potential quality issues
     * the list is empty.
     * </p>
     * <p>
     * Valid values: <code>HighPacketLoss</code> |
     * <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * </p>
     *
     * @return <p>
     *         List of potential issues causing degradation of quality on a
     *         media connection. If the service did not detect any potential
     *         quality issues the list is empty.
     *         </p>
     *         <p>
     *         Valid values: <code>HighPacketLoss</code> |
     *         <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     *         </p>
     */
    public java.util.List<String> getPotentialQualityIssues() {
        return potentialQualityIssues;
    }

    /**
     * <p>
     * List of potential issues causing degradation of quality on a media
     * connection. If the service did not detect any potential quality issues
     * the list is empty.
     * </p>
     * <p>
     * Valid values: <code>HighPacketLoss</code> |
     * <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * </p>
     *
     * @param potentialQualityIssues <p>
     *            List of potential issues causing degradation of quality on a
     *            media connection. If the service did not detect any potential
     *            quality issues the list is empty.
     *            </p>
     *            <p>
     *            Valid values: <code>HighPacketLoss</code> |
     *            <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     *            </p>
     */
    public void setPotentialQualityIssues(java.util.Collection<String> potentialQualityIssues) {
        if (potentialQualityIssues == null) {
            this.potentialQualityIssues = null;
            return;
        }

        this.potentialQualityIssues = new java.util.ArrayList<String>(potentialQualityIssues);
    }

    /**
     * <p>
     * List of potential issues causing degradation of quality on a media
     * connection. If the service did not detect any potential quality issues
     * the list is empty.
     * </p>
     * <p>
     * Valid values: <code>HighPacketLoss</code> |
     * <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param potentialQualityIssues <p>
     *            List of potential issues causing degradation of quality on a
     *            media connection. If the service did not detect any potential
     *            quality issues the list is empty.
     *            </p>
     *            <p>
     *            Valid values: <code>HighPacketLoss</code> |
     *            <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioQualityMetricsInfo withPotentialQualityIssues(String... potentialQualityIssues) {
        if (getPotentialQualityIssues() == null) {
            this.potentialQualityIssues = new java.util.ArrayList<String>(
                    potentialQualityIssues.length);
        }
        for (String value : potentialQualityIssues) {
            this.potentialQualityIssues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of potential issues causing degradation of quality on a media
     * connection. If the service did not detect any potential quality issues
     * the list is empty.
     * </p>
     * <p>
     * Valid values: <code>HighPacketLoss</code> |
     * <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param potentialQualityIssues <p>
     *            List of potential issues causing degradation of quality on a
     *            media connection. If the service did not detect any potential
     *            quality issues the list is empty.
     *            </p>
     *            <p>
     *            Valid values: <code>HighPacketLoss</code> |
     *            <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioQualityMetricsInfo withPotentialQualityIssues(
            java.util.Collection<String> potentialQualityIssues) {
        setPotentialQualityIssues(potentialQualityIssues);
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
        if (getQualityScore() != null)
            sb.append("QualityScore: " + getQualityScore() + ",");
        if (getPotentialQualityIssues() != null)
            sb.append("PotentialQualityIssues: " + getPotentialQualityIssues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQualityScore() == null) ? 0 : getQualityScore().hashCode());
        hashCode = prime
                * hashCode
                + ((getPotentialQualityIssues() == null) ? 0 : getPotentialQualityIssues()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioQualityMetricsInfo == false)
            return false;
        AudioQualityMetricsInfo other = (AudioQualityMetricsInfo) obj;

        if (other.getQualityScore() == null ^ this.getQualityScore() == null)
            return false;
        if (other.getQualityScore() != null
                && other.getQualityScore().equals(this.getQualityScore()) == false)
            return false;
        if (other.getPotentialQualityIssues() == null ^ this.getPotentialQualityIssues() == null)
            return false;
        if (other.getPotentialQualityIssues() != null
                && other.getPotentialQualityIssues().equals(this.getPotentialQualityIssues()) == false)
            return false;
        return true;
    }
}
