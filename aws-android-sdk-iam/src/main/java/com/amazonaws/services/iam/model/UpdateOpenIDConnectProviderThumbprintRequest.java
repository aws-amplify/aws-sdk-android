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
 * Replaces the existing list of server certificate thumbprints associated with
 * an OpenID Connect (OIDC) provider resource object with a new list of
 * thumbprints.
 * </p>
 * <p>
 * The list that you pass with this operation completely replaces the existing
 * list of thumbprints. (The lists are not merged.)
 * </p>
 * <p>
 * Typically, you need to update a thumbprint only when the identity provider's
 * certificate changes, which occurs rarely. However, if the provider's
 * certificate <i>does</i> change, any attempt to assume an IAM role that
 * specifies the OIDC provider as a principal fails until the certificate
 * thumbprint is updated.
 * </p>
 * <note>
 * <p>
 * Trust for the OIDC provider is derived from the provider's certificate and is
 * validated by the thumbprint. Therefore, it is best to limit access to the
 * <code>UpdateOpenIDConnectProviderThumbprint</code> operation to highly
 * privileged users.
 * </p>
 * </note>
 */
public class UpdateOpenIDConnectProviderThumbprintRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource object
     * for which you want to update the thumbprint. You can get a list of OIDC
     * provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
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
     * A list of certificate thumbprints that are associated with the specified
     * IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     */
    private java.util.List<String> thumbprintList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource object
     * for which you want to update the thumbprint. You can get a list of OIDC
     * provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
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
     *         object for which you want to update the thumbprint. You can get a
     *         list of OIDC provider ARNs by using the
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
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource object
     * for which you want to update the thumbprint. You can get a list of OIDC
     * provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
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
     *            resource object for which you want to update the thumbprint.
     *            You can get a list of OIDC provider ARNs by using the
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
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource object
     * for which you want to update the thumbprint. You can get a list of OIDC
     * provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
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
     *            resource object for which you want to update the thumbprint.
     *            You can get a list of OIDC provider ARNs by using the
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
    public UpdateOpenIDConnectProviderThumbprintRequest withOpenIDConnectProviderArn(
            String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
        return this;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     *
     * @return <p>
     *         A list of certificate thumbprints that are associated with the
     *         specified IAM OpenID Connect provider. For more information, see
     *         <a>CreateOpenIDConnectProvider</a>.
     *         </p>
     */
    public java.util.List<String> getThumbprintList() {
        return thumbprintList;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     *
     * @param thumbprintList <p>
     *            A list of certificate thumbprints that are associated with the
     *            specified IAM OpenID Connect provider. For more information,
     *            see <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     */
    public void setThumbprintList(java.util.Collection<String> thumbprintList) {
        if (thumbprintList == null) {
            this.thumbprintList = null;
            return;
        }

        this.thumbprintList = new java.util.ArrayList<String>(thumbprintList);
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thumbprintList <p>
     *            A list of certificate thumbprints that are associated with the
     *            specified IAM OpenID Connect provider. For more information,
     *            see <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpenIDConnectProviderThumbprintRequest withThumbprintList(String... thumbprintList) {
        if (getThumbprintList() == null) {
            this.thumbprintList = new java.util.ArrayList<String>(thumbprintList.length);
        }
        for (String value : thumbprintList) {
            this.thumbprintList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thumbprintList <p>
     *            A list of certificate thumbprints that are associated with the
     *            specified IAM OpenID Connect provider. For more information,
     *            see <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOpenIDConnectProviderThumbprintRequest withThumbprintList(
            java.util.Collection<String> thumbprintList) {
        setThumbprintList(thumbprintList);
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
        if (getThumbprintList() != null)
            sb.append("ThumbprintList: " + getThumbprintList());
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
        hashCode = prime * hashCode
                + ((getThumbprintList() == null) ? 0 : getThumbprintList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOpenIDConnectProviderThumbprintRequest == false)
            return false;
        UpdateOpenIDConnectProviderThumbprintRequest other = (UpdateOpenIDConnectProviderThumbprintRequest) obj;

        if (other.getOpenIDConnectProviderArn() == null
                ^ this.getOpenIDConnectProviderArn() == null)
            return false;
        if (other.getOpenIDConnectProviderArn() != null
                && other.getOpenIDConnectProviderArn().equals(this.getOpenIDConnectProviderArn()) == false)
            return false;
        if (other.getThumbprintList() == null ^ this.getThumbprintList() == null)
            return false;
        if (other.getThumbprintList() != null
                && other.getThumbprintList().equals(this.getThumbprintList()) == false)
            return false;
        return true;
    }
}
