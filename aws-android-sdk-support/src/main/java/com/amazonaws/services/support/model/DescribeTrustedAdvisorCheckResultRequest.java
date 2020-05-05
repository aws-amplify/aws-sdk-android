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
 * Returns the results of the Trusted Advisor check that has the specified check
 * ID. Check IDs can be obtained by calling <a>DescribeTrustedAdvisorChecks</a>.
 * </p>
 * <p>
 * The response contains a <a>TrustedAdvisorCheckResult</a> object, which
 * contains these three objects:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>TrustedAdvisorCategorySpecificSummary</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TrustedAdvisorResourceDetail</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TrustedAdvisorResourcesSummary</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * In addition, the response contains these fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>status.</b> The alert status of the check: "ok" (green), "warning"
 * (yellow), "error" (red), or "not_available".
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>timestamp.</b> The time of the last refresh of the check.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>checkId.</b> The unique identifier for the check.
 * </p>
 * </li>
 * </ul>
 */
public class DescribeTrustedAdvisorCheckResultRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     */
    private String checkId;

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja"). Language
     * parameters must be passed explicitly for operations that take them.
     * </p>
     */
    private String language;

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
    public DescribeTrustedAdvisorCheckResultRequest withCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja"). Language
     * parameters must be passed explicitly for operations that take them.
     * </p>
     *
     * @return <p>
     *         The ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English ("en") and
     *         Japanese ("ja"). Language parameters must be passed explicitly
     *         for operations that take them.
     *         </p>
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja"). Language
     * parameters must be passed explicitly for operations that take them.
     * </p>
     *
     * @param language <p>
     *            The ISO 639-1 code for the language in which AWS provides
     *            support. AWS Support currently supports English ("en") and
     *            Japanese ("ja"). Language parameters must be passed explicitly
     *            for operations that take them.
     *            </p>
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja"). Language
     * parameters must be passed explicitly for operations that take them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param language <p>
     *            The ISO 639-1 code for the language in which AWS provides
     *            support. AWS Support currently supports English ("en") and
     *            Japanese ("ja"). Language parameters must be passed explicitly
     *            for operations that take them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrustedAdvisorCheckResultRequest withLanguage(String language) {
        this.language = language;
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
        if (getLanguage() != null)
            sb.append("language: " + getLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustedAdvisorCheckResultRequest == false)
            return false;
        DescribeTrustedAdvisorCheckResultRequest other = (DescribeTrustedAdvisorCheckResultRequest) obj;

        if (other.getCheckId() == null ^ this.getCheckId() == null)
            return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        return true;
    }
}
