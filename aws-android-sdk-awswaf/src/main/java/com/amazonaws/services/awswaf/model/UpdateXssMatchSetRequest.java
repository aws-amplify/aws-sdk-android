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
 * Inserts or deletes <a>XssMatchTuple</a> objects (filters) in an
 * <a>XssMatchSet</a>. For each <code>XssMatchTuple</code> object, you specify
 * the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Action</code>: Whether to insert the object into or delete the object
 * from the array. To change an <code>XssMatchTuple</code>, you delete the
 * existing object and add a new one.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF to
 * inspect and, if you want AWS WAF to inspect a header or custom query
 * parameter, the name of the header or parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TextTransformation</code>: Which text transformation, if any, to
 * perform on the web request before inspecting the request for cross-site
 * scripting attacks.
 * </p>
 * <p>
 * You can only specify a single type of TextTransformation.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You use <code>XssMatchSet</code> objects to specify which CloudFront requests
 * that you want to allow, block, or count. For example, if you're receiving
 * requests that contain cross-site scripting attacks in the request body and
 * you want to block the requests, you can create an <code>XssMatchSet</code>
 * with the applicable settings, and then configure AWS WAF to block the
 * requests.
 * </p>
 * <p>
 * To create and configure an <code>XssMatchSet</code>, perform the following
 * steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Submit a <a>CreateXssMatchSet</a> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <a>GetChangeToken</a> to get the change token that you provide in the
 * <code>ChangeToken</code> parameter of an <a>UpdateIPSet</a> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit an <code>UpdateXssMatchSet</code> request to specify the parts of web
 * requests that you want AWS WAF to inspect for cross-site scripting attacks.
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
public class UpdateXssMatchSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <code>XssMatchSet</code> that you
     * want to update. <code>XssMatchSetId</code> is returned by
     * <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String xssMatchSetId;

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
     * An array of <code>XssMatchSetUpdate</code> objects that you want to
     * insert into or delete from an <a>XssMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>XssMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<XssMatchSetUpdate> updates;

    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <code>XssMatchSet</code> that you
     * want to update. <code>XssMatchSetId</code> is returned by
     * <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>XssMatchSetId</code> of the <code>XssMatchSet</code>
     *         that you want to update. <code>XssMatchSetId</code> is returned
     *         by <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     *         </p>
     */
    public String getXssMatchSetId() {
        return xssMatchSetId;
    }

    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <code>XssMatchSet</code> that you
     * want to update. <code>XssMatchSetId</code> is returned by
     * <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param xssMatchSetId <p>
     *            The <code>XssMatchSetId</code> of the <code>XssMatchSet</code>
     *            that you want to update. <code>XssMatchSetId</code> is
     *            returned by <a>CreateXssMatchSet</a> and by
     *            <a>ListXssMatchSets</a>.
     *            </p>
     */
    public void setXssMatchSetId(String xssMatchSetId) {
        this.xssMatchSetId = xssMatchSetId;
    }

    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <code>XssMatchSet</code> that you
     * want to update. <code>XssMatchSetId</code> is returned by
     * <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param xssMatchSetId <p>
     *            The <code>XssMatchSetId</code> of the <code>XssMatchSet</code>
     *            that you want to update. <code>XssMatchSetId</code> is
     *            returned by <a>CreateXssMatchSet</a> and by
     *            <a>ListXssMatchSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateXssMatchSetRequest withXssMatchSetId(String xssMatchSetId) {
        this.xssMatchSetId = xssMatchSetId;
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
    public UpdateXssMatchSetRequest withChangeToken(String changeToken) {
        this.changeToken = changeToken;
        return this;
    }

    /**
     * <p>
     * An array of <code>XssMatchSetUpdate</code> objects that you want to
     * insert into or delete from an <a>XssMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>XssMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         An array of <code>XssMatchSetUpdate</code> objects that you want
     *         to insert into or delete from an <a>XssMatchSet</a>. For more
     *         information, see the applicable data types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>XssMatchSetUpdate</a>: Contains <code>Action</code> and
     *         <code>XssMatchTuple</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>XssMatchTuple</a>: Contains <code>FieldToMatch</code> and
     *         <code>TextTransformation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>FieldToMatch</a>: Contains <code>Data</code> and
     *         <code>Type</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<XssMatchSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>XssMatchSetUpdate</code> objects that you want to
     * insert into or delete from an <a>XssMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>XssMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param updates <p>
     *            An array of <code>XssMatchSetUpdate</code> objects that you
     *            want to insert into or delete from an <a>XssMatchSet</a>. For
     *            more information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>XssMatchSetUpdate</a>: Contains <code>Action</code> and
     *            <code>XssMatchTuple</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>XssMatchTuple</a>: Contains <code>FieldToMatch</code> and
     *            <code>TextTransformation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>FieldToMatch</a>: Contains <code>Data</code> and
     *            <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setUpdates(java.util.Collection<XssMatchSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<XssMatchSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>XssMatchSetUpdate</code> objects that you want to
     * insert into or delete from an <a>XssMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>XssMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>XssMatchSetUpdate</code> objects that you
     *            want to insert into or delete from an <a>XssMatchSet</a>. For
     *            more information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>XssMatchSetUpdate</a>: Contains <code>Action</code> and
     *            <code>XssMatchTuple</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>XssMatchTuple</a>: Contains <code>FieldToMatch</code> and
     *            <code>TextTransformation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>FieldToMatch</a>: Contains <code>Data</code> and
     *            <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateXssMatchSetRequest withUpdates(XssMatchSetUpdate... updates) {
        if (getUpdates() == null) {
            this.updates = new java.util.ArrayList<XssMatchSetUpdate>(updates.length);
        }
        for (XssMatchSetUpdate value : updates) {
            this.updates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>XssMatchSetUpdate</code> objects that you want to
     * insert into or delete from an <a>XssMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>XssMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>XssMatchSetUpdate</code> objects that you
     *            want to insert into or delete from an <a>XssMatchSet</a>. For
     *            more information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>XssMatchSetUpdate</a>: Contains <code>Action</code> and
     *            <code>XssMatchTuple</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>XssMatchTuple</a>: Contains <code>FieldToMatch</code> and
     *            <code>TextTransformation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>FieldToMatch</a>: Contains <code>Data</code> and
     *            <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateXssMatchSetRequest withUpdates(java.util.Collection<XssMatchSetUpdate> updates) {
        setUpdates(updates);
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
        if (getXssMatchSetId() != null)
            sb.append("XssMatchSetId: " + getXssMatchSetId() + ",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken() + ",");
        if (getUpdates() != null)
            sb.append("Updates: " + getUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getXssMatchSetId() == null) ? 0 : getXssMatchSetId().hashCode());
        hashCode = prime * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateXssMatchSetRequest == false)
            return false;
        UpdateXssMatchSetRequest other = (UpdateXssMatchSetRequest) obj;

        if (other.getXssMatchSetId() == null ^ this.getXssMatchSetId() == null)
            return false;
        if (other.getXssMatchSetId() != null
                && other.getXssMatchSetId().equals(this.getXssMatchSetId()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        return true;
    }
}
