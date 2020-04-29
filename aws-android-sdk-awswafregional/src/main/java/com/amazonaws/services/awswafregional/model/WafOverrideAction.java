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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * The action to take if any rule within the <code>RuleGroup</code> matches a
 * request.
 * </p>
 */
public class WafOverrideAction implements Serializable {
    /**
     * <p>
     * <code>COUNT</code> overrides the action specified by the individual rule
     * within a <code>RuleGroup</code> . If set to <code>NONE</code>, the rule's
     * action will take place.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, COUNT
     */
    private String type;

    /**
     * <p>
     * <code>COUNT</code> overrides the action specified by the individual rule
     * within a <code>RuleGroup</code> . If set to <code>NONE</code>, the rule's
     * action will take place.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, COUNT
     *
     * @return <p>
     *         <code>COUNT</code> overrides the action specified by the
     *         individual rule within a <code>RuleGroup</code> . If set to
     *         <code>NONE</code>, the rule's action will take place.
     *         </p>
     * @see WafOverrideActionType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * <code>COUNT</code> overrides the action specified by the individual rule
     * within a <code>RuleGroup</code> . If set to <code>NONE</code>, the rule's
     * action will take place.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, COUNT
     *
     * @param type <p>
     *            <code>COUNT</code> overrides the action specified by the
     *            individual rule within a <code>RuleGroup</code> . If set to
     *            <code>NONE</code>, the rule's action will take place.
     *            </p>
     * @see WafOverrideActionType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * <code>COUNT</code> overrides the action specified by the individual rule
     * within a <code>RuleGroup</code> . If set to <code>NONE</code>, the rule's
     * action will take place.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, COUNT
     *
     * @param type <p>
     *            <code>COUNT</code> overrides the action specified by the
     *            individual rule within a <code>RuleGroup</code> . If set to
     *            <code>NONE</code>, the rule's action will take place.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WafOverrideActionType
     */
    public WafOverrideAction withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * <code>COUNT</code> overrides the action specified by the individual rule
     * within a <code>RuleGroup</code> . If set to <code>NONE</code>, the rule's
     * action will take place.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, COUNT
     *
     * @param type <p>
     *            <code>COUNT</code> overrides the action specified by the
     *            individual rule within a <code>RuleGroup</code> . If set to
     *            <code>NONE</code>, the rule's action will take place.
     *            </p>
     * @see WafOverrideActionType
     */
    public void setType(WafOverrideActionType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * <code>COUNT</code> overrides the action specified by the individual rule
     * within a <code>RuleGroup</code> . If set to <code>NONE</code>, the rule's
     * action will take place.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, COUNT
     *
     * @param type <p>
     *            <code>COUNT</code> overrides the action specified by the
     *            individual rule within a <code>RuleGroup</code> . If set to
     *            <code>NONE</code>, the rule's action will take place.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WafOverrideActionType
     */
    public WafOverrideAction withType(WafOverrideActionType type) {
        this.type = type.toString();
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
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WafOverrideAction == false)
            return false;
        WafOverrideAction other = (WafOverrideAction) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
