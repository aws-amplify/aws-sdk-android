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
 * Removes the specified client ID (also known as audience) from the list of
 * client IDs registered for the specified IAM OpenID Connect (OIDC) provider
 * resource object.
 * </p>
 * <p>
 * This operation is idempotent; it does not fail or return an error if you try
 * to remove a client ID that does not exist.
 * </p>
 */
public class RemoveClientIDFromOpenIDConnectProviderRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource to
     * remove the client ID from. You can get a list of OIDC provider ARNs by
     * using the <a>ListOpenIDConnectProviders</a> operation.
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
     * The client ID (also known as audience) to remove from the IAM OIDC
     * provider resource. For more information about client IDs, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String clientID;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource to
     * remove the client ID from. You can get a list of OIDC provider ARNs by
     * using the <a>ListOpenIDConnectProviders</a> operation.
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
     *         The Amazon Resource Name (ARN) of the IAM OIDC provider resource
     *         to remove the client ID from. You can get a list of OIDC provider
     *         ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
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
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource to
     * remove the client ID from. You can get a list of OIDC provider ARNs by
     * using the <a>ListOpenIDConnectProviders</a> operation.
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
     *            The Amazon Resource Name (ARN) of the IAM OIDC provider
     *            resource to remove the client ID from. You can get a list of
     *            OIDC provider ARNs by using the
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
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource to
     * remove the client ID from. You can get a list of OIDC provider ARNs by
     * using the <a>ListOpenIDConnectProviders</a> operation.
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
     *            The Amazon Resource Name (ARN) of the IAM OIDC provider
     *            resource to remove the client ID from. You can get a list of
     *            OIDC provider ARNs by using the
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
    public RemoveClientIDFromOpenIDConnectProviderRequest withOpenIDConnectProviderArn(
            String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
        return this;
    }

    /**
     * <p>
     * The client ID (also known as audience) to remove from the IAM OIDC
     * provider resource. For more information about client IDs, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The client ID (also known as audience) to remove from the IAM
     *         OIDC provider resource. For more information about client IDs,
     *         see <a>CreateOpenIDConnectProvider</a>.
     *         </p>
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * <p>
     * The client ID (also known as audience) to remove from the IAM OIDC
     * provider resource. For more information about client IDs, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param clientID <p>
     *            The client ID (also known as audience) to remove from the IAM
     *            OIDC provider resource. For more information about client IDs,
     *            see <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     */
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * <p>
     * The client ID (also known as audience) to remove from the IAM OIDC
     * provider resource. For more information about client IDs, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param clientID <p>
     *            The client ID (also known as audience) to remove from the IAM
     *            OIDC provider resource. For more information about client IDs,
     *            see <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveClientIDFromOpenIDConnectProviderRequest withClientID(String clientID) {
        this.clientID = clientID;
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
            sb.append("OpenIDConnectProviderArn: " + getOpenIDConnectProviderArn() + ",");
        if (getClientID() != null)
            sb.append("ClientID: " + getClientID());
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
        hashCode = prime * hashCode + ((getClientID() == null) ? 0 : getClientID().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveClientIDFromOpenIDConnectProviderRequest == false)
            return false;
        RemoveClientIDFromOpenIDConnectProviderRequest other = (RemoveClientIDFromOpenIDConnectProviderRequest) obj;

        if (other.getOpenIDConnectProviderArn() == null
                ^ this.getOpenIDConnectProviderArn() == null)
            return false;
        if (other.getOpenIDConnectProviderArn() != null
                && other.getOpenIDConnectProviderArn().equals(this.getOpenIDConnectProviderArn()) == false)
            return false;
        if (other.getClientID() == null ^ this.getClientID() == null)
            return false;
        if (other.getClientID() != null && other.getClientID().equals(this.getClientID()) == false)
            return false;
        return true;
    }
}
