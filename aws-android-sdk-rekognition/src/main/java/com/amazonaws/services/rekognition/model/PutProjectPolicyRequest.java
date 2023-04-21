/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Attaches a project policy to a Amazon Rekognition Custom Labels project in a
 * trusting AWS account. A project policy specifies that a trusted AWS account
 * can copy a model version from a trusting AWS account to a project in the
 * trusted AWS account. To copy a model version you use the
 * <a>CopyProjectVersion</a> operation.
 * </p>
 * <p>
 * For more information about the format of a project policy document, see
 * Attaching a project policy (SDK) in the <i>Amazon Rekognition Custom Labels
 * Developer Guide</i>.
 * </p>
 * <p>
 * The response from <code>PutProjectPolicy</code> is a revision ID for the
 * project policy. You can attach multiple project policies to a project. You
 * can also update an existing project policy by specifying the policy revision
 * ID of the existing policy.
 * </p>
 * <p>
 * To remove a project policy from a project, call <a>DeleteProjectPolicy</a>.
 * To get a list of project policies attached to a project, call
 * <a>ListProjectPolicies</a>.
 * </p>
 * <p>
 * You copy a model version by calling <a>CopyProjectVersion</a>.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:PutProjectPolicy</code> action.
 * </p>
 */
public class PutProjectPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy is
     * attached to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String projectArn;

    /**
     * <p>
     * A name for the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String policyName;

    /**
     * <p>
     * The revision ID for the Project Policy. Each time you modify a policy,
     * Amazon Rekognition Custom Labels generates and assigns a new
     * <code>PolicyRevisionId</code> and then deletes the previous version of
     * the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[0-9A-Fa-f]+<br/>
     */
    private String policyRevisionId;

    /**
     * <p>
     * A resource policy to add to the model. The policy is a JSON structure
     * that contains one or more statements that define the policy. The policy
     * must follow the IAM syntax. For more information about the contents of a
     * JSON policy document, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON policy reference</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String policyDocument;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy is
     * attached to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the project that the project
     *         policy is attached to.
     *         </p>
     */
    public String getProjectArn() {
        return projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy is
     * attached to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectArn <p>
     *            The Amazon Resource Name (ARN) of the project that the project
     *            policy is attached to.
     *            </p>
     */
    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy is
     * attached to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectArn <p>
     *            The Amazon Resource Name (ARN) of the project that the project
     *            policy is attached to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutProjectPolicyRequest withProjectArn(String projectArn) {
        this.projectArn = projectArn;
        return this;
    }

    /**
     * <p>
     * A name for the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         A name for the policy.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * A name for the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param policyName <p>
     *            A name for the policy.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * A name for the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param policyName <p>
     *            A name for the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutProjectPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The revision ID for the Project Policy. Each time you modify a policy,
     * Amazon Rekognition Custom Labels generates and assigns a new
     * <code>PolicyRevisionId</code> and then deletes the previous version of
     * the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[0-9A-Fa-f]+<br/>
     *
     * @return <p>
     *         The revision ID for the Project Policy. Each time you modify a
     *         policy, Amazon Rekognition Custom Labels generates and assigns a
     *         new <code>PolicyRevisionId</code> and then deletes the previous
     *         version of the policy.
     *         </p>
     */
    public String getPolicyRevisionId() {
        return policyRevisionId;
    }

    /**
     * <p>
     * The revision ID for the Project Policy. Each time you modify a policy,
     * Amazon Rekognition Custom Labels generates and assigns a new
     * <code>PolicyRevisionId</code> and then deletes the previous version of
     * the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[0-9A-Fa-f]+<br/>
     *
     * @param policyRevisionId <p>
     *            The revision ID for the Project Policy. Each time you modify a
     *            policy, Amazon Rekognition Custom Labels generates and assigns
     *            a new <code>PolicyRevisionId</code> and then deletes the
     *            previous version of the policy.
     *            </p>
     */
    public void setPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
    }

    /**
     * <p>
     * The revision ID for the Project Policy. Each time you modify a policy,
     * Amazon Rekognition Custom Labels generates and assigns a new
     * <code>PolicyRevisionId</code> and then deletes the previous version of
     * the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[0-9A-Fa-f]+<br/>
     *
     * @param policyRevisionId <p>
     *            The revision ID for the Project Policy. Each time you modify a
     *            policy, Amazon Rekognition Custom Labels generates and assigns
     *            a new <code>PolicyRevisionId</code> and then deletes the
     *            previous version of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutProjectPolicyRequest withPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
        return this;
    }

    /**
     * <p>
     * A resource policy to add to the model. The policy is a JSON structure
     * that contains one or more statements that define the policy. The policy
     * must follow the IAM syntax. For more information about the contents of a
     * JSON policy document, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON policy reference</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         A resource policy to add to the model. The policy is a JSON
     *         structure that contains one or more statements that define the
     *         policy. The policy must follow the IAM syntax. For more
     *         information about the contents of a JSON policy document, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     *         >IAM JSON policy reference</a>.
     *         </p>
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    /**
     * <p>
     * A resource policy to add to the model. The policy is a JSON structure
     * that contains one or more statements that define the policy. The policy
     * must follow the IAM syntax. For more information about the contents of a
     * JSON policy document, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON policy reference</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policyDocument <p>
     *            A resource policy to add to the model. The policy is a JSON
     *            structure that contains one or more statements that define the
     *            policy. The policy must follow the IAM syntax. For more
     *            information about the contents of a JSON policy document, see
     *            <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     *            >IAM JSON policy reference</a>.
     *            </p>
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * A resource policy to add to the model. The policy is a JSON structure
     * that contains one or more statements that define the policy. The policy
     * must follow the IAM syntax. For more information about the contents of a
     * JSON policy document, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON policy reference</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policyDocument <p>
     *            A resource policy to add to the model. The policy is a JSON
     *            structure that contains one or more statements that define the
     *            policy. The policy must follow the IAM syntax. For more
     *            information about the contents of a JSON policy document, see
     *            <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     *            >IAM JSON policy reference</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutProjectPolicyRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: " + getProjectArn() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyRevisionId() != null)
            sb.append("PolicyRevisionId: " + getPolicyRevisionId() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyRevisionId() == null) ? 0 : getPolicyRevisionId().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutProjectPolicyRequest == false)
            return false;
        PutProjectPolicyRequest other = (PutProjectPolicyRequest) obj;

        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null
                && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyRevisionId() == null ^ this.getPolicyRevisionId() == null)
            return false;
        if (other.getPolicyRevisionId() != null
                && other.getPolicyRevisionId().equals(this.getPolicyRevisionId()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        return true;
    }
}
