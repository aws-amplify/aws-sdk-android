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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>A set of rules defining the approval rules for a patch baseline.</p>
 */
public class PatchRuleGroup implements Serializable {
    /**
     * <p>The rules that make up the rule group.</p>
     */
    private java.util.List<PatchRule> patchRules;

    /**
     * <p>The rules that make up the rule group.</p>
     *
     * @return <p>The rules that make up the rule group.</p>
     */
    public java.util.List<PatchRule> getPatchRules() {
        return patchRules;
    }

    /**
     * <p>The rules that make up the rule group.</p>
     *
     * @param patchRules <p>The rules that make up the rule group.</p>
     */
    public void setPatchRules(java.util.Collection<PatchRule> patchRules) {
        if (patchRules == null) {
            this.patchRules = null;
            return;
        }

        this.patchRules = new java.util.ArrayList<PatchRule>(patchRules);
    }

    /**
     * <p>The rules that make up the rule group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param patchRules <p>The rules that make up the rule group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PatchRuleGroup withPatchRules(PatchRule... patchRules) {
        if (getPatchRules() == null) {
            this.patchRules = new java.util.ArrayList<PatchRule>(patchRules.length);
        }
        for (PatchRule value : patchRules) {
            this.patchRules.add(value);
        }
        return this;
    }

    /**
     * <p>The rules that make up the rule group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param patchRules <p>The rules that make up the rule group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PatchRuleGroup withPatchRules(java.util.Collection<PatchRule> patchRules) {
        setPatchRules(patchRules);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPatchRules() != null) sb.append("PatchRules: " + getPatchRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatchRules() == null) ? 0 : getPatchRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PatchRuleGroup == false) return false;
        PatchRuleGroup other = (PatchRuleGroup)obj;

        if (other.getPatchRules() == null ^ this.getPatchRules() == null) return false;
        if (other.getPatchRules() != null && other.getPatchRules().equals(this.getPatchRules()) == false) return false;
        return true;
    }
}
