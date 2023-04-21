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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Structure containing details about the detected label, including the name,
 * detected instances, parent labels, and level of confidence.
 * </p>
 * <p>
 * </p>
 */
public class Label implements Serializable {
    /**
     * <p>
     * The name (label) of the object or scene.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Level of confidence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float confidence;

    /**
     * <p>
     * If <code>Label</code> represents an object, <code>Instances</code>
     * contains the bounding boxes for each instance of the detected object.
     * Bounding boxes are returned for common object labels such as people,
     * cars, furniture, apparel or pets.
     * </p>
     */
    private java.util.List<Instance> instances;

    /**
     * <p>
     * The parent labels for a label. The response includes all ancestor labels.
     * </p>
     */
    private java.util.List<Parent> parents;

    /**
     * <p>
     * A list of potential aliases for a given label.
     * </p>
     */
    private java.util.List<LabelAlias> aliases;

    /**
     * <p>
     * A list of the categories associated with a given label.
     * </p>
     */
    private java.util.List<LabelCategory> categories;

    /**
     * <p>
     * The name (label) of the object or scene.
     * </p>
     *
     * @return <p>
     *         The name (label) of the object or scene.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name (label) of the object or scene.
     * </p>
     *
     * @param name <p>
     *            The name (label) of the object or scene.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name (label) of the object or scene.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name (label) of the object or scene.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Label withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Level of confidence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         Level of confidence.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Level of confidence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            Level of confidence.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Level of confidence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            Level of confidence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Label withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * If <code>Label</code> represents an object, <code>Instances</code>
     * contains the bounding boxes for each instance of the detected object.
     * Bounding boxes are returned for common object labels such as people,
     * cars, furniture, apparel or pets.
     * </p>
     *
     * @return <p>
     *         If <code>Label</code> represents an object,
     *         <code>Instances</code> contains the bounding boxes for each
     *         instance of the detected object. Bounding boxes are returned for
     *         common object labels such as people, cars, furniture, apparel or
     *         pets.
     *         </p>
     */
    public java.util.List<Instance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * If <code>Label</code> represents an object, <code>Instances</code>
     * contains the bounding boxes for each instance of the detected object.
     * Bounding boxes are returned for common object labels such as people,
     * cars, furniture, apparel or pets.
     * </p>
     *
     * @param instances <p>
     *            If <code>Label</code> represents an object,
     *            <code>Instances</code> contains the bounding boxes for each
     *            instance of the detected object. Bounding boxes are returned
     *            for common object labels such as people, cars, furniture,
     *            apparel or pets.
     *            </p>
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<Instance>(instances);
    }

    /**
     * <p>
     * If <code>Label</code> represents an object, <code>Instances</code>
     * contains the bounding boxes for each instance of the detected object.
     * Bounding boxes are returned for common object labels such as people,
     * cars, furniture, apparel or pets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            If <code>Label</code> represents an object,
     *            <code>Instances</code> contains the bounding boxes for each
     *            instance of the detected object. Bounding boxes are returned
     *            for common object labels such as people, cars, furniture,
     *            apparel or pets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Label withInstances(Instance... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<Instance>(instances.length);
        }
        for (Instance value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If <code>Label</code> represents an object, <code>Instances</code>
     * contains the bounding boxes for each instance of the detected object.
     * Bounding boxes are returned for common object labels such as people,
     * cars, furniture, apparel or pets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            If <code>Label</code> represents an object,
     *            <code>Instances</code> contains the bounding boxes for each
     *            instance of the detected object. Bounding boxes are returned
     *            for common object labels such as people, cars, furniture,
     *            apparel or pets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Label withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The parent labels for a label. The response includes all ancestor labels.
     * </p>
     *
     * @return <p>
     *         The parent labels for a label. The response includes all ancestor
     *         labels.
     *         </p>
     */
    public java.util.List<Parent> getParents() {
        return parents;
    }

    /**
     * <p>
     * The parent labels for a label. The response includes all ancestor labels.
     * </p>
     *
     * @param parents <p>
     *            The parent labels for a label. The response includes all
     *            ancestor labels.
     *            </p>
     */
    public void setParents(java.util.Collection<Parent> parents) {
        if (parents == null) {
            this.parents = null;
            return;
        }

        this.parents = new java.util.ArrayList<Parent>(parents);
    }

    /**
     * <p>
     * The parent labels for a label. The response includes all ancestor labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parents <p>
     *            The parent labels for a label. The response includes all
     *            ancestor labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Label withParents(Parent... parents) {
        if (getParents() == null) {
            this.parents = new java.util.ArrayList<Parent>(parents.length);
        }
        for (Parent value : parents) {
            this.parents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The parent labels for a label. The response includes all ancestor labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parents <p>
     *            The parent labels for a label. The response includes all
     *            ancestor labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Label withParents(java.util.Collection<Parent> parents) {
        setParents(parents);
        return this;
    }

    /**
     * <p>
     * A list of potential aliases for a given label.
     * </p>
     *
     * @return <p>
     *         A list of potential aliases for a given label.
     *         </p>
     */
    public java.util.List<LabelAlias> getAliases() {
        return aliases;
    }

    /**
     * <p>
     * A list of potential aliases for a given label.
     * </p>
     *
     * @param aliases <p>
     *            A list of potential aliases for a given label.
     *            </p>
     */
    public void setAliases(java.util.Collection<LabelAlias> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }

        this.aliases = new java.util.ArrayList<LabelAlias>(aliases);
    }

    /**
     * <p>
     * A list of potential aliases for a given label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aliases <p>
     *            A list of potential aliases for a given label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Label withAliases(LabelAlias... aliases) {
        if (getAliases() == null) {
            this.aliases = new java.util.ArrayList<LabelAlias>(aliases.length);
        }
        for (LabelAlias value : aliases) {
            this.aliases.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of potential aliases for a given label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aliases <p>
     *            A list of potential aliases for a given label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Label withAliases(java.util.Collection<LabelAlias> aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * <p>
     * A list of the categories associated with a given label.
     * </p>
     *
     * @return <p>
     *         A list of the categories associated with a given label.
     *         </p>
     */
    public java.util.List<LabelCategory> getCategories() {
        return categories;
    }

    /**
     * <p>
     * A list of the categories associated with a given label.
     * </p>
     *
     * @param categories <p>
     *            A list of the categories associated with a given label.
     *            </p>
     */
    public void setCategories(java.util.Collection<LabelCategory> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new java.util.ArrayList<LabelCategory>(categories);
    }

    /**
     * <p>
     * A list of the categories associated with a given label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categories <p>
     *            A list of the categories associated with a given label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Label withCategories(LabelCategory... categories) {
        if (getCategories() == null) {
            this.categories = new java.util.ArrayList<LabelCategory>(categories.length);
        }
        for (LabelCategory value : categories) {
            this.categories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the categories associated with a given label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categories <p>
     *            A list of the categories associated with a given label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Label withCategories(java.util.Collection<LabelCategory> categories) {
        setCategories(categories);
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
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getParents() != null)
            sb.append("Parents: " + getParents() + ",");
        if (getAliases() != null)
            sb.append("Aliases: " + getAliases() + ",");
        if (getCategories() != null)
            sb.append("Categories: " + getCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getParents() == null) ? 0 : getParents().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Label == false)
            return false;
        Label other = (Label) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getParents() == null ^ this.getParents() == null)
            return false;
        if (other.getParents() != null && other.getParents().equals(this.getParents()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null
                && other.getCategories().equals(this.getCategories()) == false)
            return false;
        return true;
    }
}
