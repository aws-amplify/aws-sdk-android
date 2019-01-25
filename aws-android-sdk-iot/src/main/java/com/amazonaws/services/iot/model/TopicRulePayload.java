/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a rule.
 * </p>
 */
public class TopicRulePayload implements Serializable {
    /**
     * <p>
     * The SQL statement used to query the topic. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     * >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     */
    private String sql;

    /**
     * <p>
     * The description of the rule.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     */
    private java.util.List<Action> actions;

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     */
    private Boolean ruleDisabled;

    /**
     * <p>
     * The version of the SQL rules engine to use when evaluating the rule.
     * </p>
     */
    private String awsIotSqlVersion;

    /**
     * <p>
     * The action to take when an error occurs.
     * </p>
     */
    private Action errorAction;

    /**
     * <p>
     * The SQL statement used to query the topic. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     * >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The SQL statement used to query the topic. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     *         >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     *         </p>
     */
    public String getSql() {
        return sql;
    }

    /**
     * <p>
     * The SQL statement used to query the topic. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     * >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     *
     * @param sql <p>
     *            The SQL statement used to query the topic. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     *            >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer
     *            Guide</i>.
     *            </p>
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * <p>
     * The SQL statement used to query the topic. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     * >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sql <p>
     *            The SQL statement used to query the topic. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     *            >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRulePayload withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     *
     * @return <p>
     *         The description of the rule.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     *
     * @param description <p>
     *            The description of the rule.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRulePayload withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     *
     * @return <p>
     *         The actions associated with the rule.
     *         </p>
     */
    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     *
     * @param actions <p>
     *            The actions associated with the rule.
     *            </p>
     */
    public void setActions(java.util.Collection<Action> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<Action>(actions);
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions associated with the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRulePayload withActions(Action... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<Action>(actions.length);
        }
        for (Action value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions associated with the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRulePayload withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether the rule is disabled.
     *         </p>
     */
    public Boolean isRuleDisabled() {
        return ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether the rule is disabled.
     *         </p>
     */
    public Boolean getRuleDisabled() {
        return ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     *
     * @param ruleDisabled <p>
     *            Specifies whether the rule is disabled.
     *            </p>
     */
    public void setRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleDisabled <p>
     *            Specifies whether the rule is disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRulePayload withRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
        return this;
    }

    /**
     * <p>
     * The version of the SQL rules engine to use when evaluating the rule.
     * </p>
     *
     * @return <p>
     *         The version of the SQL rules engine to use when evaluating the
     *         rule.
     *         </p>
     */
    public String getAwsIotSqlVersion() {
        return awsIotSqlVersion;
    }

    /**
     * <p>
     * The version of the SQL rules engine to use when evaluating the rule.
     * </p>
     *
     * @param awsIotSqlVersion <p>
     *            The version of the SQL rules engine to use when evaluating the
     *            rule.
     *            </p>
     */
    public void setAwsIotSqlVersion(String awsIotSqlVersion) {
        this.awsIotSqlVersion = awsIotSqlVersion;
    }

    /**
     * <p>
     * The version of the SQL rules engine to use when evaluating the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsIotSqlVersion <p>
     *            The version of the SQL rules engine to use when evaluating the
     *            rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRulePayload withAwsIotSqlVersion(String awsIotSqlVersion) {
        this.awsIotSqlVersion = awsIotSqlVersion;
        return this;
    }

    /**
     * <p>
     * The action to take when an error occurs.
     * </p>
     *
     * @return <p>
     *         The action to take when an error occurs.
     *         </p>
     */
    public Action getErrorAction() {
        return errorAction;
    }

    /**
     * <p>
     * The action to take when an error occurs.
     * </p>
     *
     * @param errorAction <p>
     *            The action to take when an error occurs.
     *            </p>
     */
    public void setErrorAction(Action errorAction) {
        this.errorAction = errorAction;
    }

    /**
     * <p>
     * The action to take when an error occurs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorAction <p>
     *            The action to take when an error occurs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRulePayload withErrorAction(Action errorAction) {
        this.errorAction = errorAction;
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
        if (getSql() != null)
            sb.append("sql: " + getSql() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getActions() != null)
            sb.append("actions: " + getActions() + ",");
        if (getRuleDisabled() != null)
            sb.append("ruleDisabled: " + getRuleDisabled() + ",");
        if (getAwsIotSqlVersion() != null)
            sb.append("awsIotSqlVersion: " + getAwsIotSqlVersion() + ",");
        if (getErrorAction() != null)
            sb.append("errorAction: " + getErrorAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSql() == null) ? 0 : getSql().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode
                + ((getRuleDisabled() == null) ? 0 : getRuleDisabled().hashCode());
        hashCode = prime * hashCode
                + ((getAwsIotSqlVersion() == null) ? 0 : getAwsIotSqlVersion().hashCode());
        hashCode = prime * hashCode
                + ((getErrorAction() == null) ? 0 : getErrorAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRulePayload == false)
            return false;
        TopicRulePayload other = (TopicRulePayload) obj;

        if (other.getSql() == null ^ this.getSql() == null)
            return false;
        if (other.getSql() != null && other.getSql().equals(this.getSql()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getRuleDisabled() == null ^ this.getRuleDisabled() == null)
            return false;
        if (other.getRuleDisabled() != null
                && other.getRuleDisabled().equals(this.getRuleDisabled()) == false)
            return false;
        if (other.getAwsIotSqlVersion() == null ^ this.getAwsIotSqlVersion() == null)
            return false;
        if (other.getAwsIotSqlVersion() != null
                && other.getAwsIotSqlVersion().equals(this.getAwsIotSqlVersion()) == false)
            return false;
        if (other.getErrorAction() == null ^ this.getErrorAction() == null)
            return false;
        if (other.getErrorAction() != null
                && other.getErrorAction().equals(this.getErrorAction()) == false)
            return false;
        return true;
    }
}
