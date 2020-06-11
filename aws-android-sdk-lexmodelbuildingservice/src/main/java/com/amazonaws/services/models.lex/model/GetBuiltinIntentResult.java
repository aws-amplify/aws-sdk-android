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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

public class GetBuiltinIntentResult implements Serializable {
    /**
     * <p>
     * The unique identifier for a built-in intent.
     * </p>
     */
    private String signature;

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     */
    private java.util.List<String> supportedLocales;

    /**
     * <p>
     * An array of <code>BuiltinIntentSlot</code> objects, one entry for each
     * slot type in the intent.
     * </p>
     */
    private java.util.List<BuiltinIntentSlot> slots;

    /**
     * <p>
     * The unique identifier for a built-in intent.
     * </p>
     *
     * @return <p>
     *         The unique identifier for a built-in intent.
     *         </p>
     */
    public String getSignature() {
        return signature;
    }

    /**
     * <p>
     * The unique identifier for a built-in intent.
     * </p>
     *
     * @param signature <p>
     *            The unique identifier for a built-in intent.
     *            </p>
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * The unique identifier for a built-in intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signature <p>
     *            The unique identifier for a built-in intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinIntentResult withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     *
     * @return <p>
     *         A list of locales that the intent supports.
     *         </p>
     */
    public java.util.List<String> getSupportedLocales() {
        return supportedLocales;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     *
     * @param supportedLocales <p>
     *            A list of locales that the intent supports.
     *            </p>
     */
    public void setSupportedLocales(java.util.Collection<String> supportedLocales) {
        if (supportedLocales == null) {
            this.supportedLocales = null;
            return;
        }

        this.supportedLocales = new java.util.ArrayList<String>(supportedLocales);
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedLocales <p>
     *            A list of locales that the intent supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinIntentResult withSupportedLocales(String... supportedLocales) {
        if (getSupportedLocales() == null) {
            this.supportedLocales = new java.util.ArrayList<String>(supportedLocales.length);
        }
        for (String value : supportedLocales) {
            this.supportedLocales.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedLocales <p>
     *            A list of locales that the intent supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinIntentResult withSupportedLocales(java.util.Collection<String> supportedLocales) {
        setSupportedLocales(supportedLocales);
        return this;
    }

    /**
     * <p>
     * An array of <code>BuiltinIntentSlot</code> objects, one entry for each
     * slot type in the intent.
     * </p>
     *
     * @return <p>
     *         An array of <code>BuiltinIntentSlot</code> objects, one entry for
     *         each slot type in the intent.
     *         </p>
     */
    public java.util.List<BuiltinIntentSlot> getSlots() {
        return slots;
    }

    /**
     * <p>
     * An array of <code>BuiltinIntentSlot</code> objects, one entry for each
     * slot type in the intent.
     * </p>
     *
     * @param slots <p>
     *            An array of <code>BuiltinIntentSlot</code> objects, one entry
     *            for each slot type in the intent.
     *            </p>
     */
    public void setSlots(java.util.Collection<BuiltinIntentSlot> slots) {
        if (slots == null) {
            this.slots = null;
            return;
        }

        this.slots = new java.util.ArrayList<BuiltinIntentSlot>(slots);
    }

    /**
     * <p>
     * An array of <code>BuiltinIntentSlot</code> objects, one entry for each
     * slot type in the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            An array of <code>BuiltinIntentSlot</code> objects, one entry
     *            for each slot type in the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinIntentResult withSlots(BuiltinIntentSlot... slots) {
        if (getSlots() == null) {
            this.slots = new java.util.ArrayList<BuiltinIntentSlot>(slots.length);
        }
        for (BuiltinIntentSlot value : slots) {
            this.slots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BuiltinIntentSlot</code> objects, one entry for each
     * slot type in the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            An array of <code>BuiltinIntentSlot</code> objects, one entry
     *            for each slot type in the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinIntentResult withSlots(java.util.Collection<BuiltinIntentSlot> slots) {
        setSlots(slots);
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
        if (getSignature() != null)
            sb.append("signature: " + getSignature() + ",");
        if (getSupportedLocales() != null)
            sb.append("supportedLocales: " + getSupportedLocales() + ",");
        if (getSlots() != null)
            sb.append("slots: " + getSlots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedLocales() == null) ? 0 : getSupportedLocales().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBuiltinIntentResult == false)
            return false;
        GetBuiltinIntentResult other = (GetBuiltinIntentResult) obj;

        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null
                && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getSupportedLocales() == null ^ this.getSupportedLocales() == null)
            return false;
        if (other.getSupportedLocales() != null
                && other.getSupportedLocales().equals(this.getSupportedLocales()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        return true;
    }
}
