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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The refresh status of a Trusted Advisor check.
 * </p>
 */
public class TrustedAdvisorCheckRefreshStatus implements Serializable {
    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     */
    private String checkId;

    /**
     * <p>
     * The status of the Trusted Advisor check for which a refresh has been
     * requested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none:</code> The check is not refreshed or the non-success status
     * exceeds the timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enqueued:</code> The check refresh requests has entered the refresh
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processing:</code> The check refresh request is picked up by the
     * rule processing engine
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>success:</code> The check is successfully refreshed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>abandoned:</code> The check refresh has failed
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The amount of time, in milliseconds, until the Trusted Advisor check is
     * eligible for refresh.
     * </p>
     */
    private Long millisUntilNextRefreshable;

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the Trusted Advisor check.
     *         </p>
     */
    public String getCheckId() {
        return checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     *
     * @param checkId <p>
     *            The unique identifier for the Trusted Advisor check.
     *            </p>
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkId <p>
     *            The unique identifier for the Trusted Advisor check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckRefreshStatus withCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * <p>
     * The status of the Trusted Advisor check for which a refresh has been
     * requested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none:</code> The check is not refreshed or the non-success status
     * exceeds the timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enqueued:</code> The check refresh requests has entered the refresh
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processing:</code> The check refresh request is picked up by the
     * rule processing engine
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>success:</code> The check is successfully refreshed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>abandoned:</code> The check refresh has failed
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The status of the Trusted Advisor check for which a refresh has
     *         been requested:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>none:</code> The check is not refreshed or the non-success
     *         status exceeds the timeout
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>enqueued:</code> The check refresh requests has entered the
     *         refresh queue
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>processing:</code> The check refresh request is picked up
     *         by the rule processing engine
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>success:</code> The check is successfully refreshed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>abandoned:</code> The check refresh has failed
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the Trusted Advisor check for which a refresh has been
     * requested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none:</code> The check is not refreshed or the non-success status
     * exceeds the timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enqueued:</code> The check refresh requests has entered the refresh
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processing:</code> The check refresh request is picked up by the
     * rule processing engine
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>success:</code> The check is successfully refreshed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>abandoned:</code> The check refresh has failed
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            The status of the Trusted Advisor check for which a refresh
     *            has been requested:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>none:</code> The check is not refreshed or the
     *            non-success status exceeds the timeout
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>enqueued:</code> The check refresh requests has entered
     *            the refresh queue
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>processing:</code> The check refresh request is picked
     *            up by the rule processing engine
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>success:</code> The check is successfully refreshed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>abandoned:</code> The check refresh has failed
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Trusted Advisor check for which a refresh has been
     * requested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none:</code> The check is not refreshed or the non-success status
     * exceeds the timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enqueued:</code> The check refresh requests has entered the refresh
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processing:</code> The check refresh request is picked up by the
     * rule processing engine
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>success:</code> The check is successfully refreshed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>abandoned:</code> The check refresh has failed
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the Trusted Advisor check for which a refresh
     *            has been requested:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>none:</code> The check is not refreshed or the
     *            non-success status exceeds the timeout
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>enqueued:</code> The check refresh requests has entered
     *            the refresh queue
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>processing:</code> The check refresh request is picked
     *            up by the rule processing engine
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>success:</code> The check is successfully refreshed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>abandoned:</code> The check refresh has failed
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckRefreshStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The amount of time, in milliseconds, until the Trusted Advisor check is
     * eligible for refresh.
     * </p>
     *
     * @return <p>
     *         The amount of time, in milliseconds, until the Trusted Advisor
     *         check is eligible for refresh.
     *         </p>
     */
    public Long getMillisUntilNextRefreshable() {
        return millisUntilNextRefreshable;
    }

    /**
     * <p>
     * The amount of time, in milliseconds, until the Trusted Advisor check is
     * eligible for refresh.
     * </p>
     *
     * @param millisUntilNextRefreshable <p>
     *            The amount of time, in milliseconds, until the Trusted Advisor
     *            check is eligible for refresh.
     *            </p>
     */
    public void setMillisUntilNextRefreshable(Long millisUntilNextRefreshable) {
        this.millisUntilNextRefreshable = millisUntilNextRefreshable;
    }

    /**
     * <p>
     * The amount of time, in milliseconds, until the Trusted Advisor check is
     * eligible for refresh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param millisUntilNextRefreshable <p>
     *            The amount of time, in milliseconds, until the Trusted Advisor
     *            check is eligible for refresh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorCheckRefreshStatus withMillisUntilNextRefreshable(
            Long millisUntilNextRefreshable) {
        this.millisUntilNextRefreshable = millisUntilNextRefreshable;
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
        if (getCheckId() != null)
            sb.append("checkId: " + getCheckId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getMillisUntilNextRefreshable() != null)
            sb.append("millisUntilNextRefreshable: " + getMillisUntilNextRefreshable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getMillisUntilNextRefreshable() == null) ? 0 : getMillisUntilNextRefreshable()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorCheckRefreshStatus == false)
            return false;
        TrustedAdvisorCheckRefreshStatus other = (TrustedAdvisorCheckRefreshStatus) obj;

        if (other.getCheckId() == null ^ this.getCheckId() == null)
            return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMillisUntilNextRefreshable() == null
                ^ this.getMillisUntilNextRefreshable() == null)
            return false;
        if (other.getMillisUntilNextRefreshable() != null
                && other.getMillisUntilNextRefreshable().equals(
                        this.getMillisUntilNextRefreshable()) == false)
            return false;
        return true;
    }
}
