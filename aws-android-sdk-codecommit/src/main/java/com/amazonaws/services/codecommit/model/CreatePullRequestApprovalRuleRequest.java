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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an approval rule for a pull request.
 * </p>
 */
public class CreatePullRequestApprovalRuleRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The system-generated ID of the pull request for which you want to create
     * the approval rule.
     * </p>
     */
    private String pullRequestId;

    /**
     * <p>
     * The name for the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String approvalRuleName;

    /**
     * <p>
     * The content of the approval rule, including the number of approvals
     * needed and the structure of an approval pool defined for approvals, if
     * any. For more information about approval pools, see the AWS CodeCommit
     * User Guide.
     * </p>
     * <note>
     * <p>
     * When you create the content of the approval rule, you can specify
     * approvers in an approval pool in one of two ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and
     * a resource. It can be used for both IAM users and federated access users
     * whose name matches the provided resource name. This is a very powerful
     * option that offers a great deal of flexibility. For example, if you
     * specify the AWS account <i>123456789012</i> and <i>Mary_Major</i>, all of
     * the following would be counted as approvals coming from that user:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IAM user in the account
     * (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A federated user identified in IAM as Mary_Major
     * (arn:aws:sts::<i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This option does not recognize an active session of someone assuming the
     * role of CodeCommitReview with a role session name of <i>Mary_Major</i>
     * (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview/<i>
     * Mary_Major</i>) unless you include a wildcard (*Mary_Major).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Fully qualified ARN</b>: This option allows you to specify the fully
     * qualified Amazon Resource Name (ARN) of the IAM user or role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about IAM ARNs, wildcards, and formats, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     */
    private String approvalRuleContent;

    /**
     * <p>
     * The system-generated ID of the pull request for which you want to create
     * the approval rule.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the pull request for which you want to
     *         create the approval rule.
     *         </p>
     */
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request for which you want to create
     * the approval rule.
     * </p>
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request for which you want
     *            to create the approval rule.
     *            </p>
     */
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request for which you want to create
     * the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request for which you want
     *            to create the approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePullRequestApprovalRuleRequest withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p>
     * The name for the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name for the approval rule.
     *         </p>
     */
    public String getApprovalRuleName() {
        return approvalRuleName;
    }

    /**
     * <p>
     * The name for the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleName <p>
     *            The name for the approval rule.
     *            </p>
     */
    public void setApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
    }

    /**
     * <p>
     * The name for the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleName <p>
     *            The name for the approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePullRequestApprovalRuleRequest withApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
        return this;
    }

    /**
     * <p>
     * The content of the approval rule, including the number of approvals
     * needed and the structure of an approval pool defined for approvals, if
     * any. For more information about approval pools, see the AWS CodeCommit
     * User Guide.
     * </p>
     * <note>
     * <p>
     * When you create the content of the approval rule, you can specify
     * approvers in an approval pool in one of two ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and
     * a resource. It can be used for both IAM users and federated access users
     * whose name matches the provided resource name. This is a very powerful
     * option that offers a great deal of flexibility. For example, if you
     * specify the AWS account <i>123456789012</i> and <i>Mary_Major</i>, all of
     * the following would be counted as approvals coming from that user:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IAM user in the account
     * (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A federated user identified in IAM as Mary_Major
     * (arn:aws:sts::<i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This option does not recognize an active session of someone assuming the
     * role of CodeCommitReview with a role session name of <i>Mary_Major</i>
     * (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview/<i>
     * Mary_Major</i>) unless you include a wildcard (*Mary_Major).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Fully qualified ARN</b>: This option allows you to specify the fully
     * qualified Amazon Resource Name (ARN) of the IAM user or role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about IAM ARNs, wildcards, and formats, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @return <p>
     *         The content of the approval rule, including the number of
     *         approvals needed and the structure of an approval pool defined
     *         for approvals, if any. For more information about approval pools,
     *         see the AWS CodeCommit User Guide.
     *         </p>
     *         <note>
     *         <p>
     *         When you create the content of the approval rule, you can specify
     *         approvers in an approval pool in one of two ways:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>CodeCommitApprovers</b>: This option only requires an AWS
     *         account and a resource. It can be used for both IAM users and
     *         federated access users whose name matches the provided resource
     *         name. This is a very powerful option that offers a great deal of
     *         flexibility. For example, if you specify the AWS account
     *         <i>123456789012</i> and <i>Mary_Major</i>, all of the following
     *         would be counted as approvals coming from that user:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An IAM user in the account
     *         (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A federated user identified in IAM as Mary_Major
     *         (arn:aws:sts::<i>
     *         123456789012</i>:federated-user/<i>Mary_Major</i>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This option does not recognize an active session of someone
     *         assuming the role of CodeCommitReview with a role session name of
     *         <i>Mary_Major</i>
     *         (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview
     *         /<i>Mary_Major</i>) unless you include a wildcard (*Mary_Major).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Fully qualified ARN</b>: This option allows you to specify the
     *         fully qualified Amazon Resource Name (ARN) of the IAM user or
     *         role.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about IAM ARNs, wildcards, and formats, see
     *         <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         </note>
     */
    public String getApprovalRuleContent() {
        return approvalRuleContent;
    }

    /**
     * <p>
     * The content of the approval rule, including the number of approvals
     * needed and the structure of an approval pool defined for approvals, if
     * any. For more information about approval pools, see the AWS CodeCommit
     * User Guide.
     * </p>
     * <note>
     * <p>
     * When you create the content of the approval rule, you can specify
     * approvers in an approval pool in one of two ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and
     * a resource. It can be used for both IAM users and federated access users
     * whose name matches the provided resource name. This is a very powerful
     * option that offers a great deal of flexibility. For example, if you
     * specify the AWS account <i>123456789012</i> and <i>Mary_Major</i>, all of
     * the following would be counted as approvals coming from that user:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IAM user in the account
     * (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A federated user identified in IAM as Mary_Major
     * (arn:aws:sts::<i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This option does not recognize an active session of someone assuming the
     * role of CodeCommitReview with a role session name of <i>Mary_Major</i>
     * (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview/<i>
     * Mary_Major</i>) unless you include a wildcard (*Mary_Major).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Fully qualified ARN</b>: This option allows you to specify the fully
     * qualified Amazon Resource Name (ARN) of the IAM user or role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about IAM ARNs, wildcards, and formats, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param approvalRuleContent <p>
     *            The content of the approval rule, including the number of
     *            approvals needed and the structure of an approval pool defined
     *            for approvals, if any. For more information about approval
     *            pools, see the AWS CodeCommit User Guide.
     *            </p>
     *            <note>
     *            <p>
     *            When you create the content of the approval rule, you can
     *            specify approvers in an approval pool in one of two ways:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>CodeCommitApprovers</b>: This option only requires an AWS
     *            account and a resource. It can be used for both IAM users and
     *            federated access users whose name matches the provided
     *            resource name. This is a very powerful option that offers a
     *            great deal of flexibility. For example, if you specify the AWS
     *            account <i>123456789012</i> and <i>Mary_Major</i>, all of the
     *            following would be counted as approvals coming from that user:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            An IAM user in the account
     *            (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A federated user identified in IAM as Mary_Major
     *            (arn:aws:sts::
     *            <i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This option does not recognize an active session of someone
     *            assuming the role of CodeCommitReview with a role session name
     *            of <i>Mary_Major</i>
     *            (arn:aws:sts::<i>123456789012</i>:assumed-
     *            role/CodeCommitReview/<i>Mary_Major</i>) unless you include a
     *            wildcard (*Mary_Major).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Fully qualified ARN</b>: This option allows you to specify
     *            the fully qualified Amazon Resource Name (ARN) of the IAM user
     *            or role.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about IAM ARNs, wildcards, and formats,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            </note>
     */
    public void setApprovalRuleContent(String approvalRuleContent) {
        this.approvalRuleContent = approvalRuleContent;
    }

    /**
     * <p>
     * The content of the approval rule, including the number of approvals
     * needed and the structure of an approval pool defined for approvals, if
     * any. For more information about approval pools, see the AWS CodeCommit
     * User Guide.
     * </p>
     * <note>
     * <p>
     * When you create the content of the approval rule, you can specify
     * approvers in an approval pool in one of two ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and
     * a resource. It can be used for both IAM users and federated access users
     * whose name matches the provided resource name. This is a very powerful
     * option that offers a great deal of flexibility. For example, if you
     * specify the AWS account <i>123456789012</i> and <i>Mary_Major</i>, all of
     * the following would be counted as approvals coming from that user:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IAM user in the account
     * (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * A federated user identified in IAM as Mary_Major
     * (arn:aws:sts::<i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This option does not recognize an active session of someone assuming the
     * role of CodeCommitReview with a role session name of <i>Mary_Major</i>
     * (arn:aws:sts::<i>123456789012</i>:assumed-role/CodeCommitReview/<i>
     * Mary_Major</i>) unless you include a wildcard (*Mary_Major).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Fully qualified ARN</b>: This option allows you to specify the fully
     * qualified Amazon Resource Name (ARN) of the IAM user or role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about IAM ARNs, wildcards, and formats, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param approvalRuleContent <p>
     *            The content of the approval rule, including the number of
     *            approvals needed and the structure of an approval pool defined
     *            for approvals, if any. For more information about approval
     *            pools, see the AWS CodeCommit User Guide.
     *            </p>
     *            <note>
     *            <p>
     *            When you create the content of the approval rule, you can
     *            specify approvers in an approval pool in one of two ways:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>CodeCommitApprovers</b>: This option only requires an AWS
     *            account and a resource. It can be used for both IAM users and
     *            federated access users whose name matches the provided
     *            resource name. This is a very powerful option that offers a
     *            great deal of flexibility. For example, if you specify the AWS
     *            account <i>123456789012</i> and <i>Mary_Major</i>, all of the
     *            following would be counted as approvals coming from that user:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            An IAM user in the account
     *            (arn:aws:iam::<i>123456789012</i>:user/<i>Mary_Major</i>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A federated user identified in IAM as Mary_Major
     *            (arn:aws:sts::
     *            <i>123456789012</i>:federated-user/<i>Mary_Major</i>)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This option does not recognize an active session of someone
     *            assuming the role of CodeCommitReview with a role session name
     *            of <i>Mary_Major</i>
     *            (arn:aws:sts::<i>123456789012</i>:assumed-
     *            role/CodeCommitReview/<i>Mary_Major</i>) unless you include a
     *            wildcard (*Mary_Major).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Fully qualified ARN</b>: This option allows you to specify
     *            the fully qualified Amazon Resource Name (ARN) of the IAM user
     *            or role.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about IAM ARNs, wildcards, and formats,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePullRequestApprovalRuleRequest withApprovalRuleContent(String approvalRuleContent) {
        this.approvalRuleContent = approvalRuleContent;
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
        if (getPullRequestId() != null)
            sb.append("pullRequestId: " + getPullRequestId() + ",");
        if (getApprovalRuleName() != null)
            sb.append("approvalRuleName: " + getApprovalRuleName() + ",");
        if (getApprovalRuleContent() != null)
            sb.append("approvalRuleContent: " + getApprovalRuleContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalRuleName() == null) ? 0 : getApprovalRuleName().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalRuleContent() == null) ? 0 : getApprovalRuleContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePullRequestApprovalRuleRequest == false)
            return false;
        CreatePullRequestApprovalRuleRequest other = (CreatePullRequestApprovalRuleRequest) obj;

        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null
                && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getApprovalRuleName() == null ^ this.getApprovalRuleName() == null)
            return false;
        if (other.getApprovalRuleName() != null
                && other.getApprovalRuleName().equals(this.getApprovalRuleName()) == false)
            return false;
        if (other.getApprovalRuleContent() == null ^ this.getApprovalRuleContent() == null)
            return false;
        if (other.getApprovalRuleContent() != null
                && other.getApprovalRuleContent().equals(this.getApprovalRuleContent()) == false)
            return false;
        return true;
    }
}
