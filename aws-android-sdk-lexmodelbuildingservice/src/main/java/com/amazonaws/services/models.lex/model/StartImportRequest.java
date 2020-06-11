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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a job to import a resource to Amazon Lex.
 * </p>
 */
public class StartImportRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A zip archive in binary format. The archive should contain one file, a
     * JSON file containing the resource to import. The resource should match
     * the type specified in the <code>resourceType</code> field.
     * </p>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * Specifies the type of resource to export. Each resource also exports any
     * resources that it depends on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A bot exports dependent intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * An intent exports dependent slot types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     */
    private String resourceType;

    /**
     * <p>
     * Specifies the action that the <code>StartImport</code> operation should
     * take when there is an existing resource with the same name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAIL_ON_CONFLICT - The import operation is stopped on the first conflict
     * between a resource in the import file and an existing resource. The name
     * of the resource causing the conflict is in the <code>failureReason</code>
     * field of the response to the <code>GetImport</code> operation.
     * </p>
     * <p>
     * OVERWRITE_LATEST - The import operation proceeds even if there is a
     * conflict with an existing resource. The $LASTEST version of the existing
     * resource is overwritten with the data from the import file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     */
    private String mergeStrategy;

    /**
     * <p>
     * A list of tags to add to the imported bot. You can only add tags when you
     * import a bot, you can't add tags to an intent or slot type.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A zip archive in binary format. The archive should contain one file, a
     * JSON file containing the resource to import. The resource should match
     * the type specified in the <code>resourceType</code> field.
     * </p>
     *
     * @return <p>
     *         A zip archive in binary format. The archive should contain one
     *         file, a JSON file containing the resource to import. The resource
     *         should match the type specified in the <code>resourceType</code>
     *         field.
     *         </p>
     */
    public java.nio.ByteBuffer getPayload() {
        return payload;
    }

    /**
     * <p>
     * A zip archive in binary format. The archive should contain one file, a
     * JSON file containing the resource to import. The resource should match
     * the type specified in the <code>resourceType</code> field.
     * </p>
     *
     * @param payload <p>
     *            A zip archive in binary format. The archive should contain one
     *            file, a JSON file containing the resource to import. The
     *            resource should match the type specified in the
     *            <code>resourceType</code> field.
     *            </p>
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * A zip archive in binary format. The archive should contain one file, a
     * JSON file containing the resource to import. The resource should match
     * the type specified in the <code>resourceType</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            A zip archive in binary format. The archive should contain one
     *            file, a JSON file containing the resource to import. The
     *            resource should match the type specified in the
     *            <code>resourceType</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartImportRequest withPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
        return this;
    }

    /**
     * <p>
     * Specifies the type of resource to export. Each resource also exports any
     * resources that it depends on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A bot exports dependent intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * An intent exports dependent slot types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @return <p>
     *         Specifies the type of resource to export. Each resource also
     *         exports any resources that it depends on.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A bot exports dependent intents.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An intent exports dependent slot types.
     *         </p>
     *         </li>
     *         </ul>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * Specifies the type of resource to export. Each resource also exports any
     * resources that it depends on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A bot exports dependent intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * An intent exports dependent slot types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            Specifies the type of resource to export. Each resource also
     *            exports any resources that it depends on.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A bot exports dependent intents.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An intent exports dependent slot types.
     *            </p>
     *            </li>
     *            </ul>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies the type of resource to export. Each resource also exports any
     * resources that it depends on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A bot exports dependent intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * An intent exports dependent slot types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            Specifies the type of resource to export. Each resource also
     *            exports any resources that it depends on.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A bot exports dependent intents.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An intent exports dependent slot types.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public StartImportRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * Specifies the type of resource to export. Each resource also exports any
     * resources that it depends on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A bot exports dependent intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * An intent exports dependent slot types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            Specifies the type of resource to export. Each resource also
     *            exports any resources that it depends on.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A bot exports dependent intents.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An intent exports dependent slot types.
     *            </p>
     *            </li>
     *            </ul>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * Specifies the type of resource to export. Each resource also exports any
     * resources that it depends on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A bot exports dependent intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * An intent exports dependent slot types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOT, INTENT, SLOT_TYPE
     *
     * @param resourceType <p>
     *            Specifies the type of resource to export. Each resource also
     *            exports any resources that it depends on.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A bot exports dependent intents.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An intent exports dependent slot types.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public StartImportRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the action that the <code>StartImport</code> operation should
     * take when there is an existing resource with the same name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAIL_ON_CONFLICT - The import operation is stopped on the first conflict
     * between a resource in the import file and an existing resource. The name
     * of the resource causing the conflict is in the <code>failureReason</code>
     * field of the response to the <code>GetImport</code> operation.
     * </p>
     * <p>
     * OVERWRITE_LATEST - The import operation proceeds even if there is a
     * conflict with an existing resource. The $LASTEST version of the existing
     * resource is overwritten with the data from the import file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     *
     * @return <p>
     *         Specifies the action that the <code>StartImport</code> operation
     *         should take when there is an existing resource with the same
     *         name.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         FAIL_ON_CONFLICT - The import operation is stopped on the first
     *         conflict between a resource in the import file and an existing
     *         resource. The name of the resource causing the conflict is in the
     *         <code>failureReason</code> field of the response to the
     *         <code>GetImport</code> operation.
     *         </p>
     *         <p>
     *         OVERWRITE_LATEST - The import operation proceeds even if there is
     *         a conflict with an existing resource. The $LASTEST version of the
     *         existing resource is overwritten with the data from the import
     *         file.
     *         </p>
     *         </li>
     *         </ul>
     * @see MergeStrategy
     */
    public String getMergeStrategy() {
        return mergeStrategy;
    }

    /**
     * <p>
     * Specifies the action that the <code>StartImport</code> operation should
     * take when there is an existing resource with the same name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAIL_ON_CONFLICT - The import operation is stopped on the first conflict
     * between a resource in the import file and an existing resource. The name
     * of the resource causing the conflict is in the <code>failureReason</code>
     * field of the response to the <code>GetImport</code> operation.
     * </p>
     * <p>
     * OVERWRITE_LATEST - The import operation proceeds even if there is a
     * conflict with an existing resource. The $LASTEST version of the existing
     * resource is overwritten with the data from the import file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     *
     * @param mergeStrategy <p>
     *            Specifies the action that the <code>StartImport</code>
     *            operation should take when there is an existing resource with
     *            the same name.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            FAIL_ON_CONFLICT - The import operation is stopped on the
     *            first conflict between a resource in the import file and an
     *            existing resource. The name of the resource causing the
     *            conflict is in the <code>failureReason</code> field of the
     *            response to the <code>GetImport</code> operation.
     *            </p>
     *            <p>
     *            OVERWRITE_LATEST - The import operation proceeds even if there
     *            is a conflict with an existing resource. The $LASTEST version
     *            of the existing resource is overwritten with the data from the
     *            import file.
     *            </p>
     *            </li>
     *            </ul>
     * @see MergeStrategy
     */
    public void setMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    /**
     * <p>
     * Specifies the action that the <code>StartImport</code> operation should
     * take when there is an existing resource with the same name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAIL_ON_CONFLICT - The import operation is stopped on the first conflict
     * between a resource in the import file and an existing resource. The name
     * of the resource causing the conflict is in the <code>failureReason</code>
     * field of the response to the <code>GetImport</code> operation.
     * </p>
     * <p>
     * OVERWRITE_LATEST - The import operation proceeds even if there is a
     * conflict with an existing resource. The $LASTEST version of the existing
     * resource is overwritten with the data from the import file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     *
     * @param mergeStrategy <p>
     *            Specifies the action that the <code>StartImport</code>
     *            operation should take when there is an existing resource with
     *            the same name.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            FAIL_ON_CONFLICT - The import operation is stopped on the
     *            first conflict between a resource in the import file and an
     *            existing resource. The name of the resource causing the
     *            conflict is in the <code>failureReason</code> field of the
     *            response to the <code>GetImport</code> operation.
     *            </p>
     *            <p>
     *            OVERWRITE_LATEST - The import operation proceeds even if there
     *            is a conflict with an existing resource. The $LASTEST version
     *            of the existing resource is overwritten with the data from the
     *            import file.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MergeStrategy
     */
    public StartImportRequest withMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
        return this;
    }

    /**
     * <p>
     * Specifies the action that the <code>StartImport</code> operation should
     * take when there is an existing resource with the same name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAIL_ON_CONFLICT - The import operation is stopped on the first conflict
     * between a resource in the import file and an existing resource. The name
     * of the resource causing the conflict is in the <code>failureReason</code>
     * field of the response to the <code>GetImport</code> operation.
     * </p>
     * <p>
     * OVERWRITE_LATEST - The import operation proceeds even if there is a
     * conflict with an existing resource. The $LASTEST version of the existing
     * resource is overwritten with the data from the import file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     *
     * @param mergeStrategy <p>
     *            Specifies the action that the <code>StartImport</code>
     *            operation should take when there is an existing resource with
     *            the same name.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            FAIL_ON_CONFLICT - The import operation is stopped on the
     *            first conflict between a resource in the import file and an
     *            existing resource. The name of the resource causing the
     *            conflict is in the <code>failureReason</code> field of the
     *            response to the <code>GetImport</code> operation.
     *            </p>
     *            <p>
     *            OVERWRITE_LATEST - The import operation proceeds even if there
     *            is a conflict with an existing resource. The $LASTEST version
     *            of the existing resource is overwritten with the data from the
     *            import file.
     *            </p>
     *            </li>
     *            </ul>
     * @see MergeStrategy
     */
    public void setMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
    }

    /**
     * <p>
     * Specifies the action that the <code>StartImport</code> operation should
     * take when there is an existing resource with the same name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAIL_ON_CONFLICT - The import operation is stopped on the first conflict
     * between a resource in the import file and an existing resource. The name
     * of the resource causing the conflict is in the <code>failureReason</code>
     * field of the response to the <code>GetImport</code> operation.
     * </p>
     * <p>
     * OVERWRITE_LATEST - The import operation proceeds even if there is a
     * conflict with an existing resource. The $LASTEST version of the existing
     * resource is overwritten with the data from the import file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE_LATEST, FAIL_ON_CONFLICT
     *
     * @param mergeStrategy <p>
     *            Specifies the action that the <code>StartImport</code>
     *            operation should take when there is an existing resource with
     *            the same name.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            FAIL_ON_CONFLICT - The import operation is stopped on the
     *            first conflict between a resource in the import file and an
     *            existing resource. The name of the resource causing the
     *            conflict is in the <code>failureReason</code> field of the
     *            response to the <code>GetImport</code> operation.
     *            </p>
     *            <p>
     *            OVERWRITE_LATEST - The import operation proceeds even if there
     *            is a conflict with an existing resource. The $LASTEST version
     *            of the existing resource is overwritten with the data from the
     *            import file.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MergeStrategy
     */
    public StartImportRequest withMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the imported bot. You can only add tags when you
     * import a bot, you can't add tags to an intent or slot type.
     * </p>
     *
     * @return <p>
     *         A list of tags to add to the imported bot. You can only add tags
     *         when you import a bot, you can't add tags to an intent or slot
     *         type.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to add to the imported bot. You can only add tags when you
     * import a bot, you can't add tags to an intent or slot type.
     * </p>
     *
     * @param tags <p>
     *            A list of tags to add to the imported bot. You can only add
     *            tags when you import a bot, you can't add tags to an intent or
     *            slot type.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to add to the imported bot. You can only add tags when you
     * import a bot, you can't add tags to an intent or slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to add to the imported bot. You can only add
     *            tags when you import a bot, you can't add tags to an intent or
     *            slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartImportRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the imported bot. You can only add tags when you
     * import a bot, you can't add tags to an intent or slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to add to the imported bot. You can only add
     *            tags when you import a bot, you can't add tags to an intent or
     *            slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartImportRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPayload() != null)
            sb.append("payload: " + getPayload() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getMergeStrategy() != null)
            sb.append("mergeStrategy: " + getMergeStrategy() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getMergeStrategy() == null) ? 0 : getMergeStrategy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportRequest == false)
            return false;
        StartImportRequest other = (StartImportRequest) obj;

        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getMergeStrategy() == null ^ this.getMergeStrategy() == null)
            return false;
        if (other.getMergeStrategy() != null
                && other.getMergeStrategy().equals(this.getMergeStrategy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
