package com.sample;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class GraphicsDesigner {

    public static final void main(String[] args) {
        try {
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
			KieRuntimeLogger kLogger = ks.getLoggers().newFileLogger(kSession, "test");
            kSession.fireAllRules();
			kLogger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
