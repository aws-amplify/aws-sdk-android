/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model.lifecycle;

import com.amazonaws.services.s3.model.Tag;

/**
 * A {@link LifecycleFilterPredicate} class to represent the {@link Tag} object
 * that must exist in the object's tag set in order for the
 * {@link com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule} to apply.
 */
public final class LifecycleTagPredicate extends LifecycleFilterPredicate {

    private final Tag tag;

    /**
     * Constructor.
     * @param tag the tag.
     */
    public LifecycleTagPredicate(Tag tag) {
        this.tag = tag;
    }

    public Tag getTag() {
        return tag;
    }

    @Override
    public void accept(LifecyclePredicateVisitor lifecyclePredicateVisitor) {
        lifecyclePredicateVisitor.visit(this);
    }
}
