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
 * Resolves a support case. This operation takes a <code>caseId</code> and
 * returns the initial and final state of the case.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise support plan to use the AWS Support
 * API.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you call the AWS Support API from an account that does not have a Business
 * or Enterprise support plan, the <code>SubscriptionRequiredException</code>
 * error message appears. For information about changing your support plan, see
 * <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
public class ResolveCaseRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     */
    private String caseId;

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     *
     * @return <p>
     *         The AWS Support case ID requested or returned in the call. The
     *         case ID is an alphanumeric string formatted as shown in this
     *         example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *         </p>
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     *
     * @param caseId <p>
     *            The AWS Support case ID requested or returned in the call. The
     *            case ID is an alphanumeric string formatted as shown in this
     *            example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *            </p>
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param caseId <p>
     *            The AWS Support case ID requested or returned in the call. The
     *            case ID is an alphanumeric string formatted as shown in this
     *            example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolveCaseRequest withCaseId(String caseId) {
        this.caseId = caseId;
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
        if (getCaseId() != null)
            sb.append("caseId: " + getCaseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveCaseRequest == false)
            return false;
        ResolveCaseRequest other = (ResolveCaseRequest) obj;

        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        return true;
    }
}
