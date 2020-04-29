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

package com.amazonaws.services.awswaf.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * Returned by <a>ListRegexMatchSets</a>. Each <code>RegexMatchSetSummary</code>
 * object includes the <code>Name</code> and <code>RegexMatchSetId</code> for
 * one <a>RegexMatchSet</a>.
 * </p>
 */
public class RegexMatchSetSummary implements Serializable {
    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You
     * use <code>RegexMatchSetId</code> to get information about a
     * <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>, remove a
     * <code>RegexMatchSet</code> from a <code>Rule</code>, and delete a
     * <code>RegexMatchSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a>
     * and by <a>ListRegexMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String regexMatchSetId;

    /**
     * <p>
     * A friendly name or description of the <a>RegexMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>RegexMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You
     * use <code>RegexMatchSetId</code> to get information about a
     * <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>, remove a
     * <code>RegexMatchSet</code> from a <code>Rule</code>, and delete a
     * <code>RegexMatchSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a>
     * and by <a>ListRegexMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>
     *         . You use <code>RegexMatchSetId</code> to get information about a
     *         <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>,
     *         remove a <code>RegexMatchSet</code> from a <code>Rule</code>, and
     *         delete a <code>RegexMatchSet</code> from AWS WAF.
     *         </p>
     *         <p>
     *         <code>RegexMatchSetId</code> is returned by
     *         <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     *         </p>
     */
    public String getRegexMatchSetId() {
        return regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You
     * use <code>RegexMatchSetId</code> to get information about a
     * <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>, remove a
     * <code>RegexMatchSet</code> from a <code>Rule</code>, and delete a
     * <code>RegexMatchSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a>
     * and by <a>ListRegexMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param regexMatchSetId <p>
     *            The <code>RegexMatchSetId</code> for a
     *            <code>RegexMatchSet</code>. You use
     *            <code>RegexMatchSetId</code> to get information about a
     *            <code>RegexMatchSet</code>, update a
     *            <code>RegexMatchSet</code>, remove a
     *            <code>RegexMatchSet</code> from a <code>Rule</code>, and
     *            delete a <code>RegexMatchSet</code> from AWS WAF.
     *            </p>
     *            <p>
     *            <code>RegexMatchSetId</code> is returned by
     *            <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     *            </p>
     */
    public void setRegexMatchSetId(String regexMatchSetId) {
        this.regexMatchSetId = regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> for a <code>RegexMatchSet</code>. You
     * use <code>RegexMatchSetId</code> to get information about a
     * <code>RegexMatchSet</code>, update a <code>RegexMatchSet</code>, remove a
     * <code>RegexMatchSet</code> from a <code>Rule</code>, and delete a
     * <code>RegexMatchSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a>
     * and by <a>ListRegexMatchSets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param regexMatchSetId <p>
     *            The <code>RegexMatchSetId</code> for a
     *            <code>RegexMatchSet</code>. You use
     *            <code>RegexMatchSetId</code> to get information about a
     *            <code>RegexMatchSet</code>, update a
     *            <code>RegexMatchSet</code>, remove a
     *            <code>RegexMatchSet</code> from a <code>Rule</code>, and
     *            delete a <code>RegexMatchSet</code> from AWS WAF.
     *            </p>
     *            <p>
     *            <code>RegexMatchSetId</code> is returned by
     *            <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegexMatchSetSummary withRegexMatchSetId(String regexMatchSetId) {
        this.regexMatchSetId = regexMatchSetId;
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>RegexMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description of the <a>RegexMatchSet</a>. You
     *         can't change <code>Name</code> after you create a
     *         <code>RegexMatchSet</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>RegexMatchSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>RegexMatchSet</a>.
     *            You can't change <code>Name</code> after you create a
     *            <code>RegexMatchSet</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexMatchSet</a>. You can't
     * change <code>Name</code> after you create a <code>RegexMatchSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>RegexMatchSet</a>.
     *            You can't change <code>Name</code> after you create a
     *            <code>RegexMatchSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegexMatchSetSummary withName(String name) {
        this.name = name;
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
        if (getRegexMatchSetId() != null)
            sb.append("RegexMatchSetId: " + getRegexMatchSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegexMatchSetId() == null) ? 0 : getRegexMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegexMatchSetSummary == false)
            return false;
        RegexMatchSetSummary other = (RegexMatchSetSummary) obj;

        if (other.getRegexMatchSetId() == null ^ this.getRegexMatchSetId() == null)
            return false;
        if (other.getRegexMatchSetId() != null
                && other.getRegexMatchSetId().equals(this.getRegexMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
