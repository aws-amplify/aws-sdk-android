/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.internal;

import static org.junit.Assert.assertSame;

import com.amazonaws.services.s3.model.DeleteObjectsResult.DeletedObject;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DeleteObjectsResponseTest {

    @Test
    public void testDeleteObjectsResponse() {
        DeleteObjectsResponse dor = new DeleteObjectsResponse();
        List<DeletedObject> objects = new ArrayList<DeletedObject>();
        List<MultiObjectDeleteException.DeleteError> errors = new ArrayList<MultiObjectDeleteException.DeleteError>();
        dor.setErrors(errors);
        dor.setDeletedObjects(objects);

        assertSame(dor.getDeletedObjects(), objects);
        assertSame(dor.getErrors(), errors);
    }

}
