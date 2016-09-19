package io.paulsbruce.dev.noodlesnowpos;

// a class for Jenkins to run Espresso tests in parallel via custom logic
public class ExecuteEspressoInParallel {

    @Test
    public void run() throws Exception {

        assertEquals(4, 2+1);

        //get runtime parameters (i.e. test filters)

        // kick off an EspressoExecute step in a temporary script, providing

            //## custom parallelization

                //obtain total number of Espresso tests
                //set up device capabilities array

                //spread number of tests across devices

                // while #testToRun > 0
                    //if #availableDevices > 0
                        //runTestOnDevice

            //## OR run all Espresso tests in one go
                // init report
                // kick off an EspressoExecute step in a temporary script, providing context for filters
                // close report, return report path and context to STDOUT (for consumption by Jenkins)
                // maybe even provide goo to get Jenkins to elevate report higher up than just the console log

        //
    }

    private void runParallelTest(string deviceId, string testSpec) {
        // set reserved flag for device
        try {
            // init report
            // reserve device

            // ? set a lambda handler from this context to respond to screenshot-worthy events inside the Espresso test execution context
            // schedule espresso test to run based on APK and test path
            // store test results in report

        } catch(Exception ex) {
            // store error in report
        } finally {
            //unset reserved flag for device
        }
    }
}