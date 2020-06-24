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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a custom rewrite or redirect rule.
 * </p>
 */
public class CustomRule implements Serializable {
    /**
     * <p>
     * The source pattern for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String source;

    /**
     * <p>
     * The target pattern for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String target;

    /**
     * <p>
     * The status code for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 7<br/>
     */
    private String status;

    /**
     * <p>
     * The condition for a URL rewrite or redirect rule, such as a country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String condition;

    /**
     * <p>
     * The source pattern for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The source pattern for a URL rewrite or redirect rule.
     *         </p>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The source pattern for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param source <p>
     *            The source pattern for a URL rewrite or redirect rule.
     *            </p>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source pattern for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param source <p>
     *            The source pattern for a URL rewrite or redirect rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomRule withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The target pattern for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The target pattern for a URL rewrite or redirect rule.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The target pattern for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param target <p>
     *            The target pattern for a URL rewrite or redirect rule.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target pattern for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param target <p>
     *            The target pattern for a URL rewrite or redirect rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomRule withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * The status code for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 7<br/>
     *
     * @return <p>
     *         The status code for a URL rewrite or redirect rule.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status code for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 7<br/>
     *
     * @param status <p>
     *            The status code for a URL rewrite or redirect rule.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status code for a URL rewrite or redirect rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 7<br/>
     *
     * @param status <p>
     *            The status code for a URL rewrite or redirect rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomRule withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The condition for a URL rewrite or redirect rule, such as a country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The condition for a URL rewrite or redirect rule, such as a
     *         country code.
     *         </p>
     */
    public String getCondition() {
        return condition;
    }

    /**
     * <p>
     * The condition for a URL rewrite or redirect rule, such as a country code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param condition <p>
     *            The condition for a URL rewrite or redirect rule, such as a
     *            country code.
     *            </p>
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition for a URL rewrite or redirect rule, such as a country code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param condition <p>
     *            The condition for a URL rewrite or redirect rule, such as a
     *            country code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomRule withCondition(String condition) {
        this.condition = condition;
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
        if (getSource() != null)
            sb.append("source: " + getSource() + ",");
        if (getTarget() != null)
            sb.append("target: " + getTarget() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getCondition() != null)
            sb.append("condition: " + getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomRule == false)
            return false;
        CustomRule other = (CustomRule) obj;

        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null
                && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }
}
