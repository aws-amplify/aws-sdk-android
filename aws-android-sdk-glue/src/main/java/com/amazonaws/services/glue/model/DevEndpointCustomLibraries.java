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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Custom libraries to be loaded into a development endpoint.
 * </p>
 */
public class DevEndpointCustomLibraries implements Serializable {
    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon Simple Storage
     * Service (Amazon S3) bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths
     * separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>.
     * Libraries that rely on C extensions, such as the <a
     * href="http://pandas.pydata.org/">pandas</a> Python data analysis library,
     * are not currently supported.
     * </p>
     * </note>
     */
    private String extraPythonLibsS3Path;

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a
     * <code>DevEndpoint</code>.
     * </p>
     * </note>
     */
    private String extraJarsS3Path;

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon Simple Storage
     * Service (Amazon S3) bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths
     * separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>.
     * Libraries that rely on C extensions, such as the <a
     * href="http://pandas.pydata.org/">pandas</a> Python data analysis library,
     * are not currently supported.
     * </p>
     * </note>
     *
     * @return <p>
     *         The paths to one or more Python libraries in an Amazon Simple
     *         Storage Service (Amazon S3) bucket that should be loaded in your
     *         <code>DevEndpoint</code>. Multiple values must be complete paths
     *         separated by a comma.
     *         </p>
     *         <note>
     *         <p>
     *         You can only use pure Python libraries with a
     *         <code>DevEndpoint</code>. Libraries that rely on C extensions,
     *         such as the <a href="http://pandas.pydata.org/">pandas</a> Python
     *         data analysis library, are not currently supported.
     *         </p>
     *         </note>
     */
    public String getExtraPythonLibsS3Path() {
        return extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon Simple Storage
     * Service (Amazon S3) bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths
     * separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>.
     * Libraries that rely on C extensions, such as the <a
     * href="http://pandas.pydata.org/">pandas</a> Python data analysis library,
     * are not currently supported.
     * </p>
     * </note>
     *
     * @param extraPythonLibsS3Path <p>
     *            The paths to one or more Python libraries in an Amazon Simple
     *            Storage Service (Amazon S3) bucket that should be loaded in
     *            your <code>DevEndpoint</code>. Multiple values must be
     *            complete paths separated by a comma.
     *            </p>
     *            <note>
     *            <p>
     *            You can only use pure Python libraries with a
     *            <code>DevEndpoint</code>. Libraries that rely on C extensions,
     *            such as the <a href="http://pandas.pydata.org/">pandas</a>
     *            Python data analysis library, are not currently supported.
     *            </p>
     *            </note>
     */
    public void setExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon Simple Storage
     * Service (Amazon S3) bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths
     * separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>.
     * Libraries that rely on C extensions, such as the <a
     * href="http://pandas.pydata.org/">pandas</a> Python data analysis library,
     * are not currently supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extraPythonLibsS3Path <p>
     *            The paths to one or more Python libraries in an Amazon Simple
     *            Storage Service (Amazon S3) bucket that should be loaded in
     *            your <code>DevEndpoint</code>. Multiple values must be
     *            complete paths separated by a comma.
     *            </p>
     *            <note>
     *            <p>
     *            You can only use pure Python libraries with a
     *            <code>DevEndpoint</code>. Libraries that rely on C extensions,
     *            such as the <a href="http://pandas.pydata.org/">pandas</a>
     *            Python data analysis library, are not currently supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpointCustomLibraries withExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
        return this;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a
     * <code>DevEndpoint</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The path to one or more Java <code>.jar</code> files in an S3
     *         bucket that should be loaded in your <code>DevEndpoint</code>.
     *         </p>
     *         <note>
     *         <p>
     *         You can only use pure Java/Scala libraries with a
     *         <code>DevEndpoint</code>.
     *         </p>
     *         </note>
     */
    public String getExtraJarsS3Path() {
        return extraJarsS3Path;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a
     * <code>DevEndpoint</code>.
     * </p>
     * </note>
     *
     * @param extraJarsS3Path <p>
     *            The path to one or more Java <code>.jar</code> files in an S3
     *            bucket that should be loaded in your <code>DevEndpoint</code>.
     *            </p>
     *            <note>
     *            <p>
     *            You can only use pure Java/Scala libraries with a
     *            <code>DevEndpoint</code>.
     *            </p>
     *            </note>
     */
    public void setExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that
     * should be loaded in your <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a
     * <code>DevEndpoint</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extraJarsS3Path <p>
     *            The path to one or more Java <code>.jar</code> files in an S3
     *            bucket that should be loaded in your <code>DevEndpoint</code>.
     *            </p>
     *            <note>
     *            <p>
     *            You can only use pure Java/Scala libraries with a
     *            <code>DevEndpoint</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DevEndpointCustomLibraries withExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
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
        if (getExtraPythonLibsS3Path() != null)
            sb.append("ExtraPythonLibsS3Path: " + getExtraPythonLibsS3Path() + ",");
        if (getExtraJarsS3Path() != null)
            sb.append("ExtraJarsS3Path: " + getExtraJarsS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getExtraPythonLibsS3Path() == null) ? 0 : getExtraPythonLibsS3Path().hashCode());
        hashCode = prime * hashCode
                + ((getExtraJarsS3Path() == null) ? 0 : getExtraJarsS3Path().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DevEndpointCustomLibraries == false)
            return false;
        DevEndpointCustomLibraries other = (DevEndpointCustomLibraries) obj;

        if (other.getExtraPythonLibsS3Path() == null ^ this.getExtraPythonLibsS3Path() == null)
            return false;
        if (other.getExtraPythonLibsS3Path() != null
                && other.getExtraPythonLibsS3Path().equals(this.getExtraPythonLibsS3Path()) == false)
            return false;
        if (other.getExtraJarsS3Path() == null ^ this.getExtraJarsS3Path() == null)
            return false;
        if (other.getExtraJarsS3Path() != null
                && other.getExtraJarsS3Path().equals(this.getExtraJarsS3Path()) == false)
            return false;
        return true;
    }
}
