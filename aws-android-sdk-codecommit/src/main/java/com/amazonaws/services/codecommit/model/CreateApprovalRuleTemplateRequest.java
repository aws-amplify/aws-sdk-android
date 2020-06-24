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
 * Creates a template for approval rules that can then be associated with one or
 * more repositories in your AWS account. When you associate a template with a
 * repository, AWS CodeCommit creates an approval rule that matches the
 * conditions of the template for all pull requests that meet the conditions of
 * the template. For more information, see
 * <a>AssociateApprovalRuleTemplateWithRepository</a>.
 * </p>
 */
public class CreateApprovalRuleTemplateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the approval rule template. Provide descriptive names,
     * because this name is applied to the approval rules created automatically
     * in associated repositories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String approvalRuleTemplateName;

    /**
     * <p>
     * The content of the approval rule that is created on pull requests in
     * associated repositories. If you specify one or more destination
     * references (branches), approval rules are created in an associated
     * repository only if their destination references (branches) match those
     * specified in the template.
     * </p>
     * <note>
     * <p>
     * When you create the content of the approval rule template, you can
     * specify approvers in an approval pool in one of two ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and
     * a resource. It can be used for both IAM users and federated access users
     * whose name matches the provided resource name. This is a very powerful
     * option that offers a great deal of flexibility. For example, if you
     * specify the AWS account <i>123456789012</i> and <i>Mary_Major</i>, all of
     * the following are counted as approvals coming from that user:
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
    private String approvalRuleTemplateContent;

    /**
     * <p>
     * The description of the approval rule template. Consider providing a
     * description that explains what this template does and when it might be
     * appropriate to associate it with repositories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String approvalRuleTemplateDescription;

    /**
     * <p>
     * The name of the approval rule template. Provide descriptive names,
     * because this name is applied to the approval rules created automatically
     * in associated repositories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the approval rule template. Provide descriptive
     *         names, because this name is applied to the approval rules created
     *         automatically in associated repositories.
     *         </p>
     */
    public String getApprovalRuleTemplateName() {
        return approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template. Provide descriptive names,
     * because this name is applied to the approval rules created automatically
     * in associated repositories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name of the approval rule template. Provide descriptive
     *            names, because this name is applied to the approval rules
     *            created automatically in associated repositories.
     *            </p>
     */
    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template. Provide descriptive names,
     * because this name is applied to the approval rules created automatically
     * in associated repositories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name of the approval rule template. Provide descriptive
     *            names, because this name is applied to the approval rules
     *            created automatically in associated repositories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApprovalRuleTemplateRequest withApprovalRuleTemplateName(
            String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
        return this;
    }

    /**
     * <p>
     * The content of the approval rule that is created on pull requests in
     * associated repositories. If you specify one or more destination
     * references (branches), approval rules are created in an associated
     * repository only if their destination references (branches) match those
     * specified in the template.
     * </p>
     * <note>
     * <p>
     * When you create the content of the approval rule template, you can
     * specify approvers in an approval pool in one of two ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and
     * a resource. It can be used for both IAM users and federated access users
     * whose name matches the provided resource name. This is a very powerful
     * option that offers a great deal of flexibility. For example, if you
     * specify the AWS account <i>123456789012</i> and <i>Mary_Major</i>, all of
     * the following are counted as approvals coming from that user:
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
     *         The content of the approval rule that is created on pull requests
     *         in associated repositories. If you specify one or more
     *         destination references (branches), approval rules are created in
     *         an associated repository only if their destination references
     *         (branches) match those specified in the template.
     *         </p>
     *         <note>
     *         <p>
     *         When you create the content of the approval rule template, you
     *         can specify approvers in an approval pool in one of two ways:
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
     *         are counted as approvals coming from that user:
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
    public String getApprovalRuleTemplateContent() {
        return approvalRuleTemplateContent;
    }

    /**
     * <p>
     * The content of the approval rule that is created on pull requests in
     * associated repositories. If you specify one or more destination
     * references (branches), approval rules are created in an associated
     * repository only if their destination references (branches) match those
     * specified in the template.
     * </p>
     * <note>
     * <p>
     * When you create the content of the approval rule template, you can
     * specify approvers in an approval pool in one of two ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and
     * a resource. It can be used for both IAM users and federated access users
     * whose name matches the provided resource name. This is a very powerful
     * option that offers a great deal of flexibility. For example, if you
     * specify the AWS account <i>123456789012</i> and <i>Mary_Major</i>, all of
     * the following are counted as approvals coming from that user:
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
     * @param approvalRuleTemplateContent <p>
     *            The content of the approval rule that is created on pull
     *            requests in associated repositories. If you specify one or
     *            more destination references (branches), approval rules are
     *            created in an associated repository only if their destination
     *            references (branches) match those specified in the template.
     *            </p>
     *            <note>
     *            <p>
     *            When you create the content of the approval rule template, you
     *            can specify approvers in an approval pool in one of two ways:
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
     *            following are counted as approvals coming from that user:
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
    public void setApprovalRuleTemplateContent(String approvalRuleTemplateContent) {
        this.approvalRuleTemplateContent = approvalRuleTemplateContent;
    }

    /**
     * <p>
     * The content of the approval rule that is created on pull requests in
     * associated repositories. If you specify one or more destination
     * references (branches), approval rules are created in an associated
     * repository only if their destination references (branches) match those
     * specified in the template.
     * </p>
     * <note>
     * <p>
     * When you create the content of the approval rule template, you can
     * specify approvers in an approval pool in one of two ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeCommitApprovers</b>: This option only requires an AWS account and
     * a resource. It can be used for both IAM users and federated access users
     * whose name matches the provided resource name. This is a very powerful
     * option that offers a great deal of flexibility. For example, if you
     * specify the AWS account <i>123456789012</i> and <i>Mary_Major</i>, all of
     * the following are counted as approvals coming from that user:
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
     * @param approvalRuleTemplateContent <p>
     *            The content of the approval rule that is created on pull
     *            requests in associated repositories. If you specify one or
     *            more destination references (branches), approval rules are
     *            created in an associated repository only if their destination
     *            references (branches) match those specified in the template.
     *            </p>
     *            <note>
     *            <p>
     *            When you create the content of the approval rule template, you
     *            can specify approvers in an approval pool in one of two ways:
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
     *            following are counted as approvals coming from that user:
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
    public CreateApprovalRuleTemplateRequest withApprovalRuleTemplateContent(
            String approvalRuleTemplateContent) {
        this.approvalRuleTemplateContent = approvalRuleTemplateContent;
        return this;
    }

    /**
     * <p>
     * The description of the approval rule template. Consider providing a
     * description that explains what this template does and when it might be
     * appropriate to associate it with repositories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The description of the approval rule template. Consider providing
     *         a description that explains what this template does and when it
     *         might be appropriate to associate it with repositories.
     *         </p>
     */
    public String getApprovalRuleTemplateDescription() {
        return approvalRuleTemplateDescription;
    }

    /**
     * <p>
     * The description of the approval rule template. Consider providing a
     * description that explains what this template does and when it might be
     * appropriate to associate it with repositories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param approvalRuleTemplateDescription <p>
     *            The description of the approval rule template. Consider
     *            providing a description that explains what this template does
     *            and when it might be appropriate to associate it with
     *            repositories.
     *            </p>
     */
    public void setApprovalRuleTemplateDescription(String approvalRuleTemplateDescription) {
        this.approvalRuleTemplateDescription = approvalRuleTemplateDescription;
    }

    /**
     * <p>
     * The description of the approval rule template. Consider providing a
     * description that explains what this template does and when it might be
     * appropriate to associate it with repositories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param approvalRuleTemplateDescription <p>
     *            The description of the approval rule template. Consider
     *            providing a description that explains what this template does
     *            and when it might be appropriate to associate it with
     *            repositories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApprovalRuleTemplateRequest withApprovalRuleTemplateDescription(
            String approvalRuleTemplateDescription) {
        this.approvalRuleTemplateDescription = approvalRuleTemplateDescription;
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
        if (getApprovalRuleTemplateName() != null)
            sb.append("approvalRuleTemplateName: " + getApprovalRuleTemplateName() + ",");
        if (getApprovalRuleTemplateContent() != null)
            sb.append("approvalRuleTemplateContent: " + getApprovalRuleTemplateContent() + ",");
        if (getApprovalRuleTemplateDescription() != null)
            sb.append("approvalRuleTemplateDescription: " + getApprovalRuleTemplateDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApprovalRuleTemplateName() == null) ? 0 : getApprovalRuleTemplateName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovalRuleTemplateContent() == null) ? 0
                        : getApprovalRuleTemplateContent().hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovalRuleTemplateDescription() == null) ? 0
                        : getApprovalRuleTemplateDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApprovalRuleTemplateRequest == false)
            return false;
        CreateApprovalRuleTemplateRequest other = (CreateApprovalRuleTemplateRequest) obj;

        if (other.getApprovalRuleTemplateName() == null
                ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null
                && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        if (other.getApprovalRuleTemplateContent() == null
                ^ this.getApprovalRuleTemplateContent() == null)
            return false;
        if (other.getApprovalRuleTemplateContent() != null
                && other.getApprovalRuleTemplateContent().equals(
                        this.getApprovalRuleTemplateContent()) == false)
            return false;
        if (other.getApprovalRuleTemplateDescription() == null
                ^ this.getApprovalRuleTemplateDescription() == null)
            return false;
        if (other.getApprovalRuleTemplateDescription() != null
                && other.getApprovalRuleTemplateDescription().equals(
                        this.getApprovalRuleTemplateDescription()) == false)
            return false;
        return true;
    }
}
