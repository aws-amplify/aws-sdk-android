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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * A map of key-value pairs containing the patterns that need to be replaced in
 * a managed template job document schema. You can use the description of each
 * key as a guidance to specify the inputs during runtime when creating a job.
 * </p>
 * <note>
 * <p>
 * <code>documentParameters</code> can only be used when creating jobs from
 * Amazon Web Services managed templates. This parameter can't be used with
 * custom job templates or to create jobs from them.
 * </p>
 * </note>
 */
public class DocumentParameter implements Serializable {
    /**
     * <p>
     * Key of the map field containing the patterns that need to be replaced in
     * a managed template job document schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String key;

    /**
     * <p>
     * Description of the map field containing the patterns that need to be
     * replaced in a managed template job document schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * A regular expression of the patterns that need to be replaced in a
     * managed template job document schema.
     * </p>
     */
    private String regex;

    /**
     * <p>
     * An example illustrating a pattern that need to be replaced in a managed
     * template job document schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String example;

    /**
     * <p>
     * Specifies whether a pattern that needs to be replaced in a managed
     * template job document schema is optional or required.
     * </p>
     */
    private Boolean optional;

    /**
     * <p>
     * Key of the map field containing the patterns that need to be replaced in
     * a managed template job document schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         Key of the map field containing the patterns that need to be
     *         replaced in a managed template job document schema.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Key of the map field containing the patterns that need to be replaced in
     * a managed template job document schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param key <p>
     *            Key of the map field containing the patterns that need to be
     *            replaced in a managed template job document schema.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Key of the map field containing the patterns that need to be replaced in
     * a managed template job document schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param key <p>
     *            Key of the map field containing the patterns that need to be
     *            replaced in a managed template job document schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentParameter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * Description of the map field containing the patterns that need to be
     * replaced in a managed template job document schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         Description of the map field containing the patterns that need to
     *         be replaced in a managed template job document schema.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Description of the map field containing the patterns that need to be
     * replaced in a managed template job document schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            Description of the map field containing the patterns that need
     *            to be replaced in a managed template job document schema.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the map field containing the patterns that need to be
     * replaced in a managed template job document schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            Description of the map field containing the patterns that need
     *            to be replaced in a managed template job document schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A regular expression of the patterns that need to be replaced in a
     * managed template job document schema.
     * </p>
     *
     * @return <p>
     *         A regular expression of the patterns that need to be replaced in
     *         a managed template job document schema.
     *         </p>
     */
    public String getRegex() {
        return regex;
    }

    /**
     * <p>
     * A regular expression of the patterns that need to be replaced in a
     * managed template job document schema.
     * </p>
     *
     * @param regex <p>
     *            A regular expression of the patterns that need to be replaced
     *            in a managed template job document schema.
     *            </p>
     */
    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * A regular expression of the patterns that need to be replaced in a
     * managed template job document schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regex <p>
     *            A regular expression of the patterns that need to be replaced
     *            in a managed template job document schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentParameter withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
     * <p>
     * An example illustrating a pattern that need to be replaced in a managed
     * template job document schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         An example illustrating a pattern that need to be replaced in a
     *         managed template job document schema.
     *         </p>
     */
    public String getExample() {
        return example;
    }

    /**
     * <p>
     * An example illustrating a pattern that need to be replaced in a managed
     * template job document schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param example <p>
     *            An example illustrating a pattern that need to be replaced in
     *            a managed template job document schema.
     *            </p>
     */
    public void setExample(String example) {
        this.example = example;
    }

    /**
     * <p>
     * An example illustrating a pattern that need to be replaced in a managed
     * template job document schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param example <p>
     *            An example illustrating a pattern that need to be replaced in
     *            a managed template job document schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentParameter withExample(String example) {
        this.example = example;
        return this;
    }

    /**
     * <p>
     * Specifies whether a pattern that needs to be replaced in a managed
     * template job document schema is optional or required.
     * </p>
     *
     * @return <p>
     *         Specifies whether a pattern that needs to be replaced in a
     *         managed template job document schema is optional or required.
     *         </p>
     */
    public Boolean isOptional() {
        return optional;
    }

    /**
     * <p>
     * Specifies whether a pattern that needs to be replaced in a managed
     * template job document schema is optional or required.
     * </p>
     *
     * @return <p>
     *         Specifies whether a pattern that needs to be replaced in a
     *         managed template job document schema is optional or required.
     *         </p>
     */
    public Boolean getOptional() {
        return optional;
    }

    /**
     * <p>
     * Specifies whether a pattern that needs to be replaced in a managed
     * template job document schema is optional or required.
     * </p>
     *
     * @param optional <p>
     *            Specifies whether a pattern that needs to be replaced in a
     *            managed template job document schema is optional or required.
     *            </p>
     */
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    /**
     * <p>
     * Specifies whether a pattern that needs to be replaced in a managed
     * template job document schema is optional or required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optional <p>
     *            Specifies whether a pattern that needs to be replaced in a
     *            managed template job document schema is optional or required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentParameter withOptional(Boolean optional) {
        this.optional = optional;
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
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getRegex() != null)
            sb.append("regex: " + getRegex() + ",");
        if (getExample() != null)
            sb.append("example: " + getExample() + ",");
        if (getOptional() != null)
            sb.append("optional: " + getOptional());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        hashCode = prime * hashCode + ((getExample() == null) ? 0 : getExample().hashCode());
        hashCode = prime * hashCode + ((getOptional() == null) ? 0 : getOptional().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentParameter == false)
            return false;
        DocumentParameter other = (DocumentParameter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        if (other.getExample() == null ^ this.getExample() == null)
            return false;
        if (other.getExample() != null && other.getExample().equals(this.getExample()) == false)
            return false;
        if (other.getOptional() == null ^ this.getOptional() == null)
            return false;
        if (other.getOptional() != null && other.getOptional().equals(this.getOptional()) == false)
            return false;
        return true;
    }
}
