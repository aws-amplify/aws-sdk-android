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

public class CreateRegexMatchSetResult implements Serializable {
    /**
     * <p>
     * A <a>RegexMatchSet</a> that contains no <code>RegexMatchTuple</code>
     * objects.
     * </p>
     */
    private RegexMatchSet regexMatchSet;

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateRegexMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String changeToken;

    /**
     * <p>
     * A <a>RegexMatchSet</a> that contains no <code>RegexMatchTuple</code>
     * objects.
     * </p>
     *
     * @return <p>
     *         A <a>RegexMatchSet</a> that contains no
     *         <code>RegexMatchTuple</code> objects.
     *         </p>
     */
    public RegexMatchSet getRegexMatchSet() {
        return regexMatchSet;
    }

    /**
     * <p>
     * A <a>RegexMatchSet</a> that contains no <code>RegexMatchTuple</code>
     * objects.
     * </p>
     *
     * @param regexMatchSet <p>
     *            A <a>RegexMatchSet</a> that contains no
     *            <code>RegexMatchTuple</code> objects.
     *            </p>
     */
    public void setRegexMatchSet(RegexMatchSet regexMatchSet) {
        this.regexMatchSet = regexMatchSet;
    }

    /**
     * <p>
     * A <a>RegexMatchSet</a> that contains no <code>RegexMatchTuple</code>
     * objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regexMatchSet <p>
     *            A <a>RegexMatchSet</a> that contains no
     *            <code>RegexMatchTuple</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRegexMatchSetResult withRegexMatchSet(RegexMatchSet regexMatchSet) {
        this.regexMatchSet = regexMatchSet;
        return this;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateRegexMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>ChangeToken</code> that you used to submit the
     *         <code>CreateRegexMatchSet</code> request. You can also use this
     *         value to query the status of the request. For more information,
     *         see <a>GetChangeTokenStatus</a>.
     *         </p>
     */
    public String getChangeToken() {
        return changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateRegexMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The <code>ChangeToken</code> that you used to submit the
     *            <code>CreateRegexMatchSet</code> request. You can also use
     *            this value to query the status of the request. For more
     *            information, see <a>GetChangeTokenStatus</a>.
     *            </p>
     */
    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateRegexMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The <code>ChangeToken</code> that you used to submit the
     *            <code>CreateRegexMatchSet</code> request. You can also use
     *            this value to query the status of the request. For more
     *            information, see <a>GetChangeTokenStatus</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRegexMatchSetResult withChangeToken(String changeToken) {
        this.changeToken = changeToken;
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
            sb.append("RegexMatchSet: " + getRegexMatchSet() + ",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegexMatchSet() == null) ? 0 : getRegexMatchSet().hashCode());
        hashCode = prime * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRegexMatchSetResult == false)
            return false;
        CreateRegexMatchSetResult other = (CreateRegexMatchSetResult) obj;

        if (other.getRegexMatchSet() == null ^ this.getRegexMatchSet() == null)
            return false;
        if (other.getRegexMatchSet() != null
                && other.getRegexMatchSet().equals(this.getRegexMatchSet()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }
}
