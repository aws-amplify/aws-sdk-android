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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the result of the simulation of a single API operation call on a
 * single resource.
 * </p>
 * <p>
 * This data type is used by a member of the <a>EvaluationResult</a> data type.
 * </p>
 */
public class ResourceSpecificResult implements Serializable {
    /**
     * <p>
     * The name of the simulated resource, in Amazon Resource Name (ARN) format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String evalResourceName;

    /**
     * <p>
     * The result of the simulation of the simulated API operation on the
     * resource specified in <code>EvalResourceName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     */
    private String evalResourceDecision;

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this part of the simulation. Remember that even if multiple
     * statements allow the operation on the resource, if <i>any</i> statement
     * denies that operation, then the explicit deny overrides any allow. In
     * addition, the deny statement is the only entry included in the result.
     * </p>
     */
    private java.util.List<Statement> matchedStatements;

    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. This list is
     * used when a list of ARNs is included in the <code>ResourceArns</code>
     * parameter instead of "*". If you do not specify individual resources, by
     * setting <code>ResourceArns</code> to "*" or by not including the
     * <code>ResourceArns</code> parameter, then any missing context values are
     * instead included under the <code>EvaluationResults</code> section. To
     * discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     */
    private java.util.List<String> missingContextValues;

    /**
     * <p>
     * Additional details about the results of the evaluation decision on a
     * single resource. This parameter is returned only for cross-account
     * simulations. This parameter explains how each policy type contributes to
     * the resource-specific evaluation decision.
     * </p>
     */
    private java.util.Map<String, String> evalDecisionDetails;

    /**
     * <p>
     * Contains information about the effect that a permissions boundary has on
     * a policy simulation when that boundary is applied to an IAM entity.
     * </p>
     */
    private PermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail;

    /**
     * <p>
     * The name of the simulated resource, in Amazon Resource Name (ARN) format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The name of the simulated resource, in Amazon Resource Name (ARN)
     *         format.
     *         </p>
     */
    public String getEvalResourceName() {
        return evalResourceName;
    }

    /**
     * <p>
     * The name of the simulated resource, in Amazon Resource Name (ARN) format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param evalResourceName <p>
     *            The name of the simulated resource, in Amazon Resource Name
     *            (ARN) format.
     *            </p>
     */
    public void setEvalResourceName(String evalResourceName) {
        this.evalResourceName = evalResourceName;
    }

    /**
     * <p>
     * The name of the simulated resource, in Amazon Resource Name (ARN) format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param evalResourceName <p>
     *            The name of the simulated resource, in Amazon Resource Name
     *            (ARN) format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSpecificResult withEvalResourceName(String evalResourceName) {
        this.evalResourceName = evalResourceName;
        return this;
    }

    /**
     * <p>
     * The result of the simulation of the simulated API operation on the
     * resource specified in <code>EvalResourceName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @return <p>
     *         The result of the simulation of the simulated API operation on
     *         the resource specified in <code>EvalResourceName</code>.
     *         </p>
     * @see PolicyEvaluationDecisionType
     */
    public String getEvalResourceDecision() {
        return evalResourceDecision;
    }

    /**
     * <p>
     * The result of the simulation of the simulated API operation on the
     * resource specified in <code>EvalResourceName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalResourceDecision <p>
     *            The result of the simulation of the simulated API operation on
     *            the resource specified in <code>EvalResourceName</code>.
     *            </p>
     * @see PolicyEvaluationDecisionType
     */
    public void setEvalResourceDecision(String evalResourceDecision) {
        this.evalResourceDecision = evalResourceDecision;
    }

    /**
     * <p>
     * The result of the simulation of the simulated API operation on the
     * resource specified in <code>EvalResourceName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalResourceDecision <p>
     *            The result of the simulation of the simulated API operation on
     *            the resource specified in <code>EvalResourceName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyEvaluationDecisionType
     */
    public ResourceSpecificResult withEvalResourceDecision(String evalResourceDecision) {
        this.evalResourceDecision = evalResourceDecision;
        return this;
    }

    /**
     * <p>
     * The result of the simulation of the simulated API operation on the
     * resource specified in <code>EvalResourceName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalResourceDecision <p>
     *            The result of the simulation of the simulated API operation on
     *            the resource specified in <code>EvalResourceName</code>.
     *            </p>
     * @see PolicyEvaluationDecisionType
     */
    public void setEvalResourceDecision(PolicyEvaluationDecisionType evalResourceDecision) {
        this.evalResourceDecision = evalResourceDecision.toString();
    }

    /**
     * <p>
     * The result of the simulation of the simulated API operation on the
     * resource specified in <code>EvalResourceName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalResourceDecision <p>
     *            The result of the simulation of the simulated API operation on
     *            the resource specified in <code>EvalResourceName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyEvaluationDecisionType
     */
    public ResourceSpecificResult withEvalResourceDecision(
            PolicyEvaluationDecisionType evalResourceDecision) {
        this.evalResourceDecision = evalResourceDecision.toString();
        return this;
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this part of the simulation. Remember that even if multiple
     * statements allow the operation on the resource, if <i>any</i> statement
     * denies that operation, then the explicit deny overrides any allow. In
     * addition, the deny statement is the only entry included in the result.
     * </p>
     *
     * @return <p>
     *         A list of the statements in the input policies that determine the
     *         result for this part of the simulation. Remember that even if
     *         multiple statements allow the operation on the resource, if
     *         <i>any</i> statement denies that operation, then the explicit
     *         deny overrides any allow. In addition, the deny statement is the
     *         only entry included in the result.
     *         </p>
     */
    public java.util.List<Statement> getMatchedStatements() {
        return matchedStatements;
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this part of the simulation. Remember that even if multiple
     * statements allow the operation on the resource, if <i>any</i> statement
     * denies that operation, then the explicit deny overrides any allow. In
     * addition, the deny statement is the only entry included in the result.
     * </p>
     *
     * @param matchedStatements <p>
     *            A list of the statements in the input policies that determine
     *            the result for this part of the simulation. Remember that even
     *            if multiple statements allow the operation on the resource, if
     *            <i>any</i> statement denies that operation, then the explicit
     *            deny overrides any allow. In addition, the deny statement is
     *            the only entry included in the result.
     *            </p>
     */
    public void setMatchedStatements(java.util.Collection<Statement> matchedStatements) {
        if (matchedStatements == null) {
            this.matchedStatements = null;
            return;
        }

        this.matchedStatements = new java.util.ArrayList<Statement>(matchedStatements);
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this part of the simulation. Remember that even if multiple
     * statements allow the operation on the resource, if <i>any</i> statement
     * denies that operation, then the explicit deny overrides any allow. In
     * addition, the deny statement is the only entry included in the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchedStatements <p>
     *            A list of the statements in the input policies that determine
     *            the result for this part of the simulation. Remember that even
     *            if multiple statements allow the operation on the resource, if
     *            <i>any</i> statement denies that operation, then the explicit
     *            deny overrides any allow. In addition, the deny statement is
     *            the only entry included in the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSpecificResult withMatchedStatements(Statement... matchedStatements) {
        if (getMatchedStatements() == null) {
            this.matchedStatements = new java.util.ArrayList<Statement>(matchedStatements.length);
        }
        for (Statement value : matchedStatements) {
            this.matchedStatements.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this part of the simulation. Remember that even if multiple
     * statements allow the operation on the resource, if <i>any</i> statement
     * denies that operation, then the explicit deny overrides any allow. In
     * addition, the deny statement is the only entry included in the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchedStatements <p>
     *            A list of the statements in the input policies that determine
     *            the result for this part of the simulation. Remember that even
     *            if multiple statements allow the operation on the resource, if
     *            <i>any</i> statement denies that operation, then the explicit
     *            deny overrides any allow. In addition, the deny statement is
     *            the only entry included in the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSpecificResult withMatchedStatements(
            java.util.Collection<Statement> matchedStatements) {
        setMatchedStatements(matchedStatements);
        return this;
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. This list is
     * used when a list of ARNs is included in the <code>ResourceArns</code>
     * parameter instead of "*". If you do not specify individual resources, by
     * setting <code>ResourceArns</code> to "*" or by not including the
     * <code>ResourceArns</code> parameter, then any missing context values are
     * instead included under the <code>EvaluationResults</code> section. To
     * discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     *
     * @return <p>
     *         A list of context keys that are required by the included input
     *         policies but that were not provided by one of the input
     *         parameters. This list is used when a list of ARNs is included in
     *         the <code>ResourceArns</code> parameter instead of "*". If you do
     *         not specify individual resources, by setting
     *         <code>ResourceArns</code> to "*" or by not including the
     *         <code>ResourceArns</code> parameter, then any missing context
     *         values are instead included under the
     *         <code>EvaluationResults</code> section. To discover the context
     *         keys used by a set of policies, you can call
     *         <a>GetContextKeysForCustomPolicy</a> or
     *         <a>GetContextKeysForPrincipalPolicy</a>.
     *         </p>
     */
    public java.util.List<String> getMissingContextValues() {
        return missingContextValues;
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. This list is
     * used when a list of ARNs is included in the <code>ResourceArns</code>
     * parameter instead of "*". If you do not specify individual resources, by
     * setting <code>ResourceArns</code> to "*" or by not including the
     * <code>ResourceArns</code> parameter, then any missing context values are
     * instead included under the <code>EvaluationResults</code> section. To
     * discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     *
     * @param missingContextValues <p>
     *            A list of context keys that are required by the included input
     *            policies but that were not provided by one of the input
     *            parameters. This list is used when a list of ARNs is included
     *            in the <code>ResourceArns</code> parameter instead of "*". If
     *            you do not specify individual resources, by setting
     *            <code>ResourceArns</code> to "*" or by not including the
     *            <code>ResourceArns</code> parameter, then any missing context
     *            values are instead included under the
     *            <code>EvaluationResults</code> section. To discover the
     *            context keys used by a set of policies, you can call
     *            <a>GetContextKeysForCustomPolicy</a> or
     *            <a>GetContextKeysForPrincipalPolicy</a>.
     *            </p>
     */
    public void setMissingContextValues(java.util.Collection<String> missingContextValues) {
        if (missingContextValues == null) {
            this.missingContextValues = null;
            return;
        }

        this.missingContextValues = new java.util.ArrayList<String>(missingContextValues);
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. This list is
     * used when a list of ARNs is included in the <code>ResourceArns</code>
     * parameter instead of "*". If you do not specify individual resources, by
     * setting <code>ResourceArns</code> to "*" or by not including the
     * <code>ResourceArns</code> parameter, then any missing context values are
     * instead included under the <code>EvaluationResults</code> section. To
     * discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param missingContextValues <p>
     *            A list of context keys that are required by the included input
     *            policies but that were not provided by one of the input
     *            parameters. This list is used when a list of ARNs is included
     *            in the <code>ResourceArns</code> parameter instead of "*". If
     *            you do not specify individual resources, by setting
     *            <code>ResourceArns</code> to "*" or by not including the
     *            <code>ResourceArns</code> parameter, then any missing context
     *            values are instead included under the
     *            <code>EvaluationResults</code> section. To discover the
     *            context keys used by a set of policies, you can call
     *            <a>GetContextKeysForCustomPolicy</a> or
     *            <a>GetContextKeysForPrincipalPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSpecificResult withMissingContextValues(String... missingContextValues) {
        if (getMissingContextValues() == null) {
            this.missingContextValues = new java.util.ArrayList<String>(missingContextValues.length);
        }
        for (String value : missingContextValues) {
            this.missingContextValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. This list is
     * used when a list of ARNs is included in the <code>ResourceArns</code>
     * parameter instead of "*". If you do not specify individual resources, by
     * setting <code>ResourceArns</code> to "*" or by not including the
     * <code>ResourceArns</code> parameter, then any missing context values are
     * instead included under the <code>EvaluationResults</code> section. To
     * discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param missingContextValues <p>
     *            A list of context keys that are required by the included input
     *            policies but that were not provided by one of the input
     *            parameters. This list is used when a list of ARNs is included
     *            in the <code>ResourceArns</code> parameter instead of "*". If
     *            you do not specify individual resources, by setting
     *            <code>ResourceArns</code> to "*" or by not including the
     *            <code>ResourceArns</code> parameter, then any missing context
     *            values are instead included under the
     *            <code>EvaluationResults</code> section. To discover the
     *            context keys used by a set of policies, you can call
     *            <a>GetContextKeysForCustomPolicy</a> or
     *            <a>GetContextKeysForPrincipalPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSpecificResult withMissingContextValues(
            java.util.Collection<String> missingContextValues) {
        setMissingContextValues(missingContextValues);
        return this;
    }

    /**
     * <p>
     * Additional details about the results of the evaluation decision on a
     * single resource. This parameter is returned only for cross-account
     * simulations. This parameter explains how each policy type contributes to
     * the resource-specific evaluation decision.
     * </p>
     *
     * @return <p>
     *         Additional details about the results of the evaluation decision
     *         on a single resource. This parameter is returned only for
     *         cross-account simulations. This parameter explains how each
     *         policy type contributes to the resource-specific evaluation
     *         decision.
     *         </p>
     */
    public java.util.Map<String, String> getEvalDecisionDetails() {
        return evalDecisionDetails;
    }

    /**
     * <p>
     * Additional details about the results of the evaluation decision on a
     * single resource. This parameter is returned only for cross-account
     * simulations. This parameter explains how each policy type contributes to
     * the resource-specific evaluation decision.
     * </p>
     *
     * @param evalDecisionDetails <p>
     *            Additional details about the results of the evaluation
     *            decision on a single resource. This parameter is returned only
     *            for cross-account simulations. This parameter explains how
     *            each policy type contributes to the resource-specific
     *            evaluation decision.
     *            </p>
     */
    public void setEvalDecisionDetails(java.util.Map<String, String> evalDecisionDetails) {
        this.evalDecisionDetails = evalDecisionDetails;
    }

    /**
     * <p>
     * Additional details about the results of the evaluation decision on a
     * single resource. This parameter is returned only for cross-account
     * simulations. This parameter explains how each policy type contributes to
     * the resource-specific evaluation decision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evalDecisionDetails <p>
     *            Additional details about the results of the evaluation
     *            decision on a single resource. This parameter is returned only
     *            for cross-account simulations. This parameter explains how
     *            each policy type contributes to the resource-specific
     *            evaluation decision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSpecificResult withEvalDecisionDetails(
            java.util.Map<String, String> evalDecisionDetails) {
        this.evalDecisionDetails = evalDecisionDetails;
        return this;
    }

    /**
     * <p>
     * Additional details about the results of the evaluation decision on a
     * single resource. This parameter is returned only for cross-account
     * simulations. This parameter explains how each policy type contributes to
     * the resource-specific evaluation decision.
     * </p>
     * <p>
     * The method adds a new key-value pair into EvalDecisionDetails parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into EvalDecisionDetails.
     * @param value The corresponding value of the entry to be added into
     *            EvalDecisionDetails.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSpecificResult addEvalDecisionDetailsEntry(String key, String value) {
        if (null == this.evalDecisionDetails) {
            this.evalDecisionDetails = new java.util.HashMap<String, String>();
        }
        if (this.evalDecisionDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.evalDecisionDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EvalDecisionDetails.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ResourceSpecificResult clearEvalDecisionDetailsEntries() {
        this.evalDecisionDetails = null;
        return this;
    }

    /**
     * <p>
     * Contains information about the effect that a permissions boundary has on
     * a policy simulation when that boundary is applied to an IAM entity.
     * </p>
     *
     * @return <p>
     *         Contains information about the effect that a permissions boundary
     *         has on a policy simulation when that boundary is applied to an
     *         IAM entity.
     *         </p>
     */
    public PermissionsBoundaryDecisionDetail getPermissionsBoundaryDecisionDetail() {
        return permissionsBoundaryDecisionDetail;
    }

    /**
     * <p>
     * Contains information about the effect that a permissions boundary has on
     * a policy simulation when that boundary is applied to an IAM entity.
     * </p>
     *
     * @param permissionsBoundaryDecisionDetail <p>
     *            Contains information about the effect that a permissions
     *            boundary has on a policy simulation when that boundary is
     *            applied to an IAM entity.
     *            </p>
     */
    public void setPermissionsBoundaryDecisionDetail(
            PermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail) {
        this.permissionsBoundaryDecisionDetail = permissionsBoundaryDecisionDetail;
    }

    /**
     * <p>
     * Contains information about the effect that a permissions boundary has on
     * a policy simulation when that boundary is applied to an IAM entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionsBoundaryDecisionDetail <p>
     *            Contains information about the effect that a permissions
     *            boundary has on a policy simulation when that boundary is
     *            applied to an IAM entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSpecificResult withPermissionsBoundaryDecisionDetail(
            PermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail) {
        this.permissionsBoundaryDecisionDetail = permissionsBoundaryDecisionDetail;
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
        if (getEvalResourceName() != null)
            sb.append("EvalResourceName: " + getEvalResourceName() + ",");
        if (getEvalResourceDecision() != null)
            sb.append("EvalResourceDecision: " + getEvalResourceDecision() + ",");
        if (getMatchedStatements() != null)
            sb.append("MatchedStatements: " + getMatchedStatements() + ",");
        if (getMissingContextValues() != null)
            sb.append("MissingContextValues: " + getMissingContextValues() + ",");
        if (getEvalDecisionDetails() != null)
            sb.append("EvalDecisionDetails: " + getEvalDecisionDetails() + ",");
        if (getPermissionsBoundaryDecisionDetail() != null)
            sb.append("PermissionsBoundaryDecisionDetail: "
                    + getPermissionsBoundaryDecisionDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEvalResourceName() == null) ? 0 : getEvalResourceName().hashCode());
        hashCode = prime * hashCode
                + ((getEvalResourceDecision() == null) ? 0 : getEvalResourceDecision().hashCode());
        hashCode = prime * hashCode
                + ((getMatchedStatements() == null) ? 0 : getMatchedStatements().hashCode());
        hashCode = prime * hashCode
                + ((getMissingContextValues() == null) ? 0 : getMissingContextValues().hashCode());
        hashCode = prime * hashCode
                + ((getEvalDecisionDetails() == null) ? 0 : getEvalDecisionDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getPermissionsBoundaryDecisionDetail() == null) ? 0
                        : getPermissionsBoundaryDecisionDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceSpecificResult == false)
            return false;
        ResourceSpecificResult other = (ResourceSpecificResult) obj;

        if (other.getEvalResourceName() == null ^ this.getEvalResourceName() == null)
            return false;
        if (other.getEvalResourceName() != null
                && other.getEvalResourceName().equals(this.getEvalResourceName()) == false)
            return false;
        if (other.getEvalResourceDecision() == null ^ this.getEvalResourceDecision() == null)
            return false;
        if (other.getEvalResourceDecision() != null
                && other.getEvalResourceDecision().equals(this.getEvalResourceDecision()) == false)
            return false;
        if (other.getMatchedStatements() == null ^ this.getMatchedStatements() == null)
            return false;
        if (other.getMatchedStatements() != null
                && other.getMatchedStatements().equals(this.getMatchedStatements()) == false)
            return false;
        if (other.getMissingContextValues() == null ^ this.getMissingContextValues() == null)
            return false;
        if (other.getMissingContextValues() != null
                && other.getMissingContextValues().equals(this.getMissingContextValues()) == false)
            return false;
        if (other.getEvalDecisionDetails() == null ^ this.getEvalDecisionDetails() == null)
            return false;
        if (other.getEvalDecisionDetails() != null
                && other.getEvalDecisionDetails().equals(this.getEvalDecisionDetails()) == false)
            return false;
        if (other.getPermissionsBoundaryDecisionDetail() == null
                ^ this.getPermissionsBoundaryDecisionDetail() == null)
            return false;
        if (other.getPermissionsBoundaryDecisionDetail() != null
                && other.getPermissionsBoundaryDecisionDetail().equals(
                        this.getPermissionsBoundaryDecisionDetail()) == false)
            return false;
        return true;
    }
}
