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
 * Modifies an account setting for all IAM users on an account for whom no
 * individual account setting has been specified. Account settings are set on a
 * per-Region basis.
 * </p>
 */
public class PutAccountSettingDefaultRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected. If <code>containerInsights</code> is
     * specified, the default setting for CloudWatch Container Insights for your
     * clusters is affected.
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
     * The resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected. If <code>containerInsights</code> is
     * specified, the default setting for CloudWatch Container Insights for your
     * clusters is affected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @return <p>
     *         The resource name for which to modify the account setting. If
     *         <code>serviceLongArnFormat</code> is specified, the ARN for your
     *         Amazon ECS services is affected. If
     *         <code>taskLongArnFormat</code> is specified, the ARN and resource
     *         ID for your Amazon ECS tasks is affected. If
     *         <code>containerInstanceLongArnFormat</code> is specified, the ARN
     *         and resource ID for your Amazon ECS container instances is
     *         affected. If <code>awsvpcTrunking</code> is specified, the ENI
     *         limit for your Amazon ECS container instances is affected. If
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
     * The resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected. If <code>containerInsights</code> is
     * specified, the default setting for CloudWatch Container Insights for your
     * clusters is affected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The resource name for which to modify the account setting. If
     *            <code>serviceLongArnFormat</code> is specified, the ARN for
     *            your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the ENI
     *            limit for your Amazon ECS container instances is affected. If
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
     * The resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected. If <code>containerInsights</code> is
     * specified, the default setting for CloudWatch Container Insights for your
     * clusters is affected.
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
     *            The resource name for which to modify the account setting. If
     *            <code>serviceLongArnFormat</code> is specified, the ARN for
     *            your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the ENI
     *            limit for your Amazon ECS container instances is affected. If
     *            <code>containerInsights</code> is specified, the default
     *            setting for CloudWatch Container Insights for your clusters is
     *            affected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettingName
     */
    public PutAccountSettingDefaultRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected. If <code>containerInsights</code> is
     * specified, the default setting for CloudWatch Container Insights for your
     * clusters is affected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The resource name for which to modify the account setting. If
     *            <code>serviceLongArnFormat</code> is specified, the ARN for
     *            your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the ENI
     *            limit for your Amazon ECS container instances is affected. If
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
     * The resource name for which to modify the account setting. If
     * <code>serviceLongArnFormat</code> is specified, the ARN for your Amazon
     * ECS services is affected. If <code>taskLongArnFormat</code> is specified,
     * the ARN and resource ID for your Amazon ECS tasks is affected. If
     * <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances is affected. If
     * <code>awsvpcTrunking</code> is specified, the ENI limit for your Amazon
     * ECS container instances is affected. If <code>containerInsights</code> is
     * specified, the default setting for CloudWatch Container Insights for your
     * clusters is affected.
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
     *            The resource name for which to modify the account setting. If
     *            <code>serviceLongArnFormat</code> is specified, the ARN for
     *            your Amazon ECS services is affected. If
     *            <code>taskLongArnFormat</code> is specified, the ARN and
     *            resource ID for your Amazon ECS tasks is affected. If
     *            <code>containerInstanceLongArnFormat</code> is specified, the
     *            ARN and resource ID for your Amazon ECS container instances is
     *            affected. If <code>awsvpcTrunking</code> is specified, the ENI
     *            limit for your Amazon ECS container instances is affected. If
     *            <code>containerInsights</code> is specified, the default
     *            setting for CloudWatch Container Insights for your clusters is
     *            affected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettingName
     */
    public PutAccountSettingDefaultRequest withName(SettingName name) {
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
    public PutAccountSettingDefaultRequest withValue(String value) {
        this.value = value;
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
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccountSettingDefaultRequest == false)
            return false;
        PutAccountSettingDefaultRequest other = (PutAccountSettingDefaultRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
