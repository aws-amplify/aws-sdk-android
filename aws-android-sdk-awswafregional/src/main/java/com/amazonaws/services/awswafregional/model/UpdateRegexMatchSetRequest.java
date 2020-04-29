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
 * Inserts or deletes <a>RegexMatchTuple</a> objects (filters) in a
 * <a>RegexMatchSet</a>. For each <code>RegexMatchSetUpdate</code> object, you
 * specify the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether to insert or delete the object from the array. If you want to change
 * a <code>RegexMatchSetUpdate</code> object, you delete the existing object and
 * add a new one.
 * </p>
 * </li>
 * <li>
 * <p>
 * The part of a web request that you want AWS WAF to inspectupdate, such as a
 * query string or the value of the <code>User-Agent</code> header.
 * </p>
 * </li>
 * <li>
 * <p>
 * The identifier of the pattern (a regular expression) that you want AWS WAF to
 * look for. For more information, see <a>RegexPatternSet</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Whether to perform any conversions on the request, such as converting it to
 * lowercase, before inspecting it for the specified string.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For example, you can create a <code>RegexPatternSet</code> that matches any
 * requests with <code>User-Agent</code> headers that contain the string
 * <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those
 * requests.
 * </p>
 * <p>
 * To create and configure a <code>RegexMatchSet</code>, perform the following
 * steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create a <code>RegexMatchSet.</code> For more information, see
 * <a>CreateRegexMatchSet</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <a>GetChangeToken</a> to get the change token that you provide in the
 * <code>ChangeToken</code> parameter of an <code>UpdateRegexMatchSet</code>
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit an <code>UpdateRegexMatchSet</code> request to specify the part of the
 * request that you want AWS WAF to inspect (for example, the header or the URI)
 * and the identifier of the <code>RegexPatternSet</code> that contain the
 * regular expression patters you want AWS WAF to watch for.
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
public class UpdateRegexMatchSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you
     * want to update. <code>RegexMatchSetId</code> is returned by
     * <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String regexMatchSetId;

    /**
     * <p>
     * An array of <code>RegexMatchSetUpdate</code> objects that you want to
     * insert into or delete from a <a>RegexMatchSet</a>. For more information,
     * see <a>RegexMatchTuple</a>.
     * </p>
     */
    private java.util.List<RegexMatchSetUpdate> updates;

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
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you
     * want to update. <code>RegexMatchSetId</code> is returned by
     * <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that
     *         you want to update. <code>RegexMatchSetId</code> is returned by
     *         <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     *         </p>
     */
    public String getRegexMatchSetId() {
        return regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you
     * want to update. <code>RegexMatchSetId</code> is returned by
     * <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param regexMatchSetId <p>
     *            The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a>
     *            that you want to update. <code>RegexMatchSetId</code> is
     *            returned by <a>CreateRegexMatchSet</a> and by
     *            <a>ListRegexMatchSets</a>.
     *            </p>
     */
    public void setRegexMatchSetId(String regexMatchSetId) {
        this.regexMatchSetId = regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you
     * want to update. <code>RegexMatchSetId</code> is returned by
     * <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
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
     *            The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a>
     *            that you want to update. <code>RegexMatchSetId</code> is
     *            returned by <a>CreateRegexMatchSet</a> and by
     *            <a>ListRegexMatchSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRegexMatchSetRequest withRegexMatchSetId(String regexMatchSetId) {
        this.regexMatchSetId = regexMatchSetId;
        return this;
    }

    /**
     * <p>
     * An array of <code>RegexMatchSetUpdate</code> objects that you want to
     * insert into or delete from a <a>RegexMatchSet</a>. For more information,
     * see <a>RegexMatchTuple</a>.
     * </p>
     *
     * @return <p>
     *         An array of <code>RegexMatchSetUpdate</code> objects that you
     *         want to insert into or delete from a <a>RegexMatchSet</a>. For
     *         more information, see <a>RegexMatchTuple</a>.
     *         </p>
     */
    public java.util.List<RegexMatchSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>RegexMatchSetUpdate</code> objects that you want to
     * insert into or delete from a <a>RegexMatchSet</a>. For more information,
     * see <a>RegexMatchTuple</a>.
     * </p>
     *
     * @param updates <p>
     *            An array of <code>RegexMatchSetUpdate</code> objects that you
     *            want to insert into or delete from a <a>RegexMatchSet</a>. For
     *            more information, see <a>RegexMatchTuple</a>.
     *            </p>
     */
    public void setUpdates(java.util.Collection<RegexMatchSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<RegexMatchSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>RegexMatchSetUpdate</code> objects that you want to
     * insert into or delete from a <a>RegexMatchSet</a>. For more information,
     * see <a>RegexMatchTuple</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>RegexMatchSetUpdate</code> objects that you
     *            want to insert into or delete from a <a>RegexMatchSet</a>. For
     *            more information, see <a>RegexMatchTuple</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRegexMatchSetRequest withUpdates(RegexMatchSetUpdate... updates) {
        if (getUpdates() == null) {
            this.updates = new java.util.ArrayList<RegexMatchSetUpdate>(updates.length);
        }
        for (RegexMatchSetUpdate value : updates) {
            this.updates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>RegexMatchSetUpdate</code> objects that you want to
     * insert into or delete from a <a>RegexMatchSet</a>. For more information,
     * see <a>RegexMatchTuple</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>RegexMatchSetUpdate</code> objects that you
     *            want to insert into or delete from a <a>RegexMatchSet</a>. For
     *            more information, see <a>RegexMatchTuple</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRegexMatchSetRequest withUpdates(java.util.Collection<RegexMatchSetUpdate> updates) {
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
    public UpdateRegexMatchSetRequest withChangeToken(String changeToken) {
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
        if (getRegexMatchSetId() != null)
            sb.append("RegexMatchSetId: " + getRegexMatchSetId() + ",");
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
                + ((getRegexMatchSetId() == null) ? 0 : getRegexMatchSetId().hashCode());
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

        if (obj instanceof UpdateRegexMatchSetRequest == false)
            return false;
        UpdateRegexMatchSetRequest other = (UpdateRegexMatchSetRequest) obj;

        if (other.getRegexMatchSetId() == null ^ this.getRegexMatchSetId() == null)
            return false;
        if (other.getRegexMatchSetId() != null
                && other.getRegexMatchSetId().equals(this.getRegexMatchSetId()) == false)
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
