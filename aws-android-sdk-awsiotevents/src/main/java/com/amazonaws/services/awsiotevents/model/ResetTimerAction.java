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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Information required to reset the timer. The timer is reset to the previously
 * evaluated result of the duration. The duration expression isn't reevaluated
 * when you reset the timer.
 * </p>
 */
public class ResetTimerAction implements Serializable {
    /**
     * <p>
     * The name of the timer to reset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String timerName;

    /**
     * <p>
     * The name of the timer to reset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The name of the timer to reset.
     *         </p>
     */
    public String getTimerName() {
        return timerName;
    }

    /**
     * <p>
     * The name of the timer to reset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param timerName <p>
     *            The name of the timer to reset.
     *            </p>
     */
    public void setTimerName(String timerName) {
        this.timerName = timerName;
    }

    /**
     * <p>
     * The name of the timer to reset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param timerName <p>
     *            The name of the timer to reset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetTimerAction withTimerName(String timerName) {
        this.timerName = timerName;
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
        if (getTimerName() != null)
            sb.append("timerName: " + getTimerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimerName() == null) ? 0 : getTimerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetTimerAction == false)
            return false;
        ResetTimerAction other = (ResetTimerAction) obj;

        if (other.getTimerName() == null ^ this.getTimerName() == null)
            return false;
        if (other.getTimerName() != null
                && other.getTimerName().equals(this.getTimerName()) == false)
            return false;
        return true;
    }
}
