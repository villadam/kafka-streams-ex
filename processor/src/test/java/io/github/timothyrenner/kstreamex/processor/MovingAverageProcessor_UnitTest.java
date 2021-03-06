package io.github.timothyrenner.kstreamex.processor;

import org.junit.Test;

import io.github.timothyrenner.kstreamex.processor.MovingAverageProcessor;

public class MovingAverageProcessor_UnitTest {
    
    /** Tests that the constructor throws an `IllegalArgumentException` when
     *  the type is invalid.
     */
    @Test(expected=IllegalArgumentException.class)
    public void constructor_test1() {
        
        new MovingAverageProcessor("NOT-A-TYPE", 0.8);
    
    } // Close constructor_test1.

    /** Tests that the constructor throws an `IllegalArgumentException` when
     *  the alpha value is not between zero and one.
     */
    @Test(expected=IllegalArgumentException.class)
    public void constructor_test2() {

        new MovingAverageProcessor("FAST", -0.2);

    } // CLose constructor_test2.

} // Close MovingAverageProcessor_UnitTest.
