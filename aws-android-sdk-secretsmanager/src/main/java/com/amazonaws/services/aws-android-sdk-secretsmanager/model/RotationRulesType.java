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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;


/**
 * <p>A structure that defines the rotation configuration for the secret.</p>
 */
public class RotationRulesType implements Serializable {
    /**
     * <p>Specifies the number of days between automatic scheduled rotations of the secret.</p> <p>Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards the top of the hour and influenced by a variety of factors that help distribute load.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Long automaticallyAfterDays;

    /**
     * <p>Specifies the number of days between automatic scheduled rotations of the secret.</p> <p>Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards the top of the hour and influenced by a variety of factors that help distribute load.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>Specifies the number of days between automatic scheduled rotations of the secret.</p> <p>Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards the top of the hour and influenced by a variety of factors that help distribute load.</p>
     */
    public Long getAutomaticallyAfterDays() {
        return automaticallyAfterDays;
    }

    /**
     * <p>Specifies the number of days between automatic scheduled rotations of the secret.</p> <p>Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards the top of the hour and influenced by a variety of factors that help distribute load.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param automaticallyAfterDays <p>Specifies the number of days between automatic scheduled rotations of the secret.</p> <p>Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards the top of the hour and influenced by a variety of factors that help distribute load.</p>
     */
    public void setAutomaticallyAfterDays(Long automaticallyAfterDays) {
        this.automaticallyAfterDays = automaticallyAfterDays;
    }

    /**
     * <p>Specifies the number of days between automatic scheduled rotations of the secret.</p> <p>Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards the top of the hour and influenced by a variety of factors that help distribute load.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param automaticallyAfterDays <p>Specifies the number of days between automatic scheduled rotations of the secret.</p> <p>Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards the top of the hour and influenced by a variety of factors that help distribute load.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RotationRulesType withAutomaticallyAfterDays(Long automaticallyAfterDays) {
        this.automaticallyAfterDays = automaticallyAfterDays;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAutomaticallyAfterDays() != null) sb.append("AutomaticallyAfterDays: " + getAutomaticallyAfterDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomaticallyAfterDays() == null) ? 0 : getAutomaticallyAfterDays().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RotationRulesType == false) return false;
        RotationRulesType other = (RotationRulesType)obj;

        if (other.getAutomaticallyAfterDays() == null ^ this.getAutomaticallyAfterDays() == null) return false;
        if (other.getAutomaticallyAfterDays() != null && other.getAutomaticallyAfterDays().equals(this.getAutomaticallyAfterDays()) == false) return false;
        return true;
    }
}
