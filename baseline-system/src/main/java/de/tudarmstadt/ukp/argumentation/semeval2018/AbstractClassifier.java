/*
 * Copyright 2017
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tudarmstadt.ukp.argumentation.semeval2018;

import java.util.HashSet;
import java.util.Set;

/**
 * (c) 2017 Ivan Habernal
 */
public abstract class AbstractClassifier
{
    public Set<LabeledInstance> predict(Set<UnlabeledInstance> testData)
    {
        Set<LabeledInstance> result = new HashSet<>();

        for (UnlabeledInstance instance : testData) {
            result.add(makePrediction(instance));
        }

        return result;
    }

    abstract protected LabeledInstance makePrediction(UnlabeledInstance instance);

    protected abstract void train(Set<LabeledInstance> trainingData);
}
