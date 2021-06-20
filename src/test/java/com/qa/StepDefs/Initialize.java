package com.qa.StepDefs;

import com.qa.Utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Initialize extends BaseClass {

    @Before
    public void start(){
        setup();
    }

    @After
    public void end(){
        //close();
    }
}
