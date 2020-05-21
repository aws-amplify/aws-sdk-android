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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Container for the objects to delete.
 * </p>
 */
public class Delete implements Serializable {
    /**
     * <p>
     * The objects to delete.
     * </p>
     */
    private java.util.List<ObjectIdentifier> objects;

    /**
     * <p>
     * Element to enable quiet mode for the request. When you add this element,
     * you must set its value to true.
     * </p>
     */
    private Boolean quiet;

    /**
     * <p>
     * The objects to delete.
     * </p>
     *
     * @return <p>
     *         The objects to delete.
     *         </p>
     */
    public java.util.List<ObjectIdentifier> getObjects() {
        return objects;
    }

    /**
     * <p>
     * The objects to delete.
     * </p>
     *
     * @param objects <p>
     *            The objects to delete.
     *            </p>
     */
    public void setObjects(java.util.Collection<ObjectIdentifier> objects) {
        if (objects == null) {
            this.objects = null;
            return;
        }

        this.objects = new java.util.ArrayList<ObjectIdentifier>(objects);
    }

    /**
     * <p>
     * The objects to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objects <p>
     *            The objects to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Delete withObjects(ObjectIdentifier... objects) {
        if (getObjects() == null) {
            this.objects = new java.util.ArrayList<ObjectIdentifier>(objects.length);
        }
        for (ObjectIdentifier value : objects) {
            this.objects.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The objects to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objects <p>
     *            The objects to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Delete withObjects(java.util.Collection<ObjectIdentifier> objects) {
        setObjects(objects);
        return this;
    }

    /**
     * <p>
     * Element to enable quiet mode for the request. When you add this element,
     * you must set its value to true.
     * </p>
     *
     * @return <p>
     *         Element to enable quiet mode for the request. When you add this
     *         element, you must set its value to true.
     *         </p>
     */
    public Boolean isQuiet() {
        return quiet;
    }

    /**
     * <p>
     * Element to enable quiet mode for the request. When you add this element,
     * you must set its value to true.
     * </p>
     *
     * @return <p>
     *         Element to enable quiet mode for the request. When you add this
     *         element, you must set its value to true.
     *         </p>
     */
    public Boolean getQuiet() {
        return quiet;
    }

    /**
     * <p>
     * Element to enable quiet mode for the request. When you add this element,
     * you must set its value to true.
     * </p>
     *
     * @param quiet <p>
     *            Element to enable quiet mode for the request. When you add
     *            this element, you must set its value to true.
     *            </p>
     */
    public void setQuiet(Boolean quiet) {
        this.quiet = quiet;
    }

    /**
     * <p>
     * Element to enable quiet mode for the request. When you add this element,
     * you must set its value to true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quiet <p>
     *            Element to enable quiet mode for the request. When you add
     *            this element, you must set its value to true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Delete withQuiet(Boolean quiet) {
        this.quiet = quiet;
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
        if (getObjects() != null)
            sb.append("Objects: " + getObjects() + ",");
        if (getQuiet() != null)
            sb.append("Quiet: " + getQuiet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjects() == null) ? 0 : getObjects().hashCode());
        hashCode = prime * hashCode + ((getQuiet() == null) ? 0 : getQuiet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Delete == false)
            return false;
        Delete other = (Delete) obj;

        if (other.getObjects() == null ^ this.getObjects() == null)
            return false;
        if (other.getObjects() != null && other.getObjects().equals(this.getObjects()) == false)
            return false;
        if (other.getQuiet() == null ^ this.getQuiet() == null)
            return false;
        if (other.getQuiet() != null && other.getQuiet().equals(this.getQuiet()) == false)
            return false;
        return true;
    }
}
