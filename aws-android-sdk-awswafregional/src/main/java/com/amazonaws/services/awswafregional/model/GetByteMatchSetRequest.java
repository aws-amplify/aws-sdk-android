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
 * Returns the <a>ByteMatchSet</a> specified by <code>ByteMatchSetId</code>.
 * </p>
 */
public class GetByteMatchSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a> that you want
     * to get. <code>ByteMatchSetId</code> is returned by
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
     * The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a> that you want
     * to get. <code>ByteMatchSetId</code> is returned by
     * <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a> that
     *         you want to get. <code>ByteMatchSetId</code> is returned by
     *         <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     *         </p>
     */
    public String getByteMatchSetId() {
        return byteMatchSetId;
    }

    /**
     * <p>
     * The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a> that you want
     * to get. <code>ByteMatchSetId</code> is returned by
     * <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param byteMatchSetId <p>
     *            The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a>
     *            that you want to get. <code>ByteMatchSetId</code> is returned
     *            by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     *            </p>
     */
    public void setByteMatchSetId(String byteMatchSetId) {
        this.byteMatchSetId = byteMatchSetId;
    }

    /**
     * <p>
     * The <code>ByteMatchSetId</code> of the <a>ByteMatchSet</a> that you want
     * to get. <code>ByteMatchSetId</code> is returned by
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
     *            that you want to get. <code>ByteMatchSetId</code> is returned
     *            by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetByteMatchSetRequest withByteMatchSetId(String byteMatchSetId) {
        this.byteMatchSetId = byteMatchSetId;
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
            sb.append("ByteMatchSetId: " + getByteMatchSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getByteMatchSetId() == null) ? 0 : getByteMatchSetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetByteMatchSetRequest == false)
            return false;
        GetByteMatchSetRequest other = (GetByteMatchSetRequest) obj;

        if (other.getByteMatchSetId() == null ^ this.getByteMatchSetId() == null)
            return false;
        if (other.getByteMatchSetId() != null
                && other.getByteMatchSetId().equals(this.getByteMatchSetId()) == false)
            return false;
        return true;
    }
}
