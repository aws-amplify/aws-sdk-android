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
 * Contains the results of a simulation.
 * </p>
 * <p>
 * This data type is used by the return parameter of
 * <code> <a>SimulateCustomPolicy</a> </code> and
 * <code> <a>SimulatePrincipalPolicy</a> </code>.
 * </p>
 */
public class EvaluationResult implements Serializable {
    /**
     * <p>
     * The name of the API operation tested on the indicated resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     */
    private String evalActionName;

    /**
     * <p>
     * The ARN of the resource that the indicated API operation was tested on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String evalResourceName;

    /**
     * <p>
     * The result of the simulation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     */
    private String evalDecision;

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this scenario. Remember that even if multiple statements allow the
     * operation on the resource, if only one statement denies that operation,
     * then the explicit deny overrides any allow. In addition, the deny
     * statement is the only entry included in the result.
     * </p>
     */
    private java.util.List<Statement> matchedStatements;

    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. This list is
     * used when the resource in a simulation is "*", either explicitly, or when
     * the <code>ResourceArns</code> parameter blank. If you include a list of
     * resources, then any missing context values are instead included under the
     * <code>ResourceSpecificResults</code> section. To discover the context
     * keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     */
    private java.util.List<String> missingContextValues;

    /**
     * <p>
     * A structure that details how Organizations and its service control
     * policies affect the results of the simulation. Only applies if the
     * simulated user's account is part of an organization.
     * </p>
     */
    private OrganizationsDecisionDetail organizationsDecisionDetail;

    /**
     * <p>
     * Contains information about the effect that a permissions boundary has on
     * a policy simulation when the boundary is applied to an IAM entity.
     * </p>
     */
    private PermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail;

    /**
     * <p>
     * Additional details about the results of the cross-account evaluation
     * decision. This parameter is populated for only cross-account simulations.
     * It contains a brief summary of how each policy type contributes to the
     * final evaluation decision.
     * </p>
     * <p>
     * If the simulation evaluates policies within the same account and includes
     * a resource ARN, then the parameter is present but the response is empty.
     * If the simulation evaluates policies within the same account and
     * specifies all resources (<code>*</code>), then the parameter is not
     * returned.
     * </p>
     * <p>
     * When you make a cross-account request, AWS evaluates the request in the
     * trusting account and the trusted account. The request is allowed only if
     * both evaluations return <code>true</code>. For more information about how
     * policies are evaluated, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies Within a Single Account</a>.
     * </p>
     * <p>
     * If an AWS Organizations SCP included in the evaluation denies access, the
     * simulation ends. In this case, policy evaluation does not proceed any
     * further and this parameter is not returned.
     * </p>
     */
    private java.util.Map<String, String> evalDecisionDetails;

    /**
     * <p>
     * The individual results of the simulation of the API operation specified
     * in EvalActionName on each resource.
     * </p>
     */
    private java.util.List<ResourceSpecificResult> resourceSpecificResults;

    /**
     * <p>
     * The name of the API operation tested on the indicated resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     *
     * @return <p>
     *         The name of the API operation tested on the indicated resource.
     *         </p>
     */
    public String getEvalActionName() {
        return evalActionName;
    }

    /**
     * <p>
     * The name of the API operation tested on the indicated resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     *
     * @param evalActionName <p>
     *            The name of the API operation tested on the indicated
     *            resource.
     *            </p>
     */
    public void setEvalActionName(String evalActionName) {
        this.evalActionName = evalActionName;
    }

    /**
     * <p>
     * The name of the API operation tested on the indicated resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     *
     * @param evalActionName <p>
     *            The name of the API operation tested on the indicated
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withEvalActionName(String evalActionName) {
        this.evalActionName = evalActionName;
        return this;
    }

    /**
     * <p>
     * The ARN of the resource that the indicated API operation was tested on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the resource that the indicated API operation was
     *         tested on.
     *         </p>
     */
    public String getEvalResourceName() {
        return evalResourceName;
    }

    /**
     * <p>
     * The ARN of the resource that the indicated API operation was tested on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param evalResourceName <p>
     *            The ARN of the resource that the indicated API operation was
     *            tested on.
     *            </p>
     */
    public void setEvalResourceName(String evalResourceName) {
        this.evalResourceName = evalResourceName;
    }

    /**
     * <p>
     * The ARN of the resource that the indicated API operation was tested on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param evalResourceName <p>
     *            The ARN of the resource that the indicated API operation was
     *            tested on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withEvalResourceName(String evalResourceName) {
        this.evalResourceName = evalResourceName;
        return this;
    }

    /**
     * <p>
     * The result of the simulation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @return <p>
     *         The result of the simulation.
     *         </p>
     * @see PolicyEvaluationDecisionType
     */
    public String getEvalDecision() {
        return evalDecision;
    }

    /**
     * <p>
     * The result of the simulation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalDecision <p>
     *            The result of the simulation.
     *            </p>
     * @see PolicyEvaluationDecisionType
     */
    public void setEvalDecision(String evalDecision) {
        this.evalDecision = evalDecision;
    }

    /**
     * <p>
     * The result of the simulation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalDecision <p>
     *            The result of the simulation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyEvaluationDecisionType
     */
    public EvaluationResult withEvalDecision(String evalDecision) {
        this.evalDecision = evalDecision;
        return this;
    }

    /**
     * <p>
     * The result of the simulation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalDecision <p>
     *            The result of the simulation.
     *            </p>
     * @see PolicyEvaluationDecisionType
     */
    public void setEvalDecision(PolicyEvaluationDecisionType evalDecision) {
        this.evalDecision = evalDecision.toString();
    }

    /**
     * <p>
     * The result of the simulation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalDecision <p>
     *            The result of the simulation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyEvaluationDecisionType
     */
    public EvaluationResult withEvalDecision(PolicyEvaluationDecisionType evalDecision) {
        this.evalDecision = evalDecision.toString();
        return this;
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this scenario. Remember that even if multiple statements allow the
     * operation on the resource, if only one statement denies that operation,
     * then the explicit deny overrides any allow. In addition, the deny
     * statement is the only entry included in the result.
     * </p>
     *
     * @return <p>
     *         A list of the statements in the input policies that determine the
     *         result for this scenario. Remember that even if multiple
     *         statements allow the operation on the resource, if only one
     *         statement denies that operation, then the explicit deny overrides
     *         any allow. In addition, the deny statement is the only entry
     *         included in the result.
     *         </p>
     */
    public java.util.List<Statement> getMatchedStatements() {
        return matchedStatements;
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this scenario. Remember that even if multiple statements allow the
     * operation on the resource, if only one statement denies that operation,
     * then the explicit deny overrides any allow. In addition, the deny
     * statement is the only entry included in the result.
     * </p>
     *
     * @param matchedStatements <p>
     *            A list of the statements in the input policies that determine
     *            the result for this scenario. Remember that even if multiple
     *            statements allow the operation on the resource, if only one
     *            statement denies that operation, then the explicit deny
     *            overrides any allow. In addition, the deny statement is the
     *            only entry included in the result.
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
     * for this scenario. Remember that even if multiple statements allow the
     * operation on the resource, if only one statement denies that operation,
     * then the explicit deny overrides any allow. In addition, the deny
     * statement is the only entry included in the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchedStatements <p>
     *            A list of the statements in the input policies that determine
     *            the result for this scenario. Remember that even if multiple
     *            statements allow the operation on the resource, if only one
     *            statement denies that operation, then the explicit deny
     *            overrides any allow. In addition, the deny statement is the
     *            only entry included in the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withMatchedStatements(Statement... matchedStatements) {
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
     * for this scenario. Remember that even if multiple statements allow the
     * operation on the resource, if only one statement denies that operation,
     * then the explicit deny overrides any allow. In addition, the deny
     * statement is the only entry included in the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchedStatements <p>
     *            A list of the statements in the input policies that determine
     *            the result for this scenario. Remember that even if multiple
     *            statements allow the operation on the resource, if only one
     *            statement denies that operation, then the explicit deny
     *            overrides any allow. In addition, the deny statement is the
     *            only entry included in the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withMatchedStatements(java.util.Collection<Statement> matchedStatements) {
        setMatchedStatements(matchedStatements);
        return this;
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. This list is
     * used when the resource in a simulation is "*", either explicitly, or when
     * the <code>ResourceArns</code> parameter blank. If you include a list of
     * resources, then any missing context values are instead included under the
     * <code>ResourceSpecificResults</code> section. To discover the context
     * keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     *
     * @return <p>
     *         A list of context keys that are required by the included input
     *         policies but that were not provided by one of the input
     *         parameters. This list is used when the resource in a simulation
     *         is "*", either explicitly, or when the <code>ResourceArns</code>
     *         parameter blank. If you include a list of resources, then any
     *         missing context values are instead included under the
     *         <code>ResourceSpecificResults</code> section. To discover the
     *         context keys used by a set of policies, you can call
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
     * used when the resource in a simulation is "*", either explicitly, or when
     * the <code>ResourceArns</code> parameter blank. If you include a list of
     * resources, then any missing context values are instead included under the
     * <code>ResourceSpecificResults</code> section. To discover the context
     * keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     *
     * @param missingContextValues <p>
     *            A list of context keys that are required by the included input
     *            policies but that were not provided by one of the input
     *            parameters. This list is used when the resource in a
     *            simulation is "*", either explicitly, or when the
     *            <code>ResourceArns</code> parameter blank. If you include a
     *            list of resources, then any missing context values are instead
     *            included under the <code>ResourceSpecificResults</code>
     *            section. To discover the context keys used by a set of
     *            policies, you can call <a>GetContextKeysForCustomPolicy</a> or
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
     * used when the resource in a simulation is "*", either explicitly, or when
     * the <code>ResourceArns</code> parameter blank. If you include a list of
     * resources, then any missing context values are instead included under the
     * <code>ResourceSpecificResults</code> section. To discover the context
     * keys used by a set of policies, you can call
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
     *            parameters. This list is used when the resource in a
     *            simulation is "*", either explicitly, or when the
     *            <code>ResourceArns</code> parameter blank. If you include a
     *            list of resources, then any missing context values are instead
     *            included under the <code>ResourceSpecificResults</code>
     *            section. To discover the context keys used by a set of
     *            policies, you can call <a>GetContextKeysForCustomPolicy</a> or
     *            <a>GetContextKeysForPrincipalPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withMissingContextValues(String... missingContextValues) {
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
     * used when the resource in a simulation is "*", either explicitly, or when
     * the <code>ResourceArns</code> parameter blank. If you include a list of
     * resources, then any missing context values are instead included under the
     * <code>ResourceSpecificResults</code> section. To discover the context
     * keys used by a set of policies, you can call
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
     *            parameters. This list is used when the resource in a
     *            simulation is "*", either explicitly, or when the
     *            <code>ResourceArns</code> parameter blank. If you include a
     *            list of resources, then any missing context values are instead
     *            included under the <code>ResourceSpecificResults</code>
     *            section. To discover the context keys used by a set of
     *            policies, you can call <a>GetContextKeysForCustomPolicy</a> or
     *            <a>GetContextKeysForPrincipalPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withMissingContextValues(
            java.util.Collection<String> missingContextValues) {
        setMissingContextValues(missingContextValues);
        return this;
    }

    /**
     * <p>
     * A structure that details how Organizations and its service control
     * policies affect the results of the simulation. Only applies if the
     * simulated user's account is part of an organization.
     * </p>
     *
     * @return <p>
     *         A structure that details how Organizations and its service
     *         control policies affect the results of the simulation. Only
     *         applies if the simulated user's account is part of an
     *         organization.
     *         </p>
     */
    public OrganizationsDecisionDetail getOrganizationsDecisionDetail() {
        return organizationsDecisionDetail;
    }

    /**
     * <p>
     * A structure that details how Organizations and its service control
     * policies affect the results of the simulation. Only applies if the
     * simulated user's account is part of an organization.
     * </p>
     *
     * @param organizationsDecisionDetail <p>
     *            A structure that details how Organizations and its service
     *            control policies affect the results of the simulation. Only
     *            applies if the simulated user's account is part of an
     *            organization.
     *            </p>
     */
    public void setOrganizationsDecisionDetail(
            OrganizationsDecisionDetail organizationsDecisionDetail) {
        this.organizationsDecisionDetail = organizationsDecisionDetail;
    }

    /**
     * <p>
     * A structure that details how Organizations and its service control
     * policies affect the results of the simulation. Only applies if the
     * simulated user's account is part of an organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationsDecisionDetail <p>
     *            A structure that details how Organizations and its service
     *            control policies affect the results of the simulation. Only
     *            applies if the simulated user's account is part of an
     *            organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withOrganizationsDecisionDetail(
            OrganizationsDecisionDetail organizationsDecisionDetail) {
        this.organizationsDecisionDetail = organizationsDecisionDetail;
        return this;
    }

    /**
     * <p>
     * Contains information about the effect that a permissions boundary has on
     * a policy simulation when the boundary is applied to an IAM entity.
     * </p>
     *
     * @return <p>
     *         Contains information about the effect that a permissions boundary
     *         has on a policy simulation when the boundary is applied to an IAM
     *         entity.
     *         </p>
     */
    public PermissionsBoundaryDecisionDetail getPermissionsBoundaryDecisionDetail() {
        return permissionsBoundaryDecisionDetail;
    }

    /**
     * <p>
     * Contains information about the effect that a permissions boundary has on
     * a policy simulation when the boundary is applied to an IAM entity.
     * </p>
     *
     * @param permissionsBoundaryDecisionDetail <p>
     *            Contains information about the effect that a permissions
     *            boundary has on a policy simulation when the boundary is
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
     * a policy simulation when the boundary is applied to an IAM entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionsBoundaryDecisionDetail <p>
     *            Contains information about the effect that a permissions
     *            boundary has on a policy simulation when the boundary is
     *            applied to an IAM entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withPermissionsBoundaryDecisionDetail(
            PermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail) {
        this.permissionsBoundaryDecisionDetail = permissionsBoundaryDecisionDetail;
        return this;
    }

    /**
     * <p>
     * Additional details about the results of the cross-account evaluation
     * decision. This parameter is populated for only cross-account simulations.
     * It contains a brief summary of how each policy type contributes to the
     * final evaluation decision.
     * </p>
     * <p>
     * If the simulation evaluates policies within the same account and includes
     * a resource ARN, then the parameter is present but the response is empty.
     * If the simulation evaluates policies within the same account and
     * specifies all resources (<code>*</code>), then the parameter is not
     * returned.
     * </p>
     * <p>
     * When you make a cross-account request, AWS evaluates the request in the
     * trusting account and the trusted account. The request is allowed only if
     * both evaluations return <code>true</code>. For more information about how
     * policies are evaluated, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies Within a Single Account</a>.
     * </p>
     * <p>
     * If an AWS Organizations SCP included in the evaluation denies access, the
     * simulation ends. In this case, policy evaluation does not proceed any
     * further and this parameter is not returned.
     * </p>
     *
     * @return <p>
     *         Additional details about the results of the cross-account
     *         evaluation decision. This parameter is populated for only
     *         cross-account simulations. It contains a brief summary of how
     *         each policy type contributes to the final evaluation decision.
     *         </p>
     *         <p>
     *         If the simulation evaluates policies within the same account and
     *         includes a resource ARN, then the parameter is present but the
     *         response is empty. If the simulation evaluates policies within
     *         the same account and specifies all resources (<code>*</code>),
     *         then the parameter is not returned.
     *         </p>
     *         <p>
     *         When you make a cross-account request, AWS evaluates the request
     *         in the trusting account and the trusted account. The request is
     *         allowed only if both evaluations return <code>true</code>. For
     *         more information about how policies are evaluated, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     *         >Evaluating Policies Within a Single Account</a>.
     *         </p>
     *         <p>
     *         If an AWS Organizations SCP included in the evaluation denies
     *         access, the simulation ends. In this case, policy evaluation does
     *         not proceed any further and this parameter is not returned.
     *         </p>
     */
    public java.util.Map<String, String> getEvalDecisionDetails() {
        return evalDecisionDetails;
    }

    /**
     * <p>
     * Additional details about the results of the cross-account evaluation
     * decision. This parameter is populated for only cross-account simulations.
     * It contains a brief summary of how each policy type contributes to the
     * final evaluation decision.
     * </p>
     * <p>
     * If the simulation evaluates policies within the same account and includes
     * a resource ARN, then the parameter is present but the response is empty.
     * If the simulation evaluates policies within the same account and
     * specifies all resources (<code>*</code>), then the parameter is not
     * returned.
     * </p>
     * <p>
     * When you make a cross-account request, AWS evaluates the request in the
     * trusting account and the trusted account. The request is allowed only if
     * both evaluations return <code>true</code>. For more information about how
     * policies are evaluated, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies Within a Single Account</a>.
     * </p>
     * <p>
     * If an AWS Organizations SCP included in the evaluation denies access, the
     * simulation ends. In this case, policy evaluation does not proceed any
     * further and this parameter is not returned.
     * </p>
     *
     * @param evalDecisionDetails <p>
     *            Additional details about the results of the cross-account
     *            evaluation decision. This parameter is populated for only
     *            cross-account simulations. It contains a brief summary of how
     *            each policy type contributes to the final evaluation decision.
     *            </p>
     *            <p>
     *            If the simulation evaluates policies within the same account
     *            and includes a resource ARN, then the parameter is present but
     *            the response is empty. If the simulation evaluates policies
     *            within the same account and specifies all resources (
     *            <code>*</code>), then the parameter is not returned.
     *            </p>
     *            <p>
     *            When you make a cross-account request, AWS evaluates the
     *            request in the trusting account and the trusted account. The
     *            request is allowed only if both evaluations return
     *            <code>true</code>. For more information about how policies are
     *            evaluated, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     *            >Evaluating Policies Within a Single Account</a>.
     *            </p>
     *            <p>
     *            If an AWS Organizations SCP included in the evaluation denies
     *            access, the simulation ends. In this case, policy evaluation
     *            does not proceed any further and this parameter is not
     *            returned.
     *            </p>
     */
    public void setEvalDecisionDetails(java.util.Map<String, String> evalDecisionDetails) {
        this.evalDecisionDetails = evalDecisionDetails;
    }

    /**
     * <p>
     * Additional details about the results of the cross-account evaluation
     * decision. This parameter is populated for only cross-account simulations.
     * It contains a brief summary of how each policy type contributes to the
     * final evaluation decision.
     * </p>
     * <p>
     * If the simulation evaluates policies within the same account and includes
     * a resource ARN, then the parameter is present but the response is empty.
     * If the simulation evaluates policies within the same account and
     * specifies all resources (<code>*</code>), then the parameter is not
     * returned.
     * </p>
     * <p>
     * When you make a cross-account request, AWS evaluates the request in the
     * trusting account and the trusted account. The request is allowed only if
     * both evaluations return <code>true</code>. For more information about how
     * policies are evaluated, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies Within a Single Account</a>.
     * </p>
     * <p>
     * If an AWS Organizations SCP included in the evaluation denies access, the
     * simulation ends. In this case, policy evaluation does not proceed any
     * further and this parameter is not returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evalDecisionDetails <p>
     *            Additional details about the results of the cross-account
     *            evaluation decision. This parameter is populated for only
     *            cross-account simulations. It contains a brief summary of how
     *            each policy type contributes to the final evaluation decision.
     *            </p>
     *            <p>
     *            If the simulation evaluates policies within the same account
     *            and includes a resource ARN, then the parameter is present but
     *            the response is empty. If the simulation evaluates policies
     *            within the same account and specifies all resources (
     *            <code>*</code>), then the parameter is not returned.
     *            </p>
     *            <p>
     *            When you make a cross-account request, AWS evaluates the
     *            request in the trusting account and the trusted account. The
     *            request is allowed only if both evaluations return
     *            <code>true</code>. For more information about how policies are
     *            evaluated, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     *            >Evaluating Policies Within a Single Account</a>.
     *            </p>
     *            <p>
     *            If an AWS Organizations SCP included in the evaluation denies
     *            access, the simulation ends. In this case, policy evaluation
     *            does not proceed any further and this parameter is not
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withEvalDecisionDetails(
            java.util.Map<String, String> evalDecisionDetails) {
        this.evalDecisionDetails = evalDecisionDetails;
        return this;
    }

    /**
     * <p>
     * Additional details about the results of the cross-account evaluation
     * decision. This parameter is populated for only cross-account simulations.
     * It contains a brief summary of how each policy type contributes to the
     * final evaluation decision.
     * </p>
     * <p>
     * If the simulation evaluates policies within the same account and includes
     * a resource ARN, then the parameter is present but the response is empty.
     * If the simulation evaluates policies within the same account and
     * specifies all resources (<code>*</code>), then the parameter is not
     * returned.
     * </p>
     * <p>
     * When you make a cross-account request, AWS evaluates the request in the
     * trusting account and the trusted account. The request is allowed only if
     * both evaluations return <code>true</code>. For more information about how
     * policies are evaluated, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies Within a Single Account</a>.
     * </p>
     * <p>
     * If an AWS Organizations SCP included in the evaluation denies access, the
     * simulation ends. In this case, policy evaluation does not proceed any
     * further and this parameter is not returned.
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
    public EvaluationResult addEvalDecisionDetailsEntry(String key, String value) {
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
    public EvaluationResult clearEvalDecisionDetailsEntries() {
        this.evalDecisionDetails = null;
        return this;
    }

    /**
     * <p>
     * The individual results of the simulation of the API operation specified
     * in EvalActionName on each resource.
     * </p>
     *
     * @return <p>
     *         The individual results of the simulation of the API operation
     *         specified in EvalActionName on each resource.
     *         </p>
     */
    public java.util.List<ResourceSpecificResult> getResourceSpecificResults() {
        return resourceSpecificResults;
    }

    /**
     * <p>
     * The individual results of the simulation of the API operation specified
     * in EvalActionName on each resource.
     * </p>
     *
     * @param resourceSpecificResults <p>
     *            The individual results of the simulation of the API operation
     *            specified in EvalActionName on each resource.
     *            </p>
     */
    public void setResourceSpecificResults(
            java.util.Collection<ResourceSpecificResult> resourceSpecificResults) {
        if (resourceSpecificResults == null) {
            this.resourceSpecificResults = null;
            return;
        }

        this.resourceSpecificResults = new java.util.ArrayList<ResourceSpecificResult>(
                resourceSpecificResults);
    }

    /**
     * <p>
     * The individual results of the simulation of the API operation specified
     * in EvalActionName on each resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceSpecificResults <p>
     *            The individual results of the simulation of the API operation
     *            specified in EvalActionName on each resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withResourceSpecificResults(
            ResourceSpecificResult... resourceSpecificResults) {
        if (getResourceSpecificResults() == null) {
            this.resourceSpecificResults = new java.util.ArrayList<ResourceSpecificResult>(
                    resourceSpecificResults.length);
        }
        for (ResourceSpecificResult value : resourceSpecificResults) {
            this.resourceSpecificResults.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The individual results of the simulation of the API operation specified
     * in EvalActionName on each resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceSpecificResults <p>
     *            The individual results of the simulation of the API operation
     *            specified in EvalActionName on each resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withResourceSpecificResults(
            java.util.Collection<ResourceSpecificResult> resourceSpecificResults) {
        setResourceSpecificResults(resourceSpecificResults);
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
        if (getEvalActionName() != null)
            sb.append("EvalActionName: " + getEvalActionName() + ",");
        if (getEvalResourceName() != null)
            sb.append("EvalResourceName: " + getEvalResourceName() + ",");
        if (getEvalDecision() != null)
            sb.append("EvalDecision: " + getEvalDecision() + ",");
        if (getMatchedStatements() != null)
            sb.append("MatchedStatements: " + getMatchedStatements() + ",");
        if (getMissingContextValues() != null)
            sb.append("MissingContextValues: " + getMissingContextValues() + ",");
        if (getOrganizationsDecisionDetail() != null)
            sb.append("OrganizationsDecisionDetail: " + getOrganizationsDecisionDetail() + ",");
        if (getPermissionsBoundaryDecisionDetail() != null)
            sb.append("PermissionsBoundaryDecisionDetail: "
                    + getPermissionsBoundaryDecisionDetail() + ",");
        if (getEvalDecisionDetails() != null)
            sb.append("EvalDecisionDetails: " + getEvalDecisionDetails() + ",");
        if (getResourceSpecificResults() != null)
            sb.append("ResourceSpecificResults: " + getResourceSpecificResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEvalActionName() == null) ? 0 : getEvalActionName().hashCode());
        hashCode = prime * hashCode
                + ((getEvalResourceName() == null) ? 0 : getEvalResourceName().hashCode());
        hashCode = prime * hashCode
                + ((getEvalDecision() == null) ? 0 : getEvalDecision().hashCode());
        hashCode = prime * hashCode
                + ((getMatchedStatements() == null) ? 0 : getMatchedStatements().hashCode());
        hashCode = prime * hashCode
                + ((getMissingContextValues() == null) ? 0 : getMissingContextValues().hashCode());
        hashCode = prime
                * hashCode
                + ((getOrganizationsDecisionDetail() == null) ? 0
                        : getOrganizationsDecisionDetail().hashCode());
        hashCode = prime
                * hashCode
                + ((getPermissionsBoundaryDecisionDetail() == null) ? 0
                        : getPermissionsBoundaryDecisionDetail().hashCode());
        hashCode = prime * hashCode
                + ((getEvalDecisionDetails() == null) ? 0 : getEvalDecisionDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceSpecificResults() == null) ? 0 : getResourceSpecificResults()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationResult == false)
            return false;
        EvaluationResult other = (EvaluationResult) obj;

        if (other.getEvalActionName() == null ^ this.getEvalActionName() == null)
            return false;
        if (other.getEvalActionName() != null
                && other.getEvalActionName().equals(this.getEvalActionName()) == false)
            return false;
        if (other.getEvalResourceName() == null ^ this.getEvalResourceName() == null)
            return false;
        if (other.getEvalResourceName() != null
                && other.getEvalResourceName().equals(this.getEvalResourceName()) == false)
            return false;
        if (other.getEvalDecision() == null ^ this.getEvalDecision() == null)
            return false;
        if (other.getEvalDecision() != null
                && other.getEvalDecision().equals(this.getEvalDecision()) == false)
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
        if (other.getOrganizationsDecisionDetail() == null
                ^ this.getOrganizationsDecisionDetail() == null)
            return false;
        if (other.getOrganizationsDecisionDetail() != null
                && other.getOrganizationsDecisionDetail().equals(
                        this.getOrganizationsDecisionDetail()) == false)
            return false;
        if (other.getPermissionsBoundaryDecisionDetail() == null
                ^ this.getPermissionsBoundaryDecisionDetail() == null)
            return false;
        if (other.getPermissionsBoundaryDecisionDetail() != null
                && other.getPermissionsBoundaryDecisionDetail().equals(
                        this.getPermissionsBoundaryDecisionDetail()) == false)
            return false;
        if (other.getEvalDecisionDetails() == null ^ this.getEvalDecisionDetails() == null)
            return false;
        if (other.getEvalDecisionDetails() != null
                && other.getEvalDecisionDetails().equals(this.getEvalDecisionDetails()) == false)
            return false;
        if (other.getResourceSpecificResults() == null ^ this.getResourceSpecificResults() == null)
            return false;
        if (other.getResourceSpecificResults() != null
                && other.getResourceSpecificResults().equals(this.getResourceSpecificResults()) == false)
            return false;
        return true;
    }
}
