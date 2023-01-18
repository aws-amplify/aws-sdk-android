/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class CreateRuleResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     */
    private String ruleArn;

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String ruleId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the rule.
     *         </p>
     */
    public String getRuleArn() {
        return ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     *
     * @param ruleArn <p>
     *            The Amazon Resource Name (ARN) of the rule.
     *            </p>
     */
    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleArn <p>
     *            The Amazon Resource Name (ARN) of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRuleResult withRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A unique identifier for the rule.
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param ruleId <p>
     *            A unique identifier for the rule.
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param ruleId <p>
     *            A unique identifier for the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRuleResult withRuleId(String ruleId) {
        this.ruleId = ruleId;
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
        if (getRuleArn() != null)
            sb.append("RuleArn: " + getRuleArn() + ",");
        if (getRuleId() != null)
            sb.append("RuleId: " + getRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRuleResult == false)
            return false;
        CreateRuleResult other = (CreateRuleResult) obj;

        if (other.getRuleArn() == null ^ this.getRuleArn() == null)
            return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        return true;
    }
}
