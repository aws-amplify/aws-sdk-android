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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

public class GetAccessControlEffectResult implements Serializable {
    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     */
    private String effect;

    /**
     * <p>
     * The rules that match the given parameters, resulting in an effect.
     * </p>
     */
    private java.util.List<String> matchedRules;

    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @return <p>
     *         The rule effect.
     *         </p>
     * @see AccessControlRuleEffect
     */
    public String getEffect() {
        return effect;
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param effect <p>
     *            The rule effect.
     *            </p>
     * @see AccessControlRuleEffect
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param effect <p>
     *            The rule effect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessControlRuleEffect
     */
    public GetAccessControlEffectResult withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param effect <p>
     *            The rule effect.
     *            </p>
     * @see AccessControlRuleEffect
     */
    public void setEffect(AccessControlRuleEffect effect) {
        this.effect = effect.toString();
    }

    /**
     * <p>
     * The rule effect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW, DENY
     *
     * @param effect <p>
     *            The rule effect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessControlRuleEffect
     */
    public GetAccessControlEffectResult withEffect(AccessControlRuleEffect effect) {
        this.effect = effect.toString();
        return this;
    }

    /**
     * <p>
     * The rules that match the given parameters, resulting in an effect.
     * </p>
     *
     * @return <p>
     *         The rules that match the given parameters, resulting in an
     *         effect.
     *         </p>
     */
    public java.util.List<String> getMatchedRules() {
        return matchedRules;
    }

    /**
     * <p>
     * The rules that match the given parameters, resulting in an effect.
     * </p>
     *
     * @param matchedRules <p>
     *            The rules that match the given parameters, resulting in an
     *            effect.
     *            </p>
     */
    public void setMatchedRules(java.util.Collection<String> matchedRules) {
        if (matchedRules == null) {
            this.matchedRules = null;
            return;
        }

        this.matchedRules = new java.util.ArrayList<String>(matchedRules);
    }

    /**
     * <p>
     * The rules that match the given parameters, resulting in an effect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchedRules <p>
     *            The rules that match the given parameters, resulting in an
     *            effect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccessControlEffectResult withMatchedRules(String... matchedRules) {
        if (getMatchedRules() == null) {
            this.matchedRules = new java.util.ArrayList<String>(matchedRules.length);
        }
        for (String value : matchedRules) {
            this.matchedRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The rules that match the given parameters, resulting in an effect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchedRules <p>
     *            The rules that match the given parameters, resulting in an
     *            effect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccessControlEffectResult withMatchedRules(java.util.Collection<String> matchedRules) {
        setMatchedRules(matchedRules);
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
        if (getEffect() != null)
            sb.append("Effect: " + getEffect() + ",");
        if (getMatchedRules() != null)
            sb.append("MatchedRules: " + getMatchedRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        hashCode = prime * hashCode
                + ((getMatchedRules() == null) ? 0 : getMatchedRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessControlEffectResult == false)
            return false;
        GetAccessControlEffectResult other = (GetAccessControlEffectResult) obj;

        if (other.getEffect() == null ^ this.getEffect() == null)
            return false;
        if (other.getEffect() != null && other.getEffect().equals(this.getEffect()) == false)
            return false;
        if (other.getMatchedRules() == null ^ this.getMatchedRules() == null)
            return false;
        if (other.getMatchedRules() != null
                && other.getMatchedRules().equals(this.getMatchedRules()) == false)
            return false;
        return true;
    }
}
