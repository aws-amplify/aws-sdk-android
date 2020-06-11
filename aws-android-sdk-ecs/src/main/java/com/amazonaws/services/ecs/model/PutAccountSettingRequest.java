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
 * Modifies an account setting. Account settings are set on a per-Region basis.
 * </p>
 * <p>
 * If you change the account setting for the root user, the default settings for
 * all of the IAM users and roles for which no individual account setting has
 * been specified are reset. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html"
 * >Account Settings</a> in the <i>Amazon Elastic Container Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * When <code>serviceLongArnFormat</code>, <code>taskLongArnFormat</code>, or
 * <code>containerInstanceLongArnFormat</code> are specified, the Amazon
 * Resource Name (ARN) and resource ID format of the resource type for a
 * specified IAM user, IAM role, or the root user for an account is affected.
 * The opt-in and opt-out account setting must be set for each Amazon ECS
 * resource separately. The ARN and resource ID format of a resource will be
 * defined by the opt-in status of the IAM user or role that created the
 * resource. You must enable this setting to use Amazon ECS features such as
 * resource tagging.
 * </p>
 * <p>
 * When <code>awsvpcTrunking</code> is specified, the elastic network interface
 * (ENI) limit for any new container instances that support the feature is
 * changed. If <code>awsvpcTrunking</code> is enabled, any new container
 * instances that support the feature are launched have the increased ENI limits
 * available to them. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-eni.html"
 * >Elastic Network Interface Trunking</a> in the <i>Amazon Elastic Container
 * Service Developer Guide</i>.
 * </p>
 * <p>
 * When <code>containerInsights</code> is specified, the default setting
 * indicating whether CloudWatch Container Insights is enabled for your clusters
 * is changed. If <code>containerInsights</code> is enabled, any new clusters
 * that are created will have Container Insights enabled unless you disable it
 * during cluster creation. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-container-insights.html"
 * >CloudWatch Container Insights</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 */
public class PutAccountSettingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon ECS resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the elastic network interface
     * (ENI) limit for your Amazon ECS container instances is affected. If
     * <code>containerInsights</code> is specified, the default setting for
     * CloudWatch Container Insights for your clusters is affected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     */
    private String name;

    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted
     * values are <code>enabled</code> and <code>disabled</code>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If you specify the root user, it modifies the account setting for
     * all IAM users, IAM roles, and the root user of the account unless an IAM
     * user or role explicitly overrides these settings. If this field is
     * omitted, the setting is changed only for the authenticated user.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * The Amazon ECS resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the elastic network interface
     * (ENI) limit for your Amazon ECS container instances is affected. If
     * <code>containerInsights</code> is specified, the default setting for
     * CloudWatch Container Insights for your clusters is affected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @return <p>
     *         The Amazon ECS resource name for which to modify the account
     *         setting. If <code>serviceLongArnFormat</code> is specified, the
     *         ARN for your Amazon ECS services is affected. If
     *         <code>taskLongArnFormat</code> is specified, the ARN and resource
     *         ID for your Amazon ECS tasks is affected. If
     *         <code>containerInstanceLongArnFormat</code> is specified, the ARN
     *         and resource ID for your Amazon ECS container instances is
     *         affected. If <code>awsvpcTrunking</code> is specified, the
     *         elastic network interface (ENI) limit for your Amazon ECS
     *         container instances is affected. If
     *         <code>containerInsights</code> is specified, the default setting
     *         for CloudWatch Container Insights for your clusters is affected.
     *         </p>
     * @see SettingName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The Amazon ECS resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the elastic network interface
     * (ENI) limit for your Amazon ECS container instances is affected. If
     * <code>containerInsights</code> is specified, the default setting for
     * CloudWatch Container Insights for your clusters is affected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The Amazon ECS resource name for which to modify the account
     *            setting. If <code>serviceLongArnFormat</code> is specified,
     *            the ARN for your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the
     *            elastic network interface (ENI) limit for your Amazon ECS
     *            container instances is affected. If
     *            <code>containerInsights</code> is specified, the default
     *            setting for CloudWatch Container Insights for your clusters is
     *            affected.
     *            </p>
     * @see SettingName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The Amazon ECS resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the elastic network interface
     * (ENI) limit for your Amazon ECS container instances is affected. If
     * <code>containerInsights</code> is specified, the default setting for
     * CloudWatch Container Insights for your clusters is affected.
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
     *            The Amazon ECS resource name for which to modify the account
     *            setting. If <code>serviceLongArnFormat</code> is specified,
     *            the ARN for your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the
     *            elastic network interface (ENI) limit for your Amazon ECS
     *            container instances is affected. If
     *            <code>containerInsights</code> is specified, the default
     *            setting for CloudWatch Container Insights for your clusters is
     *            affected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettingName
     */
    public PutAccountSettingRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon ECS resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the elastic network interface
     * (ENI) limit for your Amazon ECS container instances is affected. If
     * <code>containerInsights</code> is specified, the default setting for
     * CloudWatch Container Insights for your clusters is affected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The Amazon ECS resource name for which to modify the account
     *            setting. If <code>serviceLongArnFormat</code> is specified,
     *            the ARN for your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the
     *            elastic network interface (ENI) limit for your Amazon ECS
     *            container instances is affected. If
     *            <code>containerInsights</code> is specified, the default
     *            setting for CloudWatch Container Insights for your clusters is
     *            affected.
     *            </p>
     * @see SettingName
     */
    public void setName(SettingName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The Amazon ECS resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the elastic network interface
     * (ENI) limit for your Amazon ECS container instances is affected. If
     * <code>containerInsights</code> is specified, the default setting for
     * CloudWatch Container Insights for your clusters is affected.
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
     *            The Amazon ECS resource name for which to modify the account
     *            setting. If <code>serviceLongArnFormat</code> is specified,
     *            the ARN for your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the
     *            elastic network interface (ENI) limit for your Amazon ECS
     *            container instances is affected. If
     *            <code>containerInsights</code> is specified, the default
     *            setting for CloudWatch Container Insights for your clusters is
     *            affected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettingName
     */
    public PutAccountSettingRequest withName(SettingName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted
     * values are <code>enabled</code> and <code>disabled</code>.
     * </p>
     *
     * @return <p>
     *         The account setting value for the specified principal ARN.
     *         Accepted values are <code>enabled</code> and
     *         <code>disabled</code>.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted
     * values are <code>enabled</code> and <code>disabled</code>.
     * </p>
     *
     * @param value <p>
     *            The account setting value for the specified principal ARN.
     *            Accepted values are <code>enabled</code> and
     *            <code>disabled</code>.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted
     * values are <code>enabled</code> and <code>disabled</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The account setting value for the specified principal ARN.
     *            Accepted values are <code>enabled</code> and
     *            <code>disabled</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccountSettingRequest withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If you specify the root user, it modifies the account setting for
     * all IAM users, IAM roles, and the root user of the account unless an IAM
     * user or role explicitly overrides these settings. If this field is
     * omitted, the setting is changed only for the authenticated user.
     * </p>
     *
     * @return <p>
     *         The ARN of the principal, which can be an IAM user, IAM role, or
     *         the root user. If you specify the root user, it modifies the
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
     * user. If you specify the root user, it modifies the account setting for
     * all IAM users, IAM roles, and the root user of the account unless an IAM
     * user or role explicitly overrides these settings. If this field is
     * omitted, the setting is changed only for the authenticated user.
     * </p>
     *
     * @param principalArn <p>
     *            The ARN of the principal, which can be an IAM user, IAM role,
     *            or the root user. If you specify the root user, it modifies
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
     * user. If you specify the root user, it modifies the account setting for
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
     *            or the root user. If you specify the root user, it modifies
     *            the account setting for all IAM users, IAM roles, and the root
     *            user of the account unless an IAM user or role explicitly
     *            overrides these settings. If this field is omitted, the
     *            setting is changed only for the authenticated user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAccountSettingRequest withPrincipalArn(String principalArn) {
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
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
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
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
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

        if (obj instanceof PutAccountSettingRequest == false)
            return false;
        PutAccountSettingRequest other = (PutAccountSettingRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null
                && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        return true;
    }
}
