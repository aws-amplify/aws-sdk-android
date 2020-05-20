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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the method and value to match with the header value
 * sent in a request. Specify one match method.
 * </p>
 */
public class HeaderMatchMethod implements Serializable {
    /**
     * <p>
     * The value sent by the client must match the specified value exactly.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String exact;

    /**
     * <p>
     * The value sent by the client must begin with the specified characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String prefix;

    /**
     * <p>
     * An object that represents the range of values to match on.
     * </p>
     */
    private MatchRange range;

    /**
     * <p>
     * The value sent by the client must include the specified characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String regex;

    /**
     * <p>
     * The value sent by the client must end with the specified characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String suffix;

    /**
     * <p>
     * The value sent by the client must match the specified value exactly.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The value sent by the client must match the specified value
     *         exactly.
     *         </p>
     */
    public String getExact() {
        return exact;
    }

    /**
     * <p>
     * The value sent by the client must match the specified value exactly.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param exact <p>
     *            The value sent by the client must match the specified value
     *            exactly.
     *            </p>
     */
    public void setExact(String exact) {
        this.exact = exact;
    }

    /**
     * <p>
     * The value sent by the client must match the specified value exactly.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param exact <p>
     *            The value sent by the client must match the specified value
     *            exactly.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HeaderMatchMethod withExact(String exact) {
        this.exact = exact;
        return this;
    }

    /**
     * <p>
     * The value sent by the client must begin with the specified characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The value sent by the client must begin with the specified
     *         characters.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The value sent by the client must begin with the specified characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param prefix <p>
     *            The value sent by the client must begin with the specified
     *            characters.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The value sent by the client must begin with the specified characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param prefix <p>
     *            The value sent by the client must begin with the specified
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HeaderMatchMethod withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * An object that represents the range of values to match on.
     * </p>
     *
     * @return <p>
     *         An object that represents the range of values to match on.
     *         </p>
     */
    public MatchRange getRange() {
        return range;
    }

    /**
     * <p>
     * An object that represents the range of values to match on.
     * </p>
     *
     * @param range <p>
     *            An object that represents the range of values to match on.
     *            </p>
     */
    public void setRange(MatchRange range) {
        this.range = range;
    }

    /**
     * <p>
     * An object that represents the range of values to match on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param range <p>
     *            An object that represents the range of values to match on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HeaderMatchMethod withRange(MatchRange range) {
        this.range = range;
        return this;
    }

    /**
     * <p>
     * The value sent by the client must include the specified characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The value sent by the client must include the specified
     *         characters.
     *         </p>
     */
    public String getRegex() {
        return regex;
    }

    /**
     * <p>
     * The value sent by the client must include the specified characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param regex <p>
     *            The value sent by the client must include the specified
     *            characters.
     *            </p>
     */
    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * The value sent by the client must include the specified characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param regex <p>
     *            The value sent by the client must include the specified
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HeaderMatchMethod withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
     * <p>
     * The value sent by the client must end with the specified characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The value sent by the client must end with the specified
     *         characters.
     *         </p>
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * <p>
     * The value sent by the client must end with the specified characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param suffix <p>
     *            The value sent by the client must end with the specified
     *            characters.
     *            </p>
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * <p>
     * The value sent by the client must end with the specified characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param suffix <p>
     *            The value sent by the client must end with the specified
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HeaderMatchMethod withSuffix(String suffix) {
        this.suffix = suffix;
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
        if (getExact() != null)
            sb.append("exact: " + getExact() + ",");
        if (getPrefix() != null)
            sb.append("prefix: " + getPrefix() + ",");
        if (getRange() != null)
            sb.append("range: " + getRange() + ",");
        if (getRegex() != null)
            sb.append("regex: " + getRegex() + ",");
        if (getSuffix() != null)
            sb.append("suffix: " + getSuffix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExact() == null) ? 0 : getExact().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        hashCode = prime * hashCode + ((getSuffix() == null) ? 0 : getSuffix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeaderMatchMethod == false)
            return false;
        HeaderMatchMethod other = (HeaderMatchMethod) obj;

        if (other.getExact() == null ^ this.getExact() == null)
            return false;
        if (other.getExact() != null && other.getExact().equals(this.getExact()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        if (other.getSuffix() == null ^ this.getSuffix() == null)
            return false;
        if (other.getSuffix() != null && other.getSuffix().equals(this.getSuffix()) == false)
            return false;
        return true;
    }
}
