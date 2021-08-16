/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Shows the results of the human in the loop evaluation. If there is no
 * HumanLoopArn, the input did not trigger human review.
 * </p>
 */
public class HumanLoopActivationOutput implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the HumanLoop created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String humanLoopArn;

    /**
     * <p>
     * Shows if and why human review was needed.
     * </p>
     */
    private java.util.List<String> humanLoopActivationReasons;

    /**
     * <p>
     * Shows the result of condition evaluations, including those conditions
     * which activated a human review.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     */
    private String humanLoopActivationConditionsEvaluationResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the HumanLoop created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the HumanLoop created.
     *         </p>
     */
    public String getHumanLoopArn() {
        return humanLoopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the HumanLoop created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param humanLoopArn <p>
     *            The Amazon Resource Name (ARN) of the HumanLoop created.
     *            </p>
     */
    public void setHumanLoopArn(String humanLoopArn) {
        this.humanLoopArn = humanLoopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the HumanLoop created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param humanLoopArn <p>
     *            The Amazon Resource Name (ARN) of the HumanLoop created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopActivationOutput withHumanLoopArn(String humanLoopArn) {
        this.humanLoopArn = humanLoopArn;
        return this;
    }

    /**
     * <p>
     * Shows if and why human review was needed.
     * </p>
     *
     * @return <p>
     *         Shows if and why human review was needed.
     *         </p>
     */
    public java.util.List<String> getHumanLoopActivationReasons() {
        return humanLoopActivationReasons;
    }

    /**
     * <p>
     * Shows if and why human review was needed.
     * </p>
     *
     * @param humanLoopActivationReasons <p>
     *            Shows if and why human review was needed.
     *            </p>
     */
    public void setHumanLoopActivationReasons(
            java.util.Collection<String> humanLoopActivationReasons) {
        if (humanLoopActivationReasons == null) {
            this.humanLoopActivationReasons = null;
            return;
        }

        this.humanLoopActivationReasons = new java.util.ArrayList<String>(
                humanLoopActivationReasons);
    }

    /**
     * <p>
     * Shows if and why human review was needed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopActivationReasons <p>
     *            Shows if and why human review was needed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopActivationOutput withHumanLoopActivationReasons(
            String... humanLoopActivationReasons) {
        if (getHumanLoopActivationReasons() == null) {
            this.humanLoopActivationReasons = new java.util.ArrayList<String>(
                    humanLoopActivationReasons.length);
        }
        for (String value : humanLoopActivationReasons) {
            this.humanLoopActivationReasons.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Shows if and why human review was needed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopActivationReasons <p>
     *            Shows if and why human review was needed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopActivationOutput withHumanLoopActivationReasons(
            java.util.Collection<String> humanLoopActivationReasons) {
        setHumanLoopActivationReasons(humanLoopActivationReasons);
        return this;
    }

    /**
     * <p>
     * Shows the result of condition evaluations, including those conditions
     * which activated a human review.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @return <p>
     *         Shows the result of condition evaluations, including those
     *         conditions which activated a human review.
     *         </p>
     */
    public String getHumanLoopActivationConditionsEvaluationResults() {
        return humanLoopActivationConditionsEvaluationResults;
    }

    /**
     * <p>
     * Shows the result of condition evaluations, including those conditions
     * which activated a human review.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @param humanLoopActivationConditionsEvaluationResults <p>
     *            Shows the result of condition evaluations, including those
     *            conditions which activated a human review.
     *            </p>
     */
    public void setHumanLoopActivationConditionsEvaluationResults(
            String humanLoopActivationConditionsEvaluationResults) {
        this.humanLoopActivationConditionsEvaluationResults = humanLoopActivationConditionsEvaluationResults;
    }

    /**
     * <p>
     * Shows the result of condition evaluations, including those conditions
     * which activated a human review.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @param humanLoopActivationConditionsEvaluationResults <p>
     *            Shows the result of condition evaluations, including those
     *            conditions which activated a human review.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopActivationOutput withHumanLoopActivationConditionsEvaluationResults(
            String humanLoopActivationConditionsEvaluationResults) {
        this.humanLoopActivationConditionsEvaluationResults = humanLoopActivationConditionsEvaluationResults;
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
        if (getHumanLoopArn() != null)
            sb.append("HumanLoopArn: " + getHumanLoopArn() + ",");
        if (getHumanLoopActivationReasons() != null)
            sb.append("HumanLoopActivationReasons: " + getHumanLoopActivationReasons() + ",");
        if (getHumanLoopActivationConditionsEvaluationResults() != null)
            sb.append("HumanLoopActivationConditionsEvaluationResults: "
                    + getHumanLoopActivationConditionsEvaluationResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHumanLoopArn() == null) ? 0 : getHumanLoopArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getHumanLoopActivationReasons() == null) ? 0 : getHumanLoopActivationReasons()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHumanLoopActivationConditionsEvaluationResults() == null) ? 0
                        : getHumanLoopActivationConditionsEvaluationResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopActivationOutput == false)
            return false;
        HumanLoopActivationOutput other = (HumanLoopActivationOutput) obj;

        if (other.getHumanLoopArn() == null ^ this.getHumanLoopArn() == null)
            return false;
        if (other.getHumanLoopArn() != null
                && other.getHumanLoopArn().equals(this.getHumanLoopArn()) == false)
            return false;
        if (other.getHumanLoopActivationReasons() == null
                ^ this.getHumanLoopActivationReasons() == null)
            return false;
        if (other.getHumanLoopActivationReasons() != null
                && other.getHumanLoopActivationReasons().equals(
                        this.getHumanLoopActivationReasons()) == false)
            return false;
        if (other.getHumanLoopActivationConditionsEvaluationResults() == null
                ^ this.getHumanLoopActivationConditionsEvaluationResults() == null)
            return false;
        if (other.getHumanLoopActivationConditionsEvaluationResults() != null
                && other.getHumanLoopActivationConditionsEvaluationResults().equals(
                        this.getHumanLoopActivationConditionsEvaluationResults()) == false)
            return false;
        return true;
    }
}
