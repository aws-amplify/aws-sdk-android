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

package com.amazonaws.services.s3.model;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import java.security.KeyPair;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StaticEncryptionMaterialsProviderTest {
    @Test
    public void nullMaterialDesc() {
        EncryptionMaterials m = new EncryptionMaterials((KeyPair) null);
        EncryptionMaterials m2 = new StaticEncryptionMaterialsProvider(m)
                .getEncryptionMaterials(null);
        assertSame(m, m2);
    }

    @Test
    public void emptyMaterialDesc() {
        EncryptionMaterials m = new EncryptionMaterials((KeyPair) null);
        Map<String, String> empty = Collections.emptyMap();
        EncryptionMaterials m2 = new StaticEncryptionMaterialsProvider(m)
                .getEncryptionMaterials(empty);
        assertSame(m, m2);
    }

    @Test
    public void nonEmptyClientMaterialDesc() {
        final Map<String, String> map = new HashMap<String, String>();
        map.put("Foo", "Bar");
        EncryptionMaterials m = new EncryptionMaterials((KeyPair) null) {
            @Override
            public java.util.Map<String, String> getMaterialsDescription() {
                return map;
            };
        };
        Map<String, String> empty = Collections.emptyMap();
        StaticEncryptionMaterialsProvider p = new StaticEncryptionMaterialsProvider(m);
        assertNull(p.getEncryptionMaterials(empty));
        assertNull(p.getEncryptionMaterials(null));
        EncryptionMaterials m2 = p.getEncryptionMaterials(map);
        assertSame(m, m2);
    }

    @Test
    public void materialAccessor() {
        final EncryptionMaterials m4null = new EncryptionMaterials((KeyPair) null);
        EncryptionMaterials m = new EncryptionMaterials((KeyPair) null) {
            @Override
            public EncryptionMaterialsAccessor getAccessor() {
                return new EncryptionMaterialsAccessor() {
                    @Override
                    public EncryptionMaterials getEncryptionMaterials(
                            Map<String, String> materialsDescription) {
                        return materialsDescription == null ? m4null : null;
                    }
                };
            }
        };
        Map<String, String> empty = Collections.emptyMap();
        StaticEncryptionMaterialsProvider p = new StaticEncryptionMaterialsProvider(m);
        assertSame(m, p.getEncryptionMaterials(empty));
        assertSame(m4null, p.getEncryptionMaterials(null));
        final Map<String, String> map = new HashMap<String, String>();
        map.put("Foo", "Bar");
        assertNull(p.getEncryptionMaterials(map));
    }
}
