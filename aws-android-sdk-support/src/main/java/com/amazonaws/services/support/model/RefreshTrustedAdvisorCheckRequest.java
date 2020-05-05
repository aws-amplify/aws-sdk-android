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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Requests a refresh of the Trusted Advisor check that has the specified check
 * ID. Check IDs can be obtained by calling <a>DescribeTrustedAdvisorChecks</a>.
 * </p>
 * <note>
 * <p>
 * Some checks are refreshed automatically, and they cannot be refreshed by
 * using this operation. Use of the <code>RefreshTrustedAdvisorCheck</code>
 * operation for these checks causes an <code>InvalidParameterValue</code>
 * error.
 * </p>
 * </note>
 * <p>
 * The response contains a <a>TrustedAdvisorCheckRefreshStatus</a> object, which
 * contains these fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>status.</b> The refresh status of the check:
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
 * <code>processing:</code> The check refresh request is picked up by the rule
 * processing engine
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
 * </li>
 * <li>
 * <p>
 * <b>millisUntilNextRefreshable.</b> The amount of time, in milliseconds, until
 * the check is eligible for refresh.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>checkId.</b> The unique identifier for the check.
 * </p>
 * </li>
 * </ul>
 */
public class RefreshTrustedAdvisorCheckRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier for the Trusted Advisor check to refresh.
     * <b>Note:</b> Specifying the check ID of a check that is automatically
     * refreshed causes an <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String checkId;

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check to refresh.
     * <b>Note:</b> Specifying the check ID of a check that is automatically
     * refreshed causes an <code>InvalidParameterValue</code> error.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the Trusted Advisor check to refresh.
     *         <b>Note:</b> Specifying the check ID of a check that is
     *         automatically refreshed causes an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     */
    public String getCheckId() {
        return checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check to refresh.
     * <b>Note:</b> Specifying the check ID of a check that is automatically
     * refreshed causes an <code>InvalidParameterValue</code> error.
     * </p>
     *
     * @param checkId <p>
     *            The unique identifier for the Trusted Advisor check to
     *            refresh. <b>Note:</b> Specifying the check ID of a check that
     *            is automatically refreshed causes an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check to refresh.
     * <b>Note:</b> Specifying the check ID of a check that is automatically
     * refreshed causes an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkId <p>
     *            The unique identifier for the Trusted Advisor check to
     *            refresh. <b>Note:</b> Specifying the check ID of a check that
     *            is automatically refreshed causes an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshTrustedAdvisorCheckRequest withCheckId(String checkId) {
        this.checkId = checkId;
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
            sb.append("checkId: " + getCheckId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshTrustedAdvisorCheckRequest == false)
            return false;
        RefreshTrustedAdvisorCheckRequest other = (RefreshTrustedAdvisorCheckRequest) obj;

        if (other.getCheckId() == null ^ this.getCheckId() == null)
            return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false)
            return false;
        return true;
    }
}
