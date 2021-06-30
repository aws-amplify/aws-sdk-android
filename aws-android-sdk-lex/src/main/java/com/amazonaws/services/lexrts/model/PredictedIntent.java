/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model;

import java.io.Serializable;

/**
 * <p>
 * An intent that Amazon Lex suggests satisfies the user's intent. Includes the
 * name of the intent, the confidence that Amazon Lex has that the user's intent
 * is satisfied, and the slots defined for the intent.
 * </p>
 */
public class PredictedIntent implements Serializable {
    /**
     * <p>
     * The name of the intent that Amazon Lex suggests satisfies the user's
     * intent.
     * </p>
     */
    private String intentName;

    /**
     * <p>
     * Indicates how confident Amazon Lex is that an intent satisfies the user's
     * intent.
     * </p>
     */
    private IntentConfidence nluIntentConfidence;

    /**
     * <p>
     * The slot and slot values associated with the predicted intent.
     * </p>
     */
    private java.util.Map<String, String> slots;

    /**
     * <p>
     * The name of the intent that Amazon Lex suggests satisfies the user's
     * intent.
     * </p>
     *
     * @return <p>
     *         The name of the intent that Amazon Lex suggests satisfies the
     *         user's intent.
     *         </p>
     */
    public String getIntentName() {
        return intentName;
    }

    /**
     * <p>
     * The name of the intent that Amazon Lex suggests satisfies the user's
     * intent.
     * </p>
     *
     * @param intentName <p>
     *            The name of the intent that Amazon Lex suggests satisfies the
     *            user's intent.
     *            </p>
     */
    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the intent that Amazon Lex suggests satisfies the user's
     * intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intentName <p>
     *            The name of the intent that Amazon Lex suggests satisfies the
     *            user's intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredictedIntent withIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }

    /**
     * <p>
     * Indicates how confident Amazon Lex is that an intent satisfies the user's
     * intent.
     * </p>
     *
     * @return <p>
     *         Indicates how confident Amazon Lex is that an intent satisfies
     *         the user's intent.
     *         </p>
     */
    public IntentConfidence getNluIntentConfidence() {
        return nluIntentConfidence;
    }

    /**
     * <p>
     * Indicates how confident Amazon Lex is that an intent satisfies the user's
     * intent.
     * </p>
     *
     * @param nluIntentConfidence <p>
     *            Indicates how confident Amazon Lex is that an intent satisfies
     *            the user's intent.
     *            </p>
     */
    public void setNluIntentConfidence(IntentConfidence nluIntentConfidence) {
        this.nluIntentConfidence = nluIntentConfidence;
    }

    /**
     * <p>
     * Indicates how confident Amazon Lex is that an intent satisfies the user's
     * intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nluIntentConfidence <p>
     *            Indicates how confident Amazon Lex is that an intent satisfies
     *            the user's intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredictedIntent withNluIntentConfidence(IntentConfidence nluIntentConfidence) {
        this.nluIntentConfidence = nluIntentConfidence;
        return this;
    }

    /**
     * <p>
     * The slot and slot values associated with the predicted intent.
     * </p>
     *
     * @return <p>
     *         The slot and slot values associated with the predicted intent.
     *         </p>
     */
    public java.util.Map<String, String> getSlots() {
        return slots;
    }

    /**
     * <p>
     * The slot and slot values associated with the predicted intent.
     * </p>
     *
     * @param slots <p>
     *            The slot and slot values associated with the predicted intent.
     *            </p>
     */
    public void setSlots(java.util.Map<String, String> slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * The slot and slot values associated with the predicted intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            The slot and slot values associated with the predicted intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredictedIntent withSlots(java.util.Map<String, String> slots) {
        this.slots = slots;
        return this;
    }

    /**
     * <p>
     * The slot and slot values associated with the predicted intent.
     * </p>
     * <p>
     * The method adds a new key-value pair into slots parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into slots.
     * @param value The corresponding value of the entry to be added into slots.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredictedIntent addslotsEntry(String key, String value) {
        if (null == this.slots) {
            this.slots = new java.util.HashMap<String, String>();
        }
        if (this.slots.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.slots.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into slots.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PredictedIntent clearslotsEntries() {
        this.slots = null;
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
        if (getIntentName() != null)
            sb.append("intentName: " + getIntentName() + ",");
        if (getNluIntentConfidence() != null)
            sb.append("nluIntentConfidence: " + getNluIntentConfidence() + ",");
        if (getSlots() != null)
            sb.append("slots: " + getSlots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode
                + ((getNluIntentConfidence() == null) ? 0 : getNluIntentConfidence().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictedIntent == false)
            return false;
        PredictedIntent other = (PredictedIntent) obj;

        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null
                && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getNluIntentConfidence() == null ^ this.getNluIntentConfidence() == null)
            return false;
        if (other.getNluIntentConfidence() != null
                && other.getNluIntentConfidence().equals(this.getNluIntentConfidence()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        return true;
    }
}
