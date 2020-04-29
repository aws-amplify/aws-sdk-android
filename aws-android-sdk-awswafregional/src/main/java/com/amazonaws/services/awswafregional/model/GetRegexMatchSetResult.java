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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

public class GetRegexMatchSetResult implements Serializable {
    /**
     * <p>
     * Information about the <a>RegexMatchSet</a> that you specified in the
     * <code>GetRegexMatchSet</code> request. For more information, see
     * <a>RegexMatchTuple</a>.
     * </p>
     */
    private RegexMatchSet regexMatchSet;

    /**
     * <p>
     * Information about the <a>RegexMatchSet</a> that you specified in the
     * <code>GetRegexMatchSet</code> request. For more information, see
     * <a>RegexMatchTuple</a>.
     * </p>
     *
     * @return <p>
     *         Information about the <a>RegexMatchSet</a> that you specified in
     *         the <code>GetRegexMatchSet</code> request. For more information,
     *         see <a>RegexMatchTuple</a>.
     *         </p>
     */
    public RegexMatchSet getRegexMatchSet() {
        return regexMatchSet;
    }

    /**
     * <p>
     * Information about the <a>RegexMatchSet</a> that you specified in the
     * <code>GetRegexMatchSet</code> request. For more information, see
     * <a>RegexMatchTuple</a>.
     * </p>
     *
     * @param regexMatchSet <p>
     *            Information about the <a>RegexMatchSet</a> that you specified
     *            in the <code>GetRegexMatchSet</code> request. For more
     *            information, see <a>RegexMatchTuple</a>.
     *            </p>
     */
    public void setRegexMatchSet(RegexMatchSet regexMatchSet) {
        this.regexMatchSet = regexMatchSet;
    }

    /**
     * <p>
     * Information about the <a>RegexMatchSet</a> that you specified in the
     * <code>GetRegexMatchSet</code> request. For more information, see
     * <a>RegexMatchTuple</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regexMatchSet <p>
     *            Information about the <a>RegexMatchSet</a> that you specified
     *            in the <code>GetRegexMatchSet</code> request. For more
     *            information, see <a>RegexMatchTuple</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRegexMatchSetResult withRegexMatchSet(RegexMatchSet regexMatchSet) {
        this.regexMatchSet = regexMatchSet;
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
        if (getRegexMatchSet() != null)
            sb.append("RegexMatchSet: " + getRegexMatchSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegexMatchSet() == null) ? 0 : getRegexMatchSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegexMatchSetResult == false)
            return false;
        GetRegexMatchSetResult other = (GetRegexMatchSetResult) obj;

        if (other.getRegexMatchSet() == null ^ this.getRegexMatchSet() == null)
            return false;
        if (other.getRegexMatchSet() != null
                && other.getRegexMatchSet().equals(this.getRegexMatchSet()) == false)
            return false;
        return true;
    }
}
