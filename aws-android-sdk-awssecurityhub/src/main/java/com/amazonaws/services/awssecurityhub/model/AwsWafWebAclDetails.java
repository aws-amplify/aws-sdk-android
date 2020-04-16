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

/**
 * <p>
 * Details about a WAF WebACL.
 * </p>
 */
public class AwsWafWebAclDetails implements Serializable {
    /**
     * <p>
     * A friendly name or description of the WebACL. You can't change the name
     * of a WebACL after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * The action to perform if none of the Rules contained in the WebACL match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String defaultAction;

    /**
     * <p>
     * An array that contains the action for each rule in a WebACL, the priority
     * of the rule, and the ID of the rule.
     * </p>
     */
    private java.util.List<AwsWafWebAclRule> rules;

    /**
     * <p>
     * A unique identifier for a WebACL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String webAclId;

    /**
     * <p>
     * A friendly name or description of the WebACL. You can't change the name
     * of a WebACL after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description of the WebACL. You can't change
     *         the name of a WebACL after you create it.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description of the WebACL. You can't change the name
     * of a WebACL after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the WebACL. You can't change
     *            the name of a WebACL after you create it.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the WebACL. You can't change the name
     * of a WebACL after you create it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the WebACL. You can't change
     *            the name of a WebACL after you create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The action to perform if none of the Rules contained in the WebACL match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The action to perform if none of the Rules contained in the
     *         WebACL match.
     *         </p>
     */
    public String getDefaultAction() {
        return defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the Rules contained in the WebACL match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param defaultAction <p>
     *            The action to perform if none of the Rules contained in the
     *            WebACL match.
     *            </p>
     */
    public void setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the Rules contained in the WebACL match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param defaultAction <p>
     *            The action to perform if none of the Rules contained in the
     *            WebACL match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclDetails withDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * <p>
     * An array that contains the action for each rule in a WebACL, the priority
     * of the rule, and the ID of the rule.
     * </p>
     *
     * @return <p>
     *         An array that contains the action for each rule in a WebACL, the
     *         priority of the rule, and the ID of the rule.
     *         </p>
     */
    public java.util.List<AwsWafWebAclRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * An array that contains the action for each rule in a WebACL, the priority
     * of the rule, and the ID of the rule.
     * </p>
     *
     * @param rules <p>
     *            An array that contains the action for each rule in a WebACL,
     *            the priority of the rule, and the ID of the rule.
     *            </p>
     */
    public void setRules(java.util.Collection<AwsWafWebAclRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<AwsWafWebAclRule>(rules);
    }

    /**
     * <p>
     * An array that contains the action for each rule in a WebACL, the priority
     * of the rule, and the ID of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            An array that contains the action for each rule in a WebACL,
     *            the priority of the rule, and the ID of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclDetails withRules(AwsWafWebAclRule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<AwsWafWebAclRule>(rules.length);
        }
        for (AwsWafWebAclRule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the action for each rule in a WebACL, the priority
     * of the rule, and the ID of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            An array that contains the action for each rule in a WebACL,
     *            the priority of the rule, and the ID of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclDetails withRules(java.util.Collection<AwsWafWebAclRule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a WebACL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A unique identifier for a WebACL.
     *         </p>
     */
    public String getWebAclId() {
        return webAclId;
    }

    /**
     * <p>
     * A unique identifier for a WebACL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webAclId <p>
     *            A unique identifier for a WebACL.
     *            </p>
     */
    public void setWebAclId(String webAclId) {
        this.webAclId = webAclId;
    }

    /**
     * <p>
     * A unique identifier for a WebACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webAclId <p>
     *            A unique identifier for a WebACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclDetails withWebAclId(String webAclId) {
        this.webAclId = webAclId;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: " + getDefaultAction() + ",");
        if (getRules() != null)
            sb.append("Rules: " + getRules() + ",");
        if (getWebAclId() != null)
            sb.append("WebAclId: " + getWebAclId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getWebAclId() == null) ? 0 : getWebAclId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafWebAclDetails == false)
            return false;
        AwsWafWebAclDetails other = (AwsWafWebAclDetails) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null
                && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getWebAclId() == null ^ this.getWebAclId() == null)
            return false;
        if (other.getWebAclId() != null && other.getWebAclId().equals(this.getWebAclId()) == false)
            return false;
        return true;
    }
}
