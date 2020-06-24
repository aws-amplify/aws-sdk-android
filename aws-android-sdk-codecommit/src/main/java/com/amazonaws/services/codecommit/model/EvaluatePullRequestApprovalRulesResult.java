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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

public class EvaluatePullRequestApprovalRulesResult implements Serializable {
    /**
     * <p>
     * The result of the evaluation, including the names of the rules whose
     * conditions have been met (if any), the names of the rules whose
     * conditions have not been met (if any), whether the pull request is in the
     * approved state, and whether the pull request approval rule has been set
     * aside by an override.
     * </p>
     */
    private Evaluation evaluation;

    /**
     * <p>
     * The result of the evaluation, including the names of the rules whose
     * conditions have been met (if any), the names of the rules whose
     * conditions have not been met (if any), whether the pull request is in the
     * approved state, and whether the pull request approval rule has been set
     * aside by an override.
     * </p>
     *
     * @return <p>
     *         The result of the evaluation, including the names of the rules
     *         whose conditions have been met (if any), the names of the rules
     *         whose conditions have not been met (if any), whether the pull
     *         request is in the approved state, and whether the pull request
     *         approval rule has been set aside by an override.
     *         </p>
     */
    public Evaluation getEvaluation() {
        return evaluation;
    }

    /**
     * <p>
     * The result of the evaluation, including the names of the rules whose
     * conditions have been met (if any), the names of the rules whose
     * conditions have not been met (if any), whether the pull request is in the
     * approved state, and whether the pull request approval rule has been set
     * aside by an override.
     * </p>
     *
     * @param evaluation <p>
     *            The result of the evaluation, including the names of the rules
     *            whose conditions have been met (if any), the names of the
     *            rules whose conditions have not been met (if any), whether the
     *            pull request is in the approved state, and whether the pull
     *            request approval rule has been set aside by an override.
     *            </p>
     */
    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    /**
     * <p>
     * The result of the evaluation, including the names of the rules whose
     * conditions have been met (if any), the names of the rules whose
     * conditions have not been met (if any), whether the pull request is in the
     * approved state, and whether the pull request approval rule has been set
     * aside by an override.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluation <p>
     *            The result of the evaluation, including the names of the rules
     *            whose conditions have been met (if any), the names of the
     *            rules whose conditions have not been met (if any), whether the
     *            pull request is in the approved state, and whether the pull
     *            request approval rule has been set aside by an override.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluatePullRequestApprovalRulesResult withEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
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
        if (getEvaluation() != null)
            sb.append("evaluation: " + getEvaluation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluation() == null) ? 0 : getEvaluation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluatePullRequestApprovalRulesResult == false)
            return false;
        EvaluatePullRequestApprovalRulesResult other = (EvaluatePullRequestApprovalRulesResult) obj;

        if (other.getEvaluation() == null ^ this.getEvaluation() == null)
            return false;
        if (other.getEvaluation() != null
                && other.getEvaluation().equals(this.getEvaluation()) == false)
            return false;
        return true;
    }
}
