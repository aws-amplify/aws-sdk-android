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
 * Returns the <a>XssMatchSet</a> that is specified by
 * <code>XssMatchSetId</code>.
 * </p>
 */
public class GetXssMatchSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you want to
     * get. <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a>
     * and by <a>ListXssMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String xssMatchSetId;

    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you want to
     * get. <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a>
     * and by <a>ListXssMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you
     *         want to get. <code>XssMatchSetId</code> is returned by
     *         <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     *         </p>
     */
    public String getXssMatchSetId() {
        return xssMatchSetId;
    }

    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you want to
     * get. <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a>
     * and by <a>ListXssMatchSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param xssMatchSetId <p>
     *            The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that
     *            you want to get. <code>XssMatchSetId</code> is returned by
     *            <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     *            </p>
     */
    public void setXssMatchSetId(String xssMatchSetId) {
        this.xssMatchSetId = xssMatchSetId;
    }

    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you want to
     * get. <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a>
     * and by <a>ListXssMatchSets</a>.
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
     *            The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that
     *            you want to get. <code>XssMatchSetId</code> is returned by
     *            <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetXssMatchSetRequest withXssMatchSetId(String xssMatchSetId) {
        this.xssMatchSetId = xssMatchSetId;
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
            sb.append("XssMatchSetId: " + getXssMatchSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getXssMatchSetId() == null) ? 0 : getXssMatchSetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetXssMatchSetRequest == false)
            return false;
        GetXssMatchSetRequest other = (GetXssMatchSetRequest) obj;

        if (other.getXssMatchSetId() == null ^ this.getXssMatchSetId() == null)
            return false;
        if (other.getXssMatchSetId() != null
                && other.getXssMatchSetId().equals(this.getXssMatchSetId()) == false)
            return false;
        return true;
    }
}
