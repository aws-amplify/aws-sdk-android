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
 * The <code>RegexPatternSet</code> specifies the regular expression (regex)
 * pattern that you want AWS WAF to search for, such as
 * <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those
 * requests.
 * </p>
 */
public class RegexPatternSet implements Serializable {
    /**
     * <p>
     * The identifier for the <code>RegexPatternSet</code>. You use
     * <code>RegexPatternSetId</code> to get information about a
     * <code>RegexPatternSet</code>, update a <code>RegexPatternSet</code>,
     * remove a <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>,
     * and delete a <code>RegexPatternSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexPatternSet</a>
     * and by <a>ListRegexPatternSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String regexPatternSetId;

    /**
     * <p>
     * A friendly name or description of the <a>RegexPatternSet</a>. You can't
     * change <code>Name</code> after you create a <code>RegexPatternSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * Specifies the regular expression (regex) patterns that you want AWS WAF
     * to search for, such as <code>B[a@]dB[o0]t</code>.
     * </p>
     */
    private java.util.List<String> regexPatternStrings;

    /**
     * <p>
     * The identifier for the <code>RegexPatternSet</code>. You use
     * <code>RegexPatternSetId</code> to get information about a
     * <code>RegexPatternSet</code>, update a <code>RegexPatternSet</code>,
     * remove a <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>,
     * and delete a <code>RegexPatternSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexPatternSet</a>
     * and by <a>ListRegexPatternSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The identifier for the <code>RegexPatternSet</code>. You use
     *         <code>RegexPatternSetId</code> to get information about a
     *         <code>RegexPatternSet</code>, update a
     *         <code>RegexPatternSet</code>, remove a
     *         <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>,
     *         and delete a <code>RegexPatternSet</code> from AWS WAF.
     *         </p>
     *         <p>
     *         <code>RegexMatchSetId</code> is returned by
     *         <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     *         </p>
     */
    public String getRegexPatternSetId() {
        return regexPatternSetId;
    }

    /**
     * <p>
     * The identifier for the <code>RegexPatternSet</code>. You use
     * <code>RegexPatternSetId</code> to get information about a
     * <code>RegexPatternSet</code>, update a <code>RegexPatternSet</code>,
     * remove a <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>,
     * and delete a <code>RegexPatternSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexPatternSet</a>
     * and by <a>ListRegexPatternSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param regexPatternSetId <p>
     *            The identifier for the <code>RegexPatternSet</code>. You use
     *            <code>RegexPatternSetId</code> to get information about a
     *            <code>RegexPatternSet</code>, update a
     *            <code>RegexPatternSet</code>, remove a
     *            <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>
     *            , and delete a <code>RegexPatternSet</code> from AWS WAF.
     *            </p>
     *            <p>
     *            <code>RegexMatchSetId</code> is returned by
     *            <a>CreateRegexPatternSet</a> and by
     *            <a>ListRegexPatternSets</a>.
     *            </p>
     */
    public void setRegexPatternSetId(String regexPatternSetId) {
        this.regexPatternSetId = regexPatternSetId;
    }

    /**
     * <p>
     * The identifier for the <code>RegexPatternSet</code>. You use
     * <code>RegexPatternSetId</code> to get information about a
     * <code>RegexPatternSet</code>, update a <code>RegexPatternSet</code>,
     * remove a <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>,
     * and delete a <code>RegexPatternSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>RegexMatchSetId</code> is returned by <a>CreateRegexPatternSet</a>
     * and by <a>ListRegexPatternSets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param regexPatternSetId <p>
     *            The identifier for the <code>RegexPatternSet</code>. You use
     *            <code>RegexPatternSetId</code> to get information about a
     *            <code>RegexPatternSet</code>, update a
     *            <code>RegexPatternSet</code>, remove a
     *            <code>RegexPatternSet</code> from a <code>RegexMatchSet</code>
     *            , and delete a <code>RegexPatternSet</code> from AWS WAF.
     *            </p>
     *            <p>
     *            <code>RegexMatchSetId</code> is returned by
     *            <a>CreateRegexPatternSet</a> and by
     *            <a>ListRegexPatternSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegexPatternSet withRegexPatternSetId(String regexPatternSetId) {
        this.regexPatternSetId = regexPatternSetId;
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexPatternSet</a>. You can't
     * change <code>Name</code> after you create a <code>RegexPatternSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description of the <a>RegexPatternSet</a>. You
     *         can't change <code>Name</code> after you create a
     *         <code>RegexPatternSet</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexPatternSet</a>. You can't
     * change <code>Name</code> after you create a <code>RegexPatternSet</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>RegexPatternSet</a>.
     *            You can't change <code>Name</code> after you create a
     *            <code>RegexPatternSet</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RegexPatternSet</a>. You can't
     * change <code>Name</code> after you create a <code>RegexPatternSet</code>.
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
     *            A friendly name or description of the <a>RegexPatternSet</a>.
     *            You can't change <code>Name</code> after you create a
     *            <code>RegexPatternSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegexPatternSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) patterns that you want AWS WAF
     * to search for, such as <code>B[a@]dB[o0]t</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the regular expression (regex) patterns that you want
     *         AWS WAF to search for, such as <code>B[a@]dB[o0]t</code>.
     *         </p>
     */
    public java.util.List<String> getRegexPatternStrings() {
        return regexPatternStrings;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) patterns that you want AWS WAF
     * to search for, such as <code>B[a@]dB[o0]t</code>.
     * </p>
     *
     * @param regexPatternStrings <p>
     *            Specifies the regular expression (regex) patterns that you
     *            want AWS WAF to search for, such as <code>B[a@]dB[o0]t</code>.
     *            </p>
     */
    public void setRegexPatternStrings(java.util.Collection<String> regexPatternStrings) {
        if (regexPatternStrings == null) {
            this.regexPatternStrings = null;
            return;
        }

        this.regexPatternStrings = new java.util.ArrayList<String>(regexPatternStrings);
    }

    /**
     * <p>
     * Specifies the regular expression (regex) patterns that you want AWS WAF
     * to search for, such as <code>B[a@]dB[o0]t</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regexPatternStrings <p>
     *            Specifies the regular expression (regex) patterns that you
     *            want AWS WAF to search for, such as <code>B[a@]dB[o0]t</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegexPatternSet withRegexPatternStrings(String... regexPatternStrings) {
        if (getRegexPatternStrings() == null) {
            this.regexPatternStrings = new java.util.ArrayList<String>(regexPatternStrings.length);
        }
        for (String value : regexPatternStrings) {
            this.regexPatternStrings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) patterns that you want AWS WAF
     * to search for, such as <code>B[a@]dB[o0]t</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regexPatternStrings <p>
     *            Specifies the regular expression (regex) patterns that you
     *            want AWS WAF to search for, such as <code>B[a@]dB[o0]t</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegexPatternSet withRegexPatternStrings(java.util.Collection<String> regexPatternStrings) {
        setRegexPatternStrings(regexPatternStrings);
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
        if (getRegexPatternSetId() != null)
            sb.append("RegexPatternSetId: " + getRegexPatternSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRegexPatternStrings() != null)
            sb.append("RegexPatternStrings: " + getRegexPatternStrings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegexPatternSetId() == null) ? 0 : getRegexPatternSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getRegexPatternStrings() == null) ? 0 : getRegexPatternStrings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegexPatternSet == false)
            return false;
        RegexPatternSet other = (RegexPatternSet) obj;

        if (other.getRegexPatternSetId() == null ^ this.getRegexPatternSetId() == null)
            return false;
        if (other.getRegexPatternSetId() != null
                && other.getRegexPatternSetId().equals(this.getRegexPatternSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegexPatternStrings() == null ^ this.getRegexPatternStrings() == null)
            return false;
        if (other.getRegexPatternStrings() != null
                && other.getRegexPatternStrings().equals(this.getRegexPatternStrings()) == false)
            return false;
        return true;
    }
}
