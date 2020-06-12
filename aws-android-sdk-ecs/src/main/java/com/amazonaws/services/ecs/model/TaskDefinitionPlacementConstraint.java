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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * An object representing a constraint on task placement in the task definition.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html"
 * >Task Placement Constraints</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 * <note>
 * <p>
 * If you are using the Fargate launch type, task placement constraints are not
 * supported.
 * </p>
 * </note>
 */
public class TaskDefinitionPlacementConstraint implements Serializable {
    /**
     * <p>
     * The type of constraint. The <code>MemberOf</code> constraint restricts
     * selection to be from a group of valid candidates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>memberOf
     */
    private String type;

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     * >Cluster Query Language</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     */
    private String expression;

    /**
     * <p>
     * The type of constraint. The <code>MemberOf</code> constraint restricts
     * selection to be from a group of valid candidates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>memberOf
     *
     * @return <p>
     *         The type of constraint. The <code>MemberOf</code> constraint
     *         restricts selection to be from a group of valid candidates.
     *         </p>
     * @see TaskDefinitionPlacementConstraintType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of constraint. The <code>MemberOf</code> constraint restricts
     * selection to be from a group of valid candidates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>memberOf
     *
     * @param type <p>
     *            The type of constraint. The <code>MemberOf</code> constraint
     *            restricts selection to be from a group of valid candidates.
     *            </p>
     * @see TaskDefinitionPlacementConstraintType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of constraint. The <code>MemberOf</code> constraint restricts
     * selection to be from a group of valid candidates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>memberOf
     *
     * @param type <p>
     *            The type of constraint. The <code>MemberOf</code> constraint
     *            restricts selection to be from a group of valid candidates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskDefinitionPlacementConstraintType
     */
    public TaskDefinitionPlacementConstraint withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of constraint. The <code>MemberOf</code> constraint restricts
     * selection to be from a group of valid candidates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>memberOf
     *
     * @param type <p>
     *            The type of constraint. The <code>MemberOf</code> constraint
     *            restricts selection to be from a group of valid candidates.
     *            </p>
     * @see TaskDefinitionPlacementConstraintType
     */
    public void setType(TaskDefinitionPlacementConstraintType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of constraint. The <code>MemberOf</code> constraint restricts
     * selection to be from a group of valid candidates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>memberOf
     *
     * @param type <p>
     *            The type of constraint. The <code>MemberOf</code> constraint
     *            restricts selection to be from a group of valid candidates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskDefinitionPlacementConstraintType
     */
    public TaskDefinitionPlacementConstraint withType(TaskDefinitionPlacementConstraintType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     * >Cluster Query Language</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A cluster query language expression to apply to the constraint.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     *         >Cluster Query Language</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     */
    public String getExpression() {
        return expression;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     * >Cluster Query Language</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     *
     * @param expression <p>
     *            A cluster query language expression to apply to the
     *            constraint. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     *            >Cluster Query Language</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * A cluster query language expression to apply to the constraint. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     * >Cluster Query Language</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expression <p>
     *            A cluster query language expression to apply to the
     *            constraint. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html"
     *            >Cluster Query Language</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinitionPlacementConstraint withExpression(String expression) {
        this.expression = expression;
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getExpression() != null)
            sb.append("expression: " + getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskDefinitionPlacementConstraint == false)
            return false;
        TaskDefinitionPlacementConstraint other = (TaskDefinitionPlacementConstraint) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null
                && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
    }
}
