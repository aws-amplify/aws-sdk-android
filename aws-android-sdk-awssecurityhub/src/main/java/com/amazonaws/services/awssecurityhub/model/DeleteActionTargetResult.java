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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

public class DeleteActionTargetResult implements Serializable {
    /**
     * <p>
     * The ARN of the custom action target that was deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String actionTargetArn;

    /**
     * <p>
     * The ARN of the custom action target that was deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of the custom action target that was deleted.
     *         </p>
     */
    public String getActionTargetArn() {
        return actionTargetArn;
    }

    /**
     * <p>
     * The ARN of the custom action target that was deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param actionTargetArn <p>
     *            The ARN of the custom action target that was deleted.
     *            </p>
     */
    public void setActionTargetArn(String actionTargetArn) {
        this.actionTargetArn = actionTargetArn;
    }

    /**
     * <p>
     * The ARN of the custom action target that was deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param actionTargetArn <p>
     *            The ARN of the custom action target that was deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteActionTargetResult withActionTargetArn(String actionTargetArn) {
        this.actionTargetArn = actionTargetArn;
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
        if (getActionTargetArn() != null)
            sb.append("ActionTargetArn: " + getActionTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActionTargetArn() == null) ? 0 : getActionTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteActionTargetResult == false)
            return false;
        DeleteActionTargetResult other = (DeleteActionTargetResult) obj;

        if (other.getActionTargetArn() == null ^ this.getActionTargetArn() == null)
            return false;
        if (other.getActionTargetArn() != null
                && other.getActionTargetArn().equals(this.getActionTargetArn()) == false)
            return false;
        return true;
    }
}
