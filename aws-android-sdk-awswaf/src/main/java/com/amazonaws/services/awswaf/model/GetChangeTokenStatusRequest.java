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
 * Returns the status of a <code>ChangeToken</code> that you got by calling
 * <a>GetChangeToken</a>. <code>ChangeTokenStatus</code> is one of the following
 * values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>PROVISIONED</code>: You requested the change token by calling
 * <code>GetChangeToken</code>, but you haven't used it yet in a call to create,
 * update, or delete an AWS WAF object.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PENDING</code>: AWS WAF is propagating the create, update, or delete
 * request to all AWS WAF servers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>INSYNC</code>: Propagation is complete.
 * </p>
 * </li>
 * </ul>
 */
public class GetChangeTokenStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The change token for which you want to get the status. This change token
     * was previously returned in the <code>GetChangeToken</code> response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String changeToken;

    /**
     * <p>
     * The change token for which you want to get the status. This change token
     * was previously returned in the <code>GetChangeToken</code> response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The change token for which you want to get the status. This
     *         change token was previously returned in the
     *         <code>GetChangeToken</code> response.
     *         </p>
     */
    public String getChangeToken() {
        return changeToken;
    }

    /**
     * <p>
     * The change token for which you want to get the status. This change token
     * was previously returned in the <code>GetChangeToken</code> response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The change token for which you want to get the status. This
     *            change token was previously returned in the
     *            <code>GetChangeToken</code> response.
     *            </p>
     */
    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The change token for which you want to get the status. This change token
     * was previously returned in the <code>GetChangeToken</code> response.
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
     *            The change token for which you want to get the status. This
     *            change token was previously returned in the
     *            <code>GetChangeToken</code> response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetChangeTokenStatusRequest withChangeToken(String changeToken) {
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
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChangeTokenStatusRequest == false)
            return false;
        GetChangeTokenStatusRequest other = (GetChangeTokenStatusRequest) obj;

        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }
}
