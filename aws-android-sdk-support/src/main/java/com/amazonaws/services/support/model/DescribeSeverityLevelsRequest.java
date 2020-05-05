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
 * Returns the list of severity levels that you can assign to an AWS Support
 * case. The severity level for a case is also a field in the <a>CaseDetails</a>
 * data type included in any <a>CreateCase</a> request.
 * </p>
 */
public class DescribeSeverityLevelsRequest extends AmazonWebServiceRequest implements Serializable {
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
    public DescribeSeverityLevelsRequest withLanguage(String language) {
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

        if (obj instanceof DescribeSeverityLevelsRequest == false)
            return false;
        DescribeSeverityLevelsRequest other = (DescribeSeverityLevelsRequest) obj;

        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        return true;
    }
}
