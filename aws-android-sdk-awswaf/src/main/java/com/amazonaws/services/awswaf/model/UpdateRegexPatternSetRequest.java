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

import com.amazonaws.AmazonWebServiceRequest;

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
 * Inserts or deletes <code>RegexPatternString</code> objects in a
 * <a>RegexPatternSet</a>. For each <code>RegexPatternString</code> object, you
 * specify the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether to insert or delete the <code>RegexPatternString</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The regular expression pattern that you want to insert or delete. For more
 * information, see <a>RegexPatternSet</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For example, you can create a <code>RegexPatternString</code> such as
 * <code>B[a@]dB[o0]t</code>. AWS WAF will match this
 * <code>RegexPatternString</code> to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * BadBot
 * </p>
 * </li>
 * <li>
 * <p>
 * BadB0t
 * </p>
 * </li>
 * <li>
 * <p>
 * B@dBot
 * </p>
 * </li>
 * <li>
 * <p>
 * B@dB0t
 * </p>
 * </li>
 * </ul>
 * <p>
 * To create and configure a <code>RegexPatternSet</code>, perform the following
 * steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create a <code>RegexPatternSet.</code> For more information, see
 * <a>CreateRegexPatternSet</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <a>GetChangeToken</a> to get the change token that you provide in the
 * <code>ChangeToken</code> parameter of an <code>UpdateRegexPatternSet</code>
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit an <code>UpdateRegexPatternSet</code> request to specify the regular
 * expression pattern that you want AWS WAF to watch for.
 * </p>
 * </li>
 * </ol>
 * <p>
 * For more information about how to use the AWS WAF API to allow or block HTTP
 * requests, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
 * Developer Guide</a>.
 * </p>
 */
public class UpdateRegexPatternSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you
     * want to update. <code>RegexPatternSetId</code> is returned by
     * <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String regexPatternSetId;

    /**
     * <p>
     * An array of <code>RegexPatternSetUpdate</code> objects that you want to
     * insert into or delete from a <a>RegexPatternSet</a>.
     * </p>
     */
    private java.util.List<RegexPatternSetUpdate> updates;

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String changeToken;

    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you
     * want to update. <code>RegexPatternSetId</code> is returned by
     * <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a>
     *         that you want to update. <code>RegexPatternSetId</code> is
     *         returned by <a>CreateRegexPatternSet</a> and by
     *         <a>ListRegexPatternSets</a>.
     *         </p>
     */
    public String getRegexPatternSetId() {
        return regexPatternSetId;
    }

    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you
     * want to update. <code>RegexPatternSetId</code> is returned by
     * <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param regexPatternSetId <p>
     *            The <code>RegexPatternSetId</code> of the
     *            <a>RegexPatternSet</a> that you want to update.
     *            <code>RegexPatternSetId</code> is returned by
     *            <a>CreateRegexPatternSet</a> and by
     *            <a>ListRegexPatternSets</a>.
     *            </p>
     */
    public void setRegexPatternSetId(String regexPatternSetId) {
        this.regexPatternSetId = regexPatternSetId;
    }

    /**
     * <p>
     * The <code>RegexPatternSetId</code> of the <a>RegexPatternSet</a> that you
     * want to update. <code>RegexPatternSetId</code> is returned by
     * <a>CreateRegexPatternSet</a> and by <a>ListRegexPatternSets</a>.
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
     *            The <code>RegexPatternSetId</code> of the
     *            <a>RegexPatternSet</a> that you want to update.
     *            <code>RegexPatternSetId</code> is returned by
     *            <a>CreateRegexPatternSet</a> and by
     *            <a>ListRegexPatternSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRegexPatternSetRequest withRegexPatternSetId(String regexPatternSetId) {
        this.regexPatternSetId = regexPatternSetId;
        return this;
    }

    /**
     * <p>
     * An array of <code>RegexPatternSetUpdate</code> objects that you want to
     * insert into or delete from a <a>RegexPatternSet</a>.
     * </p>
     *
     * @return <p>
     *         An array of <code>RegexPatternSetUpdate</code> objects that you
     *         want to insert into or delete from a <a>RegexPatternSet</a>.
     *         </p>
     */
    public java.util.List<RegexPatternSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>RegexPatternSetUpdate</code> objects that you want to
     * insert into or delete from a <a>RegexPatternSet</a>.
     * </p>
     *
     * @param updates <p>
     *            An array of <code>RegexPatternSetUpdate</code> objects that
     *            you want to insert into or delete from a
     *            <a>RegexPatternSet</a>.
     *            </p>
     */
    public void setUpdates(java.util.Collection<RegexPatternSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<RegexPatternSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>RegexPatternSetUpdate</code> objects that you want to
     * insert into or delete from a <a>RegexPatternSet</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>RegexPatternSetUpdate</code> objects that
     *            you want to insert into or delete from a
     *            <a>RegexPatternSet</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRegexPatternSetRequest withUpdates(RegexPatternSetUpdate... updates) {
        if (getUpdates() == null) {
            this.updates = new java.util.ArrayList<RegexPatternSetUpdate>(updates.length);
        }
        for (RegexPatternSetUpdate value : updates) {
            this.updates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>RegexPatternSetUpdate</code> objects that you want to
     * insert into or delete from a <a>RegexPatternSet</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>RegexPatternSetUpdate</code> objects that
     *            you want to insert into or delete from a
     *            <a>RegexPatternSet</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRegexPatternSetRequest withUpdates(
            java.util.Collection<RegexPatternSetUpdate> updates) {
        setUpdates(updates);
        return this;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The value returned by the most recent call to
     *         <a>GetChangeToken</a>.
     *         </p>
     */
    public String getChangeToken() {
        return changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The value returned by the most recent call to
     *            <a>GetChangeToken</a>.
     *            </p>
     */
    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
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
     *            The value returned by the most recent call to
     *            <a>GetChangeToken</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRegexPatternSetRequest withChangeToken(String changeToken) {
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
        if (getRegexPatternSetId() != null)
            sb.append("RegexPatternSetId: " + getRegexPatternSetId() + ",");
        if (getUpdates() != null)
            sb.append("Updates: " + getUpdates() + ",");
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
                + ((getRegexPatternSetId() == null) ? 0 : getRegexPatternSetId().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
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

        if (obj instanceof UpdateRegexPatternSetRequest == false)
            return false;
        UpdateRegexPatternSetRequest other = (UpdateRegexPatternSetRequest) obj;

        if (other.getRegexPatternSetId() == null ^ this.getRegexPatternSetId() == null)
            return false;
        if (other.getRegexPatternSetId() != null
                && other.getRegexPatternSetId().equals(this.getRegexPatternSetId()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }
}
