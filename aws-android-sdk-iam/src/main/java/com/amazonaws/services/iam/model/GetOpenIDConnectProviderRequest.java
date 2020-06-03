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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the specified OpenID Connect (OIDC) provider
 * resource object in IAM.
 * </p>
 */
public class GetOpenIDConnectProviderRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OIDC provider resource object in
     * IAM to get information for. You can get a list of OIDC provider resource
     * ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String openIDConnectProviderArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OIDC provider resource object in
     * IAM to get information for. You can get a list of OIDC provider resource
     * ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the OIDC provider resource
     *         object in IAM to get information for. You can get a list of OIDC
     *         provider resource ARNs by using the
     *         <a>ListOpenIDConnectProviders</a> operation.
     *         </p>
     *         <p>
     *         For more information about ARNs, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in
     *         the <i>AWS General Reference</i>.
     *         </p>
     */
    public String getOpenIDConnectProviderArn() {
        return openIDConnectProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OIDC provider resource object in
     * IAM to get information for. You can get a list of OIDC provider resource
     * ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param openIDConnectProviderArn <p>
     *            The Amazon Resource Name (ARN) of the OIDC provider resource
     *            object in IAM to get information for. You can get a list of
     *            OIDC provider resource ARNs by using the
     *            <a>ListOpenIDConnectProviders</a> operation.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     */
    public void setOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OIDC provider resource object in
     * IAM to get information for. You can get a list of OIDC provider resource
     * ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param openIDConnectProviderArn <p>
     *            The Amazon Resource Name (ARN) of the OIDC provider resource
     *            object in IAM to get information for. You can get a list of
     *            OIDC provider resource ARNs by using the
     *            <a>ListOpenIDConnectProviders</a> operation.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIDConnectProviderRequest withOpenIDConnectProviderArn(
            String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
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
        if (getOpenIDConnectProviderArn() != null)
            sb.append("OpenIDConnectProviderArn: " + getOpenIDConnectProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOpenIDConnectProviderArn() == null) ? 0 : getOpenIDConnectProviderArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpenIDConnectProviderRequest == false)
            return false;
        GetOpenIDConnectProviderRequest other = (GetOpenIDConnectProviderRequest) obj;

        if (other.getOpenIDConnectProviderArn() == null
                ^ this.getOpenIDConnectProviderArn() == null)
            return false;
        if (other.getOpenIDConnectProviderArn() != null
                && other.getOpenIDConnectProviderArn().equals(this.getOpenIDConnectProviderArn()) == false)
            return false;
        return true;
    }
}
