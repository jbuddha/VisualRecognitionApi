package javax.visrec.ml.classification;

import java.util.Map;

/**
 * Generic classifier interface, that all classifiers should implement.
 *
 * @author Zoran Sevarac <zoran.sevarac@deepnetts.com>
 *
 * @param <INPUT_TYPE> type of input instance
 * @param <CLASS_TYPE> type of class for classification result CLASS TYPE can be
 * boolean for binary classifier, enum for small number of predefined classes or
 * string for maximum flexibility and big number of classes
 * @see ClassificationResults
 *
 *
 * Interface ClassificationResults<CLASS>
 * http://openimaj.org/apidocs/org/openimaj/experiment/evaluation/classification/ClassificationResult.html
 * http://openimaj.org/apidocs/org/openimaj/experiment/evaluation/classification/BasicClassificationResult.html
 */
@FunctionalInterface
public interface Classifier<INPUT_TYPE> {   // string or boolean, or enum?

    /**
     * Classify specified instance and return classification results return a
     * Map (class, confidence score)
     *
     * @param instance some instance to classify
     * @return classification results for the specified instance
     */
    public Map<String, Float> classify(INPUT_TYPE instance);

}
