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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disables an account setting for a specified IAM user, IAM role, or the root
 * user for an account.
 * </p>
 */
public class DeleteAccountSettingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The resource name for which to disable the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     */
    private String name;

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If you specify the root user, it disables the account setting for
     * all IAM users, IAM roles, and the root user of the account unless an IAM
     * user or role explicitly overrides these settings. If this field is
     * omitted, the setting is changed only for the authenticated user.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * The resource name for which to disable the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @return <p>
     *         The resource name for which to disable the account setting. If
     *         <code>serviceLongArnFormat</code> is specified, the ARN for your
     *         Amazon ECS services is affected. If
     *         <code>taskLongArnFormat</code> is specified, the ARN and resource
     *         ID for your Amazon ECS tasks is affected. If
     *         <code>containerInstanceLongArnFormat</code> is specified, the ARN
     *         and resource ID for your Amazon ECS container instances is
     *         affected. If <code>awsvpcTrunking</code> is specified, the ENI
     *         limit for your Amazon ECS container instances is affected.
     *         </p>
     * @see SettingName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The resource name for which to disable the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The resource name for which to disable the account setting. If
     *            <code>serviceLongArnFormat</code> is specified, the ARN for
     *            your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the ENI
     *            limit for your Amazon ECS container instances is affected.
     *            </p>
     * @see SettingName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The resource name for which to disable the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The resource name for which to disable the account setting. If
     *            <code>serviceLongArnFormat</code> is specified, the ARN for
     *            your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the ENI
     *            limit for your Amazon ECS container instances is affected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettingName
     */
    public DeleteAccountSettingRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The resource name for which to disable the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The resource name for which to disable the account setting. If
     *            <code>serviceLongArnFormat</code> is specified, the ARN for
     *            your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the ENI
     *            limit for your Amazon ECS container instances is affected.
     *            </p>
     * @see SettingName
     */
    public void setName(SettingName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The resource name for which to disable the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The resource name for which to disable the account setting. If
     *            <code>serviceLongArnFormat</code> is specified, the ARN for
     *            your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the ENI
     *            limit for your Amazon ECS container instances is affected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettingName
     */
    public DeleteAccountSettingRequest withName(SettingName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If you specify the root user, it disables the account setting for
     * all IAM users, IAM roles, and the root user of the account unless an IAM
     * user or role explicitly overrides these settings. If this field is
     * omitted, the setting is changed only for the authenticated user.
     * </p>
     *
     * @return <p>
     *         The ARN of the principal, which can be an IAM user, IAM role, or
     *         the root user. If you specify the root user, it disables the
     *         account setting for all IAM users, IAM roles, and the root user
     *         of the account unless an IAM user or role explicitly overrides
     *         these settings. If this field is omitted, the setting is changed
     *         only for the authenticated user.
     *         </p>
     */
    public String getPrincipalArn() {
        return principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If you specify the root user, it disables the account setting for
     * all IAM users, IAM roles, and the root user of the account unless an IAM
     * user or role explicitly overrides these settings. If this field is
     * omitted, the setting is changed only for the authenticated user.
     * </p>
     *
     * @param principalArn <p>
     *            The ARN of the principal, which can be an IAM user, IAM role,
     *            or the root user. If you specify the root user, it disables
     *            the account setting for all IAM users, IAM roles, and the root
     *            user of the account unless an IAM user or role explicitly
     *            overrides these settings. If this field is omitted, the
     *            setting is changed only for the authenticated user.
     *            </p>
     */
    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If you specify the root user, it disables the account setting for
     * all IAM users, IAM roles, and the root user of the account unless an IAM
     * user or role explicitly overrides these settings. If this field is
     * omitted, the setting is changed only for the authenticated user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principalArn <p>
     *            The ARN of the principal, which can be an IAM user, IAM role,
     *            or the root user. If you specify the root user, it disables
     *            the account setting for all IAM users, IAM roles, and the root
     *            user of the account unless an IAM user or role explicitly
     *            overrides these settings. If this field is omitted, the
     *            setting is changed only for the authenticated user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAccountSettingRequest withPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
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
            sb.append("name: " + getName() + ",");
        if (getPrincipalArn() != null)
            sb.append("principalArn: " + getPrincipalArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAccountSettingRequest == false)
            return false;
        DeleteAccountSettingRequest other = (DeleteAccountSettingRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null
                && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        return true;
    }
}
