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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Flag the presence or absence of interruptions in your Call Analytics
 * transcription output.
 * </p>
 * <p>
 * Rules using <code>InterruptionFilter</code> are designed to match:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Instances where an agent interrupts a customer
 * </p>
 * </li>
 * <li>
 * <p>
 * Instances where a customer interrupts an agent
 * </p>
 * </li>
 * <li>
 * <p>
 * Either participant interrupting the other
 * </p>
 * </li>
 * <li>
 * <p>
 * A lack of interruptions
 * </p>
 * </li>
 * </ul>
 * <p>
 * See <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html#tca-rules-batch"
 * >Rule criteria for post-call categories</a> for usage examples.
 * </p>
 */
public class InterruptionFilter implements Serializable {
    /**
     * <p>
     * Specify the duration of the interruptions in milliseconds. For example,
     * you can flag speech that contains more than 10,000 milliseconds of
     * interruptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 14400000<br/>
     */
    private Long threshold;

    /**
     * <p>
     * Specify the interrupter that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     */
    private String participantRole;

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your
     * audio, during which you want to search for an interruption. See for more
     * detail.
     * </p>
     */
    private AbsoluteTimeRange absoluteTimeRange;

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media
     * file, during which you want to search for an interruption. See for more
     * detail.
     * </p>
     */
    private RelativeTimeRange relativeTimeRange;

    /**
     * <p>
     * Set to <code>TRUE</code> to flag speech that does not contain
     * interruptions. Set to <code>FALSE</code> to flag speech that contains
     * interruptions.
     * </p>
     */
    private Boolean negate;

    /**
     * <p>
     * Specify the duration of the interruptions in milliseconds. For example,
     * you can flag speech that contains more than 10,000 milliseconds of
     * interruptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 14400000<br/>
     *
     * @return <p>
     *         Specify the duration of the interruptions in milliseconds. For
     *         example, you can flag speech that contains more than 10,000
     *         milliseconds of interruptions.
     *         </p>
     */
    public Long getThreshold() {
        return threshold;
    }

    /**
     * <p>
     * Specify the duration of the interruptions in milliseconds. For example,
     * you can flag speech that contains more than 10,000 milliseconds of
     * interruptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 14400000<br/>
     *
     * @param threshold <p>
     *            Specify the duration of the interruptions in milliseconds. For
     *            example, you can flag speech that contains more than 10,000
     *            milliseconds of interruptions.
     *            </p>
     */
    public void setThreshold(Long threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * Specify the duration of the interruptions in milliseconds. For example,
     * you can flag speech that contains more than 10,000 milliseconds of
     * interruptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 14400000<br/>
     *
     * @param threshold <p>
     *            Specify the duration of the interruptions in milliseconds. For
     *            example, you can flag speech that contains more than 10,000
     *            milliseconds of interruptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InterruptionFilter withThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * <p>
     * Specify the interrupter that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @return <p>
     *         Specify the interrupter that you want to flag. Omitting this
     *         parameter is equivalent to specifying both participants.
     *         </p>
     * @see ParticipantRole
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * <p>
     * Specify the interrupter that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the interrupter that you want to flag. Omitting this
     *            parameter is equivalent to specifying both participants.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * Specify the interrupter that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the interrupter that you want to flag. Omitting this
     *            parameter is equivalent to specifying both participants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public InterruptionFilter withParticipantRole(String participantRole) {
        this.participantRole = participantRole;
        return this;
    }

    /**
     * <p>
     * Specify the interrupter that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the interrupter that you want to flag. Omitting this
     *            parameter is equivalent to specifying both participants.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
    }

    /**
     * <p>
     * Specify the interrupter that you want to flag. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the interrupter that you want to flag. Omitting this
     *            parameter is equivalent to specifying both participants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public InterruptionFilter withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your
     * audio, during which you want to search for an interruption. See for more
     * detail.
     * </p>
     *
     * @return <p>
     *         Makes it possible to specify a time range (in milliseconds) in
     *         your audio, during which you want to search for an interruption.
     *         See for more detail.
     *         </p>
     */
    public AbsoluteTimeRange getAbsoluteTimeRange() {
        return absoluteTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your
     * audio, during which you want to search for an interruption. See for more
     * detail.
     * </p>
     *
     * @param absoluteTimeRange <p>
     *            Makes it possible to specify a time range (in milliseconds) in
     *            your audio, during which you want to search for an
     *            interruption. See for more detail.
     *            </p>
     */
    public void setAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        this.absoluteTimeRange = absoluteTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your
     * audio, during which you want to search for an interruption. See for more
     * detail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param absoluteTimeRange <p>
     *            Makes it possible to specify a time range (in milliseconds) in
     *            your audio, during which you want to search for an
     *            interruption. See for more detail.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InterruptionFilter withAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        this.absoluteTimeRange = absoluteTimeRange;
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media
     * file, during which you want to search for an interruption. See for more
     * detail.
     * </p>
     *
     * @return <p>
     *         Makes it possible to specify a time range (in percentage) in your
     *         media file, during which you want to search for an interruption.
     *         See for more detail.
     *         </p>
     */
    public RelativeTimeRange getRelativeTimeRange() {
        return relativeTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media
     * file, during which you want to search for an interruption. See for more
     * detail.
     * </p>
     *
     * @param relativeTimeRange <p>
     *            Makes it possible to specify a time range (in percentage) in
     *            your media file, during which you want to search for an
     *            interruption. See for more detail.
     *            </p>
     */
    public void setRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        this.relativeTimeRange = relativeTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media
     * file, during which you want to search for an interruption. See for more
     * detail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relativeTimeRange <p>
     *            Makes it possible to specify a time range (in percentage) in
     *            your media file, during which you want to search for an
     *            interruption. See for more detail.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InterruptionFilter withRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        this.relativeTimeRange = relativeTimeRange;
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag speech that does not contain
     * interruptions. Set to <code>FALSE</code> to flag speech that contains
     * interruptions.
     * </p>
     *
     * @return <p>
     *         Set to <code>TRUE</code> to flag speech that does not contain
     *         interruptions. Set to <code>FALSE</code> to flag speech that
     *         contains interruptions.
     *         </p>
     */
    public Boolean isNegate() {
        return negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag speech that does not contain
     * interruptions. Set to <code>FALSE</code> to flag speech that contains
     * interruptions.
     * </p>
     *
     * @return <p>
     *         Set to <code>TRUE</code> to flag speech that does not contain
     *         interruptions. Set to <code>FALSE</code> to flag speech that
     *         contains interruptions.
     *         </p>
     */
    public Boolean getNegate() {
        return negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag speech that does not contain
     * interruptions. Set to <code>FALSE</code> to flag speech that contains
     * interruptions.
     * </p>
     *
     * @param negate <p>
     *            Set to <code>TRUE</code> to flag speech that does not contain
     *            interruptions. Set to <code>FALSE</code> to flag speech that
     *            contains interruptions.
     *            </p>
     */
    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag speech that does not contain
     * interruptions. Set to <code>FALSE</code> to flag speech that contains
     * interruptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param negate <p>
     *            Set to <code>TRUE</code> to flag speech that does not contain
     *            interruptions. Set to <code>FALSE</code> to flag speech that
     *            contains interruptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InterruptionFilter withNegate(Boolean negate) {
        this.negate = negate;
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
        if (getThreshold() != null)
            sb.append("Threshold: " + getThreshold() + ",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: " + getParticipantRole() + ",");
        if (getAbsoluteTimeRange() != null)
            sb.append("AbsoluteTimeRange: " + getAbsoluteTimeRange() + ",");
        if (getRelativeTimeRange() != null)
            sb.append("RelativeTimeRange: " + getRelativeTimeRange() + ",");
        if (getNegate() != null)
            sb.append("Negate: " + getNegate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode
                + ((getAbsoluteTimeRange() == null) ? 0 : getAbsoluteTimeRange().hashCode());
        hashCode = prime * hashCode
                + ((getRelativeTimeRange() == null) ? 0 : getRelativeTimeRange().hashCode());
        hashCode = prime * hashCode + ((getNegate() == null) ? 0 : getNegate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InterruptionFilter == false)
            return false;
        InterruptionFilter other = (InterruptionFilter) obj;

        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null
                && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null
                && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getAbsoluteTimeRange() == null ^ this.getAbsoluteTimeRange() == null)
            return false;
        if (other.getAbsoluteTimeRange() != null
                && other.getAbsoluteTimeRange().equals(this.getAbsoluteTimeRange()) == false)
            return false;
        if (other.getRelativeTimeRange() == null ^ this.getRelativeTimeRange() == null)
            return false;
        if (other.getRelativeTimeRange() != null
                && other.getRelativeTimeRange().equals(this.getRelativeTimeRange()) == false)
            return false;
        if (other.getNegate() == null ^ this.getNegate() == null)
            return false;
        if (other.getNegate() != null && other.getNegate().equals(this.getNegate()) == false)
            return false;
        return true;
    }
}
