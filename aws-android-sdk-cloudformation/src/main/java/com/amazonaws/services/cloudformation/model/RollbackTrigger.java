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

/**
 * <p>
 * A rollback trigger AWS CloudFormation monitors during creation and updating
 * of stacks. If any of the alarms you specify goes to ALARM state during the
 * stack operation or within the specified monitoring period afterwards,
 * CloudFormation rolls back the entire stack operation.
 * </p>
 */
public class RollbackTrigger implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rollback trigger.
     * </p>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and
     * is rolled back.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The resource type of the rollback trigger. Currently, <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     * >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rollback trigger.
     * </p>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and
     * is rolled back.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the rollback trigger.
     *         </p>
     *         <p>
     *         If a specified trigger is missing, the entire stack operation
     *         fails and is rolled back.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rollback trigger.
     * </p>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and
     * is rolled back.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the rollback trigger.
     *            </p>
     *            <p>
     *            If a specified trigger is missing, the entire stack operation
     *            fails and is rolled back.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rollback trigger.
     * </p>
     * <p>
     * If a specified trigger is missing, the entire stack operation fails and
     * is rolled back.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the rollback trigger.
     *            </p>
     *            <p>
     *            If a specified trigger is missing, the entire stack operation
     *            fails and is rolled back.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RollbackTrigger withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The resource type of the rollback trigger. Currently, <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     * >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     * </p>
     *
     * @return <p>
     *         The resource type of the rollback trigger. Currently, <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     *         >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The resource type of the rollback trigger. Currently, <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     * >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     * </p>
     *
     * @param type <p>
     *            The resource type of the rollback trigger. Currently, <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     *            >AWS::CloudWatch::Alarm</a> is the only supported resource
     *            type.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The resource type of the rollback trigger. Currently, <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     * >AWS::CloudWatch::Alarm</a> is the only supported resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The resource type of the rollback trigger. Currently, <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-alarm.html"
     *            >AWS::CloudWatch::Alarm</a> is the only supported resource
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RollbackTrigger withType(String type) {
        this.type = type;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollbackTrigger == false)
            return false;
        RollbackTrigger other = (RollbackTrigger) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
