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
 * Inserts or deletes <a>SizeConstraint</a> objects (filters) in a
 * <a>SizeConstraintSet</a>. For each <code>SizeConstraint</code> object, you
 * specify the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether to insert or delete the object from the array. If you want to change
 * a <code>SizeConstraintSetUpdate</code> object, you delete the existing object
 * and add a new one.
 * </p>
 * </li>
 * <li>
 * <p>
 * The part of a web request that you want AWS WAF to evaluate, such as the
 * length of a query string or the length of the <code>User-Agent</code> header.
 * </p>
 * </li>
 * <li>
 * <p>
 * Whether to perform any transformations on the request, such as converting it
 * to lowercase, before checking its length. Note that transformations of the
 * request body are not supported because the AWS resource forwards only the
 * first <code>8192</code> bytes of your request to AWS WAF.
 * </p>
 * <p>
 * You can only specify a single type of TextTransformation.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <code>ComparisonOperator</code> used for evaluating the selected part of
 * the request against the specified <code>Size</code>, such as equals, greater
 * than, less than, and so on.
 * </p>
 * </li>
 * <li>
 * <p>
 * The length, in bytes, that you want AWS WAF to watch for in selected part of
 * the request. The length is computed after applying the transformation.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For example, you can add a <code>SizeConstraintSetUpdate</code> object that
 * matches web requests in which the length of the <code>User-Agent</code>
 * header is greater than 100 bytes. You can then configure AWS WAF to block
 * those requests.
 * </p>
 * <p>
 * To create and configure a <code>SizeConstraintSet</code>, perform the
 * following steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create a <code>SizeConstraintSet.</code> For more information, see
 * <a>CreateSizeConstraintSet</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <a>GetChangeToken</a> to get the change token that you provide in the
 * <code>ChangeToken</code> parameter of an <code>UpdateSizeConstraintSet</code>
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit an <code>UpdateSizeConstraintSet</code> request to specify the part of
 * the request that you want AWS WAF to inspect (for example, the header or the
 * URI) and the value that you want AWS WAF to watch for.
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
public class UpdateSizeConstraintSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that
     * you want to update. <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String sizeConstraintSetId;

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
     * An array of <code>SizeConstraintSetUpdate</code> objects that you want to
     * insert into or delete from a <a>SizeConstraintSet</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SizeConstraintSetUpdate</a>: Contains <code>Action</code> and
     * <code>SizeConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     * <code>TextTransformation</code>, <code>ComparisonOperator</code>, and
     * <code>Size</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<SizeConstraintSetUpdate> updates;

    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that
     * you want to update. <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>SizeConstraintSetId</code> of the
     *         <a>SizeConstraintSet</a> that you want to update.
     *         <code>SizeConstraintSetId</code> is returned by
     *         <a>CreateSizeConstraintSet</a> and by
     *         <a>ListSizeConstraintSets</a>.
     *         </p>
     */
    public String getSizeConstraintSetId() {
        return sizeConstraintSetId;
    }

    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that
     * you want to update. <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sizeConstraintSetId <p>
     *            The <code>SizeConstraintSetId</code> of the
     *            <a>SizeConstraintSet</a> that you want to update.
     *            <code>SizeConstraintSetId</code> is returned by
     *            <a>CreateSizeConstraintSet</a> and by
     *            <a>ListSizeConstraintSets</a>.
     *            </p>
     */
    public void setSizeConstraintSetId(String sizeConstraintSetId) {
        this.sizeConstraintSetId = sizeConstraintSetId;
    }

    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that
     * you want to update. <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sizeConstraintSetId <p>
     *            The <code>SizeConstraintSetId</code> of the
     *            <a>SizeConstraintSet</a> that you want to update.
     *            <code>SizeConstraintSetId</code> is returned by
     *            <a>CreateSizeConstraintSet</a> and by
     *            <a>ListSizeConstraintSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSizeConstraintSetRequest withSizeConstraintSetId(String sizeConstraintSetId) {
        this.sizeConstraintSetId = sizeConstraintSetId;
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
    public UpdateSizeConstraintSetRequest withChangeToken(String changeToken) {
        this.changeToken = changeToken;
        return this;
    }

    /**
     * <p>
     * An array of <code>SizeConstraintSetUpdate</code> objects that you want to
     * insert into or delete from a <a>SizeConstraintSet</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SizeConstraintSetUpdate</a>: Contains <code>Action</code> and
     * <code>SizeConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     * <code>TextTransformation</code>, <code>ComparisonOperator</code>, and
     * <code>Size</code>
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
     *         An array of <code>SizeConstraintSetUpdate</code> objects that you
     *         want to insert into or delete from a <a>SizeConstraintSet</a>.
     *         For more information, see the applicable data types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>SizeConstraintSetUpdate</a>: Contains <code>Action</code> and
     *         <code>SizeConstraint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     *         <code>TextTransformation</code>, <code>ComparisonOperator</code>,
     *         and <code>Size</code>
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
    public java.util.List<SizeConstraintSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>SizeConstraintSetUpdate</code> objects that you want to
     * insert into or delete from a <a>SizeConstraintSet</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SizeConstraintSetUpdate</a>: Contains <code>Action</code> and
     * <code>SizeConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     * <code>TextTransformation</code>, <code>ComparisonOperator</code>, and
     * <code>Size</code>
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
     *            An array of <code>SizeConstraintSetUpdate</code> objects that
     *            you want to insert into or delete from a
     *            <a>SizeConstraintSet</a>. For more information, see the
     *            applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>SizeConstraintSetUpdate</a>: Contains <code>Action</code>
     *            and <code>SizeConstraint</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     *            <code>TextTransformation</code>,
     *            <code>ComparisonOperator</code>, and <code>Size</code>
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
    public void setUpdates(java.util.Collection<SizeConstraintSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<SizeConstraintSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>SizeConstraintSetUpdate</code> objects that you want to
     * insert into or delete from a <a>SizeConstraintSet</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SizeConstraintSetUpdate</a>: Contains <code>Action</code> and
     * <code>SizeConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     * <code>TextTransformation</code>, <code>ComparisonOperator</code>, and
     * <code>Size</code>
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
     *            An array of <code>SizeConstraintSetUpdate</code> objects that
     *            you want to insert into or delete from a
     *            <a>SizeConstraintSet</a>. For more information, see the
     *            applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>SizeConstraintSetUpdate</a>: Contains <code>Action</code>
     *            and <code>SizeConstraint</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     *            <code>TextTransformation</code>,
     *            <code>ComparisonOperator</code>, and <code>Size</code>
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
    public UpdateSizeConstraintSetRequest withUpdates(SizeConstraintSetUpdate... updates) {
        if (getUpdates() == null) {
            this.updates = new java.util.ArrayList<SizeConstraintSetUpdate>(updates.length);
        }
        for (SizeConstraintSetUpdate value : updates) {
            this.updates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>SizeConstraintSetUpdate</code> objects that you want to
     * insert into or delete from a <a>SizeConstraintSet</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SizeConstraintSetUpdate</a>: Contains <code>Action</code> and
     * <code>SizeConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     * <code>TextTransformation</code>, <code>ComparisonOperator</code>, and
     * <code>Size</code>
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
     *            An array of <code>SizeConstraintSetUpdate</code> objects that
     *            you want to insert into or delete from a
     *            <a>SizeConstraintSet</a>. For more information, see the
     *            applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>SizeConstraintSetUpdate</a>: Contains <code>Action</code>
     *            and <code>SizeConstraint</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     *            <code>TextTransformation</code>,
     *            <code>ComparisonOperator</code>, and <code>Size</code>
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
    public UpdateSizeConstraintSetRequest withUpdates(
            java.util.Collection<SizeConstraintSetUpdate> updates) {
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
        if (getSizeConstraintSetId() != null)
            sb.append("SizeConstraintSetId: " + getSizeConstraintSetId() + ",");
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
                + ((getSizeConstraintSetId() == null) ? 0 : getSizeConstraintSetId().hashCode());
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

        if (obj instanceof UpdateSizeConstraintSetRequest == false)
            return false;
        UpdateSizeConstraintSetRequest other = (UpdateSizeConstraintSetRequest) obj;

        if (other.getSizeConstraintSetId() == null ^ this.getSizeConstraintSetId() == null)
            return false;
        if (other.getSizeConstraintSetId() != null
                && other.getSizeConstraintSetId().equals(this.getSizeConstraintSetId()) == false)
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
