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
 * Creates a new version of an existing traffic policy. When you create a new
 * version of a traffic policy, you specify the ID of the traffic policy that
 * you want to update and a JSON-formatted document that describes the new
 * version. You use traffic policies to create multiple DNS resource record sets
 * for one domain name (such as example.com) or one subdomain name (such as
 * www.example.com). You can create a maximum of 1000 versions of a traffic
 * policy. If you reach the limit and need to create another version, you'll
 * need to start a new traffic policy.
 * </p>
 */
public class CreateTrafficPolicyVersionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the traffic policy for which you want to create a new version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String id;

    /**
     * <p>
     * The definition of this version of the traffic policy, in JSON format. You
     * specified the JSON in the <code>CreateTrafficPolicyVersion</code>
     * request. For more information about the JSON format, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicy.html"
     * >CreateTrafficPolicy</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     */
    private String document;

    /**
     * <p>
     * The comment that you specified in the
     * <code>CreateTrafficPolicyVersion</code> request, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String comment;

    /**
     * <p>
     * The ID of the traffic policy for which you want to create a new version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The ID of the traffic policy for which you want to create a new
     *         version.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the traffic policy for which you want to create a new version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID of the traffic policy for which you want to create a
     *            new version.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the traffic policy for which you want to create a new version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID of the traffic policy for which you want to create a
     *            new version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyVersionRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The definition of this version of the traffic policy, in JSON format. You
     * specified the JSON in the <code>CreateTrafficPolicyVersion</code>
     * request. For more information about the JSON format, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicy.html"
     * >CreateTrafficPolicy</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @return <p>
     *         The definition of this version of the traffic policy, in JSON
     *         format. You specified the JSON in the
     *         <code>CreateTrafficPolicyVersion</code> request. For more
     *         information about the JSON format, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicy.html"
     *         >CreateTrafficPolicy</a>.
     *         </p>
     */
    public String getDocument() {
        return document;
    }

    /**
     * <p>
     * The definition of this version of the traffic policy, in JSON format. You
     * specified the JSON in the <code>CreateTrafficPolicyVersion</code>
     * request. For more information about the JSON format, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicy.html"
     * >CreateTrafficPolicy</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @param document <p>
     *            The definition of this version of the traffic policy, in JSON
     *            format. You specified the JSON in the
     *            <code>CreateTrafficPolicyVersion</code> request. For more
     *            information about the JSON format, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicy.html"
     *            >CreateTrafficPolicy</a>.
     *            </p>
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The definition of this version of the traffic policy, in JSON format. You
     * specified the JSON in the <code>CreateTrafficPolicyVersion</code>
     * request. For more information about the JSON format, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicy.html"
     * >CreateTrafficPolicy</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @param document <p>
     *            The definition of this version of the traffic policy, in JSON
     *            format. You specified the JSON in the
     *            <code>CreateTrafficPolicyVersion</code> request. For more
     *            information about the JSON format, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicy.html"
     *            >CreateTrafficPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyVersionRequest withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * <p>
     * The comment that you specified in the
     * <code>CreateTrafficPolicyVersion</code> request, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The comment that you specified in the
     *         <code>CreateTrafficPolicyVersion</code> request, if any.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * The comment that you specified in the
     * <code>CreateTrafficPolicyVersion</code> request, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param comment <p>
     *            The comment that you specified in the
     *            <code>CreateTrafficPolicyVersion</code> request, if any.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment that you specified in the
     * <code>CreateTrafficPolicyVersion</code> request, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param comment <p>
     *            The comment that you specified in the
     *            <code>CreateTrafficPolicyVersion</code> request, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyVersionRequest withComment(String comment) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
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

        if (obj instanceof CreateTrafficPolicyVersionRequest == false)
            return false;
        CreateTrafficPolicyVersionRequest other = (CreateTrafficPolicyVersionRequest) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
