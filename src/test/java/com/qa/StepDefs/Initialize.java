package com.qa.StepDefs;

import com.qa.Utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Initialize {

    @Before
    public void start(){
        BaseClass.setup();
    }

    @After
    public void end(){
        BaseClass.close();
    }
}
