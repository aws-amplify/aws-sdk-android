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
 * When you want to create, update, or delete AWS WAF objects, get a change
 * token and include the change token in the create, update, or delete request.
 * Change tokens ensure that your application doesn't submit conflicting
 * requests to AWS WAF.
 * </p>
 * <p>
 * Each create, update, or delete request must use a unique change token. If
 * your application submits a <code>GetChangeToken</code> request and then
 * submits a second <code>GetChangeToken</code> request before submitting a
 * create, update, or delete request, the second <code>GetChangeToken</code>
 * request returns the same value as the first <code>GetChangeToken</code>
 * request.
 * </p>
 * <p>
 * When you use a change token in a create, update, or delete request, the
 * status of the change token changes to <code>PENDING</code>, which indicates
 * that AWS WAF is propagating the change to all AWS WAF servers. Use
 * <code>GetChangeTokenStatus</code> to determine the status of your change
 * token.
 * </p>
 */
public class GetChangeTokenRequest extends AmazonWebServiceRequest implements Serializable {
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
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChangeTokenRequest == false)
            return false;
        GetChangeTokenRequest other = (GetChangeTokenRequest) obj;

        return true;
    }
}
