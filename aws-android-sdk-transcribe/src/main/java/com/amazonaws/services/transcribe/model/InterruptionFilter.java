/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that enables you to configure your category to be applied to call
 * analytics jobs where either the customer or agent was interrupted.
 * </p>
 */
public class InterruptionFilter implements Serializable {
    /**
     * <p>
     * The duration of the interruption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 14400000<br/>
     */
    private Long threshold;

    /**
     * <p>
     * Indicates whether the caller or customer was interrupting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     */
    private String participantRole;

    /**
     * <p>
     * An object you can use to specify a time range (in milliseconds) for when
     * you'd want to find the interruption. For example, you could search for an
     * interruption between the 30,000 millisecond mark and the 45,000
     * millisecond mark. You could also specify the time period as the first
     * 15,000 milliseconds or the last 15,000 milliseconds.
     * </p>
     */
    private AbsoluteTimeRange absoluteTimeRange;

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call
     * where there was a interruption. For example, you can specify the first
     * half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length
     * of conversation can vary between calls, you can apply relative time
     * ranges across all calls.
     * </p>
     */
    private RelativeTimeRange relativeTimeRange;

    /**
     * <p>
     * Set to <code>TRUE</code> to look for a time period where there was no
     * interruption.
     * </p>
     */
    private Boolean negate;

    /**
     * <p>
     * The duration of the interruption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 14400000<br/>
     *
     * @return <p>
     *         The duration of the interruption.
     *         </p>
     */
    public Long getThreshold() {
        return threshold;
    }

    /**
     * <p>
     * The duration of the interruption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 14400000<br/>
     *
     * @param threshold <p>
     *            The duration of the interruption.
     *            </p>
     */
    public void setThreshold(Long threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The duration of the interruption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 14400000<br/>
     *
     * @param threshold <p>
     *            The duration of the interruption.
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
     * Indicates whether the caller or customer was interrupting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @return <p>
     *         Indicates whether the caller or customer was interrupting.
     *         </p>
     * @see ParticipantRole
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * <p>
     * Indicates whether the caller or customer was interrupting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Indicates whether the caller or customer was interrupting.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * Indicates whether the caller or customer was interrupting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Indicates whether the caller or customer was interrupting.
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
     * Indicates whether the caller or customer was interrupting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Indicates whether the caller or customer was interrupting.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
    }

    /**
     * <p>
     * Indicates whether the caller or customer was interrupting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Indicates whether the caller or customer was interrupting.
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
     * An object you can use to specify a time range (in milliseconds) for when
     * you'd want to find the interruption. For example, you could search for an
     * interruption between the 30,000 millisecond mark and the 45,000
     * millisecond mark. You could also specify the time period as the first
     * 15,000 milliseconds or the last 15,000 milliseconds.
     * </p>
     *
     * @return <p>
     *         An object you can use to specify a time range (in milliseconds)
     *         for when you'd want to find the interruption. For example, you
     *         could search for an interruption between the 30,000 millisecond
     *         mark and the 45,000 millisecond mark. You could also specify the
     *         time period as the first 15,000 milliseconds or the last 15,000
     *         milliseconds.
     *         </p>
     */
    public AbsoluteTimeRange getAbsoluteTimeRange() {
        return absoluteTimeRange;
    }

    /**
     * <p>
     * An object you can use to specify a time range (in milliseconds) for when
     * you'd want to find the interruption. For example, you could search for an
     * interruption between the 30,000 millisecond mark and the 45,000
     * millisecond mark. You could also specify the time period as the first
     * 15,000 milliseconds or the last 15,000 milliseconds.
     * </p>
     *
     * @param absoluteTimeRange <p>
     *            An object you can use to specify a time range (in
     *            milliseconds) for when you'd want to find the interruption.
     *            For example, you could search for an interruption between the
     *            30,000 millisecond mark and the 45,000 millisecond mark. You
     *            could also specify the time period as the first 15,000
     *            milliseconds or the last 15,000 milliseconds.
     *            </p>
     */
    public void setAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        this.absoluteTimeRange = absoluteTimeRange;
    }

    /**
     * <p>
     * An object you can use to specify a time range (in milliseconds) for when
     * you'd want to find the interruption. For example, you could search for an
     * interruption between the 30,000 millisecond mark and the 45,000
     * millisecond mark. You could also specify the time period as the first
     * 15,000 milliseconds or the last 15,000 milliseconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param absoluteTimeRange <p>
     *            An object you can use to specify a time range (in
     *            milliseconds) for when you'd want to find the interruption.
     *            For example, you could search for an interruption between the
     *            30,000 millisecond mark and the 45,000 millisecond mark. You
     *            could also specify the time period as the first 15,000
     *            milliseconds or the last 15,000 milliseconds.
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
     * An object that allows percentages to specify the proportion of the call
     * where there was a interruption. For example, you can specify the first
     * half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length
     * of conversation can vary between calls, you can apply relative time
     * ranges across all calls.
     * </p>
     *
     * @return <p>
     *         An object that allows percentages to specify the proportion of
     *         the call where there was a interruption. For example, you can
     *         specify the first half of the call. You can also specify the
     *         period of time between halfway through to three-quarters of the
     *         way through the call. Because the length of conversation can vary
     *         between calls, you can apply relative time ranges across all
     *         calls.
     *         </p>
     */
    public RelativeTimeRange getRelativeTimeRange() {
        return relativeTimeRange;
    }

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call
     * where there was a interruption. For example, you can specify the first
     * half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length
     * of conversation can vary between calls, you can apply relative time
     * ranges across all calls.
     * </p>
     *
     * @param relativeTimeRange <p>
     *            An object that allows percentages to specify the proportion of
     *            the call where there was a interruption. For example, you can
     *            specify the first half of the call. You can also specify the
     *            period of time between halfway through to three-quarters of
     *            the way through the call. Because the length of conversation
     *            can vary between calls, you can apply relative time ranges
     *            across all calls.
     *            </p>
     */
    public void setRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        this.relativeTimeRange = relativeTimeRange;
    }

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call
     * where there was a interruption. For example, you can specify the first
     * half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length
     * of conversation can vary between calls, you can apply relative time
     * ranges across all calls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relativeTimeRange <p>
     *            An object that allows percentages to specify the proportion of
     *            the call where there was a interruption. For example, you can
     *            specify the first half of the call. You can also specify the
     *            period of time between halfway through to three-quarters of
     *            the way through the call. Because the length of conversation
     *            can vary between calls, you can apply relative time ranges
     *            across all calls.
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
     * Set to <code>TRUE</code> to look for a time period where there was no
     * interruption.
     * </p>
     *
     * @return <p>
     *         Set to <code>TRUE</code> to look for a time period where there
     *         was no interruption.
     *         </p>
     */
    public Boolean isNegate() {
        return negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to look for a time period where there was no
     * interruption.
     * </p>
     *
     * @return <p>
     *         Set to <code>TRUE</code> to look for a time period where there
     *         was no interruption.
     *         </p>
     */
    public Boolean getNegate() {
        return negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to look for a time period where there was no
     * interruption.
     * </p>
     *
     * @param negate <p>
     *            Set to <code>TRUE</code> to look for a time period where there
     *            was no interruption.
     *            </p>
     */
    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to look for a time period where there was no
     * interruption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param negate <p>
     *            Set to <code>TRUE</code> to look for a time period where there
     *            was no interruption.
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
