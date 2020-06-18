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
 * Returns information about all available AWS Trusted Advisor checks, including
 * the name, ID, category, description, and metadata. You must specify a
 * language code. The AWS Support API currently supports English ("en") and
 * Japanese ("ja"). The response contains a
 * <a>TrustedAdvisorCheckDescription</a> object for each check. You must set the
 * AWS Region to us-east-1.
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
public class DescribeTrustedAdvisorChecksRequest extends AmazonWebServiceRequest implements
        Serializable {
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
    public DescribeTrustedAdvisorChecksRequest withLanguage(String language) {
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
        if (getLanguage() != null)
            sb.append("language: " + getLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustedAdvisorChecksRequest == false)
            return false;
        DescribeTrustedAdvisorChecksRequest other = (DescribeTrustedAdvisorChecksRequest) obj;

        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        return true;
    }
}
