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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * Summarizes all DDoS attacks for a specified time period.
 * </p>
 */
public class AttackSummary implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     */
    private String attackId;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The start time of the attack, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The end time of the attack, in Unix time in seconds. For more information
     * see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The list of attacks for a specified time period.
     * </p>
     */
    private java.util.List<AttackVectorDescription> attackVectors;

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     *
     * @return <p>
     *         The unique identifier (ID) of the attack.
     *         </p>
     */
    public String getAttackId() {
        return attackId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     *
     * @param attackId <p>
     *            The unique identifier (ID) of the attack.
     *            </p>
     */
    public void setAttackId(String attackId) {
        this.attackId = attackId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attackId <p>
     *            The unique identifier (ID) of the attack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackSummary withAttackId(String attackId) {
        this.attackId = attackId;
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) of the resource that was attacked.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the resource that was
     *            attacked.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the resource that was
     *            attacked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackSummary withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The start time of the attack, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @return <p>
     *         The start time of the attack, in Unix time in seconds. For more
     *         information see <a href=
     *         "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start time of the attack, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @param startTime <p>
     *            The start time of the attack, in Unix time in seconds. For
     *            more information see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the attack, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start time of the attack, in Unix time in seconds. For
     *            more information see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackSummary withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end time of the attack, in Unix time in seconds. For more information
     * see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @return <p>
     *         The end time of the attack, in Unix time in seconds. For more
     *         information see <a href=
     *         "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end time of the attack, in Unix time in seconds. For more information
     * see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @param endTime <p>
     *            The end time of the attack, in Unix time in seconds. For more
     *            information see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the attack, in Unix time in seconds. For more information
     * see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end time of the attack, in Unix time in seconds. For more
     *            information see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackSummary withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The list of attacks for a specified time period.
     * </p>
     *
     * @return <p>
     *         The list of attacks for a specified time period.
     *         </p>
     */
    public java.util.List<AttackVectorDescription> getAttackVectors() {
        return attackVectors;
    }

    /**
     * <p>
     * The list of attacks for a specified time period.
     * </p>
     *
     * @param attackVectors <p>
     *            The list of attacks for a specified time period.
     *            </p>
     */
    public void setAttackVectors(java.util.Collection<AttackVectorDescription> attackVectors) {
        if (attackVectors == null) {
            this.attackVectors = null;
            return;
        }

        this.attackVectors = new java.util.ArrayList<AttackVectorDescription>(attackVectors);
    }

    /**
     * <p>
     * The list of attacks for a specified time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attackVectors <p>
     *            The list of attacks for a specified time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackSummary withAttackVectors(AttackVectorDescription... attackVectors) {
        if (getAttackVectors() == null) {
            this.attackVectors = new java.util.ArrayList<AttackVectorDescription>(
                    attackVectors.length);
        }
        for (AttackVectorDescription value : attackVectors) {
            this.attackVectors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of attacks for a specified time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attackVectors <p>
     *            The list of attacks for a specified time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackSummary withAttackVectors(
            java.util.Collection<AttackVectorDescription> attackVectors) {
        setAttackVectors(attackVectors);
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
        if (getAttackId() != null)
            sb.append("AttackId: " + getAttackId() + ",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getAttackVectors() != null)
            sb.append("AttackVectors: " + getAttackVectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttackId() == null) ? 0 : getAttackId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getAttackVectors() == null) ? 0 : getAttackVectors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttackSummary == false)
            return false;
        AttackSummary other = (AttackSummary) obj;

        if (other.getAttackId() == null ^ this.getAttackId() == null)
            return false;
        if (other.getAttackId() != null && other.getAttackId().equals(this.getAttackId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getAttackVectors() == null ^ this.getAttackVectors() == null)
            return false;
        if (other.getAttackVectors() != null
                && other.getAttackVectors().equals(this.getAttackVectors()) == false)
            return false;
        return true;
    }
}
