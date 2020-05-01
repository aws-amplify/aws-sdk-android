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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a policy used by EFS lifecycle management to transition files to
 * the Infrequent Access (IA) storage class.
 * </p>
 */
public class LifecyclePolicy implements Serializable {
    /**
     * <p>
     * A value that describes the period of time that a file is not accessed,
     * after which it transitions to the IA storage class. Metadata operations
     * such as listing the contents of a directory don't count as file access
     * events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS,
     * AFTER_60_DAYS, AFTER_90_DAYS
     */
    private String transitionToIA;

    /**
     * <p>
     * A value that describes the period of time that a file is not accessed,
     * after which it transitions to the IA storage class. Metadata operations
     * such as listing the contents of a directory don't count as file access
     * events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS,
     * AFTER_60_DAYS, AFTER_90_DAYS
     *
     * @return <p>
     *         A value that describes the period of time that a file is not
     *         accessed, after which it transitions to the IA storage class.
     *         Metadata operations such as listing the contents of a directory
     *         don't count as file access events.
     *         </p>
     * @see TransitionToIARules
     */
    public String getTransitionToIA() {
        return transitionToIA;
    }

    /**
     * <p>
     * A value that describes the period of time that a file is not accessed,
     * after which it transitions to the IA storage class. Metadata operations
     * such as listing the contents of a directory don't count as file access
     * events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS,
     * AFTER_60_DAYS, AFTER_90_DAYS
     *
     * @param transitionToIA <p>
     *            A value that describes the period of time that a file is not
     *            accessed, after which it transitions to the IA storage class.
     *            Metadata operations such as listing the contents of a
     *            directory don't count as file access events.
     *            </p>
     * @see TransitionToIARules
     */
    public void setTransitionToIA(String transitionToIA) {
        this.transitionToIA = transitionToIA;
    }

    /**
     * <p>
     * A value that describes the period of time that a file is not accessed,
     * after which it transitions to the IA storage class. Metadata operations
     * such as listing the contents of a directory don't count as file access
     * events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS,
     * AFTER_60_DAYS, AFTER_90_DAYS
     *
     * @param transitionToIA <p>
     *            A value that describes the period of time that a file is not
     *            accessed, after which it transitions to the IA storage class.
     *            Metadata operations such as listing the contents of a
     *            directory don't count as file access events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitionToIARules
     */
    public LifecyclePolicy withTransitionToIA(String transitionToIA) {
        this.transitionToIA = transitionToIA;
        return this;
    }

    /**
     * <p>
     * A value that describes the period of time that a file is not accessed,
     * after which it transitions to the IA storage class. Metadata operations
     * such as listing the contents of a directory don't count as file access
     * events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS,
     * AFTER_60_DAYS, AFTER_90_DAYS
     *
     * @param transitionToIA <p>
     *            A value that describes the period of time that a file is not
     *            accessed, after which it transitions to the IA storage class.
     *            Metadata operations such as listing the contents of a
     *            directory don't count as file access events.
     *            </p>
     * @see TransitionToIARules
     */
    public void setTransitionToIA(TransitionToIARules transitionToIA) {
        this.transitionToIA = transitionToIA.toString();
    }

    /**
     * <p>
     * A value that describes the period of time that a file is not accessed,
     * after which it transitions to the IA storage class. Metadata operations
     * such as listing the contents of a directory don't count as file access
     * events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS,
     * AFTER_60_DAYS, AFTER_90_DAYS
     *
     * @param transitionToIA <p>
     *            A value that describes the period of time that a file is not
     *            accessed, after which it transitions to the IA storage class.
     *            Metadata operations such as listing the contents of a
     *            directory don't count as file access events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitionToIARules
     */
    public LifecyclePolicy withTransitionToIA(TransitionToIARules transitionToIA) {
        this.transitionToIA = transitionToIA.toString();
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
        if (getTransitionToIA() != null)
            sb.append("TransitionToIA: " + getTransitionToIA());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransitionToIA() == null) ? 0 : getTransitionToIA().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicy == false)
            return false;
        LifecyclePolicy other = (LifecyclePolicy) obj;

        if (other.getTransitionToIA() == null ^ this.getTransitionToIA() == null)
            return false;
        if (other.getTransitionToIA() != null
                && other.getTransitionToIA().equals(this.getTransitionToIA()) == false)
            return false;
        return true;
    }
}
