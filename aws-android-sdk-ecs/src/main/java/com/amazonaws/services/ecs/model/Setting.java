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

/**
 * <p>
 * The current account setting for a resource.
 * </p>
 */
public class Setting implements Serializable {
    /**
     * <p>
     * The Amazon ECS resource name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     */
    private String name;

    /**
     * <p>
     * Whether the account setting is enabled or disabled for the specified
     * resource.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If this field is omitted, the authenticated user is assumed.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * The Amazon ECS resource name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @return <p>
     *         The Amazon ECS resource name.
     *         </p>
     * @see SettingName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The Amazon ECS resource name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The Amazon ECS resource name.
     *            </p>
     * @see SettingName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The Amazon ECS resource name.
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
     *            The Amazon ECS resource name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettingName
     */
    public Setting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon ECS resource name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>serviceLongArnFormat, taskLongArnFormat,
     * containerInstanceLongArnFormat, awsvpcTrunking, containerInsights
     *
     * @param name <p>
     *            The Amazon ECS resource name.
     *            </p>
     * @see SettingName
     */
    public void setName(SettingName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The Amazon ECS resource name.
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
     *            The Amazon ECS resource name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettingName
     */
    public Setting withName(SettingName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Whether the account setting is enabled or disabled for the specified
     * resource.
     * </p>
     *
     * @return <p>
     *         Whether the account setting is enabled or disabled for the
     *         specified resource.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * Whether the account setting is enabled or disabled for the specified
     * resource.
     * </p>
     *
     * @param value <p>
     *            Whether the account setting is enabled or disabled for the
     *            specified resource.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Whether the account setting is enabled or disabled for the specified
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            Whether the account setting is enabled or disabled for the
     *            specified resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Setting withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If this field is omitted, the authenticated user is assumed.
     * </p>
     *
     * @return <p>
     *         The ARN of the principal, which can be an IAM user, IAM role, or
     *         the root user. If this field is omitted, the authenticated user
     *         is assumed.
     *         </p>
     */
    public String getPrincipalArn() {
        return principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If this field is omitted, the authenticated user is assumed.
     * </p>
     *
     * @param principalArn <p>
     *            The ARN of the principal, which can be an IAM user, IAM role,
     *            or the root user. If this field is omitted, the authenticated
     *            user is assumed.
     *            </p>
     */
    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root
     * user. If this field is omitted, the authenticated user is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principalArn <p>
     *            The ARN of the principal, which can be an IAM user, IAM role,
     *            or the root user. If this field is omitted, the authenticated
     *            user is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Setting withPrincipalArn(String principalArn) {
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

        if (obj instanceof Setting == false)
            return false;
        Setting other = (Setting) obj;

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
