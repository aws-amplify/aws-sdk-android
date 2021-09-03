/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Voice Id
 */
public enum VoiceId {

    Aditi("Aditi"),
    Amy("Amy"),
    Astrid("Astrid"),
    Bianca("Bianca"),
    Brian("Brian"),
    Camila("Camila"),
    Carla("Carla"),
    Carmen("Carmen"),
    Celine("Celine"),
    Chantal("Chantal"),
    Conchita("Conchita"),
    Cristiano("Cristiano"),
    Dora("Dora"),
    Emma("Emma"),
    Enrique("Enrique"),
    Ewa("Ewa"),
    Filiz("Filiz"),
    Gabrielle("Gabrielle"),
    Geraint("Geraint"),
    Giorgio("Giorgio"),
    Gwyneth("Gwyneth"),
    Hans("Hans"),
    Ines("Ines"),
    Ivy("Ivy"),
    Jacek("Jacek"),
    Jan("Jan"),
    Joanna("Joanna"),
    Joey("Joey"),
    Justin("Justin"),
    Karl("Karl"),
    Kendra("Kendra"),
    Kevin("Kevin"),
    Kimberly("Kimberly"),
    Lea("Lea"),
    Liv("Liv"),
    Lotte("Lotte"),
    Lucia("Lucia"),
    Lupe("Lupe"),
    Mads("Mads"),
    Maja("Maja"),
    Marlene("Marlene"),
    Mathieu("Mathieu"),
    Matthew("Matthew"),
    Maxim("Maxim"),
    Mia("Mia"),
    Miguel("Miguel"),
    Mizuki("Mizuki"),
    Naja("Naja"),
    Nicole("Nicole"),
    Olivia("Olivia"),
    Penelope("Penelope"),
    Raveena("Raveena"),
    Ricardo("Ricardo"),
    Ruben("Ruben"),
    Russell("Russell"),
    Salli("Salli"),
    Seoyeon("Seoyeon"),
    Takumi("Takumi"),
    Tatyana("Tatyana"),
    Vicki("Vicki"),
    Vitoria("Vitoria"),
    Zeina("Zeina"),
    Zhiyu("Zhiyu"),
    Aria("Aria"),
    Ayanda("Ayanda");

    private String value;

    private VoiceId(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, VoiceId> enumMap;
    static {
        enumMap = new HashMap<String, VoiceId>();
        enumMap.put("Aditi", Aditi);
        enumMap.put("Amy", Amy);
        enumMap.put("Astrid", Astrid);
        enumMap.put("Bianca", Bianca);
        enumMap.put("Brian", Brian);
        enumMap.put("Camila", Camila);
        enumMap.put("Carla", Carla);
        enumMap.put("Carmen", Carmen);
        enumMap.put("Celine", Celine);
        enumMap.put("Chantal", Chantal);
        enumMap.put("Conchita", Conchita);
        enumMap.put("Cristiano", Cristiano);
        enumMap.put("Dora", Dora);
        enumMap.put("Emma", Emma);
        enumMap.put("Enrique", Enrique);
        enumMap.put("Ewa", Ewa);
        enumMap.put("Filiz", Filiz);
        enumMap.put("Gabrielle", Gabrielle);
        enumMap.put("Geraint", Geraint);
        enumMap.put("Giorgio", Giorgio);
        enumMap.put("Gwyneth", Gwyneth);
        enumMap.put("Hans", Hans);
        enumMap.put("Ines", Ines);
        enumMap.put("Ivy", Ivy);
        enumMap.put("Jacek", Jacek);
        enumMap.put("Jan", Jan);
        enumMap.put("Joanna", Joanna);
        enumMap.put("Joey", Joey);
        enumMap.put("Justin", Justin);
        enumMap.put("Karl", Karl);
        enumMap.put("Kendra", Kendra);
        enumMap.put("Kevin", Kevin);
        enumMap.put("Kimberly", Kimberly);
        enumMap.put("Lea", Lea);
        enumMap.put("Liv", Liv);
        enumMap.put("Lotte", Lotte);
        enumMap.put("Lucia", Lucia);
        enumMap.put("Lupe", Lupe);
        enumMap.put("Mads", Mads);
        enumMap.put("Maja", Maja);
        enumMap.put("Marlene", Marlene);
        enumMap.put("Mathieu", Mathieu);
        enumMap.put("Matthew", Matthew);
        enumMap.put("Maxim", Maxim);
        enumMap.put("Mia", Mia);
        enumMap.put("Miguel", Miguel);
        enumMap.put("Mizuki", Mizuki);
        enumMap.put("Naja", Naja);
        enumMap.put("Nicole", Nicole);
        enumMap.put("Olivia", Olivia);
        enumMap.put("Penelope", Penelope);
        enumMap.put("Raveena", Raveena);
        enumMap.put("Ricardo", Ricardo);
        enumMap.put("Ruben", Ruben);
        enumMap.put("Russell", Russell);
        enumMap.put("Salli", Salli);
        enumMap.put("Seoyeon", Seoyeon);
        enumMap.put("Takumi", Takumi);
        enumMap.put("Tatyana", Tatyana);
        enumMap.put("Vicki", Vicki);
        enumMap.put("Vitoria", Vitoria);
        enumMap.put("Zeina", Zeina);
        enumMap.put("Zhiyu", Zhiyu);
        enumMap.put("Aria", Aria);
        enumMap.put("Ayanda", Ayanda);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return VoiceId corresponding to the value
     */
    public static VoiceId fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
