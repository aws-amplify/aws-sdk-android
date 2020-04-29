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

public class GetWebACLForResourceResult implements Serializable {
    /**
     * <p>
     * Information about the web ACL that you specified in the
     * <code>GetWebACLForResource</code> request. If there is no associated
     * resource, a null WebACLSummary is returned.
     * </p>
     */
    private WebACLSummary webACLSummary;

    /**
     * <p>
     * Information about the web ACL that you specified in the
     * <code>GetWebACLForResource</code> request. If there is no associated
     * resource, a null WebACLSummary is returned.
     * </p>
     *
     * @return <p>
     *         Information about the web ACL that you specified in the
     *         <code>GetWebACLForResource</code> request. If there is no
     *         associated resource, a null WebACLSummary is returned.
     *         </p>
     */
    public WebACLSummary getWebACLSummary() {
        return webACLSummary;
    }

    /**
     * <p>
     * Information about the web ACL that you specified in the
     * <code>GetWebACLForResource</code> request. If there is no associated
     * resource, a null WebACLSummary is returned.
     * </p>
     *
     * @param webACLSummary <p>
     *            Information about the web ACL that you specified in the
     *            <code>GetWebACLForResource</code> request. If there is no
     *            associated resource, a null WebACLSummary is returned.
     *            </p>
     */
    public void setWebACLSummary(WebACLSummary webACLSummary) {
        this.webACLSummary = webACLSummary;
    }

    /**
     * <p>
     * Information about the web ACL that you specified in the
     * <code>GetWebACLForResource</code> request. If there is no associated
     * resource, a null WebACLSummary is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param webACLSummary <p>
     *            Information about the web ACL that you specified in the
     *            <code>GetWebACLForResource</code> request. If there is no
     *            associated resource, a null WebACLSummary is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetWebACLForResourceResult withWebACLSummary(WebACLSummary webACLSummary) {
        this.webACLSummary = webACLSummary;
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
        if (getWebACLSummary() != null)
            sb.append("WebACLSummary: " + getWebACLSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWebACLSummary() == null) ? 0 : getWebACLSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWebACLForResourceResult == false)
            return false;
        GetWebACLForResourceResult other = (GetWebACLForResourceResult) obj;

        if (other.getWebACLSummary() == null ^ this.getWebACLSummary() == null)
            return false;
        if (other.getWebACLSummary() != null
                && other.getWebACLSummary().equals(this.getWebACLSummary()) == false)
            return false;
        return true;
    }
}
