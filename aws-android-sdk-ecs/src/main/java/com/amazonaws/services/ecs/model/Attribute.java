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
 * An attribute is a name-value pair associated with an Amazon ECS object.
 * Attributes enable you to extend the Amazon ECS data model by adding custom
 * metadata to your resources. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
 * >Attributes</a> in the <i>Amazon Elastic Container Service Developer
 * Guide</i>.
 * </p>
 */
public class Attribute implements Serializable {
    /**
     * <p>
     * The name of the attribute. Up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, and periods are allowed.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The value of the attribute. Up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, periods, at signs (@), forward slashes,
     * colons, and spaces are allowed.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter
     * is required if you use the short form ID for a resource instead of the
     * full ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     */
    private String targetType;

    /**
     * <p>
     * The ID of the target. You can specify the short form ID for a resource or
     * the full Amazon Resource Name (ARN).
     * </p>
     */
    private String targetId;

    /**
     * <p>
     * The name of the attribute. Up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, and periods are allowed.
     * </p>
     *
     * @return <p>
     *         The name of the attribute. Up to 128 letters (uppercase and
     *         lowercase), numbers, hyphens, underscores, and periods are
     *         allowed.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the attribute. Up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, and periods are allowed.
     * </p>
     *
     * @param name <p>
     *            The name of the attribute. Up to 128 letters (uppercase and
     *            lowercase), numbers, hyphens, underscores, and periods are
     *            allowed.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute. Up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, and periods are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the attribute. Up to 128 letters (uppercase and
     *            lowercase), numbers, hyphens, underscores, and periods are
     *            allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attribute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The value of the attribute. Up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, periods, at signs (@), forward slashes,
     * colons, and spaces are allowed.
     * </p>
     *
     * @return <p>
     *         The value of the attribute. Up to 128 letters (uppercase and
     *         lowercase), numbers, hyphens, underscores, periods, at signs (@),
     *         forward slashes, colons, and spaces are allowed.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the attribute. Up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, periods, at signs (@), forward slashes,
     * colons, and spaces are allowed.
     * </p>
     *
     * @param value <p>
     *            The value of the attribute. Up to 128 letters (uppercase and
     *            lowercase), numbers, hyphens, underscores, periods, at signs
     *            (@), forward slashes, colons, and spaces are allowed.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the attribute. Up to 128 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, periods, at signs (@), forward slashes,
     * colons, and spaces are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the attribute. Up to 128 letters (uppercase and
     *            lowercase), numbers, hyphens, underscores, periods, at signs
     *            (@), forward slashes, colons, and spaces are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attribute withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter
     * is required if you use the short form ID for a resource instead of the
     * full ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     *
     * @return <p>
     *         The type of the target with which to attach the attribute. This
     *         parameter is required if you use the short form ID for a resource
     *         instead of the full ARN.
     *         </p>
     * @see TargetType
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter
     * is required if you use the short form ID for a resource instead of the
     * full ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     *
     * @param targetType <p>
     *            The type of the target with which to attach the attribute.
     *            This parameter is required if you use the short form ID for a
     *            resource instead of the full ARN.
     *            </p>
     * @see TargetType
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter
     * is required if you use the short form ID for a resource instead of the
     * full ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     *
     * @param targetType <p>
     *            The type of the target with which to attach the attribute.
     *            This parameter is required if you use the short form ID for a
     *            resource instead of the full ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetType
     */
    public Attribute withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter
     * is required if you use the short form ID for a resource instead of the
     * full ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     *
     * @param targetType <p>
     *            The type of the target with which to attach the attribute.
     *            This parameter is required if you use the short form ID for a
     *            resource instead of the full ARN.
     *            </p>
     * @see TargetType
     */
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
    }

    /**
     * <p>
     * The type of the target with which to attach the attribute. This parameter
     * is required if you use the short form ID for a resource instead of the
     * full ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>container-instance
     *
     * @param targetType <p>
     *            The type of the target with which to attach the attribute.
     *            This parameter is required if you use the short form ID for a
     *            resource instead of the full ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetType
     */
    public Attribute withTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the target. You can specify the short form ID for a resource or
     * the full Amazon Resource Name (ARN).
     * </p>
     *
     * @return <p>
     *         The ID of the target. You can specify the short form ID for a
     *         resource or the full Amazon Resource Name (ARN).
     *         </p>
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * <p>
     * The ID of the target. You can specify the short form ID for a resource or
     * the full Amazon Resource Name (ARN).
     * </p>
     *
     * @param targetId <p>
     *            The ID of the target. You can specify the short form ID for a
     *            resource or the full Amazon Resource Name (ARN).
     *            </p>
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The ID of the target. You can specify the short form ID for a resource or
     * the full Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetId <p>
     *            The ID of the target. You can specify the short form ID for a
     *            resource or the full Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attribute withTargetId(String targetId) {
        this.targetId = targetId;
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
        if (getTargetType() != null)
            sb.append("targetType: " + getTargetType() + ",");
        if (getTargetId() != null)
            sb.append("targetId: " + getTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attribute == false)
            return false;
        Attribute other = (Attribute) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null
                && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        return true;
    }
}
