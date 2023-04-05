/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

/**
 * <p>
 * A structure that contains configuration data.
 * </p>
 */
public class Configuration implements Serializable {
    /**
     * <p>
     * The configuration for an Amazon Lex V2 bot.
     * </p>
     */
    private LexConfiguration lex;

    /**
     * <p>
     * The configuration for an Amazon Lex V2 bot.
     * </p>
     *
     * @return <p>
     *         The configuration for an Amazon Lex V2 bot.
     *         </p>
     */
    public LexConfiguration getLex() {
        return lex;
    }

    /**
     * <p>
     * The configuration for an Amazon Lex V2 bot.
     * </p>
     *
     * @param lex <p>
     *            The configuration for an Amazon Lex V2 bot.
     *            </p>
     */
    public void setLex(LexConfiguration lex) {
        this.lex = lex;
    }

    /**
     * <p>
     * The configuration for an Amazon Lex V2 bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lex <p>
     *            The configuration for an Amazon Lex V2 bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Configuration withLex(LexConfiguration lex) {
        this.lex = lex;
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
        if (getLex() != null)
            sb.append("Lex: " + getLex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLex() == null) ? 0 : getLex().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Configuration == false)
            return false;
        Configuration other = (Configuration) obj;

        if (other.getLex() == null ^ this.getLex() == null)
            return false;
        if (other.getLex() != null && other.getLex().equals(this.getLex()) == false)
            return false;
        return true;
    }
}
