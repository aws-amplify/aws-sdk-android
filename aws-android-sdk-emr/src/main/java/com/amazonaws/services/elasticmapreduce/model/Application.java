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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * With Amazon EMR release version 4.0 and later, the only accepted parameter is
 * the application name. To pass arguments to applications, you use
 * configuration classifications specified using configuration JSON objects. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html"
 * >Configuring Applications</a>.
 * </p>
 * <p>
 * With earlier Amazon EMR releases, the application is any Amazon or
 * third-party software that you can add to the cluster. This structure contains
 * a list of strings that indicates the software to use with the cluster and
 * accepts a user argument list. Amazon EMR accepts and forwards the argument
 * list to the corresponding installation script as bootstrap action argument.
 * </p>
 */
public class Application implements Serializable {
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The version of the application.
     * </p>
     */
    private String version;

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the application.
     * </p>
     */
    private java.util.List<String> args;

    /**
     * <p>
     * This option is for advanced users only. This is meta information about
     * third-party applications that third-party vendors use for testing
     * purposes.
     * </p>
     */
    private java.util.Map<String, String> additionalInfo;

    /**
     * <p>
     * The name of the application.
     * </p>
     *
     * @return <p>
     *         The name of the application.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     *
     * @param name <p>
     *            The name of the application.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Application withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     *
     * @return <p>
     *         The version of the application.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     *
     * @param version <p>
     *            The version of the application.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Application withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the application.
     * </p>
     *
     * @return <p>
     *         Arguments for Amazon EMR to pass to the application.
     *         </p>
     */
    public java.util.List<String> getArgs() {
        return args;
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the application.
     * </p>
     *
     * @param args <p>
     *            Arguments for Amazon EMR to pass to the application.
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
     * Arguments for Amazon EMR to pass to the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            Arguments for Amazon EMR to pass to the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Application withArgs(String... args) {
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
     * Arguments for Amazon EMR to pass to the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            Arguments for Amazon EMR to pass to the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Application withArgs(java.util.Collection<String> args) {
        setArgs(args);
        return this;
    }

    /**
     * <p>
     * This option is for advanced users only. This is meta information about
     * third-party applications that third-party vendors use for testing
     * purposes.
     * </p>
     *
     * @return <p>
     *         This option is for advanced users only. This is meta information
     *         about third-party applications that third-party vendors use for
     *         testing purposes.
     *         </p>
     */
    public java.util.Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>
     * This option is for advanced users only. This is meta information about
     * third-party applications that third-party vendors use for testing
     * purposes.
     * </p>
     *
     * @param additionalInfo <p>
     *            This option is for advanced users only. This is meta
     *            information about third-party applications that third-party
     *            vendors use for testing purposes.
     *            </p>
     */
    public void setAdditionalInfo(java.util.Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * This option is for advanced users only. This is meta information about
     * third-party applications that third-party vendors use for testing
     * purposes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalInfo <p>
     *            This option is for advanced users only. This is meta
     *            information about third-party applications that third-party
     *            vendors use for testing purposes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Application withAdditionalInfo(java.util.Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * <p>
     * This option is for advanced users only. This is meta information about
     * third-party applications that third-party vendors use for testing
     * purposes.
     * </p>
     * <p>
     * The method adds a new key-value pair into AdditionalInfo parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into AdditionalInfo.
     * @param value The corresponding value of the entry to be added into
     *            AdditionalInfo.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Application addAdditionalInfoEntry(String key, String value) {
        if (null == this.additionalInfo) {
            this.additionalInfo = new java.util.HashMap<String, String>();
        }
        if (this.additionalInfo.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.additionalInfo.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalInfo.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Application clearAdditionalInfoEntries() {
        this.additionalInfo = null;
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
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getArgs() != null)
            sb.append("Args: " + getArgs() + ",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: " + getAdditionalInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Application == false)
            return false;
        Application other = (Application) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null
                && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        return true;
    }
}
