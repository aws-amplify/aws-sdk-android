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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * For a specified stack that is in the <code>UPDATE_ROLLBACK_FAILED</code>
 * state, continues rolling it back to the <code>UPDATE_ROLLBACK_COMPLETE</code>
 * state. Depending on the cause of the failure, you can manually <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
 * > fix the error</a> and continue the rollback. By continuing the rollback,
 * you can return your stack to a working state (the
 * <code>UPDATE_ROLLBACK_COMPLETE</code> state), and then try to update the
 * stack again.
 * </p>
 * <p>
 * A stack goes into the <code>UPDATE_ROLLBACK_FAILED</code> state when AWS
 * CloudFormation cannot roll back all changes after a failed stack update. For
 * example, you might have a stack that is rolling back to an old database
 * instance that was deleted outside of AWS CloudFormation. Because AWS
 * CloudFormation doesn't know the database was deleted, it assumes that the
 * database instance still exists and attempts to roll back to it, causing the
 * update rollback to fail.
 * </p>
 */
public class ContinueUpdateRollbackRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or the unique ID of the stack that you want to continue rolling
     * back.
     * </p>
     * <note>
     * <p>
     * Don't specify the name of a nested stack (a stack that was created by
     * using the <code>AWS::CloudFormation::Stack</code> resource). Instead, use
     * this operation on the parent stack (the stack that contains the
     * <code>AWS::CloudFormation::Stack</code> resource).
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     */
    private String stackName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that AWS CloudFormation assumes to roll back the stack. AWS
     * CloudFormation uses the role's credentials to make calls on your behalf.
     * AWS CloudFormation always uses this role for all future operations on the
     * stack. As long as users have permission to operate on the stack, AWS
     * CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was
     * previously associated with the stack. If no role is available, AWS
     * CloudFormation uses a temporary session that is generated from your user
     * credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleARN;

    /**
     * <p>
     * A list of the logical IDs of the resources that AWS CloudFormation skips
     * during the continue update rollback operation. You can specify only
     * resources that are in the <code>UPDATE_FAILED</code> state because a
     * rollback failed. You can't specify resources that are in the
     * <code>UPDATE_FAILED</code> state for other reasons, for example, because
     * an update was cancelled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status
     * reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS
     * CloudFormation can't successfully roll back. We recommend that you <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > troubleshoot</a> resources before skipping them. AWS CloudFormation
     * sets the status of the specified resources to
     * <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After
     * the rollback is complete, the state of the skipped resources will be
     * inconsistent with the state of the resources in the stack template.
     * Before performing another stack update, you must update the stack or
     * resources to be consistent with each other. If you don't, subsequent
     * stack updates might fail, and the stack will become unrecoverable.
     * </p>
     * </important>
     * <p>
     * Specify the minimum number of resources required to successfully roll
     * back your stack. For example, a failed resource update might cause
     * dependent resources to fail. In this case, it might not be necessary to
     * skip the dependent resources.
     * </p>
     * <p>
     * To skip resources that are part of nested stacks, use the following
     * format: <code>NestedStackName.ResourceLogicalID</code>. If you want to
     * specify the logical ID of a stack resource (
     * <code>Type: AWS::CloudFormation::Stack</code>) in the
     * <code>ResourcesToSkip</code> list, then its corresponding embedded stack
     * must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     * <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     * </p>
     * <note>
     * <p>
     * Don't confuse a child stack's name with its corresponding logical ID
     * defined in the parent stack. For an example of a continue update rollback
     * operation with nested stacks, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     * >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     * </p>
     * </note>
     */
    private java.util.List<String> resourcesToSkip;

    /**
     * <p>
     * A unique identifier for this <code>ContinueUpdateRollback</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to continue the rollback
     * to a stack with the same name. You might retry
     * <code>ContinueUpdateRollback</code> requests to ensure that AWS
     * CloudFormation successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name or the unique ID of the stack that you want to continue rolling
     * back.
     * </p>
     * <note>
     * <p>
     * Don't specify the name of a nested stack (a stack that was created by
     * using the <code>AWS::CloudFormation::Stack</code> resource). Instead, use
     * this operation on the parent stack (the stack that contains the
     * <code>AWS::CloudFormation::Stack</code> resource).
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @return <p>
     *         The name or the unique ID of the stack that you want to continue
     *         rolling back.
     *         </p>
     *         <note>
     *         <p>
     *         Don't specify the name of a nested stack (a stack that was
     *         created by using the <code>AWS::CloudFormation::Stack</code>
     *         resource). Instead, use this operation on the parent stack (the
     *         stack that contains the <code>AWS::CloudFormation::Stack</code>
     *         resource).
     *         </p>
     *         </note>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name or the unique ID of the stack that you want to continue rolling
     * back.
     * </p>
     * <note>
     * <p>
     * Don't specify the name of a nested stack (a stack that was created by
     * using the <code>AWS::CloudFormation::Stack</code> resource). Instead, use
     * this operation on the parent stack (the stack that contains the
     * <code>AWS::CloudFormation::Stack</code> resource).
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            The name or the unique ID of the stack that you want to
     *            continue rolling back.
     *            </p>
     *            <note>
     *            <p>
     *            Don't specify the name of a nested stack (a stack that was
     *            created by using the <code>AWS::CloudFormation::Stack</code>
     *            resource). Instead, use this operation on the parent stack
     *            (the stack that contains the
     *            <code>AWS::CloudFormation::Stack</code> resource).
     *            </p>
     *            </note>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the unique ID of the stack that you want to continue rolling
     * back.
     * </p>
     * <note>
     * <p>
     * Don't specify the name of a nested stack (a stack that was created by
     * using the <code>AWS::CloudFormation::Stack</code> resource). Instead, use
     * this operation on the parent stack (the stack that contains the
     * <code>AWS::CloudFormation::Stack</code> resource).
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            The name or the unique ID of the stack that you want to
     *            continue rolling back.
     *            </p>
     *            <note>
     *            <p>
     *            Don't specify the name of a nested stack (a stack that was
     *            created by using the <code>AWS::CloudFormation::Stack</code>
     *            resource). Instead, use this operation on the parent stack
     *            (the stack that contains the
     *            <code>AWS::CloudFormation::Stack</code> resource).
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContinueUpdateRollbackRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that AWS CloudFormation assumes to roll back the stack. AWS
     * CloudFormation uses the role's credentials to make calls on your behalf.
     * AWS CloudFormation always uses this role for all future operations on the
     * stack. As long as users have permission to operate on the stack, AWS
     * CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was
     * previously associated with the stack. If no role is available, AWS
     * CloudFormation uses a temporary session that is generated from your user
     * credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an AWS Identity and Access
     *         Management (IAM) role that AWS CloudFormation assumes to roll
     *         back the stack. AWS CloudFormation uses the role's credentials to
     *         make calls on your behalf. AWS CloudFormation always uses this
     *         role for all future operations on the stack. As long as users
     *         have permission to operate on the stack, AWS CloudFormation uses
     *         this role even if the users don't have permission to pass it.
     *         Ensure that the role grants least privilege.
     *         </p>
     *         <p>
     *         If you don't specify a value, AWS CloudFormation uses the role
     *         that was previously associated with the stack. If no role is
     *         available, AWS CloudFormation uses a temporary session that is
     *         generated from your user credentials.
     *         </p>
     */
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that AWS CloudFormation assumes to roll back the stack. AWS
     * CloudFormation uses the role's credentials to make calls on your behalf.
     * AWS CloudFormation always uses this role for all future operations on the
     * stack. As long as users have permission to operate on the stack, AWS
     * CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was
     * previously associated with the stack. If no role is available, AWS
     * CloudFormation uses a temporary session that is generated from your user
     * credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleARN <p>
     *            The Amazon Resource Name (ARN) of an AWS Identity and Access
     *            Management (IAM) role that AWS CloudFormation assumes to roll
     *            back the stack. AWS CloudFormation uses the role's credentials
     *            to make calls on your behalf. AWS CloudFormation always uses
     *            this role for all future operations on the stack. As long as
     *            users have permission to operate on the stack, AWS
     *            CloudFormation uses this role even if the users don't have
     *            permission to pass it. Ensure that the role grants least
     *            privilege.
     *            </p>
     *            <p>
     *            If you don't specify a value, AWS CloudFormation uses the role
     *            that was previously associated with the stack. If no role is
     *            available, AWS CloudFormation uses a temporary session that is
     *            generated from your user credentials.
     *            </p>
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that AWS CloudFormation assumes to roll back the stack. AWS
     * CloudFormation uses the role's credentials to make calls on your behalf.
     * AWS CloudFormation always uses this role for all future operations on the
     * stack. As long as users have permission to operate on the stack, AWS
     * CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was
     * previously associated with the stack. If no role is available, AWS
     * CloudFormation uses a temporary session that is generated from your user
     * credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleARN <p>
     *            The Amazon Resource Name (ARN) of an AWS Identity and Access
     *            Management (IAM) role that AWS CloudFormation assumes to roll
     *            back the stack. AWS CloudFormation uses the role's credentials
     *            to make calls on your behalf. AWS CloudFormation always uses
     *            this role for all future operations on the stack. As long as
     *            users have permission to operate on the stack, AWS
     *            CloudFormation uses this role even if the users don't have
     *            permission to pass it. Ensure that the role grants least
     *            privilege.
     *            </p>
     *            <p>
     *            If you don't specify a value, AWS CloudFormation uses the role
     *            that was previously associated with the stack. If no role is
     *            available, AWS CloudFormation uses a temporary session that is
     *            generated from your user credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContinueUpdateRollbackRequest withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * <p>
     * A list of the logical IDs of the resources that AWS CloudFormation skips
     * during the continue update rollback operation. You can specify only
     * resources that are in the <code>UPDATE_FAILED</code> state because a
     * rollback failed. You can't specify resources that are in the
     * <code>UPDATE_FAILED</code> state for other reasons, for example, because
     * an update was cancelled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status
     * reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS
     * CloudFormation can't successfully roll back. We recommend that you <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > troubleshoot</a> resources before skipping them. AWS CloudFormation
     * sets the status of the specified resources to
     * <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After
     * the rollback is complete, the state of the skipped resources will be
     * inconsistent with the state of the resources in the stack template.
     * Before performing another stack update, you must update the stack or
     * resources to be consistent with each other. If you don't, subsequent
     * stack updates might fail, and the stack will become unrecoverable.
     * </p>
     * </important>
     * <p>
     * Specify the minimum number of resources required to successfully roll
     * back your stack. For example, a failed resource update might cause
     * dependent resources to fail. In this case, it might not be necessary to
     * skip the dependent resources.
     * </p>
     * <p>
     * To skip resources that are part of nested stacks, use the following
     * format: <code>NestedStackName.ResourceLogicalID</code>. If you want to
     * specify the logical ID of a stack resource (
     * <code>Type: AWS::CloudFormation::Stack</code>) in the
     * <code>ResourcesToSkip</code> list, then its corresponding embedded stack
     * must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     * <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     * </p>
     * <note>
     * <p>
     * Don't confuse a child stack's name with its corresponding logical ID
     * defined in the parent stack. For an example of a continue update rollback
     * operation with nested stacks, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     * >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of the logical IDs of the resources that AWS
     *         CloudFormation skips during the continue update rollback
     *         operation. You can specify only resources that are in the
     *         <code>UPDATE_FAILED</code> state because a rollback failed. You
     *         can't specify resources that are in the
     *         <code>UPDATE_FAILED</code> state for other reasons, for example,
     *         because an update was cancelled. To check why a resource update
     *         failed, use the <a>DescribeStackResources</a> action, and view
     *         the resource status reason.
     *         </p>
     *         <important>
     *         <p>
     *         Specify this property to skip rolling back resources that AWS
     *         CloudFormation can't successfully roll back. We recommend that
     *         you <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     *         > troubleshoot</a> resources before skipping them. AWS
     *         CloudFormation sets the status of the specified resources to
     *         <code>UPDATE_COMPLETE</code> and continues to roll back the
     *         stack. After the rollback is complete, the state of the skipped
     *         resources will be inconsistent with the state of the resources in
     *         the stack template. Before performing another stack update, you
     *         must update the stack or resources to be consistent with each
     *         other. If you don't, subsequent stack updates might fail, and the
     *         stack will become unrecoverable.
     *         </p>
     *         </important>
     *         <p>
     *         Specify the minimum number of resources required to successfully
     *         roll back your stack. For example, a failed resource update might
     *         cause dependent resources to fail. In this case, it might not be
     *         necessary to skip the dependent resources.
     *         </p>
     *         <p>
     *         To skip resources that are part of nested stacks, use the
     *         following format: <code>NestedStackName.ResourceLogicalID</code>.
     *         If you want to specify the logical ID of a stack resource (
     *         <code>Type: AWS::CloudFormation::Stack</code>) in the
     *         <code>ResourcesToSkip</code> list, then its corresponding
     *         embedded stack must be in one of the following states:
     *         <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>, or
     *         <code>DELETE_FAILED</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Don't confuse a child stack's name with its corresponding logical
     *         ID defined in the parent stack. For an example of a continue
     *         update rollback operation with nested stacks, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     *         >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getResourcesToSkip() {
        return resourcesToSkip;
    }

    /**
     * <p>
     * A list of the logical IDs of the resources that AWS CloudFormation skips
     * during the continue update rollback operation. You can specify only
     * resources that are in the <code>UPDATE_FAILED</code> state because a
     * rollback failed. You can't specify resources that are in the
     * <code>UPDATE_FAILED</code> state for other reasons, for example, because
     * an update was cancelled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status
     * reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS
     * CloudFormation can't successfully roll back. We recommend that you <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > troubleshoot</a> resources before skipping them. AWS CloudFormation
     * sets the status of the specified resources to
     * <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After
     * the rollback is complete, the state of the skipped resources will be
     * inconsistent with the state of the resources in the stack template.
     * Before performing another stack update, you must update the stack or
     * resources to be consistent with each other. If you don't, subsequent
     * stack updates might fail, and the stack will become unrecoverable.
     * </p>
     * </important>
     * <p>
     * Specify the minimum number of resources required to successfully roll
     * back your stack. For example, a failed resource update might cause
     * dependent resources to fail. In this case, it might not be necessary to
     * skip the dependent resources.
     * </p>
     * <p>
     * To skip resources that are part of nested stacks, use the following
     * format: <code>NestedStackName.ResourceLogicalID</code>. If you want to
     * specify the logical ID of a stack resource (
     * <code>Type: AWS::CloudFormation::Stack</code>) in the
     * <code>ResourcesToSkip</code> list, then its corresponding embedded stack
     * must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     * <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     * </p>
     * <note>
     * <p>
     * Don't confuse a child stack's name with its corresponding logical ID
     * defined in the parent stack. For an example of a continue update rollback
     * operation with nested stacks, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     * >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     * </p>
     * </note>
     *
     * @param resourcesToSkip <p>
     *            A list of the logical IDs of the resources that AWS
     *            CloudFormation skips during the continue update rollback
     *            operation. You can specify only resources that are in the
     *            <code>UPDATE_FAILED</code> state because a rollback failed.
     *            You can't specify resources that are in the
     *            <code>UPDATE_FAILED</code> state for other reasons, for
     *            example, because an update was cancelled. To check why a
     *            resource update failed, use the <a>DescribeStackResources</a>
     *            action, and view the resource status reason.
     *            </p>
     *            <important>
     *            <p>
     *            Specify this property to skip rolling back resources that AWS
     *            CloudFormation can't successfully roll back. We recommend that
     *            you <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     *            > troubleshoot</a> resources before skipping them. AWS
     *            CloudFormation sets the status of the specified resources to
     *            <code>UPDATE_COMPLETE</code> and continues to roll back the
     *            stack. After the rollback is complete, the state of the
     *            skipped resources will be inconsistent with the state of the
     *            resources in the stack template. Before performing another
     *            stack update, you must update the stack or resources to be
     *            consistent with each other. If you don't, subsequent stack
     *            updates might fail, and the stack will become unrecoverable.
     *            </p>
     *            </important>
     *            <p>
     *            Specify the minimum number of resources required to
     *            successfully roll back your stack. For example, a failed
     *            resource update might cause dependent resources to fail. In
     *            this case, it might not be necessary to skip the dependent
     *            resources.
     *            </p>
     *            <p>
     *            To skip resources that are part of nested stacks, use the
     *            following format:
     *            <code>NestedStackName.ResourceLogicalID</code>. If you want to
     *            specify the logical ID of a stack resource (
     *            <code>Type: AWS::CloudFormation::Stack</code>) in the
     *            <code>ResourcesToSkip</code> list, then its corresponding
     *            embedded stack must be in one of the following states:
     *            <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>,
     *            or <code>DELETE_FAILED</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Don't confuse a child stack's name with its corresponding
     *            logical ID defined in the parent stack. For an example of a
     *            continue update rollback operation with nested stacks, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     *            >Using ResourcesToSkip to recover a nested stacks
     *            hierarchy</a>.
     *            </p>
     *            </note>
     */
    public void setResourcesToSkip(java.util.Collection<String> resourcesToSkip) {
        if (resourcesToSkip == null) {
            this.resourcesToSkip = null;
            return;
        }

        this.resourcesToSkip = new java.util.ArrayList<String>(resourcesToSkip);
    }

    /**
     * <p>
     * A list of the logical IDs of the resources that AWS CloudFormation skips
     * during the continue update rollback operation. You can specify only
     * resources that are in the <code>UPDATE_FAILED</code> state because a
     * rollback failed. You can't specify resources that are in the
     * <code>UPDATE_FAILED</code> state for other reasons, for example, because
     * an update was cancelled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status
     * reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS
     * CloudFormation can't successfully roll back. We recommend that you <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > troubleshoot</a> resources before skipping them. AWS CloudFormation
     * sets the status of the specified resources to
     * <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After
     * the rollback is complete, the state of the skipped resources will be
     * inconsistent with the state of the resources in the stack template.
     * Before performing another stack update, you must update the stack or
     * resources to be consistent with each other. If you don't, subsequent
     * stack updates might fail, and the stack will become unrecoverable.
     * </p>
     * </important>
     * <p>
     * Specify the minimum number of resources required to successfully roll
     * back your stack. For example, a failed resource update might cause
     * dependent resources to fail. In this case, it might not be necessary to
     * skip the dependent resources.
     * </p>
     * <p>
     * To skip resources that are part of nested stacks, use the following
     * format: <code>NestedStackName.ResourceLogicalID</code>. If you want to
     * specify the logical ID of a stack resource (
     * <code>Type: AWS::CloudFormation::Stack</code>) in the
     * <code>ResourcesToSkip</code> list, then its corresponding embedded stack
     * must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     * <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     * </p>
     * <note>
     * <p>
     * Don't confuse a child stack's name with its corresponding logical ID
     * defined in the parent stack. For an example of a continue update rollback
     * operation with nested stacks, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     * >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcesToSkip <p>
     *            A list of the logical IDs of the resources that AWS
     *            CloudFormation skips during the continue update rollback
     *            operation. You can specify only resources that are in the
     *            <code>UPDATE_FAILED</code> state because a rollback failed.
     *            You can't specify resources that are in the
     *            <code>UPDATE_FAILED</code> state for other reasons, for
     *            example, because an update was cancelled. To check why a
     *            resource update failed, use the <a>DescribeStackResources</a>
     *            action, and view the resource status reason.
     *            </p>
     *            <important>
     *            <p>
     *            Specify this property to skip rolling back resources that AWS
     *            CloudFormation can't successfully roll back. We recommend that
     *            you <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     *            > troubleshoot</a> resources before skipping them. AWS
     *            CloudFormation sets the status of the specified resources to
     *            <code>UPDATE_COMPLETE</code> and continues to roll back the
     *            stack. After the rollback is complete, the state of the
     *            skipped resources will be inconsistent with the state of the
     *            resources in the stack template. Before performing another
     *            stack update, you must update the stack or resources to be
     *            consistent with each other. If you don't, subsequent stack
     *            updates might fail, and the stack will become unrecoverable.
     *            </p>
     *            </important>
     *            <p>
     *            Specify the minimum number of resources required to
     *            successfully roll back your stack. For example, a failed
     *            resource update might cause dependent resources to fail. In
     *            this case, it might not be necessary to skip the dependent
     *            resources.
     *            </p>
     *            <p>
     *            To skip resources that are part of nested stacks, use the
     *            following format:
     *            <code>NestedStackName.ResourceLogicalID</code>. If you want to
     *            specify the logical ID of a stack resource (
     *            <code>Type: AWS::CloudFormation::Stack</code>) in the
     *            <code>ResourcesToSkip</code> list, then its corresponding
     *            embedded stack must be in one of the following states:
     *            <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>,
     *            or <code>DELETE_FAILED</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Don't confuse a child stack's name with its corresponding
     *            logical ID defined in the parent stack. For an example of a
     *            continue update rollback operation with nested stacks, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     *            >Using ResourcesToSkip to recover a nested stacks
     *            hierarchy</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContinueUpdateRollbackRequest withResourcesToSkip(String... resourcesToSkip) {
        if (getResourcesToSkip() == null) {
            this.resourcesToSkip = new java.util.ArrayList<String>(resourcesToSkip.length);
        }
        for (String value : resourcesToSkip) {
            this.resourcesToSkip.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the logical IDs of the resources that AWS CloudFormation skips
     * during the continue update rollback operation. You can specify only
     * resources that are in the <code>UPDATE_FAILED</code> state because a
     * rollback failed. You can't specify resources that are in the
     * <code>UPDATE_FAILED</code> state for other reasons, for example, because
     * an update was cancelled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status
     * reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS
     * CloudFormation can't successfully roll back. We recommend that you <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > troubleshoot</a> resources before skipping them. AWS CloudFormation
     * sets the status of the specified resources to
     * <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After
     * the rollback is complete, the state of the skipped resources will be
     * inconsistent with the state of the resources in the stack template.
     * Before performing another stack update, you must update the stack or
     * resources to be consistent with each other. If you don't, subsequent
     * stack updates might fail, and the stack will become unrecoverable.
     * </p>
     * </important>
     * <p>
     * Specify the minimum number of resources required to successfully roll
     * back your stack. For example, a failed resource update might cause
     * dependent resources to fail. In this case, it might not be necessary to
     * skip the dependent resources.
     * </p>
     * <p>
     * To skip resources that are part of nested stacks, use the following
     * format: <code>NestedStackName.ResourceLogicalID</code>. If you want to
     * specify the logical ID of a stack resource (
     * <code>Type: AWS::CloudFormation::Stack</code>) in the
     * <code>ResourcesToSkip</code> list, then its corresponding embedded stack
     * must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     * <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     * </p>
     * <note>
     * <p>
     * Don't confuse a child stack's name with its corresponding logical ID
     * defined in the parent stack. For an example of a continue update rollback
     * operation with nested stacks, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     * >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcesToSkip <p>
     *            A list of the logical IDs of the resources that AWS
     *            CloudFormation skips during the continue update rollback
     *            operation. You can specify only resources that are in the
     *            <code>UPDATE_FAILED</code> state because a rollback failed.
     *            You can't specify resources that are in the
     *            <code>UPDATE_FAILED</code> state for other reasons, for
     *            example, because an update was cancelled. To check why a
     *            resource update failed, use the <a>DescribeStackResources</a>
     *            action, and view the resource status reason.
     *            </p>
     *            <important>
     *            <p>
     *            Specify this property to skip rolling back resources that AWS
     *            CloudFormation can't successfully roll back. We recommend that
     *            you <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     *            > troubleshoot</a> resources before skipping them. AWS
     *            CloudFormation sets the status of the specified resources to
     *            <code>UPDATE_COMPLETE</code> and continues to roll back the
     *            stack. After the rollback is complete, the state of the
     *            skipped resources will be inconsistent with the state of the
     *            resources in the stack template. Before performing another
     *            stack update, you must update the stack or resources to be
     *            consistent with each other. If you don't, subsequent stack
     *            updates might fail, and the stack will become unrecoverable.
     *            </p>
     *            </important>
     *            <p>
     *            Specify the minimum number of resources required to
     *            successfully roll back your stack. For example, a failed
     *            resource update might cause dependent resources to fail. In
     *            this case, it might not be necessary to skip the dependent
     *            resources.
     *            </p>
     *            <p>
     *            To skip resources that are part of nested stacks, use the
     *            following format:
     *            <code>NestedStackName.ResourceLogicalID</code>. If you want to
     *            specify the logical ID of a stack resource (
     *            <code>Type: AWS::CloudFormation::Stack</code>) in the
     *            <code>ResourcesToSkip</code> list, then its corresponding
     *            embedded stack must be in one of the following states:
     *            <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>,
     *            or <code>DELETE_FAILED</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Don't confuse a child stack's name with its corresponding
     *            logical ID defined in the parent stack. For an example of a
     *            continue update rollback operation with nested stacks, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     *            >Using ResourcesToSkip to recover a nested stacks
     *            hierarchy</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContinueUpdateRollbackRequest withResourcesToSkip(
            java.util.Collection<String> resourcesToSkip) {
        setResourcesToSkip(resourcesToSkip);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>ContinueUpdateRollback</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to continue the rollback
     * to a stack with the same name. You might retry
     * <code>ContinueUpdateRollback</code> requests to ensure that AWS
     * CloudFormation successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         A unique identifier for this <code>ContinueUpdateRollback</code>
     *         request. Specify this token if you plan to retry requests so that
     *         AWS CloudFormation knows that you're not attempting to continue
     *         the rollback to a stack with the same name. You might retry
     *         <code>ContinueUpdateRollback</code> requests to ensure that AWS
     *         CloudFormation successfully received them.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>ContinueUpdateRollback</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to continue the rollback
     * to a stack with the same name. You might retry
     * <code>ContinueUpdateRollback</code> requests to ensure that AWS
     * CloudFormation successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for this
     *            <code>ContinueUpdateRollback</code> request. Specify this
     *            token if you plan to retry requests so that AWS CloudFormation
     *            knows that you're not attempting to continue the rollback to a
     *            stack with the same name. You might retry
     *            <code>ContinueUpdateRollback</code> requests to ensure that
     *            AWS CloudFormation successfully received them.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>ContinueUpdateRollback</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to continue the rollback
     * to a stack with the same name. You might retry
     * <code>ContinueUpdateRollback</code> requests to ensure that AWS
     * CloudFormation successfully received them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for this
     *            <code>ContinueUpdateRollback</code> request. Specify this
     *            token if you plan to retry requests so that AWS CloudFormation
     *            knows that you're not attempting to continue the rollback to a
     *            stack with the same name. You might retry
     *            <code>ContinueUpdateRollback</code> requests to ensure that
     *            AWS CloudFormation successfully received them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContinueUpdateRollbackRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getResourcesToSkip() != null)
            sb.append("ResourcesToSkip: " + getResourcesToSkip() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode
                + ((getResourcesToSkip() == null) ? 0 : getResourcesToSkip().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinueUpdateRollbackRequest == false)
            return false;
        ContinueUpdateRollbackRequest other = (ContinueUpdateRollbackRequest) obj;

        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getResourcesToSkip() == null ^ this.getResourcesToSkip() == null)
            return false;
        if (other.getResourcesToSkip() != null
                && other.getResourcesToSkip().equals(this.getResourcesToSkip()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
