/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration information of an Amazon Lex bot.
 * </p>
 */
public class LexBot implements Serializable {
    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     */
    private String name;

    /**
     * <p>
     * The Region that the Amazon Lex bot was created in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 60<br/>
     */
    private String lexRegion;

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     *
     * @return <p>
     *         The name of the Amazon Lex bot.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     *
     * @param name <p>
     *            The name of the Amazon Lex bot.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 50<br/>
     *
     * @param name <p>
     *            The name of the Amazon Lex bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexBot withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Region that the Amazon Lex bot was created in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 60<br/>
     *
     * @return <p>
     *         The Region that the Amazon Lex bot was created in.
     *         </p>
     */
    public String getLexRegion() {
        return lexRegion;
    }

    /**
     * <p>
     * The Region that the Amazon Lex bot was created in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 60<br/>
     *
     * @param lexRegion <p>
     *            The Region that the Amazon Lex bot was created in.
     *            </p>
     */
    public void setLexRegion(String lexRegion) {
        this.lexRegion = lexRegion;
    }

    /**
     * <p>
     * The Region that the Amazon Lex bot was created in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 60<br/>
     *
     * @param lexRegion <p>
     *            The Region that the Amazon Lex bot was created in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexBot withLexRegion(String lexRegion) {
        this.lexRegion = lexRegion;
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
        if (getLexRegion() != null)
            sb.append("LexRegion: " + getLexRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLexRegion() == null) ? 0 : getLexRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LexBot == false)
            return false;
        LexBot other = (LexBot) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLexRegion() == null ^ this.getLexRegion() == null)
            return false;
        if (other.getLexRegion() != null
                && other.getLexRegion().equals(this.getLexRegion()) == false)
            return false;
        return true;
    }
}
