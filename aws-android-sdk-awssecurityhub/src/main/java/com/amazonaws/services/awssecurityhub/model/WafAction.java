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
 * Details about the action that CloudFront or AWS WAF takes when a web request
 * matches the conditions in the Rule.
 * </p>
 */
public class WafAction implements Serializable {
    /**
     * <p>
     * Specifies how you want AWS WAF to respond to requests that match the
     * settings in a Rule.
     * </p>
     * <p>
     * Valid settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - AWS WAF allows requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - AWS WAF blocks requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - AWS WAF increments a counter of the requests that
     * match all of the conditions in the rule. AWS WAF then continues to
     * inspect the web request based on the remaining rules in the web ACL. You
     * can't specify <code>COUNT</code> for the default action for a WebACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String type;

    /**
     * <p>
     * Specifies how you want AWS WAF to respond to requests that match the
     * settings in a Rule.
     * </p>
     * <p>
     * Valid settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - AWS WAF allows requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - AWS WAF blocks requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - AWS WAF increments a counter of the requests that
     * match all of the conditions in the rule. AWS WAF then continues to
     * inspect the web request based on the remaining rules in the web ACL. You
     * can't specify <code>COUNT</code> for the default action for a WebACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Specifies how you want AWS WAF to respond to requests that match
     *         the settings in a Rule.
     *         </p>
     *         <p>
     *         Valid settings include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALLOW</code> - AWS WAF allows requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BLOCK</code> - AWS WAF blocks requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COUNT</code> - AWS WAF increments a counter of the requests
     *         that match all of the conditions in the rule. AWS WAF then
     *         continues to inspect the web request based on the remaining rules
     *         in the web ACL. You can't specify <code>COUNT</code> for the
     *         default action for a WebACL.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Specifies how you want AWS WAF to respond to requests that match the
     * settings in a Rule.
     * </p>
     * <p>
     * Valid settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - AWS WAF allows requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - AWS WAF blocks requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - AWS WAF increments a counter of the requests that
     * match all of the conditions in the rule. AWS WAF then continues to
     * inspect the web request based on the remaining rules in the web ACL. You
     * can't specify <code>COUNT</code> for the default action for a WebACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            Specifies how you want AWS WAF to respond to requests that
     *            match the settings in a Rule.
     *            </p>
     *            <p>
     *            Valid settings include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALLOW</code> - AWS WAF allows requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BLOCK</code> - AWS WAF blocks requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COUNT</code> - AWS WAF increments a counter of the
     *            requests that match all of the conditions in the rule. AWS WAF
     *            then continues to inspect the web request based on the
     *            remaining rules in the web ACL. You can't specify
     *            <code>COUNT</code> for the default action for a WebACL.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies how you want AWS WAF to respond to requests that match the
     * settings in a Rule.
     * </p>
     * <p>
     * Valid settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - AWS WAF allows requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - AWS WAF blocks requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - AWS WAF increments a counter of the requests that
     * match all of the conditions in the rule. AWS WAF then continues to
     * inspect the web request based on the remaining rules in the web ACL. You
     * can't specify <code>COUNT</code> for the default action for a WebACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            Specifies how you want AWS WAF to respond to requests that
     *            match the settings in a Rule.
     *            </p>
     *            <p>
     *            Valid settings include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALLOW</code> - AWS WAF allows requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BLOCK</code> - AWS WAF blocks requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COUNT</code> - AWS WAF increments a counter of the
     *            requests that match all of the conditions in the rule. AWS WAF
     *            then continues to inspect the web request based on the
     *            remaining rules in the web ACL. You can't specify
     *            <code>COUNT</code> for the default action for a WebACL.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WafAction withType(String type) {
        this.type = type;
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

        if (obj instanceof WafAction == false)
            return false;
        WafAction other = (WafAction) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
