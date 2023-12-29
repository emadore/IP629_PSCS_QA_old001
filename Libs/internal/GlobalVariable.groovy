package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL_SG1_AIRport
     
    /**
     * <p></p>
     */
    public static Object URL_PesticideLabel
     
    /**
     * <p></p>
     */
    public static Object URL_eIB_LandingPage
     
    /**
     * <p></p>
     */
    public static Object URL_eIB
     
    /**
     * <p></p>
     */
    public static Object URL_Forms_LandingPage
     
    /**
     * <p></p>
     */
    public static Object URL_Form_6003video
     
    /**
     * <p></p>
     */
    public static Object URL_Form_6006
     
    /**
     * <p></p>
     */
    public static Object URL_Form_6008
     
    /**
     * <p></p>
     */
    public static Object URL_Form_6012
     
    /**
     * <p></p>
     */
    public static Object URL_Form_6023pdf
     
    /**
     * <p></p>
     */
    public static Object URL_Form_6026
     
    /**
     * <p></p>
     */
    public static Object URL_Form_6110
     
    /**
     * <p></p>
     */
    public static Object URL_Form_6117
     
    /**
     * <p></p>
     */
    public static Object URL_Form_6200
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            URL_SG1_AIRport = selectedVariables['URL_SG1_AIRport']
            URL_PesticideLabel = selectedVariables['URL_PesticideLabel']
            URL_eIB_LandingPage = selectedVariables['URL_eIB_LandingPage']
            URL_eIB = selectedVariables['URL_eIB']
            URL_Forms_LandingPage = selectedVariables['URL_Forms_LandingPage']
            URL_Form_6003video = selectedVariables['URL_Form_6003video']
            URL_Form_6006 = selectedVariables['URL_Form_6006']
            URL_Form_6008 = selectedVariables['URL_Form_6008']
            URL_Form_6012 = selectedVariables['URL_Form_6012']
            URL_Form_6023pdf = selectedVariables['URL_Form_6023pdf']
            URL_Form_6026 = selectedVariables['URL_Form_6026']
            URL_Form_6110 = selectedVariables['URL_Form_6110']
            URL_Form_6117 = selectedVariables['URL_Form_6117']
            URL_Form_6200 = selectedVariables['URL_Form_6200']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
