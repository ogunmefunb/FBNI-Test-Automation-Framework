package FBNIGroup.Base;

import FBNIGroup.LoginPage.LoginPage;
import FBNIGroup.config.ConfigProperties;
import org.slf4j.LoggerFactory;
import org.testng.SkipException;
import xyz.ronella.logging.LoggerPlus;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Dennis on 19/08/2020.
 */

public class AppLib {
    private static String ENV_LOCAL = "LOCAL";
    private static String ENV_STAGING = "STAGING";
    private static String ENV_PREPROD = "PREPROD";
    private static String ENV_PROD = "PROD";

    public static int waitTimeSec = 120;

    private static ConfigProperties configProperties = new ConfigProperties();

    private String seleniumServer = "http://localhost:4444/wd/hub";
    private final static LoggerPlus LOGGER_PLUS = new LoggerPlus(LoggerFactory.getLogger(LoginPage.class));

    public String getSeleniumGrid(String seleniumGrid) {
        if (seleniumGrid.isEmpty()) {
            return seleniumServer;
        } else {
            System.out.println("WARN: Default selenium grid host overridden with: " + seleniumGrid);
            return seleniumGrid;
        }
    }

    public String getHomePageLink(String env) {
        if (!allowableEnvs().contains(env)) {
            throw new RuntimeException(
                    "Environment specified [ " + env + "] not supported as part of allowable enviornments");
        }
        String baseUrl;

        baseUrl = configProperties.getHomeUrl();

        return baseUrl;
    }

    private ArrayList<String> allowableEnvs() {
        ArrayList<String> allowedEnvs = new ArrayList<String>();
        allowedEnvs.add(ENV_STAGING);
        allowedEnvs.add(ENV_PROD);
        allowedEnvs.add(ENV_PREPROD);
        allowedEnvs.add(ENV_LOCAL);
        return allowedEnvs;
    }

    private ArrayList<String> prodEnvs() {
        ArrayList<String> prodEnvs = new ArrayList<String>();
        prodEnvs.add(ENV_PROD);

        return prodEnvs;
    }

    public void reportPreTestDetails(String env, String baseUrl) {
        LOGGER_PLUS.info("Running tests for environment: [" + env + "] - Url: " + baseUrl);
    }

    public void displayMapValues(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            LOGGER_PLUS.info(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void sleep(int time) {

        LOGGER_PLUS.info("Sleeping for [" + time + "] ms");
        //WaitUtils.sleep(time);
    }

    public static String getUniqueDateString() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        String dateStamp = new SimpleDateFormat("yyyyMMdd'T'HH:mm:ss").format(new Date(cal.getTimeInMillis()));
        return dateStamp;
    }

    public void checkEnvToSkipTest(String env) {
        if (prodEnvs().contains(env)) {
            LOGGER_PLUS.info("Not running this test on the current environment [" + env + "]");
            throw new SkipException("Not running this test on the current environment [" + env + "]");
        }
    }

}
