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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration of the script to run during a bootstrap action.
 * </p>
 */
public class ScriptBootstrapActionConfig implements Serializable {
    /**
     * <p>
     * Location of the script to run during a bootstrap action. Can be either a
     * location in Amazon S3 or on a local file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String path;

    /**
     * <p>
     * A list of command line arguments to pass to the bootstrap action script.
     * </p>
     */
    private java.util.List<String> args;

    /**
     * <p>
     * Location of the script to run during a bootstrap action. Can be either a
     * location in Amazon S3 or on a local file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Location of the script to run during a bootstrap action. Can be
     *         either a location in Amazon S3 or on a local file system.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * Location of the script to run during a bootstrap action. Can be either a
     * location in Amazon S3 or on a local file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param path <p>
     *            Location of the script to run during a bootstrap action. Can
     *            be either a location in Amazon S3 or on a local file system.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Location of the script to run during a bootstrap action. Can be either a
     * location in Amazon S3 or on a local file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param path <p>
     *            Location of the script to run during a bootstrap action. Can
     *            be either a location in Amazon S3 or on a local file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScriptBootstrapActionConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * A list of command line arguments to pass to the bootstrap action script.
     * </p>
     *
     * @return <p>
     *         A list of command line arguments to pass to the bootstrap action
     *         script.
     *         </p>
     */
    public java.util.List<String> getArgs() {
        return args;
    }

    /**
     * <p>
     * A list of command line arguments to pass to the bootstrap action script.
     * </p>
     *
     * @param args <p>
     *            A list of command line arguments to pass to the bootstrap
     *            action script.
     *            </p>
     */
    public void setArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
            return;
        }

        this.args = new java.util.ArrayList<String>(args);
    }

    /**
     * <p>
     * A list of command line arguments to pass to the bootstrap action script.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            A list of command line arguments to pass to the bootstrap
     *            action script.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScriptBootstrapActionConfig withArgs(String... args) {
        if (getArgs() == null) {
            this.args = new java.util.ArrayList<String>(args.length);
        }
        for (String value : args) {
            this.args.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of command line arguments to pass to the bootstrap action script.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            A list of command line arguments to pass to the bootstrap
     *            action script.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScriptBootstrapActionConfig withArgs(java.util.Collection<String> args) {
        setArgs(args);
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
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getArgs() != null)
            sb.append("Args: " + getArgs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScriptBootstrapActionConfig == false)
            return false;
        ScriptBootstrapActionConfig other = (ScriptBootstrapActionConfig) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        return true;
    }
}
