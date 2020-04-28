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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a traffic policy, which you use to create multiple DNS resource
 * record sets for one domain name (such as example.com) or one subdomain name
 * (such as www.example.com).
 * </p>
 */
public class CreateTrafficPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     */
    private String name;

    /**
     * <p>
     * The definition of this traffic policy in JSON format. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     */
    private String document;

    /**
     * <p>
     * (Optional) Any comments that you want to include about the traffic
     * policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String comment;

    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @return <p>
     *         The name of the traffic policy.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param name <p>
     *            The name of the traffic policy.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param name <p>
     *            The name of the traffic policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The definition of this traffic policy in JSON format. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @return <p>
     *         The definition of this traffic policy in JSON format. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *         >Traffic Policy Document Format</a>.
     *         </p>
     */
    public String getDocument() {
        return document;
    }

    /**
     * <p>
     * The definition of this traffic policy in JSON format. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @param document <p>
     *            The definition of this traffic policy in JSON format. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *            >Traffic Policy Document Format</a>.
     *            </p>
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The definition of this traffic policy in JSON format. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @param document <p>
     *            The definition of this traffic policy in JSON format. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *            >Traffic Policy Document Format</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyRequest withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * <p>
     * (Optional) Any comments that you want to include about the traffic
     * policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         (Optional) Any comments that you want to include about the
     *         traffic policy.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * (Optional) Any comments that you want to include about the traffic
     * policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param comment <p>
     *            (Optional) Any comments that you want to include about the
     *            traffic policy.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * (Optional) Any comments that you want to include about the traffic
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param comment <p>
     *            (Optional) Any comments that you want to include about the
     *            traffic policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyRequest withComment(String comment) {
        this.comment = comment;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDocument() != null)
            sb.append("Document: " + getDocument() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrafficPolicyRequest == false)
            return false;
        CreateTrafficPolicyRequest other = (CreateTrafficPolicyRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}
