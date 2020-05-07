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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an exported environment variable.
 * </p>
 */
public class ExportedEnvironmentVariable implements Serializable {
    /**
     * <p>
     * The name of this exported environment variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String name;

    /**
     * <p>
     * The value assigned to this exported environment variable.
     * </p>
     * <note>
     * <p>
     * During a build, the value of a variable is available starting with the
     * <code>install</code> phase. It can be updated between the start of the
     * <code>install</code> phase and the end of the <code>post_build</code>
     * phase. After the <code>post_build</code> phase ends, the value of
     * exported variables cannot change.
     * </p>
     * </note>
     */
    private String value;

    /**
     * <p>
     * The name of this exported environment variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of this exported environment variable.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of this exported environment variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name of this exported environment variable.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this exported environment variable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name of this exported environment variable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportedEnvironmentVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The value assigned to this exported environment variable.
     * </p>
     * <note>
     * <p>
     * During a build, the value of a variable is available starting with the
     * <code>install</code> phase. It can be updated between the start of the
     * <code>install</code> phase and the end of the <code>post_build</code>
     * phase. After the <code>post_build</code> phase ends, the value of
     * exported variables cannot change.
     * </p>
     * </note>
     *
     * @return <p>
     *         The value assigned to this exported environment variable.
     *         </p>
     *         <note>
     *         <p>
     *         During a build, the value of a variable is available starting
     *         with the <code>install</code> phase. It can be updated between
     *         the start of the <code>install</code> phase and the end of the
     *         <code>post_build</code> phase. After the <code>post_build</code>
     *         phase ends, the value of exported variables cannot change.
     *         </p>
     *         </note>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value assigned to this exported environment variable.
     * </p>
     * <note>
     * <p>
     * During a build, the value of a variable is available starting with the
     * <code>install</code> phase. It can be updated between the start of the
     * <code>install</code> phase and the end of the <code>post_build</code>
     * phase. After the <code>post_build</code> phase ends, the value of
     * exported variables cannot change.
     * </p>
     * </note>
     *
     * @param value <p>
     *            The value assigned to this exported environment variable.
     *            </p>
     *            <note>
     *            <p>
     *            During a build, the value of a variable is available starting
     *            with the <code>install</code> phase. It can be updated between
     *            the start of the <code>install</code> phase and the end of the
     *            <code>post_build</code> phase. After the
     *            <code>post_build</code> phase ends, the value of exported
     *            variables cannot change.
     *            </p>
     *            </note>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value assigned to this exported environment variable.
     * </p>
     * <note>
     * <p>
     * During a build, the value of a variable is available starting with the
     * <code>install</code> phase. It can be updated between the start of the
     * <code>install</code> phase and the end of the <code>post_build</code>
     * phase. After the <code>post_build</code> phase ends, the value of
     * exported variables cannot change.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value assigned to this exported environment variable.
     *            </p>
     *            <note>
     *            <p>
     *            During a build, the value of a variable is available starting
     *            with the <code>install</code> phase. It can be updated between
     *            the start of the <code>install</code> phase and the end of the
     *            <code>post_build</code> phase. After the
     *            <code>post_build</code> phase ends, the value of exported
     *            variables cannot change.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportedEnvironmentVariable withValue(String value) {
        this.value = value;
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
            sb.append("name: " + getName() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportedEnvironmentVariable == false)
            return false;
        ExportedEnvironmentVariable other = (ExportedEnvironmentVariable) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
