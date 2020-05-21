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
 * A set of Docker images that are related by programming language and are
 * managed by AWS CodeBuild.
 * </p>
 */
public class EnvironmentLanguage implements Serializable {
    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JAVA, PYTHON, NODE_JS, RUBY, GOLANG, DOCKER,
     * ANDROID, DOTNET, BASE, PHP
     */
    private String language;

    /**
     * <p>
     * The list of Docker images that are related by the specified programming
     * language.
     * </p>
     */
    private java.util.List<EnvironmentImage> images;

    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JAVA, PYTHON, NODE_JS, RUBY, GOLANG, DOCKER,
     * ANDROID, DOTNET, BASE, PHP
     *
     * @return <p>
     *         The programming language for the Docker images.
     *         </p>
     * @see LanguageType
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JAVA, PYTHON, NODE_JS, RUBY, GOLANG, DOCKER,
     * ANDROID, DOTNET, BASE, PHP
     *
     * @param language <p>
     *            The programming language for the Docker images.
     *            </p>
     * @see LanguageType
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JAVA, PYTHON, NODE_JS, RUBY, GOLANG, DOCKER,
     * ANDROID, DOTNET, BASE, PHP
     *
     * @param language <p>
     *            The programming language for the Docker images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageType
     */
    public EnvironmentLanguage withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JAVA, PYTHON, NODE_JS, RUBY, GOLANG, DOCKER,
     * ANDROID, DOTNET, BASE, PHP
     *
     * @param language <p>
     *            The programming language for the Docker images.
     *            </p>
     * @see LanguageType
     */
    public void setLanguage(LanguageType language) {
        this.language = language.toString();
    }

    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JAVA, PYTHON, NODE_JS, RUBY, GOLANG, DOCKER,
     * ANDROID, DOTNET, BASE, PHP
     *
     * @param language <p>
     *            The programming language for the Docker images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageType
     */
    public EnvironmentLanguage withLanguage(LanguageType language) {
        this.language = language.toString();
        return this;
    }

    /**
     * <p>
     * The list of Docker images that are related by the specified programming
     * language.
     * </p>
     *
     * @return <p>
     *         The list of Docker images that are related by the specified
     *         programming language.
     *         </p>
     */
    public java.util.List<EnvironmentImage> getImages() {
        return images;
    }

    /**
     * <p>
     * The list of Docker images that are related by the specified programming
     * language.
     * </p>
     *
     * @param images <p>
     *            The list of Docker images that are related by the specified
     *            programming language.
     *            </p>
     */
    public void setImages(java.util.Collection<EnvironmentImage> images) {
        if (images == null) {
            this.images = null;
            return;
        }

        this.images = new java.util.ArrayList<EnvironmentImage>(images);
    }

    /**
     * <p>
     * The list of Docker images that are related by the specified programming
     * language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param images <p>
     *            The list of Docker images that are related by the specified
     *            programming language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentLanguage withImages(EnvironmentImage... images) {
        if (getImages() == null) {
            this.images = new java.util.ArrayList<EnvironmentImage>(images.length);
        }
        for (EnvironmentImage value : images) {
            this.images.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of Docker images that are related by the specified programming
     * language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param images <p>
     *            The list of Docker images that are related by the specified
     *            programming language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentLanguage withImages(java.util.Collection<EnvironmentImage> images) {
        setImages(images);
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
        if (getLanguage() != null)
            sb.append("language: " + getLanguage() + ",");
        if (getImages() != null)
            sb.append("images: " + getImages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getImages() == null) ? 0 : getImages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentLanguage == false)
            return false;
        EnvironmentLanguage other = (EnvironmentLanguage) obj;

        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getImages() == null ^ this.getImages() == null)
            return false;
        if (other.getImages() != null && other.getImages().equals(this.getImages()) == false)
            return false;
        return true;
    }
}
