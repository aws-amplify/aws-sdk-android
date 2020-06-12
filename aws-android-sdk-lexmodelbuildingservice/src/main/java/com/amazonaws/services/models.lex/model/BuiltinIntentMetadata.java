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

/**
 * <p>
 * Provides metadata for a built-in intent.
 * </p>
 */
public class BuiltinIntentMetadata implements Serializable {
    /**
     * <p>
     * A unique identifier for the built-in intent. To find the signature for an
     * intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     */
    private String signature;

    /**
     * <p>
     * A list of identifiers for the locales that the intent supports.
     * </p>
     */
    private java.util.List<String> supportedLocales;

    /**
     * <p>
     * A unique identifier for the built-in intent. To find the signature for an
     * intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the built-in intent. To find the
     *         signature for an intent, see <a href=
     *         "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *         >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *         </p>
     */
    public String getSignature() {
        return signature;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent. To find the signature for an
     * intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     *
     * @param signature <p>
     *            A unique identifier for the built-in intent. To find the
     *            signature for an intent, see <a href=
     *            "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *            >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *            </p>
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent. To find the signature for an
     * intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signature <p>
     *            A unique identifier for the built-in intent. To find the
     *            signature for an intent, see <a href=
     *            "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *            >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuiltinIntentMetadata withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * <p>
     * A list of identifiers for the locales that the intent supports.
     * </p>
     *
     * @return <p>
     *         A list of identifiers for the locales that the intent supports.
     *         </p>
     */
    public java.util.List<String> getSupportedLocales() {
        return supportedLocales;
    }

    /**
     * <p>
     * A list of identifiers for the locales that the intent supports.
     * </p>
     *
     * @param supportedLocales <p>
     *            A list of identifiers for the locales that the intent
     *            supports.
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
     * A list of identifiers for the locales that the intent supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedLocales <p>
     *            A list of identifiers for the locales that the intent
     *            supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuiltinIntentMetadata withSupportedLocales(String... supportedLocales) {
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
     * A list of identifiers for the locales that the intent supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedLocales <p>
     *            A list of identifiers for the locales that the intent
     *            supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuiltinIntentMetadata withSupportedLocales(java.util.Collection<String> supportedLocales) {
        setSupportedLocales(supportedLocales);
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
            sb.append("supportedLocales: " + getSupportedLocales());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuiltinIntentMetadata == false)
            return false;
        BuiltinIntentMetadata other = (BuiltinIntentMetadata) obj;

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
        return true;
    }
}
