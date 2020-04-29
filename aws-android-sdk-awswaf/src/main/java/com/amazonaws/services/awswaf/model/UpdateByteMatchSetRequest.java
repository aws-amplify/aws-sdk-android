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
 * Inserts or deletes <a>ByteMatchTuple</a> objects (filters) in a
 * <a>ByteMatchSet</a>. For each <code>ByteMatchTuple</code> object, you specify
 * the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether to insert or delete the object from the array. If you want to change
 * a <code>ByteMatchSetUpdate</code> object, you delete the existing object and
 * add a new one.
 * </p>
 * </li>
 * <li>
 * <p>
 * The part of a web request that you want AWS WAF to inspect, such as a query
 * string or the value of the <code>User-Agent</code> header.
 * </p>
 * </li>
 * <li>
 * <p>
 * The bytes (typically a string that corresponds with ASCII characters) that
 * you want AWS WAF to look for. For more information, including how you specify
 * the values for the AWS WAF API and the AWS CLI or SDKs, see
 * <code>TargetString</code> in the <a>ByteMatchTuple</a> data type.
 * </p>
 * </li>
 * <li>
 * <p>
 * Where to look, such as at the beginning or the end of a query string.
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
 * For example, you can add a <code>ByteMatchSetUpdate</code> object that
 * matches web requests in which <code>User-Agent</code> headers contain the
 * string <code>BadBot</code>. You can then configure AWS WAF to block those
 * requests.
 * </p>
 * <p>
 * To create and configure a <code>ByteMatchSet</code>, perform the following
 * steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create a <code>ByteMatchSet.</code> For more information, see
 * <a>CreateByteMatchSet</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <a>GetChangeToken</a> to get the change token that you provide in the
 * <code>ChangeToken</code> parameter of an <code>UpdateByteMatchSet</code>
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit an <code>UpdateByteMatchSet</code> request to specify the part of the
 * request that you want AWS WAF to inspect (for example, the header or the URI)
 * and the value that you want AWS WAF to watch for.
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
public class UpdateByteMatchSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a> that you want
     * to update. <code>ByteMatchSetId</code> is returned by
     * <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String byteMatchSetId;

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
     * An array of <code>ByteMatchSetUpdate</code> objects that you want to
     * insert into or delete from a <a>ByteMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ByteMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>ByteMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ByteMatchTuple</a>: Contains <code>FieldToMatch</code>,
     * <code>PositionalConstraint</code>, <code>TargetString</code>, and
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
    private java.util.List<ByteMatchSetUpdate> updates;

    /**
     * <p>
     * The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a> that you want
     * to update. <code>ByteMatchSetId</code> is returned by
     * <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a> that
     *         you want to update. <code>ByteMatchSetId</code> is returned by
     *         <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     *         </p>
     */
    public String getByteMatchSetId() {
        return byteMatchSetId;
    }

    /**
     * <p>
     * The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a> that you want
     * to update. <code>ByteMatchSetId</code> is returned by
     * <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param byteMatchSetId <p>
     *            The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a>
     *            that you want to update. <code>ByteMatchSetId</code> is
     *            returned by <a>CreateByteMatchSet</a> and by
     *            <a>ListByteMatchSets</a>.
     *            </p>
     */
    public void setByteMatchSetId(String byteMatchSetId) {
        this.byteMatchSetId = byteMatchSetId;
    }

    /**
     * <p>
     * The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a> that you want
     * to update. <code>ByteMatchSetId</code> is returned by
     * <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param byteMatchSetId <p>
     *            The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a>
     *            that you want to update. <code>ByteMatchSetId</code> is
     *            returned by <a>CreateByteMatchSet</a> and by
     *            <a>ListByteMatchSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateByteMatchSetRequest withByteMatchSetId(String byteMatchSetId) {
        this.byteMatchSetId = byteMatchSetId;
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
    public UpdateByteMatchSetRequest withChangeToken(String changeToken) {
        this.changeToken = changeToken;
        return this;
    }

    /**
     * <p>
     * An array of <code>ByteMatchSetUpdate</code> objects that you want to
     * insert into or delete from a <a>ByteMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ByteMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>ByteMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ByteMatchTuple</a>: Contains <code>FieldToMatch</code>,
     * <code>PositionalConstraint</code>, <code>TargetString</code>, and
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
     *         An array of <code>ByteMatchSetUpdate</code> objects that you want
     *         to insert into or delete from a <a>ByteMatchSet</a>. For more
     *         information, see the applicable data types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>ByteMatchSetUpdate</a>: Contains <code>Action</code> and
     *         <code>ByteMatchTuple</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ByteMatchTuple</a>: Contains <code>FieldToMatch</code>,
     *         <code>PositionalConstraint</code>, <code>TargetString</code>, and
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
    public java.util.List<ByteMatchSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>ByteMatchSetUpdate</code> objects that you want to
     * insert into or delete from a <a>ByteMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ByteMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>ByteMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ByteMatchTuple</a>: Contains <code>FieldToMatch</code>,
     * <code>PositionalConstraint</code>, <code>TargetString</code>, and
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
     *            An array of <code>ByteMatchSetUpdate</code> objects that you
     *            want to insert into or delete from a <a>ByteMatchSet</a>. For
     *            more information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ByteMatchSetUpdate</a>: Contains <code>Action</code> and
     *            <code>ByteMatchTuple</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ByteMatchTuple</a>: Contains <code>FieldToMatch</code>,
     *            <code>PositionalConstraint</code>, <code>TargetString</code>,
     *            and <code>TextTransformation</code>
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
    public void setUpdates(java.util.Collection<ByteMatchSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<ByteMatchSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>ByteMatchSetUpdate</code> objects that you want to
     * insert into or delete from a <a>ByteMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ByteMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>ByteMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ByteMatchTuple</a>: Contains <code>FieldToMatch</code>,
     * <code>PositionalConstraint</code>, <code>TargetString</code>, and
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
     *            An array of <code>ByteMatchSetUpdate</code> objects that you
     *            want to insert into or delete from a <a>ByteMatchSet</a>. For
     *            more information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ByteMatchSetUpdate</a>: Contains <code>Action</code> and
     *            <code>ByteMatchTuple</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ByteMatchTuple</a>: Contains <code>FieldToMatch</code>,
     *            <code>PositionalConstraint</code>, <code>TargetString</code>,
     *            and <code>TextTransformation</code>
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
    public UpdateByteMatchSetRequest withUpdates(ByteMatchSetUpdate... updates) {
        if (getUpdates() == null) {
            this.updates = new java.util.ArrayList<ByteMatchSetUpdate>(updates.length);
        }
        for (ByteMatchSetUpdate value : updates) {
            this.updates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ByteMatchSetUpdate</code> objects that you want to
     * insert into or delete from a <a>ByteMatchSet</a>. For more information,
     * see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ByteMatchSetUpdate</a>: Contains <code>Action</code> and
     * <code>ByteMatchTuple</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ByteMatchTuple</a>: Contains <code>FieldToMatch</code>,
     * <code>PositionalConstraint</code>, <code>TargetString</code>, and
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
     *            An array of <code>ByteMatchSetUpdate</code> objects that you
     *            want to insert into or delete from a <a>ByteMatchSet</a>. For
     *            more information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ByteMatchSetUpdate</a>: Contains <code>Action</code> and
     *            <code>ByteMatchTuple</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ByteMatchTuple</a>: Contains <code>FieldToMatch</code>,
     *            <code>PositionalConstraint</code>, <code>TargetString</code>,
     *            and <code>TextTransformation</code>
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
    public UpdateByteMatchSetRequest withUpdates(java.util.Collection<ByteMatchSetUpdate> updates) {
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
        if (getByteMatchSetId() != null)
            sb.append("ByteMatchSetId: " + getByteMatchSetId() + ",");
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
                + ((getByteMatchSetId() == null) ? 0 : getByteMatchSetId().hashCode());
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

        if (obj instanceof UpdateByteMatchSetRequest == false)
            return false;
        UpdateByteMatchSetRequest other = (UpdateByteMatchSetRequest) obj;

        if (other.getByteMatchSetId() == null ^ this.getByteMatchSetId() == null)
            return false;
        if (other.getByteMatchSetId() != null
                && other.getByteMatchSetId().equals(this.getByteMatchSetId()) == false)
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
